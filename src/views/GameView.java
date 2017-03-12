package views;

import models.GameModel;

import java.awt.*;

/**
 * Created by HongUyen on 09-Mar-17.
 */
public class GameView {
    protected Image image;

    public GameView(Image image) {
        this.image = image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getImage() {

        return image;
    }
    public void draw(Graphics g, GameModel gameModel){
        g.drawImage(image, gameModel.getX(), gameModel.getY(), gameModel.getWidth(), gameModel.getHeight(), null);
    }
}
