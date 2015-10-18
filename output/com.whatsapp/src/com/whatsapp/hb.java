// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Message;
import android.os.Handler$Callback;

class hb implements Handler$Callback
{
    private static final String[] z;
    final VoiceService a;
    
    static {
        final String[] z2 = new String[5];
        String s = "\rf\"Q\u0003\u0018h'Mx\u0012d.NY\u000fA*OH\u0017l9\u0001[\u001e)*SI[g$U\f\u0012gk@B[h(UE\rlkBM\u0017e";
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
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = '{';
                        break;
                    }
                    case 1: {
                        c2 = '\t';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
                        break;
                    }
                    case 3: {
                        c2 = '!';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\rf\"Q\u0003\u0018h'M\u0003\u0019|8X\u0001\u000ff%D\u0001\u000f`&DC\u000e}";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\rf\"Q\u0003\u0018h'M\u0003\bl%E\u0001\u0018h'M\u0001\u0014o-D^V}\"LI\u0014|?";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\rf\"Q\u0003\u0018h'M\u0003\u0015f?\fM\u0018j.QXV}\"LI\u0014|?";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\rf\"Q\u0003\u0018h'M\u0003\u001aj(D\\\u000fl/\fN\u000e}fOC\u000f$*BX\u0012\u007f.\fX\u0012d.NY\u000f";
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
    
    hb(final VoiceService a) {
        this.a = a;
    }
    
    public boolean handleMessage(final Message message) {
        if (!Voip.d()) {
            Log.e(hb.z[0]);
            return false;
        }
        switch (message.what) {
            default: {
                return false;
            }
            case 0: {
                Log.i(hb.z[3]);
                if (Voip.getCurrentCallState() == Voip$CallState.RECEIVED_CALL) {
                    this.a.C();
                    if (!App.I) {
                        return true;
                    }
                }
                this.a.w();
                return true;
            }
            case 1: {
                Log.i(hb.z[4]);
                this.a.w();
                return true;
            }
            case 2: {
                Log.i(hb.z[2]);
                if (App.j() == 0) {
                    this.a.c(this.a.getString(2131231924));
                }
                return true;
            }
            case 3: {
                Log.i(hb.z[1]);
                this.a.w();
                return true;
            }
        }
    }
}
