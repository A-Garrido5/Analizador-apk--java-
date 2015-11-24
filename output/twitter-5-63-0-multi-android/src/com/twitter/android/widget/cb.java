// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.View$OnTouchListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import com.twitter.library.media.model.EditableImage;
import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.model.EditableMedia;
import java.util.Iterator;
import android.net.Uri;
import com.twitter.library.media.model.m;
import com.twitter.library.media.model.MediaType;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import android.content.res.Resources$Theme;
import android.view.animation.AnimationUtils;
import android.os.Looper;
import android.database.Cursor;
import android.view.animation.Animation;
import com.twitter.library.util.aq;
import android.os.Handler;
import android.support.annotation.LayoutRes;
import com.twitter.library.util.ReferenceMap;
import java.util.LinkedHashMap;
import com.twitter.library.util.ak;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.media.manager.a;
import android.widget.AbsListView$RecyclerListener;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

class cb extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ MediaStoreItemView a;
    final /* synthetic */ bz b;
    
    cb(final bz b, final MediaStoreItemView a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onDown(final MotionEvent motionEvent) {
        return true;
    }
    
    public void onLongPress(final MotionEvent motionEvent) {
        if (this.b.v != null) {
            this.b.v.b((View)this.a, this.a.getEditableMedia());
        }
        if (this.b.t != null) {
            this.a.startAnimation(this.b.t);
        }
    }
    
    public void onShowPress(final MotionEvent motionEvent) {
        if (this.b.s != null) {
            this.a.startAnimation(this.b.s);
        }
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        if (this.b.u != null) {
            this.b.u.a((View)this.a, this.a.getEditableMedia());
        }
        if (this.b.t != null) {
            this.a.startAnimation(this.b.t);
        }
        return true;
    }
}
