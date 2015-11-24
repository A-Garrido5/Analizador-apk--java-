// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.IOException;

class yf implements Runnable
{
    private static final String[] z;
    final VoiceService$VoiceServiceEventCallback a;
    final Voip$DebugTapType b;
    final Voip$RecordingInfo[] c;
    
    static {
        final String[] z2 = new String[2];
        String s = "<\\D?\u0019>M\\&(:xF7?;\u001d";
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
                        c2 = 'Z';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = '=';
                        break;
                    }
                    case 2: {
                        c2 = '(';
                        break;
                    }
                    case 3: {
                        c2 = 'S';
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
                    s = "\u007fNA)?\u007f";
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
    
    yf(final VoiceService$VoiceServiceEventCallback a, final Voip$RecordingInfo[] c, final Voip$DebugTapType b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void run() {
        final Voip$RecordingInfo voip$RecordingInfo = this.c[this.b.ordinal()];
        if (voip$RecordingInfo == null) {
            return;
        }
        try {
            if (voip$RecordingInfo.b() == null) {
                return;
            }
        }
        catch (IOException ex) {
            try {
                throw ex;
            }
            catch (IOException ex2) {
                throw ex2;
            }
        }
        try {
            voip$RecordingInfo.b().close();
            Log.i(yf.z[0] + voip$RecordingInfo.a() + yf.z[1] + voip$RecordingInfo.a().length());
        }
        catch (IOException ex3) {
            Log.b(ex3);
        }
    }
}
