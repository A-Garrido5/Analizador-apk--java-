// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.Rect;
import android.support.v4.widget.ExploreByTouchHelper;
import com.twitter.android.widget.fu;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.az;
import android.net.Uri$Builder;
import com.twitter.library.widget.ActionButton;
import com.twitter.android.widget.PromptDialogFragment;
import android.app.AlertDialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import com.twitter.library.scribe.ScribeItem;
import android.net.Uri;
import android.support.v4.app.Fragment;
import com.twitter.android.util.bb;
import android.widget.ListAdapter;
import com.twitter.android.widget.ChunkedAdapter;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper$DesignTreatment;
import com.twitter.android.av.p;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.android.client.am;
import com.twitter.library.util.bn;
import java.util.HashMap;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.provider.ae;
import android.widget.ListView;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import android.util.Pair;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.support.v4.app.FragmentActivity;
import android.content.DialogInterface;
import com.twitter.library.api.Translation;
import com.twitter.library.api.TwitterUser;
import com.twitter.internal.network.l;
import android.widget.Toast;
import com.twitter.android.client.ce;
import com.twitter.library.service.aa;
import com.twitter.library.api.b;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import com.twitter.library.client.u;
import java.io.Serializable;
import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.util.bo;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import com.twitter.library.service.y;
import com.twitter.util.i;
import java.util.Locale;
import com.twitter.library.util.text.c;
import com.twitter.library.featureswitch.d;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.api.UserSettings;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.android.card.z;
import com.twitter.library.card.j;
import com.twitter.android.card.a;
import com.twitter.android.card.w;
import com.twitter.android.card.v;
import com.twitter.android.client.bh;
import com.twitter.library.media.util.q;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.widget.PageableListView;
import com.twitter.library.api.ActivitySummary;
import com.twitter.android.widget.TweetDetailView;
import com.twitter.android.card.t;
import com.twitter.library.widget.tweet.content.f;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.widget.NewTweetBannerView;
import com.twitter.library.client.Session;
import com.twitter.android.widget.EngagementActionBar;
import com.twitter.android.widget.ToggleImageButton;
import com.twitter.ui.dialog.e;
import com.twitter.library.view.k;
import com.twitter.android.widget.ft;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import com.twitter.library.media.widget.r;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.widget.TweetView;
import java.util.Collection;
import java.util.List;
import com.twitter.library.provider.Tweet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.widget.BaseAdapter;

class wm extends BaseAdapter
{
    final /* synthetic */ TweetFragment a;
    private final ArrayList b;
    private boolean c;
    private mz d;
    
    private wm(final TweetFragment a) {
        this.a = a;
        this.b = new ArrayList();
        this.c = false;
    }
    
    private View a(final ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(2130969165, (ViewGroup)null);
    }
    
    public Tweet a(final int n) {
        return this.b.get(n);
    }
    
    public Tweet a(final long n) {
        final int b = this.b(n);
        if (b >= 0) {
            return this.a(b);
        }
        return null;
    }
    
    public void a(final mz d) {
        this.d = d;
    }
    
    public void a(final List list, final boolean b) {
        if (!this.b.equals(list)) {
            this.b.clear();
            this.b.addAll(list);
            if (b) {
                this.notifyDataSetChanged();
            }
        }
    }
    
    public void a(final boolean c) {
        if (this.c != c) {
            this.c = c;
            this.notifyDataSetChanged();
        }
    }
    
    public int b(final long n) {
        for (int count = this.getCount(), i = 0; i < count; ++i) {
            if (n == this.getItemId(i)) {
                return i;
            }
        }
        return -1;
    }
    
    public int getCount() {
        if (this.c && !this.b.isEmpty()) {
            return 1;
        }
        return this.b.size();
    }
    
    public long getItemId(final int n) {
        return this.b.get(n).D;
    }
    
    public View getView(final int n, View a, final ViewGroup viewGroup) {
        final Tweet tweet = this.b.get(n);
        if (a == null) {
            a = this.a(viewGroup);
            this.a.a(tweet, a);
        }
        final TweetView tweetView = (TweetView)a.getTag();
        final r a2 = this.a.a(tweetView);
        final g g = new g(true, this.a.getActivity(), tweet, DisplayMode.a, this.a.Z, this.a.l);
        g.a(3, a2);
        tweetView.setAlwaysExpandMedia(true);
        tweetView.setStripMediaUrls(true);
        tweetView.a(tweet, false, g);
        if (this.a.c(tweet)) {
            tweetView.e(true);
        }
        if (this.d != null) {
            final Bundle bundle = new Bundle(1);
            bundle.putInt("position", n + this.a.i.getCount());
            this.d.a(a, tweet, bundle);
        }
        return a;
    }
}
