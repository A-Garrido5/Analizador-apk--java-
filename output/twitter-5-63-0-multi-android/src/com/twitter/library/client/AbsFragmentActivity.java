// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.support.v4.app.Fragment;
import java.util.Iterator;
import android.content.Context;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import java.util.concurrent.Future;
import com.twitter.library.service.z;
import com.twitter.internal.android.widget.aq;
import com.twitter.library.service.y;
import com.twitter.internal.android.service.a;
import android.app.Activity;
import android.support.v4.app.NavUtils;
import android.os.Bundle;
import com.twitter.library.util.bq;
import android.os.Parcelable;
import com.twitter.library.util.ReferenceList;
import android.content.Intent;
import java.util.ArrayList;
import com.twitter.internal.android.widget.ToolBar;
import java.util.LinkedHashSet;
import com.twitter.android.BaseFragmentActivity;

public abstract class AbsFragmentActivity extends BaseFragmentActivity implements au
{
    private final LinkedHashSet a;
    private ToolBar b;
    private ToolBar c;
    private jv d;
    private ArrayList e;
    private boolean f;
    private boolean g;
    private Intent h;
    private as i;
    private ArrayList j;
    private az k;
    private ao l;
    private d m;
    private boolean n;
    private ReferenceList o;
    
    public AbsFragmentActivity() {
        this.a = new LinkedHashSet();
        this.o = ReferenceList.a();
    }
    
    private Intent a(final Intent intent) {
        intent.putExtra("intent.extra.ANCESTOR", (Parcelable)this.q_());
        return intent;
    }
    
    private void b(final Intent intent) {
        if (bq.a(intent, "intent.extra.ANCESTOR")) {
            this.h = (Intent)bq.b(intent, "intent.extra.ANCESTOR");
            intent.removeExtra("intent.extra.ANCESTOR");
        }
        final az t = this.T();
        this.n = false;
        final Bundle a = bq.a(intent);
        if (a != null) {
            final String a2 = bq.a(a, "AbsFragmentActivity_account_name");
            if (a2 != null) {
                if (!a2.equals(t.b().e())) {
                    t.d(a2);
                    this.n = true;
                }
                intent.removeExtra("AbsFragmentActivity_account_name");
            }
        }
    }
    
    private boolean c(final jx jx) {
        if (jx.n() != null) {
            this.startActivity(jx.n());
            return true;
        }
        return false;
    }
    
    public final ToolBar M() {
        return this.b;
    }
    
    public final jv N() {
        return this.d;
    }
    
    public final boolean O() {
        return this.b != null && this.b.e();
    }
    
    public final boolean P() {
        return this.b != null && this.f;
    }
    
    public final void Q() {
        if (this.b == null || !this.f) {
            return;
        }
        this.a(this.b);
        this.b.requestLayout();
    }
    
    protected void R() {
        this.a(this, NavUtils.getParentActivityIntent(this));
    }
    
    void S() {
        if (this.i_()) {
            super.onBackPressed();
        }
    }
    
    protected abstract void S_();
    
    protected az T() {
        return this.k;
    }
    
    protected final Session U() {
        return this.k.b();
    }
    
    protected boolean V() {
        return !this.j.isEmpty();
    }
    
    public final Intent W() {
        return this.h;
    }
    
    protected int a(final ToolBar toolBar) {
        return 1;
    }
    
    protected final String a(final a a) {
        return this.i.a(a);
    }
    
    protected final String a(final y y) {
        return this.i.a(y);
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
    }
    
    protected void a(final Activity activity, final Intent intent) {
        intent.addFlags(67108864);
        this.d(intent);
        activity.finish();
    }
    
    public abstract void a(final Bundle p0, final d p1);
    
    public final void a(final aq aq) {
        if (this.e != null) {
            this.e.add(aq);
        }
    }
    
    protected final void a(final ay ay) {
        this.a.add(ay);
    }
    
    protected final void a(final z z) {
        this.i.a(z);
    }
    
    public void a(final Future future) {
        this.o.b(future);
    }
    
    protected final boolean a(final y y, final int n) {
        if (this.l == null) {
            this.l = new ao(this);
        }
        return this.i.a(y, n, 0, this.l);
    }
    
    protected boolean a(final jv jv, final ToolBar toolBar) {
        return false;
    }
    
    public boolean a(final jx jx) {
        if (jx.a() == la.home) {
            this.g_();
            return true;
        }
        return this.c(jx);
    }
    
    protected int b(final ToolBar toolBar) {
        return 1;
    }
    
