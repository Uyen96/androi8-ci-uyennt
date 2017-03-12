package controllers;

import models.GameModel;
import views.GameView;

import java.util.Vector;

/**
 * Created by HongUyen on 11-Mar-17.
 */
public class PlayerPlaneController extends GameController {
    ControllerManager playerBulletManager;
    public PlayerPlaneController(GameModel gameModel, GameView gameView, ControllerManager bulletControllerManager) {
        super(gameModel, gameView);
        this.playerBulletManager = bulletControllerManager;

    }


}
