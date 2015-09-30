package jp.co.july.tokyo.warikan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by kato.yuzo on 2015/09/30.
 */



    public class TestView extends View {
        Paint paint;

        public TestView(Context context, AttributeSet attrs) {

            super(context, attrs);
            paint = new Paint();
        }

        @Override
        protected void onDraw(Canvas canvas) {

            // 背景、半透明
            //canvas.drawColor(Color.argb(125, 0, 0, 255));


            // 矩形
            paint.setColor(Color.argb(255, 255, 0, 255));
            paint.setStyle(Paint.Style.STROKE);
            // (x1,y1,x2,y2,paint) 左上の座標(x1,y1), 右下の座標(x2,y2)
            canvas.drawRect(150, 100, 150, 150, paint);



        }
}
