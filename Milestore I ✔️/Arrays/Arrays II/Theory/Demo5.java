// Anonymous Array:
//this is the example of method overloading also

class calc 
{
	int result = 0;



	//adding two numbers
	int add(int a, int b)
	{
		result = a+b;
		return result;
	}

	//addtion of an array
	//addtion of an annonymous array using this method
	int add (int arr [])
	{
		for(int n : arr)
		{
			result +=n;
		}
		return result;
	}

}



public class Demo5 
{

	public static void main(String[] args) 
	{
		calc obj = new calc();
		// System.out.println(obj.add(3,2));

		// int arr [] = {3,2};
		// System.out.println(obj.add(arr));


		System.out.println(obj.add(new int [] {1,3,8,50}));
	}
}


