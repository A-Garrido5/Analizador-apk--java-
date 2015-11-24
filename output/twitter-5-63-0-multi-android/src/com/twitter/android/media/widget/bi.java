// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.View$OnTouchListener;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewConfiguration;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.Collections;
import com.twitter.library.media.model.VideoFile;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.widget.BaseAdapter;

public abstract class bi extends BaseAdapter
{
    static final /* synthetic */ boolean b;
    private final List a;
    private VideoSegmentEditView c;
    
    static {
        b = !VideoSegmentEditView.class.desiredAssertionStatus();
    }
    
    public bi() {
        this.a = new ArrayList();
    }
    
    public abstract int a();
    
    protected abstract int a(final int p0);
    
    protected abstract void a(final int p0, final int p1);
    
    void a(final VideoSegmentEditView c) {
        this.c = c;
    }
    
    public void a(final boolean b) {
        final Iterator<VideoSegmentListItemView> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(b);
        }
    }
    
    protected abstract boolean a(final int p0, final Rect p1);
    
    protected abstract boolean a(final Rect p0);
    
    protected abstract VideoFile b(final int p0);
    
    public void b(final int n, final int status) {
        if (n >= 0 && n < this.a.size()) {
            this.a.get(n).setStatus(status);
            this.c.j.d();
        }
        this.c.j.a();
    }
    
    protected abstract void b(final Rect p0);
    
    void c(final int n, final int n2) {
        Collections.swap(this.a, n, n2);
        this.a(n, n2);
        this.notifyDataSetChanged();
    }
    
    protected abstract boolean c(final int p0);
    
    protected abstract boolean d(final int p0);
    
    protected abstract void e(final int p0);
    
    protected abstract void f(final int p0);
    
    protected abstract void g(final int p0);
    
    public Object getItem(final int n) {
        return null;
    }
    
    public long getItemId(final int n) {
        return 0L;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final List a = this.a;
        VideoSegmentListItemView videoSegmentListItemView;
        if (n < a.size()) {
            videoSegmentListItemView = a.get(n);
        }
        else {
            videoSegmentListItemView = null;
        }
        if (videoSegmentListItemView == null) {
            videoSegmentListItemView = (VideoSegmentListItemView)LayoutInflater.from(viewGroup.getContext()).inflate(2130969200, viewGroup, false);
            a.add(n, videoSegmentListItemView);
        }
        videoSegmentListItemView.setVideoFile(this.b(n));
        videoSegmentListItemView.setStatus(this.a(n));
        if (!bi.b && this.c == null) {
            throw new AssertionError();
        }
        this.c.a(n, videoSegmentListItemView);
        return (View)videoSegmentListItemView;
    }
    
    public VideoSegmentListItemView h(final int n) {
        if (n >= 0 && n < this.a.size()) {
            return this.a.get(n);
        }
        return null;
    }
    
    public void i(final int n) {
        this.c.j.d();
        this.c.j.a(n);
    }
    
    void j(final int n) {
        this.a.remove(n);
        this.e(n);
        this.notifyDataSetChanged();
    }
    
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (this.c != null) {
            this.c.e();
        }
    }
}
