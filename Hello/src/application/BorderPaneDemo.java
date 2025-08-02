package application;
import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.BorderPane; 
import javafx.stage.Stage; 
public class BorderPaneDemo extends Application { 
public static void main(String[] args) { 
launch(args); 
} 
@Override 
public void start(Stage stage) throws Exception { 
BorderPane bPane = new BorderPane(); 
bPane.setTop(new TextField("Top")); 
bPane.setBottom(new TextField("Bottom")); 
bPane.setLeft(new TextField("Left")); 
bPane.setRight(new TextField("Right")); 

bPane.setCenter(new Button("Center Button")); 
// Creating a scene object 
Scene scene = new Scene(bPane, 500, 200);// it is a layer outside the Application window which contains layout 
// argument and width and height of a window. 
// Setting title to the Stage 
stage.setTitle("BorderPane Example"); 
// Adding scene to the stage 
stage.setScene(scene); 
// Displaying the contents of the stage 
stage.show(); 
} 
}