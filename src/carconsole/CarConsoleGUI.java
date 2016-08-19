package carconsole;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class CarConsoleGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {

	//TODO: Construct various buttons for control of A/C
        Button powerBtn = new Button();
        Button insideAir = new Button();
        Button outsideAir = new Button();
        Button compressor = new Button();
        Button fanUp = new Button();
        Button fanDown = new Button();
        Button colder = new Button();
        Button warmer = new Button();
        Button faceVent = new Button();
        Button faceFeetVent = new Button();
        Button feetVent = new Button();
        Button feetWindowVent = new Button();
        Button windowVent = new Button();
        
        //TODO: build clock for panel
        //TODO: build media player for center panel
        
        powerBtn.setText("Power");
        //powerBtn.setGraphic(new ImageView("cat.jpg"));
        powerBtn.setOnAction((ActionEvent event) -> {
            System.out.println("Power Button");
            //TODO: send power signal to Ardulink
        });
        
        insideAir.setText("ReCirculate");
        insideAir.setOnAction((ActionEvent event) ->{
           System.out.println("Recirculate"); 
        });
        
        outsideAir.setText("Fresh Air");
        outsideAir.setOnAction((ActionEvent event) ->{
           System.out.println("Fresh Air"); 
        });
        
        compressor.setText("compressor");
        compressor.setOnAction((ActionEvent event) ->{
           System.out.println("compressor"); 
        });
 
        fanUp.setText("Fan Up");
        fanUp.setOnAction((ActionEvent event) ->{
           System.out.println("Fan Up"); 
        });
        
        fanDown.setText("fan down");
        fanDown.setOnAction((ActionEvent event) ->{
           System.out.println("fan down"); 
        });
        
        colder.setText("colder");
        colder.setOnAction((ActionEvent event) ->{
           System.out.println("colder"); 
        });
        
        warmer.setText("warmer");
        warmer.setOnAction((ActionEvent event) ->{
           System.out.println("warmer"); 
        });
        
        faceVent.setText("faceVent");
        faceVent.setOnAction((ActionEvent event) ->{
           System.out.println("faceVent"); 
        });
        
        faceFeetVent.setText("faceFeetVent");
        faceFeetVent.setOnAction((ActionEvent event) ->{
           System.out.println("faceFeetVent"); 
        });
        
        feetVent.setText("feetVent");
        feetVent.setOnAction((ActionEvent event) ->{
           System.out.println("feetVent"); 
        });
        
        feetWindowVent.setText("feetWindowVent");
        feetWindowVent.setOnAction((ActionEvent event) ->{
           System.out.println("feetWindowVent"); 
        });
        
        windowVent.setText("windowVent");
        windowVent.setOnAction((ActionEvent event) ->{
           System.out.println("windowVent"); 
        });
        
	//Construct panel components
        BorderPane root = new BorderPane();
	HBox topPanel = new HBox(2);
	HBox bottomPanel = new HBox(2);
	VBox leftPanel = new VBox(2);
	VBox rightPanel = new VBox(2);
        
	//add buttons to various panel components
	topPanel.getChildren().addAll(insideAir, outsideAir, compressor);
	bottomPanel.getChildren().addAll(faceVent, faceFeetVent, feetVent, feetWindowVent, windowVent, powerBtn);
	leftPanel.getChildren().addAll(fanUp, fanDown);
	rightPanel.getChildren().addAll(warmer, colder);
        
        //set alignment and buffers to buttons
        topPanel.setAlignment(Pos.CENTER);
        bottomPanel.setAlignment(Pos.CENTER);
        leftPanel.setAlignment(Pos.CENTER);
        rightPanel.setAlignment(Pos.CENTER);
        
	//add panel sections to root
	root.setTop(topPanel);
	root.setBottom(bottomPanel);
	root.setLeft(leftPanel);
	root.setRight(rightPanel);
	//TODO: what to add to the center panel... media player?
	root.setCenter(new ImageView("cat.jpg"));

	
 	Scene scene = new Scene(root);

        primaryStage.setTitle("Matt's Car Console");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}

