package app.veefit.veefitdesktop.Controllers.Client;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;


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
