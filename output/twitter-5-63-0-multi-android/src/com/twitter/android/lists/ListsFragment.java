// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.lists;

import android.widget.ListAdapter;
import android.net.Uri;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aq;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.support.v4.content.Loader;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.database.Cursor;
import com.twitter.android.client.TwitterListFragment;

public class ListsFragment extends TwitterListFragment
{
    private boolean a;
    private boolean b;
    private boolean c;
    private int d;
    private String e;
    private h f;
    
    private int e(final int n) {
        int n2 = 0;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + n);
            }
            case 1: {
                final Cursor t = this.T();
                n2 = 0;
                if (t == null) {
                    return n2;
                }
                final int count = t.getCount();
                n2 = 0;
                if (count > 0) {
                    n2 = 1;
                    return n2;
                }
                return n2;
            }
            case 2:
            case 3: {
                return n2;
            }
        }
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        final aa aa = (aa)y.l().b();
        if (n == 1 && !aa.a()) {
            Toast.makeText(this.an, 2131297155, 1).show();
        }
    }
    
    @Override
    protected void a(final Cursor cursor) {
        if (this.au() && cursor.getInt(6) == 0) {
            this.d(1);
        }
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        super.a(loader, cursor);
        if (cursor == null || cursor.getCount() == 0 || this.a) {
            this.a = false;
            this.d(3);
            return;
        }
        this.c_(3);
    }
    
    public void a(final ListView listView, final View view, final int n, final long n2) {
        switch (listView.getChoiceMode()) {
            default: {
                this.startActivity((Intent)listView.getItemAtPosition(n));
                break;
            }
            case 1: {
                if (this.f != null) {
                    final Cursor cursor = (Cursor)listView.getItemAtPosition(n);
                    this.f.a(cursor.getLong(1), cursor.getString(2));
                    return;
                }
                break;
            }
        }
    }
    
    void a(final h f) {
        this.f = f;
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        if (b) {
            this.a_(3);
            this.A_();
        }
        else {
            if (this.T() == null) {
                this.a_(3);
                this.q();
                return;
            }
            if (((com.twitter.android.lists.d)this.W).isEmpty()) {
                this.d(3);
            }
        }
    }
    
    protected boolean d(final int n) {
        if (!this.f(n)) {
            return false;
        }
        String s;
        if (this.b) {
            s = "own_lists";
        }
        else {
            s = "lists";
        }
        final String a = TwitterListFragment.a(s, null, n, -1);
        if (this.c) {
            this.a(new ne((Context)this.getActivity(), this.aF()).c(this.d).d(this.e(n)).a(this.e).a(this.X).e(100).b("scribe_event", a), 1, n);
        }
        else {
            this.a(new nd((Context)this.getActivity(), this.aF()).c(this.e(n)).a(this.X).a(this.e).d(100).b("scribe_event", a), 1, n);
        }
        this.a_(n);
        return true;
    }
    
    public void i() {
        this.d(2);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.W == null) {
            this.W = (ListAdapter)new com.twitter.android.lists.d((Context)this.getActivity(), 2, this.Y == 0);
        }
        this.Y().setAdapter(this.W);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final g a = com.twitter.android.lists.g.a(this.getArguments());
        this.a = a.c;
        this.b = a.a;
        this.c = a.b;
        this.d = a.d;
        this.e = a.e;
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        final Uri a = com.twitter.library.provider.ae.a(com.twitter.library.provider.aq.a, this.aF().g());
        String s;
        String[] array;
        if (this.c) {
            s = "ev_type=5 AND list_mapping_user_id=? AND list_mapping_type=?";
            array = new String[] { Long.toString(this.X), Integer.toString(this.d) };
        }
        else {
            s = "ev_type=5 AND list_mapping_user_id=? AND list_mapping_type IN (0,2)";
            array = new String[] { Long.toString(this.X) };
        }
        return new CursorLoader((Context)this.getActivity(), a, com.twitter.android.lists.f.a, s, array, null);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a(false);
    }
}
