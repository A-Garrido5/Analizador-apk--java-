// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.util.bd;
import com.twitter.library.util.bq;
import com.twitter.android.widget.EngagementActionBar;
import java.util.ArrayList;
import android.util.SparseArray;
import com.twitter.ui.dialog.e;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.api.timeline.l;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.f;
import java.io.Serializable;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.dm.ShareViaDMActivity;
import com.twitter.library.api.conversations.ak;
import com.twitter.android.composer.au;
import android.annotation.TargetApi;
import android.view.animation.Animation$AnimationListener;
import com.twitter.library.featureswitch.d;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.net.Uri$Builder;
import android.content.Intent;
import com.twitter.library.util.bo;
import android.widget.Toast;
import com.twitter.android.util.bb;
import com.twitter.library.view.TweetActionType;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.client.Session;
import com.twitter.library.api.PromotedEvent;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.service.aa;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;
import android.view.View;
import android.support.v4.app.Fragment;
import com.twitter.library.client.as;
import android.content.Context;
import com.twitter.library.client.az;
import android.app.Activity;
import com.twitter.library.widget.ag;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.Tweet;
import android.support.v4.app.FragmentActivity;
import java.lang.ref.WeakReference;

class uu implements qg
{
    final /* synthetic */ WeakReference a;
    final /* synthetic */ FragmentActivity b;
    final /* synthetic */ Tweet c;
    final /* synthetic */ TwitterScribeItem d;
    final /* synthetic */ c e;
    final /* synthetic */ long f;
    final /* synthetic */ TwitterScribeAssociation g;
    final /* synthetic */ ul h;
    
    uu(final ul h, final WeakReference a, final FragmentActivity b, final Tweet c, final TwitterScribeItem d, final c e, final long f, final TwitterScribeAssociation g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public void a() {
        this.e.a(this.f, TwitterScribeLog.a(this.g, "retweet_dialog", "tweet", "share_via_dm"));
    }
    
    @Override
    public void a(final long n, final Tweet tweet, final boolean b) {
        final ag ag = (ag)this.a.get();
        if (ag != null) {
            ag.c(b);
        }
        if (b) {
            this.h.a(this.h.a(this.b), "unretweet", this.c, this.d);
            return;
        }
        this.h.a(this.h.a(this.b), "retweet", this.c, this.d);
    }
    
    @Override
    public void a(final long n, final boolean b, final boolean b2, final boolean b3) {
        b(b, b2, this.h.g, b3);
    }
    
    @Override
    public void b(final long n, final Tweet tweet, final boolean b) {
        this.h.a(this.h.a(this.b), "quote", this.c, this.d);
    }
    
    @Override
    public void c(final long n, final Tweet tweet, final boolean b) {
        this.e.a(this.f, TwitterScribeLog.a(this.g, "retweet_dialog", "", "dismiss"));
    }
    
    @Override
    public void d(final long n, final Tweet tweet, final boolean b) {
        this.e.a(this.f, TwitterScribeLog.a(this.g, "retweet_dialog", "", "impression"));
    }
}
