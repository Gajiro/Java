import java.util.ArrayList;

import lib.Input;

public class okodukai {

		public static void main (String[] args){
			ArrayList date    = new ArrayList();
			ArrayList time    = new ArrayList();
			ArrayList what    = new ArrayList();
			ArrayList<Integer> money   = new ArrayList<Integer>();
			ArrayList<Integer> receive = new ArrayList<Integer>();
			ArrayList<Integer> spend   = new ArrayList<Integer>();
			int or = 0;
			String subject ="";
			int operate = 0;
			int i = 0;

			while(operate != 5){
				System.out.println("-----御小遣帳-----");
				System.out.println("<<今月の目標：" + subject + ">>");
				System.out.println("操作を選んでください 入力[1] 参照[2] 更新[3] 消去[4] 終了[5]");
				operate = Input.getInt();


				if(subject == ""){
					System.out.println("今月の目標を設定してください");
					subject = Input.getString();
				}

				if(operate == 1){
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

				}

				String readDate = "";
				int read = 0;
				if(operate == 2){
					System.out.println("いつの内容を参照しますか 指定[年/月/日]、全て[a]");
					readDate = Input.getString();
					if(readDate != "a"){
						read = date.indexOf(readDate);
						//System.out.println(date.get(read));//確認用
						System.out.println("日時：" + date.get(read) + "　" + time.get(read) + "時");
						System.out.println("用途：" + what.get(read));
						System.out.println("金額：￥" + (receive.get(read) + (-spend.get(read))));
					}else {



					}

				}

			}







	}




}
