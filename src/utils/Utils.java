package utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by HongUyen on 09-Mar-17.
 */
public class Utils {
    public static Image loadImageFromRes(String url){
        try {
            Image image = ImageIO.read( new File("resources/" + url));
            return image;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
