package eaglesextras.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMetadataBase extends Block 
{
    private Icon[] iconArray;
    private String[] textureNameArray;

    /**
     *
     * @param id The ID of the block
     * @param m The material of the block
     * @param unlocalizedName The unlocalised name of the block
     * @param textureNameArray The texture-name array of the block
     * @param hardness The hardness of the block
     * @param stepSound the stepsound of the block
     */
    public BlockMetadataBase(int id, Material m, String unlocalizedName, String[] textureNameArray, float hardness, StepSound stepSound)
    {
        super(id, Material.rock);
        //this.setCreativeTab(GustoCraft_Core.tabGusto);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardness);
        this.setStepSound(stepSound);
        this.setUnlocalizedName(unlocalizedName);
        this.textureNameArray = textureNameArray;
    }

    /**
     *
     * @param id The ID of the block
     * @param m The material of the block
     * @param unlocalizedName The unlocalised name of the block
     * @param textureNameArray The texture-name array of the block
     * @param hardness The hardness of the block
     */
    public BlockMetadataBase(int id, Material m, String unlocalizedName, String[] textureNameArray, float hardness)
    {
        this(id, m, unlocalizedName, textureNameArray, hardness, Block.soundStoneFootstep);
    }

    /**
     *
     * @param id The ID of the block
     * @param m The material of the block
     * @param unlocalizedName The unlocalised name of the block
     * @param textureNameArray The texture-name array of the block
     */
    public BlockMetadataBase(int id, Material m, String unlocalizedName, String[] textureNameArray)
    {
        this(id, m, unlocalizedName, textureNameArray, 1.0F);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register)
    {
        this.iconArray = new Icon[this.textureNameArray.length];
        for(int i = 0; i < this.iconArray.length; i++)
        {
            this.iconArray[i] = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + this.textureNameArray[i]);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int par1, int par2)
    {
        return this.iconArray[par2 % this.iconArray.length];
    }

    @Override
    public int damageDropped(int par1)
    {
        return par1;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for(int i = 0; i < this.iconArray.length; i++)
            par3List.add(new ItemStack(par1, 1, i));
    }

}
