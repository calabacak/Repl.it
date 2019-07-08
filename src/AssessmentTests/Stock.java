package AssessmentTests;

public class Stock {
	
	/*
	 * . Class Variables
tickerSymbol (String)
companyName (String)
price (int)
percentChange (double)
totalShares(int)
marketCap(long)
	 */
	
	String tickerSymbol;
	String companyName;
	int price;
	double percentChange;
	int totalShares;
	long marketCap;
	
	
	/*
	 * 2. Constructor
Constructor must initialize:
tickerSymbol (and convert the string to uppercase)
companyName
price
totalShares
	 */
	
	public Stock(String tickerSymbol, String companyName, int price, int totalShares ) {
		this.tickerSymbol=tickerSymbol.toUpperCase();
		this.companyName=companyName;
		this.price=price;
		this.totalShares=totalShares;
		this.marketCap=totalShares*price;
	}
		
	/*
	 * public void adjustPrice(int value)
This method will change the price by value (value can be positive or negative).  
It should also recalculate percentChange and marketCap.  percentChange represents the percentage changed	
	 */
		
		public void adjustPrice(int value) {		
			price=price+value;	
			marketCap=totalShares*price;
			percentChange=100*(Math.abs(value/price));
		}
		
		public String toString() {
			/*
			 * Ticker Symbol: GOOG
Company: Google, Inc.
Current Price: $802 (+7.2%)
Market Cap: $538000000000
			 */
			
			return "Ticker Symbol: "+tickerSymbol+"\n"+ "Company: "+ companyName +"\n"+ 
			"Current Price: $"+price+"\n"+ "Market Cap: $"+ marketCap;
		}
		
		
	}
	


