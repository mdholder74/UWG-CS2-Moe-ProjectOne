module edu.westga.cs1302.MoeHolder1302Project1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens edu.westga.cs1302.MoeHolder1302Project1.views to javafx.fxml;
    exports edu.westga.cs1302.MoeHolder1302Project1;
}
