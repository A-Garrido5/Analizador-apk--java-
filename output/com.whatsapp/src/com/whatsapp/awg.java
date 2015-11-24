// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import org.whispersystems.jobqueue.a;
import com.whatsapp.jobqueue.job.GetPreKeyJob;
import com.whatsapp.util.Log;

final class awg implements Runnable
{
    private static final String[] z;
    final fz a;
    private final boolean b;
    
    static {
        final String[] z2 = new String[7];
        String s = "Hod1I\foh(I\u0004\u007f";
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
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = '\t';
                        break;
                    }
                    case 3: {
                        c2 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "S&d9_\u001bgn9\f\u000fig9";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\t~f0C\u001cj).I\u001bcg8E\u0006a)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\t~f0C\u001cj))B\tde9\f\u001ci).I\u001bcg8\f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\t~f0C\u001cj)1M\u001am`2KH";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\t~f0C\u001cj).I\u001bcg8E\u0006a)";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Hgz|\\\rhm5B\u000f&z9_\u001bof2\f\u001brh(I";
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
    
    awg(final fz a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        App.b(this.a.a);
        final bi a = App.ak.a(this.a.b);
        if (a != null) {
            Log.i(awg.z[5] + this.a.b);
            a.y = this.a.c;
            if (this.b) {
                Log.i(awg.z[4] + this.a.b + awg.z[6]);
                App.ak.c(this.a.b);
                ie.a(this.a.d).aG.a(new GetPreKeyJob(this.a.b.a, null));
                if (!i) {
                    return;
                }
            }
            Log.i(awg.z[2] + this.a.b + awg.z[0]);
            App.b(a, false);
            if (!i) {
                return;
            }
        }
        Log.i(awg.z[3] + this.a.b + awg.z[1]);
    }
}
