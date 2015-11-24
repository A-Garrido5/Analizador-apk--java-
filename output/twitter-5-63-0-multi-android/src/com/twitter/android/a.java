// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.bh;
import android.os.Parcelable;
import android.app.Activity;
import android.content.Intent;
import com.twitter.android.widget.bg;
import android.content.Context;
import android.os.Handler;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;

public class a
{
    int a;
    private Tweet b;
    private String c;
    private TwitterScribeAssociation d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private Handler k;
    
    public a() {
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = true;
        this.j = 0;
    }
    
    private Runnable c(final Context context, final bg bg) {
        return new b(this, context, bg);
    }
    
    protected Intent a(final Context context, final bg bg) {
        final boolean b = context instanceof Activity;
        if (!b && this.h) {
            throw new IllegalArgumentException("Starting " + AVMediaPlayerActivity.class.getSimpleName() + " for result requires an " + "Activity Context");
        }
        if (bg != null && this.b != null) {
            com.twitter.android.widget.a.a(bg, this.b);
            bg.a(com.twitter.android.widget.a.a(this.b), 1);
            bg.a(2);
        }
        final Intent putExtra = new Intent(context, (Class)AVMediaPlayerActivity.class).putExtra("tw", (Parcelable)this.b).putExtra("stream_url", this.c).putExtra("association", (Parcelable)this.d).putExtra("is_from_dock", this.e).putExtra("is_from_inline", this.f).putExtra("finish_when_portrait", this.g);
        if (!b) {
            putExtra.addFlags(268435456);
        }
        return putExtra;
    }
    
    public a a(final int a) {
        this.h = true;
        this.a = a;
        return this;
    }
    
    public a a(final int j, final Handler k) {
        this.k = k;
        this.j = j;
        return this;
    }
    
    public a a(final Tweet b) {
        this.b = b;
        return this;
    }
    
    public a a(final TwitterScribeAssociation d) {
        this.d = d;
        return this;
    }
    
    public a a(final String c) {
        this.c = c;
        return this;
    }
    
    public a a(final boolean e) {
        this.e = e;
        return this;
    }
    
    bg a() {
        if (bg.b()) {
            return bg.a();
        }
        return null;
    }
    
    public void a(final Context context) {
        this.b(context, this.a());
    }
    
    public a b(final boolean f) {
        this.f = f;
        return this;
    }
    
    void b(final Context context, final bg bg) {
        final Runnable c = this.c(context, bg);
        if (context instanceof Activity && this.i) {
            bh.a(context).a((Activity)context, c);
            return;
        }
        c.run();
    }
    
    public a c(final boolean g) {
        this.g = g;
        return this;
    }
    
    public a d(final boolean i) {
        this.i = i;
        return this;
    }
}
