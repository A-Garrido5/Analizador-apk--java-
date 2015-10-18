// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import android.support.v4.content.CursorLoader;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.client.TwitterFragmentActivity;
import android.widget.ListAdapter;
import com.twitter.android.client.u;
import com.twitter.errorreporter.ErrorReporter;
import android.widget.ListView;
import com.twitter.refresh.widget.a;
import com.twitter.library.view.z;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import java.io.Serializable;
import android.widget.TextView;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.c;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.TwitterTopic$Data;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.api.TwitterTopic$Metadata;
import com.twitter.android.events.b;
import android.text.TextUtils;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.y;
import android.os.Parcelable;
import com.twitter.library.api.search.g;
import android.content.Context;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.scribe.ScribeAssociation;
import android.support.v4.app.Fragment;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import com.twitter.library.scribe.ScribeLog$SearchDetails;
import com.twitter.library.util.FriendshipCache;
import java.util.ArrayList;
import android.util.SparseArray;
import com.twitter.ui.dialog.e;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import com.twitter.android.widget.TopicView;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.internal.android.widget.GroupedRowView;
import com.twitter.library.widget.UserView;
import com.twitter.library.scribe.TwitterScribeItem;
import android.os.Bundle;
import android.view.View;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.provider.Tweet;
import java.util.HashSet;

public class rl implements mz
{
    final /* synthetic */ SearchResultsFragment a;
    private final HashSet b;
    
    public rl(final SearchResultsFragment a) {
        this.a = a;
        this.b = new HashSet();
    }
    
    private void a(final Tweet tweet) {
        final PromotedContent j = tweet.j;
        if (j != null && this.b.add(j.impressionId)) {
            this.a.aw().a(PromotedEvent.a, j);
        }
    }
    
    @Override
    public void a(final View view, final Object o, final Bundle bundle) {
        final rh rh = (rh)view.getTag();
        final ro m = rh.m;
        final TopicView j = rh.j;
        final int int1 = bundle.getInt("page", 0);
        if (this.a.aK.add(10L * m.a + int1)) {
            TwitterScribeItem twitterScribeItem = null;
            switch (m.b) {
                default: {
                    twitterScribeItem = null;
                    break;
                }
                case 0:
                case 24:
                case 32: {
                    final Tweet tweet = rh.a.f.getTweet();
                    this.a(tweet);
                    twitterScribeItem = TwitterScribeItem.a(this.a.getActivity().getApplicationContext(), tweet, this.a.Z, null);
                    twitterScribeItem.C = bundle.getString("reason_text");
                    break;
                }
                case 30: {
                    final Tweet tweet2 = rh.a.f.getTweet();
                    this.a(tweet2);
                    twitterScribeItem = TwitterScribeItem.a(this.a.getActivity().getApplicationContext(), tweet2, this.a.Z, rh.m.m.a());
                    break;
                }
                case 4: {
                    final Tweet tweet3 = rh.a.f.getTweet();
                    this.a(tweet3);
                    twitterScribeItem = TwitterScribeItem.a(this.a.getActivity().getApplicationContext(), tweet3, this.a.Z, "news");
                    break;
                }
                case 9: {
                    final Tweet tweet4 = rh.a.f.getTweet();
                    this.a(tweet4);
                    twitterScribeItem = TwitterScribeItem.a(this.a.getActivity().getApplicationContext(), tweet4, this.a.Z, "highlight");
                    break;
                }
                case 1: {
                    final UserView userView = (UserView)((GroupedRowView)view).getChildAt(0);
                    final PromotedContent promotedContent = userView.getPromotedContent();
                    if (promotedContent != null && this.b.add(promotedContent.impressionId)) {
                        this.a.aw().a(PromotedEvent.a, promotedContent);
                    }
                    twitterScribeItem = TwitterScribeItem.a(userView.getUserId(), promotedContent, null, "list");
                    break;
                }
                case 6: {
                    final xv a = ((xq)rh.d.getAdapter()).a(int1);
                    if (a.a == 1) {
                        this.a.aw().a(this.a.X, this.a.B, this.a.M_(), "user_gallery", null, "impression");
                        if (a.e != null && this.b.add(a.e.impressionId)) {
                            this.a.aw().a(PromotedEvent.a, a.e);
                        }
                        twitterScribeItem = TwitterScribeItem.a(a.d, a.e, null, "list");
                        break;
                    }
                    twitterScribeItem = null;
                    break;
                }
                case 3: {
                    twitterScribeItem = TwitterScribeItem.a(m.i, "related_query");
                    break;
                }
                case 2: {
                    twitterScribeItem = TwitterScribeItem.a(m.h.query, "spelling_correction");
                    break;
                }
                case 12: {
                    final String a2 = m.m.a();
                    this.a.aw().a(this.a.X, this.a.B, this.a.M_(), a2, null, "impression");
                    twitterScribeItem = TwitterScribeItem.a(m.m.query, a2);
                    break;
                }
                case 29: {
                    if (m.m.b()) {
                        this.a.aw().a(this.a.X, this.a.B, this.a.M_(), m.m.a(), null, "impression");
                    }
                    twitterScribeItem = null;
                    break;
                }
                case 18: {
                    twitterScribeItem = new TwitterScribeItem();
                    twitterScribeItem.c = 16;
                    break;
                }
                case 11:
                case 28: {
                    twitterScribeItem = new TwitterScribeItem();
                    twitterScribeItem.c = 16;
                    if (!this.a.aH()) {
                        twitterScribeItem.w = "single";
                        twitterScribeItem.b = this.a.D;
                        break;
                    }
                    this.a.q = j.getTopicType();
                    break;
                }
                case 27: {
                    final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.a.X).b(new String[] { "search:universal_top::recommendation:show" });
                    final TwitterScribeItem twitterScribeItem2 = new TwitterScribeItem();
                    twitterScribeItem2.b = this.a.D;
                    twitterScribeItem2.x = this.a.u;
                    twitterScribeItem2.c = 12;
                    twitterScribeItem2.y = this.a.C;
                    twitterScribeLog.a(twitterScribeItem2);
                    this.a.aw().a(twitterScribeLog);
                    twitterScribeItem = null;
                    break;
                }
            }
            if (twitterScribeItem != null) {
                twitterScribeItem.g = 1 + bundle.getInt("position");
                this.a.aI.add(twitterScribeItem);
            }
        }
    }
}
