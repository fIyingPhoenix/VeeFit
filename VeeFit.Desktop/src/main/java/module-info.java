module app.veefit.veefitdesktop {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens app.veefit.veefitdesktop to javafx.fxml;
    exports app.veefit.veefitdesktop;
}