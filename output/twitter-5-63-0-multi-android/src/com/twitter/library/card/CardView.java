// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import com.twitter.library.card.element.Container;
import android.content.Context;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.card.element.ContainerElementView;

public class CardView extends ContainerElementView
{
    public n a;
    private int c;
    private Vector2F d;
    private Vector2F e;
    
    public CardView(final Context context, final Card card, final n a) {
        super(context, card);
        this.d = new Vector2F();
        this.e = new Vector2F();
        this.a = a;
        this.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
    }
    
    private static float a(final int n, final float n2, final float n3) {
        final int mode = View$MeasureSpec.getMode(n);
        final float n4 = View$MeasureSpec.getSize(n);
        if (mode == 1073741824) {
            return n4;
        }
        final float max = Math.max(n2, n3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(n4, max);
        }
        return max;
    }
    
    public void a() {
        this.c |= 0x1;
        this.refreshDrawableState();
    }
    
    public void b() {
        this.c &= 0xFFFFFFFE;
        this.refreshDrawableState();
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final Card card = (Card)this.b;
        if (card != null) {
            card.a(this.getDrawableState());
        }
    }
    
    public Card getCard() {
        return (Card)this.b;
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + CardView.PRESSED_ENABLED_STATE_SET.length);
        if ((0x1 & this.c) != 0x0) {
            mergeDrawableStates(onCreateDrawableState, CardView.PRESSED_ENABLED_STATE_SET);
        }
        return onCreateDrawableState;
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        this.d.set(a(n, this.getSuggestedMinimumWidth(), this.b.size.x), a(n2, this.getSuggestedMinimumHeight(), this.b.size.y));
        this.e.x = this.b.b(0, this.d);
        this.e.y = this.b.b(1, this.d);
        this.b.a(Vector2F.a, this.e);
        this.measureChildren(n, n2);
        this.b.e();
        final Vector2F a = this.b.A();
        this.setMeasuredDimension((int)a.x, (int)a.y);
    }
}
