package day64_Collections01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassNotes_64 {
/*
 * Because of large amount of data. in recent years in IT new fields emerged
 * 
 * - Big Data: (Java, Hadoop, Spark, Pig) used to organize really large amount of data.
 * - Data Science: Data analytics, 
 * 		- Machine Learning--> Learn data, and do predictions
 * 		- AI--> Artificial Intelligence__> Learn data, do predictions, and make decisions
 * 	
 * ETL testing--> Informatica is a popular tool.
 * 
 * SQL, JDBC, 
 * 
 * 
 * ______________________
 * In Java, we have Data Structure
 * 
 * Array
 * Collections Framework
 * Map (K,V)
 * _____________
 * 
 * Array - collection data of same type, 
 * 		It is fixed size. 
 * 		Data keeps ordering.
 * 		Allows duplicates
 * 		Can store primitives and objects
 * 		Can be multidimensional
 * 		
 *int [] nums =  new int [5];
 *
 *
 *Collection FrameWork Consists Of hierarchy of Interfaces
 *Each interface has multiple implementations (implementing classes)
 *
 *IQ What is the difference between list set and map?
 *
 *Collection Framework interfaces
 *
 *Iterable>Collection>list
 *					>Set > SortedSet  
 *					>Queue > Deque
 *
 *Map>SortedMap
 *
 *Each interface has an implementing class(es)	
 *
 *List>ArrayList
 *    >LinkedList
 *    >Vector>Stack
 *    
 * IQ: List vs Set vs Map
 *  List > Ordered and Indexed Collection, may contain dublicates
 *  Set > Collection of Unique values, not ordered, no indexing
 *  Queue > first in first out
 *  Map > Like a dictionary, pair, (Key and Value pairs). Keys cannot be duplicated and not ordered.
 *  
 *  IQ: What types of Collections or Data Structures you have used?
 *  
 *  Depending on the data I am working with arrays, Lists, Sets, Maps.
 *  
 *  
 *List>ArrayList
 *    >LinkedList
 *    >Vector>Stack
 *  
 *  ArrayList - it is array based collection. Internally it is used arrays. Dynamic array.
 *  
 *  How to declare
 *  List<Integer> list1 = new ArrayList<>();
 *  ArrayList<Integer> list1 = new ArrayList<>();
 *  
 *  IQ: Difference between Array vs ArrayList
 *  
 *  	Arrays are fixed size, Arraylists are dynamic in size
 *  	Arrays can hold primitives and objects, ArrayList can hold only objects
 *  	Arrays can be multidimensional, ArrayList cannot be multi dimensional
 *  	Array is a build in data structure ArrayList is implementing class of List interface in Collection framerwork
 *  
 *  ________________________________
 *  IQ: LINKEDLIST
 *  	- Implementing class of a List Interface
 *  	- Stores data in individual nodes that are connected to each other
 *  	- Each node will have a pointer to the next node/value
 *  	- Consists of Values connected to each other using pointers
 *  	- implement list and deque
 *  
 *  ArrayList and LinkedList both implements List interface and maintains insertion order. ... 
 *  LinkedList internally uses a doubly linked list to store the elements.
 *   2) Manipulation with ArrayList is slow because it internally uses an array. 
 *  If any element is removed from the array, all the bits are shifted in memory.
 *  
 *  IQ: ArrayList vs LinkedList
 *  ArrayList is array based , internally uses array
 *  LinkedList Consist of nodes/values that are related to each other
 *  ArrayList and LinkedList both keep ordering
 *  Both keeps order
 *  
 *  ArrayList	LinkedList
1) ArrayList internally uses a dynamic array to store the elements.	
LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.	
Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3) An ArrayList class can act as a list only because it implements List only.	
LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.	
LinkedList is better for manipulating data.
   Add, Remove LinkedList is faster than Arraylist
   Get, ArrayList is faster
 *  
 *  Anything implements list keeps order and index and allow duplicates.
 *  
 *  
 *  Big O notation = The performance of the comparison of the code / implementation algorith.
__________________________________________________________________
 *  
 *  VECTOR
 *  
 *  - Array based data structure, internally uses dynamic array.
 *  - Vector is similar with ArrayList, but it is synchronized, threadsafe
 *  - Vector is mostly used in multi threaded environment.
 *  - ArrayList is a better choice if your program is thread-safe. Vector and ArrayList require space as more elements are added. 
 *  - Vector each time doubles its array size, while ArrayList grow 50% of its size each time.
 *  
 *  - there are 2 seats but 4 customer want to buy tickets, 
 *  - a pizza party 2 slices, 5 guys jump to get it that is not thread safe
 *  - if you want to make it thread safe - organize it, first come first safe. It locks for one thread , customer, or student.
 *  - one single lane, high way four lane. Multi threaded is highway with for lanes.
 *  - If you use vector your programme does not messup, if thread safe-syncronize: it is slow.
 *  - IQ. Difference between Arraylist and Vector
 *  	Arraylist is nOT thread safe, vector is scnronized thread safe.
 *  	Arraylist is faster than vector
 *  	Both use array internally, both allows duplucate and keep ordering
 *  	Both are implementations of List Interface
 *  
 *  For example, if one thread is performing an add operation, 
 *  then there can be another thread performing a remove operation in a multi-threading environment.
 * ___________________________________________________________________ 
 *   *List>ArrayList
 *    >LinkedList
 *    >Vector>Stack
 *  
 *	STACK
 *Last in First out LIFO
 *Extends Vector
 *
 *It is like a stack of books
 *
 *Iterative>collections>list>Vector>Stack
 *
 *
 *
 *Iterable >Collection>List
 *					  >Set>HashSet
 *						>SortedSet>TreeSet
 *
 *SET INTERFACE
 *Collection of unique/distinct values. No duplicates
 *
 *Iterable > Collection > Set > HashSet
 *
 *Set<Integer> set = new HashSet<>();
 *
 *
 *IQ:Find out unique
 *		List <String> list = Arrays.asList("23","23","a","b","b","22","rr");
		Set<String> unique = new HashSet<>(list);
		System.out.println(unique);
 *
 *List: ArrayList most popular
 *Set: HashSet most popular
 *
 *HashSet i implementing  Set interface. Collection of unique values. 
 *and does not allow duplications. internally it uses HashMaps key part.
 *
 *Set > SortedSet is an interface that extends Set. It is a collection of unique values that is ordered .
 *Set > HashSet >SortedSet> TreeSet
 *
 *TreeSet is a class that implements sortedSet interface
 *
 *Summary
 *-Array
 *-collection framework
 * list>ArrayList>Linkedlist>Vector>Stack
 * set>HashSet
 * sortedSet>TreeSet
 *
 *
 * 
 * 
 * 
 * 
 * 
 * 
 */
			

}
