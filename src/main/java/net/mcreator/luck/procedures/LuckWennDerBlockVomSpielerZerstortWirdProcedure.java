package net.mcreator.luck.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.luck.LuckMod;

import java.util.Map;

public class LuckWennDerBlockVomSpielerZerstortWirdProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LuckMod.LOGGER.warn("Failed to load dependency x for procedure LuckWennDerBlockVomSpielerZerstortWird!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LuckMod.LOGGER.warn("Failed to load dependency y for procedure LuckWennDerBlockVomSpielerZerstortWird!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LuckMod.LOGGER.warn("Failed to load dependency z for procedure LuckWennDerBlockVomSpielerZerstortWird!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LuckMod.LOGGER.warn("Failed to load dependency world for procedure LuckWennDerBlockVomSpielerZerstortWird!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double Zufal = 0;
		Zufal = (double) Math.random();
		if ((Zufal < 0.5)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new BatEntity(EntityType.BAT, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		} else if ((Zufal < 1)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.WITHER_SKELETON_SPAWN_EGG));
				entityToSpawn.setPickupDelay((int) 0);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.SHULKER_SHELL));
				entityToSpawn.setPickupDelay((int) 0);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.TWISTING_VINES_PLANT));
				entityToSpawn.setPickupDelay((int) 0);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.SNOWBALL));
				entityToSpawn.setPickupDelay((int) 0);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
