package gongxun.learnsurfaceview03;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gongxun on 2017/12/1.
 * Description:
 */

public class Container {
    public List<Container> children = null;

    public Container() {
        children = new ArrayList<>();
    }

    public void draw(Canvas canvas) {
        childrenView(canvas);
        for (Container c : children) {
            c.draw(canvas);
        }
    }

    public void childrenView(Canvas canvas) {

    }

    public void addChildrenView(Container child) {
        children.add(child);
    }

    public void removeChildrenView(Container child) {
        children.remove(child);
    }

}
