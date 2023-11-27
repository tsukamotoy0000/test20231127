
public class Main {

	public static void main(String[] args) {
		MobilePhone denwa = new MobilePhone();
		String no;

		System.out.print("自分の電話番号：");
		no = new java.util.Scanner(System.in).nextLine();
		denwa.no = no;
		
		System.out.print("相手の電話番号：");
		no = new java.util.Scanner(System.in).nextLine();
		denwa.call(no);
	}

}
