
public class Main2 {
	public static void main(String[] args) {
		MobilePhone denwa = new MobilePhone();

		System.out.println("写真の枚数は、" 
					+ denwa.picCnt + "枚です。");

		denwa.shotPic("犬");
		denwa.shotPic("猫");

		System.out.println("写真の枚数は、" 
				+ denwa.picCnt + "枚です。");
		
	}
}
