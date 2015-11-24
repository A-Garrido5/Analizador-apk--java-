// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class VoiceService$6 extends BroadcastReceiver
{
    private static final String[] z;
    final VoiceService a;
    private boolean b;
    
    static {
        final String[] z2 = new String[2];
        String s = ">\u001e\u000f\u001d*6\u0014E\u0002 ;\u0019\nA\u0016\u001c?4.\u0010\u001b9$0\u0016\u000b1?*\u001a\u001c8*!\u0002\u001a4";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = 'p';
                        break;
                    }
                    case 2: {
                        c2 = 'k';
                        break;
                    }
                    case 3: {
                        c2 = 'o';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = ">\u001e\u000f\u001d*6\u0014E\u0002 ;\u0019\nA '\u0004\u0019\u000ek\f3$0\u0004\n4\" \u001a\f$*;\u0000";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    VoiceService$6(final VoiceService a) {
        this.a = a;
        this.b = false;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final boolean i = App.I;
        if (VoiceService$6.z[0].equals(intent.getAction())) {
            final int intExtra = intent.getIntExtra(VoiceService$6.z[1], -1);
            final boolean c = VoiceService.C(this.a);
            Label_0245: {
                if (intExtra == 1) {
                    VoiceService.f(this.a, true);
                    this.b = false;
                    if (VoiceService.e(this.a) == null) {
                        break Label_0245;
                    }
                    for (final BluetoothDevice bluetoothDevice : VoiceService.e(this.a).getConnectedDevices()) {
                        if (VoiceService.e(this.a).isAudioConnected(bluetoothDevice)) {
                            final int deviceClass = bluetoothDevice.getBluetoothClass().getDeviceClass();
                            this.b = (deviceClass == 1032 || deviceClass == 1056 || deviceClass == 1028);
                            if (this.b && !i) {
                                break;
                            }
                        }
                        if (i) {
                            break;
                        }
                    }
                    if (!i) {
                        break Label_0245;
                    }
                }
                if (intExtra == 0) {
                    VoiceService.f(this.a, false);
                    if (c && !VoiceService.v(this.a) && this.b && this.a.t()) {
                        VoiceService.a(this.a, (String)null);
                    }
                    this.b = false;
                }
            }
            VoiceService.n(this.a);
        }
    }
}
