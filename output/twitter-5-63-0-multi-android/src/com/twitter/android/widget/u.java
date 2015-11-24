// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.Adapter;
import android.widget.AbsListView;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.HeaderViewListAdapter;
import android.view.ViewConfiguration;
import android.widget.AbsListView$OnScrollListener;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.widget.PageableListView;

class u implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ChunkedPageableListView c;
    
    u(final ChunkedPageableListView c, final int a, final boolean b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.smoothScrollBy(this.a, this.c.j);
        this.c.c(this.b);
        this.c.n = false;
    }
}
