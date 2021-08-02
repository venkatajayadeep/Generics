package bridgelabz;

public class PrintArray {
	public static void toPrint(Integer[] inputArray){
		for (int element : inputArray){
		System.out.printf("%s",element);
		}
		System.out.println();
		}
		public static void toPrint(Double[] inputArray){
		for (double element : inputArray){
		System.out.printf("%S",element);
		}
		System.out.println();
		}
		public static void toPrint(Character[] inputArray){
		for (char element : inputArray){
		System.out.printf("%S",element);
		}
		System.out.println();
		}
	public static void main(String[] args) {
	 
		Integer[]  intArray = {1,2,3,4,5};
		Double[] doubleArray = { 1.1, 2.2, 3.3 };
		Character[] charArray = { 'h' ,'g' ,'j' ,'k' };
		
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);
	}

}
