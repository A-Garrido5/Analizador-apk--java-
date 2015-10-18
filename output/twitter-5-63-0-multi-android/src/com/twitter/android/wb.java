// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.Rect;
import android.support.v4.widget.ExploreByTouchHelper;
import com.twitter.android.widget.fu;
import android.view.ViewGroup;
import android.view.LayoutInflater;
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
import java.util.List;
import java.util.Collection;
import com.twitter.library.util.bo;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.ViewGroup$LayoutParams;
import com.twitter.library.widget.TweetView;
import android.content.res.Resources;
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
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.media.util.q;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import android.widget.BaseAdapter;
import com.twitter.library.api.ActivitySummary;
import com.twitter.android.widget.TweetDetailView;
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
import com.twitter.android.widget.r;
import com.twitter.android.widget.ft;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import com.twitter.library.provider.Tweet;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.api.timeline.t;
import android.widget.AbsListView;
import com.twitter.library.widget.PageableListView;
import com.twitter.library.widget.ae;

class wb implements ae
{
    final /* synthetic */ PageableListView a;
    final /* synthetic */ TweetFragment b;
    private int c;
    
    wb(final TweetFragment b, final PageableListView a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final AbsListView absListView) {
        if (this.b.b != null) {
            final Tweet a = this.b.i.a(0);
            final long d = a.D;
            final cn c = this.b.L();
            final long currentTimeMillis = System.currentTimeMillis();
            if (!a.equals(this.b.b) && a.l() && currentTimeMillis >= 300000L + c.c && this.b.f(1)) {
                c.c = currentTimeMillis;
                this.b.a(new t((Context)this.b.getActivity(), this.b.a, this.b.b.D).b(d), 1, 1);
                this.a.a(true);
            }
        }
    }
    
    @Override
    public void b(final AbsListView absListView) {
        if (this.b.b != null) {
            final Tweet b = this.b.i.b();
            if (!b.equals(this.b.b)) {
                final cn c = this.b.L();
                final long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis >= 300000L + c.b && this.b.f(2)) {
                    c.b = currentTimeMillis;
                    final t t = new t((Context)this.b.getActivity(), this.b.a, this.b.b.D);
                    t.c(b.D);
                    this.b.a(t);
                    this.b.a(t, 1, 2);
                    this.a.b(true);
                }
            }
            else if (!this.b.D) {
                this.a.b(false);
            }
        }
    }
    
    public void onScroll(final AbsListView absListView, final int c, final int n, final int n2) {
        if (Math.abs(this.c - c) > 2) {
            this.c = c;
            this.b.aB.a(false);
        }
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
}
