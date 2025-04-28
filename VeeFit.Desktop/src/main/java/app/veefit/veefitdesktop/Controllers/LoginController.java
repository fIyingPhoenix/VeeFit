package app.veefit.veefitdesktop.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

public class LoginController {
    public AnchorPane loginPane;
    public Button start_button;
    public ImageView veefit_image;
    public Region space;
    public Button tagebuch_button;
    public Button aktivitaet_button;
    public Region space2;
    public Button suche_button;
    public Button einstellungen_button;
    public Button profil_button;
    public Label loginbereich_label;
    public Label benutzername_label;
    public TextField benutzername_textfield;
    public Label password_label;
    public Button hilfe_button;
    public Button login_button;
    public TextField passwort_textfield;


    private void handleLogin(ActionEvent event) throws IOException {

        String benutzername = benutzername_textfield.getText();
        String passwort = passwort_textfield.getText();

        if (benutzername.equals("admin") && passwort.equals("1234")) {

            Parent dashboardRoot = FXMLLoader.load(getClass().getResource("/Fxml/Dashboard.fxml"));
            Scene dashboardScene = new Scene(dashboardRoot);
            dashboardScene.getStylesheets().add(getClass().getResource("/Styles/Dashboard.css").toExternalForm());

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(dashboardScene);
            window.setTitle("VeeFit Dashboard");
        } else {
            System.out.println("Login fehlgeschlagen");
        }
    }
}