// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.HashSet;
import com.whatsapp.protocol.c2;

public class z implements Runnable, c2
{
    private static final HashSet a;
    private static final String[] z;
    public String b;
    private final Runnable c;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0004lHt1\u0001lEf-\tqB{\"\u001afXe*\u0006pN}$\u0006gGp7Gp^v&\rpX";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
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
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = '\u0003';
                        break;
                    }
                    case 2: {
                        c2 = '+';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0004lHt1\u0001lEf-\tqB{\"\u001afXe*\u0006pN}$\u0006gGp7GwBx \u0007v_";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0004lHt1\u0001lEf-\tqB{\"\u001afXe*\u0006pN}$\u0006gGp7GfYg*\u001a#";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a = new HashSet();
    }
    
    public z(final String b) {
        this.c = new cg(this);
        this.b = b;
        Log.b(com.whatsapp.z.a.add(b));
        App.aq.a5().postDelayed(this.c, 20000L);
    }
    
    public void a() {
        Log.e(com.whatsapp.z.z[1]);
        com.whatsapp.z.a.remove(this.b);
    }
    
    @Override
    public void a(final int n) {
        Log.e(com.whatsapp.z.z[2] + n);
        App.aq.a5().removeCallbacks(this.c);
        com.whatsapp.z.a.remove(this.b);
    }
    
    @Override
    public void run() {
        Log.i(com.whatsapp.z.z[0]);
        App.aq.a5().removeCallbacks(this.c);
        com.whatsapp.z.a.remove(this.b);
    }
}
