// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.os.Parcelable;
import java.io.Serializable;
import com.twitter.android.ProfileActivity;
import android.widget.AdapterView;
import android.net.Uri$Builder;
import com.twitter.library.util.k;
import com.twitter.library.provider.cw;
import android.content.ContentUris;
import android.net.Uri;
import java.util.Iterator;
import com.twitter.android.kg;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.yk;
import com.twitter.library.widget.UserView;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.widget.BaseUserView;
import android.view.View;
import android.support.v4.content.Loader;
import android.database.Cursor;
import android.widget.Toast;
import android.content.Intent;
import com.twitter.android.pg;
import android.os.Bundle;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.y;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import java.util.HashSet;
import android.content.BroadcastReceiver;
import java.util.ArrayList;
import java.util.Set;
import com.twitter.library.client.as;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.az;
import com.twitter.android.ou;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Context;
import com.twitter.library.client.Session;
import com.twitter.library.widget.c;
import com.twitter.library.client.au;
import com.twitter.android.mz;
import android.support.v4.app.LoaderManager$LoaderCallbacks;

public abstract class ab implements LoaderManager$LoaderCallbacks, mz, z, au, c
{
    protected final Session a;
    protected final ad b;
    protected final Context c;
    protected final TwitterScribeAssociation d;
    protected ou e;
    private final com.twitter.android.client.c f;
    private final az g;
    private final FragmentActivity h;
    private final LoaderManager i;
    private final as j;
    private final Set k;
    private final Set l;
    private final ArrayList m;
    private boolean n;
    private long o;
    private aa p;
    private BroadcastReceiver q;
    
    public ab(final FragmentActivity fragmentActivity, final az g, final ad b, final TwitterScribeAssociation d) {
        this.k = new HashSet();
        this.l = new HashSet();
        this.m = new ArrayList();
        this.c = (Context)fragmentActivity;
        this.h = fragmentActivity;
        this.i = fragmentActivity.getSupportLoaderManager();
        this.j = as.a(this.c);
        this.g = g;
        this.a = this.g.b();
        this.o = this.a.g();
        this.b = b;
        this.d = d;
        this.f = com.twitter.android.client.c.a(this.c);
        this.a();
    }
    
    private void a() {
        this.q = new ac(this);
        LocalBroadcastManager.getInstance(this.c).registerReceiver(this.q, new IntentFilter("USER_FOLLOWED"));
    }
    
    private void a(final long e) {
        final pm pm = new pm(this.c, this.a, this.d());
        pm.f = 0;
        pm.j = this.f();
        pm.e = e;
        this.j.a(pm, 1, 0, this);
    }
    
