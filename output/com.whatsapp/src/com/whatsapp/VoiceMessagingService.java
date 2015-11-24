// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.Intent;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

public class VoiceMessagingService extends SearchActionVerificationClientService
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = "\u0002^w0W\u000e^}rUOPtzB\u000eX~0F\u000eXy{C\u0004Ph}XOTbjB\u0000\u001fH[s(aS[~5nYQ~5pYJo\"y[Jo(u";
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
                        c2 = '0';
                        break;
                    }
                    case 0: {
                        c2 = 'a';
                        break;
                    }
                    case 1: {
                        c2 = '1';
                        break;
                    }
                    case 2: {
                        c2 = '\u001a';
                        break;
                    }
                    case 3: {
                        c2 = '\u001e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Z\u0011n{H\u0015\f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0000_~l_\bU4w^\u0015Ttj\u001e\u0004InlQOe_Fd";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0012TtzY\u000fV:hU\u0013X|wU\u0005\u0011lqY\u0002T:sU\u0012B{yUZ\u0011pwT\\";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\bVtqB\b_}>E\u000fG\u007flY\u0007X\u007fz\u0010\u0017^s}UA\\\u007fmC\u0000V\u007f";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\bVtqB\b_}>F\u000eXy{\u0010\fTimQ\u0006T:zY\u0013TyjU\u0005\u0011{j\u0010\b_l\u007f\\\bU:tY\u0005\n:tY\u0005\f";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\bVtqB\b_}>F\u000eXy{\u0010\fTimQ\u0006T:iY\u0015Y:{]\u0011Ec>S\u000e_n{^\u0015B!>Z\bU'";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "!B4iX\u0000Ei\u007f@\u0011\u001ft{D";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Z\u0011n{H\u0015\f";
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
    
    @Override
    public boolean performAction(final Intent intent, final boolean b, final Bundle bundle) {
        if (!b) {
            Log.w(VoiceMessagingService.z[4]);
            return false;
        }
        final String stringExtra = intent.getStringExtra(VoiceMessagingService.z[2]);
        final String stringExtra2 = intent.getStringExtra(VoiceMessagingService.z[0]);
        if (TextUtils.isEmpty((CharSequence)stringExtra) || TextUtils.isEmpty((CharSequence)stringExtra2)) {
            Log.w(VoiceMessagingService.z[6] + stringExtra2 + VoiceMessagingService.z[8] + stringExtra);
            return false;
        }
        if (!stringExtra2.endsWith(VoiceMessagingService.z[7])) {
            Log.w(VoiceMessagingService.z[5] + stringExtra2 + VoiceMessagingService.z[1] + stringExtra);
            return false;
        }
        Log.i(VoiceMessagingService.z[3] + stringExtra2);
        App.a(App.S.e(stringExtra2), stringExtra);
        return true;
    }
}
