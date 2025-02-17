package Day2;

public class arr {
	public static void main(java.lang.String[] args) {
		int[] ind = new int[100];
		for (int i = 0; i < 100; i++) {
			ind[i] = i+1;
			if(i<10) {
				System.out.print("arr[0"+i+"]="+ind[i]+"  ");
				if(i%10==9&&i>0) {
					System.out.println("");				
			}
			} else {
				System.out.print("arr["+i+"]="+ind[i]+" ");
				if(i%10==9&&i>0) {
					System.out.println("");				
			}
			}
		}
	}
}