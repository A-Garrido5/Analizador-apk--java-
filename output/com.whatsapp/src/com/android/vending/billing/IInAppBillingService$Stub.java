// 
// Decompiled by Procyon v0.5.30
// 

package com.android.vending.billing;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class IInAppBillingService$Stub extends Binder implements IInAppBillingService
{
    public static int a;
    private static final String z;
    
    static {
        final char[] charArray = "6<Q&g;7Ngo1}Jmh1:Ro(7:Pdo;4\u0012AO;\u0012LxD<?Pah2\u0000Yzp<0Y".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0006';
                    break;
                }
                case 0: {
                    c2 = 'U';
                    break;
                }
                case 1: {
                    c2 = 'S';
                    break;
                }
                case 2: {
                    c2 = '<';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public static IInAppBillingService asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface(IInAppBillingService$Stub.z);
        if (queryLocalInterface != null && queryLocalInterface instanceof IInAppBillingService) {
            return (IInAppBillingService)queryLocalInterface;
        }
        return new IInAppBillingService$Stub$Proxy(binder);
    }
}
