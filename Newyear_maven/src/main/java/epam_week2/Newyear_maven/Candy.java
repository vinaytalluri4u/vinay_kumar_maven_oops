package epam_week2.Newyear_maven;
import java.util.*;
public class Candy
{
	public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of chocolates:");
	int c=sc.nextInt();
	int[] choco=new int[c];
	for(int i=0;i<c;i++)
	{
		System.out.print("Enter the weight "+(i+1)+" chocolate:");
		choco[i]=sc.nextInt();
	}
	Chocolates c1=new Chocolates();
	int chocototal=c1.totalweight(choco,c);
	System.out.print("Enter the number of sweets:");
	int s=sc.nextInt();
	int[] sweet=new int[s];
	for(int i=0;i<s;i++)
	{
		System.out.print("Enter the weight "+(i+1)+" sweet:");
		sweet[i]=sc.nextInt();
	}
	Sweets s1=new Sweets();
	int sweettotal=s1.totalweight(choco,c);
	System.out.print("Enter the lowest weight range of candy:");
	int low=sc.nextInt();
	System.out.print("Enter the highest range of the candy:");
	int high=sc.nextInt();
	int num_of_choco=c1.numofcandy(low,high,choco,c);
	int num_of_sweets=s1.numofcandy(low,high,sweet,s);
	int total_candy=num_of_choco+num_of_sweets;
	if(total_candy>=1)
		System.out.print("***Congratulations you recieved "+total_candy+" candy***");
	else
		System.out.print("You recieved "+total_candy+" candy");
	
}
	
}

