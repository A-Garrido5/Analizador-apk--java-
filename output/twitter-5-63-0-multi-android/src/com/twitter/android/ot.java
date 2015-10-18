// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewParent;
import android.widget.AdapterView;
import android.support.v4.content.CursorLoader;
import android.content.ContentUris;
import com.twitter.library.provider.be;
import com.twitter.util.collection.CollectionUtils;
import android.accounts.Account;
import java.util.ArrayList;
import com.twitter.android.client.SearchSuggestionController;
import com.twitter.android.profiles.s;
import android.os.Build$VERSION;
import android.accounts.AccountManager;
import android.widget.RelativeLayout;
import com.twitter.library.media.widget.BackgroundImageView;
import com.twitter.library.media.widget.MediaImageView;
import java.util.Set;
import java.util.HashSet;
import android.view.LayoutInflater;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.App;
import android.preference.PreferenceManager;
import com.twitter.android.widget.ProfileEmptyAvatarOverlay;
import com.twitter.library.client.AbsFragmentActivity;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import com.twitter.library.service.ab;
import com.twitter.internal.network.l;
import com.twitter.android.client.x;
import com.twitter.android.client.bn;
import android.widget.BaseAdapter;
import android.support.v4.view.PagerAdapter;
import android.os.Handler;
import android.os.Looper;
import com.twitter.android.widget.PromptDialogFragment;
import android.widget.Toast;
import android.graphics.drawable.TransitionDrawable;
import com.twitter.library.client.ap;
import com.twitter.library.api.bh;
import com.twitter.android.client.ca;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.twitter.android.profiles.ag;
import com.twitter.android.profiles.o;
import com.twitter.android.profiles.p;
import com.twitter.internal.android.widget.ToolBar;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.res.Resources;
import com.twitter.library.client.Session;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentManager;
import java.util.Date;
import com.twitter.library.view.k;
import com.twitter.android.widget.ec;
import com.twitter.android.avatars.b;
import android.widget.ListAdapter;
import com.twitter.library.util.bj;
import java.util.Collections;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.android.util.bd;
import com.twitter.ui.widget.TwitterButton;
import android.text.SpannableStringBuilder;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeItem;
import android.app.Activity;
import com.twitter.library.util.aj;
import com.twitter.internal.android.widget.f;
import com.twitter.android.widget.LoggedOutBar;
import com.twitter.library.service.y;
import android.os.Bundle;
import com.twitter.android.composer.ComposerDockLayout;
import java.io.Serializable;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.platform.PushService;
import com.twitter.android.profiles.ah;
import com.twitter.android.profiles.t;
import com.twitter.library.service.z;
import android.view.View;
import android.widget.ListView;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.api.TwitterUser;
import android.content.SharedPreferences;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.PromotedContent;
import com.twitter.android.profiles.animation.BalloonSetAnimationView;
import android.widget.TextView;
import com.twitter.android.profiles.q;
import com.twitter.android.profiles.ad;
import com.twitter.android.profiles.d;
import com.twitter.library.util.FriendshipCache;
import android.widget.LinearLayout;
import android.widget.ImageView;
import com.twitter.android.widget.TweetStatView;
import com.twitter.android.profiles.a;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.android.profiles.HeaderImageView;
import com.twitter.android.profiles.v;
import android.net.Uri;
import com.twitter.ui.dialog.e;
import com.twitter.android.profiles.u;
import com.twitter.android.profiles.r;
import com.twitter.android.profiles.i;
import com.twitter.android.profiles.c;
import com.twitter.android.profiles.af;
import com.twitter.android.profiles.ae;
import com.twitter.android.profiles.aa;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.accounts.OnAccountsUpdateListener;
import java.util.Iterator;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.app.FragmentActivity;

class ot extends AbsPagesAdapter
{
    final /* synthetic */ ProfileActivity g;
    
    public ot(final ProfileActivity g, final FragmentActivity fragmentActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn) {
        this.g = g;
        super(fragmentActivity, fragmentActivity.getSupportFragmentManager(), list, viewPager, horizontalListView, mn);
    }
    
    public void a(final List b) {
        this.b = b;
        this.d();
    }
    
    public void e() {
        final int b = this.e.b();
        if (b != -1 && b < this.b.size()) {
            final gm a = this.a(b);
            if (a != null) {
                final TwitterListFragment twitterListFragment = (TwitterListFragment)this.c(a);
                if (twitterListFragment != null) {
                    twitterListFragment.X();
                }
            }
        }
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final TwitterListFragment twitterListFragment = (TwitterListFragment)super.instantiateItem(viewGroup, n);
        this.g.a(twitterListFragment);
        twitterListFragment.i(!kg.a((Context)this.d));
        this.a(twitterListFragment, n);
        return twitterListFragment;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        super.onPageScrollStateChanged(n);
        if (n == 1) {
            final Iterator<gm> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                this.g.a(this.c(iterator.next()));
            }
        }
    }
    
    @Override
    public void onPageSelected(final int n) {
        final int b = this.e.b();
        if (n != 0) {
            this.g.ax.k();
        }
        super.onPageSelected(n);
        this.a(this.b(b));
        this.b(this.a(n));
        this.g.w.a();
    }
}
