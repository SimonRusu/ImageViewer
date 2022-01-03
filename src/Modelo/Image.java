package Modelo;

import java.io.InputStream;
/**
 *
 * @author Simon
 */

public interface Image {
    String name();
    InputStream stream();
    Image next();
    Image prev();
}

