// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.widget.Adapter;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import android.widget.AdapterView;
import android.database.DataSetObserver;

class bm extends DataSetObserver
{
    final /* synthetic */ VideoSegmentListView a;
    
    private bm(final VideoSegmentListView a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.b = this.a.a.getCount();
        this.a.c = true;
        this.a.requestLayout();
    }
    
    public void onInvalidated() {
        this.a.b = 0;
        this.a.c = true;
        this.a.requestLayout();
    }
}
