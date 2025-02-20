package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashsetDemo {

	public static void main(String[] args) 
	{
		HashSet myset=new HashSet();
//		Set myset=new HashSet();
//		HashSet<String>myset=new HashSet<String>();
		
		
		myset.add(100);
		myset.add("welcome");
		myset.add(10.5);
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(null);
		System.out.println(myset);
		
		
		
		
		System.out.println("Size of hashset:"+myset.size());
		myset.remove(10.5);
		
		System.out.println("After removing:"+myset);
		
		
		//insertion is not possible.
		
		//accessing specific element is not possible-directly not possible
		//workaround method.
		
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		
		//read all elements using for..each
		
//		for(Object x:myset) {
//			System.out.println(x);
//		}
		
		//using iterator
		
		Iterator it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		myset.clear();
		
		System.out.println(myset.isEmpty());
		
		
	}

}
