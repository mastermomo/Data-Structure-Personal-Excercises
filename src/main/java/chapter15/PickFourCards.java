package chapter15;

import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * @author Mohammad Khan
 * This class serves as a HW exercise for chapter 15 for my CSC 202 class.
 * The program looks at a deck of playing card images and randomizes 
 * them. The first four in the randomized list are then presented to the user 
 * in a GUI. Thye user can then press the "refresh" button to randomize the cards again.
 */
public class PickFourCards extends Application {
    Button refresh; // Creates a button object.
    
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
        
        // Sets the name of the button to "Refresh" 
        // and places it in an HBox object.
        refresh = new Button("Refresh");
        HBox hbox = new HBox(refresh);
        
//        BorderPane pane = new BorderPane();
//        pane.setBottom(refresh);
//        refresh.setOnAction(e -> Collections.shuffle(list));
        
        // For loop that adds all of the card values between 1 - 52.
        for (int i = 0; i < 52; i++) {
            list.add(Integer.valueOf(i+1));
        }

        Collections.shuffle(list); // Shuffles all of the values.

        // Sets the image view to the first four randomized cards in the list of 52 cards.
        ImageView viewCard1 = new ImageView("image/card/" + list.get(0) + ".png");
        ImageView viewCard2 = new ImageView("image/card/" + list.get(1) + ".png");
        ImageView viewCard3 = new ImageView("image/card/" + list.get(2) + ".png");
        ImageView viewCard4 = new ImageView("image/card/" + list.get(3) + ".png");

        
        // Set's the button into the GUI.
        BorderPane pane = new BorderPane();
        pane.setBottom(refresh);
        
        HBox root = new HBox(); // Creates an HBox object.
        root.getChildren().addAll(refresh, viewCard1, viewCard2, viewCard3, viewCard4); // Combines all elements that will be seen by the user in the window.

        // "Refresh" button event that causes the four cards to radomize when the user presses it.
        refresh.setOnAction((e) -> {
            Collections.shuffle(list);
            viewCard1.setImage(new Image("image/card/" + list.get(0) + ".png"));
            viewCard2.setImage(new Image("image/card/" + list.get(1) + ".png"));
            viewCard3.setImage(new Image("image/card/" + list.get(2) + ".png"));
            viewCard4.setImage(new Image("image/card/" + list.get(3) + ".png"));
                });
        
        Scene scene = new Scene(root, 420, 150); // Sets the window size and elements when the program runs.
        primaryStage.setTitle("Three Random Cards"); // Sets the title of the window.
        primaryStage.setScene(scene); // Sets the scene of the GUI to be displayed to the user.
        primaryStage.show(); // Shows the user the GUI.
    }
}