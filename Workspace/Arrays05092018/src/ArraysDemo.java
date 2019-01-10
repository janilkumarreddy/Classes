
public class ArraysDemo {



	/**
	 * 1.Array is a type of data structure which can hold the all elements of same data type
	 * 2.Size of Array is fixed
	 * 3.Array index starts from ZERO
	 * 
	 * <elementType>[] <nameOfArray>* 
	 * Ex : int[] arrNumbers;
	 * 
	 * arrayName = new datatType[size]
	 * Ex : arrNumbers = new int[5];
	 * 
	 */	

	public static void main(String[] args) {

		int arrNumbers[] = new int[5];
		int x = 0;

		int arr[] = {1,2,3,4,5};

		System.out.println("Length of array : "+arrNumbers.length);
		//Not recommonded		
		/*arrNumbers[0] =10;
		arrNumbers[1] =20;
		arrNumbers[2] =30;
		arrNumbers[3] =40;
		arrNumbers[4] =50;*/

		//Assigning values to an array
		for(int i=0 ; i<arrNumbers.length ; i++) {
			arrNumbers[i] = x+10;
			x = x+10;
		}


		//Printing values of array in console
		for(int i=0 ; i<arrNumbers.length ; i++) {
			System.out.println("arrNumbers["+i+"] : "+ arrNumbers[i]);
		}

		//Printing values of array in console
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("arr["+i+"] : "+ arr[i]);
		}

	}

}

