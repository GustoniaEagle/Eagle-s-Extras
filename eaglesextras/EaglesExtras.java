package eaglesextras;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import eaglesextras.handers.BlockHandler;
import eaglesextras.handers.ConfigHandler;
import eaglesextras.handers.ItemHandler;
import eaglesextras.handers.PacketHandler;
import eaglesextras.handers.RecipeHandler;
import eaglesextras.proxies.CommonProxy;


@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
@NetworkMod(channels = {ModInformation.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class EaglesExtras {
	
	@SidedProxy(clientSide = "eaglesextras.proxies.ClientProxy", serverSide = "eaglesextras.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.initRenderers();
		proxy.initSounds();
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		BlockHandler.create();
		ItemHandler.create();
		RecipeHandler.craft();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
