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

class v implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ ChunkedAdapter$ScrollAction b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ChunkedPageableListView d;
    
    v(final ChunkedPageableListView d, final int a, final ChunkedAdapter$ScrollAction b, final boolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        this.d.smoothScrollBy(this.a, this.d.i);
        this.d.c(this.b == ChunkedAdapter$ScrollAction.c ^ this.c);
        if (this.b == ChunkedAdapter$ScrollAction.c) {
            this.d.b = Integer.MIN_VALUE;
        }
        this.d.n = false;
    }
}
