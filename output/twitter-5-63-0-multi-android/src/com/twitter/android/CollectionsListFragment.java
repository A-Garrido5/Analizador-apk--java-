// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListAdapter;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cq;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aq;
import android.os.Bundle;
import android.support.v4.widget.CursorAdapter;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.widget.x;
import android.view.View;
import android.widget.ListView;
import android.support.v4.content.Loader;
import android.database.Cursor;
import com.twitter.library.api.timeline.e;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.android.client.TwitterListFragment;

public class CollectionsListFragment extends TwitterListFragment implements td
{
    private int a;
    private long b;
    private boolean c;
    private boolean d;
    private ci e;
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        if (!((aa)y.l().b()).a()) {
            Toast.makeText(this.an, 2131296466, 1).show();
            return;
        }
        this.c = ((com.twitter.library.api.timeline.e)y).b();
    }
    
    @Override
    protected void a(final Cursor cursor) {
        if (this.au() && !this.c) {
            this.a(1);
        }
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        super.a(loader, cursor);
        if (!this.d || cursor == null || cursor.getCount() == 0) {
            this.a(3);
            this.d = true;
            return;
        }
        this.c_(3);
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        final x x = (x)view.getTag();
        switch (listView.getChoiceMode()) {
            default: {
                final Intent intent = new Intent((Context)this.getActivity(), (Class)CollectionPermalinkActivity.class);
                intent.putExtra("type", 27).putExtra("timeline_tag", x.d);
                this.startActivity(intent);
                break;
            }
            case 1: {
                if (this.e != null) {
                    this.e.a(x.d);
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final ci e) {
        this.e = e;
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
            if (((CursorAdapter)this.W).isEmpty()) {
                this.a(3);
                this.d = true;
            }
        }
    }
    
    protected boolean a(final int n) {
        int n2 = 1;
        int n3;
        if (n == n2) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (this.a == 0) {
            n4 = 200;
        }
        else {
            n4 = 201;
        }
        if (this.a == 0) {
            n2 = 0;
        }
        final com.twitter.library.api.timeline.e e = new com.twitter.library.api.timeline.e((Context)this.getActivity(), this.aF(), this.b, n3);
        e.g(n2);
        return this.a(e, n4, n);
    }
    
    @Override
    public void ac_() {
    }
    
    public void i() {
        this.a(2);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.b = bundle.getLong("user_id");
            this.c = bundle.getBoolean("is_last");
            this.a = bundle.getInt("list_type");
        }
        else {
            this.b = this.getArguments().getLong("user_id");
            this.a = this.getArguments().getInt("list_type");
        }
        if (this.W == null) {
            this.W = (ListAdapter)new ch((Context)this.getActivity(), this.aF().g());
        }
        this.Y().setAdapter(this.W);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        if (bundle == null) {
            final Bundle arguments = this.getArguments();
            arguments.putInt("empty_title", 2131296470);
            arguments.putInt("empty_desc", 2131296469);
        }
        super.onCreate(bundle);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        String s;
        if (this.a == 0) {
            s = "ev_type=4 AND list_mapping_user_id=? AND list_mapping_type=0";
        }
        else {
            s = "ev_type=4 AND list_mapping_user_id=? AND list_mapping_type=2";
        }
        return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(com.twitter.library.provider.aq.a, this.X), cq.a, s, new String[] { Long.toString(this.b) }, "ev_title ASC ");
    }
    
    @Override
    public void onPause() {
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a(false);
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("user_id", this.b);
        bundle.putBoolean("is_last", this.c);
        bundle.putInt("list_type", this.a);
    }
}
