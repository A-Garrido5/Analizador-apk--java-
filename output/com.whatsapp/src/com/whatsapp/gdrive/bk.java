// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;

class bk implements Runnable
{
    private static final String z;
    final a2 a;
    
    static {
        final char[] charArray = "P;J\u0017\u007fRrY\u001d}^)Q\np\u001a0Z\rlE)]\f&Z,_\r}X-]SmX(V\u0012fV;\u0015\r}V-L".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\t';
                    break;
                }
                case 0: {
                    c2 = '7';
                    break;
                }
                case 1: {
                    c2 = '_';
                    break;
                }
                case 2: {
                    c2 = '8';
                    break;
                }
                case 3: {
                    c2 = '~';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bk(final a2 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        GoogleDriveActivity.k(this.a.a).setIndeterminate(false);
        Log.i(bk.z);
    }
}
