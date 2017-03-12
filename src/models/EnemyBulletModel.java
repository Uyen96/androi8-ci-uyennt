package models;




/**
 * Created by HongUyen on 09-Mar-17.
 */
public class EnemyBulletModel extends GameModel {
    public static final int SPEED = 10;
    public EnemyBulletModel(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public void run(){
        y += SPEED;
    }
}
