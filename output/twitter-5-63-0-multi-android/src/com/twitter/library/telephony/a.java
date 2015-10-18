// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.telephony;

import com.twitter.util.d;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.telephony.SignalStrength;
import java.lang.reflect.Method;
import android.content.Context;

public class a
{
    private static a a;
    private Context b;
    private int c;
    private int d;
    private boolean e;
    private Method f;
    private Method g;
    private Method h;
    private final c i;
    
    private a(final Context context) {
        this.c = 99;
        this.d = 0;
        this.i = new c(this, null);
        this.b = context.getApplicationContext();
        while (true) {
            try {
                this.f = SignalStrength.class.getMethod("getLteRssnr", (Class<?>[])new Class[0]);
                this.g = SignalStrength.class.getMethod("getLteRsrp", (Class<?>[])new Class[0]);
                this.h = SignalStrength.class.getMethod("getLteSignalStrength", (Class<?>[])new Class[0]);
                this.e = true;
                ((TelephonyManager)this.b.getSystemService("phone")).listen((PhoneStateListener)this.i, 256);
            }
            catch (Throwable t) {
                this.f = null;
                this.g = null;
                this.h = null;
                this.e = false;
                continue;
            }
            break;
        }
    }
    
    private int a(final SignalStrength signalStrength) {
        int n;
        if (signalStrength.isGsm()) {
            final boolean e = this.e;
            n = 0;
            if (e) {
                n = this.e(signalStrength);
            }
            if (n == 0) {
                n = b(signalStrength);
            }
        }
        else {
            n = c(signalStrength);
            final int d = d(signalStrength);
            if (d != 0) {
                if (n == 0) {
                    return d;
                }
                if (n >= d) {
                    return d;
                }
            }
        }
        return n;
    }
    
    public static a a() {
        synchronized (a.class) {
            if (com.twitter.library.telephony.a.a == null) {
                throw new IllegalStateException("Initialize must be called first from the main looper thread");
            }
        }
        // monitorexit(a.class)
        return com.twitter.library.telephony.a.a;
    }
    
    public static void a(final Context context) {
        d.a();
        if (com.twitter.library.telephony.a.a == null) {
            com.twitter.library.telephony.a.a = new a(context);
        }
    }
    
    private static int b(final SignalStrength signalStrength) {
        int n = 2;
        final int gsmSignalStrength = signalStrength.getGsmSignalStrength();
        if (gsmSignalStrength <= n || gsmSignalStrength == 99) {
            n = 0;
        }
        else {
            if (gsmSignalStrength >= 12) {
                return 4;
            }
            if (gsmSignalStrength >= 8) {
                return 3;
            }
            if (gsmSignalStrength < 5) {
                return 1;
            }
        }
        return n;
    }
    
    private static int c(final SignalStrength signalStrength) {
        int n = 4;
        final int cdmaDbm = signalStrength.getCdmaDbm();
        final int cdmaEcio = signalStrength.getCdmaEcio();
        int n2;
        if (cdmaDbm >= -75) {
            n2 = n;
        }
        else if (cdmaDbm >= -85) {
            n2 = 3;
        }
        else if (cdmaDbm >= -95) {
            n2 = 2;
        }
        else if (cdmaDbm >= -100) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (cdmaEcio < -90) {
            if (cdmaEcio >= -110) {
                n = 3;
            }
            else if (cdmaEcio >= -130) {
                n = 2;
            }
            else if (cdmaEcio >= -150) {
                n = 1;
            }
            else {
                n = 0;
            }
        }
        if (n2 < n) {
            return n2;
        }
        return n;
    }
    
    private static int d(final SignalStrength signalStrength) {
        int n = 4;
        final int evdoDbm = signalStrength.getEvdoDbm();
        final int evdoSnr = signalStrength.getEvdoSnr();
        int n2;
        if (evdoDbm >= -65) {
            n2 = n;
        }
        else if (evdoDbm >= -75) {
            n2 = 3;
        }
        else if (evdoDbm >= -90) {
            n2 = 2;
        }
        else if (evdoDbm >= -105) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (evdoSnr < 7) {
            if (evdoSnr >= 5) {
                n = 3;
            }
            else if (evdoSnr >= 3) {
                n = 2;
            }
            else if (evdoSnr >= 1) {
                n = 1;
            }
            else {
                n = 0;
            }
        }
        if (n2 < n) {
            return n2;
        }
        return n;
    }
    
    private int e(final SignalStrength signalStrength) {
    Label_0079_Outer:
        while (true) {
            int intValue3 = 0;
            int n = 0;
            int n2 = 0;
        Label_0240:
            while (true) {
                int intValue2 = 0;
            Label_0170:
                while (true) {
                    int intValue;
                    try {
                        intValue = (int)this.g.invoke(signalStrength, new Object[0]);
                        intValue2 = (int)this.f.invoke(signalStrength, new Object[0]);
                        intValue3 = (int)this.h.invoke(signalStrength, new Object[0]);
                        if (intValue > -44) {
                            n = -1;
                            if (intValue2 <= 300) {
                                break Label_0170;
                            }
                            n2 = -1;
                            if (n2 == -1 || n == -1) {
                                break Label_0240;
                            }
                            if (n < n2) {
                                return n;
                            }
                            return n2;
                        }
                    }
                    catch (Throwable t) {
                        this.e = false;
                        return 0;
                    }
                    if (intValue >= -85) {
                        n = 4;
                        continue Label_0079_Outer;
                    }
                    if (intValue >= -95) {
                        n = 3;
                        continue Label_0079_Outer;
                    }
                    if (intValue >= -105) {
                        n = 2;
                        continue Label_0079_Outer;
                    }
                    if (intValue >= -115) {
                        n = 1;
                        continue Label_0079_Outer;
                    }
                    if (intValue >= -140) {
                        n = 0;
                        continue Label_0079_Outer;
                    }
                    n = -1;
                    continue Label_0079_Outer;
                }
                if (intValue2 >= 130) {
                    n2 = 4;
                    continue;
                }
                if (intValue2 >= 45) {
                    n2 = 3;
                    continue;
                }
                if (intValue2 >= 10) {
                    n2 = 2;
                    continue;
                }
                if (intValue2 >= -30) {
                    n2 = 1;
                    continue;
                }
                if (intValue2 >= -200) {
                    n2 = 0;
                    continue;
                }
                n2 = -1;
                continue;
            }
            if (n2 != -1) {
                return n2;
            }
            if (n != -1) {
                return n;
            }
            if (intValue3 > 63) {
                return 0;
            }
            if (intValue3 >= 12) {
                return 4;
            }
            if (intValue3 >= 8) {
                return 3;
            }
            if (intValue3 >= 5) {
                return 2;
            }
            if (intValue3 >= 0) {
                return 1;
            }
            return 0;
        }
    }
    
    public int b() {
        return this.c;
    }
}
