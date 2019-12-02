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
 * It functions as the Pane class class for BasketBallGame.
 */
public class BasketBallGamePane extends GridPane {
    // Creates text field objects for the ArtEvent GUI.
    private final TextField tfName = new TextField();
    private final TextField tfPlace = new TextField();
    private final TextField tfDate = new TextField();
    private final TextField tfTime = new TextField();
    private final TextField tfAudience = new TextField();
    private final TextField tfLeague = new TextField();
    private final TextField tfTeam1 = new TextField();
    private final TextField tfScore1 = new TextField();
    private final TextField tfTeam2 = new TextField();
    private final TextField tfScore2 = new TextField();
    private final TextField tfWinnerName = new TextField();
    
    private final Label lblWinnerName = new Label("Winner:"); // Creates a label for who wins.

    private final Label lblWeekEnd = new Label("Weekend:");// Creates a label for Weekend.
    
    // Creats two RadioButton objects for yes and no answers. 
    private final RadioButton rbWeekEndYes = new RadioButton("Yes");
    private final RadioButton rbWeekEndNo  = new RadioButton("No");
    
    private final HBox hBoxWeekEnd = new HBox(10, this.getRbWeekEndYes(), this.getRbWeekEndNo()); // Creates an HBox object that is used for when 
                                                                                                  // the user answers yes/no for if it's the weekend

    /**
     * Constructor for the class.
     */
    protected BasketBallGamePane() {
        // Places all textfields in the respective positions in the GUI.
        this.getTfName().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfPlace().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfDate().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTime().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfAudience().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTeam1().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTeam2().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfScore1().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfScore2().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfLeague().setAlignment(Pos.BOTTOM_RIGHT);

        this.getTfWinnerName().setEditable(false); // Prevents the user from editing the winner of the game.

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
        super.add(new Label("Time(hh:mm):"), 2, 1); 
        super.add(this.getTfTime(), 3, 1);
        super.add(new Label("Audience:"), 0, 2); 
        super.add(this.getTfAudience(), 1, 2); 
        super.add(new Label("League:"), 2, 2); 
        super.add(this.getTfLeague(), 3, 2);
        super.add(new Label("Team 1:"), 0, 3); 
        super.add(this.getTfTeam1(), 1, 3); 
        super.add(new Label("Score 1:"), 2, 3); 
        super.add(this.getTfScore1(), 3, 3);
        super.add(new Label("Team 2:"), 0, 4); 
        super.add(this.getTfTeam2   (), 1, 4); 
        super.add(new Label("Score 2:"), 2, 4); 
        super.add(this.getTfScore2(), 3, 4);
        super.add(btClear, 0, 5);                                        
        super.add(btSubmit, 2, 5);

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
    public final TextField getTfLeague() {
        return this.tfLeague;
    }
    
    /**
     * Method that returns the name of team 1.
     * @return team 1's name.
     */
    public final TextField getTfTeam1() {
        return this.tfTeam1;
    }
    
    /**
     * Method that returns team 1's score.
     * @return team 1's score.
     */
    public final TextField getTfScore1() {
        return this.tfScore1;
    }
    
    /**
     * Method that returns the name of team 2.
     * @return team 2's name.
     */
    public final TextField getTfTeam2() {
        return this.tfTeam2;
    }
    
    /**
     * Method that returns team 2's score.
     * @return team 2's score.
     */
    public final TextField getTfScore2() {
        return this.tfScore2;
    }

    /**
     * Method that returns the name of the
     * team who won.
     * @return name of the team who won.
     */
    public final TextField getTfWinnerName() {
        return this.tfWinnerName;
    }
    
    /**
     * Method that returns the label that
     * signifies the winning team.
     * @return label for winning team.
     */
    public Label getLblWinnerName() {
        return this.lblWinnerName;
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
     * the the BasketBallGame GUI.
     */
    public void submit() {
        Event event = new Event(); // Creates an Event object.
        
        // String variables that take the name, place, and type that
        // the user puts into their respective text fields.
        String name = this.getTfName().getText().trim();
        String place = this.getTfPlace().getText().trim();
        String league = this.getTfLeague().getText().trim();

        // Variables that take in an array for the teams and their scores.
        String[] teams  = {this.getTfTeam1().getText().trim(), this.getTfTeam2().getText().trim()};
        int [] scores = {Integer.parseInt(this.getTfScore1().getText().trim()), Integer.parseInt(this.getTfScore2().getText().trim())};

        // Int variable that takes the converted string value that
        // the user placed in the audience text field.
        int audience = Integer.parseInt(this.getTfAudience().getText().trim());

        Date dateTime = new Date(); // Sets the date time to the current date time.
        
        try {
            dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse(this.getTfDate().getText().trim() + " " + (this.getTfTime().getText().trim().isEmpty()? "00:00" : this.getTfTime().getText().trim()));
        } 
        catch (ParseException ex) {
        }
        
        try {
            event = new BasketBallGame(name, place, dateTime, audience, teams, scores, league);
        } 
        catch (ParseException ex) {
        }

        this.getTfWinnerName().setText(((project4.SportEvent)event).getWinnerName());

        // Sets what happens in regards to being the weekend when
        // either "yes" or "no" are pressed.
        this.getRbWeekEndYes().setSelected( event.isWeekEnd());
        this.getRbWeekEndNo ().setSelected(!event.isWeekEnd());

        super.getChildren().remove(this.getLblWinnerName());
        super.getChildren().remove(this.getTfWinnerName ());
        super.getChildren().remove(this.getLblWeekEnd   ());
        super.getChildren().remove(this.getHBoxWeekEnd  ());

        // Adds the winner name label/textfield and weekend label/Hbox in the GUI.
        super.add(this.getLblWinnerName(), 0, 6);
        super.add(this.getTfWinnerName (), 1, 6);
        super.add(this.getLblWeekEnd   (), 0, 7);
        super.add(this.getHBoxWeekEnd  (), 1, 7);

    }  

    /**
     * Method that runs when the clear button is pressed on
     * the the BasketBallGame GUI.
     */
    public void clear() {
        // Clears all of the text fields in the GUI.
        this.getTfName().clear();
        this.getTfPlace().clear();
        this.getTfDate().clear();
        this.getTfTime().clear();
        this.getTfAudience().clear();
        this.getTfLeague().clear();
        this.getTfTeam1().clear();
        this.getTfScore1().clear();
        this.getTfTeam2().clear();
        this.getTfScore2().clear();

        // removes the winner name label/textfield and weekend label/Hbox in the GUI.
        super.getChildren().remove(this.getLblWinnerName());
        super.getChildren().remove(this.getTfWinnerName());
        super.getChildren().remove(this.getLblWeekEnd());
        super.getChildren().remove(this.getHBoxWeekEnd());
    } 
} 