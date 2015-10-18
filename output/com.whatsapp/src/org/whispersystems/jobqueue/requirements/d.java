// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue.requirements;

import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import org.whispersystems.jobqueue.a;
import android.content.Context;

public class d implements e, org.whispersystems.jobqueue.e
{
    private static final String z;
    private transient Context a;
    
    static {
        final char[] charArray = "\u00160o@%\u0016+hX)\u0001&".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '@';
                    break;
                }
                case 0: {
                    c2 = 'u';
                    break;
                }
                case 1: {
                    c2 = '_';
                    break;
                }
                case 2: {
                    c2 = '\u0001';
                    break;
                }
                case 3: {
                    c2 = '.';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public d() {
    }
    
    public d(final Context a) {
        final boolean a2 = b.a;
        this.a = a;
        if (org.whispersystems.jobqueue.a.a) {
            b.a = !a2;
        }
    }
    
    @Override
    public void a(final Context a) {
        this.a = a;
    }
    
    @Override
    public boolean a() {
        final boolean a = b.a;
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)this.a.getSystemService(d.z)).getActiveNetworkInfo();
        final boolean b = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        if (a) {
            org.whispersystems.jobqueue.a.a = !org.whispersystems.jobqueue.a.a;
        }
        return b;
    }
}
