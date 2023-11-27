
public class Main5 {

	public static void main(String[] args) {
		MobilePhone denwa = new MobilePhone("090-1234-5678");
		boolean flg = true;
		while(flg) {
			String obj;
			System.out.print("被写体：");
			obj = new java.util.Scanner(System.in).nextLine();
			flg = denwa.shotPic(obj);
		}
		
	}

}
