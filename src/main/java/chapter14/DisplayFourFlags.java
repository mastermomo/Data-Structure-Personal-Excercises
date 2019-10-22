package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


/**
 * @author Mohammad Khan
 * 
 * This class serves as a HW exercise for chapter 14 for my CSC 202 class.
 * It's purpose is to display the US, Canadian, French, and British flags on a 
 * grid pane GUI to the user.
 */
public class DisplayFourFlags extends Application {
   /**
    * Main method for program execution.
    */
    public static void main (String[] args) {
        Application.launch(args);
    }
    /**
     * Overrides the start method in order 
     * to form the GUI for this program.
     * @param primaryStage stages the the window and it's elements to the user.
     * @Override
     */
    public void start(Stage primaryStage) {
        // Creates 4 ImageView objects that hold the image paths to 
        // the 4 flags in question.
        ImageView imageView1 = new ImageView("image/us.gif");
        ImageView imageView2 = new ImageView("image/ca.gif");
        ImageView imageView3 = new ImageView("image/fr.gif");
        ImageView imageView4 = new ImageView("image/uk.gif");
        
        GridPane gridPane = new GridPane(); // Creates a GridPane object.
        
        // Lays the flag images in their respective areas 
        // in the grid pane.
        GridPane.setConstraints(imageView1, 0, 0);
        GridPane.setConstraints(imageView2, 1, 0);
        GridPane.setConstraints(imageView3, 0, 1);
        GridPane.setConstraints(imageView4, 1, 1);
        
        gridPane.getChildren().addAll(imageView1, imageView2, imageView3, imageView4); // Combines all elements that will be seen by the user in the window.
        
        Scene scene = new Scene(gridPane, 353, 194); // Sets the window size and elements when the program runs.
        primaryStage.setTitle("Four Flags"); // Sets the title of the window.
        primaryStage.setScene(scene); // Sets the scene of the GUI to be displayed to the user.
        primaryStage.show(); // Shows the user the GUI.
    }
    
    
}

