// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import com.twitter.android.composer.au;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.widget.SocialBylineView;
import com.twitter.errorreporter.ErrorReporter;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.provider.ActivityDataList;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.widget.UserView;
import com.twitter.library.widget.BaseUserView;
import com.twitter.util.i;
import com.twitter.library.util.bj;
import java.util.ArrayList;
import com.twitter.library.widget.TweetView;
import com.twitter.library.scribe.TwitterScribeItem;
import android.content.Intent;
import android.database.Cursor;
import com.twitter.library.view.z;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.util.ah;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.util.SparseIntArray;
import android.util.SparseArray;
import com.twitter.library.widget.c;
import com.twitter.library.client.Session;
import android.content.res.Resources;
import com.twitter.android.widget.ActivityUserView;
import com.twitter.library.client.az;
import com.twitter.library.util.bq;
import com.twitter.internal.android.widget.TypefacesSpan;
import com.twitter.library.experiments.b;
import com.twitter.library.util.FriendshipCache;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.twitter.internal.android.widget.HighlightedLinearLayout;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.content.Context;
import android.view.LayoutInflater;
import com.twitter.util.a;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.ActionButton;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.UserImageView;

class lt
{
    public final UserImageView a;
    public final TextView b;
    public final View c;
    public final ActionButton d;
    public int e;
    public String f;
    public Tweet g;
    public TwitterUser h;
    
    public lt(final View view, final View c) {
        this.a = (UserImageView)view.findViewById(2131886159);
        this.b = (TextView)view.findViewById(2131886237);
        this.d = (ActionButton)view.findViewById(2131886080);
        this.c = c;
        if (this.a != null) {
            com.twitter.util.a.a((View)this.a, 2);
        }
    }
    
    public static View a(final LayoutInflater layoutInflater, final Context context, final View$OnClickListener onClickListener, final int n) {
        final View inflate = layoutInflater.inflate(n, (ViewGroup)null);
        final View inflate2 = layoutInflater.inflate(2130968841, (ViewGroup)null);
        inflate2.setTag((Object)new ls(inflate2));
        inflate2.setOnClickListener(onClickListener);
        final lt lt = new lt(inflate, inflate2);
        inflate.setTag((Object)lt);
        inflate.setOnClickListener(onClickListener);
        final ActionButton d = lt.d;
        if (d != null) {
            d.setTag((Object)new p());
            d.a(2130837600);
            d.setOnClickListener(onClickListener);
        }
        final HighlightedLinearLayout highlightedLinearLayout = new HighlightedLinearLayout(context);
        final LinearLayout$LayoutParams b = l.b();
        highlightedLinearLayout.setTag((Object)lt);
        highlightedLinearLayout.setLayoutParams((ViewGroup$LayoutParams)l.a());
        highlightedLinearLayout.setOrientation(1);
        highlightedLinearLayout.addView(inflate, (ViewGroup$LayoutParams)b);
        highlightedLinearLayout.addView(inflate2, (ViewGroup$LayoutParams)b);
        return (View)highlightedLinearLayout;
    }
    
    public static void a(final Context context, final View view, final TwitterUser h, final Tweet g, final int e, final FriendshipCache friendshipCache) {
        final lt lt = (lt)view.getTag();
        lt.a.a(h);
        lt.a.setSize(b.c());
        lt.e = e;
        lt.h = h;
        lt.g = g;
        lt.f = "";
        lt.a(context, friendshipCache);
    }
    
    public void a(final Context context, final FriendshipCache friendshipCache) {
        final String c = this.h.c();
        final String username = this.h.username;
        final TypefacesSpan[] array = { new TypefacesSpan(context, 1) };
        final Resources resources = context.getResources();
        this.b.setText((CharSequence)bq.a(array, resources.getString(lr.t[1], new Object[] { c, username }), '\"'));
        final Session b = az.a(context).b();
        final ls ls = (ls)this.c.getTag();
        ls.c = this.e;
        ls.d = this.g;
        ls.e = this.h;
        ls.a.setText((CharSequence)resources.getString(2131297987, new Object[] { c }));
        ((LinearLayout$LayoutParams)ls.b.getLayoutParams()).leftMargin = com.twitter.library.experiments.b.d() + resources.getDimensionPixelSize(2131558737);
        ls.b.requestLayout();
        ActivityUserView.a(this.d, this.h, friendshipCache, true, b.g());
        ((p)this.d.getTag()).a = this.h;
        this.d.setUsername(this.h.c());
    }
}
