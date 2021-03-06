package com.mjr.extraplanets.recipes;

import java.util.HashMap;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.recipe.CircuitFabricatorRecipes;
import micdoodle8.mods.galacticraft.api.recipe.CompressorRecipes;
import micdoodle8.mods.galacticraft.api.recipe.SpaceStationRecipe;
import micdoodle8.mods.galacticraft.api.world.SpaceStationType;
import micdoodle8.mods.galacticraft.core.blocks.GCBlocks;
import micdoodle8.mods.galacticraft.core.items.GCItems;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems;
import micdoodle8.mods.galacticraft.planets.mars.MarsModule;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.armor.ExtraPlanets_Armor;
import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.blocks.ExtraPlanets_Machines;
import com.mjr.extraplanets.blocks.ExtraPlanets_SlabsStairsBlocks;
import com.mjr.extraplanets.items.ExtraPlanets_Items;
import com.mjr.extraplanets.items.tools.ExtraPlanets_Tools;

import cpw.mods.fml.common.registry.GameRegistry;

public class ExtraPlanets_Recipes {

	public static void init() {
		registerRocketCraftingRecipes();
		registerFurnaceRecipes();
		registerCraftingRecipes();
		registerCompressorRecipes();
		registerCircuitFabricatorRecipes();
		registerSatellitesRecipes();
	}

	private static void registerRocketCraftingRecipes() {
		if (Config.venus)
			Tier4RocketRecipes.registerRocketCraftingRecipe();
		if (Config.jupiter)
			Tier5RocketRecipes.registerRocketCraftingRecipe();
		if (Config.saturn)
			Tier6RocketRecipes.registerRocketCraftingRecipe();
		if (Config.uranus)
			Tier7RocketRecipes.registerRocketCraftingRecipe();
		if (Config.neptune)
			Tier8RocketRecipes.registerRocketCraftingRecipe();
		if (Config.pluto)
			Tier9RocketRecipes.registerRocketCraftingRecipe();
	}

