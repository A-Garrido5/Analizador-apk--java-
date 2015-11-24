// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.x;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.widget.Toast;
import com.twitter.library.widget.aj;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.app.Activity;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.android.client.c;
import com.twitter.library.api.PromotedContent;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.service.y;
import com.twitter.library.api.conversations.an;
import android.view.View;
import com.twitter.util.t;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import com.twitter.library.api.conversations.s;
import android.text.TextUtils;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import android.content.Context;
import java.util.Set;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.dm.a;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.client.Session;
import com.twitter.library.client.ay;

class cr extends ay
{
    final /* synthetic */ DMActivity a;
    
    public cr(final DMActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session) {
        if (this.a.e == 1 || this.a.e == 3) {
            final TwitterListFragment twitterListFragment = (TwitterListFragment)this.a.getSupportFragmentManager().findFragmentById(2131886241);
            if (twitterListFragment != null) {
                twitterListFragment.g(session.g());
            }
        }
    }
}
