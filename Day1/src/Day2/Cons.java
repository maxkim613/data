package Day2;

public class Cons {

		String str1;
		String str2;
		String str3;
		
		public Cons() {
			System.out.println(" 기본 ");
		}
		
		public Cons(String str1) {
			this.str1 = str1;
			System.out.println("str1 : "+str1);
		}
		public Cons(String str1,String str2) {
			this.str1 = str1;
			System.out.println("str1 : "+str1);
			this.str2 = str2;
			System.out.println("str2 : "+str2);
		}
		public Cons(String str1,String str2,String str3) {
			this.str1 = str1;
			System.out.println("str1 : "+str1);
			this.str2 = str2;
			System.out.println("str2 : "+str2);
			this.str3 = str3;
			System.out.println("str3 : "+str3);
		}

	}


