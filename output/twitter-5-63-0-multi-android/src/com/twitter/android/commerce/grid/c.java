// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

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
import android.view.View;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.view.VelocityTracker;
import android.widget.ListAdapter;
import android.widget.AbsListView$OnScrollListener;
import android.widget.ListView;
import android.os.Parcelable;
import android.database.DataSetObserver;

class c extends DataSetObserver
{
    final /* synthetic */ ExtendableListView a;
    private Parcelable b;
    
    c(final ExtendableListView a) {
        this.a = a;
        this.b = null;
    }
    
    public void onChanged() {
        this.a.C = true;
        this.a.E = this.a.D;
        this.a.D = this.a.getAdapter().getCount();
        this.a.F.c();
        if (this.a.getAdapter().hasStableIds() && this.b != null && this.a.E == 0 && this.a.D > 0) {
            this.a.onRestoreInstanceState(this.b);
            this.b = null;
        }
        else {
            this.a.h();
        }
        this.a.n();
        this.a.requestLayout();
    }
    
    public void onInvalidated() {
        this.a.C = true;
        if (this.a.getAdapter().hasStableIds()) {
            this.b = this.a.onSaveInstanceState();
        }
        this.a.E = this.a.D;
        this.a.D = 0;
        this.a.g = false;
        this.a.n();
        this.a.requestLayout();
    }
}
