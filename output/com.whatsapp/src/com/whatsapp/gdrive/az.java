// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;

class az implements Runnable
{
    private static final String z;
    final b0 a;
    final String b;
    
    static {
        final char[] charArray = "LTa'AQVf~O[C|%M\u0010Bp'\u0005RTf IXT5".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '(';
                    break;
                }
                case 0: {
                    c2 = '?';
                    break;
                }
                case 1: {
                    c2 = '1';
                    break;
                }
                case 2: {
                    c2 = '\u0015';
                    break;
                }
                case 3: {
                    c2 = 'S';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    az(final b0 a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        Log.i(az.z + this.b);
        SettingsGoogleDrive.g(this.a.b).setText((CharSequence)this.b);
    }
}
