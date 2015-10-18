// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Notification;
import android.telephony.TelephonyManager;
import com.whatsapp.protocol.bi;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Message;
import android.os.Handler$Callback;

class dv implements Handler$Callback
{
    private static final String[] z;
    final VoiceService a;
    
    static {
        final String[] z2 = new String[9];
        String s = "#\u0005\n\f\u00136\u0005\u000e\u0011S;\"\u0002\u0012X9\u000f\u0011St\u0014$'0y\u0007544}\u000150(}\u0007><=\u007f\u0001#55h\f5%3n\n#-?s\u0018#-;c\u0016+/0\u001c;\u0005C\u001d_!\u0003\u0015\u0019\u001c6\u000b\u000f\u0010";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '<';
                        break;
                    }
                    case 0: {
                        c2 = 'U';
                        break;
                    }
                    case 1: {
                        c2 = 'j';
                        break;
                    }
                    case 2: {
                        c2 = 'c';
                        break;
                    }
                    case 3: {
                        c2 = '|';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "&\t\u0002\u0010Y";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "9\u000f\u0015\u0019P";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ";\u000f\u0014?]9\u0006";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "#\u0005\n\f\u00136\u000b\u000f\u0010\u00137\u000b\u0017\bY'\u0013<\u0011S;\u0003\u0017\u0013Nu\u001a\u0006\u000e_0\u0004\u0017\\\u0001u";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "%\u0002\f\u0012Y";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "4\u0004\u0007\u000eS<\u000eM\u0015R!\u000f\r\b\u00124\t\u0017\u0015S;D!=h\u0001/1%c\u0016\"\"2{\u0010.";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "yJ\u0000\u0014]'\r\n\u0012[uWC";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "&\u001e\u0002\bI&";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    dv(final VoiceService a) {
        this.a = a;
    }
    
    public boolean handleMessage(final Message message) {
        int n = 1;
        switch (message.what) {
            default: {
                n = 0;
                break;
            }
            case 0: {
                VoiceService.h(this.a);
                return n != 0;
            }
            case 2: {
                VoiceService.x(this.a);
                return n != 0;
            }
            case 3: {
                final Intent registerReceiver = this.a.registerReceiver((BroadcastReceiver)null, new IntentFilter(dv.z[6]));
                if (registerReceiver != null) {
                    final int intExtra = registerReceiver.getIntExtra(dv.z[8], -1);
                    Log.i(dv.z[4] + registerReceiver.getIntExtra(dv.z[2], -1) * 100 / registerReceiver.getIntExtra(dv.z[n], -1) + dv.z[7] + ((intExtra == 2 || intExtra == 5) && n));
                    VoiceService.m(this.a).removeMessages(3);
                    VoiceService.m(this.a).sendEmptyMessageDelayed(3, 60000L);
                    return n != 0;
                }
                break;
            }
            case 1: {
                if (!Voip.d()) {
                    Log.e(dv.z[0]);
                    return n != 0;
                }
                final Intent intent = new Intent((Context)this.a, (Class)VoipActivity.class);
                intent.setFlags(268435456);
                intent.putExtra(dv.z[3], (boolean)(n != 0));
                this.a.startActivity(intent);
                VoiceService.b(this.a, false);
                final Notification e = VoiceService.E(this.a);
                if (e != null) {
                    this.a.startForeground(2131755041, e);
                    return n != 0;
                }
                break;
            }
            case 4: {
                VoiceService.a(this.a, Voip$CallState.values()[message.arg1], (Voip$CallInfo)message.obj);
                return n != 0;
            }
            case 5: {
                App.a((bi)message.obj);
                return n != 0;
            }
            case 6: {
                final boolean a = VoiceService.a(this.a);
                final TelephonyManager telephonyManager = (TelephonyManager)this.a.getSystemService(dv.z[5]);
                final VoiceService a2 = this.a;
                final int callState = telephonyManager.getCallState();
                boolean b = false;
                if (callState != 0) {
                    b = (n != 0);
                }
                VoiceService.g(a2, b);
                if (a != VoiceService.a(this.a)) {
                    VoiceService.k(this.a);
                    return n != 0;
                }
                break;
            }
        }
        return n != 0;
    }
}
