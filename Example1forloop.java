Example 1: to print 1,2,3,4,5


class Forloop
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			system.out.println(i);
		}
	}
}
output
1,2,3,4,5

Example 2: to print 146,147,148,149,150

class Forloop
{
	public static void main(String[] args)
	{
		for(int i=146; i<=150; i++)
		{
			system.out.println(i);
		}
	}
}


Example 3: to print 2,4,6,8

class Forloop
{
	public static void main(String[] args)
	{
		for(int i=2; i<=8; i=i+2)
		{	
			system.out.println(i);
		}
	}
}

Example 4: Sum of 'n' natural numbers using for loop

class Sum
{
	public static void main(String[] args)
	{
		int n = 5;
		int sum = 0;
		for(int i=1; i<=n; i++)
		{
			sum = sum + i;
			system.out.println(sum);
		}
	}
}