// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build$VERSION;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class qu implements View$OnClickListener
{
    private static final String z;
    final QuickContactActivity a;
    
    static {
        final char[] charArray = "\u007fZ\n".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\t';
                    break;
                }
                case 0: {
                    c2 = '\u0015';
                    break;
                }
                case 1: {
                    c2 = '3';
                    break;
                }
                case 2: {
                    c2 = 'n';
                    break;
                }
                case 3: {
                    c2 = 'Y';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    qu(final QuickContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (QuickContactActivity.c(this.a).h && ((QuickContactActivity.c(this.a).b && !QuickContactActivity.c(this.a).k()) || QuickContactActivity.c(this.a).m())) {
            final Intent intent = new Intent(this.a.getApplicationContext(), (Class)ViewProfilePhoto.class);
            intent.putExtra(qu.z, QuickContactActivity.c(this.a).u);
            if (Build$VERSION.SDK_INT < 21) {
                this.a.startActivity(intent);
                QuickContactActivity.a(this.a, false);
                if (!App.I) {
                    return;
                }
            }
            ActivityCompat.startActivity(this.a, intent, ActivityOptions.makeSceneTransitionAnimation((Activity)this.a, (View)QuickContactActivity.b(this.a), this.a.getString(2131232142)).toBundle());
            new Handler().postDelayed((Runnable)new gy(this), (long)this.a.getResources().getInteger(17694721));
        }
    }
}
