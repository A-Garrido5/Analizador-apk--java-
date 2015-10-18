// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.Iterator;
import java.util.Map;

public class a7
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0015\u0015oWFA\u0015";
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
                        c2 = '\'';
                        break;
                    }
                    case 0: {
                        c2 = '5';
                        break;
                    }
                    case 1: {
                        c2 = '5';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "FA.\u0003B\b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0015A&\u0013\u001a";
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
    }
    
    public static String a() {
        final boolean l = Log.l;
        final Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        final StringBuilder sb = new StringBuilder("\n");
        for (final Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            a(entry.getKey(), entry.getValue(), sb);
            if (l) {
                break;
            }
        }
        return sb.toString();
    }
    
    public static String a(final Thread thread) {
        final StringBuilder sb = new StringBuilder();
        a(thread, thread.getStackTrace(), sb);
        return sb.toString();
    }
    
    private static void a(final Thread thread, final StackTraceElement[] array, final StringBuilder sb) {
        final boolean l = Log.l;
        sb.append(a7.z[1]).append(thread.getState()).append(a7.z[2]).append(thread.getId()).append('\n');
        sb.append(Log.e()).append('\n');
        final int length = array.length;
        int i = 0;
        while (i < length) {
            sb.append(a7.z[0]).append(array[i].toString()).append('\n');
            ++i;
            if (l) {
                break;
            }
        }
        sb.append(Log.a()).append('\n');
    }
}
