// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import android.content.Intent;
import android.view.View;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.TwitterScribeItem;
import android.content.Context;
import android.view.View$OnClickListener;

public class ta implements View$OnClickListener
{
    private long a;
    private int b;
    private Context c;
    private TwitterScribeItem d;
    private long e;
    private Tweet f;
    
    public ta(final Context c, final long a, final int b, final TwitterScribeItem d, final long e, final Tweet f) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void a(final long a, final int b, final TwitterScribeItem d, final long e, final Tweet f) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void onClick(final View view) {
        final Tweet f = this.f;
        if (f != null && f.g) {
            this.c.startActivity(new Intent(this.c, (Class)ProfileActivity.class).putExtra("user_id", f.f).putExtra("screen_name", f.z));
        }
        else {
            String s = null;
            int n = 0;
            switch (this.b) {
                default: {
                    s = null;
                    n = 0;
                    break;
                }
                case 20: {
                    n = 2131296299;
                    s = "tweet";
                    break;
                }
                case 18: {
                    n = 2131296296;
                    s = "tweet";
                    break;
                }
                case 19: {
                    n = 2131296298;
                    s = "profile";
                    break;
                }
            }
            if (n > 0 && this.a > 0L) {
                final Intent putExtra = new Intent(this.c, (Class)ActivityDetailActivity.class).putExtra("event_type", this.b).putExtra("user_tag", this.a).putExtra("hide_action_button", false).putExtra("title_res_id", n).putExtra("status_tag", this.a).putExtra("magic_rec_id", this.e);
                com.twitter.android.client.c.a(this.c).a(((TwitterScribeLog)new TwitterScribeLog(az.a(this.c).b().g()).b(s, null, "magic_rec_bar", null, "click")).a(this.d));
                this.c.startActivity(putExtra);
            }
        }
    }
}
