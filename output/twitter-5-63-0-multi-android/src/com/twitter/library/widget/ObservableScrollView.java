// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ScrollView;

public class ObservableScrollView extends ScrollView
{
    private ad a;
    private int b;
    private int c;
    private int d;
    private int e;
    
    public ObservableScrollView(final Context context) {
        super(context);
    }
    
    public ObservableScrollView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ObservableScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected void a() {
        if (this.a != null) {
            this.a.a(this);
        }
    }
    
    protected void b() {
        if (this.a != null) {
            this.a.b(this);
        }
    }
    
    protected void onScrollChanged(final int b, final int c, final int n, final int n2) {
        super.onScrollChanged(b, c, n, n2);
        this.b = b;
        this.c = c;
        if (this.a != null) {
            this.a.a(this, b, c, n, n2);
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (this.a != null) {
            this.a.b(this, n, n2, n3, n4);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0: {
                this.d = this.b;
                this.e = this.c;
                break;
            }
            case 2: {
                if (this.d != this.b || this.e != this.c) {
                    this.a();
                    break;
                }
                break;
            }
            case 1: {
                this.b();
                break;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setObservableScrollViewListener(final ad a) {
        this.a = a;
    }
}
