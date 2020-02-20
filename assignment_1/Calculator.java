package assignment_1;

public class Calculator implements ICalculator{
	public int add(int x, int y) {
		return x+y;
	}
	
	public float divide(int x, int y) {
		float ans = 0;
		if (y == 0) {
			System.out.println("Cannot divide by zero");
			throw new RuntimeException();
		}
		ans = (float)x/y;
		return ans;
	}
}
