

import lib.Input;

public class Create {
	
	int confirm = 0;
	while(confirm == 0){
		System.out.println("いつ？");
		//System.out.println(confirm); //確認用
		date.add(Input.getString());
		System.out.println("何時？");
		time.add(Input.getString());
		System.out.println("なにに？");
		what.add(Input.getString());
		//System.out.println("遣った？[m]、貰った？[p]");
		//or = Input.getString();
		//if(or == "m"){
			System.out.println("いくら遣った？");
			spend.add(Input.getInt());
	
		//}else if(or == "p"){
			System.out.println("いくら貰った？");
			receive.add(Input.getInt());
	
		//}
	
			System.out.println("-----入力内容-----");
			System.out.println("日時:" + date.get(i) + "　" + time.get(i) + "時");
			System.out.println("用途:" + what.get(i));
			System.out.println("金額:￥" + (receive.get(i) - (spend.get(i))));
			System.out.println("よろしいですか はい[1] いいえ[0]");
			confirm = Input.getInt();
			if(confirm == 1){
				i++;
			}
	
	
	
	

}
