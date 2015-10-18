// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.graphics.Rect;
import android.widget.Adapter;
import android.widget.AbsListView;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import android.os.Handler;
import android.util.Log;
import android.widget.AdapterView$OnItemLongClickListener;
import android.widget.AdapterView;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import java.util.Iterator;
import android.support.v4.view.ViewCompat;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.view.VelocityTracker;
import android.widget.ListAdapter;
import android.widget.AbsListView$OnScrollListener;
import android.widget.ListView;
import android.view.View;

class d extends k implements Runnable
{
    final /* synthetic */ ExtendableListView a;
    
    private d(final ExtendableListView a) {
        this.a = a;
        super(a, null);
    }
    
    @Override
    public void run() {
        final View child = this.a.getChildAt(this.a.x);
        if (child != null) {
            final int a = this.a.x;
            final long itemId = this.a.h.getItemId(this.a.x + this.a.d);
            if (!this.b() || this.a.C || !this.a.a(child, a + this.a.d, itemId)) {
                this.a.l = 5;
                return;
            }
            this.a.l = 0;
            this.a.setPressed(false);
            child.setPressed(false);
        }
    }
}
