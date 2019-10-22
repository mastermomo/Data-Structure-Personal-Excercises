package chapter14;

import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * @author Mohammad Khan
 * This class serves as a HW exercise for chapter 14 for my CSC 202 class.
 * The program looks at a deck of playing card images and randomizes 
 * them. The first three in the randomized list is then presented to the user 
 * in a GUI.
 */
public class DisplayThreeCards extends Application{
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
        ArrayList<Integer> list = new ArrayList<>(); // Creates an ArrayList object.
        
        // For loop that adds all of the card values between 1 - 52.
        for (int i = 0; i < 52; i++) {
            list.add(Integer.valueOf(i+1));
        }

        Collections.shuffle(list); // Shuffles all of the values.

        // Sets the image view to the first three randomized cards in the list of 52 cards.
        ImageView viewCard1 = new ImageView("image/card/" + list.get(0) + ".png");
        ImageView viewCard2 = new ImageView("image/card/" + list.get(1) + ".png");
        ImageView viewCard3 = new ImageView("image/card/" + list.get(2) + ".png");

        HBox root = new HBox(); // Creates an HBox object.
        root.getChildren().addAll(viewCard1, viewCard2, viewCard3); // Combines all elements that will be seen by the user in the window.

        Scene scene = new Scene(root, 216, 100); // Sets the window size and elements when the program runs.
        primaryStage.setTitle("Three Random Cards"); // Sets the title of the window.
        primaryStage.setScene(scene); // Sets the scene of the GUI to be displayed to the user.
        primaryStage.show(); // Shows the user the GUI.
    }
}