package com.elektrobit.eso_MIBHigh_Speech.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
/**
 * Created by riri9385 on 18.11.2016.
 */
public class LoggerConsoleController {
    @FXML private VBox loggerTab;
    @FXML private TextArea loggerTxtArea;

    public TextArea getLoggerTxtArea() {
        return loggerTxtArea;
    }

}
