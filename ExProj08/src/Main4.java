
public class Main4 {

	public static void main(String[] args) {
		MobilePhone denwa1 = new MobilePhone("090-1234-5678");
		Phone denwa2 = new Phone("024-1234-5678");
		String no;
		
		System.out.print("相手の電話番号：");
		no = new java.util.Scanner(System.in).nextLine();
		denwa1.call(no);
		denwa2.call(no);
	}

}
