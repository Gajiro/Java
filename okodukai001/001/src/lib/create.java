package lib;

public class create {
		int confirm = 0;
	
	public void createInput(){
		while(confirm == 0){
			String whatDate = null;
			String whatTime = null;
			String whatWhat = null;
			int tempSpend = 0;
			int tempReceive = 0;
			
			System.out.println("いつ？ 例)2015/07/20");
			whatDate = Input.getString();
			System.out.println("何時？ 例)16:00");
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
			System.out.println("番号 |        日付       |  金額  |  残金  |  用途");
			System.out.println("  " + arrayList.date.size() + "    " + whatDate + "  " + whatTime + "   "  + (tempReceive - (tempSpend)) + "      " + (subject.money +(tempReceive - (tempSpend))) + "    " + whatWhat);
			/*System.out.println("用途:" + whatWhat);
			System.out.println("金額:￥" + (tempReceive - (tempSpend)));*/
			System.out.println("よろしいですか はい[1] いいえ[0]");
			confirm = Input.getInt();
			if(confirm == 1){
				arrayList.date.add(whatDate);
				arrayList.time.add(whatTime);
				arrayList.what.add(whatWhat);
				arrayList.spend.add(tempSpend);
				arrayList.receive.add(tempReceive);
				subject.money += (tempReceive - (tempSpend));
			}
		}
	}
	
}
