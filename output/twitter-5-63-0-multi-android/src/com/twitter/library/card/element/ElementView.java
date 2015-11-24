// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.graphics.Canvas;
import android.content.Context;
import android.view.View;

public class ElementView extends View
{
    private final Element a;
    
    public ElementView(final Context context, final Element a) {
        super(context);
        this.a = a;
        this.setWillNotDraw(false);
    }
    
    public void draw(final Canvas canvas) {
        this.a.c(canvas);
        super.draw(canvas);
        if (this.a.opacity != 0.0f) {
            this.a.a(canvas);
        }
    }
    
    public Element getElement() {
        return this.a;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.opacity != 0.0f) {
            this.a.b(canvas);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.a.e();
        this.setMeasuredDimension((int)this.a.mLayoutSize.x, (int)this.a.mLayoutSize.y);
    }
}
