package controllers;

import models.EnemyBulletModel;
import models.GameModel;
import views.EnemyBulletView;
import views.GameView;

import java.awt.*;

/**
 * Created by HongUyen on 11-Mar-17.
 */
public class EnemyBulletController extends GameController {

    private static final int SPEED = 10;

    public EnemyBulletController(GameModel gameModel, GameView gameView) {
        super(gameModel, gameView);
    }

    public void run(){
        ((EnemyBulletModel)gameModel).run();
    }

    public void draw(Graphics graphics){
        ((EnemyBulletView)gameView).draw(graphics, gameModel);
    }
}
