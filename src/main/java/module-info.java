module org.example.csc311capstoneproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311capstoneproject to javafx.fxml;
    exports org.example.csc311capstoneproject;
}