package gongxun.learnsurfaceview03;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by gongxun on 2017/12/1.
 * Description:
 */

public class Rect extends Container {
    private Paint paint = null;

    public Rect() {
        paint = new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    public void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.drawRect(0, 0, 100, 100, paint);
    }
}
