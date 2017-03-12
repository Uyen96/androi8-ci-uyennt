package controllers;

import models.GameModel;
import views.GameView;

import java.awt.*;

/**
 * Created by HongUyen on 09-Mar-17.
 */
public class GameController {

    protected GameModel gameModel;
    protected GameView gameView;

    public GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }
    public boolean isAlive(){
        return gameModel.isAlive();
    }
    public GameModel getGameModel() {
        return gameModel;
    }

    public void setGameModel(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public GameView getGameView() {
        return gameView;
    }

    public void setGameView(GameView gameView) {
        this.gameView = gameView;
    }

    public void run() {
    }

    public void draw(Graphics graphics) {
    }
}
