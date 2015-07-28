package lib;

public class delete {
	
	String readDate = "";
	int read = 0;
	int deleteData = 0;
	
	public void doDelete(){
				System.out.println("削除する日時を指定してください");
				readDate = Input.getString();
				read = arrayList.date.indexOf(readDate);
				System.out.println("日時：" + arrayList.date.get(read) + "　" + arrayList.time.get(read) + "時");
				System.out.println("用途：" + arrayList.what.get(read));
				System.out.println("金額：￥" + (arrayList.receive.get(read) + (-arrayList.spend.get(read))));
				
				System.out.println("削除しますか はい[111] いいえ[0]");
				deleteData = Input.getInt();
				if(deleteData == 111){
					arrayList.date.remove(read);
					arrayList.time.remove(read);
					arrayList.what.remove(read);
					arrayList.receive.remove(read);
					arrayList.spend.remove(read);
					
				}
	}

}
