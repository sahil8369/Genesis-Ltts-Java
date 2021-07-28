import java.io.*;
import java.util.*;
public class Q2
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int no,runs;
		try
		{
			System.out.println("Enter the no. of overs ");
			no = sc.nextInt();
			int array[] = new int[no];
			
			System.out.println("Enter the runs in each over ");
			for(int i=0; i<no; i++)  
			{     
				array[i]=sc.nextInt();  
			}  
			
			int overs;
			System.out.println("Enter the no of over ");
			overs = sc.nextInt();
			int run = array[overs-1];
			System.out.println("Runs scored in this over : "+run);
		}
		catch(Exception e){
            System.out.println(e.getClass().getCanonicalName());
     
        }
	}
}