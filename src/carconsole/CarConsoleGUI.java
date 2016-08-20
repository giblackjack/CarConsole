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
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.shape.Cylinder;

public class CarConsoleGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {

	//TODO: Construct various buttons for control of A/C
        ToggleGroup airGroup = new ToggleGroup();
        ToggleGroup ventGroup = new ToggleGroup();
        
        Button powerBtn = new Button();
        ToggleButton insideAir = new ToggleButton();
        insideAir.setToggleGroup(airGroup);
        ToggleButton outsideAir = new ToggleButton();
        outsideAir.setToggleGroup(airGroup);
        ToggleButton compressor = new ToggleButton();
        Button fanUp = new Button();
        Button fanDown = new Button();
        Button colder = new Button();
        Button warmer = new Button();
        ToggleButton faceVent = new ToggleButton();
        faceVent.setToggleGroup(ventGroup);
        ToggleButton faceFeetVent = new ToggleButton();
        faceFeetVent.setToggleGroup(ventGroup);
        ToggleButton feetVent = new ToggleButton();
        feetVent.setToggleGroup(ventGroup);
        ToggleButton feetWindowVent = new ToggleButton();
        feetWindowVent.setToggleGroup(ventGroup);
        ToggleButton windowVent = new ToggleButton();
        windowVent.setToggleGroup(ventGroup);
        
        
        
        //TODO: build clock for panel
        //TODO: build media player for center panel
        
        powerBtn.setGraphic(new ImageView("power.png"));
        powerBtn.setOnAction((ActionEvent event) -> {
            System.out.println("Power Button");
            //TODO: send power signal to Ardulink
        });
        
        insideAir.setGraphic(new ImageView("in-air.png"));
        insideAir.setOnAction((ActionEvent event) ->{
           System.out.println("Recirculate"); 
        });
        
        outsideAir.setGraphic(new ImageView("out-air.png"));
        outsideAir.setOnAction((ActionEvent event) ->{
           System.out.println("Fresh Air"); 
        });
        
        compressor.setGraphic(new ImageView("ac.png"));
        compressor.setOnAction((ActionEvent event) ->{
           System.out.println("compressor");
        });
 
        fanUp.setGraphic(new ImageView("fan2.png"));
        fanUp.setOnAction((ActionEvent event) ->{
           System.out.println("Fan Up"); 
        });
        
        fanDown.setGraphic(new ImageView("fan1.png"));
        fanDown.setOnAction((ActionEvent event) ->{
           System.out.println("fan down"); 
        });
        
        colder.setGraphic(new ImageView("cold.png"));
        colder.setOnAction((ActionEvent event) ->{
           System.out.println("colder"); 
        });
        
        warmer.setGraphic(new ImageView("hot.png"));
        warmer.setOnAction((ActionEvent event) ->{
           System.out.println("warmer"); 
        });
        
        faceVent.setGraphic(new ImageView("face.png"));
        faceVent.setOnAction((ActionEvent event) ->{
           System.out.println("faceVent"); 
        });
        
        faceFeetVent.setGraphic(new ImageView("face_feet.png"));
        faceFeetVent.setOnAction((ActionEvent event) ->{
           System.out.println("faceFeetVent"); 
        });
        
        feetVent.setGraphic(new ImageView("feet.png"));
        feetVent.setOnAction((ActionEvent event) ->{
           System.out.println("feetVent"); 
        });
        
        feetWindowVent.setGraphic(new ImageView("feet_windows.png"));
        feetWindowVent.setOnAction((ActionEvent event) ->{
           System.out.println("feetWindowVent"); 
        });
        
        windowVent.setGraphic(new ImageView("windows.png"));
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
	topPanel.getChildren().addAll(compressor, insideAir, outsideAir);
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
	//root.setCenter(new Cylinder(64D, 128D));
        
	
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

