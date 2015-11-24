// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class a8x implements Runnable
{
    private static final String z;
    final ig a;
    
    static {
        final char[] charArray = "^ImeyOUbguRHp>{YTjey\u0010Ia`yOPfa3NCw>qXUpr{X\tp{sJ\u000bgvhXTnzr\\Rf".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001c';
                    break;
                }
                case 0: {
                    c2 = '=';
                    break;
                }
                case 1: {
                    c2 = '&';
                    break;
                }
                case 2: {
                    c2 = '\u0003';
                    break;
                }
                case 3: {
                    c2 = '\u0013';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a8x(final ig a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(a8x.z);
        ConversationsFragment.a(this.a.c).setVisibility(0);
        ConversationsFragment.a(this.a.c).setIndeterminate(false);
    }
}
