package Persistencia;

import Modelo.Image;
import java.io.*;
/**
 *
 * @author Simon
 */

public class FileImageLoader implements ImageLoader {
    private final File[] files;
    private int current;
    
    public FileImageLoader(File folder) {
        this.current = 0;
        this.files = folder.listFiles(imageTypes());
    }
    
    private FileFilter imageTypes() {
        return new FileFilter() {
    
        @Override
        public boolean accept(File pathname) {
            return pathname.getName().endsWith(".jpg");
        }
        };
    }
    
        @Override
        public Image load() {
 
        
        return new Image() {
            @Override
            public String name() {
                return files[current].getName();
            }

            @Override
            public InputStream stream() {
                try {
                    return new BufferedInputStream(new FileInputStream(files[current]));
                } catch (FileNotFoundException e) {
                    return null;
                }
            }

        };
    }

    @Override
    public Image next() {
        if (this.current == files.length -1) {
            this.current = 0;
        }
        else {
            this.current++;
        }
        return this.load();
    }

    @Override
    public Image prev() {
        if (this.current == 0){
            this.current = files.length -1;
        }
        else {
            this.current--;
        }
        return this.load();
    }
}

