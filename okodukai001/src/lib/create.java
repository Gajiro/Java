package lib;

public class create {
	
	/*arrayList dateInp = new arrayList();
	arrayList timeInp = new arrayList();
	arrayList whatInp = new arrayList();
	arrayList spendInp = new arrayList();
	arrayList receiveInp = new arrayList();*/

	int i = 0;

	public void createInput(){
		int confirm = 0;
		while(confirm == 0){
			System.out.println("いつ？");
			//System.out.println(confirm); //確認用
			arrayList.date.add(Input.getString());
			System.out.println("何時？");
			arrayList.time.add(Input.getString());
			System.out.println("なにに？");
			arrayList.what.add(Input.getString());
			//System.out.println("遣った？[m]、貰った？[p]");
			//or = Input.getString();
			//if(or == "m"){
				System.out.println("いくら遣った？");
				arrayList.spend.add(Input.getInt());
		
			//}else if(or == "p"){
				System.out.println("いくら貰った？");
				arrayList.receive.add(Input.getInt());
		
			//}
		
				System.out.println("-----入力内容-----");
				System.out.println("日時:" + arrayList.date.get(i) + "　" + arrayList.time.get(i) + "時");
				System.out.println("用途:" + arrayList.what.get(i));
				System.out.println("金額:￥" + (arrayList.receive.get(i) - (arrayList.spend.get(i))));
				System.out.println("よろしいですか はい[1] いいえ[0]");
				confirm = Input.getInt();
				if(confirm == 1){
					i++;
			}
		}
	}
	
}
