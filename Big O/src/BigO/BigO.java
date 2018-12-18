package BigO;

public class BigO {

	public BigO() {
		// TODO Auto-generated constructor stub
	}
	
	//Runtime is O(n)
	void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for (int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println(sum + ',' + product);
	}
	
	//Runtime is O(n^2)
	void printPairs(int[] array) {
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
	
	//Runtime is O(n^2)
	void printUnorderedPairs(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				System.out.println(array[i] + ',' + array[j]);
			}
		}
	}
	
	//Runtime is O(ab)
	void printUnorderedPairs(int[] arrayA, int[] arrayB) {
		for(int i = 0; i < arrayA.length; i++){
			for(int j = 0; j < arrayB.length; j++) {
				if(arrayA[i] < arrayB[j]) {
					System.out.println(arrayA[i] + ',' + arrayB[j]);
				}
			}
		}
	}
	
	//Runtime is O(ab)
	void printUnorderedPairs1(int[] arrayA, int[] arrayB) {
		for(int i = 0; i < arrayA.length; i++){
			for(int j = 0; j < arrayB.length; j++) {
				for(int k = 0; k < 100000; k++) {
					System.out.println(arrayA[i] + ',' + arrayB[j]);
				}
			}
		}
	}
	
	//Runtime is O(n)
	void reverse(int[] array) {
		for(int i = 0; i < array.length/2; i++) {
			int other = array.length - i - 1;
			int tmp = array[i];
			array[i] = array[other];
			array[other] = tmp;
		}
	}
}
