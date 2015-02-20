package com.bergerkiller.bukkit.common.bases;

import java.util.Collections;
import java.util.List;

import net.minecraft.server.v1_8_R1.EntityHuman;
import net.minecraft.server.v1_8_R1.IChatBaseComponent;
import net.minecraft.server.v1_8_R1.IInventory;
import net.minecraft.server.v1_8_R1.ItemStack;

import org.bukkit.craftbukkit.v1_8_R1.entity.CraftHumanEntity;
import org.bukkit.craftbukkit.v1_8_R1.inventory.CraftInventory;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

/**
 * A base Inventory that excludes the getting and setting of items<br>
 * Avoid using this class as much as possible, use the Bukkit versions instead!
 */
public class IInventoryBase implements IInventory {
	private int maxstacksize = 64;

	public void setContents(ItemStack[] items) {
		for (int i = 0; i < items.length; i++) {
			this.setItem(i, items[i]);
		}
	}

	@Override
	public ItemStack[] getContents() {
		ItemStack[] contents = new ItemStack[this.getSize()];
		for (int i = 0; i < contents.length; i++) {
			contents[i] = this.getItem(i);
		}
		return contents;
	}

	@Override
	public InventoryHolder getOwner() {
		return null;
	}

	@Override
	public void startOpen(EntityHuman paramEntityHuman) {
	}

	@Override
	public List<HumanEntity> getViewers() {
		return Collections.emptyList();
	}

	@Override
	public void onClose(CraftHumanEntity arg0) {
	}

	@Override
	public void onOpen(CraftHumanEntity arg0) {
	}

	@Override
	public void update() {
	}

	@Override
	public boolean a(EntityHuman arg0) {
		return false;
	}

	@Override
	public void closeContainer(EntityHuman paramEntityHuman) {
	}

	@Override
	public int getMaxStackSize() {
		return this.maxstacksize;
	}

	@Override
	public void setMaxStackSize(int size) {
		this.maxstacksize = size;
	}

	@Override
	public ItemStack splitStack(int index, int size) {
		ItemStack item = this.getItem(index);
		if (item != null) {
			ItemStack itemstack;
			if (item.count <= size) {
				itemstack = item;
				this.setItem(index, null);
				return itemstack;
			} else {
				itemstack = item.a(size);
				if (item.count == 0) {
					this.setItem(index, null);
				}
				return itemstack;
			}
		} else {
			return null;
		}
	}

	@Override
	public ItemStack splitWithoutUpdate(int index) {
		ItemStack item = this.getItem(index);
		if (item != null) {
			this.setItem(index, null);
			return item;
		} else {
			return null;
		}
	}

	public Inventory getInventory() {
		return new CraftInventory(this);
	}

	@Override
	public ItemStack getItem(int arg0) {
		return null;
	}



	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public void setItem(int arg0, ItemStack arg1) {
	}

	@Override
	public boolean b(int arg0, ItemStack arg1) {
		return false;
	}

	@Override
	public String getName() {
		return getInventory().getName();
	}

	@Override
	public IChatBaseComponent getScoreboardDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCustomName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void b(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int g() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getProperty(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void l() {
		// TODO Auto-generated method stub
		
	}

}
