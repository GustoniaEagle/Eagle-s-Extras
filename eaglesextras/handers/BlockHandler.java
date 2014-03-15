package eaglesextras.handers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import eaglesextras.blocks.BlockInfo;
import eaglesextras.blocks.BlockMetadataBase;
import eaglesextras.blocks.ItemBlockColoured;

/** Registers all the blocks */
public class BlockHandler 
{
	
	public static Block solidColour;
	
	public static void create()
	{
		solidColour = new BlockMetadataBase(BlockInfo.SOLIDCOLOUR_ID, Material.rock, BlockInfo.SOLIDCOLOUR_UNLOCALIZED_NAME, BlockInfo.SOLIDCOLOUR_TEXTURES, 1.5F, Block.soundStoneFootstep);
	       //
	       GameRegistry.registerBlock(solidColour, ItemBlockColoured.class, BlockInfo.SOLIDCOLOUR_UNLOCALIZED_NAME);
	       //
	       for(int i = 0; i < 16; i++)
	            LanguageRegistry.addName(new ItemStack(solidColour, 1, i), BlockInfo.SOLIDCOLOUR_NAMES[i]);
	}

}
