package com.onexip.flexboxfx.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by TB on 11.10.16.
 */
public class TestWrappingTextFlow extends Application
{
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TestFlexBoxFX2.fxml"));
        root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
