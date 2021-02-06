import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class TestExtend extends TestInterface  implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface tr = new TestInterface();
		
	ArrayList<String> al = new ArrayList<String>();
	al.add("Himanshu");
	al.add("Swati");
	al.remove(0);
	
Iterator itr =	al.iterator();
System.out.println(itr);
String name = "himanshu";

Enumeration<String> e = Collections.enumeration(al);
while(e.hasMoreElements())
{
	e.nextElement();
}

TestExtend te = new TestExtend();
		Thread th = new Thread(te);
		th.start();
		System.out.println(th.getName());
	}

	@Override
	public void run() {
		System.out.println("hello i am thread");
		
	}

	
}
