package plugins;

import group.Group;
import menu.MeniuApp;

public class PluginApplication {
	 public static void main(String[] args) 
	 
	 {
		  PluginManager plugin= new PluginManager();
	      Group grup = new Group();
		  
		  MeniuApp meniu = new MeniuApp(plugin, grup);
		  meniu.load();
		  meniu.execute();
	}
}
