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

class ahj implements View$OnClickListener
{
    private static final String z;
    final GroupChatInfo a;
    
    static {
        final char[] charArray = "f;(".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '{';
                    break;
                }
                case 0: {
                    c2 = '\f';
                    break;
                }
                case 1: {
                    c2 = 'R';
                    break;
                }
                case 2: {
                    c2 = 'L';
                    break;
                }
                case 3: {
                    c2 = '\u0016';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ahj(final GroupChatInfo a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        if (!adc.f(GroupChatInfo.l(this.a))) {
            this.a.f(this.a.getString(2131231122));
            if (!i) {
                return;
            }
        }
        if (GroupChatInfo.s(this.a).h) {
            final Intent intent = new Intent((Context)this.a, (Class)ViewProfilePhoto.class);
            intent.putExtra(ahj.z, GroupChatInfo.s(this.a).u);
            ActivityCompat.startActivityForResult(this.a, intent, 14, ActivityOptionsCompat.makeSceneTransitionAnimation(this.a, (View)GroupChatInfo.m(this.a), this.a.getString(2131232142)).toBundle());
            if (!i) {
                return;
            }
        }
        qp.a(GroupChatInfo.s(this.a), this.a, 12);
    }
}
