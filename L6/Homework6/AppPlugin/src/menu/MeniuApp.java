package menu;

import java.util.ArrayList;
import java.util.Scanner;

import group.Group;
import interfaces.IDrawableElement;
import plugins.PluginManager;

public class MeniuApp{
    private Group grup;
    private Scanner scanner = new Scanner(System.in);
    private PluginManager plugin;
    private Menu mainMenu = null;
    private Menu subMenu = null;
    
    public MeniuApp(PluginManager plugin, Group grup)
    {
        this.plugin = plugin;
        this.grup = grup;
    }

    public void load()
    {
        plugin.loadPlugins("/plugins");
        ArrayList<IMenuItem> menuItems = new ArrayList();

        int shortCut = 1;
        var plugins = plugin.getPlugins();

        for (int i = 0 ; i < plugins.size(); i++)
        {
           var currentPlugin = plugins.get(i); 
           MenuItem currentItem = new MenuItem(plugins.get(i).getDisplayShape(), shortCut++, (parameters)->{
               IDrawableElement shape = currentPlugin.getShape();
               grup.setShape(shape);
               grup.add();
           });
           menuItems.add(currentItem);

        }
        subMenu=new Menu("Adaugare forma",1,menuItems);
        
        mainMenu = new Menu("Main Menu", -1);
        
        mainMenu.addItem(1, "Adaugare forma",(parameters)->{
               subMenu.execute();
           });
        mainMenu.addItem(2, "Stergere forma", (parameters) ->{
            grup.printShapes();
            grup.deleteShape(scanner.nextInt());
        });
        mainMenu.addItem(3, "Vizualizare plansa(grupul de forme)", (parameters) ->{
            grup.printShapes();
        });
        mainMenu.addItem(4, "Modificare forma", (parameters) ->{
            grup.printShapes();
            grup.editShape(scanner.nextInt());
        });
    }

    public void execute()
    {
        mainMenu.execute();
    }
    
}

