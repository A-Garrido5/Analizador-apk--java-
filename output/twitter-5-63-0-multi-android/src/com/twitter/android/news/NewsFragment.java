// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.news;

import android.widget.ListAdapter;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.bv;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.ar;
import android.os.Bundle;
import android.text.TextUtils;
import com.twitter.library.client.k;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import android.content.Context;
import com.twitter.library.client.az;
import android.view.View;
import android.widget.ListView;
import com.twitter.refresh.widget.a;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.TwitterListFragment;

public class NewsFragment extends TwitterListFragment
{
    private String a;
    private String b;
    private long c;
    private int d;
    private boolean e;
    
    public NewsFragment() {
        this.e = false;
    }
    
    private void a(final String s) {
        this.aw().a(this.aF().g(), s);
    }
    
    private void a(final String s, final long n) {
        this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { s })).a(n));
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        final aa aa = (aa)y.l().b();
        if (n == 1 && !aa.a()) {
            Toast.makeText(this.an, 2131297299, 1).show();
        }
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        super.a(loader, cursor);
        if (cursor.getCount() == 0) {
            this.d(3);
            return;
        }
        if (this.e) {
            this.e = false;
            this.b(0, 0);
        }
        else {
            this.a(new a(0, this.c, this.d), true);
        }
        this.c_(3);
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        final String string = ((Cursor)listView.getItemAtPosition(n)).getString(8);
        final FragmentActivity activity = this.getActivity();
        com.twitter.android.client.am.a((Context)activity, null, string, az.a((Context)activity).b().g(), null, null, null);
        this.a("news:headline::details:click", n - 1);
    }
    
    @Override
    protected void a(final a a) {
        new k((Context)this.getActivity(), this.aF().e(), "news").a().a("item", a.b).a("offset", a.c).apply();
        this.c = a.b;
        this.d = a.c;
    }
    
    @Override
    protected void a(final a a, final boolean b) {
        final long b2 = a.b;
        if (b2 > 0L) {
            this.b(this.a(b2), a.c);
        }
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        if (b) {
            this.a_(3);
            this.A_();
        }
        else if (this.T() == null) {
            this.a_(3);
            this.q();
        }
    }
    
    @Override
    public void c(final boolean b) {
        super.c(b);
        this.a("news:headline:::pull_to_refresh");
    }
    
    protected boolean d(final int n) {
        if (!this.f(n)) {
            return false;
        }
        final ns ns = new ns((Context)this.getActivity(), this.aF());
        String a;
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            a = "JP";
        }
        else {
            a = this.a;
        }
        final ns a2 = ns.a(a);
        String b;
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            b = "ja";
        }
        else {
            b = this.b;
        }
        this.a(a2.b(b).c(30), 1, n);
        this.a_(n);
        return true;
    }
    
    @Override
    protected void i() {
        this.d(4);
    }
    
    @Override
    protected int j() {
        return 0;
    }
    
    @Override
    protected void k() {
        final k k = new k((Context)this.getActivity(), this.aF().e(), "news");
        this.c = k.getLong("item", 0L);
        this.d = k.getInt("offset", 0);
        this.a(new a(0, this.c, this.d), false);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.W == null) {
            this.W = (ListAdapter)new com.twitter.android.news.a((Context)this.getActivity());
        }
        this.Y().setAdapter(this.W);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Bundle arguments = this.getArguments();
        this.a = arguments.getString("country");
        this.b = arguments.getString("language");
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(ar.a, this.aF().g()), bv.a, "country=? AND language=?", new String[] { this.a, this.b }, null);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a(false);
        this.a("news:headline:::impression");
    }
}
