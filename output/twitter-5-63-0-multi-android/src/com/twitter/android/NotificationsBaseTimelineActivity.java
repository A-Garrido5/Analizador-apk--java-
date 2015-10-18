// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import com.twitter.library.widget.aj;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.twitter.library.widget.SlidingUpPanelLayout;
import com.twitter.android.client.x;
import android.widget.RadioGroup;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.client.k;
import com.twitter.android.util.bh;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.widget.SlidingPanel;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public abstract class NotificationsBaseTimelineActivity extends ListFragmentActivity implements ViewTreeObserver$OnGlobalLayoutListener, RadioGroup$OnCheckedChangeListener
{
    private SlidingPanel a;
    private my b;
    
    public static int a(final Context context, final az az) {
        int a;
        if (bh.a(az.b().f())) {
            a = bh.a(context);
        }
        else {
            final boolean boolean1 = new k(context, az.b().e()).getBoolean("notifications_follow_only", false);
            a = 0;
            if (boolean1) {
                return 2;
            }
        }
        return a;
    }
    
    protected int a(final ToolBar toolBar) {
        super.a(toolBar);
        return 1;
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.c(2130968946);
        return a;
    }
    
    @Override
    protected jy a(final Intent intent, final bn bn) {
        return null;
    }
    
    @Override
    protected CharSequence a(final Intent intent) {
        return this.getString(2131297313);
    }
    
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        if (bh.a(this.U().f())) {
            jv.a(2131951645, toolBar);
            this.i(this.g());
        }
        return true;
    }
    
    public boolean a(final jx jx) {
        if (jx.a() == 2131887458) {
            this.a.b();
            this.G().a(this.U().g(), "notification:universal:filter_sheet::impression");
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final SlidingPanel a = (SlidingPanel)this.findViewById(2131887065);
        this.b = new my(a, (RadioGroup$OnCheckedChangeListener)this);
        a.a(5);
        a.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.a = a;
        super.b(bundle, bn);
    }
    
    protected void f() {
        final jy a = this.a(this.getIntent(), null);
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        supportFragmentManager.beginTransaction().setTransition(4099).replace(2131886241, a.a, a.b).commitAllowingStateLoss();
        supportFragmentManager.executePendingTransactions();
        a.a.W();
        this.a.d();
    }
    
    protected int g() {
        switch (bh.a((Context)this)) {
            default: {
                return 2131297349;
            }
            case 1: {
                return 2131297347;
            }
            case 2: {
                return 2131297348;
            }
            case 3: {
                return 2131297351;
            }
        }
    }
    
    public void onCheckedChanged(final RadioGroup radioGroup, final int n) {
        String s;
        int n2;
        if (n == 2131887069) {
            s = "filtered";
            n2 = 1;
        }
        else if (n == 2131887070) {
            s = "following";
            n2 = 2;
        }
        else if (n == 2131887071) {
            s = "verified";
            n2 = 3;
        }
        else {
            s = "all";
            n2 = 0;
        }
        bh.a((Context)this, n2);
        this.b.a(n2);
        this.i(this.g());
        this.G().a(this.U().g(), "notification:universal:filter_sheet", s, "select");
        this.f();
    }
    
    public void onGlobalLayout() {
        final SlidingPanel a = this.a;
        a.setPanelPreviewHeight(a.findViewById(2131887072).getHeight() + a.findViewById(2131887066).getHeight());
    }
    
    protected void onResume() {
        super.onResume();
        this.b.a(bh.a((Context)this));
    }
    
    protected void onStart() {
        super.onStart();
        x.a((Context)this).d(this.U().e());
    }
}
