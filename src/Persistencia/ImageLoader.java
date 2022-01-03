package Persistencia;

import Modelo.Image;
/**
 *
 * @author Simon
 */

public interface ImageLoader {
    Image load();
    Image next();
    Image prev();
}
