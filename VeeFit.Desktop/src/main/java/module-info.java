module app.veefit.veefitdesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires org.kordamp.ikonli.javafx;

    opens app.veefit.veefitdesktop to javafx.fxml;
    opens app.veefit.veefitdesktop.Controllers to javafx.fxml;
    opens app.veefit.veefitdesktop.Controllers.Admin to javafx.fxml;
    opens app.veefit.veefitdesktop.Controllers.Client to javafx.fxml;

    exports app.veefit.veefitdesktop;
    exports app.veefit.veefitdesktop.Controllers;
    exports app.veefit.veefitdesktop.Controllers.Admin;
    exports app.veefit.veefitdesktop.Controllers.Client;
    exports app.veefit.veefitdesktop.Models;
    exports app.veefit.veefitdesktop.Views;
}