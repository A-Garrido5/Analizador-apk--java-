// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.widget.Toast;

class l implements Runnable
{
    final /* synthetic */ PushService a;
    private String b;
    
    public l(final PushService a, final int n) {
        this.a = a;
        this.b = a.getString(n);
    }
    
    @Override
    public void run() {
        Toast.makeText(this.a.getApplicationContext(), (CharSequence)this.b, 0).show();
    }
}
