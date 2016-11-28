package c;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main extends Application {

	static boolean sw;
	Label mensaje = new Label("");
    Button boton1 = new Button("");
    Button boton2 = new Button("");
    Button boton3 = new Button("");
    Button boton4 = new Button("");
    Button boton5 = new Button("");
    Button boton6 = new Button("");
    Button boton7 = new Button("");
    Button boton8 = new Button("");
    Button boton9 = new Button("");

    public static void main(String[] args) {
    	sw=false;
        launch(args);
    }
    private void check(){
    	if(boton1.getText()!="" && boton1.getText().equals(boton2.getText()) && boton1.getText().equals(boton3.getText())){
    		mensaje.setText("Ganaste "+boton1.getText());
    	}
    	if(boton4.getText()!="" && boton4.getText().equals(boton5.getText()) && boton4.getText().equals(boton6.getText())){
    		mensaje.setText("Ganaste "+boton4.getText());
    	}
    	if(boton7.getText()!="" && boton7.getText().equals(boton8.getText()) && boton7.getText().equals(boton9.getText())){
    		mensaje.setText("Ganaste "+boton7.getText());
    	}
    	if(boton1.getText()!="" && boton1.getText().equals(boton4.getText()) && boton1.getText().equals(boton7.getText())){
    		mensaje.setText("Ganaste "+boton1.getText());
    	}
    	if(boton2.getText()!="" && boton2.getText().equals(boton5.getText()) && boton2.getText().equals(boton8.getText())){
    		mensaje.setText("Ganaste "+boton2.getText());
    	}
    	if(boton3.getText()!="" && boton3.getText().equals(boton6.getText()) && boton3.getText().equals(boton9.getText())){
    		mensaje.setText("Ganaste "+boton3.getText());
    	}
    	if(boton1.getText()!="" && boton1.getText().equals(boton5.getText()) && boton1.getText().equals(boton9.getText())){
    		mensaje.setText("Ganaste "+boton1.getText());
    	}
    	if(boton3.getText()!="" && boton3.getText().equals(boton5.getText()) && boton3.getText().equals(boton7.getText())){
    		mensaje.setText("Ganaste "+boton3.getText());
    	}
    }
    @Override
    public void start(Stage primaryStage) throws Exception {



        boton1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
            public void handle(ActionEvent event) {
            	if(sw){
            		boton1.setText("O");
            	}else{
            		boton1.setText("X");
            	}
            	sw=!sw;
            	check();
            }
        });
        boton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(sw){
            		boton2.setText("O");
            	}else{
            		boton2.setText("X");
            	}
            	sw=!sw;
            	check();
            }
        });
        boton3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(sw){
            		boton3.setText("O");
            	}else{
            		boton3.setText("X");
            	}
            	sw=!sw;
            	check();
            }
        });
        boton4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(sw){
            		boton4.setText("O");
            	}else{
            		boton4.setText("X");
            	}
            	sw=!sw;
            	check();
            }
        });
        boton5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(sw){
            		boton5.setText("O");
            	}else{
            		boton5.setText("X");
            	}
            	sw=!sw;
            	check();
            }
        });
        boton6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(sw){
            		boton6.setText("O");
            	}else{
            		boton6.setText("X");
            	}
            	sw=!sw;
            	check();
            }
        });
        boton7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(sw){
            		boton7.setText("O");
            	}else{
            		boton7.setText("X");
            	}
            	sw=!sw;
            	check();
            }
        });
        boton8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(sw){
            		boton8.setText("O");
            	}else{
            		boton8.setText("X");
            	}
            	sw=!sw;
            	check();
            }
        });
        boton9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(sw){
            		boton9.setText("O");
            	}else{
            		boton9.setText("X");
            	}
            	sw=!sw;
            	check();
            }
        });


        HBox caja1 = new HBox();
        HBox caja2 = new HBox();
        HBox caja3 = new HBox();
        VBox l1 = new VBox();
        caja1.getChildren().add(boton1);
        caja1.getChildren().add(boton2);
        caja1.getChildren().add(boton3);
        caja1.setSpacing(15);
        caja1.setPadding(new Insets(20, 20, 20, 20));

        caja2.getChildren().add(boton4);
        caja2.getChildren().add(boton5);
        caja2.getChildren().add(boton6);
        caja2.setSpacing(15);
        caja2.setPadding(new Insets(20, 20, 20, 20));

        caja3.getChildren().add(boton7);
        caja3.getChildren().add(boton8);
        caja3.getChildren().add(boton9);
        caja3.setSpacing(15);
        caja3.setPadding(new Insets(20, 20, 20, 20));


        l1.getChildren().add(mensaje);
        l1.getChildren().add(caja1);
        l1.getChildren().add(caja2);
        l1.getChildren().add(caja3);

        Scene scene = new Scene(l1, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Zodiaco");
        primaryStage.show();
    }
}
