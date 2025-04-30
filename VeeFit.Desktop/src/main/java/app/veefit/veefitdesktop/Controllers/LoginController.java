package app.veefit.veefitdesktop.Controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
import javafx.util.Duration;
import org.kordamp.ikonli.javafx.FontIcon;

public class LoginController {
    public AnchorPane loginPane;
    public ImageView veefit_image;
    public Region space;
    public Region space2;
    public Button search_button;
    public Button settings_button;
    public Button homepage_button;
    public Label loginarea_label;
    public Label username_label;
    public TextField username_textfield;
    public Label password_label;
    public Button password_button;
    public Button login_button;
    public TextField password_textfield;
    public Button registration_button;
    public Label sloganLabel;
    public FontIcon settings_icon;
    public FontIcon homepage_icon;
    public FontIcon search_icon;

    @FXML
    public void initialize() {
        animateText();
    }

    public void animateText() {
        final StringBuilder displayedText = new StringBuilder();
        String text = sloganLabel.getText();

        Timeline timeline = new Timeline();

        sloganLabel.setText("");

        for (int i= 0; i < text.length(); i++) {
            final int index = i;
            KeyFrame frame = new KeyFrame(Duration.millis(30*(i + 1)), e -> {
                displayedText.append(text.charAt(index));
                sloganLabel.setText(displayedText.toString());
            });
            timeline.getKeyFrames().add(frame);
        }
        timeline.setCycleCount(1);
        timeline.play();
    }

    public void handleLogin(ActionEvent event) throws IOException {

        String username = username_textfield.getText();
        String password = password_textfield.getText();

        if (username.equals("admin") && password.equals("1234")) {

            Parent dashboardRoot = FXMLLoader.load(getClass().getResource("/fxml/Client/Dashboard.fxml"));
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