package gongxun.learnsurfaceview03;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by gongxun on 2017/12/1.
 * Description:
 */

public class Circle extends Container {
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

    public Circle() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    public void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.translate(getX(), getY());
        canvas.drawCircle(50, 50, 50, paint);
        this.setY(getY() + 1);
    }
}
