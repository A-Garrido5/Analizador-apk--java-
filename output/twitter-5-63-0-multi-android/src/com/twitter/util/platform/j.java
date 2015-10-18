// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import android.telephony.TelephonyManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.content.Context;

public class j implements l
{
    private final TwRadioType a;
    
    public j(final Context context) {
        final NetworkInfo a = a(context);
        int n;
        if (a != null && a.isConnectedOrConnecting()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            this.a = TwRadioType.a;
            return;
        }
        this.a = b(context);
    }
    
    private static NetworkInfo a(final Context context) {
        return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
    }
    
    private static TwRadioType a(final int n) {
        switch (n) {
            default: {
                return TwRadioType.b;
            }
            case 4: {
                return TwRadioType.f;
            }
            case 11: {
                return TwRadioType.m;
            }
            case 1: {
                return TwRadioType.c;
            }
            case 7: {
                return TwRadioType.i;
            }
            case 2: {
                return TwRadioType.d;
            }
            case 5: {
                return TwRadioType.g;
            }
            case 3: {
                return TwRadioType.e;
            }
            case 8: {
                return TwRadioType.j;
            }
            case 12: {
                return TwRadioType.n;
            }
            case 6: {
                return TwRadioType.h;
            }
            case 10: {
                return TwRadioType.l;
            }
            case 9: {
                return TwRadioType.k;
            }
            case 14: {
                return TwRadioType.p;
            }
            case 15: {
                return TwRadioType.q;
            }
            case 13: {
                return TwRadioType.o;
            }
            case 0: {
                return TwRadioType.b;
            }
        }
    }
    
    private static TwRadioType b(final Context context) {
        final NetworkInfo a = a(context);
        if (a != null && a.getType() == 1) {
            return TwRadioType.s;
        }
        return a(((TelephonyManager)context.getSystemService("phone")).getNetworkType());
    }
    
    @Override
    public TwRadioType a() {
        return this.a;
    }
}
