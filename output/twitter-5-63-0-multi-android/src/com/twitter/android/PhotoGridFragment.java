// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.UserSettings;
import com.twitter.library.client.Session;
import android.support.v4.content.CursorLoader;
import android.os.Parcelable;
import java.io.Serializable;
import com.twitter.library.provider.Tweet;
import android.content.Intent;
import android.net.Uri$Builder;
import android.widget.ListAdapter;
import com.twitter.android.client.u;
import android.content.ContentUris;
import com.twitter.library.provider.az;
import android.os.Bundle;
import com.twitter.library.api.timeline.ak;
import android.content.Context;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.android.profiles.ah;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.AbsListView;
import android.support.v4.content.Loader;
import com.twitter.library.api.timeline.ai;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.database.Cursor;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import com.twitter.library.media.util.s;
import android.net.Uri;
import java.util.HashSet;
import java.util.ArrayList;
import com.twitter.android.metrics.b;
import com.twitter.android.client.bv;
import android.view.View$OnClickListener;
import com.twitter.android.widget.ScrollingHeaderListFragment;

public class PhotoGridFragment extends ScrollingHeaderListFragment implements View$OnClickListener, bv
{
    protected boolean a;
    protected com.twitter.android.metrics.b b;
    private final ArrayList c;
    private final HashSet d;
    private long e;
    private Uri f;
    private nw g;
    private boolean h;
    private int i;
    private boolean j;
    private s k;
    
    public PhotoGridFragment() {
        this.c = new ArrayList();
        this.d = new HashSet();
    }
    
