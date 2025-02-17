package Day1;

public class Calendar { 
	public static void main(String[] args) {
		int lastday=0;
		int month;
		int num=3;
		for(month=1;month<=12;month++) {
			System.out.println(month+"월");
			 if (month == 2) {
				 	lastday = 28;
	            } else if (month <= 7) {
	            	lastday = (month % 2 == 1) ? 31 : 30;
	            } else {
	            	lastday = (month % 2 == 1) ? 30 : 31;
	            }
			for(int i=0;i<num;i++) {
				System.out.print("   ");
			}
			for(int j=1;j<=lastday;j++) {
				if((j+num)%7==0) {
					if(j<10) {
						System.out.print(j+"  ");
					} else {
						System.out.print(j+" ");	
					}
					System.out.println("");
				} else {
					if(j<10) {
						System.out.print(j+"  ");
					} else {
						System.out.print(j+" ");	
					}
				}
			}
			num = (lastday+num)%7;
			System.out.println("");
			System.out.println("");
		}	
	}
}
