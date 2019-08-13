package OPPsCengiz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class ChildClassDemo1Test{
	public static void main(String[] args) {
		
		ChildClassDemo1 c1= new ChildClassDemo1();
		ChildClassDemo2 c2= new ChildClassDemo2();
		
//		c1.method1();
//		c1.method2();
		c1.methodStatic(8);
//		
//		SuperClassDemo1 [] s1= new SuperClassDemo1 [4];
//		SuperClassDemo1 s2= new ChildClassDemo1();
//		
//		ChildClassDemo1 s3 = (ChildClassDemo1) s2;
//		
//		s1[0]=c1;
//		s1[1]=c2;
//		
//		try {
//		s3.method22();	
//		}catch(Exception e) {
//			
//		}
//		
//		
//		try{
//			Thread.sleep(1000);
//			System.out.println(1000/0);
//		}catch(Exception e) {
//			e.printStackTrace();
//			//System.exit(0);
//		}finally {
//			System.out.println("I am finally block");
//		}
//		try {
//					System.out.println(Integer.parseInt("14m5"));
//		}catch(Throwable e) {
//			e.printStackTrace();
//			System.out.println("something wrong with the number");
//		}

		
		
		List<Integer> list1 = Arrays.asList(20,30,40,50);
		
		//list1.removeIf(n-> n>30);
		//System.out.println(list1);
		
	      List<Integer> list2 = new ArrayList<>();
	        list2.add(30);
	        list2.add(40);
	        list2.add(50);
	        list2.add(60);
	        
	      //  list2.removeIf(n-> n<50);
	       // System.out.println(list2);
	       
		
		//list1.forEach(n-> System.out.println(n));
	        LocalDate today = LocalDate.now();
	        System.out.println(today);
	        
	        LocalDateTime now= LocalDateTime.now();
	        System.out.println(now);
	        
	        Date date = new Date();
	        System.out.println(date);
	        
	        List<Integer> list3 = new ArrayList<>();
	        list3.add(130);
	        list3.add(140);
	        list3.add(50);
	        list3.add(60);
	        list3.add(99);
	        list3.add(101);
	        list3.add(-1);
	        
	        Iterator it = list3.iterator();
	       
	         int value=0;
	        while(it.hasNext()) {
	        	value= (int)it.next();
	        	if(value>100) {
	        	 it.remove();
	        	}
	        }
		System.out.println(list3);
		
		
		Map<String, String> map = new HashMap<>();
//		map.put("baba", "cengiz");
//		map.put("anne", "gul");
//		map.put("cocuk", "duru");
//		map.put(null, "deneme");
//		map.put(null, "deneme");
//		map.put(null, "deneme");
//		
//		System.out.println(map);
		
		Map<String, String> tablemap = new Hashtable<>();
		tablemap.put("baba", "cengiz");
		tablemap.put("anne", "gul");
		tablemap.put("cocuk", "duru");
		tablemap.put(null, "deneme");

		System.out.println(tablemap);
		
		
		
		
		
		
		
	}
	
	

}
