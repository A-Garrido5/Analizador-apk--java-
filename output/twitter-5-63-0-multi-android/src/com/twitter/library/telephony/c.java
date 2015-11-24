// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.telephony;

import com.twitter.util.d;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import android.content.Context;
import android.telephony.SignalStrength;
import android.telephony.PhoneStateListener;

class c extends PhoneStateListener
{
    final /* synthetic */ a a;
    
    private c(final a a) {
        this.a = a;
    }
    
    public void onSignalStrengthsChanged(final SignalStrength signalStrength) {
        if (signalStrength.isGsm()) {
            this.a.c = signalStrength.getGsmSignalStrength();
        }
        else {
            this.a.c = signalStrength.getCdmaDbm();
        }
        this.a.d = this.a.a(signalStrength);
    }
}
