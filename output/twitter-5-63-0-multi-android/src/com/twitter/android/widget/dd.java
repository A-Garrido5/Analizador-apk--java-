// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.kg;
import android.content.Context;
import com.twitter.android.util.AppEventTrack;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.View;
import android.app.Activity;
import android.view.View$OnClickListener;

class dd implements View$OnClickListener
{
    final /* synthetic */ Activity a;
    final /* synthetic */ LoggedOutBar b;
    
    dd(final LoggedOutBar b, final Activity a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(0L);
        AppEventTrack.a((Context)this.a, twitterScribeLog);
        final String c = kg.c((Context)this.a);
        switch (view.getId()) {
            default: {
                throw new IllegalArgumentException();
            }
            case 2131886902: {
                twitterScribeLog.b(new String[] { c + ":login_signup_bar::signup:click" });
                ScribeService.a((Context)this.a, twitterScribeLog);
                kg.b(this.a);
            }
            case 2131886903: {
                twitterScribeLog.b(new String[] { c + ":login_signup_bar::login:click" });
                ScribeService.a((Context)this.a, twitterScribeLog);
                kg.c(this.a);
            }
        }
    }
}
