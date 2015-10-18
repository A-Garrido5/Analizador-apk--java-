// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.client.App;
import android.net.Uri$Builder;

public class af
{
    private Uri$Builder a;
    
    public af() {
        this.a = new Uri$Builder();
        this.a.scheme("notification").authority(App.i());
    }
    
    public af a(final long n) {
        return this.a("user_id", n);
    }
    
    public af a(final String s, final long n) {
        this.a.appendQueryParameter(s, Long.toString(n));
        return this;
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
