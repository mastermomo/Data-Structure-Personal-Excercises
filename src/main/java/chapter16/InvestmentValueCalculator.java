package chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Mohammad Khan
 * This class serves as a HW exercise for chapter 15 for my CSC 202 class.
 * The program takes in inputs for Investment Amount, Number of Years, and 
 * Annual Interest Rate from the user. It then calculates the Future value.
 */
public class InvestmentValueCalculator extends Application{
        // Creates textfield objects for the user to put in their inputs.
        private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
	private Button btCalculate = new Button("Calculate");

	/**
        * Overrides the start method in order 
        * to form the GUI for this program.
        * @param primaryStage stages the the window and it's elements to the user.
        * @Override
        */
	public void start(Stage primaryStage) {
		// Forms the UI for the program.
		GridPane pane = new GridPane();
		pane.setVgap(5);
		pane.setHgap(5);
		pane.add(new Label("Investment Amount:"), 0, 0);
		pane.add(tfInvestmentAmount, 1, 0);
		pane.add(new Label("Number of Years:"), 0, 1);
		pane.add(tfNumberOfYears, 1, 1);
		pane.add(new Label("Annual Interest Rate:"), 0, 2);
		pane.add(tfAnnualInterestRate, 1, 2);
		pane.add(new Label("Future value:"), 0, 3);
		pane.add(tfFutureValue, 1, 3);
		pane.add(btCalculate, 1, 4);

		// Provides the positions that the UI elements
                // will hold when the program runs.
		pane.setAlignment(Pos.CENTER);
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setEditable(false);
		pane.setHalignment(btCalculate, HPos.RIGHT);
		pane.setPadding(new Insets(10, 10, 10, 10));

		// Calculates the future value when the "Calulate"
                // button is pressed.
		btCalculate.setOnAction(e -> futureValue());

		
		Scene scene = new Scene(pane, 600, 600); // Sets the scene of the GUI to be displayed to the user.
		primaryStage.setTitle("InvestmentValueCalculator"); // Sets the title of the window.
		primaryStage.setScene(scene); // Sets the scene of the GUI to be displayed to the user.
		primaryStage.show(); // Shows the user the GUI.
	}

        // Method that calculates the future value.
	private void futureValue() {
		double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
		int years = Integer.parseInt(tfNumberOfYears.getText());
		double monthlyInterestRate = 
			Double.parseDouble(tfAnnualInterestRate.getText()) / 1200;
		tfFutureValue.setText(String.format("$%.2f", 
			(investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12))));
	}
        
        /**
        * Main method for program execution.
        */
        public static void main(String[] args) {
            Application.launch(args);
        }
}

