package day23_Arrays;

import java.util.Scanner;

public class osman {
	public static void main(String[] args) {
		
		

	Scanner input = new Scanner(System.in);
    String[] list = {  "Ali", "Cengiz","Osman", "Metin", "Numan", "Betul", "Nalan" };
    int katilacaklarinSayisi = 0;
    for (int i = 0; i < list.length; i++) {
        System.out.println("Arkadaşım " + list[i] + "! Çok faydalı bir kamp yapacağız. "
                + "Katılmak ister misin?\n\nKatılmak istiyorsan -bizi sevindirirsin- lütfen 'E' yaz; "
                + "\nkatılmak istemiyorsan -çok üzüleceğiz ama- lütfen 'H' yaz...");
        String cevap = input.nextLine();
        if (cevap.equalsIgnoreCase("E"))
            katilacaklarinSayisi++;
        else if (cevap.equalsIgnoreCase("H"))
            ;
        continue;
    }if(katilacaklarinSayisi <= 3) {
        System.out.println("Yeterli sayıda kişi katılmayacağı için -maalesef- bu sene kampı evlerde yapmak zorunda kalacağız -:(");
        return;
    }else
    System.out.println("\nBu sene yapacağımız kampa " + katilacaklarinSayisi
            + " kişi katılacaktır. \nMasraflar katılanlar arasında bölünecektir.");
    double kampToplamUcret = 199;
    double kisiBasiUcret = kampToplamUcret / katilacaklarinSayisi;
    System.out.println("Binaenaleyh bu sene kamp masrafı olarak kişi başına $" +kisiBasiUcret + " düşmektedir...\nTeşekkür ederiz...!");

}

}
