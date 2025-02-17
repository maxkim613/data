package Day2;

public class arr2 {
	public static void main(java.lang.String[] args) {
		String[] oStr = {"a","b","c"};
		String[] nStr = new String[5];
		System.arraycopy(oStr, 0, nStr, 1, 3);
		for (int i = 0; i < nStr.length; i++) {
			System.out.println("nStr["+i+"] : "+nStr[i]);
		}
		
		Week w = Week.Monday;
		System.out.println(w.getLabel());
		System.out.println(w.getCode ());
	}
}