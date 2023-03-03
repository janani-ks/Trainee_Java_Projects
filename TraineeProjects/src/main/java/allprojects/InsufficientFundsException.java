package allprojects;

public class InsufficientFundsException extends Exception {
	   final private double amount; 
	   public InsufficientFundsException(double amount) {
	      this.amount = amount;
	   }
	   
	   public double getAmount() {
	      return amount;
	   }
}
