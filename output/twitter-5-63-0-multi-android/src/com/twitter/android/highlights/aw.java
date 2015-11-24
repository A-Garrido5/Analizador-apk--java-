// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.content.res.Resources;
import com.twitter.library.view.l;
import com.twitter.library.provider.i;
import com.twitter.library.provider.j;
import com.twitter.library.view.k;
import android.view.View;
import android.os.Parcelable;
import com.twitter.android.TweetActivity;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.provider.Tweet;

public class aw extends af
{
    private final boolean a;
    public final Tweet b;
    private CharSequence c;
    
    public aw(final String s, final long n, final mx mx, final boolean b, final String s2, final String s3, final Tweet b2, final boolean a) {
        super(s, n, 14, mx, b, s2, s3);
        this.b = b2;
        this.a = a;
    }
    
    @Override
    public int a() {
        return 0;
    }
    
    @Override
    public Intent a(final Context context) {
        return new Intent(context, (Class)TweetActivity.class).putExtra("tw", (Parcelable)this.b).putExtra("extra_up_as_back", true);
    }
    
    @Override
    public ag a(final View view) {
        return new ax(this.a(), view);
    }
    
    public CharSequence a(final Context context, final k k) {
        if (this.c == null) {
            i a;
            if (this.a) {
                a = new j(this.b).b(true).a();
            }
            else {
                a = new i(this.b.y, this.b.G);
            }
            final Resources resources = context.getResources();
            this.c = com.twitter.library.view.l.a(a.a, a.b, k, resources.getColor(2131689621), resources.getColor(2131689600), resources.getColor(2131689601), false, false);
        }
        return this.c;
    }
    
    @Override
    public String b() {
        return "TYPE_TWEET_NO_MEDIA";
    }
}
