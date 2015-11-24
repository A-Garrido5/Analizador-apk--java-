// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.h;
import com.twitter.library.provider.ap;
import android.text.TextUtils;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.widget.ListAdapter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.provider.DraftTweet;
import java.io.Serializable;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.content.Context;
import com.twitter.android.composer.au;
import com.twitter.library.provider.f;
import android.view.View;
import android.widget.ListView;
import android.database.Cursor;
import android.support.v4.content.Loader;
import com.twitter.library.client.Session;
import com.twitter.android.client.TwitterListFragment;

public class DraftsFragment extends TwitterListFragment
{
    private Session a;
    private fp b;
    private String c;
    private boolean d;
    private long e;
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        this.b.swapCursor(cursor);
        this.ar();
        this.c_(3);
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        final DraftTweet a = com.twitter.library.provider.f.a((Cursor)listView.getItemAtPosition(n));
        if (this.d) {
            com.twitter.android.composer.au.a((Context)this.getActivity()).a(a).a(this.c).a(this);
            this.aw().a(this.aF().g(), ":drafts:composition::impression");
            return;
        }
        final FragmentActivity activity = this.getActivity();
        activity.setResult(-1, new Intent().putExtra("selected_draft", (Serializable)a));
        activity.finish();
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.b == null) {
            this.b = new fp((Context)this.getActivity());
        }
        this.Y().setAdapter((ListAdapter)this.b);
        if (this.b.getCursor() == null) {
            this.getLoaderManager().initLoader(0, null, this);
            this.a_(3);
        }
        this.aw().a(this.aF().g(), ":drafts:::impression");
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Bundle arguments = this.getArguments();
        final String string = arguments.getString("account_name");
        this.d = arguments.getBoolean("start_composer", false);
        this.e = arguments.getLong("excluded_draft_id", 0L);
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.a = this.aF();
            this.c = this.a.e();
        }
        else {
            this.a = this.aE().b(string);
            this.c = string;
        }
        this.j(true);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this.getActivity(), ap.a.buildUpon().appendQueryParameter("ownerId", String.valueOf(this.a.g())).build(), com.twitter.library.provider.h.a, "sending_state!=1 AND _id<>?", new String[] { Long.toString(this.e) }, null);
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        this.b.swapCursor(null);
    }
}