    private long d(final int n) {
        long long1 = 0L;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + n);
            }
            case 2:
            case 4: {
                final Cursor a = this.g.a();
                if (a != null && a.moveToFirst()) {
                    long1 = a.getLong(21);
                    return long1;
                }
                return long1;
            }
            case 1:
            case 3: {
                return long1;
            }
        }
    }
    
    private long e(final int n) {
        long long1 = 0L;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + n);
            }
            case 1: {
                final Cursor a = this.g.a();
                if (a != null && a.moveToLast()) {
                    long1 = a.getLong(21);
                    return long1;
                }
                return long1;
            }
            case 2:
            case 3:
            case 4: {
                return long1;
            }
        }
    }
    
    private boolean r() {
        return this.g.isEmpty() && !this.h;
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968967, viewGroup);
    }
    
    @Override
    public void a(final int n, final y y) {
        this.c(y.b);
        this.b.j();
        if (!((aa)y.l().b()).a()) {
            Toast.makeText(this.an, 2131298000, 1).show();
            this.c_(y.R());
        }
        else if (((ai)y).K() == 0) {
            this.a = true;
        }
    }
    
    protected void a(final Cursor cursor) {
        if (this.au() && this.i == 0 && !this.a && cursor.getCount() < 400) {
            this.c(1);
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        this.g.a(cursor);
        this.c_(this.i);
        if (this.r()) {
            if (!this.c(3)) {
                this.b.j();
            }
            this.h = true;
            return;
        }
        this.b.j();
    }
    
    protected void a(final boolean b) {
        if (b) {
            this.a_(5);
            this.A_();
        }
        else {
            if (this.g.a() == null) {
                this.a_(5);
                this.q();
                return;
            }
            if (this.r()) {
                this.c(3);
                this.h = true;
            }
        }
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n) {
        if (n == 2 || n == 0) {
            this.g.b(n == 2);
        }
        return false;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        if (n2 == 0 || !b) {
            return super.a(absListView, n, n2, n3, b);
        }
        if (n == 0) {
            this.an();
        }
        else if (this.g.getCount() > 0 && n > 0 && n + n2 >= n3) {
            this.a(this.g.a());
        }
        return super.a(absListView, n, n2, n3, b);
    }
    
    protected void a_(final int i) {
        super.a_(this.i = i);
    }
    
    public void ae_() {
        super.ae_();
        if (!this.c.isEmpty()) {
            this.aw().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { com.twitter.android.profiles.ah.a(this.m(), "photo_grid:stream::tweets") })).a(this.Z)).b(this.c));
            this.c.clear();
        }
    }
    
    protected void c() {
        super.c();
        this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { com.twitter.android.profiles.ah.a(this.m(), "photo_grid:::impression") })).a(this.Z));
    }
    
    protected boolean c(final int i) {
        if (!this.f(i)) {
            return false;
        }
        this.i = i;
        final String a = TwitterListFragment.a(this.m(), "photo_grid", i, -1);
        final ak b = new ai((Context)this.getActivity(), this.aF(), this.e, 17).c(this.d(i)).b(this.e(i));
        int n;
        if (i == 2 || i == 4) {
            n = 20;
        }
        else {
            n = 0;
        }
        return this.a(b.c(n).b("scribe_event", a), 0, i);
    }
    
    protected void c_(final int n) {
        this.i = 0;
        super.c_(n);
    }
    
    protected void e() {
        (this.b = new com.twitter.android.metrics.b("list:photogrid", "list:photogrid", ih.l, this.av())).b(this.aE().b().g());
        this.b.i();
    }
    
    protected void i() {
        this.c(2);
    }
    
    protected String m() {
        return com.twitter.android.profiles.ah.a(this.j);
    }
    
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final Bundle arguments = this.getArguments();
        if (bundle != null) {
            this.e = bundle.getLong("user_id", -1L);
            this.a = bundle.getBoolean("is_last");
        }
        else {
            this.e = arguments.getLong("user_id", -1L);
        }
        this.a((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.e)).b(this.m())).c("photo_grid"));
        final Uri$Builder buildUpon = ContentUris.withAppendedId(az.s, this.e).buildUpon();
        buildUpon.appendQueryParameter("ownerId", String.valueOf(this.aF().g()));
        this.f = buildUpon.build();
        this.a(this.g = new nw((Context)this.getActivity(), this.getResources().getInteger(2131623938), 1, -1, (View$OnClickListener)this, new oa(this, null), true));
        this.Y().setAdapter((ListAdapter)this.g);
    }
    
    public void onClick(final View view) {
        final nx nx = (nx)view.getTag();
        this.startActivity(new Intent((Context)this.getActivity(), (Class)GalleryActivity.class).setData(this.f).putExtra("prj", Tweet.a).putExtra("sel", "flags&1 != 0").putExtra("orderBy", "preview_draft_id DESC, updated_at DESC, _id ASC").putExtra("id", nx.b.Q).putExtra("media", (Serializable)nx.e).putExtra("context", 10).putExtra("association", (Parcelable)this.Z));
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.a((bv)this);
        this.j = this.getArguments().getBoolean("is_me");
        this.e();
        this.k = new s();
    }
    
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        final Session af = this.aF();
        final UserSettings j = af.j();
        String s;
        if (j != null && af.d() && j.k) {
            s = "flags&1 != 0";
        }
        else {
            s = "flags&1 != 0 AND flags&64 = 0";
        }
        return new CursorLoader((Context)this.getActivity(), this.f, Tweet.a, s, null, "preview_draft_id DESC, updated_at DESC, _id ASC");
    }
    
    public void onDestroy() {
        if (this.g != null) {
            this.g.a((Cursor)null);
        }
        super.onDestroy();
    }
    
    public void onLoaderReset(final Loader loader) {
        this.g.a((Cursor)null);
    }
    
    public void onResume() {
        super.onResume();
        if (this.e > 0L) {
            this.a(false);
        }
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("user_id", this.e);
        bundle.putBoolean("is_last", this.a);
    }
    
    public void onStart() {
        super.onStart();
        this.k.e();
    }
    
    public void onStop() {
        this.k.f();
        super.onStop();
    }
    
    protected boolean p() {
        return this.g.isEmpty();
    }
}
