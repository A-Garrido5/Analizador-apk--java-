// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.Canvas;
import com.whatsapp.App;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatCheckBox;

public class RtlCheckBox extends AppCompatCheckBox
{
    private int a;
    private Drawable b;
    private int c;
    
    public RtlCheckBox(final Context context) {
        this(context, null);
    }
    
    public RtlCheckBox(final Context context, final AttributeSet set) {
        super(context, set);
        this.a();
    }
    
    public RtlCheckBox(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a();
    }
    
    private void a() {
        if (!App.ak()) {
            this.setBackgroundDrawable((Drawable)null);
            this.c = this.getPaddingLeft();
            this.a = this.getPaddingRight();
            final int min = Math.min(this.c, this.a);
            this.setPadding(min, this.getPaddingTop(), min, this.getPaddingBottom());
        }
    }
    
    @Override
    public int getCompoundPaddingLeft() {
        if (App.ak()) {
            return super.getCompoundPaddingLeft();
        }
        return super.getPaddingLeft();
    }
    
    public int getCompoundPaddingRight() {
        int n;
        if (App.ak()) {
            n = super.getCompoundPaddingRight();
        }
        else {
            n = super.getPaddingRight();
            final Drawable b = this.b;
            if (b != null) {
                return n + Math.max(this.c, b.getIntrinsicWidth());
            }
        }
        return n;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (!App.ak()) {
            final Drawable b = this.b;
            if (b != null) {
                final int n = 0x70 & this.getGravity();
                final int intrinsicHeight = b.getIntrinsicHeight();
                final int intrinsicWidth = b.getIntrinsicWidth();
                int n2 = 0;
                Label_0119: {
                    switch (n) {
                        case 80: {
                            n2 = this.getHeight() - intrinsicHeight;
                            if (Log.l) {
                                break Label_0119;
                            }
                            break;
                        }
                        case 16: {
                            n2 = (this.getHeight() - intrinsicHeight) / 2;
                            break;
                        }
                    }
                }
                b.setBounds(this.getWidth() - intrinsicWidth, n2, this.getWidth(), n2 + intrinsicHeight);
                b.draw(canvas);
            }
        }
    }
    
    @Override
    public void setButtonDrawable(final Drawable drawable) {
        if (App.ak()) {
            super.setButtonDrawable(drawable);
            if (!Log.l) {
                return;
            }
        }
        this.b = drawable;
        super.setButtonDrawable((Drawable)new bg(this, this.b, 0));
    }
}
