// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

final class v implements Runnable
{
    private static final String z;
    
    static {
        final char[] charArray = "\u0002)ZK8\f+I\u0001-\u001a7IK:\u00065^\u0005q\u0006+X\u000b,".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '^';
                    break;
                }
                case 0: {
                    c2 = 'c';
                    break;
                }
                case 1: {
                    c2 = 'Y';
                    break;
                }
                case 2: {
                    c2 = '*';
                    break;
                }
                case 3: {
                    c2 = 'd';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public void run() {
        try {
            App.aL.onChange(true);
        }
        catch (Exception ex) {
            Log.c(v.z, ex);
        }
    }
}
