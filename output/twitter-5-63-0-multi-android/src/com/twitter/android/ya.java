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
import android.view.ViewTreeObserver$OnPreDrawListener;
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
import android.widget.ListView;
import com.twitter.library.widget.SlidingPanel;
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

class ya extends al implements LoaderManager$LoaderCallbacks, View$OnClickListener, View$OnTouchListener, AdapterView$OnItemClickListener, c
{
    public boolean a;
    public boolean b;
    private final as c;
    private final Activity d;
    private final Session e;
    private final TwitterScribeAssociation f;
    private final int g;
    private final SlidingPanel h;
    private final ListView i;
    private final yo j;
    private final yg k;
    private final int l;
    private float m;
    private ye n;
    private FriendshipCache o;
    
    public ya(final Activity activity, final Session session, final TwitterScribeAssociation twitterScribeAssociation, final SlidingPanel slidingPanel) {
        this(activity, session, twitterScribeAssociation, slidingPanel, 2130837600);
    }
    
    public ya(final Activity d, final Session e, final TwitterScribeAssociation f, final SlidingPanel h, final int g) {
        this.b = true;
        this.k = new yg(this, null);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.c = as.a((Context)d);
        this.h = h;
        this.h.findViewById(2131886150).setVisibility(8);
        this.h.findViewById(2131886148).setVisibility(8);
        this.h.findViewById(2131886249).setOnClickListener((View$OnClickListener)this);
        this.l = ViewConfiguration.get((Context)d).getScaledTouchSlop();
        this.h.setOnTouchListener((View$OnTouchListener)this);
        (this.i = (ListView)this.h.findViewById(2131886656)).setOnItemClickListener((AdapterView$OnItemClickListener)this);
        this.o = new FriendshipCache();
        this.j = new yo((Context)d, 2, this.g, this, this.o, 0, 0, false, false);
        this.i.setAdapter((ListAdapter)this.j);
    }
    
    private void a(final long n, final int n2) {
        if (!this.o.a(n, n2)) {
            this.o.b(n, n2);
            this.j.notifyDataSetChanged();
        }
    }
    
    protected void a(final int n, final int n2, final Intent intent) {
        switch (n) {
            case 0: {
                if (-1 != n2 || intent == null) {
                    break;
                }
                final long longExtra = intent.getLongExtra("user_id", 0L);
                if (longExtra > 0L && intent.hasExtra("friendship")) {
                    this.a(longExtra, intent.getIntExtra("friendship", 0));
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final Bundle bundle) {
        if (!this.o.a()) {
            bundle.putSerializable("friendship_cache", (Serializable)this.o);
        }
    }
    
    public void a(final LoaderManager loaderManager, final long[] array) {
        if (loaderManager != null && array != null) {
            final Bundle bundle = new Bundle();
            bundle.putSerializable("tags", (Serializable)array);
            loaderManager.restartLoader(1, bundle, this);
        }
    }
    
    public void a(final Loader loader, final List list) {
        this.j.a(list);
        if (this.a) {
            this.a(true);
        }
    }
    
    public void a(final ye n) {
        this.n = n;
    }
    
    public void a(final UserView userView, final long n, final int n2) {
        if (n2 == 2131886080) {
            final PromotedContent promotedContent = userView.getPromotedContent();
            final boolean checked = userView.l.isChecked();
            if (checked) {
                this.c.a(new pe((Context)this.d, this.e, n, promotedContent), new yd(this, n));
                this.o.c(n);
            }
            else {
                this.c.a(new pb((Context)this.d, this.e, n, promotedContent), new yc(this, n));
                this.o.b(n);
            }
            if (this.n != null) {
                this.n.a(checked, n, ((yk)userView.getTag()).f, promotedContent);
            }
        }
    }
    
    public void a(final boolean a) {
        this.a = a;
        if (this.n != null) {
            this.n.a(a);
        }
        if (a && !this.j.isEmpty()) {
            if (this.b) {
                this.h.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.k);
                this.h.a();
            }
            else if (this.h.getPanelState() == 0) {
                this.h.b();
            }
            return;
        }
        this.h.d();
    }
    
    public boolean a() {
        return this.a;
    }
    
    public void b() {
        this.b = true;
    }
    
    public void b(final Bundle bundle) {
        if (bundle.containsKey("friendship_cache")) {
            this.o = (FriendshipCache)bundle.getSerializable("friendship_cache");
        }
    }
    
    @Override
    public void c(final View view) {
        if (this.a()) {
            this.a = false;
            if (this.n != null) {
                this.n.a(false);
            }
        }
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131886249: {
                this.a(false);
            }
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new by((Context)this.d, bundle.getLongArray("tags"));
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (view instanceof UserView) {
            if (this.n != null) {
                this.n.C_();
            }
            final UserView userView = (UserView)view;
            String s = userView.getUserName().toString();
            if (s.charAt(0) == '@') {
                s = s.substring(1);
            }
            final Integer j = this.o.j(userView.getUserId());
            final Activity d = this.d;
            final long userId = userView.getUserId();
            final PromotedContent promotedContent = userView.getPromotedContent();
            final TwitterScribeAssociation f = this.f;
            int intValue;
            if (j == null) {
                intValue = -1;
            }
            else {
                intValue = j;
            }
            this.d.startActivityForResult(ProfileActivity.a((Context)d, userId, s, promotedContent, f, intValue, null), 0);
        }
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        this.j.swapCursor(null);
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final float y = motionEvent.getY();
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            case 0: {
                this.m = y;
                break;
            }
            case 2: {
                if (Math.abs(y - this.m) < this.l) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
