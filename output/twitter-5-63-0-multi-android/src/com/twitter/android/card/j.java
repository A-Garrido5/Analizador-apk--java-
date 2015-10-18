// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.util.an;
import com.twitter.android.GalleryActivity;
import java.util.ArrayList;
import com.twitter.android.composer.au;
import com.twitter.library.api.cb;
import com.twitter.library.api.UrlEntity;
import com.twitter.android.client.c;
import com.twitter.android.TweetActivity;
import com.twitter.android.client.bh;
import com.twitter.android.ProfileActivity;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.am;
import android.text.TextUtils;
import com.twitter.library.client.az;
import android.content.Context;
import java.lang.ref.WeakReference;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.network.OAuthToken;
import java.io.Serializable;
import android.os.Parcelable;
import android.net.Uri;
import android.content.Intent;
import com.twitter.android.WebViewActivity;
import com.twitter.library.network.ae;
import java.util.HashMap;
import android.app.Activity;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;

class j implements Runnable
{
    final /* synthetic */ Session a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Tweet c;
    final /* synthetic */ String d;
    final /* synthetic */ Activity e;
    final /* synthetic */ h f;
    
    j(final h f, final Session a, final boolean b, final Tweet c, final String d, final Activity e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public void run() {
        final OAuthToken h = this.a.h();
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        if (this.b) {
            hashMap.put("X-Card-Click", "platform_key=" + ae.a(this.f.b).a() + "&url=" + this.c.W().url);
        }
        final PromotedContent j = this.c.j;
        final StringBuilder sb = new StringBuilder(this.d);
        if (j != null && j.impressionId != null) {
            ae.a(sb, "impression_id", j.impressionId);
        }
        this.e.startActivity(new Intent(this.f.b, (Class)WebViewActivity.class).setData(Uri.parse(sb.toString())).putExtra("token", (Parcelable)h).putExtra("headers", (Serializable)hashMap));
    }
}