    private void a(final ArrayList list, final String s) {
        if (list != null && !list.isEmpty()) {
            this.f.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.a.g()).b(new String[] { s })).b(list)).h(String.valueOf(this.b.a().userId)));
            list.clear();
        }
    }
    
    private boolean a(final y y) {
        return y.P().a(this.a);
    }
    
    private void s() {
        LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.q);
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
        final com.twitter.library.service.aa aa = (com.twitter.library.service.aa)y.l().b();
        final Session a = this.g.a(y);
        switch (n) {
            case 4: {
                if (a != null) {
                    final pv pv = (pv)y;
                    int n2;
                    if (pv.f() != null && pv.g()) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    if (this.a(y) && this.e != null) {
                        final pg pg = (pg)this.e.c();
                        if (n2 != 0) {
                            final Cursor cursor = pg.getCursor();
                            if (cursor != null) {
                                cursor.requery();
                                pg.notifyDataSetChanged();
                                this.f.a(this.o, ah.a(ah.a(this.b.b()), this.j() + "::user:replenish"));
                            }
                        }
                    }
                    this.i();
                    return;
                }
                break;
            }
            case 1: {
                if (aa.a()) {
                    this.n = true;
                    this.r();
                    return;
                }
                this.l();
            }
            case 2: {
                if (a == null) {
                    break;
                }
                final pb pb = (pb)y;
                if (pb.w() == this.d()) {
                    final long u = pb.u();
                    if (!pb.X()) {
                        if (this.a(pb)) {
                            this.b.c().c(u);
                            this.e.notifyDataSetChanged();
                        }
                    }
                    else {
                        LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("USER_FOLLOWED").putExtra("USER_FOLLOWED_USERID_KEY", u));
                    }
                    this.i();
                    return;
                }
                break;
            }
            case 3: {
                if (a == null) {
                    break;
                }
                final pe pe = (pe)y;
                if (pe.g() == this.d()) {
                    final long f = pe.f();
                    if (!aa.a() && this.a(pe)) {
                        this.b.c().b(f);
                        this.e.notifyDataSetChanged();
                        Toast.makeText(this.c, 2131298058, 1).show();
                    }
                    this.i();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        if (bundle != null) {
            this.n = bundle.getBoolean("state_fr_loaded", false);
            return;
        }
        this.n = false;
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        if (loader.getId() == this.g()) {
            if (cursor != null && cursor.getCount() > 0) {
                this.e.a(cursor);
                this.h();
            }
            this.l();
        }
    }
    
    @Override
    public void a(final aa p) {
        this.p = p;
    }
    
    public void a(final BaseUserView baseUserView, final PromotedContent promotedContent, final Bundle bundle) {
        final long userId = baseUserView.getUserId();
        if (this.k.add(userId)) {
            final TwitterScribeItem a = TwitterScribeItem.a(userId, promotedContent, ((yk)baseUserView.getTag()).f, null);
            a.g = 1 + bundle.getInt("position");
            this.m.add(a);
        }
        if (promotedContent != null && this.l.add(promotedContent.impressionId)) {
            this.f.a(PromotedEvent.a, promotedContent);
        }
    }
    
    public void a(final UserView userView, final long n, final int n2) {
        final ArrayList<String> list = new ArrayList<String>();
        if (kg.a(this.c)) {
            userView.l.toggle();
            kg.a(this.h, 4, userView.getBestName().toString());
        }
        else {
            final PromotedContent promotedContent = userView.getPromotedContent();
            if (userView.l.isChecked()) {
                this.j.a(new pe(this.c, this.a, n, promotedContent).c(this.d()), 3, 0, this);
                this.b.c().c(n);
                list.add("unfollow");
            }
            else {
                this.j.a(new pb(this.c, this.a, n, promotedContent).a(false).c(this.d()), 2, 0, this);
                this.b.c().b(n);
                list.add("follow");
                if (com.twitter.library.api.z.c(((yk)userView.getTag()).e)) {
                    list.add("follow_back");
                }
            }
            final String a = ah.a(this.b.b());
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                ah.a(this.f, this.a, n, this.o, ah.a(a, this.j() + "::user:" + iterator.next()), promotedContent, ((yk)userView.getTag()).f, this.d);
            }
        }
    }
    
    @Override
    public void b(final int n, final y y) {
    }
    
    @Override
    public void b(final Bundle bundle) {
        bundle.putBoolean("state_fr_loaded", this.n);
    }
    
    protected abstract Uri c();
    
    protected abstract int d();
    
    protected abstract int e();
    
    protected abstract int f();
    
    protected abstract int g();
    
    protected void h() {
        if (this.p != null) {
            this.p.p();
        }
    }
    
    protected abstract void i();
    
    protected abstract String j();
    
    @Override
    public boolean k() {
        return this.e != null && !this.e.isEmpty();
    }
    
    protected abstract void l();
    
    @Override
    public void m() {
        this.e.notifyDataSetChanged();
    }
    
    @Override
    public void n() {
        if (this.n) {
            this.r();
            return;
        }
        this.a(this.b.a().userId);
    }
    
    @Override
    public void o() {
        if (this.e != null) {
            this.e.notifyDataSetChanged();
            this.i();
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        if (n == this.g()) {
            final Uri$Builder appendQueryParameter = ContentUris.withAppendedId(this.c(), this.b.a().a()).buildUpon().appendQueryParameter("limit", Integer.toString(this.e())).appendQueryParameter("ownerId", String.valueOf(this.o));
            String s;
            String[] array;
            if (this.b.c().a()) {
                s = "(friendship IS NULL OR (friendship & 1 == 0)) AND user_id!=?";
                array = new String[] { Long.toString(this.b.a().a()) };
            }
            else {
                s = null;
                array = null;
            }
            return new k(this.c, appendQueryParameter.build(), cw.b, s, array, null);
        }
        return null;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final int d = this.d();
        if (this.e.c(n)) {
            final Intent intent = (Intent)this.e.getItem(n);
            if (intent != null) {
                this.c.startActivity(intent);
            }
        }
        else if (!this.e.b(n)) {
            final Intent putExtra = new Intent(this.c, (Class)ProfileActivity.class).putExtra("user_id", n2).putExtra("type", d);
            final Integer j = this.b.c().j(n2);
            if (j != null) {
                putExtra.putExtra("friendship", (Serializable)j);
            }
            final UserView a = ((pg)this.e.c()).a(view);
            final PromotedContent promotedContent = a.getPromotedContent();
            if (promotedContent != null) {
                this.f.a(PromotedEvent.d, promotedContent);
                putExtra.putExtra("pc", (Serializable)promotedContent);
            }
            final String a2 = ah.a(this.b.b());
            if (d == 10) {
                putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.o)).b(a2)).c(this.j()));
            }
            ah.a(this.f, this.a, n2, this.o, ah.a(a2, this.j() + "::user:profile_click"), promotedContent, ((yk)a.getTag()).f, this.d);
            this.h.startActivityForResult(putExtra, 2);
        }
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
    
    @Override
    public void p() {
        this.s();
    }
    
    @Override
    public void q() {
        this.a(this.m, ah.a(ah.a(this.b.b()), this.j() + ":stream::results"));
    }
    
    protected void r() {
        this.b();
        this.i.initLoader(this.g(), null, this);
    }
}
