package HomeWork;

import java.util.Scanner;

public class HomeWork_051v2 {
	public static void main(String[] args) {////GROUP 13/////
		
		int numOfPeopleSplit=0; 
		double totalBill, totalBillandTip, amountPerPerson=0;
		double totalTip= 0;
		double totalTipPerPerson = 0;
		String splitYesNo, serviceQuality;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("HOW MUCH IS THE BILL?");
		totalBill = scan.nextDouble();
		
		System.out.println("WILL YOU SPILT THE BILL ? YES or NO");
		splitYesNo = scan.next();
		if (splitYesNo.equalsIgnoreCase("NO")) {numOfPeopleSplit=1;}
		if (splitYesNo.equalsIgnoreCase("YES")) {
			System.out.println("HOW MANY OF YOU SPLIT THE BILL? ");
			numOfPeopleSplit = scan.nextInt();
			if (numOfPeopleSplit>10){numOfPeopleSplit=10;}
			if (numOfPeopleSplit==0){numOfPeopleSplit=1;}
			}
		

		System.out.println("HOW WAS THE SERVICE QUALITY");
		serviceQuality = scan.next();
		if (serviceQuality.equalsIgnoreCase("POOR") ) {totalTip= totalBill*5/100;}
		else if (serviceQuality.equalsIgnoreCase("FAIR") ) {totalTip= totalBill*10/100;}
		else if (serviceQuality.equalsIgnoreCase("GOOD") ) {totalTip= totalBill*15/100;}
		else if (serviceQuality.equalsIgnoreCase("EXCELLENT") ) {totalTip= totalBill*25/100;}
		
		totalBillandTip = totalBill + totalTip;
		totalTipPerPerson = totalTip/numOfPeopleSplit;
		String strtotalTipPerPerson = String.format("%.02f", totalTipPerPerson);// get rid of the decimal other than two a.bc
		
		amountPerPerson =totalBillandTip/numOfPeopleSplit;
		String stramountPerPerson = String.format("%.02f", amountPerPerson);// get rid of the decimal other than two a.bc
		
		
		System.out.println("*******************************************************************");
		System.out.println("* 		                GUEST CHECK	                  *");
		System.out.println("*******************************************************************");
		System.out.println("====================================================================");
		System.out.println("BILL 						:"+ "$"+ totalBill);
		System.out.println("====================================================================");
		System.out.println("SERVICE QUALITY					:"+ serviceQuality);
		System.out.println("====================================================================");
		System.out.println("TOTAL TIP					:"+ "$"+ totalTip);
		System.out.println("====================================================================");
		System.out.println("TOTAL TO PAY					:" + "$"+totalBillandTip);
		System.out.println("====================================================================");
		//System.out.println("NUMBER OF PEOPLE SPLITTING			:"+ numOfPeopleSplit);
			 if (numOfPeopleSplit==1) {System.out.println("NUMBER OF PEOPLE SPLITTING			:&");}
		else if (numOfPeopleSplit==2) {System.out.println("NUMBER OF PEOPLE SPLITTING			:& & ");}
		else if (numOfPeopleSplit==3) {System.out.println("NUMBER OF PEOPLE SPLITTING			:& & & ");}
		else if (numOfPeopleSplit==4) {System.out.println("NUMBER OF PEOPLE SPLITTING			:& & & & ");}
		else if (numOfPeopleSplit==5) {System.out.println("NUMBER OF PEOPLE SPLITTING			:& & & & & ");}
		else if (numOfPeopleSplit==6) {System.out.println("NUMBER OF PEOPLE SPLITTING			:& & & & & & ");}
		else if (numOfPeopleSplit==7) {System.out.println("NUMBER OF PEOPLE SPLITTING			:& & & & & & & ");}
		else if (numOfPeopleSplit==8) {System.out.println("NUMBER OF PEOPLE SPLITTING			:& & & & & & & & ");}
		else if (numOfPeopleSplit==9) {System.out.println("NUMBER OF PEOPLE SPLITTING			:& & & & & & & & & ");}
		else if (numOfPeopleSplit==10){System.out.println("NUMBER OF PEOPLE SPLITTING			:& & & & & & & & & &");}
		System.out.println("====================================================================");
		System.out.println("TOTAL PER PERSON				:"+ "$"+stramountPerPerson);
		System.out.println("====================================================================");
		System.out.println("TIP PER PERSON					:"+ "$"+ strtotalTipPerPerson);
		System.out.println("__________________________________________________________THANK YOU!");
		System.out.println("====================================================================");
		
		
		
	}

}
