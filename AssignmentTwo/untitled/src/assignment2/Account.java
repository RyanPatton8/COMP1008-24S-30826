package assignment2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Account {

	private int accountNumber = 11111;
	private double accountBalance = 0;
	private String accountName = "New Account";

	StringBuilder sb = new StringBuilder();

	public Account() {}

	public Account(String accountName, int accountNumber, double accountBalance) {
		setAccountName(accountName);
		setAccountNumber(accountNumber);
		setAccountBalance(accountBalance);
	}

	public String getAccountName() {
		return accountName;
	}
	public boolean setAccountName(String accountName) {

		if (validateAccountName(accountName))
		{
			this.accountName = accountName;
			return true;
		}
		return false;
	}
	private boolean validateAccountName(String accountName) {
		if (accountName.length() < 4){
			return false;
		}
		/*id love if you could show us in a lecture how to do this with
		regex I tried for hours, but I couldn't figure out how to allow
		the user to place a single quote or space where ever inside the
		string in what ever order they'd like*/
		int singleQuoteCount = 0;
		int spaceCount = 0;

		//so I did this variation on what you showed us with the person class that counts the single quotes and spaces
		for(char letter : accountName.toUpperCase().toCharArray()) {
			if (letter >= 'A' && letter <= 'Z' || letter == '-'){continue;}
			else if (letter == ' '){spaceCount++;}
			else if (letter == '\''){singleQuoteCount++;}
			else{
				return false;
			}
			if(spaceCount > 1 || singleQuoteCount > 1) {return false;}
		}

		return true;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public boolean setAccountNumber(int accountNumber) {
		if (validateAccountNumber(accountNumber)){
			this.accountNumber = accountNumber;
			return true;
		}
		return false;
	}
	private boolean validateAccountNumber(int accountNumber) {
		sb.append(accountNumber);
		Pattern accountNumberPattern = Pattern.compile("^\\d{5,9}$");
		Matcher matcher = accountNumberPattern.matcher(sb.toString());
		if (matcher.matches()) {
			sb.setLength(0);
			return true;
		}
		sb.setLength(0);
		return false;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	public boolean setAccountBalance(double value) {
		if (validateAccountBalance(value)){
			this.accountBalance = value;
			return true;
		}
		return false;
	}
	private boolean validateAccountBalance(double accountBalance) {
		sb.append(accountBalance);
		Pattern accountBalancePattern = Pattern.compile("^-*\\d+.?\\d{0,2}$");
		Matcher matcher = accountBalancePattern.matcher(sb.toString());
		if (matcher.matches()) {
			sb.setLength(0);
			return true;
		}
		sb.setLength(0);
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}
	@Override
	public String toString() {
		return "Account Name: " + accountName +
				"\nAccount Number: " + accountNumber +
				"\nAccount Balance: " + accountBalance;
	}
	
}
