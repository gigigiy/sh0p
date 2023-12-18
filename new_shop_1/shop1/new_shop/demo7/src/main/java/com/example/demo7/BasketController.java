package com.example.demo7;// BasketController.javapackage com.example.demo7;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.List;
public class BasketController {    @FXML
private Label product1;
    public void setProduct1Label(String text) {        product1.setText(text);
    }}
