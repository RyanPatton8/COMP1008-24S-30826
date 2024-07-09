package assignment2;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Bank {

	private String bankName = "Money Thieves Inc";
	private BranchLocations branchLocation = BranchLocations.TORONTO;
	private ArrayList<Account> accounts = new ArrayList<Account>();

	public static enum BranchLocations {TORONTO, OTTAWA, BARRIE, FLORIDA, ATLANTIS};
	
	public Bank() {}

	public Bank(String bankName, String branchLocation) {
		setBankName(bankName);
		setBranchLocation(branchLocation);
	}

	public Bank(String bankName, BranchLocations branchLocation) {
		setBankName(bankName);
		setBranchLocation(branchLocation);
	}

	public String getBankName() {
		return bankName;
	}

	public boolean setBankName(String bankName) {
		if (validateBankName(bankName))
		{
			this.bankName = bankName;
			return true;
		}
		return false;
	}

	private boolean validateBankName(String bankName) {
		//same logic as account name validation but with the use of some regex
		if (bankName.length() < 8) {
			return false;
		}
		int spaceCount = 0;

		Pattern bankNamePattern = Pattern.compile("[A-Z0-9&]");

		for(char letter : bankName.toUpperCase().toCharArray()) {

			Matcher matcher = bankNamePattern.matcher(String.valueOf(letter));

			if (matcher.matches()) {
				continue;
			} else if (letter == ' ') {
				spaceCount++;
			} else {
				return false;
			}

			if (spaceCount > 1) {
				return false;
			}
		}
		return true;
	}

	public boolean setBranchLocation(String branchLocation) {
		if(validateBranchLocation(branchLocation)){
			this.branchLocation = BranchLocations.valueOf(branchLocation.toUpperCase());
			return true;
		}
		return false;
	}

	public String getBranchLocation() {
		return branchLocation.toString();
	}
			
	public boolean setBranchLocation(BranchLocations branchLocation) {
		if(validateBranchLocation(branchLocation)){
			this.branchLocation = branchLocation;
			return true;
		}
		return false;
	}

	private boolean validateBranchLocation(String branchLocation) {
		for (BranchLocations location : BranchLocations.values()) {
			if (location.name().equalsIgnoreCase(branchLocation)) {
				return true;
			}
		}
		return false;
	}

	private boolean validateBranchLocation(BranchLocations branchLocation) {
		for (BranchLocations location : BranchLocations.values()) {
			if (location == branchLocation) {
				return true;
			}
		}
		return false;
	}


	public Account getAccountByNumber(int accountNumber) {
		return new Account();
	}
	
	public boolean addAccount(Account account) {
		return false;
	}
	public boolean addAccount(String accountName, int accountNumber, double accountBalance) {
		return false;
	}
	public Account viewAccount(int accountNumber) {
		return new Account();
	}

	public Account viewAccount(byte index) {
		return new Account();
	}

	public boolean modifyAccount(int accountNumber, String accountName) {
		return false;
	}

	public boolean modifyAccount(int accountNumber, double accountBalance) {
		return false;
	}

	public boolean modifyAccount(int accountNumber, String accountName, double accountBalance) {
		return false;
	}

	public boolean modifyAccount(byte index, String accountName) {
		return false;
	}

	public boolean modifyAccount(byte index, double accountBalance) {
		return false;
	}

	public boolean modifyAccount(byte index, String accountName, double accountBalance) {
		return false;
	}

	public boolean deleteAccount(int accountNumber) {
		return false;
	}

	public boolean deleteAccount(byte index) {
		return false;
	}
	
	
}
