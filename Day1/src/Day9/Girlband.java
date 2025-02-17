package Day9;

public class Girlband {
	protected int memberCount;
	protected String groupName;
	
	public Girlband() {
		
	}
	public Girlband(String groupName, int memberCount) {
        this.groupName = groupName;
        this.memberCount = memberCount;
    }
	
	public void sing() {
        System.out.println(groupName + "이(가) 노래를 부릅니다!");
    }
}
