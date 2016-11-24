package com.elektrobit.eso_MIBHigh_Speech.model;

import com.elektrobit.eso_MIBHigh_Speech.controller.MainController;
import javafx.application.Platform;
import javafx.scene.control.TextArea;

/**
 * Created by riri9385 on 18.11.2016.
 */
public class Extractor extends Thread{
    private TextArea view;
    private String logMessage;
    private MainController mainController;

    public Extractor(MainController mainController ){
        setDaemon(true);
        this.mainController = mainController;
        //this.logMessage = message;
    }

    public void injectMainController(MainController mainController){
        this.mainController = mainController;
    }

    public void run(){
        // UI Update
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                for (int i= 0 ; i <5 ; i++) {
                    mainController.getVisualLog().appendText("Roll Number " + i + "\n");
                }
            }
        });
    }

}
