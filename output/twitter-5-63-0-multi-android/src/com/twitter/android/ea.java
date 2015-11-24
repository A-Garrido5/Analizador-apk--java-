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
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import com.twitter.internal.android.widget.TypefacesTextView;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.ScribeLog;
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
import android.text.TextUtils;
import android.database.Cursor;
import com.twitter.library.client.Session;
import java.util.HashSet;
import java.util.HashMap;
import android.content.res.Resources;
import android.app.Activity;
import com.twitter.library.api.UserSettings;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.network.t;
import com.twitter.library.client.az;
import android.content.Context;
import java.util.Set;
import java.util.Map;
import java.text.SimpleDateFormat;
import com.twitter.library.view.k;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.View;
import com.twitter.library.api.conversations.x;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;

class ea implements View$OnClickListener
{
    final /* synthetic */ c a;
    final /* synthetic */ long b;
    final /* synthetic */ x c;
    final /* synthetic */ dz d;
    
    ea(final dz d, final c a, final long b, final x c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onClick(final View view) {
        this.a.a(new TwitterScribeLog(this.b).b(new String[] { "messages:thread:rtf_message::open" }));
        this.d.o.add(this.c.c);
        this.d.notifyDataSetChanged();
    }
}
