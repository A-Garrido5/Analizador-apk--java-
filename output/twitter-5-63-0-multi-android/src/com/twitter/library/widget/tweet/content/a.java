// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget.tweet.content;

import android.view.View;
import com.twitter.library.client.r;
import com.twitter.library.client.s;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Intent;
import android.app.Activity;
import java.lang.ref.WeakReference;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;

public abstract class a implements f
{
    public final Tweet f;
    public final TwitterScribeAssociation g;
    public final TwitterScribeAssociation h;
    public final WeakReference i;
    public d j;
    protected boolean k;
    
    public a(final Activity activity, final Tweet f, final TwitterScribeAssociation g, final TwitterScribeAssociation h) {
        this.i = new WeakReference((T)activity);
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public d a() {
        return this.j;
    }
    
    @Override
    public void a(final int n, final int n2, final Intent intent) {
    }
    
    @Override
    public void a(final Configuration configuration) {
        if (this.j != null) {
            this.j.a(configuration);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
    }
    
    @Override
    public void a(final Tweet tweet) {
    }
    
    @Override
    public void a(final boolean b) {
        this.y();
        if (this.j != null) {
            this.j.b(b);
        }
    }
    
    protected abstract d b(final Activity p0);
    
    protected abstract Object b();
    
    protected abstract void b(final Bundle p0);
    
    @Override
    public void b(final boolean b) {
        if (this.j != null) {
            this.j.a(b);
        }
    }
    
    protected abstract Bundle c();
    
    @Override
    public void j() {
        if (this.j != null) {
            this.j.ar_();
        }
    }
    
    @Override
    public void k() {
        if (this.j != null) {
            this.j.b();
        }
    }
    
    @Override
    public boolean v() {
        final Activity activity = (Activity)this.i.get();
        if (activity == null) {
            return false;
        }
        this.j = this.b(activity);
        if (this.j == null) {
            return false;
        }
        if (activity instanceof s) {
            ((s)activity).a(this);
        }
        this.j.a(this.b(), this.c());
        return this.k = true;
    }
    
    @Override
    public void w() {
    }
    
    @Override
    public void x() {
        if (this.j != null) {
            this.j.a();
        }
    }
    
    @Override
    public void y() {
        if (this.k && this.j != null) {
            this.k = false;
            final Bundle bundle = new Bundle();
            this.j.a(bundle);
            this.b(bundle);
            final Activity activity = (Activity)this.i.get();
            if (activity instanceof s) {
                ((s)activity).b(this);
            }
        }
    }
    
    @Override
    public View z() {
        if (this.j != null) {
            return this.j.d();
        }
        return null;
    }
}
