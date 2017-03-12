package controllers;

import models.EnemyPlaneModel;
import models.GameModel;
import views.EnemyPlaneView;
import views.GameView;

import java.awt.*;

/**
 * Created by HongUyen on 11-Mar-17.
 */
public class EnemyPlaneController extends GameController {

    public static final int SPPED = 5;
    public EnemyPlaneController(GameModel gameModel, GameView gameView) {
        super(gameModel, gameView);
    }

    public void run(){
        ((EnemyPlaneModel)gameModel).run();
    }

    public void draw(Graphics graphics){
        ((EnemyPlaneView)gameView).draw(graphics, gameModel);
    }
}
