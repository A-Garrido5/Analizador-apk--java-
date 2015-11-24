// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.os.Handler;
import android.graphics.drawable.TransitionDrawable;
import android.view.MotionEvent;
import android.widget.Adapter;
import android.view.ViewParent;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ListAdapter;
import android.view.VelocityTracker;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.widget.AdapterView;
import android.view.View;

class o implements Runnable
{
    final /* synthetic */ View a;
    final /* synthetic */ u b;
    final /* synthetic */ HorizontalListView c;
    
    o(final HorizontalListView c, final View a, final u b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.E = -1;
        this.a.setPressed(false);
        this.c.setPressed(false);
        if (!this.c.e) {
            this.b.run();
        }
    }
}
