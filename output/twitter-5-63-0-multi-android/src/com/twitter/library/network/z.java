// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import java.net.URI;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.internal.network.f;
import android.content.Context;
import com.twitter.internal.network.h;

public abstract class z extends h
{
    private final Context a;
    private f b;
    
    public z(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    protected abstract f a(final Context p0);
    
    @Override
    public f a(final HttpOperation$RequestMethod httpOperation$RequestMethod, final URI uri) {
        synchronized (this) {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            return this.b;
        }
    }
    
    @Override
    public void a() {
        synchronized (this) {
            if (this.b != null) {
                this.b.a();
                this.b = null;
            }
        }
    }
}
