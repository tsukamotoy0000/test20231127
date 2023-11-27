
public class MobilePhone extends Phone{
	int picCnt;
	final int PIC_CNT_MAX = 3;
	
	public MobilePhone() {
		this.picCnt = 0;
	}
	
	public MobilePhone(String no) {
		super(no);
		this.picCnt = 0;
	}
	
	public boolean shotPic(String obj) {
		if(this.picCnt < this.PIC_CNT_MAX) {
			System.out.println(obj + "の写真を撮りました。");
			picCnt++;
			return true;
		}
		else {
			System.out.println("写真の保管できる容量を超えています。");
			return false;
		}
	}
	
	public void call(String no) {
		System.out.println("携帯電話の" + super.no + "は、"
				+ no + "に電話をしました。");
	}

}
