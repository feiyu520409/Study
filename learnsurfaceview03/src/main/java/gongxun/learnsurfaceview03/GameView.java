package gongxun.learnsurfaceview03;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by gongxun on 2017/12/1.
 * Description:
 */

public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    private Container container;
    private Rect rect;
    private Circle circle;

    public GameView(Context context) {
        super(context);
        container = new Container();
        rect = new Rect();
        circle = new Circle();
        rect.addChildrenView(circle);
        container.addChildrenView(rect);
        getHolder().addCallback(this);
    }


    public void draw() {
        Canvas canvas = getHolder().lockCanvas();
        canvas.drawColor(Color.WHITE);
        container.draw(canvas);
        getHolder().unlockCanvasAndPost(canvas);


    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        draw();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
