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
	protected boolean validateAccountName(String accountName) {
		//if less than 4 characters, has more than one space or single quote,
		//or has any character besides the listed that isn't a letter deem it invalid
		if (accountName.length() < 4) {
			return false;
		}
		int singleQuoteCount = 0;
		int spaceCount = 0;

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
	protected boolean validateAccountNumber(int accountNumber) {
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
	protected boolean validateAccountBalance(double accountBalance) {
		sb.append(accountBalance);
		Pattern accountBalancePattern = Pattern.compile("^-?\\d+.?\\d{0,2}$");
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
		if( obj instanceof Account){

			Account compare = (Account) obj;

			return this.accountName.equals(compare.accountName) && this.accountNumber == compare.accountNumber
					&& this.accountBalance == compare.accountBalance;
		}
		else{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Account Name: " + accountName +
				"\nAccount Number: " + accountNumber +
				"\nAccount Balance: " + accountBalance;
	}
	
}
