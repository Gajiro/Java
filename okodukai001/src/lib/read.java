package lib;

public class read {
	/*
	arrayList dateInp = new arrayList();
	arrayList timeInp = new arrayList();
	arrayList whatInp = new arrayList();
	arrayList spendInp = new arrayList();
	arrayList receiveInp = new arrayList();
	*/
	String readDate = "";
	int read = 0;
	
	public void readRead(){
		
		System.out.println("いつの内容を参照しますか 指定[年/月/日]、全て[a]");
		readDate = Input.getString();
		if(readDate != "9"){
			read = arrayList.date.indexOf(readDate);
			System.out.println(arrayList.date.get(read));//確認用
			System.out.println("日時：" + arrayList.date.get(read) + "　" + arrayList.time.get(read) + "時");
			System.out.println("用途：" + arrayList.what.get(read));
			System.out.println("金額：￥" + (arrayList.receive.get(read) + (-arrayList.spend.get(read))));
		}else {
	
	
	
		}
	}


}
