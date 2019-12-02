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
 * It functions as the Pane class class for Concert.
 */
public class ConcertPane extends GridPane {
    // Creates text field objects for the ArtEvent GUI.
    private final TextField tfName = new TextField();
    private final TextField tfPlace = new TextField();
    private final TextField tfDate = new TextField();
    private final TextField tfTime = new TextField();
    private final TextField tfAudience = new TextField();
    private final TextField tfType = new TextField();
    private final TextField tfPerformers = new TextField();
    private final TextField tfTemperature = new TextField();
    private final TextField tfWindSpeed = new TextField();
    private final TextField tfHumidity = new TextField();

    // Creates two RadioButton objects for yes and no answers.
    private final RadioButton rbSunnyYes = new RadioButton("Yes");
    private final RadioButton rbSunnyNo  = new RadioButton("No" );
    
    
    private final ToggleGroup sunnyGroup = new ToggleGroup(); // Creates a toggle for the user to determine if it's sunny.
    
    private final HBox hBoxSunny = new HBox(10, this.getRbSunnyYes(), this.getRbSunnyNo()); // Creates an HBox for the two radiobuttons for determining sunshine.

    private final Label lblWeekEnd = new Label("Weekend:");
    private final RadioButton rbWeekEndYes = new RadioButton("Yes");
    private final RadioButton rbWeekEndNo  = new RadioButton("No");
    private final HBox hBoxWeekEnd  = new HBox(10, this.getRbWeekEndYes(), this.getRbWeekEndNo());

    private final Label lblGoodWeather = new Label("Good Weather:");
    private final RadioButton rbGoodWeatherYes = new RadioButton("Yes");
    private final RadioButton rbGoodWeatherNo = new RadioButton("No");
    private final HBox hBoxGoodWeather = new HBox(10, this.getRbGoodWeatherYes(), this.getRbGoodWeatherNo());

