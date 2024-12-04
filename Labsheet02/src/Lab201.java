import javax.swing.*;
import java.text.*;
public class Lab201 {
	
	public static void main(String[] args) {
		final int BUFFET = 299;
		int isMember ;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = BUFFET * numberofCustomer;
		
		
		do {
			 isMember = JOptionPane.showConfirmDialog(null, "Total price is "+frm.format(totalPrice) + " baht."+
					"Do you have a member card?");
		}while(isMember==JOptionPane.CANCEL_OPTION);
		
		if(isMember==JOptionPane.YES_OPTION) { //if(isMember==0)
			double priceAfterDiscount = totalPrice *0.90 ;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+priceAfterDiscount +" baht. ");
			
		}else if(isMember==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+totalPrice +" baht. ");
			
		}
	}

}
