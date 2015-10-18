// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.text.SpannableString;
import com.twitter.library.util.text.a;
import java.util.Date;
import com.twitter.library.api.ExtendedProfile;
import com.twitter.library.api.TwitterUser;
import com.twitter.internal.util.Optional;
import android.content.res.Resources;
import com.twitter.library.api.z;
import com.twitter.library.view.u;
import com.twitter.library.view.l;
import com.twitter.library.api.TweetEntities;
import android.text.TextUtils;
import com.twitter.library.view.k;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import android.view.View;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.view.c;

class w extends c
{
    final /* synthetic */ TwitterPlace a;
    final /* synthetic */ v b;
    
    w(final v b, final int n, final TwitterPlace a) {
        this.b = b;
        this.a = a;
        super(n);
    }
    
    public void onClick(final View view) {
        if (this.b.n != null) {
            final long g = az.a(this.b.d.getContext()).b().g();
            com.twitter.android.client.c.a(this.b.d.getContext()).a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { ah.a(g == this.b.o.e()), "profile::place_tag:click" })).c(this.a.placeId));
            this.b.n.a(this.a);
        }
    }
}
