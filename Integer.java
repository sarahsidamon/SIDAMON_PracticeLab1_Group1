
public class Integer {
	public static void main(String[] args) {
		int[] Collection = {1, 2, 3, 4, 5};
		System.out.println(getSum(Collection));
	}
	
	static int getSum(int[] num) {
		int sum = 0;
		for (int number : num) {
			   sum += number;
		    }
		return sum;
	}
}
