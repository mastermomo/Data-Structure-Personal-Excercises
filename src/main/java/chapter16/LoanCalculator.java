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
 * @author Mohammad Khan This class serves as a HW exercise for chapter 15 for
 * my CSC 202 class. The program takes in inputs for Investment Amount, Number
 * of Years, and Annual Interest Rate from the user. It then calculates the
 * Future value.
 */
public class LoanCalculator extends Application {
    // Creates textfield objects for the user to put in their inputs.

    private TextField tfAnnualIntRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btnCalculate = new Button("calculate");

    @Override
    public void start(Stage primaryStage) {
        //create gui
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

        //set properties for the ui
        gridPane.setAlignment(Pos.CENTER);
        tfAnnualIntRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(btnCalculate, HPos.RIGHT);

        //process the event using lamda event
        btnCalculate.setOnAction(e -> {
            calculateLoanPayment();
        });

        //create a scene and place it inthe stage
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Loan calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculateLoanPayment() {
        //get the values from the textFields
        double interest = Double.parseDouble(tfAnnualIntRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        //create a loan object
        Loan loan = new Loan(interest, year, loanAmount);
        //display monthly payment and total
        tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }

}

