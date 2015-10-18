// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import android.view.View;
import com.twitter.library.card.element.BasePlayer;
import android.content.Context;
import com.twitter.library.media.player.InlineVideoView;
import com.twitter.library.card.element.PlayerDelegateView;

public class PlayerDelegateVineView extends PlayerDelegateView
{
    public InlineVideoView a;
    
    public PlayerDelegateVineView(final Context context, final BasePlayer basePlayer) {
        super(context, basePlayer);
        this.a = new InlineVideoView(context);
        this.a(context);
    }
    
    public boolean a() {
        if (super.a()) {
            this.addView((View)this.a);
            return true;
        }
        return false;
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (!b) {
            return;
        }
        super.onLayout(b, n, n2, n3, n4);
        this.a.layout(n, n2, n3, n4);
    }
}
