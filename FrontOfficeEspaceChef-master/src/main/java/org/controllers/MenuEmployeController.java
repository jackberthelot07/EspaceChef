package org.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.Main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuEmployeController {
    public Label nomComplet;
    public Button accueil;
    public ImageView Laccueil;
    public Button procedures;
    public Button archives;
    public Button performances;
    public Button compte;
    public Button logOut;
    public Label date;
    public static BorderPane main;
    public static Stage stage;
    public static void menu()
    {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/views/menuEmploye.fxml"));
            main = loader.load();

            FXMLLoader loader2  = new FXMLLoader();
            loader2.setLocation(Main.class.getResource("/views/accueilEmploye.fxml"));
            main.setCenter(loader2.load());

            Scene scene = new Scene(main);
            stage= new Stage();
            stage.setTitle("");
            stage.setScene(scene);
            stage.setResizable(true);
            //stage.setMaximized(true);
            stage.initStyle(StageStyle.DECORATED);
            stage.show();
            Main.MainStage.close();

        } catch (IOException e) {
            Logger.getLogger(MenuEmployeController.class.getName()).log(Level.SEVERE, null,e);
        }

    }

    public void OnAccueil(ActionEvent actionEvent) {
    }

    public void onProcedures(ActionEvent actionEvent) {
    }

    public void onArchives(ActionEvent actionEvent) {
    }

    public void onPerformances(ActionEvent actionEvent) {
    }

    public void onCompte(ActionEvent actionEvent) {
    }

    public void onLogOut(ActionEvent actionEvent) {
    }
}
