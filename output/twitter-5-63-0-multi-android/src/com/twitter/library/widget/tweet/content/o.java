// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget.tweet.content;

import android.os.Bundle;
import com.twitter.android.av.t;
import android.view.View;
import com.twitter.util.c;
import android.view.View$MeasureSpec;
import com.twitter.library.experiments.b;
import android.graphics.Rect;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import com.twitter.library.media.widget.r;

public class o extends a
{
    protected final int a;
    protected final int b;
    protected final k c;
    protected final com.twitter.library.media.widget.r d;
    
    public o(final Activity activity, final Tweet tweet, final int a, final int b, final k c, final com.twitter.library.media.widget.r d, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        super(activity, tweet, twitterScribeAssociation, twitterScribeAssociation2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public Rect a(final Context context, final int n, final int n2, final int n3, final int n4) {
        final View z = this.z();
        if (z == null) {
            return new Rect();
        }
        if (com.twitter.library.experiments.b.a()) {
            z.measure(View$MeasureSpec.makeMeasureSpec(n3, Integer.MIN_VALUE), 0);
            if (com.twitter.util.c.g(context)) {
                final int measuredHeight = z.getMeasuredHeight();
                final int c = com.twitter.library.experiments.b.c(context);
                if (measuredHeight > c) {
                    z.measure(View$MeasureSpec.makeMeasureSpec((int)Math.rint(c / measuredHeight * n3), 1073741824), 0);
                }
            }
        }
        else {
            float e;
            if (this.f.Z() || this.f.Y()) {
                e = this.f.S().imageSize.e();
            }
            else {
                e = 1.7777778f;
            }
            z.measure(View$MeasureSpec.makeMeasureSpec(n3, 1073741824), View$MeasureSpec.makeMeasureSpec((int)Math.rint(n3 / e), 1073741824));
        }
        return new Rect(n, n2, z.getMeasuredWidth() + n, z.getMeasuredHeight() + n2);
    }
    
    protected l a(final Activity activity) {
        if (t.a() && this.f.I()) {
            return new i(activity, this.c, this.d);
        }
        return new l(activity, this.c, this.d);
    }
    
    @Override
    protected Object b() {
        return new n(this.f, this.g, this.a, this.b);
    }
    
    @Override
    protected void b(final Bundle bundle) {
    }
    
    @Override
    protected Bundle c() {
        return null;
    }
}
