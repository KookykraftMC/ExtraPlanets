package com.mjr.extraplanets.schematic;

import micdoodle8.mods.galacticraft.api.recipe.SchematicPage;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.client.gui.GuiSchematicTier8Rocket;
import com.mjr.extraplanets.inventory.ContainerSchematicTier8Rocket;
import com.mjr.extraplanets.items.ExtraPlanets_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SchematicTier8Rocket extends SchematicPage
{
	@Override
	public int getPageID()
	{
		return Config.schematicTier8PageID;
	}

	@Override
	public int getGuiID()
	{
		return Config.schematicTier8GUIID;
	}

	@Override
	public ItemStack getRequiredItem()
	{
		return new ItemStack(ExtraPlanets_Items.schematicTier8, 1, 0);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public GuiScreen getResultScreen(EntityPlayer player, int x, int y, int z)
	{
		return new GuiSchematicTier8Rocket(player.inventory, x, y, z);
	}

	@Override
	public Container getResultContainer(EntityPlayer player, int x, int y, int z)
	{
		return new ContainerSchematicTier8Rocket(player.inventory, x, y, z);
	}
}