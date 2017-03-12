package controllers;

import models.GameModel;
import models.PlayerBulletModel;
import utils.Utils;
import views.GameView;
import views.PlayerBulletView;

import java.awt.*;

/**
 * Created by HongUyen on 09-Mar-17.
 */
public class PlayerBulletController extends GameController {
    public static final int WIDTH = 14;
    public static final int HEIGHT = 30;
    public static final int HAFT_WIDTH = 13;
    public PlayerBulletController(GameModel gameModel, GameView gameView) {
        super(gameModel, gameView);
    }
    public PlayerBulletController(int x, int y){
        this(new PlayerBulletModel(x, y, WIDTH, HEIGHT), new PlayerBulletView(Utils.loadImageFromRes("bullet.png")));
    }
    public void run(){
        ((PlayerBulletModel)gameModel).run();
    }
    public void draw(Graphics graphics){
        ((PlayerBulletView)gameView).draw(graphics, gameModel);

    }
}
