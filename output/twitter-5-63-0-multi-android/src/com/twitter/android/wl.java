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
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.util.bo;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import com.twitter.util.i;
import java.util.Locale;
import com.twitter.library.util.text.c;
import com.twitter.library.featureswitch.d;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.api.UserSettings;
import com.twitter.library.card.instance.CardInstanceData;
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
import com.twitter.android.widget.EngagementActionBar;
import com.twitter.android.widget.ToggleImageButton;
import com.twitter.android.widget.ft;
import android.view.View$OnLongClickListener;
import com.twitter.library.media.widget.r;
import com.twitter.library.client.Session;
import android.os.Bundle;
import com.twitter.library.api.z;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.widget.TweetView;
import android.view.View$OnClickListener;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.view.k;
import com.twitter.library.metrics.e;
import java.util.Collection;
import java.util.List;
import android.view.LayoutInflater;
import com.twitter.library.util.bj;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import com.twitter.library.provider.Tweet;
import android.widget.BaseAdapter;

class wl extends BaseAdapter
{
    final /* synthetic */ TweetFragment a;
    private Tweet b;
    private final ArrayList c;
    private mz d;
    private boolean e;
    
    public wl(final TweetFragment a, final Tweet b) {
        this.a = a;
        this.b = b;
        (this.c = new ArrayList()).add(this.b);
    }
    
    private View a(final ViewGroup viewGroup) {
        int n;
        if (bj.e) {
            n = 2130969029;
        }
        else {
            n = 2130968699;
        }
        return LayoutInflater.from(viewGroup.getContext()).inflate(n, viewGroup, false);
    }
    
    public int a(final Tweet tweet) {
        for (int i = 0; i < this.getCount(); ++i) {
            if (tweet.equals(this.a(i))) {
                return i;
            }
        }
        return -1;
    }
    
    public Tweet a(final int n) {
        return this.c.get(n);
    }
    
    public Tweet a(final long n) {
        final int b = this.b(n);
        if (b >= 0) {
            return this.a(b);
        }
        return null;
    }
    
    public final List a() {
        final int size = this.c.size();
        final int min = Math.min(10, size);
        final ArrayList list = new ArrayList<Long>(min);
        for (int i = 0; i < min; ++i) {
            list.add(((Tweet)this.c.get(size - 1 - i)).Q);
        }
        return list;
    }
    
    public void a(final int n, final Tweet tweet) {
        this.c.add(n, tweet);
    }
    
    public void a(final mz d) {
        this.d = d;
    }
    
    public void a(final ArrayList list) {
        this.c.clear();
        this.c.addAll(list);
    }
    
    public int b(final long n) {
        for (int count = this.getCount(), i = 0; i < count; ++i) {
            if (n == this.getItemId(i)) {
                return i;
            }
        }
        return -1;
    }
    
    public Tweet b() {
        return this.c.get(-1 + this.c.size());
    }
    
    public void b(final Tweet b) {
        this.b = b;
        final int a = this.a(b);
        if (a >= 0) {
            this.c.set(a, b);
            this.notifyDataSetChanged();
        }
    }
    
    public void c(final long n) {
        final int b = this.b(n);
        if (b >= 0) {
            this.c.remove(b);
            this.notifyDataSetChanged();
        }
    }
    
    public int getCount() {
        return this.c.size();
    }
    
    public long getItemId(final int n) {
        return this.a(n).D;
    }
    
    public int getItemViewType(final int n) {
        if (this.b.equals(this.a(n))) {
            return 0;
        }
        return 1;
    }
    
    public View getView(final int n, View a, final ViewGroup viewGroup) {
        final Tweet a2 = this.a(n);
        Tweet b;
        Object f;
        if (this.b.equals(a2)) {
            b = this.b;
            if (!this.e) {
                com.twitter.library.metrics.e.b("tweet:focal:complete", this.a.av(), ih.n).j();
                this.e = true;
            }
            f = this.a.f;
            int r = 0;
            switch (this.a.G) {
                default: {
                    r = this.a.G;
                    break;
                }
                case 18: {
                    r = 30;
                    break;
                }
                case 19: {
                    r = 31;
                    break;
                }
                case 20: {
                    r = 32;
                    break;
                }
            }
            ((TweetDetailView)f).a(this.a.a.f(), this.a.a.j());
            ((TweetDetailView)f).a(b, this.a, this.a.n, this.a.o, r, this.a.I, this.a.ao, this.a.ap, this.a.as);
            if (a == null) {
                this.a.d(b);
                if (b.s != 0L) {
                    this.a.U();
                    final Session x = this.a.aF();
                    if (x.d()) {
                        final pl pl = new pl((Context)this.a.getActivity(), x);
                        pl.a = this.a.b.C;
                        this.a.a(pl);
                    }
                }
                else {
                    this.a.a(new qd((Context)this.a.getActivity(), this.a.aF(), this.a.b.C, this.a.b.F), 6, 0);
                }
                if (this.a.e != null) {
                    this.a.e.b("show", "platform_card");
                }
                else if (this.a.c != null) {
                    if (((TweetDetailView)f).e != null) {
                        ((TweetDetailView)f).e.setOnClickListener((View$OnClickListener)this.a);
                    }
                    this.a.a(this.a.c, b);
                }
            }
            else {
                f = a;
            }
            if ((this.a.aF().d() || kg.a((Context)this.a.getActivity())) && this.a.C != null) {
                this.a.C.setTweet(b);
                this.a.C.setOnClickListener((View$OnClickListener)this.a);
            }
        }
        else {
            if (a == null) {
                a = this.a(viewGroup);
                this.a.a(a2, a);
            }
            final TweetView tweetView = (TweetView)a.getTag();
            final r a3 = this.a.a(tweetView);
            final g g = new g(false, this.a.getActivity(), a2, DisplayMode.a, this.a.Z, this.a.l);
            g.a(3, a3);
            boolean b2;
            if (a2.A < this.b.A) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b2 || a2.f == this.a.aF().g() || z.b(a2.r)) {
                tweetView.setAlwaysExpandMedia(true);
                tweetView.setStripMediaUrls(true);
            }
            else {
                if (a2.d()) {
                    this.a.a("skip", a2);
                }
                tweetView.setAlwaysExpandMedia(false);
                tweetView.setStripMediaUrls(false);
            }
            tweetView.a(a2, false, g);
            b = a2;
            f = a;
        }
        if (this.d != null) {
            final Bundle bundle = new Bundle(1);
            bundle.putInt("position", n);
            this.d.a((View)f, b, bundle);
        }
        return (View)f;
    }
    
    public int getViewTypeCount() {
        return 2;
    }
}
