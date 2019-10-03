/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appanonimousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Rafael Enríquez
 */
public class AppAnonimousInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Creación boton NEW
        Button btn = new Button();
        btn.setText("New");
        //Creación de clase anónima para manejador de eventos para el btn
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Imprime en consola Nuevo Proceso al pulsar btn
                System.out.println("Nuevo Proceso");
            }
        });
        
        //Creación boton OPEN
        Button btn2 = new Button();
        btn2.setText("Open");
        //Creación de clase anónima para manejador de eventos para el btn2
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Imprime en consola Abrir Proceso al pulsar btn
                System.out.println("Abrir proceso");
            }
        });
        
        //Creación boton SAVE
        Button btn3 = new Button();
        btn3.setText("Save");
        //Creación de clase anónima para manejador de eventos para el btn3
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Imprime en consola Guardar Proceso al pulsar btn
                System.out.println("Guardar proceso");
            }
        });
        
        //Creación boton PRINT
        Button btn4 = new Button();
        btn4.setText("Print");
        //Creación de clase anónima para manejador de eventos para el btn4
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Imprime en consola Imprimir Proceso al pulsar btn
                System.out.println("Imprimir proceso");
            }
        });
        
        HBox box = new HBox(7);
        box.setPadding(new Insets(50));
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(btn, btn2, btn3, btn4);
        
        Scene scene = new Scene(box, 300, 250);
        
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
