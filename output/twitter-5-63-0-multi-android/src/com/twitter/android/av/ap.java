// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.util.concurrent.d;
import com.twitter.util.concurrent.h;
import com.twitter.util.concurrent.e;
import com.twitter.library.provider.ae;
import com.twitter.library.service.z;
import com.twitter.library.client.az;
import com.twitter.library.av.ab;
import java.lang.ref.WeakReference;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.client.as;
import android.net.Uri;

public class ap
{
    Uri a;
    private final as b;
    private final Context c;
    private final Session d;
    private Tweet e;
    private ar f;
    private final WeakReference g;
    private at h;
    private ab i;
    
    public ap(final Tweet tweet, final Context context, final com.twitter.android.av.as as) {
        this(tweet, context, as, as.a(context), az.a(context).b(), new at());
    }
    
    ap(final Tweet e, final Context c, final com.twitter.android.av.as as, final as b, final Session d, final at h) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.g = new WeakReference((T)as);
        this.h = h;
        this.a(new ar(this));
    }
    
    public void a() {
        this.b.b(this.f);
    }
    
    protected void a(final long n) {
        this.a(ae.a(n, this.b()));
    }
    
    protected void a(final Uri a) {
        this.a = a;
        if (this.i == null) {
            this.i = this.h.a(this.c);
        }
        this.i.a(a).a(new e().a(com.twitter.util.concurrent.h.a).a(new aq(this)));
    }
    
    protected void a(final ar f) {
        this.f = f;
        this.b.a(this.f);
    }
    
    public void a(final Tweet tweet) {
        this.a(ae.a(tweet.E, this.b()));
    }
    
    protected long b() {
        return this.d.g();
    }
    
    protected long c() {
        return this.e.D;
    }
}
