// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import com.twitter.library.widget.aj;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.twitter.library.widget.SlidingUpPanelLayout;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.database.Cursor;
import com.twitter.library.api.PromotedEvent;
import android.widget.AdapterView;
import com.twitter.library.api.by;
import android.view.View;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.widget.UserView;
import com.twitter.library.widget.BaseUserView;
import java.util.List;
import android.support.v4.content.Loader;
import android.support.v4.app.LoaderManager;
import java.io.Serializable;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListAdapter;
import android.view.ViewConfiguration;
import android.content.Context;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.Session;
import android.app.Activity;
import com.twitter.library.client.as;
import com.twitter.library.widget.c;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.widget.al;
import android.widget.ListView;
import com.twitter.library.widget.SlidingPanel;
import android.view.ViewTreeObserver$OnPreDrawListener;

class yg implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ ya a;
    
    private yg(final ya a) {
        this.a = a;
    }
    
    public boolean onPreDraw() {
        final SlidingPanel a = this.a.h;
        final ListView b = this.a.i;
        a.setPanelPreviewHeight(Math.min(a.getHeader().getHeight() + b.getChildAt(-1 + b.getChildCount()).getBottom(), (int)(0.7 * this.a.d.getWindowManager().getDefaultDisplay().getHeight())));
        a.b();
        this.a.b = false;
        a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        return false;
    }
}
