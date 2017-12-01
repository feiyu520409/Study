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
    private float x = 0, y = 0;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Rect() {
        paint = new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    public void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.translate(getX(), getY());
        canvas.drawRect(0, 0, 100, 100, paint);
        this.setX(getX() + 1);
    }
}
