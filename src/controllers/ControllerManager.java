package controllers;

import java.awt.*;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by HongUyen on 11-Mar-17.
 */
public class ControllerManager {
    protected Vector<GameController> gameControllerVector;

    public ControllerManager(Vector<GameController> gameControllerVector) {
       gameControllerVector = new Vector<>();
    }

    public void add(GameController gameController){
        this.gameControllerVector.add(gameController);

    }

    public void run(){
        removeDeadGameController();
        for(GameController gameController : this.gameControllerVector){
            gameController.run();
        }
    }

    public void removeDeadGameController(){
        Iterator<GameController> iterator = this.gameControllerVector.iterator();
        while(iterator.hasNext()){
            GameController gameController = iterator.next();
            if(!gameController.isAlive()){
                iterator.remove();
            }
        }
    }


    public void draw(Graphics graphics) {
        for(GameController gameController : this.gameControllerVector){
            gameController.draw(graphics);
        }
    }
}
