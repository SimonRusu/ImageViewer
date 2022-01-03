/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Simon
 */
import java.io.File;
import Modelo.Image;
import Persistencia.FileImageLoader;

public class Main {
    
    public static void main(String[] args) 
    {
        File file = new File("C:\\Users\\Simon\\Downloads\\Fotos");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
}

