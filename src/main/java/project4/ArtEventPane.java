package project4;

import java.lang.*;
import java.text.*;
import java.util.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 4th project in my CSC 202 class.
 * It functions as the Pane class class for ArtEvent.
 */
public class ArtEventPane extends GridPane {
    // Creates text field objects for the ArtEvent GUI.
    private final TextField tfName = new TextField();
    private final TextField tfPlace = new TextField();
    private final TextField tfDate = new TextField();
    private final TextField tfTime = new TextField();
    private final TextField tfAudience = new TextField();
    private final TextField tfType = new TextField();

    private final Label lblWeekEnd = new Label ("Weekend:"); // Creates a label for Weekend.
    
    // Creats two RadioButton objects for yes and no answers.
    private final RadioButton rbWeekEndYes = new RadioButton("Yes");
    private final RadioButton rbWeekEndNo = new RadioButton("No");
    
    private final HBox hBoxWeekEnd = new HBox(10, this.getRbWeekEndYes(), this.getRbWeekEndNo()); // Creates an HBox object that is used for when 
                                                                                                  // the user answers yes/no for if it's the weekend

    /**
     * Constructor for the class.
     */
    public ArtEventPane() {
        // Places all textfields in the respective positions in the GUI.
        this.getTfName().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfPlace().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfDate().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTime().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfAudience().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfType().setAlignment(Pos.BOTTOM_RIGHT);

        // Creates button objects for submission and clearing.
        // and then gives them actions.
        Button btSubmit = new Button("Submit");
        Button btClear  = new Button("Clear" );
        btSubmit.setOnAction(e -> this.submit());
        btClear .setOnAction(e -> this.clear ());

        // Sets the horizontal alignment for both the 
        // submission and clear buttons.
        GridPane.setHalignment(btClear , HPos.LEFT);
        GridPane.setHalignment(btSubmit, HPos.LEFT);

        // Adds all the respective labels and text boxes
        // added to the GUI in a grid format.
        super.add(new Label("Name:"), 0, 0); 
        super.add(this.getTfName(), 1, 0); 
        super.add(new Label("Place:"), 2, 0); 
        super.add(this.getTfPlace(), 3, 0);
        super.add(new Label("Date (mm/dd/yyyy):"), 0, 1); 
        super.add(this.getTfDate(), 1, 1); 
        super.add(new Label("Time (hh:mm):"), 2, 1); 
        super.add(this.getTfTime (), 3, 1);
        super.add(new Label("Audience:"), 0, 2); 
        super.add(this.getTfAudience(), 1, 2); 
        super.add(new Label("Type:"), 2, 2); 
        super.add(this.getTfType (), 3, 2);
        super.add(btClear, 0, 3);                                        
        super.add(btSubmit, 2, 3);

        super.setHgap(5); // Sets the horizontal gap between elements.
        super.setVgap(5); // Sets the vertical gap between elements.
        super.setAlignment(Pos.CENTER); // Positions elements relative to center.
        super.setPadding(new Insets(5, 5, 5, 5)); // Sets padding measurements in relation to elements inthe GUI.
    }

    /**
     * Method that gets the event's name.
     * @return the event name.
     */
    public final TextField getTfName() {
        return this.tfName;
    }
    /**
     * Method that gets the event's locations.
     * @return the event location.
     */
    public final TextField getTfPlace() {
        return this.tfPlace;
    }
    
    /**
     * Method that returns the event's date.
     * @return the event date.
     */
    public final TextField getTfDate() {
        return this.tfDate;
    }
    
    /**
     * Method that returns the event's time.
     * @return the event time.
     */
    public final TextField getTfTime() {
        return this.tfTime;
    }
    
    /**
     * Method that returns the event's audience.
     * @return the event audience.
     */
    public final TextField getTfAudience() {
        return this.tfAudience;
    }
    
    /**
     * Method that returns the event's type. 
     * @return the event type.
     */
    public final TextField getTfType() {
        return this.tfType;
    }

    /**
     * Method that returns yes for the "yes" weekend button.
     * @return yes if the event is on a weekend.
     */
    public RadioButton getRbWeekEndYes() {
        return this.rbWeekEndYes;
    }
    
    /**
     * Method that returns no for the "no" weekend button.
     * @return no if the event is not on a weekend.
     */
    public RadioButton getRbWeekEndNo() {
        return this.rbWeekEndNo;
    }

    /**
     * Method the returns the weekend label.
     * @return the weekend label.
     */
    public Label getLblWeekEnd() {
        return this.lblWeekEnd ;
    }
    
    /**
     * Method that returns the weekend element's HBox
     * @return weekend element's HBox.
     */
    public HBox  getHBoxWeekEnd() {
        return this.hBoxWeekEnd;
    }

    /**
     * Method that runs when the submit button is pressed on
     * the the ArtEvent GUI.
     */
    public void submit() {
        Event event = new Event(); // Creates an Event object.
        
        // String variables that take the name, place, and type that
        // the user puts into their respective text fields.
        String name = this.getTfName().getText().trim();
        String place = this.getTfPlace().getText().trim();
        String type = this.getTfType().getText().trim();

        // Int variable that takes the converted string value that
        // the user placed in the audience text field.
        int audience = Integer.parseInt(this.getTfAudience().getText().trim());

        Date dateTime = new Date();  // Sets the date time to the current date time.
        
        try {
            dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse(this.getTfDate().getText().trim() + " " + 
                    (this.getTfTime().getText().trim().isEmpty()? "00:00" : this.getTfTime().getText().trim()));
        } 
        catch (ParseException ex) {}

        try {
         event = new ArtEvent(name, place, dateTime, audience, type);   
        }
        catch (ParseException e) {   
        }

        // Sets what happens in regards to being the weekend when
        // either "yes" or "no" are pressed.
        this.getRbWeekEndYes().setSelected(event.isWeekEnd());
        this.getRbWeekEndNo().setSelected(!event.isWeekEnd());

         
        
        super.getChildren().remove(this.getLblWeekEnd ());
        super.getChildren().remove(this.getHBoxWeekEnd());

        // adds the weekend label and Hbox in the GUI.
        super.add(this.getLblWeekEnd(), 0, 4);
        super.add(this.getHBoxWeekEnd(), 1, 4);
    }  

    /**
     * Method that runs when the clear button is pressed on
     * the the ArtEvent GUI.
     */
    public void clear() {

        // Clears all of the text fields in the GUI.
        this.getTfName().clear();
        this.getTfPlace().clear();
        this.getTfDate().clear();
        this.getTfTime().clear();
        this.getTfAudience().clear();
        this.getTfType().clear();

        // Removes the weekend label and Hbox.
        super.getChildren().remove(this.getLblWeekEnd ());
        super.getChildren().remove(this.getHBoxWeekEnd());
    } 
}