	private static void registerFurnaceRecipes() {
		if (Config.mercury) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 0, 6), new ItemStack(ExtraPlanets_Items.ingotMercury), 0.0F);
		}
		if (Config.venus) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.venusBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.venusBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.venusBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.venusBlocks, 0, 6), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 0.0F);
		}
		if (Config.ceres) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 0, 6), new ItemStack(ExtraPlanets_Items.ingotUranium, 1), 0.0F);
		}
		if (Config.jupiter) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 0, 6), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 0, 7), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 7), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 0, 10), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 0.0F);
		}
		if (Config.saturn) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 0, 6), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 0.0F);
		}
		if (Config.uranus) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 0, 3), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 0, 6), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 0.0F);
		}
		if (Config.neptune) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 0, 6), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 0, 9), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 0.0F);
		}
		if (Config.pluto) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 0, 6), new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 0.0F);
		}
		if (Config.eris) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.callisto) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.callistoBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.callistoBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.callistoBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.deimos) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.deimosBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.deimosBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.deimosBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.europa) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.europaBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.europaBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.europaBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.ganymede) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ganymedeBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ganymedeBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ganymedeBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.io) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ioBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ioBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ioBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.phobos) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.phobosBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.phobosBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.phobosBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.triton) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.tritonBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.tritonBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.tritonBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.rhea) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.rheaBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.rheaBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.rheaBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.titan) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.titanBlocks, 0, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.titanBlocks, 0, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.titanBlocks, 0, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
	}

	private static void registerCraftingRecipes() {
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier2ThermalPadding, 1, 0), new Object[] { "XXX", "XYX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(GCItems.basicItem, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier2ThermalPadding, 1, 1), new Object[] { "XYX", "XXX", "XXX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(GCItems.basicItem, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier2ThermalPadding, 1, 2), new Object[] { "XXX", "XYX", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(GCItems.basicItem, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier2ThermalPadding, 1, 3), new Object[] { "XYX", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(GCItems.basicItem, 1, 9) });

		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3ThermalPadding, 1, 0), new Object[] { "XXX", "XYX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(AsteroidsItems.basicItem, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3ThermalPadding, 1, 1), new Object[] { "XYX", "XXX", "XXX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(AsteroidsItems.basicItem, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3ThermalPadding, 1, 2), new Object[] { "XXX", "XYX", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(AsteroidsItems.basicItem, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3ThermalPadding, 1, 3), new Object[] { "XYX", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(AsteroidsItems.basicItem, 1, 6) });

		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4ThermalPadding, 1, 0), new Object[] { "XXX", "XYX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(GCItems.basicItem, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4ThermalPadding, 1, 1), new Object[] { "XYX", "XXX", "XXX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(GCItems.basicItem, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4ThermalPadding, 1, 2), new Object[] { "XXX", "XYX", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(GCItems.basicItem, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4ThermalPadding, 1, 3), new Object[] { "XYX", "X X", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(GCItems.basicItem, 1, 8) });

		if (Config.mercury) {
			// Battery
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.mercuryBattery, 1, 0), new Object[] { " T ", "TRT", "TCT", 'T', new ItemStack(ExtraPlanets_Items.compressedMercury, 1, 0), 'R', Items.redstone, 'C', Items.coal });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 4, 7), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 2) });

			if (Config.mercuryItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercuryPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercuryAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercuryHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercurySword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercuryShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Item.itemRegistry.getObject("stick") });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.mercuryHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.mercuryChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.mercuryLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.mercuryBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0) });
			}
			
			// Slab's & Stairs
			if (Config.slabsAndStairs) {
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.mercuryStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.mercuryStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 2) });
			}
		}
		if (Config.venus) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier4, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), 'Y', new ItemStack(AsteroidsItems.basicItem, 1, 0) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), 'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 1), 'Z', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.venusBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.venusBlocks, 1, 2) });

			// Block of Carbon
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.venusBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });

			if (Config.carbonItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.carbonHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.carbonChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.carbonLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.carbonBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });
			}

			// Slab's & Stairs
			if (Config.slabsAndStairs) {
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.venusStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.venusBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.venusStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.venusBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.venusDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.veunsDungeonBrick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.venusDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.veunsDungeonBrick });
			}
		}
		if (Config.ceres) {
			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 4, 7), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 2) });
			
			// Block of Uranium
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 8), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });

			if (Config.uraniumItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Item.itemRegistry.getObject("stick") });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.uraniumHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.uraniumChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.uraniumLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.uraniumBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });
			}
			
			// Slab's & Stairs
			if (Config.slabsAndStairs) {
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.ceresStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.ceresStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.nuclearBomb), new Object[] { "GSG", "SUS", "GSG", 'G', Items.gunpowder, 'S', Blocks.sand, 'U', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, OreDictionary.WILDCARD_VALUE) });
			}
		}
		if (Config.jupiter) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier5, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), 'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 11), 'Z', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 4, 9), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 2) });

			// Block of Palladium
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 8), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });

			// Block of Red Gem
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 11), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });

			if (Config.palladiumItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.palladiumHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.palladiumChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.palladiumLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.palladiumBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
			}

			if (Config.redGemItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Item.itemRegistry.getObject("stick") });
				
				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redGemHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redGemChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redGemLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redGemBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });
			}

			// Battery
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.nickelBattery, 1, 0), new Object[] { " T ", "TRT", "TCT", 'T', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 6), 'R', Items.redstone, 'C', Items.coal });

			// Slab's & Stairs
			if (Config.slabsAndStairs) {
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.jupiterStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.jupiterStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.jupiterDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.jupiterDungeonBrick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.jupiterDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.jupiterDungeonBrick });
			}
		}
		if (Config.saturn) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier6, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), 'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 5), 'Z', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 2) });

			// Block of Magnesium
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });

			if (Config.magnesiumItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.magnesiumHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.magnesiumChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.magnesiumLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.magnesiumBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
			}

			// Slab's & Stairs
			if (Config.slabsAndStairs) {
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.saturnStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.saturnStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.saturnDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.saturnDungeonBrick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.saturnDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.saturnDungeonBrick });
			}
		}
		if (Config.uranus) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier7, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), 'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 2), 'Z', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 4, 5), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 2) });

			// Block of Crystal
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 4), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });
			
			// Block of White Gem
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });

			if (Config.crystalItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.crystalHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.crystalChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.crystalLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.crystalBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });
			}

			if (Config.whiteGemItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Item.itemRegistry.getObject("stick") });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.whiteGemHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.whiteGemChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.whiteGemLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.whiteGemBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });
			}

			// Slab's & Stairs
			if (Config.slabsAndStairs) {
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.uranusStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.uranusStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.uranusDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.uranusDungeonBrick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.uranusDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.uranusDungeonBrick });
			}
		}
		if (Config.neptune) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier8, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), 'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 2), 'Z', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 2) });

			// Block of Zinc
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
			
			// Block of Blue Gem
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 10), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });

			if (Config.blueGemItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Item.itemRegistry.getObject("stick") });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueGemHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueGemChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueGemLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueGemBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });
			}
			
			if (Config.zincItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.zincHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.zincChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.zincLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.zincBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
			}

			// Battery
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.zincBattery, 1, 0), new Object[] { " T ", "TRT", "TCT", 'T', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'R', Items.redstone, 'C', Items.coal });

			// Slab's & Stairs
			if (Config.slabsAndStairs) {
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.neptuneStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.neptuneStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.neptuneDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.neptuneDungeonBrick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.neptuneDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.neptuneDungeonBrick });
			}
		}
		if (Config.pluto) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier9, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), 'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 2), 'Z', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 2) });

			// Block of Tungsten
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });

			if (Config.tungstenItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Item.itemRegistry.getObject("stick") });
				
				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tungstenHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tungstenChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tungstenLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tungstenBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
			}

			// Slab's & Stairs
			if (Config.slabsAndStairs) {
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.plutoStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.plutoStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 2) });
			}
		}
		if (Config.eris) {
			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 4, 6), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 2) });

			// Slab's & Stairs
			if (Config.slabsAndStairs) {
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.erisStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.erisStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 2) });
			}
		}

		// Diamond Apples
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.diamondApple, 1, 0), new Object[] { "DDD", "DAD", "DDD", 'D', new ItemStack(Items.diamond, 1, 0), 'A', Items.apple });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.diamondApple, 1, 1), new Object[] { "DDD", "DAD", "DDD", 'D', new ItemStack(Blocks.diamond_block, 1, 0), 'A', Items.apple });

		// Machines
		if (Config.advancedRefinery)
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.advancedRefinery), new Object[] { "ZYZ", 'Y', GCBlocks.refinery, 'Z', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
		if (Config.solarPanels)
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.solarPanel, 1, 0), new Object[] { "ZYZ", 'Y', new ItemStack(GCBlocks.solarPanel, 1, 4), 'Z', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4) });
		if (Config.solarPanels)
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.solarPanel, 1, 4), new Object[] { "ZYZ", 'Y', new ItemStack(ExtraPlanets_Machines.solarPanel, 1, 0), 'Z', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4) });

		// Can of Food
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 0), new Object[] { new ItemStack(GCItems.canister, 1, 0), Items.cooked_porkchop, Items.cooked_porkchop });
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 1), new Object[] { new ItemStack(GCItems.canister, 1, 0), new ItemStack(Items.cooked_fished, 1, 0), new ItemStack(Items.cooked_fished, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 2), new Object[] { new ItemStack(GCItems.canister, 1, 0), new ItemStack(Items.cooked_fished, 1, 1), new ItemStack(Items.cooked_fished, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 3), new Object[] { new ItemStack(GCItems.canister, 1, 0), Items.cooked_chicken, Items.cooked_chicken });
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 4), new Object[] { new ItemStack(GCItems.canister, 1, 0), Items.cooked_beef, Items.cooked_beef });

		// Others
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 6, 15), new Object[] { new ItemStack(ExtraPlanets_Items.bodyParts, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 6, 15), new Object[] { new ItemStack(ExtraPlanets_Items.bodyParts, 1, 1) });
		
		//Advanced & Ultimate Battery
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.advancedBattery, 1, 0),new Object[] { " T ", "TRT", "TCT", 'T', new ItemStack(AsteroidsItems.basicItem, 0, 6), 'R', GCItems.battery, 'C', new ItemStack(MarsBlocks.marsBlock, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.ultimateBattery, 1, 0),new Object[] { "WRB", "CPM", "TAZ", 'W', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 7), 'R', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 11), 'B', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 10), 'C', new ItemStack(ExtraPlanets_Blocks.venusBlocks, 1, 7), 'P', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 8), 'M', new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 7), 'T', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'A', new ItemStack(ExtraPlanets_Items.advancedBattery, 1, 0), 'Z', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5)});
	}

	private static void registerCompressorRecipes() {
		if (Config.mercury) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.compressedMercury, 1, 0), new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0));
		}
		if (Config.venus) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), new ItemStack(AsteroidsItems.basicItem, 1, 0), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4));
		}
		if (Config.jupiter) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 6), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 7), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 7));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 4));
		}
		if (Config.saturn) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4));
		}
		if (Config.uranus) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 6), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 6));
		}
		if (Config.neptune) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 4));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5));
		}
		if (Config.pluto) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier9Items, 1, 4));
		}
	}

	private static void registerCircuitFabricatorRecipes() {
		int siliconCount = OreDictionary.getOres(ConfigManagerCore.otherModsSilicon).size();
		for (int j = 0; j <= siliconCount; j++) {
			ItemStack silicon;
			if (j == 0)
				silicon = new ItemStack(GCItems.basicItem, 1, 2);
			else
				silicon = OreDictionary.getOres("itemSilicon").get(j - 1);
			CircuitFabricatorRecipes.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 0), new ItemStack[] { new ItemStack(Items.diamond), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Blocks.redstone_lamp) });
			if (Config.venus)
				CircuitFabricatorRecipes.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 1), new ItemStack[] { new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Items.comparator) });
			CircuitFabricatorRecipes.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 2), new ItemStack[] { new ItemStack(AsteroidsItems.basicItem, 1, 5), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Blocks.redstone_torch) });
			if (Config.jupiter)
				CircuitFabricatorRecipes.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 3), new ItemStack[] { new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Items.repeater) });
			if (Config.neptune)
				CircuitFabricatorRecipes.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 4), new ItemStack[] { new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Items.repeater) });
			if (Config.uranus)
				CircuitFabricatorRecipes.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 5), new ItemStack[] { new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Items.repeater) });
		}
	}

	private static void registerSatellitesRecipes() {
		HashMap<Object, Integer> inputMap;
		if (Config.mercurySpaceStation && Config.mercury) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.mercurySpaceStationID, Config.mercuryID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.venusSpaceStation && Config.venus) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 24);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.venusSpaceStationID, Config.venusID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.ceresSpaceStation && Config.ceres) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.ceresSpaceStationID, Config.ceresID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.marsSpaceStation && MarsModule.planetMars != null) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.marsSpaceStationID, MarsModule.planetMars.getDimensionID(), new SpaceStationRecipe(inputMap)));
		}
		if (Config.jupiterSpaceStation && Config.jupiter) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.wafers, 1, 3), 3);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.jupiterSpaceStationID, Config.jupiterID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.saturnSpaceStation && Config.saturn) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 24);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.saturnSpaceStationID, Config.saturnID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.uranusSpaceStation && Config.uranus) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.wafers, 1, 5), 3);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.uranusSpaceStationID, Config.uranusID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.neptuneSpaceStation && Config.neptune) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.wafers, 1, 4), 3);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.neptuneSpaceStationID, Config.neptuneID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.plutoSpaceStation && Config.pluto) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 24);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.plutoSpaceStationID, Config.plutoID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.erisSpaceStation && Config.eris) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.erisSpaceStationID, Config.erisID, new SpaceStationRecipe(inputMap)));
		}
	};
}
