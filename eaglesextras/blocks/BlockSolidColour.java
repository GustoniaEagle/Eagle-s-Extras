package eaglesextras.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockSolidColour extends Block 
{
	private Icon[] iconArray;
	
	public BlockSolidColour(int id) {
		super(id, Material.rock);
		//this.setCreativeTab(GustoCraft_Core.tabGusto);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(4.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName(BlockInfo.SOLIDCOLOUR_UNLOCALIZED_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register) {
		this.iconArray = new Icon[16];
		for(int i = 0; i < this.iconArray.length; i++) {
			this.iconArray[i] = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.SOLIDCOLOUR_TEXTURES[i]);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int par1, int par2) {
		return this.iconArray[par2 % this.iconArray.length];
	}

	@Override
	public int damageDropped(int par1) {
		return par1;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for(int i = 0; i < this.iconArray.length; i++)
			par3List.add(new ItemStack(par1, 1, i));
	}

	
}
