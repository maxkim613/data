package Day7;

public class Sheep2 {
		private String sexagenaryCycle;
		private int order;
		private double percent;
		private boolean polyphagousCheck;
		private boolean woolUseCheck;
			
		public  Sheep2(String sexagenaryCycle,
				int order,
				double percent,
				boolean polyphagousCheck,
				boolean woolUseCheck
				) {
			this.sexagenaryCycle = sexagenaryCycle;
			this.order = order;
			this.percent = percent;
			this.polyphagousCheck =polyphagousCheck;
			this.woolUseCheck = woolUseCheck;
		}
		
		public String printSexagenarycycle(String beforesexagenaryCycle) {
			System.out.println(beforesexagenaryCycle+"->"+sexagenaryCycle);
			return sexagenaryCycle;
		}
}
