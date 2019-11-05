package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author eleme
 */
public class CalculatorGUI extends Application {
    private String[] titles = {"Loan Calculator", "Investment Value Calculator", "Close"};
    private BorderPane[] displayPanes = {new InvestmentValueCalculatorPane()};
    
    @Override
    public void start(Stage stage) throws Exception {
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
