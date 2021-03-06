package com.mjr.extraplanets.entities;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityCustomSlime extends EntityLiving implements IMob
{
	public float squishAmount;
	public float squishFactor;
	public float prevSquishFactor;
	/** ticks until this slime jumps again */
	private int slimeJumpDelay;

	public EntityCustomSlime(World p_i1742_1_)
	{
		super(p_i1742_1_);
		int i = 1 << this.rand.nextInt(3);
		this.yOffset = 0.0F;
		this.slimeJumpDelay = this.rand.nextInt(20) + 10;
		this.setSlimeSize(i);
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte)1));
	}

	protected void setSlimeSize(int p_70799_1_)
	{
		this.dataWatcher.updateObject(16, new Byte((byte)p_70799_1_));
		this.setSize(0.6F * p_70799_1_, 0.6F * p_70799_1_);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100);
		this.setHealth(this.getMaxHealth());
		this.experienceValue = p_70799_1_;
	}

	/**
	 * Returns the size of the slime.
	 */
	public int getSlimeSize()
	{
		return this.dataWatcher.getWatchableObjectByte(16);
	}

	/**
	 * Returns the name of a particle effect that may be randomly created by EntitySlime.onUpdate()
	 */
	protected String getSlimeParticle()
	{
		return "slime";
	}

	/**
	 * Returns the name of the sound played when the slime jumps.
	 */
	protected String getJumpSound()
	{
		return "mob.slime." + (this.getSlimeSize() > 1 ? "big" : "small");
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		if (!this.worldObj.isRemote && this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL && this.getSlimeSize() > 0)
		{
			this.isDead = true;
		}

		this.squishFactor += (this.squishAmount - this.squishFactor) * 0.5F;
		this.prevSquishFactor = this.squishFactor;
		boolean flag = this.onGround;
		super.onUpdate();
		int i;

		if (this.onGround && !flag)
		{
			i = this.getSlimeSize();

			for (int j = 0; j < i * 8; ++j)
			{
				float f = this.rand.nextFloat() * (float)Math.PI * 2.0F;
				float f1 = this.rand.nextFloat() * 0.5F + 0.5F;
				float f2 = MathHelper.sin(f) * i * 0.5F * f1;
				float f3 = MathHelper.cos(f) * i * 0.5F * f1;
				this.worldObj.spawnParticle(this.getSlimeParticle(), this.posX + f2, this.boundingBox.minY, this.posZ + f3, 0.0D, 0.0D, 0.0D);
			}

			if (this.makesSoundOnLand())
			{
				this.playSound(this.getJumpSound(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) / 0.8F);
			}

			this.squishAmount = -0.5F;
		}
		else if (!this.onGround && flag)
		{
			this.squishAmount = 1.0F;
		}

		this.alterSquishAmount();

		if (this.worldObj.isRemote)
		{
			i = this.getSlimeSize();
			this.setSize(0.6F * i, 0.6F * i);
		}
	}

	@Override
	protected void updateEntityActionState()
	{
		this.despawnEntity();
		EntityPlayer entityplayer = this.worldObj.getClosestVulnerablePlayerToEntity(this, 16.0D);

		if (entityplayer != null)
		{
			this.faceEntity(entityplayer, 10.0F, 20.0F);
		}

		if (this.onGround && this.slimeJumpDelay-- <= 0)
		{
			this.slimeJumpDelay = this.getJumpDelay();

			if (entityplayer != null)
			{
				this.slimeJumpDelay /= 3;
			}

			this.isJumping = true;

			if (this.makesSoundOnJump())
			{
				this.playSound(this.getJumpSound(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 0.8F);
			}

			this.moveStrafing = 1.0F - this.rand.nextFloat() * 2.0F;
			this.moveForward = 1 * this.getSlimeSize();
		}
		else
		{
			this.isJumping = false;

			if (this.onGround)
			{
				this.moveStrafing = this.moveForward = 0.0F;
			}
		}
	}

	protected void alterSquishAmount()
	{
		this.squishAmount *= 0.6F;
	}

	/**
	 * Gets the amount of time the slime needs to wait between jumps.
	 */
	protected int getJumpDelay()
	{
		return this.rand.nextInt(20) + 10;
	}

	protected EntityCustomSlime createInstance()
	{
		return new EntityCustomSlime(this.worldObj);
	}

	/**
	 * Will get destroyed next tick.
	 */
	@Override
	public void setDead()
	{
		int i = this.getSlimeSize();

		if (!this.worldObj.isRemote && i > 1 && this.getHealth() <= 0.0F)
		{
			int j = 2 + this.rand.nextInt(3);

			for (int k = 0; k < j; ++k)
			{
				float f = (k % 2 - 0.5F) * i / 4.0F;
				float f1 = (k / 2 - 0.5F) * i / 4.0F;
				EntityCustomSlime entityslime = this.createInstance();
				entityslime.setSlimeSize(0);
				entityslime.setLocationAndAngles(this.posX + f, this.posY + 0.5D, this.posZ + f1, this.rand.nextFloat() * 360.0F, 0.0F);
				//this.worldObj.spawnEntityInWorld(entityslime);
			}
		}
		super.setDead();
	}

	/**
	 * Called by a player entity when they collide with an entity
	 */
	@Override
	public void onCollideWithPlayer(EntityPlayer p_70100_1_)
	{
		if (this.canDamagePlayer())
		{
			int i = this.getSlimeSize();

			if (this.canEntityBeSeen(p_70100_1_) && this.getDistanceSqToEntity(p_70100_1_) < 0.6D * i * 0.6D * i && p_70100_1_.attackEntityFrom(DamageSource.causeMobDamage(this), this.getAttackStrength()))
			{
				this.playSound("mob.attack", 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
		}
	}

	/**
	 * Indicates weather the slime is able to damage the player (based upon the slime's size)
	 */
	protected boolean canDamagePlayer()
	{
		return this.getSlimeSize() > 1;
	}

	/**
	 * Gets the amount of damage dealt to the player when "attacked" by the slime.
	 */
	protected int getAttackStrength()
	{
		return this.getSlimeSize();
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound()
	{
		return "mob.slime." + (this.getSlimeSize() > 1 ? "big" : "small");
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound()
	{
		return "mob.slime." + (this.getSlimeSize() > 1 ? "big" : "small");
	}

	@Override
	protected Item getDropItem()
	{
		return this.getSlimeSize() == 1 ? Items.slime_ball : Item.getItemById(0);
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	@Override
	protected float getSoundVolume()
	{
		return 0.4F * this.getSlimeSize();
	}

	/**
	 * The speed it takes to move the entityliving's rotationPitch through the faceEntity method. This is only currently
	 * use in wolves.
	 */
	@Override
	public int getVerticalFaceSpeed()
	{
		return 0;
	}

	/**
	 * Returns true if the slime makes a sound when it jumps (based upon the slime's size)
	 */
	protected boolean makesSoundOnJump()
	{
		return this.getSlimeSize() > 0;
	}

	/**
	 * Returns true if the slime makes a sound when it lands after a jump (based upon the slime's size)
	 */
	protected boolean makesSoundOnLand()
	{
		return this.getSlimeSize() > 2;
	}
}