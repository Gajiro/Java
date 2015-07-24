import lib.SimpleClass;

public class prac001 {

	public static void main (String[] args){
		
		SimpleClass ref;
		//SimpleClassクラスの参照型変数refをつくる
		
		//SimpleClassクラスのインスタンスを作り
		//その参照をref変数にいれる
		ref = new SimpleClass();
		
		//ref変数内の参照を通して、SimpleClassクラスの
		//インスタンスに入っているdataフィールドに
		//数値を入れる
		ref.data = 100;
		
		//それを取り出して出力
		System.out.println( ref.data);
	}
	
}
