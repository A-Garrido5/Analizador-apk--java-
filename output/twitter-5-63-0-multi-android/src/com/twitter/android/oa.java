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
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.database.Cursor;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import com.twitter.library.media.util.s;
import android.net.Uri;
import java.util.ArrayList;
import com.twitter.android.metrics.b;
import com.twitter.android.client.bv;
import android.view.View$OnClickListener;
import com.twitter.android.widget.ScrollingHeaderListFragment;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.media.util.r;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.api.PromotedEvent;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;

class oa implements mz
{
    final /* synthetic */ PhotoGridFragment a;
    private final HashSet b;
    
    private oa(final PhotoGridFragment a) {
        this.a = a;
        this.b = new HashSet();
    }
    
    @Override
    public void a(final View view, final Object o, final Bundle bundle) {
        final nx nx = (nx)view.getTag();
        if (this.a.d.add(nx.a)) {
            final PromotedContent j = nx.b.j;
            if (j != null && this.b.add(j.impressionId)) {
                this.a.aw().a(PromotedEvent.a, j);
            }
            this.a.c.add(TwitterScribeItem.a(this.a.getActivity().getApplicationContext(), nx.b, this.a.Z, null));
        }
        if (view instanceof r) {
            this.a.k.a((r)view, true);
        }
    }
}
