package day42_customclasses_encapsulation;

import java.util.ArrayList;

public class DSWShoeStore {
	public static void main(String[] args) {
		
		Shoes [] shoesArray = new Shoes[3];
		
		Shoes shoes1= new Shoes();
		Shoes shoes2= new Shoes();
		Shoes shoes3= new Shoes();
		
		shoes1.setShoesData("ALDO", 6.5);
		shoes2.setShoesData("Allen Edmonds", 7.5);
		shoes3.setShoesData("BOSS HUGO", 9.5);
		
		shoesArray[0]=shoes1;
		shoesArray[1]=shoes2;
		shoesArray[2]=shoes3;
		
		
//		System.out.println(shoesArray[0].getShoesData());
//		System.out.println(shoesArray[1].getShoesData());
//		System.out.println(shoesArray[2].getShoesData());
		
		ArrayList<Shoes> myShoes = new ArrayList <>();
		
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		
//		
//		System.out.println(myShoes.get(0).getShoesData());
//		System.out.println(myShoes.get(1).getShoesData());
//		System.out.println(myShoes.get(2).getShoesData());
		
//		System.out.println(myShoes.get(0).brand);
//		System.out.println(myShoes.get(1).size);
//		System.out.println(myShoes.get(2).size);
//		
//		
//		Shoes redShoes = myShoes.get(1);
		
	//	System.out.println(redShoes.getShoesData());
		
//		for(Shoes s: myShoes) {
//			System.out.println(s.getShoesData());
//		}
		
		// print the name of the shoes that has a size more than 7
		
		for(Shoes s: myShoes) {
			
			if(s.size>7) {
				System.out.println(s.brand);
			}
			
		}
		
	}

}
