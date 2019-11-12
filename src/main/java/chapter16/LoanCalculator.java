package chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author Mohammad Khan This class serves as a HW exercise for chapter 16 for
 * my CSC 202 class. The program takes in inputs for Annual interest rate, Number 
 * of years, and Loan Amount. It then calculates the Monthly Payment and Total Payment.
 */
public class LoanCalculator extends Application {
    // Creates textfield objects for the user to put in their inputs.

    private TextField tfAnnualIntRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btnCalculate = new Button("calculate");

    /**
     * Overrides the start method in order 
     * to form the GUI for this program.
     * @param primaryStage stages the the window and it's elements to the user.
     */
    @Override
    public void start(Stage primaryStage) {
        // Forms the UI for the program.
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Annual Interest rate:"), 0, 0);
        gridPane.add(tfAnnualIntRate, 1, 0);
        gridPane.add(new Label("Number of years:"), 0, 1);
        gridPane.add(tfNumberOfYears, 1, 1);
        gridPane.add(new Label("Loan Amount"), 0, 2);
        gridPane.add(tfLoanAmount, 1, 2);
        gridPane.add(new Label("Monthly Payment"), 0, 3);
        gridPane.add(tfMonthlyPayment, 1, 3);
        gridPane.add(new Label("Total Payment"), 0, 4);
        gridPane.add(tfTotalPayment, 1, 4);
        gridPane.add(btnCalculate, 1, 5);

        // Provides the positions that the UI elements
        // will hold when the program runs.
        gridPane.setAlignment(Pos.CENTER);
        tfAnnualIntRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(btnCalculate, HPos.RIGHT);

        // Calculates the Monthly and Total 
        // payment when the "Calulate"
        // button is pressed.
        btnCalculate.setOnAction(e -> {
            calculateLoanPayment();
        });

        Scene scene = new Scene(gridPane, 600, 600); // Sets the scene of the GUI to be displayed to the user.
	primaryStage.setTitle("Loan Calculator"); // Sets the title of the window.
	primaryStage.setScene(scene); // Sets the scene of the GUI to be displayed to the user.
	primaryStage.show(); // Shows the user the GUI.
    }

    private void calculateLoanPayment() {
        //Takes in the values from the textFields
        double interest = Double.parseDouble(tfAnnualIntRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        
        Loan loan = new Loan(interest, year, loanAmount); //create a Loan object from the made Loan class.
        
        // Shows the Monthly and Total payment to the user when the "Calculate button is pressed.
        tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));

    }

    /**
     * Main method for program execution.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

