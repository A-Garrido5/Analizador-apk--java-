// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget.tweet.content;

import android.app.Activity;
import com.twitter.library.util.d;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import java.lang.ref.WeakReference;

public class g
{
    private static h g;
    protected final WeakReference a;
    protected final Tweet b;
    protected final DisplayMode c;
    protected final TwitterScribeAssociation d;
    protected final TwitterScribeAssociation e;
    protected final d f;
    private final boolean h;
    private final b i;
    private final p j;
    
    public g(final Activity activity, final Tweet tweet) {
        this(false, activity, tweet, DisplayMode.a, null, null);
    }
    
    public g(final boolean b, final Activity activity, final Tweet tweet, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(b, activity, tweet, displayMode, twitterScribeAssociation, twitterScribeAssociation2, com.twitter.library.widget.tweet.content.g.g.a(), com.twitter.library.widget.tweet.content.g.g.b());
    }
    
    protected g(final boolean h, final Activity activity, final Tweet b, final DisplayMode c, final TwitterScribeAssociation d, final TwitterScribeAssociation e, final b i, final p j) {
        this.f = new d();
        this.h = h;
        this.a = new WeakReference((T)activity);
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
        this.i = i;
        this.j = j;
    }
    
    public static void a(final h g) {
        g.g = g;
    }
    
    public f a() {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return null;
        }
        final boolean h = this.h;
        f f = null;
        if (h) {
            f = this.i.a(activity, this.b, this.c, this.d, this.e);
            if (f == null) {
                f = this.i.a(activity, this.b, this.c, this.d, this.f);
            }
        }
        final boolean b = this.c == DisplayMode.b || com.twitter.library.experiments.b.g();
        if (f == null && this.a(b)) {
            this.f.put(5, (Object)b);
            f = this.j.a(activity, this.c, this.b, this.d, this.e, this.f);
        }
        this.f.clear();
        return f;
    }
    
    public void a(final int n, final Object o) {
        this.f.put(n, o);
    }
    
    protected boolean a(final boolean b) {
        return this.b.H() || this.b.F() || this.b.L() || this.b.G() || this.b.f() || com.twitter.library.experiments.b.a(this.b, b);
    }
    
    public boolean b() {
        return this.h;
    }
}
