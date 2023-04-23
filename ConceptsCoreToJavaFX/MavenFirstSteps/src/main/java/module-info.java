module MavenFirstSteps {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jmc to javafx.fxml;
    exports com.jmc;
}