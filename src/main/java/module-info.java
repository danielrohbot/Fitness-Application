module csci205_final_project {
    requires java.base;
    requires java.desktop;
    requires java.sql;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports org.team1.fitnessappmvc;


    exports org.team1;
    exports org.team1.calendar;
    opens org.team1.calendar to javafx.fxml;
}