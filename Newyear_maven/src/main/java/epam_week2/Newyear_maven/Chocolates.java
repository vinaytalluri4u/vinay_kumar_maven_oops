package epam_week2.Newyear_maven;

public class Chocolates extends Abstract_method {
	public int totalweight(int [] choco,int c)
	{
		int total=0;
		for(int i=0;i<c;i++)
		{
			total=total+choco[i];
		}
		return total;
	}
	public int numofcandy(int low,int high,int[] choco,int c)
	{
		int count=0;
		for(int i=0;i<c;i++)
		{
			if(choco[i]>=low && choco[i]<=high)
				count++;
		}
		return count;
		
	}
}
