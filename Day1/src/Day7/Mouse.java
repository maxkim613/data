package Day7;

public class Mouse extends Parent{
	//12간지 null
	private String sexagenaryCycle;
	//순서 정수형 0
	private int order;
	//생태계 차지 percent 0.0
	private double percent;
	//논리형 초기값은 false
	private boolean polyphagousCheck;
	
	private int toothLength;
	
	public Mouse(String sexagenaryCycle,
			int order,
			double percent,
			boolean polyphagousCheck,
			int toothLength) {
		this.sexagenaryCycle = sexagenaryCycle;
		this.order = order;
		this.percent = percent;
		this.polyphagousCheck= polyphagousCheck;
		this.toothLength = toothLength;
	}
	/*
	 * @param beforesexagenaryCycle 이전 간지 정보
	 */
	public String printSexagenarycycle(String beforesexagenaryCycle) {
		System.out.println(beforesexagenaryCycle+"->"+sexagenaryCycle);
		return sexagenaryCycle;
	}
	/*
	 * @param beforeOrder 이전 순서 정보
	 */
	public int printOrder(String beforeOrder) {
		System.out.println(beforeOrder+"->"+order);
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
