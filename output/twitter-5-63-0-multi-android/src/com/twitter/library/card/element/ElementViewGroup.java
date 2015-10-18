// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.graphics.Canvas;
import android.content.Context;
import android.view.ViewGroup;

public abstract class ElementViewGroup extends ViewGroup
{
    protected Element b;
    
    public ElementViewGroup(final Context context, final Element b) {
        super(context);
        this.b = b;
        this.setWillNotDraw(false);
    }
    
    public void draw(final Canvas canvas) {
        this.b.c(canvas);
        super.draw(canvas);
        if (this.b.opacity != 0.0f) {
            this.b.a(canvas);
        }
    }
    
    public Element getElement() {
        return this.b;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.b.opacity != 0.0f) {
            this.b.b(canvas);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int n3 = (int)this.b.mLayoutSize.x;
        final int n4 = (int)this.b.mLayoutSize.y;
        this.b.e();
        this.setMeasuredDimension(n3, n4);
        this.measureChildren(n, n2);
    }
}
