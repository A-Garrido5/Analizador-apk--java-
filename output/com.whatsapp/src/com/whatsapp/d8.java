// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.telephony.SignalStrength;
import com.whatsapp.util.Log;
import android.telephony.ServiceState;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;

class d8 extends PhoneStateListener
{
    private static final String[] z;
    final VerifyNumber a;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0011a.#K\u001ej)'O\u0002vs9H\u0015r5)HJw(+Y\u0002+3:H\u0015e(%_Jj)'H\u0015m?j";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '-';
                        break;
                    }
                    case 0: {
                        c2 = 'g';
                        break;
                    }
                    case 1: {
                        c2 = '\u0004';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = 'J';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0011a.#K\u001ej)'O\u0002vs9H\u0015r5)HJw(+Y\u0002+3:H\u0015e(%_Je0:E\u0006)/\"B\u0015p|";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0011a.#K\u001ej)'O\u0002vs9H\u0015r5)HJw(+Y\u0002+3:H\u0015e(%_Je0:E\u0006)0%C\u0000$";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0011a.#K\u001ej)'O\u0002vs9H\u0015r5)HJw(+Y\u0002+/>L\u0013a|";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0011a.#K\u001ej)'O\u0002vs9H\u0015r5)HJw(+Y\u0002+.%L\nm2-\r";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    d8(final VerifyNumber a) {
        this.a = a;
    }
    
    public void onCallForwardingIndicatorChanged(final boolean b) {
    }
    
    public void onCallStateChanged(final int n, final String s) {
    }
    
    public void onCellLocationChanged(final CellLocation cellLocation) {
        if (cellLocation == null) {}
    }
    
    public void onDataActivity(final int n) {
    }
    
    public void onDataConnectionStateChanged(final int n) {
    }
    
    public void onDataConnectionStateChanged(final int n, final int n2) {
    }
    
    public void onMessageWaitingIndicatorChanged(final boolean b) {
    }
    
    public void onServiceStateChanged(final ServiceState serviceState) {
        if (serviceState == null) {
            return;
        }
        this.a.k = serviceState.getRoaming();
        Log.i(d8.z[2] + serviceState.getOperatorAlphaLong());
        Log.i(d8.z[1] + serviceState.getOperatorAlphaShort());
        Log.i(d8.z[0] + serviceState.getOperatorNumeric());
        Log.i(d8.z[4] + this.a.k);
        Log.i(d8.z[3] + serviceState.getState());
        this.a.a(serviceState);
    }
    
    public void onSignalStrengthChanged(final int n) {
    }
    
    public void onSignalStrengthsChanged(final SignalStrength signalStrength) {
        if (signalStrength == null) {}
    }
}
