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

class un implements View$OnClickListener
{
    private static final String z;
    final ContactInfo a;
    
    static {
        final char[] charArray = "ON\u001e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001e';
                    break;
                }
                case 0: {
                    c2 = '%';
                    break;
                }
                case 1: {
                    c2 = '\'';
                    break;
                }
                case 2: {
                    c2 = 'z';
                    break;
                }
                case 3: {
                    c2 = '\u0011';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    un(final ContactInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (ContactInfo.c(this.a).h) {
            final Intent intent = new Intent((Context)this.a, (Class)ViewProfilePhoto.class);
            intent.putExtra(un.z, ContactInfo.c(this.a).u);
            ActivityCompat.startActivity(this.a, intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this.a, (View)ContactInfo.d(this.a), this.a.getString(2131232142)).toBundle());
            if (!App.I) {
                return;
            }
        }
        App.a((Context)this.a, 2131231424, 0);
        App.a(ContactInfo.c(this.a).u, ContactInfo.c(this.a).q, 2);
    }
}
