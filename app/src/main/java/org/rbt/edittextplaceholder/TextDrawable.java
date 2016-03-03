package org.rbt.edittextplaceholder;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

/**
 * Created by saikrishna.pawar on 03/03/16.
 */
public class TextDrawable extends Drawable {

    private final String text;
    private final Paint paint;

    public TextDrawable(String text) {
        this.text = text;
        this.paint = new Paint();
        paint.setColor(Color.BLACK); //This changes the color of the "$"
        paint.setTextSize(54f); //This method changes the text size. Increase or decrease it accordingly.
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.LEFT);
    }

    @Override
    public void draw(Canvas canvas) {
        //This method takes four parameters. 2nd and 3rd parameter are for x and y positions of the text.
        //Change the y parameter, in order to bring the "$" at the center of the edit text.
        canvas.drawText(text, 0, 22, paint);
    }

    @Override
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        paint.setColorFilter(cf);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
