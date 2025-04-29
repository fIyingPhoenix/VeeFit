package app.veefit.veefitdesktop.Controllers.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

import java.io.IOException;

public class DashboardController {

    public PieChart kalorienChart;

    public void initialize() {

        ObservableList<PieChart.Data> daten = FXCollections.observableArrayList(
                new PieChart.Data("Gegessen", 1200),
                new PieChart.Data("Übrig", 800)
        );
        kalorienChart.setData(daten);

    }
}
