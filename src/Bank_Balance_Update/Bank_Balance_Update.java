/*10. Bank Account Balance Update
Task:
 Create a BankAccount class with fields: accountHolderName and balance.
 In the main method:
Create a BankAccount object.
Deposit an amount into the account and print the updated balance.
*/

package Bank_Balance_Update;

import java.util.*;
public class Bank_Balance_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		
		Bank_Account b[] = new Bank_Account[size];
		
		int Id = 0, Balance = 0;
		String Name = " ";
		
		for(int i = 0; i < b.length; i++)
		{
			b[i] = new Bank_Account();
			
			System.out.println("Enter the Account Holder Name: ");
			Name = sc.next();
			
			System.out.println("Enter the Initial Amount in Account: ");
			Balance = sc.nextInt();
			
			b[i].setAccHolderName(Name);
			b[i].setiniAmount(Balance);
			
		}
		
		System.out.printf("%-5s %-15s %-10s \n", "Id", "Holder Name", "Amount");

		
		for(int i = 0; i < b.length; i++)
		{
			System.out.printf("%-5s %-15s %-10s\n", 
					b[i].getId(), 
					b[i].getAccHolderName(), 
					b[i].getiniAmount());
			
			System.out.println("Enter the deposit amount for Account " + b[i].getId() + ": ");
			int depositeAmt = sc.nextInt();
			
			int updateAmount = b[i].getiniAmount() + depositeAmt;
			System.out.println("Updated Amount in Bank Balance: "+ updateAmount);
		}
	}

}
