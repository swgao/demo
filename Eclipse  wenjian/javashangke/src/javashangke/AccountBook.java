package javashangke;

public class AccountBook {
	private String accountName;
	private double income;
	private double outcome;
	public AccountBook(String accountName, double income, double outcome) {
		this.accountName = accountName;
		this.income = income;
		this.outcome = outcome;
	}
	 void panduan() {
		 if(income>0) {
			 this.income=income;
		 }else
	  		  System.out.println("收入不为负数！");
		 if(outcome>0) {
			 this.outcome=outcome;
		 }else
			 System.out.println("支出不为负数！");
	}

	public void compute() {
		System.out.println("余额为="+(income-outcome));
	}
}
