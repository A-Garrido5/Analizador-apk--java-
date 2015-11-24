// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.x;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import com.twitter.library.client.ay;
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
import com.twitter.library.client.Session;
import com.twitter.library.api.conversations.s;
import android.text.TextUtils;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.Set;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.dm.a;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import android.content.Context;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class cq implements DialogInterface$OnClickListener
{
    final /* synthetic */ DMActivity a;
    
    cq(final DMActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        int n2;
        if (this.a.e == 3 && this.a.f.t()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.a.U().g()).b(new String[] { "app:twitter_service:direct_messages::discard_dm" });
        String s;
        if (TelephonyUtil.c((Context)this.a)) {
            s = "connected";
        }
        else {
            s = "disconnected";
        }
        twitterScribeLog.d(s);
        String s2;
        if (n2 != 0) {
            s2 = "has_media";
        }
        else {
            s2 = "no_media";
        }
        twitterScribeLog.g(s2);
        ScribeService.a((Context)this.a, twitterScribeLog);
        this.a.l();
        this.a.h();
    }
}
