// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.zip.GZIPOutputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.io.IOException;
import java.io.OutputStream;
import java.io.File;

public class Voip$RecordingInfo
{
    private static final String[] z;
    private File a;
    private OutputStream b;
    
    static {
        final String[] z2 = new String[7];
        String s = "2(}\u0000[$cl\u000e^";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ')';
                        break;
                    }
                    case 0: {
                        c2 = '@';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = '\u001e';
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
                    s = "5#u\u0001F7#>\u000bL\"8yO]!=>\u001bP0($O";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "2(}\n@6(zAM%.q\u000bL$";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "n:\u007f\u0019\u0007'7";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "2(}\u0000[$cn\u001dF#(m\u001cL$";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "2(}\u0000[$c{\u0001J/){\u000b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "0!\u007f\u0016K!.uA[!:";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public Voip$RecordingInfo(final Voip$DebugTapType voip$DebugTapType) {
        final boolean i = App.I;
        String s = null;
    Label_0138:
        while (true) {
            Label_0127: {
                switch (a0u.a[voip$DebugTapType.ordinal()]) {
                    case 1: {
                        s = Voip$RecordingInfo.z[4];
                        if (i) {
                            break Label_0127;
                        }
                        break Label_0138;
                    }
                    case 2: {
                        s = Voip$RecordingInfo.z[5];
                        if (i) {
                            break Label_0127;
                        }
                        break Label_0138;
                    }
                    case 3: {
                        s = Voip$RecordingInfo.z[2];
                        if (i) {
                            break Label_0127;
                        }
                        break Label_0138;
                    }
                    case 4: {
                        s = Voip$RecordingInfo.z[0];
                        if (i) {
                            break Label_0127;
                        }
                        break Label_0138;
                    }
                    case 5: {
                        s = Voip$RecordingInfo.z[6];
                        if (!i) {
                            break Label_0138;
                        }
                        break;
                    }
                }
            }
            try {
                throw new IllegalStateException(Voip$RecordingInfo.z[1] + voip$DebugTapType);
            }
            catch (IOException ex) {
                throw ex;
            }
            continue;
        }
        this.a = new File(qf.c(), Voip.f().format(new Date(System.currentTimeMillis())) + "." + s + Voip$RecordingInfo.z[3]);
        try {
            this.b = new GZIPOutputStream(new FileOutputStream(this.a, true));
        }
        catch (IOException ex2) {
            Log.b(ex2);
            this.b = null;
        }
    }
    
    public File a() {
        return this.a;
    }
    
    public OutputStream b() {
        return this.b;
    }
}
