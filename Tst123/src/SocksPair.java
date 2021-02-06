import java.util.HashSet;
import java.util.TreeSet;

public class SocksPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] socks = {1,2,3,1,1,2,2,2};
 int pair = 0;
 int itemCount=0;
 int temp=0;
int counter =0;




//Logic for segrargatting arrays and comparing before each iteration

TreeSet<Integer> ts = new TreeSet<Integer>();


for(int i= 0;i<socks.length;i++)
{
	
	if(socks[counter]==socks[i])
	{
		//System.out.println("value of i is " +i);
		System.out.println("Number of Socks " +socks[counter]);
		itemCount++;
		
	}
		
	
}
System.out.println("Total Item Count is :" +itemCount);
pair = itemCount/2;
System.out.println("Total Pair is " +pair);
 
 
	}

}
