package OOPConcepts_Part2;

public class TestBankMain {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
		//USBank.min_bal=200; //not allowed coz its by default static and final in nature. so we can't change
		//new USBank(); //can't create object of interface
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.carLoan();
		hs.educationLoan();
		hs.transferMoney();
		hs.mutualFunds();
		HSBCBank.test1();
		USBank.test1();
		hs.test2();
				
		System.out.println("**********");
		//dynamic polymorphism: 
		//child class object can be referred by parent interface reference var
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		USBank.test1();
		b.test2();
		
		System.out.println("***********");
		
		BrazilBank bb=new HSBCBank();
		bb.mutualFunds();
		
	}
}