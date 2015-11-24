// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$OnLongClickListener;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import com.twitter.library.util.bj;
import com.twitter.util.i;
import java.util.Locale;
import com.twitter.library.util.aj;
import com.twitter.library.util.t;
import com.twitter.library.view.e;
import com.twitter.library.provider.j;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.widget.TweetMediaView;
import com.twitter.library.api.UserSettings;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import com.twitter.android.client.bh;
import android.os.Parcelable;
import android.os.Bundle;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView$BufferType;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.library.util.bl;
import com.twitter.library.api.geo.TwitterPlace$PlaceInfo;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.view.u;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.annotation.SuppressLint;
import com.twitter.library.media.util.l;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.api.PromotedContent;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.twitter.library.util.bi;
import android.text.TextUtils;
import com.twitter.library.util.bq;
import com.twitter.internal.android.widget.TypefacesSpan;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.LayoutInflater;
import com.twitter.library.api.CardUser;
import com.twitter.library.experiments.b;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import com.twitter.library.widget.SocialBylineView;
import com.twitter.android.client.c;
import com.twitter.ui.widget.ag;
import com.twitter.android.ta;
import com.twitter.library.view.k;
import com.twitter.library.api.ActivitySummary;
import com.twitter.library.view.BadgeView;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.library.api.TwitterUser;
import android.widget.TextView;
import android.widget.RelativeLayout;
import com.twitter.library.widget.ActionButton;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.view.QuoteView;
import com.twitter.library.api.Translation;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.view.ViewGroup;
import java.text.SimpleDateFormat;
import com.twitter.library.media.widget.s;
import com.twitter.library.media.util.r;
import android.widget.LinearLayout;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import android.view.View;
import com.twitter.library.view.d;

class fp implements d
{
    final /* synthetic */ TweetDetailView a;
    
    fp(final TweetDetailView a) {
        this.a = a;
    }
    
    @Override
    public void a(final View view) {
    }
    
    @Override
    public void a(final boolean b) {
    }
    
    @Override
    public boolean a() {
        return false;
    }
    
    @Override
    public void onClick(final View view) {
        long userId;
        if (this.a.R != null) {
            userId = this.a.R.userId;
        }
        else {
            userId = 0L;
        }
        am.a(this.a.getContext(), null, "http://aka.ms/Twitter2BingTranslator", userId, null, null, null);
    }
}
