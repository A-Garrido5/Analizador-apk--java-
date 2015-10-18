// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import java.io.Serializable;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bn;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;
import java.util.List;
import com.twitter.library.api.conversations.ParticipantsNotAddedEntry;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.api.conversations.JoinConversationEntry;
import java.util.Collections;
import com.twitter.library.api.conversations.UpdateConversationNameEntry;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.api.conversations.ParticipantsJoinEntry;
import android.content.Intent;
import java.util.Iterator;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.widget.UserView;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import com.twitter.internal.android.widget.TypefacesTextView;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.conversations.DMTweet;
import android.view.View$OnLongClickListener;
import com.twitter.library.network.a;
import com.twitter.util.g;
import com.twitter.library.api.conversations.DMPhoto;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.util.bk;
import android.text.format.DateUtils;
import android.text.util.Linkify;
import com.twitter.library.view.l;
import com.twitter.library.util.bo;
import com.twitter.library.api.conversations.DMMessageEntry;
import android.database.Cursor;
import com.twitter.library.client.Session;
import java.util.HashSet;
import java.util.HashMap;
import android.content.res.Resources;
import android.app.Activity;
import com.twitter.library.api.UserSettings;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import com.twitter.library.network.t;
import com.twitter.library.client.az;
import android.content.Context;
import java.util.Set;
import java.util.Map;
import java.text.SimpleDateFormat;
import com.twitter.library.view.k;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import com.twitter.library.api.conversations.x;
import com.twitter.library.view.u;
import android.view.View;
import android.widget.Button;
import com.twitter.android.widget.Divot;
import android.widget.LinearLayout;
import com.twitter.library.view.QuoteView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.TextView;
import com.twitter.library.media.widget.UserImageView;

class di
{
    public final UserImageView a;
    public final TextView b;
    public final TextView c;
    public final MediaImageView d;
    public final QuoteView e;
    public final LinearLayout f;
    public final Divot g;
    public final Divot h;
    public final LinearLayout i;
    public final Button j;
    public final Button k;
    public final TextView l;
    public final LinearLayout m;
    final /* synthetic */ cx n;
    private final boolean o;
    
    public di(final cx n, final View view, final boolean o) {
        this.n = n;
        this.a = (UserImageView)view.findViewById(2131886644);
        this.b = (TextView)view.findViewById(2131886102);
        if (o) {
            u.a(this.b);
        }
        this.c = (TextView)view.findViewById(2131886361);
        this.i = (LinearLayout)view.findViewById(2131886648);
        this.j = (Button)view.findViewById(2131886649);
        this.k = (Button)view.findViewById(2131886650);
        this.d = (MediaImageView)view.findViewById(2131886643);
        this.e = (QuoteView)view.findViewById(2131886562);
        this.f = (LinearLayout)view.findViewById(2131886646);
        this.g = (Divot)view.findViewById(2131886652);
        this.h = (Divot)view.findViewById(2131886653);
        this.l = (TextView)view.findViewById(2131886645);
        this.o = o;
        this.m = (LinearLayout)view.findViewById(2131886651);
    }
    
    public void a(final x x) {
        if (x.c()) {
            this.a.setVisibility(8);
        }
        else {
            if (this.o) {
                this.a.setOnClickListener((View$OnClickListener)new dj(this, x));
            }
            this.a.setVisibility(0);
        }
        this.a.a(x.g);
        final String f = x.f;
        if (!TextUtils.isEmpty((CharSequence)f)) {
            this.a.setContentDescription((CharSequence)this.n.i.getString(2131297097, new Object[] { f }));
        }
    }
}