    /**
     * Constructor for the class.
     */
    protected ConcertPane() {
        // Places all textfields in the respective positions in the GUI.
        this.getTfName().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfPlace().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfDate().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTime().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfAudience().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfType().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfPerformers().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTemperature().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfWindSpeed().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfHumidity().setAlignment(Pos.BOTTOM_RIGHT);

        this.getRbSunnyYes().setToggleGroup(this.getSunnyGroup());
        this.getRbSunnyNo().setToggleGroup(this.getSunnyGroup());

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
        super.add(this.getTfTime(), 3, 1);
        super.add(new Label("Audience:"), 0, 2); 
        super.add(this.getTfAudience(), 1, 2); 
        super.add(new Label("Type:"), 2, 2); 
        super.add(this.getTfType(), 3, 2);
        super.add(new Label("Performancers:"), 0, 3); 
        super.add(this.getTfPerformers(), 1, 3);
        super.add(new Label("Sunnny:"), 0, 4); 
        super.add(this.getHBoxSunny(), 1, 4); 
        super.add(new Label("Temperature:"), 2, 4); 
        super.add(this.getTfTemperature(), 3, 4);
        super.add(new Label("Wind Speed:"), 0, 5); 
        super.add(this.getTfWindSpeed (), 1, 5); 
        super.add(new Label("Humidity:"), 2, 5); 
        super.add(this.getTfHumidity(), 3, 5);
        super.add(btClear, 0, 6);                                          
        super.add(btSubmit, 2, 6);

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
     * Method that returns the event's 
     * performer names
     * @return the performer names.
     */
    public final TextField getTfPerformers() {
        return this.tfPerformers;
    }
    
    /**
     * Method that returns the event's temperature.
     * @return the event temperature.
     */
    public final TextField getTfTemperature() {
        return this.tfTemperature;
    }
    
    /**
     * Method that returns the event's wind speed.
     * @return the event wind speed.
     */
    public final TextField getTfWindSpeed() {
        return this.tfWindSpeed;
    }
    
    /**
     * Method that returns the event's humidity.
     * @return the event humidity.
     */
    public final TextField getTfHumidity() {
        return this.tfHumidity;
    }

    /**
     * Method that returns yes for the "yes" sunny button.
     * @return yes if the event is on a weekend.
     */
    public final RadioButton getRbSunnyYes() {
        return this.rbSunnyYes;
    }
    
    /**
     * Method that returns no for the "no" sunny button.
     * @return no if the event is on a weekend.
     */
    public final RadioButton getRbSunnyNo () {
        return this.rbSunnyNo;
    }

    /**
     * Method that returns the sunny toggle group.
     * @return sunny toggle group.
     */
    public final ToggleGroup getSunnyGroup() {
        return this.sunnyGroup;
    }

    /**
     * Method that returns the sunny element's HBox
     * @return sunny element's HBox.
     */
    public final HBox getHBoxSunny() {
        return this.hBoxSunny;
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
        return this.lblWeekEnd;
    }
    
    /**
     * Method that returns the weekend element's HBox
     * @return weekend element's HBox.
     */
    public HBox getHBoxWeekEnd() {
        return this.hBoxWeekEnd;
    }

    /**
     * Method that returns good weather for the event.
     * @return good weather.
     */
    public RadioButton getRbGoodWeatherYes() {
        return this.rbGoodWeatherYes;
    }
    
    /**
     * Method that returns not good weather for the event.
     * @return not good weather.
     */
    public RadioButton getRbGoodWeatherNo() {
        return this.rbGoodWeatherNo;
    }

    /**
     * Method the returns the good weather label.
     * @return the weekend label.
     */
    public Label getLblGoodWeather() {
        return this.lblGoodWeather;
    }
    
    /**
     * Method that returns the good weather element's HBox
     * @return good weather element's HBox.
     */
    public HBox  getHBoxGoodWeather() {
        return this.hBoxGoodWeather;
    }

    /**
     * Method that runs when the submit button is pressed on
     * the the Concert GUI.
     */
    public void submit() {
        Event event = new Event(); // Creates an Event object.
        
        // String variables that take the name, place, and type that
        // the user puts into their respective text fields.
        String name  = this.getTfName().getText().trim();
        String place = this.getTfPlace().getText().trim();
        String type  = this.getTfType().getText().trim();

        String[] performers  = {"\"" + this.getTfPerformers().getText().trim().replace(",", "\", \"") + "\""}; // String array that takes in all performers at the event.

        // Int variable that takes the converted string value that
        // the user placed in the audience text field.
        int audience = Integer.parseInt(this.getTfAudience().getText().trim()); // 

        // Weather variable that takens in all aspects of the weather that determin good or bad weather in.
        Weather weather = new Weather(this.getRbSunnyYes().isSelected(), Double.parseDouble(this.getTfTemperature().getText().trim()), Double.parseDouble(this.getTfWindSpeed().getText().trim()), Double.parseDouble(this.getTfHumidity().getText().trim()));

        Date dateTime = new Date(); // Sets the date time to the current date time.
        
        try {
            dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse(this.getTfDate().getText().trim() + " " + (this.getTfTime().getText().trim().isEmpty()? "00:00" : this.getTfTime().getText().trim()));
        } 
        catch (ParseException ex) {
        }

        
        try { 
            event = new Concert(name, place, dateTime, audience, performers, type, weather);
        } 
        catch (ParseException e) {
        }

        // Sets what happens in regards to being the weekend when
        // either "yes" or "no" are pressed.
        this.getRbWeekEndYes().setSelected(event.isWeekEnd());
        this.getRbWeekEndNo().setSelected(!event.isWeekEnd());

        // Sets what happens in regards to being good weather when
        // all apsects of the weather are taken in.
        this.getRbGoodWeatherYes().setSelected(((Concert)event).isGoodWeather());
        this.getRbGoodWeatherNo().setSelected(!((Concert)event).isGoodWeather());

        super.getChildren().remove(this.getLblWeekEnd());
        super.getChildren().remove(this.getHBoxWeekEnd());
        super.getChildren().remove(this.getLblGoodWeather());
        super.getChildren().remove(this.getHBoxGoodWeather());

        // Adds the weekend label/HBox and good weather label/HBox in the GUI.
        super.add(this.getLblWeekEnd(), 0, 7);
        super.add(this.getHBoxWeekEnd(), 1, 7);
        super.add(this.getLblGoodWeather(), 2, 7);
        super.add(this.getHBoxGoodWeather(), 3, 7);
    }      

    /**
     * Method that runs when the clear button is pressed on
     * the the Concert GUI.
     */
    public void clear() {
        // Clears all of the text fields in the GUI.
        this.getTfName       ().clear();
        this.getTfPlace      ().clear();
        this.getTfDate       ().clear();
        this.getTfTime       ().clear();
        this.getTfAudience   ().clear();
        this.getTfType       ().clear();
        this.getTfPerformers ().clear();
        this.getTfTemperature().clear();
        this.getTfWindSpeed  ().clear();
        this.getTfHumidity   ().clear();

        // Clears selected buttons for sunniness.
        this.getRbSunnyYes().setSelected(false);
        this.getRbSunnyNo().setSelected(false);

        // removes the winner name label/textfield and weekend label/Hbox in the GUI.
        super.getChildren().remove(this.getLblWeekEnd());
        super.getChildren().remove(this.getHBoxWeekEnd());
        super.getChildren().remove(this.getLblGoodWeather());
        super.getChildren().remove(this.getHBoxGoodWeather());
    }  
}