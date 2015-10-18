// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.view.View;
import android.view.View$MeasureSpec;
import android.app.Activity;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;

public class ConversationRowVideo$RowVideoView extends ImageView
{
    private Shader a;
    private RectF b;
    private Shader c;
    private Paint d;
    private Drawable e;
    private Shader f;
    private Shader g;
    
    public ConversationRowVideo$RowVideoView(final Context context) {
        super(context);
        this.d = new Paint(1);
        this.b = new RectF();
    }
    
    public ConversationRowVideo$RowVideoView(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new Paint(1);
        this.b = new RectF();
    }
    
    public ConversationRowVideo$RowVideoView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = new Paint(1);
        this.b = new RectF();
    }
    
    public void onDraw(final Canvas canvas) {
        final boolean i = App.I;
        super.onDraw(canvas);
        final float n = 24.0f * vc.b().b;
        final float n2 = this.getHeight() - n;
        final int width = this.getWidth();
        final float n3 = 30.0f * vc.b().b;
        final int n4 = (int)(n2 / n3);
        final float n5 = n2 / n4;
        this.b.set(0.0f, 0.0f, n3, (float)this.getHeight());
        this.d.setColor(1711276032);
        this.d.setStyle(Paint$Style.FILL);
        this.d.setShader(this.f);
        canvas.drawRect(this.b, this.d);
        this.b.set(width - n3, 0.0f, (float)width, (float)this.getHeight());
        canvas.drawRect(this.b, this.d);
        this.d.setShader(this.c);
        float n6 = 0.0f;
        while (n6 < n4) {
            final float n7 = n6 * n5;
            this.b.set(n3 / 4.0f, n7 + n5 / 2.0f - n3 / 4.0f, 3.0f * n3 / 4.0f, n7 + n5 / 2.0f + n3 / 4.0f);
            this.d.setColor(-1712062488);
            this.d.setStyle(Paint$Style.FILL);
            canvas.drawRoundRect(this.b, n3 / 12.0f, n3 / 12.0f, this.d);
            this.b.offset(width - n3, 0.0f);
            this.d.setColor(-1712062488);
            this.d.setStyle(Paint$Style.FILL);
            canvas.drawRoundRect(this.b, n3 / 12.0f, n3 / 12.0f, this.d);
            ++n6;
            if (i) {
                break;
            }
        }
        this.d.setShader(this.g);
        float n8 = 0.0f;
        while (n8 < n4) {
            final float n9 = n8 * n5;
            this.b.set(n3 / 4.0f, n9 + n5 / 2.0f - n3 / 4.0f, 3.0f * n3 / 4.0f, n9 + n5 / 2.0f + n3 / 4.0f);
            this.d.setColor(-1724697805);
            this.d.setStyle(Paint$Style.STROKE);
            this.d.setStrokeWidth(n3 / 32.0f);
            canvas.drawRoundRect(this.b, n3 / 12.0f, n3 / 12.0f, this.d);
            this.b.offset(width - n3, 0.0f);
            this.d.setColor(-1724697805);
            this.d.setStyle(Paint$Style.STROKE);
            this.d.setStrokeWidth(n3 / 32.0f);
            canvas.drawRoundRect(this.b, n3 / 12.0f, n3 / 12.0f, this.d);
            ++n8;
            if (i) {
                break;
            }
        }
        this.d.setColor(1711276032);
        this.d.setShader(this.a);
        this.d.setStyle(Paint$Style.FILL);
        this.b.set(0.0f, this.getHeight() - n * 4.0f / 3.0f, (float)width, (float)this.getHeight());
        canvas.drawRect(this.b, this.d);
        if (this.e != null) {
            this.e.setBounds(0, 0, this.getWidth(), this.getHeight());
            this.e.draw(canvas);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final View decorView = ((Activity)this.getContext()).getWindow().getDecorView();
        final int n3 = 70 * Math.min(decorView.getWidth(), decorView.getHeight()) / 100;
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(n3, 1073741824), View$MeasureSpec.makeMeasureSpec(n3, 1073741824));
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final float n5 = 24.0f * vc.b().b;
        this.f = (Shader)new LinearGradient(0.0f, n2 - 2.0f * n5, 0.0f, n2 - 3.0f * n5 / 4.0f, -16777216, 0, Shader$TileMode.CLAMP);
        this.c = (Shader)new LinearGradient(0.0f, n2 - 2.0f * n5, 0.0f, n2 - 3.0f * n5 / 4.0f, -1712062488, 0, Shader$TileMode.CLAMP);
        this.g = (Shader)new LinearGradient(0.0f, n2 - 2.0f * n5, 0.0f, n2 - 3.0f * n5 / 4.0f, -1724697805, 0, Shader$TileMode.CLAMP);
        this.a = (Shader)new LinearGradient(0.0f, n2 - 4.0f * n5 / 3.0f, 0.0f, (float)n2, 0, -16777216, Shader$TileMode.CLAMP);
    }
    
    public void setFrameDrawable(final Drawable e) {
        this.e = e;
    }
}
