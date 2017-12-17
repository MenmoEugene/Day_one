/*
实现思路：尖朝上改变条件

1
12
123
1234
12345

*/
class Print
{
	public static void main(String[] args) 
	{
		print_top5();
		print99();
	}
	public static void print_top5()
	{
		for (int x=0; x<5; x++)
		{
			for (int y=1; y<=x+1; ++y)
			{
				System.out.print(y);
			}System.out.println();
		}
		System.out.println("=========================================================================");
	}



	public static void print99()
		{
			for(int x=1;x<=9;x++)
			{
				for(int y=1;y<=x;y++)
				{
				   System.out.print(y+"*"+x+"="+y*x+"\t");
				}System.out.println();
			}
		}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
