public class ArrayExample {
	public static void main(String[] args) {
		int [] scores = {83,90, 87, 81, 42, 41, 75, 94, 15, 75,
				83,90, 87, 81, 42, 41, 75, 94, 15, 75,83,90, 87, 81, 42, 41, 75, 94, 15, 75};
		for(int i=0;i<scores.length; i++) {
			System.out.printf("scores[%d] : %d\n",i, scores[i]);			
		}
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("sum : " + sum);
		double avg = (double) sum /scores.length;
		System.out.println("avg : " + avg);
	}

}
