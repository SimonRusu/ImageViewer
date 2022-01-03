package UI;

import Modelo.Image;
/**
 *
 * @author Simon
 */

public interface ImageDisplay {
    Image current();
    void show(Image image);
}
