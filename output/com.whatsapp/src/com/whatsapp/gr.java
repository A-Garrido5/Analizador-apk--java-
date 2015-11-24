// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.util.Log;
import java.util.List;
import com.whatsapp.protocol.bi;
import java.util.ArrayList;
import java.util.HashMap;
import android.os.ConditionVariable;

final class gr implements Runnable
{
    private static final String[] z;
    final ConditionVariable a;
    final HashMap b;
    final ConditionVariable c;
    final boolean d;
    
    static {
        final String[] z2 = new String[2];
        String s = "a\u0018SJ+/\u001eE\t+3\u0018Y[n";
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
                        c2 = 'N';
                        break;
                    }
                    case 0: {
                        c2 = 'A';
                        break;
                    }
                    case 1: {
                        c2 = 'j';
                        break;
                    }
                    case 2: {
                        c2 = '6';
                        break;
                    }
                    case 3: {
                        c2 = ')';
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
                    s = " \u001aF\u00066,\u001aF\u0006=$\u0004R\u0006?35EL %5UF 7JF[+$\u0007F]t";
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
    
    gr(final HashMap b, final boolean d, final ConditionVariable a, final ConditionVariable c) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        final ArrayList<bi> list = new ArrayList<bi>();
    Label_0066:
        while (true) {
            try {
                final Iterator<bi> iterator = this.b.values().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        break Label_0066;
                    }
                    final bi bi = iterator.next();
                    Label_0062: {
                        if (bi == null) {
                            break Label_0062;
                        }
                        try {
                            list.add(bi);
                            if (i) {
                                App.a(0, list, true, this.d, this.a, this.c);
                                return;
                            }
                            continue;
                        }
                        catch (Exception ex) {
                            throw ex;
                        }
                    }
                }
            }
            catch (Exception ex2) {
                Log.e(gr.z[1] + this.d + gr.z[0] + ex2.toString());
                continue Label_0066;
            }
            break;
        }
    }
}
