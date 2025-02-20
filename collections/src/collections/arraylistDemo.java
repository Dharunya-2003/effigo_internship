package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class arraylistDemo {

	public static void main(String[] args) 
	{
		
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		//ArrayList <Integer>mylist=new ArrayList();
mylist.add(100);
mylist.add(10.5);
mylist.add(100);
mylist.add("welcome");
mylist.add(true);
mylist.add(null);

System.out.println(mylist.size());

System.out.println("Data in arraylist:"+mylist);
mylist.remove(4);
System.out.println("After removing:"+mylist);


mylist.add(2,"Dharunya");
System.out.println("After insertion:"+mylist);

mylist.set(3,"effigo");
System.out.println("After replacing:"+mylist);


System.out.println(mylist.get(3));

//for(int i=0;i<mylist.size();i++) {
//	System.out.println(mylist.get(i));
//	
//}
//	for(Object x:mylist) {
//		System.out.println(x);
//	}

Iterator it=mylist.iterator();
while (it.hasNext())
{
	System.out.println(it.next());
}
System.out.println("is arraylist empty?  "+mylist.isEmpty());
ArrayList mylist2=new ArrayList();
mylist2.add(100);
mylist2.add(10.5);

mylist.removeAll(mylist2);
System.out.println(mylist);

mylist.clear();
System.out.println("is arraylist empty?"+mylist.isEmpty());
	}	

}