//九九乘法表
public static void night()
{
	for (int x=1; x<=9; x++)
	{
		for (int y=1; y<=x; y++)
		{
			System.out.print(y+"*"+x+"="+y*x);
		}System.out.println();
	}
}
//重载
class overload
{
	public static int add(int x,int y)
	{
		int sum = 0;
		sum = x+y;
		System.out.println(sum);
		return sum;
	}
	public static int add(int x,int y,int z)
	{
		int sum=0;
		sum=y+x+z;
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args)
	{
		add(3,4);
		add(1,4,5);
	}
}

//折半查找 使用前提：必须保证数组是有序的
	public static int halfSearch(int[] arr,int key)
	{
		int min,max,mid;
		min=0;
		max=arr.length-1;
		mid=(max+min)/2;

		while (arr[mid]!=key)
		{
			if (key>arr[mid])
				min = mid+1;
			else if(key<arr[mid])
				max = mid-1;
			if(min>max)
				return -1;
			mid=(min+max)/2;
		}
		return mid;
	}
	public static int halfSearch_2(int[] arr,int key)
	{
		int min=0,max=arr.length-1,mid;
		while (min<max)
		{
			mid=(min+max)>>1;
			if(key>arr[mid])
				min = mid+1;
			else if(key<arr[mid])
				max = mid-1;
			else
				return mid;
		}
		return -1;
	}
	public static int getIndex(int[] arr,int key)
	{
		for (int x=0; x<arr.length; x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}

	//冒泡排序
	public static void bubbleSort(int[] arr)
	{
		for (int x=0; x<arr.length-1; x++)
		{
			for (int y=0; y<arr.length-x-1; y++)
				if(arr[y]>arr[y+1])
				{
					int temp = arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
		}
	}
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for (int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}
	public static void main(String[] args)
	{
		int[] arr={1,3,2,7,3,5,8,2};
		bubbleSort(arr);
		printArray(arr);
	}

	//遍历数组
	public static void main(String[] args)
	{
		int[] arr = {4,1,2,7,3,5};
		for(int x=0;x<arr.length;x++)
			System.out.print(arr[x]);
	}

//十进制-->二进制
	
	public static void toBin(int num)
	{
		StringBuffer sb = new StringBuffer();
		while (num>0)
		{
			sb.append(num%2);
			num = num/2;
		}
		System.out.println(sb.resever());
	}

	//十进制-->十六进制
	public static void toHex(int num)
	{
		StringBuffer sb = new StringBuffer();
		for (int x=0; x<8; x++)
		{
			int temp = num&15;
			if(temp>9)
				sb.append((char)(temp-10+'A'));
			else
				sb.append()temp;
			num = num >>>4;
		}
		System.out.pirntln(sb.resever());
	}

//查表法
	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3'
					 ,'4','5','6','7'
					 ,'8','9','A','B'
					 ,'C','D','E','F'};

	char[] arr = new char[8];
	
	int pos = arr.length;

	while (num!=0)
	{
		int temp = num & 15;
		arr[--pos] = chs[temp];
		
		num = num >>>4;
	}
	System.out.println("pos"+pos);

	for (int x=pos; x<arr.length; x++)
	{
		System.out.print(arr[x]);
	}

