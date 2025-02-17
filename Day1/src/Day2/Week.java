package Day2;

public enum Week {
	Monday("월요일","01"),
	Tuesday("화요일","02"),
	Wednesday("수요일","03"),
	Thursday("목요일","04"),
	Friday("금요일","05"),
	Saturday("토요일","06"),
	Sunday("일요일","07");
	private String label;
	private String code;
	private Week(String label, String code) {
		this.label = label;
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public String getCode() {
		return code;
	}
}
