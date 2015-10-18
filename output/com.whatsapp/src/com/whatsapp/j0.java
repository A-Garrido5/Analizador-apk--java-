// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.app.ActivityCompat;
import android.app.Activity;
import android.support.v4.app.ActivityOptionsCompat;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class j0 implements View$OnClickListener
{
    private static final String z;
    final ProfileInfoActivity a;
    
    static {
        final char[] charArray = "OTi".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '7';
                    break;
                }
                case 0: {
                    c2 = '%';
                    break;
                }
                case 1: {
                    c2 = '=';
                    break;
                }
                case 2: {
                    c2 = '\r';
                    break;
                }
                case 3: {
                    c2 = '@';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    j0(final ProfileInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (ProfileInfoActivity.b(this.a)) {
            final Intent intent = new Intent((Context)this.a, (Class)ViewProfilePhoto.class);
            intent.putExtra(j0.z, ProfileInfoActivity.c(this.a).u);
            ActivityCompat.startActivity(this.a, intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this.a, (View)ProfileInfoActivity.e(this.a), this.a.getString(2131232142)).toBundle());
            if (!App.I) {
                return;
            }
        }
        qp.a(ProfileInfoActivity.c(this.a), this.a, 12);
    }
}
