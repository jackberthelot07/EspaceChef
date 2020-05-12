package org.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuEmployeController implements Initializable {
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


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public static void menu()
    {
        try{
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
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void OnAccueil(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/views/accueilChef.fxml"));
        try {
            main.setCenter(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onProcedures(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/views/proceduresEmploye.fxml"));
        try {
            main.setCenter(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onArchives(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/views/archives.fxml"));
        try {
            main.setCenter(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onPerformances(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/views/performancesEmploye.fxml"));
        try {
            main.setCenter(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onCompte(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/views/compte.fxml"));
        try {
            main.setCenter(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onLogOut(ActionEvent actionEvent) {
        Main.MainStage.show();
        stage.close();
    }

}
