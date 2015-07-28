import lib.Input;
import lib.create;
import lib.delete;
import lib.read;
import lib.subject;
import lib.update;

public class okodukai001 {
	public static void main (String[] args){

		int or = 0;
		int operate = 0;

		subject subject00 = new subject();

		while(operate != 5){
			subject00.printSubject();
			System.out.println("残金：￥" + subject.money);
			System.out.println("操作を選んでください 入力[1] 参照[2] 更新[3] 消去[4] 終了[5]");
			operate = Input.getInt();

			if(operate == 1){
				create create00 = new create();
				create00.createInput();
			}else if(operate == 2){
				read read00 = new read();
				read00.readRead();
				
			}else if(operate == 3){
				update update00 = new update();
				update00.doUpdate();
				
			}else if(operate == 4){
				delete delete00 = new delete();
				delete00.doDelete();
				
			}


		}

	}

}