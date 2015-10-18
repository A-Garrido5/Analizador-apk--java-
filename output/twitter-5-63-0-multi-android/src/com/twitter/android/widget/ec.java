// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.content.Intent;
import com.twitter.android.ProfileActivity;
import com.twitter.android.geo.places.d;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.UrlEntity;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import java.lang.ref.WeakReference;
import com.twitter.library.view.a;

public class ec extends a
{
    private final WeakReference a;
    private final c b;
    private final TwitterScribeAssociation c;
    private final az d;
    
    public ec(final Context context, final TwitterScribeAssociation c) {
        this.a = new WeakReference((T)context);
        this.b = com.twitter.android.client.c.a(context);
        this.d = az.a(context);
        this.c = c;
    }
    
    @Override
    public void a(final UrlEntity urlEntity) {
        final Context context = (Context)this.a.get();
        final long g = this.d.b().g();
        this.b.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { "profile:::bio:open_link" })).a(this.c)).b(urlEntity.expandedUrl, urlEntity.url));
        if (context != null) {
            am.a(context, null, urlEntity, g, null, null, this.c, null);
        }
    }
    
    @Override
    public void a(final TwitterPlace twitterPlace) {
        final Context context = (Context)this.a.get();
        if (context != null) {
            context.startActivity(com.twitter.android.geo.places.d.a(context, twitterPlace));
        }
    }
    
    @Override
    public void a(final String s) {
        final Context context = (Context)this.a.get();
        if (context != null && s.length() > 2 && s.charAt(0) == '@') {
            context.startActivity(new Intent(context, (Class)ProfileActivity.class).putExtra("screen_name", s.substring(1)));
        }
    }
}
