package EA;

import java.util.ArrayList;
import java.util.Scanner;

public class addTestDemo {

	public static void main(String[] args) {
		addTest1 ad=new addTest1();
		ArrayList<Integer> num=new ArrayList<Integer>();
		ad.print();
		Scanner input =new Scanner(System.in);
		while (input.hasNextInt())
		{
		int gess=input.nextInt();
		if (gess!=12)
		{
			if(!num.contains(gess))
			{
			num.add(gess);
			ad=new addTest2();
			ad.print();
			}
			else
			{
			ad=new addTest3();
			ad.print();
			}
			
		}
		else
		{
			ad=new addTest4();
			ad.print();
		}
		
		}

	}

}
