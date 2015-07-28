package lib;

public class read {

	String readDate = "";
	int read = 0;
	
	public void readRead(){
		
		System.out.println("いつの内容を参照しますか 指定[年/月/日]、全て[0]");
		readDate = Input.getString();
		if(readDate.equals("0")){
			for(int k = 0; k < arrayList.date.size() ;k++){
				System.out.println("入力番号：" + k);
				System.out.println("日時：" + arrayList.date.get(k) + "　" + arrayList.time.get(k) + "時");
				System.out.println("用途：" + arrayList.what.get(k));
				System.out.println("金額：￥" + (arrayList.receive.get(k) + (-arrayList.spend.get(k))));
				System.out.println("-------------------------------");
			}

		}else {
			read = arrayList.date.indexOf(readDate);
			System.out.println("入力番号：" + read);//確認用
			System.out.println("日時：" + arrayList.date.get(read) + "　" + arrayList.time.get(read) + "時");
			System.out.println("用途：" + arrayList.what.get(read));
			System.out.println("金額：￥" + (arrayList.receive.get(read) + (-arrayList.spend.get(read))));
	
		}
	}


}
