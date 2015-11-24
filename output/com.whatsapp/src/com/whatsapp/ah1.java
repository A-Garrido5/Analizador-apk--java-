// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.IOException;
import com.whatsapp.util.Log;

class ah1 implements Runnable
{
    private static final String[] z;
    final VoiceService$VoiceServiceEventCallback a;
    final Voip$DebugTapType b;
    final byte[] c;
    final int d;
    final Voip$RecordingInfo[] e;
    
    static {
        final String[] z2 = new String[2];
        String s = "}Z6RPhT3N<jE+W\rnw*D\u0019nG\u0019K\u0013gP;\r0~A/W\u000bXA-G\u001ef\u001a1W\u0013g";
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
                        c2 = '\u007f';
                        break;
                    }
                    case 0: {
                        c2 = '\u000b';
                        break;
                    }
                    case 1: {
                        c2 = '5';
                        break;
                    }
                    case 2: {
                        c2 = '_';
                        break;
                    }
                    case 3: {
                        c2 = '\"';
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
                    s = "hT3N<jE+W\rnw*D\u0019nG\u0019K\u0013gP;\u0002\f\u007fZ/\u0002\rnV0P\u001bb[8\u0002\u001b~P\u007fV\u0010+P'A\u001anQ,\u0002\u0019bY:\u0002\fbO:\u0002\u0013bX6V";
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
    
    ah1(final VoiceService$VoiceServiceEventCallback a, final Voip$RecordingInfo[] e, final Voip$DebugTapType b, final byte[] c, final int d) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        final Voip$RecordingInfo voip$RecordingInfo = this.e[this.b.ordinal()];
        while (true) {
            Label_0148: {
                if (voip$RecordingInfo != null) {
                    break Label_0148;
                }
                this.e[this.b.ordinal()] = new Voip$RecordingInfo(this.b);
                final Voip$RecordingInfo voip$RecordingInfo2 = this.e[this.b.ordinal()];
                while (true) {
                    try {
                        if (voip$RecordingInfo2.b() == null) {
                            Log.e(ah1.z[0]);
                            Voip.stopCallRecording();
                            return;
                        }
                    }
                    catch (IOException ex) {
                        throw ex;
                    }
                    while (true) {
                        try {
                            voip$RecordingInfo2.b().write(this.c, 0, this.d);
                            try {
                                this.a.bufferQueue.a(this.c);
                                if (voip$RecordingInfo2.a().length() >= 52428800L) {
                                    Log.i(ah1.z[1]);
                                    Voip.stopCallRecording();
                                }
                                return;
                            }
                            catch (IOException ex2) {
                                throw ex2;
                            }
                        }
                        catch (IOException ex3) {
                            Log.b(ex3);
                            continue;
                        }
                        break;
                    }
                    break;
                }
            }
            final Voip$RecordingInfo voip$RecordingInfo2 = voip$RecordingInfo;
            continue;
        }
    }
}
