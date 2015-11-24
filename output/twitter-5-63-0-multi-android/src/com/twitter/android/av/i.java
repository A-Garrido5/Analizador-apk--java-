// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.android.client.bh;
import android.app.Activity;
import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;
import android.graphics.PointF;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;

public abstract class i
{
    protected Tweet a;
    private String b;
    private TwitterScribeAssociation c;
    private PointF d;
    private PointF e;
    private PointF f;
    private PointF g;
    private boolean h;
    
    public i() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = true;
    }
    
    private Runnable c(final Context context) {
        return new j(this, context);
    }
    
    public Intent a(final Context context) {
        final Intent intent = new Intent(context, this.a());
        intent.putExtra("tweet", (Parcelable)this.a);
        intent.putExtra("media_source_url", this.b);
        if (this.c != null) {
            intent.putExtra("association", (Parcelable)this.c);
        }
        if (this.d != null && this.e != null) {
            intent.putExtra("initial_top_left_coords", (Parcelable)this.d);
            intent.putExtra("initial_size", (Parcelable)this.e);
        }
        if (this.g != null && this.f != null) {
            intent.putExtra("return_top_left_coords", (Parcelable)this.f);
            intent.putExtra("return_size", (Parcelable)this.g);
        }
        return intent;
    }
    
    public i a(final PointF d, final PointF e) {
        this.d = d;
        this.e = e;
        return this;
    }
    
    public i a(final Tweet a) {
        this.a = a;
        return this;
    }
    
    public i a(final TwitterScribeAssociation c) {
        this.c = c;
        return this;
    }
    
    public i a(final String b) {
        this.b = b;
        return this;
    }
    
    public i a(final boolean h) {
        this.h = h;
        return this;
    }
    
    protected abstract Class a();
    
    public void b(final Context context) {
        final Runnable c = this.c(context);
        if (context instanceof Activity && this.h) {
            bh.a(context).a((Activity)context, c);
            return;
        }
        c.run();
    }
}
