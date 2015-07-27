package lib;

public class subject {
	
	String subject ="";
	
	public void printSubject()
	{
	System.out.println("-----御小遣帳-----");
	System.out.println("<<今月の目標：" + subject + ">>");
	if(subject == ""){
		System.out.println("今月の目標を設定してください");
		subject = Input.getString();
	}
	}

}
