package lib;

public class update {
	
	String readDate = "";
	int read = 0;
	int confirm = 0;
	
	public void doUpdate(){
		while(confirm == 0){
			System.out.println("更新する日時を指定してください");
			readDate = Input.getString();
			read = arrayList.date.indexOf(readDate);
			System.out.println("日時：" + arrayList.date.get(read) + "　" + arrayList.time.get(read) + "時");
			System.out.println("用途：" + arrayList.what.get(read));
			System.out.println("金額：￥" + (arrayList.receive.get(read) + (-arrayList.spend.get(read))));
			
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
				arrayList.date.set(read , whatDate);
				arrayList.time.set(read ,whatTime);
				arrayList.what.set(read ,whatWhat);
				arrayList.spend.set(read ,tempSpend);
				arrayList.receive.set(read ,tempReceive);
			}
		}	
		
	}
	

}
