// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.AbsListView$OnScrollListener;
import android.support.v7.app.AppCompatActivity;

class sy implements Runnable
{
    final int a;
    final ChatInfoLayout b;
    
    sy(final ChatInfoLayout b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final View child = ChatInfoLayout.c(this.b).getChildAt(0);
        if (child != null && ChatInfoLayout.c(this.b).getFirstVisiblePosition() == 0) {
            if (child.getTop() != this.a) {
                ChatInfoLayout.c(this.b).setSelectionFromTop(0, this.a);
                ChatInfoLayout.c(this.b).post((Runnable)this);
                if (!App.I) {
                    return;
                }
            }
            ((AppCompatActivity)this.b.getContext()).supportStartPostponedEnterTransition();
            ChatInfoLayout.c(this.b).setOnScrollListener((AbsListView$OnScrollListener)new as(this));
        }
    }
}
