package Day2;
import java.text.DecimalFormat;  
public class Book {
	private String bname;
	private String bauthor;
	private String bpublisher;
	private int bprice;
	private int bstock;
	
	
	private static final DecimalFormat priceFormat = new DecimalFormat("#,###,###,###");
	//Method overloading
	public void setStr1(String bname) {
		this.bname = bname;
		System.out.println("이름 : "+bname);
	}
	public void setStr1(int bprice) {
		this.bprice = bprice;
		System.out.println("가격 : "+ priceFormat.format(bprice) +"원");
	}
	public void setStr1(String bname,String bauthor,int bprice) {
		setStr1(bname);
		setStr1(bprice);
		this.bauthor=bauthor;
		System.out.println("저자 : "+bauthor);
	}
	public void setStr1(String bname,String bauthor,String bpublisher,int bprice) {
		setStr1(bname,bauthor,bprice);
		this.bpublisher=bpublisher;
		System.out.println("출판사 : "+bpublisher);
	}
	public void setStr1(String bname,String bauthor,String bpublisher,int bprice,int bstock) {
		setStr1(bname,bauthor,bpublisher,bprice);
		this.bstock=bstock;
		System.out.println("재고 : "+bstock);
	}
}