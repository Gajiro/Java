package jp.co.july.tokyo.stdweight;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * Created by kato.yuzo on 2015/09/26.
 */
public class StdWeightActivity {

    double stgWeight; //標準体重
    String stgWeightTxt; //メッセージ用のテキスト
    String errorMsg;
    DecimalFormat myFormat = new DecimalFormat("###.##");

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res = getResources();
        stdWeightTxt = res.getString(R.string.stdWeight);
        errorMsg = res.getString(R.string.errorMsg);

    }

    public void onClickButton(View view){
        EditText heightText = (EditText) findViewById(R.id.stdWeightText);
        String heightStr = heightText.getText().toString();

        TextView stdWeightTextView = (TextView) findViewById(R.id.stdWeightText);

        try{
            double height = Double.parseDouble(heightStr);
            stdWeight =Math.pow(height / 100, 2) * 22;
            String stdWeightStr = myFormat.format(stdWeight);
            stdWeightTextView.setText(stdWeightTxt + "Kg");

        }catch(NumberFormatException e){
            Toast.makeText(this, errorMsg, Toast.LENGTH_LONG).show();

        }

    }


}
