// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.media.AudioManager;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class VoiceService$7 extends BroadcastReceiver
{
    private static final String[] z;
    final VoiceService a;
    
    static {
        final String[] z2 = new String[4];
        String s = "Cs8Tf";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\t';
                        break;
                    }
                    case 0: {
                        c2 = '\"';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Ch8OfKbr_eWc(RfVnrUlCb/X}\fv.RoKj9\u0013hAr5Rg\fE\u0013sGgE\btFlY\u000fiHvC\u0003~AcH\u001bxM";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Ch8OfKbr_eWc(RfVnrM{M`5Ql\fc$I{C(\foLtO\u0013hZ}U\b|]g";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Ch8OfKbr_eWc(RfVnrM{M`5Ql\fc$I{C(\u000fiHvC";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    VoiceService$7(final VoiceService a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (VoiceService$7.z[1].equals(intent.getAction())) {
            final int intExtra = intent.getIntExtra(VoiceService$7.z[3], 0);
            final int intExtra2 = intent.getIntExtra(VoiceService$7.z[2], 0);
            if (intExtra != intExtra2) {
                if ((intExtra2 == 2 || VoiceService.C(this.a)) && (intExtra == 3 || intExtra == 0)) {
                    final AudioManager audioManager = (AudioManager)this.a.getSystemService(VoiceService$7.z[0]);
                    audioManager.stopBluetoothSco();
                    audioManager.setBluetoothScoOn(false);
                }
                VoiceService.n(this.a);
            }
        }
    }
}
