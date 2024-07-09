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
		for(Account account : accounts) {
			if (account.getAccountNumber() == accountNumber){
				return account;
			}
		}
		return new Account();
	}
	
	public boolean addAccount(Account account) {
		if (validateAccount(account)) {
			accounts.add(account);
			return true;
		}
		return false;
	}

	private boolean validateAccount(Account account) {
		for(Account newAccount : accounts){
			if (newAccount.getAccountNumber() == account.getAccountNumber()){
				return false;
			}
		}
		return true;
	}

	public boolean addAccount(String accountName, int accountNumber, double accountBalance) {
		for(Account newAccount : accounts){
			if (newAccount.getAccountNumber() == accountNumber){
				return false;
			}
		}
		accounts.add(new Account(accountName, accountNumber, accountBalance));
		return true;
	}
	public Account viewAccount(int accountNumber) {
		for(Account account : accounts) {
			if (account.getAccountNumber() == accountNumber){
				return account;
			}
		}
		return new Account();
	}

	public Account viewAccount(byte index) {
//		I think this would be cleaner but im going to follow your guide-lines of looping through each index
//		try{
//			return accounts.get(index);
//		}
//		catch(IndexOutOfBoundsException e){
//			return new Account();
//		}
		for (int i = 0; i < accounts.size(); i++) {
			if (i == index){
				return accounts.get(i);
			}
		}
		return new Account();
	}

	public boolean modifyAccount(int accountNumber, String accountName) {
		for(Account account : accounts) {
			if (account.getAccountNumber() == accountNumber && account.validateAccountName(accountName)){
				account.setAccountName(accountName);
				return true;
			}
			else if (account.getAccountNumber() == accountNumber && !account.validateAccountName(accountName)){
				break;
			}
		}
		return false;
	}

	public boolean modifyAccount(int accountNumber, double accountBalance) {
		for(Account account : accounts) {
			if (account.getAccountNumber() == accountNumber && account.validateAccountBalance(accountBalance)){
				account.setAccountBalance(accountBalance);
				return true;
			}
			else if (account.getAccountNumber() == accountNumber && !account.validateAccountBalance(accountBalance)){
				break;
			}
		}
		return false;
	}

	public boolean modifyAccount(int accountNumber, String accountName, double accountBalance) {
		for(Account account : accounts) {
			if (account.getAccountNumber() == accountNumber && account.validateAccountName(accountName) && account.validateAccountBalance(accountBalance)){
				account.setAccountName(accountName);
				account.setAccountBalance(accountBalance);
				return true;
			}
			else if (account.getAccountNumber() == accountNumber){
				break;
			}
		}
		return false;
	}

	public boolean modifyAccount(byte index, String accountName) {
		for (int i = 0; i < accounts.size(); i++) {
			if (i == index && accounts.get(index).validateAccountName(accountName)){
				accounts.get(index).setAccountName(accountName);
				return true;
			}
			else if (i == index){
				break;
			}
		}
		return false;
	}

	public boolean modifyAccount(byte index, double accountBalance) {
		for (int i = 0; i < accounts.size(); i++) {
			if (i == index && accounts.get(index).validateAccountBalance(accountBalance)){
				accounts.get(index).setAccountBalance(accountBalance);
				return true;
			}
			else if (i == index){
				break;
			}
		}
		return false;
	}

	public boolean modifyAccount(byte index, String accountName, double accountBalance) {
		for (int i = 0; i < accounts.size(); i++) {
			if (i == index && accounts.get(index).validateAccountName(accountName) && accounts.get(index).validateAccountBalance(accountBalance)){
				accounts.get(index).setAccountName(accountName);
				accounts.get(index).setAccountBalance(accountBalance);
				return true;
			}
			else if (i == index){
				break;
			}
		}
		return false;
	}

	public boolean deleteAccount(int accountNumber) {
		for(Account ac : accounts){
			if (ac.getAccountNumber() == accountNumber){
				accounts.remove(ac);
				return true;
			}
		}
		return false;
	}

	public boolean deleteAccount(byte index) {
		for (int i = 0; i < accounts.size(); i++) {
			if (i == index) {
				accounts.remove(i);
				return true;
			}
		}
		return false;
	}
}
