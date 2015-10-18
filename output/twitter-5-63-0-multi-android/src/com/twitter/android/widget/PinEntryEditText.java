// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Canvas;
import android.text.method.MovementMethod;
import android.text.TextWatcher;
import com.twitter.ui.widget.ag;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.widget.EditText;

public class PinEntryEditText extends EditText
{
    private Paint a;
    private Paint b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private ea h;
    
    public PinEntryEditText(final Context context) {
        super(context);
        this.a();
    }
    
    public PinEntryEditText(final Context context, final AttributeSet set) {
        super(context, set);
        this.a();
    }
    
    public PinEntryEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a();
    }
    
    private float a(final float n) {
        return n * this.getContext().getResources().getDisplayMetrics().density;
    }
    
    private void a() {
        (this.a = new Paint()).setStyle(Paint$Style.STROKE);
        this.a.setColor(this.getCurrentTextColor());
        this.a.setTextSize(this.getTextSize());
        this.a.setTypeface(ag.a(this.getContext()).a);
        this.a.setAntiAlias(true);
        (this.b = new Paint()).setStyle(Paint$Style.STROKE);
        this.b.setColor(this.getCurrentTextColor());
        this.b.setStrokeWidth(this.a(1.0f));
        this.b.setAntiAlias(true);
        this.c = this.a(40.0f);
        this.d = this.c / 2.0f;
        this.e = this.a(7.0f);
        this.f = 6.0f * (this.c + this.e) - this.e;
        this.g = this.a.measureText("0") / 2.0f;
        this.addTextChangedListener((TextWatcher)new dz(this));
        this.setMovementMethod((MovementMethod)null);
        this.setFocusable(true);
    }
    
    private void a(final Canvas canvas, final char c, final float n, final float n2) {
        canvas.drawText(Character.toString(c), n, n2, this.a);
    }
    
    private void a(final Canvas canvas, final float n, final float n2) {
        canvas.drawLine(n, n2, n + this.c, n2, this.b);
    }
    
    protected void onDraw(final Canvas canvas) {
        final String string = this.getText().toString();
        int i = string.length();
        for (int j = 0; j < i; ++j) {
            this.a(canvas, string.charAt(j), this.d - this.g + (this.c + this.e) * j, 0.75f * this.c);
        }
        while (i < 6) {
            this.a(canvas, (this.c + this.e) * i, this.d);
            ++i;
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension((int)this.f, (int)this.c);
    }
    
    protected void onSelectionChanged(final int n, final int n2) {
        final int length = this.length();
        if (n != length || n2 != length) {
            this.setSelection(length);
        }
        super.onSelectionChanged(n, n2);
    }
    
    public void setOnFilledInputListener(final ea h) {
        this.h = h;
    }
}
