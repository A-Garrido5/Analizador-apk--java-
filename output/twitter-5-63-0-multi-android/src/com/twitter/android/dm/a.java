// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dm;

import android.net.Uri;
import android.content.Intent;

public class a
{
    private final Intent a;
    
    public a(final Intent a) {
        this.a = a;
    }
    
    public boolean a() {
        return "android.intent.action.SEND".equals(this.a.getAction());
    }
    
    public Uri b() {
        if (this.a()) {
            return (Uri)this.a.getParcelableExtra("android.intent.extra.STREAM");
        }
        return null;
    }
}
