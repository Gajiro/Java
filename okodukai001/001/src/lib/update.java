package lib;

public class update {
	
	String readDate = "";
	int read = 0;
	int confirm = 0;
	
	public void doUpdate(){
		while(confirm == 0){
			System.out.println("更新する日時[年/月/日]か入力番号[num]を指定してください。もしくはメニュー[menu]に戻ります");
			readDate = Input.getString();
			
			if(readDate.equals("num")){
				//同日だとデータがいじれないので入力番号を使わざるをえない
				System.out.println("入力番号を数値で指定してください");
				read = Input.getInt();
				System.out.println("日時：" + arrayList.date.get(read) + "　" + arrayList.time.get(read) + "時");
				System.out.println("用途：" + arrayList.what.get(read));
				System.out.println("金額：￥" + (arrayList.receive.get(read) + (-arrayList.spend.get(read))));
				
				
			}else if(readDate.equals("menu")){
				
				break; //更新しないでメニューに戻る場合
				
			}else {
				read = arrayList.date.indexOf(readDate);
				System.out.println("日時：" + arrayList.date.get(read) + "　" + arrayList.time.get(read) + "時");
				System.out.println("用途：" + arrayList.what.get(read));
				System.out.println("金額：￥" + (arrayList.receive.get(read) + (-arrayList.spend.get(read))));
				
			}
			System.out.println("以下のように変更します");
			String whatDate = null;
			String whatTime = null;
			String whatWhat = null;
			int tempSpend = 0;
			int tempReceive = 0;
			
			System.out.println("いつ？");
			whatDate = Input.getString();
			System.out.println("何時？");
			whatTime = Input.getString();
			System.out.println("なにに？");
			whatWhat = Input.getString();
			//System.out.println("遣った？[m]、貰った？[p]");
			//or = Input.getString();
			//if(or == "m"){
			System.out.println("いくら遣った？");
			tempSpend = Input.getInt();
		
			//}else if(or == "p"){
			System.out.println("いくら貰った？");
			tempReceive = Input.getInt();
		
			//}
		
			System.out.println("-----入力内容-----");
			System.out.println("日時:" + whatDate + "　" + whatTime + "時");
			System.out.println("用途:" + whatWhat);
			System.out.println("金額:￥" + (tempReceive - (tempSpend)));
			System.out.println("更新してよろしいですか はい[1] いいえ[0]");
			confirm = Input.getInt();
			if(confirm == 1){
				subject.money += (tempReceive - (tempSpend));
				subject.money += (arrayList.spend.get(read) - (arrayList.receive.get(read)));
				arrayList.date.set(read , whatDate);
				arrayList.time.set(read ,whatTime);
				arrayList.what.set(read ,whatWhat);
				arrayList.spend.set(read ,tempSpend);
				arrayList.receive.set(read ,tempReceive);
				
			}
		}	
		
	}
	

}
