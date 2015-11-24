// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
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
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.conversations.DMTweet;
import android.view.View$OnLongClickListener;
import com.twitter.library.network.a;
import com.twitter.util.g;
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
import com.twitter.android.client.c;
import com.twitter.library.network.t;
import com.twitter.library.client.az;
import android.content.Context;
import java.util.Set;
import java.util.Map;
import java.text.SimpleDateFormat;
import com.twitter.library.view.k;
import android.os.Parcelable;
import java.io.Serializable;
import android.content.Intent;
import android.view.View;
import com.twitter.library.api.conversations.DMPhoto;
import com.twitter.library.api.conversations.x;
import android.view.View$OnClickListener;

class de implements View$OnClickListener
{
    final /* synthetic */ x a;
    final /* synthetic */ int b;
    final /* synthetic */ DMPhoto c;
    final /* synthetic */ cx d;
    
    de(final cx d, final x a, final int b, final DMPhoto c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onClick(final View view) {
        if (this.a.d()) {
            this.d.n.a(this.b);
            return;
        }
        this.d.i.startActivity(new Intent(this.d.i, (Class)GalleryActivity.class).putExtra("dm", true).putExtra("show_tw", false).putExtra("media", (Serializable)this.c.e()).putExtra("association", (Parcelable)this.d.m));
    }
}
