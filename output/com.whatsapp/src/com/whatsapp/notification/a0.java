// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import java.lang.reflect.Field;
import android.content.Intent;

class a0 extends ao
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        String s = "\t6)\u0012S\u0003,-\u0012S\u0003,-TQ\u0007<";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '>';
                        break;
                    }
                    case 0: {
                        c2 = 'j';
                        break;
                    }
                    case 1: {
                        c2 = 'Y';
                        break;
                    }
                    case 2: {
                        c2 = 'D';
                        break;
                    }
                    case 3: {
                        c2 = '<';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\t6)\u0012S\u0003,-\u0012S\u0003,-PW\u001e<";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\t6)\u0012S\u0003,-\u0012S\u0003,-TQ\u0007<v";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000b7 NQ\u0003=j]N\u001aw\tUK\u0003\u0017+HW\f0']J\u00036*";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0007<7O_\r<\u0007SK\u0004-";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000b7 NQ\u0003=jUP\u001e<*H\u0010\u000b:0UQ\u0004w\u0005ln&\u0010\u0007}j#\u0016\ncs/\n\u0017}y/\u0006\u0011lz+\r\u0001";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000b7 NQ\u0003=jUP\u001e<*H\u0010\u000f!0N_D,4X_\u001e<\u001b]N\u001a5-__\u001e0+Ra\t6)LQ\u0004<*Ha\u00048)Y";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000b7 NQ\u0003=jUP\u001e<*H\u0010\u000f!0N_D,4X_\u001e<\u001b]N\u001a5-__\u001e0+Ra\u0007<7O_\r<\u001bH[\u0012-";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public void a(final int n) {
        try {
            final Object instance = Class.forName(a0.z[3]).newInstance();
            final Field declaredField = instance.getClass().getDeclaredField(a0.z[4]);
            declaredField.setAccessible(true);
            declaredField.set(instance, n);
        }
        catch (Exception ex2) {
            while (true) {
                final Intent intent = new Intent(a0.z[5]);
                while (true) {
                    try {
                        intent.putExtra(a0.z[6], this.a() + "/" + this.d());
                        final String s = a0.z[7];
                        if (n == 0) {
                            final Serializable value = "";
                            intent.putExtra(s, String.valueOf(value));
                            this.c().sendBroadcast(intent);
                            return;
                        }
                    }
                    catch (Exception ex) {
                        throw ex;
                    }
                    final Serializable value = n;
                    continue;
                }
            }
        }
    }
    
    @Override
    public List b() {
        return Arrays.asList(a0.z[1], a0.z[0], a0.z[2]);
    }
}
