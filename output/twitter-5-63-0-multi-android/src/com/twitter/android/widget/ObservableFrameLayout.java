// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Canvas;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class ObservableFrameLayout extends FrameLayout
{
    private dx a;
    private boolean b;
    private dw c;
    
    public ObservableFrameLayout(final Context context) {
        super(context);
    }
    
    public ObservableFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ObservableFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @TargetApi(19)
    public boolean a() {
        if (Build$VERSION.SDK_INT >= 19) {
            return this.isAttachedToWindow();
        }
        return this.b;
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        if (this.c != null) {
            this.c.a();
        }
        super.dispatchDraw(canvas);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = true;
        if (this.a != null) {
            this.a.a();
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        if (this.a != null) {
            this.a.b();
        }
    }
    
    public void setOnDrawListener(final dw c) {
        this.c = c;
    }
    
    public void setWindowAttachmentListener(final dx a) {
        this.a = a;
    }
}
