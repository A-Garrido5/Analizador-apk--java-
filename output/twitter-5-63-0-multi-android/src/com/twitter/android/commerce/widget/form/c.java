// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.form;

import android.content.CursorLoader;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.app.Activity;
import android.view.View;
import com.twitter.library.client.au;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.api.search.g;
import android.content.Loader;
import android.os.Bundle;
import com.twitter.library.provider.z;
import android.widget.ListAdapter;
import com.twitter.android.tj;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.internal.android.widget.HorizontalListView;
import android.database.Cursor;
import android.content.Context;
import com.twitter.library.provider.bg;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.library.client.Session;
import com.twitter.android.client.TwitterFragmentActivity;
import android.app.LoaderManager;
import android.app.LoaderManager$LoaderCallbacks;

public class c implements LoaderManager$LoaderCallbacks
{
    private long a;
    private LoaderManager b;
    private TwitterFragmentActivity c;
    private long d;
    private String e;
    private boolean f;
    private Session g;
    private b h;
    private AdapterView$OnItemClickListener i;
    private final bg j;
    
    public c(final TwitterFragmentActivity c, final String e, final long a, final Session g, final b h, final AdapterView$OnItemClickListener i) {
        this.c = c;
        this.b = c.getLoaderManager();
        this.d = g.g();
        this.g = g;
        this.e = e;
        this.h = h;
        this.i = i;
        this.j = bg.a((Context)c, g.g());
        this.a = a;
        this.j.i(this.a);
    }
    
    private HorizontalListView a(final Cursor cursor) {
        final HorizontalListView horizontalListView = (HorizontalListView)LayoutInflater.from((Context)this.c).inflate(2130968794, (ViewGroup)null, false).findViewById(2131886392);
        final tj adapter = new tj((Context)this.c, true);
        horizontalListView.setAdapter((ListAdapter)adapter);
        horizontalListView.setOnItemClickListener(this.i);
        adapter.swapCursor((Cursor)new z(cursor, 0, -1 + cursor.getCount()));
        cursor.moveToFirst();
        return horizontalListView;
    }
    
    public void a() {
        this.b.initLoader(1, (Bundle)null, (LoaderManager$LoaderCallbacks)this);
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        if ((cursor == null || cursor.getCount() == 0) && !this.f) {
            this.f = true;
            final g c = new g((Context)this.c, this.g, this.a, this.e, 1, "api_call", this.e, 0, null, false).a(3, false, false, false).a(false).c(20);
            com.twitter.android.events.b.a(c);
            as.a((Context)this.c).a(c, 1, 0, null);
        }
        else if (cursor.getCount() > 0) {
            final HorizontalListView a = this.a(cursor);
            final ViewGroup viewGroup = (ViewGroup)a.getParent();
            if (viewGroup != null) {
                viewGroup.removeView((View)a);
            }
            if (this.h != null) {
                this.h.a((View)a);
            }
            final ViewMoreContainer viewMoreContainer = new ViewMoreContainer(this.c, this.e, this.e, 3);
            viewMoreContainer.setDescription(this.c.getString(2131296620));
            if (this.h != null) {
                this.h.a(viewMoreContainer);
            }
        }
    }
    
    public void b() {
        this.j.j(this.a);
    }
    
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return (Loader)new CursorLoader((Context)this.c, ae.a(aw.a, this.d), cc.a, "search_id=?", new String[] { String.valueOf(this.a) }, "type_id ASC, _id ASC");
    }
    
    public void onLoaderReset(final Loader loader) {
    }
}
