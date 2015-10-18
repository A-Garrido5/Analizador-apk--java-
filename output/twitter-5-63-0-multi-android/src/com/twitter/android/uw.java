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
import com.twitter.library.api.timeline.f;
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
import com.twitter.library.api.PromotedEvent;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.support.v4.app.FragmentActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;
import android.view.View;
import android.support.v4.app.Fragment;
import com.twitter.library.client.as;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import java.lang.ref.WeakReference;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.provider.Tweet;
import com.twitter.library.service.z;

class uw extends z
{
    final /* synthetic */ Tweet a;
    final /* synthetic */ FriendshipCache b;
    final /* synthetic */ ul c;
    
    uw(final ul c, final Tweet a, final FriendshipCache b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final y y) {
        this.c.d(this.a.C, (aa)y.l().b(), this.b);
    }
}
