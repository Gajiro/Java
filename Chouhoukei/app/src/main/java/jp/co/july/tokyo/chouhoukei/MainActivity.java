package jp.co.july.tokyo.chouhoukei;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener
{
    private String[][] keyName = {
            { "C", "AC", "*", "+" },
            { "%", "√", "÷", "-" },
            { "7", "8", "9","=" },
            { "4", "5", "6", "MR"},
            { "1", "2", "3", "M+" },
            { "±", "0", ".", "M-" } };

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        // setContentView(R.layout.main);

        // 全体のレイアウト 垂直方向に並べる
        LinearLayout layout0 = new LinearLayout( this );
        layout0.setOrientation( LinearLayout.VERTICAL );
        layout0.setLayoutParams( new LayoutParams( LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT ) );
        setContentView( layout0 );

        // 電卓表示器
        TextView display = new TextView( this );
        display.setText( "9876543210" );
        display.setTextSize( 30.0f );
        display.setTextColor( Color.rgb( 0x50, 0x50, 0x50 ) );
        display.setBackgroundColor( Color.rgb( 0xee, 0xee, 0xee ) );
        display.setGravity( Gravity.RIGHT );    // 右詰め
        display.setLayoutParams( new LayoutParams( LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT ) );
        layout0.addView( display );

        // 電卓ボタン 6x4=24キー定義
        TableLayout layout = new TableLayout( this );

        TableLayout.LayoutParams lp = new TableLayout.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableLayout.LayoutParams.MATCH_PARENT, 1 );

        layout0.addView( layout, lp );

        // Buttonの6x4を作成
        TableRow.LayoutParams lpRow = new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.MATCH_PARENT, 1 );
        // lpRow.setMargins( 5, 5, 5, 5 );
        for ( int row = 0; row < 6; row++ )
        {
            // TableRowを作成
            TableRow tRow = new TableRow( this );
            tRow.setLayoutParams( lp );

            // この行に４個割付
            for ( int col = 0; col < 4; col++ )
            {
                Button btn = new Button( this );
                btn.setText( keyName[row][col] );
                btn.setOnClickListener( this );
                //btn.setText( String.format( "%d", row * 4 + col ) );
                // btn.setTextSize( 50 );
                tRow.addView( btn, lpRow );
            }
            layout.addView( tRow );
        }
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.main, menu );
        return true;
    }

    @Override
    public void onClick( View v )
    {
        String nm = ((Button)v).getText().toString();
        System.out.println( "onClick=" + nm );
    }
}