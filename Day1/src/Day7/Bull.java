package Day7;

public class Bull extends Parent {
	//12간지 null
	private String sexagenaryCycle;
	//순서 정수형 0
	private int order;
	//생태계 차지 percent 0.0
	private double percent;
	//논리형 초기값은 false
	private boolean polyphagousCheck;
	
	private int weight;
	
	public Bull(String sexagenaryCycle,
			int order,
			double percent,
			boolean polyphagousCheck,
			int weight
			) {
		this.sexagenaryCycle =sexagenaryCycle;
		this.order = order;
		this.percent=percent;
		this.polyphagousCheck=polyphagousCheck;
		this.weight=weight;
	}
	
	public String printSexagenarycycle(String beforesexagenaryCycle) {
		System.out.println(beforesexagenaryCycle+"->"+sexagenaryCycle);
		return sexagenaryCycle;
	}
	public int printOrder(int beforeorder) {
		System.out.println(beforeorder+"->"+order);
		return order;
	}

	public String getSexagenaryCycle() {
		return sexagenaryCycle;
	}

	public void setSexagenaryCycle(String sexagenaryCycle) {
		this.sexagenaryCycle = sexagenaryCycle;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
}
