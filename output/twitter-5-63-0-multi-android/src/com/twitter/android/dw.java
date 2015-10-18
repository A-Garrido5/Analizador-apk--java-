// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.content.CursorLoader;
import com.twitter.android.provider.l;
import com.twitter.android.provider.SuggestionsProvider;
import com.twitter.library.provider.ae;
import android.widget.ListAdapter;
import com.twitter.library.api.conversations.au;
import com.twitter.library.api.conversations.ai;
import com.twitter.util.collection.CollectionUtils;
import android.app.Activity;
import com.twitter.internal.android.widget.ToolBar;
import android.support.v4.app.FragmentActivity;
import android.annotation.TargetApi;
import com.twitter.library.api.conversations.bj;
import android.support.v4.content.Loader;
import android.net.Uri;
import android.content.DialogInterface;
import com.twitter.library.api.conversations.z;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.api.conversations.ak;
import com.twitter.android.util.al;
import com.twitter.android.util.ap;
import com.twitter.library.util.n;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import com.twitter.library.service.y;
import com.twitter.ui.widget.PromptView;
import android.widget.ListView;
import com.twitter.ui.widget.q;
import com.twitter.ui.dialog.e;
import com.twitter.android.autocomplete.a;
import android.widget.AdapterView$OnItemLongClickListener;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterListFragment;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class dw implements AdapterView$OnItemClickListener
{
    final /* synthetic */ DMInboxFragment a;
    
    dw(final DMInboxFragment a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final Cursor cursor = (Cursor)adapterView.getItemAtPosition(n);
        if (cursor != null) {
            this.a.aw().a(this.a.X, "messages:inbox:user_list:user:select");
            final long long1 = cursor.getLong(1);
            final Intent intent = new Intent((Context)this.a.getActivity(), (Class)DMActivity.class);
            intent.putExtra("user_ids", new long[] { long1 });
            this.a.startActivity(intent);
        }
    }
}
