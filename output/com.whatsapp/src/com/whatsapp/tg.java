// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Parcelable;
import com.whatsapp.util.undobar.a;
import android.app.Activity;
import com.whatsapp.util.undobar.c;
import android.os.Bundle;

class tg implements Runnable
{
    private static final String z;
    final aax a;
    
    static {
        final char[] charArray = "Ew\u0013".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0006';
                    break;
                }
                case 0: {
                    c2 = '/';
                    break;
                }
                case 1: {
                    c2 = '\u001e';
                    break;
                }
                case 2: {
                    c2 = 'w';
                    break;
                }
                case 3: {
                    c2 = 'R';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    tg(final aax a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.ak.c(ConversationsFragment.n(this.a.a), true);
        final Bundle bundle = new Bundle();
        bundle.putString(tg.z, ConversationsFragment.n(this.a.a));
        new c(this.a.a.getActivity()).a(2131230957).a(new awr(this)).a((Parcelable)bundle).a();
        ConversationsFragment.k(this.a.a).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new _a(this));
    }
}
