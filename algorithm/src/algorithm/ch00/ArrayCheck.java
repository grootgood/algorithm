package algorithm.ch00;

public class ArrayCheck {

	public static void main(String[] args) {
		int[] ages = {60, 50, 30, 20, 10}; 
		
		double[] weight = new double[5]; // 초기값 0으로 초기화
		weight[0] = 77.8; 
		weight[1] = 45.5;	
		weight[2] = 88.5;		
		weight[3] = 56.5;	
		weight[4] = 49.5;
		
		for(double d : weight) {
			System.out.println(d);
		}
	}
}
