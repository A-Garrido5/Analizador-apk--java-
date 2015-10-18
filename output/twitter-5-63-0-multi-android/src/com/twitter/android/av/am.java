// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.a;
import android.app.Activity;
import com.twitter.library.provider.Tweet;
import com.twitter.library.av.ae;

public class am implements ae
{
    private static final am a;
    
    static {
        a = new am();
    }
    
    public boolean a(final String s, final Tweet tweet, final Activity activity, final boolean b) {
        return this.a(s, tweet, activity, b, new a());
    }
    
    boolean a(final String s, final Tweet tweet, final Activity activity, final boolean b, final a a) {
        final TwitterScribeAssociation twitterScribeAssociation = (TwitterScribeAssociation)activity.getIntent().getParcelableExtra("association");
        if (twitterScribeAssociation != null) {
            a.a(twitterScribeAssociation).a(s).a(tweet).c(b).a(5).b(true).d(false).a((Context)activity);
            return true;
        }
        return false;
    }
}
