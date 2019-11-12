/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter16;

/**
 *
 * @author eleme
 */
public class Loan {
        // Private instance variables for loan aspects.
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** 
         * Default constructor for Loan.
         */
	public Loan() {
		this(2.5, 1, 1000);
	}

        /**
         * Construct a loan with specified annual interest rate, 
	 * number of years, and loan amount.
         * @param annualInterestRate rate for yearly interest.
         * @param numberOfYears the number years involved.
         * @param loanAmount the loan to be given.
         */
	public Loan(double annualInterestRate, int numberOfYears,
		double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

        /**
         * Returns the annual interest rate.
         * @return double for yearly interest rate
         */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

        /**
         * Sets the annual interest rate.
         * @param annualInterestRate represents the interest rate for the year.
         */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
         * Returns the number of years to be used.
         * @return integer for years.
         */
	public int getNumberOfYears() {
		return numberOfYears;
	}
        
        /**
         * Sets the number of years to be used.
         * @param numberOfYears integer for years.
         */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

        /**
         * Gets the loan amount to be given.
         * @return loans in double.
         */
        public double getLoanAmount() {
		return loanAmount;
	}

	/**
         * Sets the loan amount to be given.
         * @param loanAmount loan for the user.
         */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	} 

	/**
         * Gets the monthly amount to be paid for the loans.
         * @return monthly payment in double.
         */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/**
         * Gets the total payment amount.
         * @return the total amount to be paid.
         */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
    }