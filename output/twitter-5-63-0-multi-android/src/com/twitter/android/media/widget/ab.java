// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.animation.LayoutTransition$TransitionListener;
import android.view.View;
import android.view.ViewGroup;
import android.animation.LayoutTransition;
import com.twitter.library.util.i;

class ab extends i
{
    final /* synthetic */ aj a;
    final /* synthetic */ LayoutTransition b;
    final /* synthetic */ MediaAttachmentsView c;
    
    ab(final MediaAttachmentsView c, final aj a, final LayoutTransition b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void endTransition(final LayoutTransition layoutTransition, final ViewGroup viewGroup, final View view, final int n) {
        if (!layoutTransition.isRunning()) {
            this.a.a();
            this.b.removeTransitionListener((LayoutTransition$TransitionListener)this);
        }
    }
}
