package eaglesextras.handers;

import java.io.File;

import eaglesextras.blocks.BlockInfo;
import net.minecraftforge.common.Configuration;

/** Handles all the config needed for the mod */
public class ConfigHandler {
	
	/**
	 * Inits the config
	 * @param file The File for the config
	 * 
	 */
	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		config.load();
		//
		BlockInfo.SOLIDCOLOUR_ID = config.getBlock(BlockInfo.SOLIDCOLOUR_KEY, BlockInfo.SOLIDCOLOUR_DEFAULT).getInt();
		//
		config.save();
	}

}
