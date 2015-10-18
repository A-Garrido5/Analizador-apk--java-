// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.view.ViewGroup;
import android.content.Context;

public class PlayerDelegateView extends ElementViewGroup
{
    private l a;
    
    public PlayerDelegateView(final Context context, final BasePlayer basePlayer) {
        super(context, basePlayer);
        this.a = new l();
        this.setWillNotDraw(false);
    }
    
    protected boolean a() {
        return this.a.a(this);
    }
    
    public boolean a(final Context context) {
        return this.a.a(this, context);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.a.a(b, n, n2, n3, n4);
    }
}
