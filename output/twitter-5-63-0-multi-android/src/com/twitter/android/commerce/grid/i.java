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
import android.widget.AbsListView$OnScrollListener;
import android.widget.ListView;
import android.view.View;
import android.widget.ListAdapter;

class i extends k implements Runnable
{
    int a;
    final /* synthetic */ ExtendableListView b;
    
    private i(final ExtendableListView b) {
        this.b = b;
        super(b, null);
    }
    
    @Override
    public void run() {
        if (!this.b.C) {
            final ListAdapter h = this.b.h;
            final int a = this.a;
            if (h != null && this.b.D > 0 && a != -1 && a < h.getCount() && this.b()) {
                final View child = this.b.getChildAt(a);
                if (child != null) {
                    final int n = a + this.b.d;
                    this.b.performItemClick(child, n, h.getItemId(n));
                }
            }
        }
    }
}
