package eaglesextras.handers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/** Sets up all the recipes */
public class RecipeHandler {
	
	public static void craft()
	{
		/** Solid Colour Recipes  */
        for(int i = 0; i < 16; i++) {
                GameRegistry.addRecipe(new ItemStack(BlockHandler.solidColour, 1, i), new Object[]{
                    "CC",
                    "CC",
                    	'C', new ItemStack(Item.dyePowder, 1, i)
                });
                GameRegistry.addRecipe(new ItemStack(Item.dyePowder, 4, i), new Object[]{
                    "C",
                    	'C', new ItemStack(BlockHandler.solidColour, 1, i)
                });
        	
        	}
        
        
	}

}
