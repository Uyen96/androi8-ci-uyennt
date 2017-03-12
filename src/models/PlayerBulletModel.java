package models;

/**
 * Created by HongUyen on 09-Mar-17.
 */
public class PlayerBulletModel extends GameModel{

    private static final int SPEED = 10;
    public PlayerBulletModel(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public void run(){
        y -= SPEED;
    }
}
