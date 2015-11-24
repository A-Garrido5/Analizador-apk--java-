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
import java.io.Serializable;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.dm.ShareViaDMActivity;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.scribe.TwitterScribeLog;
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
import com.twitter.library.widget.ag;
import com.twitter.library.view.TweetActionType;
import com.twitter.library.api.PromotedContent;
import android.app.Activity;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.client.Session;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.service.aa;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.support.v4.app.Fragment;
import com.twitter.library.client.as;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import java.lang.ref.WeakReference;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.view.animation.Animation;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.provider.Tweet;
import android.view.View;
import com.twitter.library.util.f;

class uq extends f
{
    final /* synthetic */ View a;
    final /* synthetic */ Tweet b;
    final /* synthetic */ PromotedEvent c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ long f;
    final /* synthetic */ int g;
    final /* synthetic */ ul h;
    
    uq(final ul h, final View a, final Tweet b, final PromotedEvent c, final String d, final String e, final long f, final int g) {
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
    public void onAnimationEnd(final Animation animation) {
        this.a.clearAnimation();
        this.h.a(this.b, this.c, this.d, this.e, this.f);
        this.a.postDelayed((Runnable)new ur(this), 100L);
    }
}
