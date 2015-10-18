// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import com.whatsapp.DialogToastActivity;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.text.TextPaint;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.View;

public class ZoomOverlay extends View
{
    private static final String[] z;
    private Paint a;
    private RectF b;
    private TextPaint c;
    private float d;
    private Runnable e;
    private float f;
    
    static {
        final String[] z2 = new String[3];
        String s = "M\u001ay`\u0011";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '!';
                        break;
                    }
                    case 0: {
                        c2 = '5';
                        break;
                    }
                    case 1: {
                        c2 = '*';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = 'N';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "M\u001ay`\u0011";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0010\u0004x(";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ZoomOverlay(final Context context) {
        super(context);
        this.b = new RectF();
        this.a = new Paint(1);
        this.c = new TextPaint(1);
        this.e = new a9(this);
    }
    
    public ZoomOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new RectF();
        this.a = new Paint(1);
        this.c = new TextPaint(1);
        this.e = new a9(this);
    }
    
    public ZoomOverlay(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new RectF();
        this.a = new Paint(1);
        this.c = new TextPaint(1);
        this.e = new a9(this);
    }
    
    public float a() {
        return 0.9f * Math.min(this.getWidth() / 2, this.getHeight() / 2) / this.c.measureText(ZoomOverlay.z[0]);
    }
    
    public void a(final float f) {
        this.setVisibility(0);
        this.f = f;
        this.invalidate();
        this.removeCallbacks(this.e);
    }
    
    public void a(final float f, final float d) {
        this.f = f;
        this.d = d;
        this.invalidate();
    }
    
    public void b() {
        this.invalidate();
        this.postDelayed(this.e, 300L);
    }
    
    public void onDraw(final Canvas canvas) {
        final boolean m = CameraActivity.m;
        this.a.setStrokeWidth(this.getContext().getResources().getDimension(2131361868));
        this.a.setStyle(Paint$Style.STROKE);
        this.a.setColor(-1711276033);
        final int n = this.getWidth() / 2;
        final int n2 = this.getHeight() / 2;
        float n3 = 0.9f * Math.min(n, n2);
        this.b.set(n - n3, n2 - n3, n3 + n, n3 + n2);
        canvas.drawOval(this.b, this.a);
        final float dimension = this.getResources().getDimension(2131361797);
        this.c.setTextSize(dimension);
        this.c.setColor(-1711276033);
        this.c.setTextAlign(Paint$Align.CENTER);
        this.c.setFakeBoldText(true);
        canvas.drawText("x" + String.format(ZoomOverlay.z[2], this.d), (float)n, n2 + dimension / 2.0f, (Paint)this.c);
        final float measureText = this.c.measureText(ZoomOverlay.z[1]);
        this.b.set(n - measureText, n2 - measureText, measureText + n, measureText + n2);
        canvas.drawOval(this.b, this.a);
        final float n4 = measureText * this.f;
        if (n4 <= n3) {
            n3 = n4;
        }
        this.a.setColor(-13388315);
        this.b.set(n - n3, n2 - n3, n3 + n, n3 + n2);
        canvas.drawOval(this.b, this.a);
        if (m) {
            DialogToastActivity.h = !DialogToastActivity.h;
        }
    }
}
