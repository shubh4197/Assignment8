package sdas;
import java.lang.*;
import java.util.*;
public class Person {
 List<String> s;
 List<String> s1;
 List<String> s2;

 Scanner l;

public Person() {
	super();
	this.s = new ArrayList<>();
	this.s1 = new ArrayList<>();
	this.s2 = new LinkedList<>();
	this.l=new Scanner(System.in);
	
	
}

public void add() {
	System.out.print(" Add Name:" );
	String name=l.next();
	s.add(name);
	
}

public void add2() {
	System.out.print(" Add Name:" );
	String name=l.next();
	s2.add(name);
	
}

public void appendix() {
	System.out.print("Element to be appended:");
	String name=l.next();
	s2.add(name);
	printall2();
}


public void indexiterator() {
	 System.out.println("Enter index:");
	 int index=l.nextInt();
	 ListIterator itr = s2.listIterator(index); 
	 System.out.println("Elements from index "+index+":");
	  while (itr.hasNext()) 
         System.out.print(itr.next() + " "); 

     System.out.println(); 
   
}

public void reverseIterator() {
	 ListIterator itr = s2.listIterator(s2.size());
	 System.out.println("Backward Traversal : "); 
	  
     while (itr.hasPrevious()) 
         System.out.println(itr.previous() + " "); 

    	
}

public void removenotlastelement() {
	
   
   System.out.println("Last Element Retrieved:"+((LinkedList<String>) s2).peekLast());
}


public void add1() {
	
	System.out.print(" Add Name:" );
	String name=l.next();
	s1.add(name);
	
}

public void search() {
	System.out.print("Search Element: ");
	String name=l.next();
	int index=s.indexOf(name);
	if(index>=0)
	System.out.println("Element present at index: "+index);
	else
	System.out.println("Element not found!!!");
}

public void retrive() {
	System.out.print("Retrieve Element(Give index): ");
	int index=l.nextInt();
	
	System.out.println("Retrieved Element:"+s.get(index));
	
}

public void sorting() {
	Collections.sort(s);
	System.out.println("Sorted list:");
	printall();
}

public void shuffle() {
	Collections.shuffle(s);
	System.out.println("Shuffled list:");
	printall();
}

public void reverse() {
	Collections.reverse(s);
	System.out.println("Reversed List:");
	printall();
}

 public void printall() {
	for(String i:s) {
		System.out.println(i);
	}
}
 
 public void printall2() {
	for(String i:s2) {
		System.out.println(i);
	}
}

public void compare() {
	System.out.println("Are both the ArrayList equal?:"+s.equals(s1));
}

public void Occurences() {
	System.out.println("Enter the element to find the first and last occurence of:");
	String name=l.next();
	int first=s2.indexOf(name);
	int last=s2.lastIndexOf(name);
	System.out.println("First Occurence: "+first+",Last Occurence: "+last);
}
 
public void First() {
	String x=((LinkedList<String>) s2).getFirst();
	System.out.println("First element of the linked lists which is now deleting:"+x);
	System.out.println("Modified Array:");
	s2.remove(x);
	printall2();
}
 
}