    @Override
    public void b(final int n, final y y) {
    }
    
    public final void b(final aq aq) {
        if (this.e != null) {
            this.e.remove(aq);
        }
    }
    
    protected final void b(final ay ay) {
        this.k.b(ay);
        this.a.remove(ay);
    }
    
    protected final void b(final z z) {
        this.i.b(z);
    }
    
    protected boolean b(final jv jv, final ToolBar toolBar) {
        return false;
    }
    
    public boolean b(final jx jx) {
        return this.c(jx);
    }
    
    public d c(final Bundle bundle) {
        return null;
    }
    
    public final void c(final Intent h) {
        this.h = h;
    }
    
    @TargetApi(16)
    public void d(final Intent intent) {
        if (Build$VERSION.SDK_INT >= 16) {
            super.startActivityForResult(intent, -1, (Bundle)null);
            return;
        }
        super.startActivityForResult(intent, -1);
    }
    
    @Deprecated
    protected boolean f(final String s) {
        return this.j.remove(s);
    }
    
    protected abstract void g_();
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getWindow().setFormat(1);
    }
    
    @Override
    public void onBackPressed() {
        if (this.n) {
            this.n = false;
        }
        this.S();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        this.i = as.a((Context)this);
        this.k = az.a((Context)this);
        this.getTheme().applyStyle(lk.a(), false);
        super.onCreate(bundle);
        this.b(this.getIntent());
        final d c = this.c(bundle);
        d m;
        if (c == null) {
            m = new d();
        }
        else {
            m = c;
        }
        m.i = true;
        this.m = m;
        if (m.j != 0) {
            this.setContentView(m.j);
        }
        if (m.k && !this.k.b().d()) {
            this.S_();
        }
        else {
            if (bundle != null) {
                this.j = bundle.getStringArrayList("pending_reqs");
            }
            else {
                this.j = new ArrayList(5);
            }
            this.a(new c(this));
            this.b = (ToolBar)this.findViewById(la.toolbar);
            final ToolBar c2 = (ToolBar)this.findViewById(la.utilitybar);
            this.c = c2;
            this.a(bundle, m);
            if (this.b == null) {
                this.b = (ToolBar)this.findViewById(la.toolbar);
            }
            final ToolBar b = this.b;
            if (b != null || c2 != null) {
                final jv d = new jv(this);
                this.d = d;
                if (b != null) {
                    b.setDisplayOptions(m.l);
                    this.f = this.a(d, b);
                    if (this.f) {
                        this.e = new ArrayList();
                        b.setOnToolBarItemSelectedListener(new com.twitter.library.client.a(this));
                        final int a = this.a(b);
                        if (a != 0) {
                            int visibility;
                            if (a == 1) {
                                visibility = 0;
                            }
                            else {
                                visibility = 8;
                            }
                            b.setVisibility(visibility);
                        }
                    }
                    else {
                        b.setVisibility(8);
                        this.b = null;
                    }
                }
                if (c2 != null) {
                    this.g = this.b(d, c2);
                    if (!this.g) {
                        c2.setVisibility(8);
                        this.c = null;
                        return;
                    }
                    c2.setOnToolBarItemSelectedListener(new b(this));
                    final int b2 = this.b(c2);
                    if (b2 != 0) {
                        int visibility2 = 0;
                        if (b2 != 1) {
                            visibility2 = 8;
                        }
                        c2.setVisibility(visibility2);
                    }
                }
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        final Iterator iterator = this.o.iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel(false);
        }
        this.o.b();
        super.onDestroy();
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.b(intent);
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            this.k.b(iterator.next());
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (this.m.k && !this.k.b().d()) {
            this.S_();
        }
        else {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                this.k.a(iterator.next());
            }
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("pending_reqs", this.j);
    }
    
    protected void onTitleChanged(final CharSequence title, final int n) {
        if (this.b != null) {
            this.b.setTitle(title);
            return;
        }
        super.onTitleChanged(title, n);
    }
    
    protected Intent q_() {
        if (this.m.m) {
            return this.getIntent();
        }
        return this.h;
    }
    
    @Override
    public void startActivityForResult(final Intent intent, final int n) {
        super.startActivityForResult(this.a(intent), n);
    }
    
    @TargetApi(16)
    public void startActivityForResult(final Intent intent, final int n, final Bundle bundle) {
        super.startActivityForResult(this.a(intent), n, bundle);
    }
    
    @Override
    public void startActivityFromFragment(final Fragment fragment, final Intent intent, final int n) {
        super.startActivityFromFragment(fragment, this.a(intent), n);
    }
}
