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
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.view.VelocityTracker;
import android.widget.ListAdapter;
import android.widget.AbsListView$OnScrollListener;
import android.widget.ListView;
import android.view.View;
import android.view.ViewConfiguration;

final class e implements Runnable
{
    final /* synthetic */ ExtendableListView a;
    
    e(final ExtendableListView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.l == 3) {
            this.a.l = 4;
            final View child = this.a.getChildAt(this.a.x);
            if (child != null && !child.hasFocusable()) {
                this.a.k = 0;
                if (this.a.C) {
                    this.a.l = 5;
                    return;
                }
                this.a.layoutChildren();
                child.setPressed(true);
                this.a.setPressed(true);
                final int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                if (!this.a.isLongClickable()) {
                    this.a.l = 5;
                    return;
                }
                if (this.a.M == null) {
                    this.a.M = new d(this.a, null);
                }
                this.a.M.a();
                this.a.postDelayed((Runnable)this.a.M, (long)longPressTimeout);
            }
        }
    }
}
