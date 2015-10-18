// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import com.whatsapp.contact.k;

class aot implements Runnable
{
    final k a;
    final at5 b;
    
    aot(final at5 b, final k a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        final AppCompatActivity appCompatActivity = (AppCompatActivity)this.b.a.getActivity();
        if (appCompatActivity != null) {
            appCompatActivity.setSupportProgressBarIndeterminateVisibility(false);
            ContactsFragment.e(this.b.a);
            Label_0151: {
                switch (rm.a[this.a.ordinal()]) {
                    case 1: {
                        App.aL.c(true);
                        App.aq.a(System.currentTimeMillis());
                        App.a((Context)appCompatActivity, 2131230907, 0);
                        if (i) {
                            break Label_0151;
                        }
                        break;
                    }
                    case 2: {
                        ContactsFragment.a(this.b.a, 2131230905);
                        if (i) {
                            break Label_0151;
                        }
                        break;
                    }
                    case 3:
                    case 4: {
                        ContactsFragment.a(this.b.a, 2131230904);
                        App.aL.b(true);
                        if (i) {
                            break Label_0151;
                        }
                        break;
                    }
                    case 5: {
                        ContactsFragment.a(this.b.a, 2131230906);
                    }
                }
            }
        }
    }
}
