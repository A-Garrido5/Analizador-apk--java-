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
import java.util.ArrayList;
import com.twitter.library.widget.PageableListView;
import android.widget.BaseAdapter;
import com.twitter.library.api.ActivitySummary;
import com.twitter.android.widget.TweetDetailView;
import com.twitter.android.card.t;
import com.twitter.library.widget.tweet.content.f;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.provider.Tweet;
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
import com.twitter.library.api.UserSettings;
import com.twitter.library.api.account.ab;
import com.twitter.library.service.y;
import android.content.Context;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;

class wf implements View$OnClickListener
{
    final /* synthetic */ TweetFragment a;
    
    wf(final TweetFragment a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886929) {
            final String string = ((TextView)view).getText().toString();
            if (this.a.getResources().getString(2131297452).equals(string)) {
                this.a.aw().a(this.a.aF().g(), "tweet:sensitive_media_interstitial::dispute_media:click");
                Toast.makeText((Context)this.a.getActivity(), 2131297453, 0).show();
                this.a.f.h();
                this.a.a(new oh(this.a.an, this.a.aF(), this.a.b.Q, "dispute_media"));
                return;
            }
            if (this.a.getResources().getString(2131297451).equals(string)) {
                final UserSettings j = this.a.a.j();
                if (j != null && !j.k) {
                    j.k = true;
                    this.a.a(ab.a(this.a.an, this.a.a, j, false, null));
                }
            }
        }
        this.a.f.g();
        this.a.p = true;
        view.setClickable(false);
        this.a.I();
    }
}
