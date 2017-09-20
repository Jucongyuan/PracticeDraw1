package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;

public class Practice8DrawArcView extends View {
    private Paint paint;
    private RectF rectF;

    public Practice8DrawArcView(Context context) {
        super(context);
        init();
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        rectF = new RectF();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        rectF.left = canvas.getWidth() / 2 - 200;
        rectF.top = 380;
        rectF.right = canvas.getWidth() / 2 + 200;
        rectF.bottom = 680;

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        canvas.drawArc(rectF, -180, 70, false, paint);

        rectF.left += 50;
        rectF.right += 50;
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(rectF, -20, -100, true, paint);

        rectF.left -= 50;
        rectF.right -= 50;
        rectF.top += 50;
        canvas.drawArc(rectF, 0, 180, true, paint);

    }
}
