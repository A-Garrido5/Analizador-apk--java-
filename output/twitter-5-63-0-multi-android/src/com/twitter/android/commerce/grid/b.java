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

class b implements Runnable
{
    final /* synthetic */ View a;
    final /* synthetic */ i b;
    final /* synthetic */ ExtendableListView c;
    
    b(final ExtendableListView c, final View a, final i b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.setPressed(false);
        this.c.setPressed(false);
        if (!this.c.C) {
            this.c.post((Runnable)this.b);
        }
        this.c.l = 0;
    }
}
