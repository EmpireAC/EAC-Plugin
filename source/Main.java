package fr.empireac.plugin;

/*
 *
 * EAC-Plugin
 * 2021 Holia
 * MIT Licence
 *
 */

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		int versionMajor = 0;
		int versionMinor = 1;
		String versionType = "beta";
		String versionPoint = ".";
		String version = versionType + versionMajor + versionPoint + versionMinor;		
		System.out.print("EmpireAC plugin loaded ! (version " + version + ")");
	}
	
	@Override
	public void onDisable() {
		System.out.print("EmpireAC plugin is now offline.");
	}
}
