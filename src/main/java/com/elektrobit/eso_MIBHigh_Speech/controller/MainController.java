package com.elektrobit.eso_MIBHigh_Speech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.ResourceBundle;

import com.elektrobit.eso_MIBHigh_Speech.model.Extractor;
import com.elektrobit.eso_MIBHigh_Speech.services.FileContentLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;

public class MainController implements Initializable {
    @FXML private LoggerConsoleController loggerConsoleController;
    @FXML private Label label;
    @FXML private TabPane tabStack;
    private Extractor extract;
    private FileContentLoader fileContentLoader = new FileContentLoader();
    public TextArea getVisualLog() {
        return loggerConsoleController.getLoggerTxtArea();
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {

        //extract.start();
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        getVisualLog().appendText("Hello World !!!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final Tab tab = new Tab("Getting Started");
        TextArea content = new TextArea();
        content.setEditable(false);
        content.setStyle("-fx-font-family: monospace");
        content.appendText(getInfo("gettingStarted"));
        tab.setContent(content);
        tabStack.getTabs().add(tab);
    }

    /**
     *
     * @param src
     * @return
     */
    public String getInfo(String src) {
        PrintWriter stackTraceWriter = new PrintWriter(new StringWriter());
        String info = null;

        try {
            info = fileContentLoader.getTextContent(src);
            getVisualLog().appendText("Populating the Getting Started text. " +"\n");
        } catch (IOException exception) {
            exception.printStackTrace(stackTraceWriter);
            getVisualLog().appendText(stackTraceWriter.toString() + "\n");
        }
        return info;
    }

}
