package eaglesextras.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockColoured extends ItemBlock 
{
	/**
	 * @param par1 ItemBlock id
	 */
	public ItemBlockColoured(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return (BlockInfo.COLOUR_SUFFIXES[itemstack.getItemDamage()]) + this.getUnlocalizedName();
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}

}
