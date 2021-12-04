package EA;

import java.util.ArrayList;
import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("输入一个整数：");
		int sum=1;
		ArrayList<Integer> count=new ArrayList<Integer>();
		ArrayList<Integer> numstore=new ArrayList<Integer>();
		int inner=input.nextInt();
		int x=inner;
		int i,j;
		for (i=2;i<=inner;)
		{
			if(inner%i==0)
			{
				numstore.add(i);
				//System.out.println(i);
				inner/=i;
				i=2;
			}
			else
				i++;
			
		}
		int counts=0;
		for(i=0;i<numstore.size();i++)
		{
			counts=0;
			for(j=0;j<numstore.size();j++)
			{
				if(numstore.get(i)==numstore.get(j))
				{
					counts++;
				}
			}
			if (counts%2!=0&&!count.contains(numstore.get(i)))
			{
				count.add(numstore.get(i));
			}
				
		}
		for (i=0;i<count.size();i++)
			sum*=count.get(i);
		System.out.println("完全平方数是："+sum*x);

	}

}
