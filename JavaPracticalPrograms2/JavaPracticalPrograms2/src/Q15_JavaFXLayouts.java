//15. Write a JavaFX program to implement the all types of layouts/roots.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Q15_JavaFXLayouts extends Application {
    public void start(Stage stage) {
        BorderPane border = new BorderPane();
        border.setTop(new Button("Top"));
        border.setBottom(new Button("Bottom"));
        border.setLeft(new Button("Left"));
        border.setRight(new Button("Right"));
        border.setCenter(new Button("Center"));

        VBox vbox = new VBox(new Button("VBox1"), new Button("VBox2"));
        HBox hbox = new HBox(new Button("HBox1"), new Button("HBox2"));

        StackPane stack = new StackPane(new Button("Stack"));
        GridPane grid = new GridPane();
        grid.add(new Button("00"), 0, 0);
        grid.add(new Button("01"), 0, 1);

        Scene scene = new Scene(border, 400, 300);
        stage.setTitle("Aayush Dai ko layout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
