package HomeWork;

import java.util.Scanner;

public class HomeWork_051 {
	public static void main(String[] args) {
		
		int numOfPeopleSplit=0; 
		double totalBill, totalBillandTip, amountPerPerson=0;
		double totalTip= 0;
		double totalTipPerPerson = 0;
		String splitYesNo, serviceQuality;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("HOW MUCH IS THE BILL?");
		totalBill = scan.nextDouble();
		//System.out.println("Total Bill is: " + totalBill);
		
		
		System.out.println("WILL YOU SPILT THE BILL ? YES or NO");
		splitYesNo = scan.next();
		if (splitYesNo.equalsIgnoreCase("NO")) {numOfPeopleSplit=1;}
		if (splitYesNo.equalsIgnoreCase("YES")) {
			System.out.println("HOW MANY OF YOU SPLIT THE BILL? ");
			numOfPeopleSplit = scan.nextInt();
			if (numOfPeopleSplit>10){numOfPeopleSplit=10;}
			}
		

		System.out.println("HOW WAS THE SERVICE QUALITY");
		serviceQuality = scan.next();
		if (serviceQuality.equalsIgnoreCase("POOR") ) {totalTip= totalBill*5/100;}
		else if (serviceQuality.equalsIgnoreCase("FAIR") ) {totalTip= totalBill*10/100;}
		else if (serviceQuality.equalsIgnoreCase("GOOD") ) {totalTip= totalBill*15/100;}
		else if (serviceQuality.equalsIgnoreCase("EXCELLENT") ) {totalTip= totalBill*25/100;}
		
		totalBillandTip = totalBill + totalTip;
		totalTipPerPerson = totalTip/numOfPeopleSplit;
		amountPerPerson =totalBillandTip/numOfPeopleSplit;
		
		
		
		System.out.println("TOTAL BILL					:"+ totalBill);
		System.out.println("SERVICE QUALITY					:"+ serviceQuality);
		System.out.println("TOTAL TIP					:"+ totalTip);
		System.out.println("NUMBER OF PEOPLE SPLITTING			:"+ numOfPeopleSplit);
		System.out.println("TOTAL BILL AMOUNT PER PERSON			:"+ amountPerPerson);
		System.out.println("TOTAL TIP AMOUNT PER PERSON			:"+ totalTipPerPerson);
		
		
		
	}

}
