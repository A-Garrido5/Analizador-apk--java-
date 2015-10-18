// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class aw5 implements Runnable
{
    private static final String z;
    final String a;
    final ig b;
    final String c;
    
    static {
        final char[] charArray = "w(\u0005pvf4\nrz{)\u0018+tp5\u0002pv9(\tuvf1\u000et<g\"\u001f+~q4\u0018gtqg".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0013';
                    break;
                }
                case 0: {
                    c2 = '\u0014';
                    break;
                }
                case 1: {
                    c2 = 'G';
                    break;
                }
                case 2: {
                    c2 = 'k';
                    break;
                }
                case 3: {
                    c2 = '\u0006';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aw5(final ig b, final String c, final String a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(aw5.z + this.c);
        ConversationsFragment.o(this.b.c).setText((CharSequence)this.a);
        ConversationsFragment.e(this.b.c).setText((CharSequence)this.c);
    }
}
