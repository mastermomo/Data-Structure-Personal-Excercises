package project4;

import java.lang.String;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestEventGUI extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        String[] titles = {"Soccer Game", "Basketball Game", "Concert", "Orchestra", "Art Event", "Statistics", "Close"};
        Pane[] displayPanes = {new SoccerGamePane(), new BasketBallGamePane(), new ConcertPane(), new OrchestraPane(), new ArtEventPane(), new StatisticsPane()};

        ObservableList<String> items = FXCollections.observableArrayList(titles);
        ListView<String> listView = new ListView<>(items);

        listView.setPrefSize(150, 400);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        Pane pane = new Pane();
        pane.getChildren().add(displayPanes[0]);
        pane.setPadding(new Insets(5, 5, 5, 5));

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(new ScrollPane(listView));
        borderPane.setCenter(pane);

        listView.getSelectionModel().selectedItemProperty().addListener(ov -> {
            for (int i : listView.getSelectionModel().getSelectedIndices()) {
                if (i == displayPanes.length) {
                    primaryStage.close();
                } else {
                    pane.getChildren().clear();
                    pane.getChildren().add(displayPanes[i]);
                }
            }
        }); 

        Scene scene = new Scene(borderPane, 1050, 830);
        primaryStage.setScene(scene);           
        primaryStage.setTitle("TestEventGUI");  
        primaryStage.show();                  
    } 
}  
