// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.bn;

public class tk extends bn
{
    public final boolean a;
    public final boolean b;
    public final int c;
    
    public tk(final TwitterFragmentActivity twitterFragmentActivity, final bn bn) {
        super(bn);
        final Intent intent = twitterFragmentActivity.getIntent();
        final Uri data = intent.getData();
        this.b = (data != null && "twitter".equals(data.getScheme()));
        if (this.b) {
            final String host = data.getHost();
            if ("user_timeline".equals(host)) {
                this.c = 1;
            }
            else if ("favorites".equals(host)) {
                this.c = 2;
            }
            else {
                this.c = intent.getIntExtra("type", 0);
            }
        }
        else {
            this.c = intent.getIntExtra("type", 0);
        }
        switch (this.c) {
            default: {
                this.a = true;
            }
            case 1:
            case 2:
            case 9: {
                this.d(false);
                if (kg.a((Context)twitterFragmentActivity)) {
                    this.a(4);
                }
                this.a = true;
            }
            case 12:
            case 14: {
                this.a = false;
            }
        }
    }
}
