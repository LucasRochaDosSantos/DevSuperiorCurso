package DVsuperiorAccount.application;

import java.util.Locale;

import DVsuperiorAccount.entities.Account;
import DVsuperiorAccount.entities.BusinessAccount;
import DVsuperiorAccount.entities.SavingsAccount;
/** 
 * @author Lucas Rocha
 * Since 01/2022
 * */

public class Program {
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Account accountOne = new SavingsAccount(1001, "LUCAS ROCHA", 2500.00, 0.1);
		BusinessAccount accountTwo = new BusinessAccount(1002, "SILVER LTDA", 30000.00, 15000.00);
        SavingsAccount accountThree = new SavingsAccount(1003, "JOAQUIM", 5000.00, 0.01);
        
        //UPCASTING
        
        Account accountFour = accountTwo;
        Account accountFive = accountThree;
        
       
        if(accountFive instanceof BusinessAccount){
        	BusinessAccount accountSeven = (BusinessAccount) accountFive;
        	System.out.println(accountSeven);
        }   
        System.out.println(accountOne);
        System.out.println(accountFour);
        System.out.println(accountFive);
	}
}
