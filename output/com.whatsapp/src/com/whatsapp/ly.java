// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class ly implements ViewTreeObserver$OnGlobalLayoutListener
{
    private static final String z;
    Runnable a;
    final Conversation b;
    int c;
    
    static {
        final char[] charArray = "\u0014\u001e\u0016V\u0019\u0005\u0002\u0019T\u0015\u0018\u001fWC\u0013\u0019\u0005\u0019C\b(\u0019\u0017L\u0018\u0012\u0003WW\u0015\u0013\u0005\u0010\u001a".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '|';
                    break;
                }
                case 0: {
                    c2 = 'w';
                    break;
                }
                case 1: {
                    c2 = 'q';
                    break;
                }
                case 2: {
                    c2 = 'x';
                    break;
                }
                case 3: {
                    c2 = ' ';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ly(final Conversation b) {
        this.b = b;
        this.a = new uj(this);
    }
    
    public void onGlobalLayout() {
        final int width = Conversation.g(this.b).getWidth();
        if (width != this.c) {
            this.c = width;
            Log.i(ly.z + width);
            App.aq.a5().removeCallbacks(this.a);
            App.aq.a5().post(this.a);
        }
    }
}
