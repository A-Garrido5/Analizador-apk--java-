// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.scribe.ScribeService;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.widget.StatusToolBar;
import android.content.Context;
import android.content.Intent;
import com.twitter.library.widget.ao;

class bj implements ao
{
    Intent a;
    private final Context b;
    
    public bj(final Context context) {
        this.b = context.getApplicationContext();
    }
    
    @Override
    public void a(final StatusToolBar statusToolBar) {
        ScribeService.a(this.b, ((TwitterScribeLog)new TwitterScribeLog(az.a(this.b).b().g()).b(new String[] { "app:status_bar::access_campaign:impression" })).b(this.b));
    }
    
    @Override
    public void b(final StatusToolBar statusToolBar) {
        if (this.a != null) {
            statusToolBar.getContext().startActivity(this.a);
        }
        ScribeService.a(this.b, ((TwitterScribeLog)new TwitterScribeLog(az.a(this.b).b().g()).b(new String[] { "app:status_bar::access_campaign:open" })).b(this.b));
    }
}
