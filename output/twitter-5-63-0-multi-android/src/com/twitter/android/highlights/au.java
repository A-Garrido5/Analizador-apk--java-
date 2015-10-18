// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.content.res.Resources;
import com.twitter.library.provider.i;
import com.twitter.library.view.l;
import com.twitter.library.provider.j;
import com.twitter.library.view.k;
import android.view.View;
import android.os.Parcelable;
import com.twitter.android.TweetActivity;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.provider.Tweet;

public class au extends af
{
    public final Tweet a;
    public final Tweet b;
    private CharSequence c;
    private CharSequence d;
    
    public au(final String s, final long n, final mx mx, final boolean b, final String s2, final String s3, final Tweet a, final Tweet b2) {
        super(s, n, 8, mx, b, s2, s3);
        this.a = a;
        this.b = b2;
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public Intent a(final Context context) {
        return new Intent(context, (Class)TweetActivity.class).putExtra("tw", (Parcelable)this.a).putExtra("extra_up_as_back", true);
    }
    
    @Override
    public ag a(final View view) {
        return new av(this.a(), view);
    }
    
    public CharSequence a(final Context context, final k k) {
        if (this.c == null) {
            final i a = new j(this.a).b(true).a();
            final Resources resources = context.getResources();
            this.c = com.twitter.library.view.l.a(a.a, a.b, k, resources.getColor(2131689621), resources.getColor(2131689600), resources.getColor(2131689601), false, false);
        }
        return this.c;
    }
    
    public CharSequence b(final Context context, final k k) {
        if (this.d == null) {
            final i a = new j(this.b).b(true).a();
            final Resources resources = context.getResources();
            this.d = com.twitter.library.view.l.a(a.a, a.b, k, resources.getColor(2131689621), resources.getColor(2131689600), resources.getColor(2131689601), false, false);
        }
        return this.d;
    }
    
    @Override
    public String b() {
        return "TYPE_TWEET_IN_REPLY_TO";
    }
}
