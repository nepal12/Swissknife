package com.elektrobit.eso_MIBHigh_Speech;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class MainApp extends Application {
    Parent root;
    Scene scene;
    public Stage myStage;
    @Override
    public void start(Stage stage) throws Exception {
        myStage = stage;
        stage.setScene(scene);
        stage.setTitle("EB: Swissknife");
        stage.getIcons().add(new Image("/images/Swissknife.png"));
        stage.setTitle("EB : Swissknife");
        stage.setMaximized(true);
        stage.show();
    }

    public void init() throws Exception{
        root  = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                scene = new Scene(root);
            }
        });
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
