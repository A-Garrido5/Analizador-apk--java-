// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.featureswitch.b;
import android.app.Activity;
import android.content.Context;

public class ai implements af
{
    private final az a;
    
    public ai(final Context context) {
        this.a = az.a(context);
    }
    
    @Override
    public void a(final Activity activity) {
    }
    
    @Override
    public void b(final Activity activity) {
        b.a(this.a.b().g(), 60000L);
    }
}
