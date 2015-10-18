// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.content.Context;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.bn;

class yn extends bn
{
    public final boolean a;
    public final int b;
    
    public yn(final TwitterFragmentActivity twitterFragmentActivity, final bn bn) {
        boolean a = true;
        super(bn);
        this.a(false);
        final Intent intent = twitterFragmentActivity.getIntent();
        switch (this.b = intent.getIntExtra("type", -1)) {
            default: {
                this.d(false);
                if (intent.hasExtra("user_ids")) {
                    a = false;
                }
                this.a = a;
            }
            case 6: {
                this.d(false);
                this.a = false;
            }
            case 7:
            case 8:
            case 9:
            case 10:
            case 13:
            case 19:
            case 20:
            case 27: {
                if (kg.a((Context)twitterFragmentActivity)) {
                    a = false;
                }
                this.d(a);
                this.a = false;
                this.a(0);
            }
            case 21: {
                this.a(false);
                this.a = a;
            }
            case 18: {
                this.a = a;
            }
        }
    }
}
