package com.mjr.extraplanets.planets.Uranus.worldgen;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.core.world.gen.WorldGenMinableMeta;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.blocks.fluid.ExtraPlanets_Fluids;
import com.mjr.extraplanets.worldGen.features.WorldGenCustomIceSpike;
import com.mjr.extraplanets.worldGen.features.WorldGenCustomLake;
import com.mjr.extraplanets.worldGen.features.WorldGenIgloo;

public class BiomeDecoratorUranus extends BiomeDecoratorSpace {

	private WorldGenerator iceGen;
	private WorldGenerator crystalGen;
	private WorldGenerator denseIceGen;
	private WorldGenerator whiteGemGen;

	private World currentWorld;

	private int iceSpikesPerChunk = 5;
	private int LakesPerChunk = 5;

	private boolean isDecorating = false;

	public BiomeDecoratorUranus()
	{
		this.iceGen = new WorldGenMinableMeta(Blocks.ice, 18, 0, true, ExtraPlanets_Blocks.uranusBlocks, 2);
		this.crystalGen = new WorldGenMinableMeta(ExtraPlanets_Blocks.uranusBlocks, 8, 3, true, ExtraPlanets_Blocks.uranusBlocks, 2);
		this.denseIceGen = new WorldGenMinableMeta(ExtraPlanets_Blocks.denseIce, 8, 0, true, ExtraPlanets_Blocks.uranusBlocks, 0);
		this.whiteGemGen = new WorldGenMinableMeta(ExtraPlanets_Blocks.uranusBlocks, 8, 6, true, ExtraPlanets_Blocks.uranusBlocks, 2);

		//WorldGenMinableMeta(Block OreBlock, int numberOfBlocks, int OreMeta, boolean usingMetaData, Block StoneBlock, int StoneMeta);
	}

	@Override
	protected void setCurrentWorld(World world) {
		this.currentWorld = world;
	}

	@Override
	protected World getCurrentWorld() {
		return this.currentWorld;
	}

	@Override
	protected void decorate() {
		if (isDecorating) return;
		isDecorating = true;
		this.generateOre(8, this.iceGen, 60, 120);
		this.generateOre(20, this.crystalGen, 0, 64);
		this.generateOre(20, this.denseIceGen, 0, 256);
		this.generateOre(5, this.whiteGemGen, 0, 20);
		
		//generateOre(int amountPerChunk, WorldGenerator worldGenerator, int minY, int maxY);
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(this.currentWorld, this.rand, this.chunkX, this.chunkZ));
		for (int i = 0; i < this.iceSpikesPerChunk; i++) {
			if (this.rand.nextInt(20) == 0)
			{
				int x = this.chunkX + this.rand.nextInt(16) + 8;
				int z = this.chunkZ + this.rand.nextInt(16) + 8;
				int y = this.currentWorld.getHeightValue(x, z);
				new WorldGenCustomIceSpike().generate(this.currentWorld, this.rand, x, y, z, ExtraPlanets_Blocks.uranusBlocks);
			}
		}
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(this.currentWorld, this.rand, this.chunkX, this.chunkZ));

		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(this.currentWorld, this.rand, this.chunkX, this.chunkZ));
		for (int i = 0; i < this.LakesPerChunk; i++) {
			if (this.rand.nextInt(10) == 0) {
				int x = this.chunkX + this.rand.nextInt(16) + 8;
				// int y = this.rand.nextInt(16) + 16;
				int z = this.chunkZ + this.rand.nextInt(16) + 8;
				int y = this.currentWorld.getHeightValue(x, z);
				new WorldGenCustomLake(ExtraPlanets_Fluids.frozen_water).generate(this.currentWorld, this.rand, x, y, z, ExtraPlanets_Blocks.uranusBlocks);
			}
		}
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(this.currentWorld, this.rand, this.chunkX, this.chunkZ));

		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(this.currentWorld, this.rand, this.chunkX, this.chunkZ));
		if (this.rand.nextInt(250) == 1) {
			int x = this.chunkX + this.rand.nextInt(16) + 8;
			int z = this.chunkZ + this.rand.nextInt(16) + 8;
			int y = this.currentWorld.getHeightValue(x, z);
			new WorldGenIgloo().generate(this.currentWorld, this.rand, x, y, z);
		}
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(this.currentWorld, this.rand, this.chunkX, this.chunkZ));
		isDecorating = false;
	}
}