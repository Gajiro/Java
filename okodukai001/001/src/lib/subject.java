package lib;

public class subject {
	
	String subject ="";
	int confirmSub = 0;
	public static int money = 0;

	
	public void printSubject()
	{
		
		System.out.println("-----御小遣帳-----");
		System.out.println("<<今月の目標：" + subject + ">>");
		while(confirmSub == 0){
			System.out.println("今月の目標を設定してください");
			subject = Input.getString();
			System.out.println("現在の残金を入力してください");
			money = Input.getInt();
			
			System.out.println("今月の目標：" + subject);
			System.out.println("　残　金　：￥" + money);
			System.out.println("以上でよろしいですか はい[1] いいえ[0]");
			confirmSub = Input.getInt();
			System.out.println("<<今月の目標：" + subject + ">>");

			
		}
	}

}
