package com.example.demo7;// MainController.javapackage com.example.demo7;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;import javafx.scene.Scene;
import javafx.scene.control.Button;import javafx.stage.Stage;
import java.io.IOException;
public class MainController {
    @FXML    private Button AddProduct1Button;
    @FXML
    void handleAddProduct(ActionEvent event) throws IOException {        // Пример: При нажатии на кнопку добавления книги, меняем текст Label в BasketController
        FXMLLoader loader = new FXMLLoader(getClass().getResource("basket.fxml"));        Parent root = loader.load();
        BasketController controller = loader.getController();
        controller.setProduct1Label("Вы добавили книгу в Product 1");
        Stage stage = new Stage();        stage.setScene(new Scene(root));
        stage.show();    }
}
