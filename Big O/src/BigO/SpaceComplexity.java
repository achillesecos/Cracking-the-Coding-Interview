package BigO;

public class SpaceComplexity {

	public SpaceComplexity() {
		// TODO Auto-generated constructor stub

	}
	
	public int sum(int n) {
		if(n <= 0) {
			return 0;
		}
		return n + sum(n-1);
	}
	
	public int pairSumSequenc(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += pairSum(i, i+1);
		}
		return sum;
		
	}
	
	public int pairSum(int a, int b) {
		return a +b;
	}
	
}
