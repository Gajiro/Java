package lib;

public class read {

	String readDate = "";
	int read = 0;
	
	public void readRead(){
		
		System.out.println("いつの内容を参照しますか 年月日指定[年/月/日]、入力番号指定[num]、全て[all]");
		readDate = Input.getString();
		if(readDate.equals("all")){
			System.out.println("番号 |        日付       |  金額  |  用途");
			for(int k = 0; k < arrayList.date.size() ;k++){
				System.out.println("  " + k + "    " + arrayList.date.get(k) +
						"  " + arrayList.time.get(k) + "   "  + (arrayList.receive.get(k) + (-arrayList.spend.get(k))) +
						"      " +  arrayList.what.get(k));
				
				/*　旧式　System.out.println("入力番号：" + k);
				System.out.println("日時：" + arrayList.date.get(k) + "　" + arrayList.time.get(k) + "時");
				System.out.println("用途：" + arrayList.what.get(k));
				System.out.println("金額：￥" + (arrayList.receive.get(k) + (-arrayList.spend.get(k))));
				System.out.println("-------------------------------");*/
			}

		}else if(readDate.equals("num")){
			System.out.println("入力番号を指定してください");
			read = Input.getInt();
			System.out.println("入力番号：" + read);//確認用
			System.out.println("日時：" + arrayList.date.get(read) + "　" + arrayList.time.get(read) + "時");
			System.out.println("用途：" + arrayList.what.get(read));
			System.out.println("金額：￥" + (arrayList.receive.get(read) + (-arrayList.spend.get(read))));
	
		}else {
			read = arrayList.date.indexOf(readDate);
			System.out.println("入力番号：" + read);//確認用
			System.out.println("日時：" + arrayList.date.get(read) + "　" + arrayList.time.get(read) + "時");
			System.out.println("用途：" + arrayList.what.get(read));
			System.out.println("金額：￥" + (arrayList.receive.get(read) + (-arrayList.spend.get(read))));
			
		}
	}


}
