// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.widget.ListAdapter;
import com.twitter.android.client.u;
import android.os.Parcelable;
import com.twitter.android.client.TwitterListFragment;
import android.view.View$OnClickListener;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.refresh.widget.a;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.api.search.g;
import com.twitter.library.service.y;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.library.provider.cc;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import java.util.ArrayList;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.api.PromotedEvent;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;

class re implements mz
{
    final /* synthetic */ SearchPhotosFragment a;
    private final HashSet b;
    
    private re(final SearchPhotosFragment a) {
        this.a = a;
        this.b = new HashSet();
    }
    
    @Override
    public void a(final View view, final Object o, final Bundle bundle) {
        final nx nx = (nx)view.getTag();
        if (this.a.aq.add(nx.a)) {
            final PromotedContent j = nx.b.j;
            if (j != null && this.b.add(j.impressionId)) {
                this.a.aw().a(PromotedEvent.a, j);
            }
            this.a.ap.add(TwitterScribeItem.a(this.a.getActivity().getApplicationContext(), nx.b, this.a.Z, null));
        }
    }
}
