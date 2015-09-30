package jp.co.july.tokyo.testview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by kato.yuzo on 2015/09/30.
 */
public class TestView extends View{

    Paint paint;

    public TestView(Context context, AttributeSet attrs) {

        super(context, attrs);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        // 背景、半透明
        canvas.drawColor(Color.argb(125, 0, 0, 255));

        // 円
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        // (x1,y1,r,paint) 中心x1座標, 中心y1座標, r半径
        canvas.drawCircle(250, 250, 100, paint);

        // 矩形
        paint.setColor(Color.argb(255, 255, 0, 255));
        paint.setStyle(Paint.Style.STROKE);
        // (x1,y1,x2,y2,paint) 左上の座標(x1,y1), 右下の座標(x2,y2)
        canvas.drawRect(280, 280, 450, 480, paint);

        // 線
        paint.setStrokeWidth(15);
        paint.setColor(Color.argb(255, 0, 255, 120));
        // (x1,y1,x2,y2,paint) 始点の座標(x1,y1), 終点の座標(x2,y2)
        canvas.drawLine(150, 550, 350, 330, paint);

    }
}
