// ArrayIndexOutOfBoundsException:



public class Demo6{
	public static void main(String[] args){
	
		int a[]={5,6,7,8};

		System.out.println(a[1]);   //6
		System.out.println(a[4]);  //ArrayIndexOutOfBoundsException 
		//after giving the index error it stopped the program and didmot print forward
		//so the nextcall cant be executed but before it what is present will be printed out

		System.out.println(a[2]);  //7 not printed due to index error
	}
}



// Output: ArrayIndexOutOfBoundsException