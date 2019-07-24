package AssessmentTests;
import java.util.*;

public class Test  {

public static void main(String[ ] args) {

List<Integer>  list = new  ArrayList<Integer>();

list.addAll( Arrays.asList(3,6,9,12,15,18) );

 

Iterator<Integer> iterate =list.iterator();

while(iterate.hasNext( ) ) {

if( iterate.next() %2== 0 ) {

iterate.remove();

}

}

      System.out.println( list );

  }

}