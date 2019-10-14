import java.util.*;

import java.lang.*;
public class Treemap {
	TreeMap<Integer,String> s1;
	TreeMap<Integer,String> s2;
    Scanner s;
    int id;
	public Treemap() {
		super();
		this.s1=new TreeMap<Integer,String>();
		this.s2=new TreeMap<Integer,String>();
		this.s=new Scanner(System.in);
		id=0;
	}
	
	public void add() {
		String name=s.next();
		s1.put(id, name);
		id++;
		
	}
	
	public void coping() {
		s2.putAll(s1);
		System.out.println("Tree Map Copied:");
		printall1();
		
	}
	
	public void search() {
		System.out.println("Give key to search:");
		int  key=s.nextInt();
		if(s1.containsKey(key)) {
			for(Map.Entry<Integer,String> entry:s1.entrySet()) {
				if(entry.getKey()==key) {
					System.out.println(entry.getValue());
				}
			}
		}
		else
		{
			System.out.println("Key not Found");
		}
		
	}
	
	public void printall() {
		for(Map.Entry<Integer,String> entry:s1.entrySet())
		{
			 System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
	}
	
	public void printall1() {
		for(Map.Entry<Integer,String> entry:s2.entrySet())
		{
			 System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
	}
	
	public void key() {
		 System.out.println("Least key Map: ");
		 System.out.println(s1.firstEntry());
		 System.out.println("Greatest key Map: ");
		 System.out.println(s1.lastEntry());
	}
	
	public void reverse() {
		System.out.println("Reverse"+s1.descendingMap());
	}
	
	public void strictly() {
		System.out.println("Enter the greatest key of your choice");
		int key=s.nextInt();
		System.out.println("Entries less than your given key:"+s1.headMap(key));
		
	}
	
	public void range() {
		System.out.println("Lowest range");
		int key1=s.nextInt();
		System.out.println("Highest Range");
		int key2=s.nextInt();
		System.out.println("Maps in the chosen range:"+s1.subMap(key1, key2));
	}

}
