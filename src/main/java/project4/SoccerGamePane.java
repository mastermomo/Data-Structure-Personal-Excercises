package project4;

import java.lang.*;
import java.text.*;
import java.util.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class SoccerGamePane extends GridPane {

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
    private final TextField tfTemperature = new TextField();
    private final TextField tfWindSpeed = new TextField();
    private final TextField tfHumidity = new TextField();

    private final Label lblWinnerName = new Label("Winner:");
    private final TextField tfWinnerName = new TextField();

    private final RadioButton rbSunnyYes = new RadioButton("Yes");
    private final RadioButton rbSunnyNo = new RadioButton("No");
    
    private final ToggleGroup sunnyGroup = new ToggleGroup();
    private final HBox hBoxSunny = new HBox(10, this.getRbSunnyYes(), this.getRbSunnyNo());

    private final Label lblWeekEnd = new Label("Weekend:");
    private final RadioButton rbWeekEndYes = new RadioButton("Yes");
    private final RadioButton rbWeekEndNo = new RadioButton("No");
    private final HBox hBoxWeekEnd = new HBox(10, this.getRbWeekEndYes(), this.getRbWeekEndNo());

    private final Label lblGoodWeather = new Label("Good Weather:");
    private final RadioButton rbGoodWeatherYes = new RadioButton("Yes");
    private final RadioButton rbGoodWeatherNo = new RadioButton("No");
    private final HBox hBoxGoodWeather = new HBox(10, this.getRbGoodWeatherYes(), this.getRbGoodWeatherNo());

    protected SoccerGamePane() {

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
        this.getTfTemperature().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfWindSpeed().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfHumidity().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfWinnerName().setAlignment(Pos.BOTTOM_RIGHT);

        this.getTfWinnerName().setEditable(false);

        this.getRbSunnyYes().setToggleGroup(this.getSunnyGroup());
        this.getRbSunnyNo().setToggleGroup(this.getSunnyGroup());

        Button btSubmit = new Button("Submit");
        Button btClear = new Button("Clear");

        btSubmit.setOnAction(e -> this.submit());
        btClear.setOnAction(e -> this.clear());

        GridPane.setHalignment(btClear, HPos.LEFT);
        GridPane.setHalignment(btSubmit, HPos.LEFT);

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
        super.add(new Label("League:"), 2, 2);
        super.add(this.getTfLeague(), 3, 2);
        super.add(new Label("Team 1:"), 0, 3);
        super.add(this.getTfTeam1(), 1, 3);
        super.add(new Label("Score 1:"), 2, 3);
        super.add(this.getTfScore1(), 3, 3);
        super.add(new Label("Team 2:"), 0, 4);
        super.add(this.getTfTeam2(), 1, 4);
        super.add(new Label("Score 2:"), 2, 4);
        super.add(this.getTfScore2(), 3, 4);
        super.add(new Label("Sunnny:"), 0, 5);
        super.add(this.getHBoxSunny(), 1, 5);
        super.add(new Label("Temperature:"), 2, 5);
        super.add(this.getTfTemperature(), 3, 5);
        super.add(new Label("Wind Speed:"), 0, 6);
        super.add(this.getTfWindSpeed(), 1, 6);
        super.add(new Label("Humidity:"), 2, 6);
        super.add(this.getTfHumidity(), 3, 6);
        super.add(btClear, 0, 7);
        super.add(btSubmit, 2, 7);

        super.setHgap(5);
        super.setVgap(5);
        super.setAlignment(Pos.CENTER);
        super.setPadding(new Insets(5, 5, 5, 5));

    }  

    public final TextField getTfName() {
        return this.tfName;
    }

    public final TextField getTfPlace() {
        return this.tfPlace;
    }

    public final TextField getTfDate() {
        return this.tfDate;
    }

    public final TextField getTfTime() {
        return this.tfTime;
    }

    public final TextField getTfAudience() {
        return this.tfAudience;
    }

    public final TextField getTfLeague() {
        return this.tfLeague;
    }

    public final TextField getTfTeam1() {
        return this.tfTeam1;
    }

    public final TextField getTfScore1() {
        return this.tfScore1;
    }

    public final TextField getTfTeam2() {
        return this.tfTeam2;
    }

    public final TextField getTfScore2() {
        return this.tfScore2;
    }

    public final TextField getTfTemperature() {
        return this.tfTemperature;
    }

    public final TextField getTfWindSpeed() {
        return this.tfWindSpeed;
    }

    public final TextField getTfHumidity() {
        return this.tfHumidity;
    }

    public Label getLblWinnerName() {
        return this.lblWinnerName;
    }

    public final TextField getTfWinnerName() {
        return this.tfWinnerName;
    }

    public final RadioButton getRbSunnyYes() {
        return this.rbSunnyYes;
    }

    public final RadioButton getRbSunnyNo() {
        return this.rbSunnyNo;
    }

    public final ToggleGroup getSunnyGroup() {
        return this.sunnyGroup;
    }

    public final HBox getHBoxSunny() {
        return this.hBoxSunny;
    }

    public RadioButton getRbWeekEndYes() {
        return this.rbWeekEndYes;
    }

    public RadioButton getRbWeekEndNo() {
        return this.rbWeekEndNo;
    }

    public Label getLblWeekEnd() {
        return this.lblWeekEnd;
    }

    public HBox getHBoxWeekEnd() {
        return this.hBoxWeekEnd;
    }

    public RadioButton getRbGoodWeatherYes() {
        return this.rbGoodWeatherYes;
    }

    public RadioButton getRbGoodWeatherNo() {
        return this.rbGoodWeatherNo;
    }

    public Label getLblGoodWeather() {
        return this.lblGoodWeather;
    }

    public HBox getHBoxGoodWeather() {
        return this.hBoxGoodWeather;
    }

    public void submit() {
        Event event = new Event();
        
        String name = this.getTfName().getText().trim();
        String place = this.getTfPlace().getText().trim();
        String league = this.getTfLeague().getText().trim();

        String[] teams = {this.getTfTeam1().getText().trim(), this.getTfTeam2().getText().trim()};
        int[] scores = {Integer.parseInt(this.getTfScore1().getText().trim()), Integer.parseInt(this.getTfScore2().getText().trim())};

        int audience = Integer.parseInt(this.getTfAudience().getText().trim());

        Weather weather = new Weather(this.getRbSunnyYes().isSelected(), Double.parseDouble(this.getTfTemperature().getText().trim()), Double.parseDouble(this.getTfWindSpeed().getText().trim()), Double.parseDouble(this.getTfHumidity().getText().trim()));

        Date dateTime = new Date();  
        
        try {
            dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse(this.getTfDate().getText().trim() + " " + (this.getTfTime().getText().trim().isEmpty() ? "00:00" : this.getTfTime().getText().trim()));
        } 
        catch (ParseException ex) {
        }

        
        try {
            event = new SoccerGame(name, place, dateTime, audience, teams, scores, league, weather);
        } 
        catch (ParseException ex) {
        }

        this.getTfWinnerName().setText(((SportEvent) event).getWinnerName());

        this.getRbWeekEndYes().setSelected(event.isWeekEnd());
        this.getRbWeekEndNo().setSelected(!event.isWeekEnd());

        this.getRbGoodWeatherYes().setSelected(((SoccerGame) event).isGoodWeather());
        this.getRbGoodWeatherNo().setSelected(!((SoccerGame) event).isGoodWeather());

        super.getChildren().remove(this.getLblWinnerName());
        super.getChildren().remove(this.getTfWinnerName());
        super.getChildren().remove(this.getLblWeekEnd());
        super.getChildren().remove(this.getHBoxWeekEnd());
        super.getChildren().remove(this.getLblGoodWeather());
        super.getChildren().remove(this.getHBoxGoodWeather());

        super.add(this.getLblWinnerName(), 0, 8);
        super.add(this.getTfWinnerName(), 1, 8);
        super.add(this.getLblWeekEnd(), 0, 9);
        super.add(this.getHBoxWeekEnd(), 1, 9);
        super.add(this.getLblGoodWeather(), 2, 9);
        super.add(this.getHBoxGoodWeather(), 3, 9);
    }  

    public void clear() {

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
        this.getTfTemperature().clear();
        this.getTfWindSpeed().clear();
        this.getTfHumidity().clear();

        this.getRbSunnyYes().setSelected(false);
        this.getRbSunnyNo().setSelected(false);

        super.getChildren().remove(this.getLblWinnerName());
        super.getChildren().remove(this.getTfWinnerName());
        super.getChildren().remove(this.getLblWeekEnd());
        super.getChildren().remove(this.getHBoxWeekEnd());
        super.getChildren().remove(this.getLblGoodWeather());
        super.getChildren().remove(this.getHBoxGoodWeather());
    } 
} 
