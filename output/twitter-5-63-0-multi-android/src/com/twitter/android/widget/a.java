// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.WindowManager;
import com.twitter.library.provider.Tweet;
import android.content.Context;
import com.twitter.library.av.playback.p;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.av.playback.au;

public abstract class a extends ap
{
    protected au a;
    protected TwitterScribeAssociation b;
    protected boolean c;
    protected AVPlayer d;
    protected p e;
    private Context h;
    
    a(final Context h, final bi bi, final ay ay) {
        super(h, bi, ay);
        this.c = true;
        this.h = h;
    }
    
    public static String a(final Tweet tweet) {
        return String.valueOf(tweet.D);
    }
    
    public static void a(final bg bg, final Tweet tweet) {
        final a a = bg.a(a(tweet));
        if (a != null) {
            a.c();
        }
    }
    
    Runnable a(final Runnable runnable) {
        return new b(this, runnable);
    }
    
    @Override
    public String a() {
        if (this.a == null || this.a.b() == null) {
            return null;
        }
        return a(this.a.b());
    }
    
    @Override
    public void a(final WindowManager windowManager, final int n, final Runnable runnable) {
        super.a(windowManager, n, this.a(runnable));
    }
    
    protected Context b() {
        return this.h;
    }
    
    public void c() {
        this.c = false;
    }
}
