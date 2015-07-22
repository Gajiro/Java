
import lib.Input;

public class Dentaku01{
	public static void main(String[] args){
	int n; //キーボード入力された数値を格納
	int total = 0; //合計計算用変数を0で初期化
	//nが0でなければ処理を繰り返す
	//（nに0か文字以外が入力されるとn=0になる）
	while((n = Input.getInt()) != 0){
	total += n;
	}
		System.out.println("合計:" + total);
	}
}