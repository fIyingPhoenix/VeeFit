package app.veefit.veefitdesktop.Controllers.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tooltip;
import javafx.scene.chart.PieChart.Data;
import javafx.animation.FadeTransition;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DashboardController {

    @FXML
    public Label dateLabel;
    public PieChart caloriesChart;
    public PieChart carb_chart;
    public PieChart protein_chart;
    public PieChart fat_chart;
    public Label proteinLabel;
    public Label fatLabel;
    public Label carbLabel;

    public void initialize() {

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        dateLabel.setText("Heute: " + today.format(formatter));

        ObservableList<PieChart.Data> daten = FXCollections.observableArrayList(
                new PieChart.Data("Gegessen: 1200", 1200),
                new PieChart.Data("Übrig: 800", 800)
        );
        caloriesChart.setData(daten);

        ObservableList<PieChart.Data> proteinData = FXCollections.observableArrayList(
                new PieChart.Data("Gegessen", 45),
                new PieChart.Data("Übrig", 55)
        );
        protein_chart.setData(proteinData);
        proteinLabel.setText("Proteine");

        ObservableList<PieChart.Data> fatDdata = FXCollections.observableArrayList(
                new PieChart.Data("Gegessen", 60),
                new PieChart.Data("Übrig", 40)
        );
        fat_chart.setData(fatDdata);
        fatLabel.setText("Fette");

        ObservableList<PieChart.Data> carbsData = FXCollections.observableArrayList(
                new PieChart.Data("Gegessen", 130),
                new PieChart.Data("Übrig", 70)
        );
        carb_chart.setData(carbsData);
        carbLabel.setText("Kohlenhydrate");

        caloriesChart.setOpacity(0.0);
        protein_chart.setOpacity(0.0);
        fat_chart.setOpacity(0.0);
        carb_chart.setOpacity(0.0);

        fadeInNode(caloriesChart, 2.0);
        fadeInNode(protein_chart, 2.0);
        fadeInNode(fat_chart, 2.0);
        fadeInNode(carb_chart, 2.0);
    }

    public void fadeInNode(Node node, double durationSeconds) {
        FadeTransition ft = new FadeTransition(Duration.seconds(durationSeconds), node);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
    }
}