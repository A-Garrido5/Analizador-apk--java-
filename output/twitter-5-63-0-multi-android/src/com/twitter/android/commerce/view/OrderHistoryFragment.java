// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.widget.ListAdapter;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.bw;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.at;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.commerce.model.OrderHistoryList;
import android.widget.ListView;
import android.view.ViewGroup;
import android.view.View;
import android.support.v4.widget.CursorAdapter;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.widget.Toast;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.twitter.library.media.manager.j;
import com.twitter.android.commerce.network.c;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterListFragment;

public class OrderHistoryFragment extends TwitterListFragment implements View$OnClickListener
{
    private boolean a;
    private z b;
    private com.twitter.android.commerce.network.c c;
    
    private void a(final j j) {
        if (j != null && j.o()) {
            final Uri parse = Uri.parse(j.c());
            this.startActivity(new Intent((Context)this.getActivity(), (Class)CommerceImageActivity.class).setData(parse).putExtra("image_url", parse.toString()));
        }
    }
    
    public void a(final Bundle bundle) {
        Toast.makeText((Context)this.getActivity(), (CharSequence)this.getResources().getString(2131296666), 1).show();
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        ((CursorAdapter)this.W).swapCursor(cursor);
        if (((CursorAdapter)this.W).isEmpty() && !this.a) {
            this.d(3);
            return;
        }
        this.c_(3);
    }
    
    @Override
    protected void a(final View aa) {
        final ViewGroup viewGroup = (ViewGroup)aa;
        final View inflate = this.getActivity().getLayoutInflater().inflate(2130968673, (ViewGroup)null);
        viewGroup.addView(inflate);
        this.c(inflate);
        this.aa = aa;
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        this.startActivity((Intent)listView.getItemAtPosition(n));
    }
    
    public void a(final com.twitter.android.commerce.network.c c) {
        this.c = c;
    }
    
    public void a(final OrderHistoryList list) {
        this.a = true;
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        if (b) {
            this.a_(3);
            this.getLoaderManager().restartLoader(0, null, this);
        }
        else if (this.T() == null) {
            this.a_(3);
            this.getLoaderManager().initLoader(0, null, this);
        }
    }
    
    protected void d(final int n) {
        as.a((Context)this.getActivity()).a(new rq((Context)this.getActivity(), this.c.a(), null), this.b = new z(this));
    }
    
    @Override
    protected void i() {
        super.i();
        this.d(3);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.W == null) {
            this.W = (ListAdapter)new com.twitter.android.commerce.view.y(this, (Context)this.getActivity());
        }
        this.Y().setAdapter(this.W);
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886497) {
            this.a(((MediaImageView)view).getImageRequest());
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.a(new com.twitter.android.commerce.network.c((Context)this.getActivity(), this.getActivity().getIntent().getExtras()));
        if (bundle == null) {
            this.a = false;
            return;
        }
        this.a = bundle.getBoolean("state_fetched", false);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(at.a, this.c.a().g()), bw.a, null, null, null);
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        ((CursorAdapter)this.W).swapCursor(null);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a(false);
        if (((CursorAdapter)this.W).isEmpty()) {
            this.d(3);
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("state_fetched", this.a);
    }
}
