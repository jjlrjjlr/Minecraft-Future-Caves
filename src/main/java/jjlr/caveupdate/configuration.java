package jjlr.caveupdate;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



//@Config(modid = references.MODID, name = references.NAME)
public class configuration {
	
	public static Configuration config;
	
	public static boolean debugStatus = true;
	
	public static void init(File file) {
		
		config = new Configuration(file);
		
		String category;
		
		category = "Debug";
		
		config.addCustomCategoryComment(category, "Debug settings, configure or disable debugging.");
		
		debugStatus = config.getBoolean("Debug enabled", category, true, "Toggle development debugging.", "en_us");
		
		category = "Features";
		
		//save
		if(config.hasChanged()) {
			config.save();
		}
		
	}
	
	public static void registerConfig(FMLPreInitializationEvent event) {
		caveUpdateMain.config = new File(event.getModConfigurationDirectory() + "/" + references.MODID);
		caveUpdateMain.config.mkdirs();
		init(new File(caveUpdateMain.config.getPath() + File.separator + references.MODID + ".cfg"));
	}
}
