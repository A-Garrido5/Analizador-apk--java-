// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView$BufferType;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.content.Context;
import android.text.TextPaint;
import android.widget.TextView;

public class CondensedTextView extends TextView
{
    private TextPaint a;
    private float b;
    
    public CondensedTextView(final Context context) {
        super(context);
        this.b = 0.8f;
    }
    
    public CondensedTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0.8f;
    }
    
    public CondensedTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = 0.8f;
    }
    
    private void a(final String s) {
        final boolean i = App.I;
        if (this.a == null || this.a.getTextSize() != this.getPaint().getTextSize()) {
            (this.a = new TextPaint((Paint)this.getPaint())).setTextScaleX(1.0f);
        }
        final float measureText = this.a.measureText(s);
        if (measureText > 0.0f) {
            final int n = this.getMeasuredWidth() - this.getCompoundPaddingLeft() - this.getCompoundPaddingRight();
            if (n > 0) {
                final float n2 = n / measureText;
                if (n2 < 1.0f) {
                    float max = Math.max(this.b, n2);
                    this.setTextScaleX(max);
                    float n3 = this.getPaint().measureText(s);
                    while (n3 > n && max > this.b) {
                        max *= 0.99f;
                        this.setTextScaleX(max);
                        n3 = this.getPaint().measureText(s);
                        if (i) {
                            break;
                        }
                    }
                    this.setSingleLine(true);
                    this.setHorizontallyScrolling(false);
                    if (!i) {
                        return;
                    }
                }
                if (this.getTextScaleX() != 1.0f) {
                    this.setTextScaleX(1.0f);
                }
            }
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3 || n2 != n4) {
            this.a(this.getText().toString());
        }
    }
    
    protected void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        this.a(this.getText().toString());
    }
    
    public void setText(final CharSequence charSequence, final TextView$BufferType textView$BufferType) {
        super.setText(charSequence, textView$BufferType);
        this.a(charSequence.toString());
    }
    
    public void setTextSize(final int n, final float n2) {
        super.setTextSize(n, n2);
        this.a.setTextSize(this.getPaint().getTextSize());
        this.a(this.getText().toString());
    }
}
