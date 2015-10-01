package jp.co.july.tokyo.warikan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Globals globals;



    //private TestView testView; 意味なし



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            Button btn = (Button)findViewById(R.id.btnCalc);
            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // オブジェクトを取得
                    EditText etxtNum = (EditText) findViewById(R.id.eTxtNum);
                    EditText etxtMoney = (EditText) findViewById(R.id.eTxtMoney);
                    TextView txtResult = (TextView) findViewById(R.id.txtResult);

                    // 設定を取得
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                    String frac = pref.getString(SettingPrefActivity.PREF_KEY_FRACTION, "500");
                    Boolean roundup = pref.getBoolean(SettingPrefActivity.PREF_KEY_ROUNDUP, false);
                    int fracVal = Integer.parseInt(frac);


                    // 入力内容を取得
                    String strNum = etxtNum.getText().toString();
                    String strMoney = etxtMoney.getText().toString();
                    //いきなりボタン押すとnull*nullで落ちるので入力を邪魔せずに0を入れる
                    if(strNum.equals("") || strMoney.equals("")){
                        strNum   = "0";
                        strMoney = "0";
                    }


                    // 数値に変換
                    int num   = Integer.parseInt(strNum);
                    int money = Integer.parseInt(strMoney);

                    globals = (Globals)getApplication();
                    globals.init();

                     globals.sideA = num;
                     globals.sideB = money;




                    //RectF rect = new RectF(100, 100, num, money);

                    // 計算
                    int result = globals.sideB * globals.sideA;

                    // 結果表示用テキストに設定
                    txtResult.setText(Integer.toString(result));

                }
            });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // 設定ボタン押下処理
                Intent intent = new Intent(MainActivity.this, SettingPrefActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}