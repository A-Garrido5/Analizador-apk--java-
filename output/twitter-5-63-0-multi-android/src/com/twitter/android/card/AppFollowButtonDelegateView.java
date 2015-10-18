// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.element.Element;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.card.element.FollowButtonElement;
import com.twitter.internal.android.widget.ShadowTextView;

public class AppFollowButtonDelegateView extends ShadowTextView
{
    private FollowButtonElement a;
    
    public AppFollowButtonDelegateView(final Context context, final FollowButtonElement a) {
        super(context, null);
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
        super.onMeasure(n, n2);
    }
}
