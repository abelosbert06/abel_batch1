void main(){
	Bank sbi = new Bank(30.0);
	
	try{
		sbi.deposit(-1.000);
		sbi.withdraw(100.0);
	} catch(Exception e){
		IO.println(e.getMessage());
	}

}

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String message){
		super(message);
	}
}

class Bank {
	private double balance;
	
	Bank(double balance){
		this.balance = balance;
	}

	void deposit(double amount) throws InsufficientBalanceException{
		if(amount > 0){
			balance+= amount;
		} else if (amount <= 0){
			throw new InsufficientBalanceException("amount can't be 0 or negative");
		}
	}

	void withdraw(double amount) throws InsufficientBalanceException{
		if(amount <= balance){
			balance -= amount;
			IO.println("amount withdrawn");
		} else if (amount > balance) {
			throw new InsufficientBalanceException("not enough");
		}
	}
}
