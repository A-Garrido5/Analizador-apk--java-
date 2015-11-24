// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.twitter.library.service.y;
import com.twitter.internal.android.service.a;
import com.twitter.internal.android.widget.aq;
import android.os.Build$VERSION;
import android.app.Activity;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.BasePreferenceActivity;

public abstract class AbsPreferenceActivity extends BasePreferenceActivity implements au
{
    private as a;
    private ao b;
    private az c;
    private ToolBar d;
    private f e;
    
    private void b() {
        final ToolBar d = (ToolBar)this.findViewById(la.toolbar);
        if (d != null) {
            final jv jv = new jv((Activity)this);
            if (this.h()) {
                if (Build$VERSION.SDK_INT >= 17) {
                    this.e = new j(this, jv, d);
                }
                else {
                    this.e = new g(this, jv, d);
                }
            }
            final boolean a = this.a(jv, d);
            if (this.e == null && !a) {
                d.setVisibility(8);
                return;
            }
            (this.d = d).setOnToolBarItemSelectedListener(new e(this));
            final boolean a2 = this.a(d);
            if (this.e == null && !a2) {
                d.setVisibility(8);
                return;
            }
            d.setVisibility(0);
        }
    }
    
    protected final String a(final a a) {
        return this.a.a(a);
    }
    
    protected final String a(final y y) {
        return this.a.a(y);
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
    }
    
    protected boolean a(final ToolBar toolBar) {
        return true;
    }
    
    protected final boolean a(final y y, final int n) {
        if (this.b == null) {
            this.b = new ao(this);
        }
        return this.a.a(y, n, 0, this.b);
    }
    
    protected boolean a(final jv jv, final ToolBar toolBar) {
        return true;
    }
    
    protected boolean a(final jx jx) {
        if (jx.a() == la.home) {
            this.finish();
        }
        return true;
    }
    
    boolean a(final boolean b, final boolean b2) {
        if (this.e == null) {
            return true;
        }
        int n;
        if (b2) {
            if (b) {
                n = (this.i() ? 1 : 0);
            }
            else {
                n = (this.j() ? 1 : 0);
            }
        }
        else {
            n = 1;
        }
        if (n == 0) {
            return false;
        }
        this.e.a(b);
        return true;
    }
    
    public void addPreferencesFromIntent(final Intent intent) {
        super.addPreferencesFromIntent(intent);
        if (this.e != null) {
            this.e.b();
        }
    }
    
    public void addPreferencesFromResource(final int n) {
        super.addPreferencesFromResource(n);
        if (this.e != null) {
            this.e.b();
        }
    }
    
    @Override
    public void b(final int n, final y y) {
    }
    
    protected void b(final boolean b) {
        this.a(b, false);
    }
    
    protected boolean h() {
        return false;
    }
    
    protected boolean i() {
        return true;
    }
    
    protected boolean j() {
        return true;
    }
    
    public az l() {
        return this.c;
    }
    
    protected final Session m() {
        return this.c.b();
    }
    
    protected boolean n() {
        return false;
    }
    
    protected boolean o() {
        if (this.e != null) {
            return this.e.a();
        }
        return this.getPreferenceScreen().isEnabled();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        this.getTheme().applyStyle(lk.a(), false);
        super.onCreate(bundle);
        this.a = as.a((Context)this);
        this.c = az.a((Context)this);
    }
    
    protected void onTitleChanged(final CharSequence title, final int n) {
        if (this.d != null) {
            this.d.setTitle(title);
            return;
        }
        super.onTitleChanged(title, n);
    }
    
    public final void setContentView(final int contentView) {
        super.setContentView(contentView);
        this.b();
    }
    
    public final void setContentView(final View contentView) {
        super.setContentView(contentView);
        this.b();
    }
    
    public final void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView(view, viewGroup$LayoutParams);
        this.b();
    }
}
