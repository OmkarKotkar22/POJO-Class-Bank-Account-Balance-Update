package Bank_Balance_Update;

public class Bank_Account {
	private static int counter = 0;
	private int id;
	private String AccHolderName;
	private int iniAmount;
	
	public Bank_Account()
	{
		counter++;
		id = counter;
	}
	public int getId()
	{
		return id;
	}
	
	public void setAccHolderName(String n)
	{
		AccHolderName = n;
	}
	public String getAccHolderName()
	{
		return AccHolderName;
	}
	
	public void setiniAmount(int amt) 
	{
		iniAmount = amt;
	}
	public int getiniAmount() 
	{
		return iniAmount;
	}
}
