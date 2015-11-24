// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.view.View;
import android.os.Parcelable;
import com.twitter.android.TweetActivity;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.provider.Tweet;

public class aj extends aw
{
    public final String a;
    
    public aj(final String s, final long n, final mx mx, final boolean b, final String s2, final String s3, final Tweet tweet, final String a) {
        super(s, n, mx, b, s2, s3, tweet, false);
        this.a = a;
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public Intent a(final Context context) {
        return new Intent(context, (Class)TweetActivity.class).putExtra("tw", (Parcelable)this.b).putExtra("extra_up_as_back", true);
    }
    
    @Override
    public ag a(final View view) {
        return new ak(this.a(), view);
    }
    
    @Override
    public String b() {
        return "TYPE_TWEET_WITH_FALLBACK_IMAGE";
    }
}
