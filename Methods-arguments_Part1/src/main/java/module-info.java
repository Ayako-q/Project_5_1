module com.example.methodsarguments_part1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.methodsarguments_part1 to javafx.fxml;
    exports com.example.methodsarguments_part1;
}