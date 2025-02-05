
public class Invoice {
	private int invid;
	private Customer Customer;
	private double amount;
	
	Invoice(int id,Customer Customer,double amount) {
		this.invid = id;
		this.Customer = Customer;
		this.amount = amount;
	}
	
	public int getInvoiceID() {
		return this.invid;
	}
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setCustomer (Customer Customer) {
		this.Customer = Customer;
	}
	
	public Customer getCustomer() {
		return this.Customer;
	}
	
	public int getCustomerID() {
		return this.getCustomer().getID();
	}
	
	public String getCustomerName() {
		return this.getCustomer().getName();
	}
	
	public int getCustomerDiscount() {
		return this.getCustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return this.getAmount() - (this.getAmount()* this.getCustomerDiscount()/100);
	}
	
	public String toString() {
		return"Invoice[id= "+ this.getInvoiceID()+
				",customer="+ Customer.toString() +
				",amount=" + this.getAmountAfterDiscount()+"]";
		
		
	}

}
