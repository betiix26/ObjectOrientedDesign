package plugins;

import group.Group;
import menu.MeniuApp;

public class PluginApplication {
	 public static void main(String[] args) 
	 
	 {
	      Group grup = new Group();
		  
		  
		  MeniuApp meniu = new MeniuApp();
		  meniu.load(grup);
		  meniu.execute();
	}
}
