
public class Phone {
	String no;
	
	public Phone(String no) {
		this.no = no;
	}
	
	public Phone() {
		this("???-????-????");
	}
	
	public void call(String no) {
		System.out.println(this.no + "は、" + no + "に電話しました。");
	}
}
