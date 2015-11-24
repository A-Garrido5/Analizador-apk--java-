// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListAdapter;
import android.content.SharedPreferences$Editor;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.bk;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.ag;
import android.content.Context;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.support.v4.widget.CursorAdapter;
import android.database.Cursor;
import android.support.v4.content.Loader;
import com.twitter.library.service.y;
import com.twitter.library.api.i;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.ArrayList;
import java.util.HashSet;
import android.content.SharedPreferences;
import com.twitter.android.client.TwitterListFragment;

public class CategoriesFragment extends TwitterListFragment implements te
{
    private boolean a;
    private boolean b;
    private boolean c;
    private SharedPreferences d;
    private HashSet e;
    private ArrayList f;
    private ArrayList g;
    
    private String r() {
        if (this.a) {
            return "welcome";
        }
        return "interests";
    }
    
    private String s() {
        if (this.a) {
            return "category";
        }
        return null;
    }
    
    private void t() {
        this.aw().a(this.aF().g(), "interests::::impression");
    }
    
    private void w() {
        this.y();
        this.z();
        this.e.clear();
    }
    
    private void y() {
        if (!this.f.isEmpty()) {
            this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.X).b(this.r(), this.s(), null, null, "results")).b(this.f));
            this.f.clear();
        }
    }
    
    private void z() {
        if (!this.g.isEmpty()) {
            this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.X).b(this.r(), this.s(), null, "user", "results")).b(this.g));
            this.g.clear();
        }
    }
    
    protected void a(final int n) {
        this.a(new i(this.an, this.aE().b(), this.X), 1, n);
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        if (n == 1) {
            this.b = true;
        }
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        ((CursorAdapter)this.W).swapCursor(cursor);
        if (((CursorAdapter)this.W).isEmpty() && !this.b) {
            this.a(3);
            return;
        }
        this.c_(3);
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        this.startActivity((Intent)listView.getItemAtPosition(n));
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        final String string = this.d.getString("loc", "");
        if (b) {
            this.a_(3);
            this.getLoaderManager().restartLoader(0, null, this);
        }
        else {
            if (string.length() > 0 && !string.equals(this.getResources().getConfiguration().locale.toString())) {
                this.a_(3);
                this.a(3);
                return;
            }
            if (this.T() == null) {
                this.a_(3);
                this.getLoaderManager().initLoader(0, null, this);
            }
        }
    }
    
    @Override
    public void e() {
        this.c = false;
        this.t();
    }
    
    @Override
    protected void i() {
        super.i();
        this.a(3);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.W == null) {
            this.W = (ListAdapter)new cc(this, (Context)this.getActivity());
        }
        this.Y().setAdapter(this.W);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.d = this.getActivity().getPreferences(0);
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.a = arguments.getBoolean("onboarding", false);
            this.c = arguments.getBoolean("is_hidden", false);
        }
        if (bundle == null) {
            if (this.a) {
                this.aw().a(this.aF().g(), this.r(), this.s(), null, null, "impression");
            }
            this.b = false;
        }
        else {
            this.b = bundle.getBoolean("state_fetched", false);
            this.c = bundle.getBoolean("is_hidden", this.c);
        }
        this.e = new HashSet();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(com.twitter.library.provider.ag.a, this.X), bk.a, null, null, null);
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        ((CursorAdapter)this.W).swapCursor(null);
    }
    
    @Override
    public void onPause() {
        super.onPause();
        final SharedPreferences$Editor edit = this.d.edit();
        edit.putString("loc", this.getResources().getConfiguration().locale.toString());
        edit.apply();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a(false);
        if (((CursorAdapter)this.W).isEmpty()) {
            this.a(3);
        }
        if (!this.c) {
            this.t();
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("state_fetched", this.b);
        bundle.putBoolean("is_hidden", this.c);
    }
    
    @Override
    public void onStop() {
        this.w();
        super.onStop();
    }
    
    @Override
    public void v_() {
        this.c = true;
    }
}
