package testcases.suiteb;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.testng.annotations.Test;

public class Practice {

	public static void main(String[] args) {
		//String s[] = new String[105];
		
		
		// no final size, dynamically growing
		// List is an interface implements ArrayList
		
		
	
		List<String> l=new ArrayList<String>();
		System.out.println(l.size());
		l.add("Apple");//0
		l.add("Mango");//1
		l.add("Kiwi");//2
		System.out.println(l.size());
		
		//Display may not in the order of creation
		System.out.println(l.get(0));
		
		// index based
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
	System.out.println("Display using the for loop in string");
		for(String s : l) {
			System.out.println(s);
		}
		
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(100);
		l1.add(200);
		
		//Containing both data types but warning message will be there
		System.out.println("--------Different data types-------");
		List  l3 = new ArrayList();
		l3.add("hello");
		l3.add(100);
		
		// index based display of different data types
		for(int i=0;i<l3.size();i++) {
			System.out.println(l3.get(i));
		}
		
		
		Hashtable<String,String> table = new Hashtable<String,String>();// key , value
		table.put("name", "Ashish");
		table.put("place", "India");
		table.put("tool", "Selenium");
		table.put("tool", "Appium");
		table.put("key", "value");
		
		System.out.println(table.get("tool"));
		
		Hashtable<Integer,Integer> table1 = new Hashtable<Integer,Integer>();
		table1.put(1,1000);
		System.out.println(table1.get(1));
		
 		
		//table.keySet();
		
		// Set - multiple windows	
		
	}
}