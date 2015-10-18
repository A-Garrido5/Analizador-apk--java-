// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import android.content.Context;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.whatsapp.protocol.bi;
import java.util.Locale;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicReference;
import java.nio.channels.FileChannel;

public class Log
{
    private static FileChannel a;
    private static final Object b;
    private static int c;
    private static boolean d;
    private static AtomicReference e;
    private static final int f;
    private static AtomicReference g;
    private static final SimpleDateFormat h;
    private static File i;
    private static int j;
    private static File k;
    public static boolean l;
    private static final Object m;
    private static final Object n;
    private static final int o;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[77];
        String s = "\u0001i\u000617";
        int n2 = -1;
        String[] array = z2;
        int n3 = 0;
        String intern = null;
    Label_1957:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n4 = 0; i > n4; ++n4) {
                final char c = charArray[n4];
                char c2 = '\0';
                switch (n4 % 5) {
                    default: {
                        c2 = '\u0017';
                        break;
                    }
                    case 0: {
                        c2 = 'M';
                        break;
                    }
                    case 1: {
                        c2 = '%';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = 't';
                        break;
                    }
                }
                charArray[n4] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n3] = intern;
                    n3 = 1;
                    array = z2;
                    s = "\u0001i\u000617";
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n3] = intern;
                    n3 = 2;
                    s = "\u007f\u000bhF9|\u0012o";
                    n2 = 1;
                    array = z2;
                    continue;
                }
                case 1: {
                    array[n3] = intern;
                    n3 = 3;
                    s = "\u0001i\u0006#7";
                    n2 = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n3] = intern;
                    n3 = 4;
                    s = "\u0001i\u0006#7";
                    n2 = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n3] = intern;
                    s = "p\u0018dI7!J>\u0012~!@y\u0018r;@5I";
                    n2 = 4;
                    n3 = 5;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n3] = intern;
                    n3 = 6;
                    array = z2;
                    s = ":M8\u0000d,U)Z{\"B";
                    n2 = 5;
                    continue;
                }
                case 5: {
                    array[n3] = intern;
                    n3 = 7;
                    s = "\u0001i\u0006=7";
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n3] = intern;
                    n3 = 8;
                    s = "m\u0018dI*";
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n3] = intern;
                    n3 = 9;
                    s = "mQ#I";
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n3] = intern;
                    n3 = 10;
                    s = ":M8\u0000d,U)Zc U";
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n3] = intern;
                    n3 = 11;
                    s = "\u0001J>\u0007";
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n3] = intern;
                    n3 = 12;
                    s = "\bW+\u001bew\u0005";
                    n2 = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n3] = intern;
                    n3 = 13;
                    s = "\u001aM8\u0000d\fU)";
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n3] = intern;
                    n3 = 14;
                    s = "\u001aM8\u0000d\fU)";
                    n2 = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n3] = intern;
                    n3 = 15;
                    s = "\u001aM8\u0000d\fU)";
                    n2 = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n3] = intern;
                    n3 = 16;
                    s = "\u001aM8\u0000d\fU)";
                    n2 = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n3] = intern;
                    n3 = 17;
                    s = "\u001aM8\u0000d\fU)";
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n3] = intern;
                    n3 = 18;
                    s = "n\u0006zTu(B0\u001a7>Q8\u0017|mQ+\u0015t(\u0005";
                    n2 = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n3] = intern;
                    n3 = 19;
                    s = "!J>Tv=U5\u001dt,Q0\u001bymF6\u001ac(]-Tv!W<\u0015s4\u00058\u0007d$B7\u0011s";
                    n2 = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n3] = intern;
                    n3 = 20;
                    s = "+H*\u00138>Q8\u0000b>\u001f";
                    n2 = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n3] = intern;
                    n3 = 21;
                    s = "bB+\u0004H,F-\u001dx#\u001f";
                    n2 = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n3] = intern;
                    n3 = 22;
                    s = "bW4\u0000:>W:N";
                    n2 = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n3] = intern;
                    s = "bQ \u0004rw";
                    n2 = 22;
                    n3 = 23;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n3] = intern;
                    n3 = 24;
                    array = z2;
                    s = "\u0001i\u000617";
                    n2 = 23;
                    continue;
                }
                case 23: {
                    array[n3] = intern;
                    n3 = 25;
                    s = "\u0001i\u000607";
                    n2 = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n3] = intern;
                    n3 = 26;
                    s = "\u0001i\u000657";
                    n2 = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n3] = intern;
                    n3 = 27;
                    s = "\u0001i\u0006=7";
                    n2 = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n3] = intern;
                    n3 = 28;
                    s = "\u0001i\u0006\"7";
                    n2 = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n3] = intern;
                    n3 = 29;
                    s = "\u0004K/\u0015{$Ay\u0018x*\u00055\u0011a(Iy";
                    n2 = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n3] = intern;
                    n3 = 30;
                    s = "\u0001i\u0006#7";
                    n2 = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n3] = intern;
                    n3 = 31;
                    s = "\u0001i\u0006#7";
                    n2 = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n3] = intern;
                    n3 = 32;
                    s = "\u0001i\u0006#7";
                    n2 = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n3] = intern;
                    n3 = 33;
                    s = "mQ#I";
                    n2 = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n3] = intern;
                    n3 = 34;
                    s = "p\u0018dI7!J>\u0012~!@y\u0002r?V0\u001byp\u0017wE%c\u0014nB7!@/\u0011{p";
                    n2 = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n3] = intern;
                    n3 = 35;
                    s = "m\u0018dI*";
                    n2 = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n3] = intern;
                    n3 = 36;
                    s = "\u0001i\u0006=7";
                    n2 = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n3] = intern;
                    s = "\u0001i\u0006=7";
                    n2 = 36;
                    n3 = 37;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n3] = intern;
                    n3 = 38;
                    array = z2;
                    s = "\u0001i\u0006=7";
                    n2 = 37;
                    continue;
                }
                case 37: {
                    array[n3] = intern;
                    n3 = 39;
                    s = "\u0001i\u0006=7";
                    n2 = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n3] = intern;
                    n3 = 40;
                    s = "\u0001i\u0006=7";
                    n2 = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n3] = intern;
                    n3 = 41;
                    s = "\u0001i\u0006=7";
                    n2 = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n3] = intern;
                    n3 = 42;
                    s = "\u0001i\u0006=7";
                    n2 = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n3] = intern;
                    n3 = 43;
                    s = "\u007f\u000bhF9|\u0012oYv?HnYg!D Ye(I<\u0015d(";
                    n2 = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n3] = intern;
                    n3 = 44;
                    s = "#D-\u001da(";
                    n2 = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n3] = intern;
                    n3 = 45;
                    s = "\u0010\u0005";
                    n2 = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n3] = intern;
                    n3 = 46;
                    s = "n\u0006zTr#Ay\u0007c,F2Tc?D:\u0011";
                    n2 = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n3] = intern;
                    n3 = 47;
                    s = "\u0001i\u0006=7";
                    n2 = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n3] = intern;
                    n3 = 48;
                    s = "\u0001i\u0006=7";
                    n2 = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n3] = intern;
                    n3 = 49;
                    s = "\u0001i\u000617";
                    n2 = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n3] = intern;
                    n3 = 50;
                    s = "\u0001i\u000617";
                    n2 = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n3] = intern;
                    n3 = 51;
                    s = "\u0001i\u000617";
                    n2 = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n3] = intern;
                    n3 = 52;
                    s = "\u0001i\u000617";
                    n2 = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n3] = intern;
                    n3 = 53;
                    s = "\u0001i\u000607";
                    n2 = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n3] = intern;
                    n3 = 54;
                    s = "\u0001i\u000607";
                    n2 = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n3] = intern;
                    n3 = 55;
                    s = "\u0001i\u0006#7";
                    n2 = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n3] = intern;
                    n3 = 56;
                    s = "\u0001i\u0006#7";
                    n2 = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n3] = intern;
                    n3 = 57;
                    s = "\u0001i\u0006#7";
                    n2 = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n3] = intern;
                    n3 = 58;
                    s = "\u0001i\u0006#7";
                    n2 = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n3] = intern;
                    n3 = 59;
                    s = "\u0001i\u0006\"7";
                    n2 = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n3] = intern;
                    n3 = 60;
                    s = "\u0001i\u000617";
                    n2 = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n3] = intern;
                    n3 = 61;
                    s = "\u0001i\u000617";
                    n2 = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n3] = intern;
                    n3 = 62;
                    s = "}\u0015";
                    n2 = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n3] = intern;
                    n3 = 63;
                    s = "\u0004j\u001c\ft(U-\u001dx#\u00056\u001a7";
                    n2 = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n3] = intern;
                    n3 = 64;
                    s = "\u001aM8\u0000d\fU)";
                    n2 = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n3] = intern;
                    n3 = 65;
                    s = "\u0001i\u0006=7";
                    n2 = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n3] = intern;
                    n3 = 66;
                    s = "\u0001i\u0006=7";
                    n2 = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n3] = intern;
                    n3 = 67;
                    s = "c\u000bw";
                    n2 = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n3] = intern;
                    n3 = 68;
                    s = "c\u000bw";
                    n2 = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n3] = intern;
                    n3 = 69;
                    s = "\u0001i\u000657";
                    n2 = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n3] = intern;
                    n3 = 70;
                    s = "\fV*\u0011e9L6\u001a7\u000bD0\u0018r)";
                    n2 = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n3] = intern;
                    n3 = 71;
                    s = "\u0001i\u0006#7";
                    n2 = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n3] = intern;
                    n3 = 72;
                    s = "\u0001i\u0006#7";
                    n2 = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n3] = intern;
                    n3 = 73;
                    s = "\u0001i\u000617";
                    n2 = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n3] = intern;
                    n3 = 74;
                    s = "\u0001i\u000617";
                    n2 = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n3] = intern;
                    n3 = 75;
                    s = "\u0001i\u000657";
                    n2 = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n3] = intern;
                    n3 = 76;
                    s = "4\\ \r:\u0000ht\u0010smm\u0011Nz \u001f*\u00079\u001ev\nT";
                    n2 = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    break Label_1957;
                }
            }
        }
        array[n3] = intern;
        z = z2;
        f = "\n".length();
        h = new SimpleDateFormat(Log.z[76], Locale.US);
        o = Log.h.toPattern().length();
        Log.e = new AtomicReference();
        Log.g = new bt("D");
        Log.k = null;
        Log.i = null;
        Log.c = 5;
        Log.j = 0;
        Log.d = false;
        Log.a = null;
        n = new Object();
        m = new Object();
        b = new Object();
    }
    
    public static String a() {
        return Log.z[46];
    }
    
    public static String a(final bi bi) {
        final StringBuilder sb = new StringBuilder();
        try {
            sb.append(Log.z[20]).append(bi.c).append(Log.z[23]).append(bi.I);
            if (bi.a.a.contains("-")) {
                sb.append(Log.z[21]).append(bi.L);
            }
            sb.append(Log.z[22]).append(bi.t).append(" ").append(bi.a.toString());
            return sb.toString();
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private static String a(final String s, final String s2) {
        return a(a(s, new StringBuilder(s2))).toString();
    }
    
    private static String a(final String s, final String s2, final String s3) {
        return a(a(s, new StringBuilder(s2.length() + Log.f + s3.length()).append(s2).append("\n").append(s3))).toString();
    }
    
    private static String a(final Throwable t) {
        if (t == null) {
            return "";
        }
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            if (Log.z[2] != null) {
                printWriter.println(e());
            }
            t.printStackTrace(printWriter);
            printWriter.println(a());
            return stringWriter.toString();
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private static StringBuilder a(final String s, final StringBuilder sb) {
        final long id = Thread.currentThread().getId();
        final String name = Thread.currentThread().getName();
        final String string = s + Log.g.get() + " ";
        if (Log.c < 5) {
            return new StringBuilder(4 + (20 + string.length() + name.length() + sb.length())).append(string).append('[').append(id).append(':').append(name).append(Log.z[45]).append((CharSequence)sb);
        }
        String s2 = "";
        String value = "";
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 5;
        while (i < stackTrace.length) {
            final StackTraceElement stackTraceElement = stackTrace[i];
            try {
                if (stackTraceElement.isNativeMethod()) {
                    if (i == 5) {
                        s2 = stackTraceElement.getFileName();
                        value = Log.z[44];
                    }
                    ++i;
                    continue;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            s2 = stackTraceElement.getFileName();
            value = String.valueOf(stackTraceElement.getLineNumber());
            break;
        }
        return new StringBuilder(1 + (1 + (1 + (1 + (20 + (1 + string.length())) + name.length()) + s2.length()) + value.length()) + sb.length()).append(string).append('[').append(id).append(':').append(name).append(']').append(s2).append(':').append(value).append(' ').append((CharSequence)sb);
    }
    
    private static StringBuilder a(final StringBuilder p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/util/Log.g:()Z
        //     3: ifeq            328
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: getstatic       com/whatsapp/util/Log.o:I
        //    13: aload_0        
        //    14: invokevirtual   java/lang/StringBuilder.length:()I
        //    17: iadd           
        //    18: getstatic       com/whatsapp/util/Log.f:I
        //    21: iadd           
        //    22: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    25: astore_1       
        //    26: invokestatic    java/util/Calendar.getInstance:()Ljava/util/Calendar;
        //    29: astore_2       
        //    30: aload_1        
        //    31: aload_2        
        //    32: iconst_1       
        //    33: invokevirtual   java/util/Calendar.get:(I)I
        //    36: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    39: bipush          45
        //    41: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    44: pop            
        //    45: aload_2        
        //    46: iconst_2       
        //    47: invokevirtual   java/util/Calendar.get:(I)I
        //    50: bipush          9
        //    52: if_icmpge       62
        //    55: aload_1        
        //    56: bipush          48
        //    58: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    61: pop            
        //    62: aload_1        
        //    63: iconst_1       
        //    64: aload_2        
        //    65: iconst_2       
        //    66: invokevirtual   java/util/Calendar.get:(I)I
        //    69: iadd           
        //    70: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    73: bipush          45
        //    75: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    78: pop            
        //    79: aload_2        
        //    80: iconst_5       
        //    81: invokevirtual   java/util/Calendar.get:(I)I
        //    84: bipush          10
        //    86: if_icmpge       96
        //    89: aload_1        
        //    90: bipush          48
        //    92: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    95: pop            
        //    96: aload_1        
        //    97: aload_2        
        //    98: iconst_5       
        //    99: invokevirtual   java/util/Calendar.get:(I)I
        //   102: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   105: bipush          32
        //   107: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   110: pop            
        //   111: aload_2        
        //   112: bipush          11
        //   114: invokevirtual   java/util/Calendar.get:(I)I
        //   117: bipush          10
        //   119: if_icmpge       129
        //   122: aload_1        
        //   123: bipush          48
        //   125: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   128: pop            
        //   129: aload_1        
        //   130: aload_2        
        //   131: bipush          11
        //   133: invokevirtual   java/util/Calendar.get:(I)I
        //   136: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   139: bipush          58
        //   141: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   144: pop            
        //   145: aload_2        
        //   146: bipush          12
        //   148: invokevirtual   java/util/Calendar.get:(I)I
        //   151: bipush          10
        //   153: if_icmpge       163
        //   156: aload_1        
        //   157: bipush          48
        //   159: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   162: pop            
        //   163: aload_1        
        //   164: aload_2        
        //   165: bipush          12
        //   167: invokevirtual   java/util/Calendar.get:(I)I
        //   170: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   173: bipush          58
        //   175: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   178: pop            
        //   179: aload_2        
        //   180: bipush          13
        //   182: invokevirtual   java/util/Calendar.get:(I)I
        //   185: bipush          10
        //   187: if_icmpge       197
        //   190: aload_1        
        //   191: bipush          48
        //   193: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   196: pop            
        //   197: aload_1        
        //   198: aload_2        
        //   199: bipush          13
        //   201: invokevirtual   java/util/Calendar.get:(I)I
        //   204: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   207: bipush          46
        //   209: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   212: pop            
        //   213: aload_2        
        //   214: bipush          14
        //   216: invokevirtual   java/util/Calendar.get:(I)I
        //   219: bipush          10
        //   221: if_icmpge       358
        //   224: aload_1        
        //   225: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   228: bipush          62
        //   230: aaload         
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: pop            
        //   235: aload_1        
        //   236: aload_2        
        //   237: bipush          14
        //   239: invokevirtual   java/util/Calendar.get:(I)I
        //   242: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   245: bipush          32
        //   247: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   250: pop            
        //   251: aload_1        
        //   252: aload_0        
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
        //   256: ldc             "\n"
        //   258: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   261: pop            
        //   262: aload_1        
        //   263: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   266: invokevirtual   java/lang/String.getBytes:()[B
        //   269: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //   272: astore          19
        //   274: getstatic       com/whatsapp/util/Log.n:Ljava/lang/Object;
        //   277: astore          22
        //   279: aload           22
        //   281: monitorenter   
        //   282: aconst_null    
        //   283: astore          23
        //   285: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //   288: invokevirtual   java/nio/channels/FileChannel.lock:()Ljava/nio/channels/FileLock;
        //   291: astore          23
        //   293: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //   296: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //   299: invokevirtual   java/nio/channels/FileChannel.size:()J
        //   302: invokevirtual   java/nio/channels/FileChannel.position:(J)Ljava/nio/channels/FileChannel;
        //   305: pop            
        //   306: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //   309: aload           19
        //   311: invokevirtual   java/nio/channels/FileChannel.write:(Ljava/nio/ByteBuffer;)I
        //   314: pop            
        //   315: aload           23
        //   317: ifnull          325
        //   320: aload           23
        //   322: invokevirtual   java/nio/channels/FileLock.release:()V
        //   325: aload           22
        //   327: monitorexit    
        //   328: aload_0        
        //   329: areturn        
        //   330: astore_3       
        //   331: aload_3        
        //   332: athrow         
        //   333: astore          5
        //   335: aload           5
        //   337: athrow         
        //   338: astore          7
        //   340: aload           7
        //   342: athrow         
        //   343: astore          9
        //   345: aload           9
        //   347: athrow         
        //   348: astore          11
        //   350: aload           11
        //   352: athrow         
        //   353: astore          13
        //   355: aload           13
        //   357: athrow         
        //   358: aload_2        
        //   359: bipush          14
        //   361: invokevirtual   java/util/Calendar.get:(I)I
        //   364: bipush          100
        //   366: if_icmpge       235
        //   369: aload_1        
        //   370: bipush          48
        //   372: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   375: pop            
        //   376: goto            235
        //   379: astore          15
        //   381: aload           15
        //   383: athrow         
        //   384: astore          24
        //   386: aload           23
        //   388: ifnull          396
        //   391: aload           23
        //   393: invokevirtual   java/nio/channels/FileLock.release:()V
        //   396: aload           24
        //   398: athrow         
        //   399: astore          25
        //   401: aload           22
        //   403: monitorexit    
        //   404: aload           25
        //   406: athrow         
        //   407: astore          20
        //   409: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   412: bipush          64
        //   414: aaload         
        //   415: new             Ljava/lang/StringBuilder;
        //   418: dup            
        //   419: invokespecial   java/lang/StringBuilder.<init>:()V
        //   422: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   425: bipush          63
        //   427: aaload         
        //   428: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   431: aload_0        
        //   432: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   435: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   438: aload           20
        //   440: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   443: pop            
        //   444: aload_0        
        //   445: areturn        
        //   446: astore          26
        //   448: aload           26
        //   450: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  30     62     330    333    Ljava/io/IOException;
        //  62     96     333    338    Ljava/io/IOException;
        //  96     129    338    343    Ljava/io/IOException;
        //  129    163    343    348    Ljava/io/IOException;
        //  163    197    348    353    Ljava/io/IOException;
        //  197    235    353    358    Ljava/io/IOException;
        //  274    282    407    446    Ljava/io/IOException;
        //  285    315    384    451    Any
        //  320    325    399    407    Any
        //  325    328    399    407    Any
        //  358    376    379    384    Ljava/io/IOException;
        //  391    396    446    451    Ljava/io/IOException;
        //  391    396    399    407    Any
        //  396    399    399    407    Any
        //  401    404    399    407    Any
        //  404    407    407    446    Ljava/io/IOException;
        //  448    451    399    407    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 230, Size: 230
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void a(final int c) {
        Log.c = c;
        a(Log.z[36], Log.z[34] + Log.c + Log.z[33] + Log.j + Log.z[35]);
    }
    
    private static void a(final int p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_0        
        //     1: ifeq            9
        //     4: iload_0        
        //     5: iconst_5       
        //     6: if_icmpne       24
        //     9: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    12: bipush          17
        //    14: aaload         
        //    15: aload_1        
        //    16: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    19: pop            
        //    20: return         
        //    21: astore_2       
        //    22: aload_2        
        //    23: athrow         
        //    24: iload_0        
        //    25: iconst_4       
        //    26: if_icmpne       46
        //    29: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    32: bipush          14
        //    34: aaload         
        //    35: aload_1        
        //    36: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    39: pop            
        //    40: return         
        //    41: astore          14
        //    43: aload           14
        //    45: athrow         
        //    46: iload_0        
        //    47: iconst_3       
        //    48: if_icmpne       68
        //    51: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    54: bipush          15
        //    56: aaload         
        //    57: aload_1        
        //    58: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    61: pop            
        //    62: return         
        //    63: astore          12
        //    65: aload           12
        //    67: athrow         
        //    68: iload_0        
        //    69: iconst_2       
        //    70: if_icmpne       90
        //    73: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    76: bipush          16
        //    78: aaload         
        //    79: aload_1        
        //    80: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    83: pop            
        //    84: return         
        //    85: astore          10
        //    87: aload           10
        //    89: athrow         
        //    90: iload_0        
        //    91: iconst_1       
        //    92: if_icmpne       20
        //    95: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    98: bipush          13
        //   100: aaload         
        //   101: aload_1        
        //   102: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   105: pop            
        //   106: getstatic       com/whatsapp/App.aV:I
        //   109: istore          7
        //   111: iload           7
        //   113: iconst_3       
        //   114: if_icmpne       20
        //   117: new             Ljava/lang/StringBuilder;
        //   120: dup            
        //   121: invokespecial   java/lang/StringBuilder.<init>:()V
        //   124: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   127: bipush          12
        //   129: aaload         
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: astore          8
        //   135: aload_1        
        //   136: invokevirtual   java/lang/String.length:()I
        //   139: istore          9
        //   141: iload           9
        //   143: bipush          50
        //   145: if_icmpgt       171
        //   148: aload           8
        //   150: aload_1        
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   157: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //   160: return         
        //   161: astore          4
        //   163: aload           4
        //   165: athrow         
        //   166: astore          5
        //   168: aload           5
        //   170: athrow         
        //   171: new             Ljava/lang/StringBuilder;
        //   174: dup            
        //   175: invokespecial   java/lang/StringBuilder.<init>:()V
        //   178: aload_1        
        //   179: iconst_0       
        //   180: bipush          47
        //   182: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: ldc_w           "\u2026"
        //   191: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   194: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   197: astore_1       
        //   198: goto            148
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  9      20     21     24     Ljava/lang/IllegalStateException;
        //  29     40     41     46     Ljava/lang/IllegalStateException;
        //  51     62     63     68     Ljava/lang/IllegalStateException;
        //  73     84     85     90     Ljava/lang/IllegalStateException;
        //  95     111    161    166    Ljava/lang/IllegalStateException;
        //  117    141    166    171    Ljava/lang/IllegalStateException;
        //  163    166    166    171    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void a(final Context context) {
        try {
            if (!Log.e.compareAndSet(null, context)) {
                throw new IllegalStateException(Log.z[19]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public static void a(final String s) {
        a(Log.z[75], s);
    }
    
    public static void a(final String p0, final Throwable p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.c:I
        //     3: istore          5
        //     5: iload           5
        //     7: iconst_5       
        //     8: if_icmpne       39
        //    11: iconst_3       
        //    12: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    15: bipush          66
        //    17: aaload         
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    23: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    26: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    29: getstatic       com/whatsapp/util/Log.l:Z
        //    32: istore          7
        //    34: iload           7
        //    36: ifeq            61
        //    39: getstatic       com/whatsapp/util/Log.c:I
        //    42: iconst_3       
        //    43: if_icmplt       61
        //    46: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    49: bipush          65
        //    51: aaload         
        //    52: aload_0        
        //    53: aload_1        
        //    54: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    57: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    60: pop            
        //    61: return         
        //    62: astore_2       
        //    63: aload_2        
        //    64: athrow         
        //    65: astore_3       
        //    66: aload_3        
        //    67: athrow         
        //    68: astore          4
        //    70: aload           4
        //    72: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      62     65     Ljava/lang/IllegalStateException;
        //  11     34     65     68     Ljava/lang/IllegalStateException;
        //  39     61     68     73     Ljava/lang/IllegalStateException;
        //  63     65     65     68     Ljava/lang/IllegalStateException;
        //  66     68     68     73     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 39, Size: 39
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void a(final String p0, final Throwable p1, final Object[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/util/Log.c:I
        //     7: istore          11
        //     9: iload           11
        //    11: iconst_5       
        //    12: if_icmpne       73
        //    15: aload_1        
        //    16: ifnull          48
        //    19: iconst_2       
        //    20: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    23: bipush          55
        //    25: aaload         
        //    26: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    29: aload_0        
        //    30: aload_2        
        //    31: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    34: aload_1        
        //    35: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    38: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    41: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    44: iload_3        
        //    45: ifeq            132
        //    48: iconst_2       
        //    49: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    52: bipush          57
        //    54: aaload         
        //    55: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    58: aload_0        
        //    59: aload_2        
        //    60: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    63: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    66: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    69: iload_3        
        //    70: ifeq            132
        //    73: getstatic       com/whatsapp/util/Log.c:I
        //    76: istore          12
        //    78: iload           12
        //    80: iconst_2       
        //    81: if_icmplt       132
        //    84: aload_1        
        //    85: ifnull          114
        //    88: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    91: bipush          56
        //    93: aaload         
        //    94: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    97: aload_0        
        //    98: aload_2        
        //    99: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   102: aload_1        
        //   103: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   106: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   109: pop            
        //   110: iload_3        
        //   111: ifeq            132
        //   114: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   117: bipush          58
        //   119: aaload         
        //   120: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   123: aload_0        
        //   124: aload_2        
        //   125: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   128: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   131: pop            
        //   132: return         
        //   133: astore          4
        //   135: aload           4
        //   137: athrow         
        //   138: astore          5
        //   140: aload           5
        //   142: athrow         
        //   143: astore          6
        //   145: aload           6
        //   147: athrow         
        //   148: astore          7
        //   150: aload           7
        //   152: athrow         
        //   153: astore          8
        //   155: aload           8
        //   157: athrow         
        //   158: astore          9
        //   160: aload           9
        //   162: athrow         
        //   163: astore          10
        //   165: aload           10
        //   167: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      9      133    143    Ljava/lang/IllegalStateException;
        //  19     44     143    148    Ljava/lang/IllegalStateException;
        //  48     69     148    153    Ljava/lang/IllegalStateException;
        //  73     78     153    163    Ljava/lang/IllegalStateException;
        //  88     110    163    168    Ljava/lang/IllegalStateException;
        //  114    132    163    168    Ljava/lang/IllegalStateException;
        //  135    138    138    143    Ljava/lang/IllegalStateException;
        //  140    143    143    148    Ljava/lang/IllegalStateException;
        //  145    148    148    153    Ljava/lang/IllegalStateException;
        //  150    153    153    163    Ljava/lang/IllegalStateException;
        //  155    158    158    163    Ljava/lang/IllegalStateException;
        //  160    163    163    168    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 86, Size: 86
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static String b() {
        return Log.z[43];
    }
    
    static String b(final String s, final String s2) {
        return a(s, s2);
    }
    
    public static ArrayList b(final int n) {
        return bl.b(Log.k, n);
    }
    
    public static void b(final int n, final String s) {
        if (n > Log.c) {
            return;
        }
        final String a = a(c(n), s);
        try {
            if (Log.c == 5) {
                d(n, a);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public static void b(final String s, final Throwable t) {
        while (true) {
            try {
                if (Log.c == 5) {
                    d(1, a(Log.z[1], s, a(t)));
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (Log.c >= 1) {
                    a(Log.z[0], s, a(t));
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    public static void b(final String p0, final Throwable p1, final Object[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/util/Log.c:I
        //     7: istore          11
        //     9: iload           11
        //    11: iconst_5       
        //    12: if_icmpne       73
        //    15: aload_1        
        //    16: ifnull          48
        //    19: iconst_1       
        //    20: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    23: bipush          49
        //    25: aaload         
        //    26: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    29: aload_0        
        //    30: aload_2        
        //    31: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    34: aload_1        
        //    35: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    38: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    41: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    44: iload_3        
        //    45: ifeq            132
        //    48: iconst_1       
        //    49: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    52: bipush          51
        //    54: aaload         
        //    55: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    58: aload_0        
        //    59: aload_2        
        //    60: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    63: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    66: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    69: iload_3        
        //    70: ifeq            132
        //    73: getstatic       com/whatsapp/util/Log.c:I
        //    76: istore          12
        //    78: iload           12
        //    80: iconst_1       
        //    81: if_icmplt       132
        //    84: aload_1        
        //    85: ifnull          114
        //    88: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    91: bipush          50
        //    93: aaload         
        //    94: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    97: aload_0        
        //    98: aload_2        
        //    99: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   102: aload_1        
        //   103: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   106: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   109: pop            
        //   110: iload_3        
        //   111: ifeq            132
        //   114: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   117: bipush          52
        //   119: aaload         
        //   120: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   123: aload_0        
        //   124: aload_2        
        //   125: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   128: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   131: pop            
        //   132: return         
        //   133: astore          4
        //   135: aload           4
        //   137: athrow         
        //   138: astore          5
        //   140: aload           5
        //   142: athrow         
        //   143: astore          6
        //   145: aload           6
        //   147: athrow         
        //   148: astore          7
        //   150: aload           7
        //   152: athrow         
        //   153: astore          8
        //   155: aload           8
        //   157: athrow         
        //   158: astore          9
        //   160: aload           9
        //   162: athrow         
        //   163: astore          10
        //   165: aload           10
        //   167: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      9      133    143    Ljava/lang/IllegalStateException;
        //  19     44     143    148    Ljava/lang/IllegalStateException;
        //  48     69     148    153    Ljava/lang/IllegalStateException;
        //  73     78     153    163    Ljava/lang/IllegalStateException;
        //  88     110    163    168    Ljava/lang/IllegalStateException;
        //  114    132    163    168    Ljava/lang/IllegalStateException;
        //  135    138    138    143    Ljava/lang/IllegalStateException;
        //  140    143    143    148    Ljava/lang/IllegalStateException;
        //  145    148    148    153    Ljava/lang/IllegalStateException;
        //  150    153    153    163    Ljava/lang/IllegalStateException;
        //  155    158    158    163    Ljava/lang/IllegalStateException;
        //  160    163    163    168    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 86, Size: 86
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void b(final Throwable t) {
        while (true) {
            try {
                if (Log.c == 5) {
                    d(1, a(Log.z[61], a(t)));
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (Log.c >= 1) {
                    a(Log.z[60], a(t));
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    public static void b(final boolean b) {
        if (b) {
            return;
        }
        try {
            a(Log.z[69], Log.z[70]);
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public static File c() {
        return bl.a(Log.k);
    }
    
    private static String c(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException(Log.z[29] + n);
            }
            case 0: {
                try {
                    return Log.z[26];
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            case 1: {
                return Log.z[24];
            }
            case 2: {
                return Log.z[30];
            }
            case 3: {
                return Log.z[27];
            }
            case 4: {
                return Log.z[25];
            }
            case 5: {
                return Log.z[28];
            }
        }
    }
    
    static void c(final int n, final String s) {
        d(n, s);
    }
    
    public static void c(final String p0, final Throwable p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.c:I
        //     3: istore          5
        //     5: iload           5
        //     7: iconst_5       
        //     8: if_icmpne       39
        //    11: iconst_2       
        //    12: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    15: bipush          32
        //    17: aaload         
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    23: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    26: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    29: getstatic       com/whatsapp/util/Log.l:Z
        //    32: istore          7
        //    34: iload           7
        //    36: ifeq            61
        //    39: getstatic       com/whatsapp/util/Log.c:I
        //    42: iconst_2       
        //    43: if_icmplt       61
        //    46: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    49: bipush          31
        //    51: aaload         
        //    52: aload_0        
        //    53: aload_1        
        //    54: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    57: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    60: pop            
        //    61: return         
        //    62: astore_2       
        //    63: aload_2        
        //    64: athrow         
        //    65: astore_3       
        //    66: aload_3        
        //    67: athrow         
        //    68: astore          4
        //    70: aload           4
        //    72: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      62     65     Ljava/lang/IllegalStateException;
        //  11     34     65     68     Ljava/lang/IllegalStateException;
        //  39     61     68     73     Ljava/lang/IllegalStateException;
        //  63     65     65     68     Ljava/lang/IllegalStateException;
        //  66     68     68     73     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 39, Size: 39
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void c(final String p0, final Throwable p1, final Object[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/util/Log.c:I
        //     7: istore          11
        //     9: iload           11
        //    11: iconst_5       
        //    12: if_icmpne       73
        //    15: aload_1        
        //    16: ifnull          48
        //    19: iconst_3       
        //    20: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    23: bipush          42
        //    25: aaload         
        //    26: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    29: aload_0        
        //    30: aload_2        
        //    31: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    34: aload_1        
        //    35: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    38: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    41: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    44: iload_3        
        //    45: ifeq            132
        //    48: iconst_3       
        //    49: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    52: bipush          40
        //    54: aaload         
        //    55: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    58: aload_0        
        //    59: aload_2        
        //    60: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    63: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    66: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    69: iload_3        
        //    70: ifeq            132
        //    73: getstatic       com/whatsapp/util/Log.c:I
        //    76: istore          12
        //    78: iload           12
        //    80: iconst_3       
        //    81: if_icmplt       132
        //    84: aload_1        
        //    85: ifnull          114
        //    88: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    91: bipush          39
        //    93: aaload         
        //    94: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    97: aload_0        
        //    98: aload_2        
        //    99: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   102: aload_1        
        //   103: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   106: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   109: pop            
        //   110: iload_3        
        //   111: ifeq            132
        //   114: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   117: bipush          41
        //   119: aaload         
        //   120: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   123: aload_0        
        //   124: aload_2        
        //   125: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   128: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   131: pop            
        //   132: return         
        //   133: astore          4
        //   135: aload           4
        //   137: athrow         
        //   138: astore          5
        //   140: aload           5
        //   142: athrow         
        //   143: astore          6
        //   145: aload           6
        //   147: athrow         
        //   148: astore          7
        //   150: aload           7
        //   152: athrow         
        //   153: astore          8
        //   155: aload           8
        //   157: athrow         
        //   158: astore          9
        //   160: aload           9
        //   162: athrow         
        //   163: astore          10
        //   165: aload           10
        //   167: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      9      133    143    Ljava/lang/IllegalStateException;
        //  19     44     143    148    Ljava/lang/IllegalStateException;
        //  48     69     148    153    Ljava/lang/IllegalStateException;
        //  73     78     153    163    Ljava/lang/IllegalStateException;
        //  88     110    163    168    Ljava/lang/IllegalStateException;
        //  114    132    163    168    Ljava/lang/IllegalStateException;
        //  135    138    138    143    Ljava/lang/IllegalStateException;
        //  140    143    143    148    Ljava/lang/IllegalStateException;
        //  145    148    148    153    Ljava/lang/IllegalStateException;
        //  150    153    153    163    Ljava/lang/IllegalStateException;
        //  155    158    158    163    Ljava/lang/IllegalStateException;
        //  160    163    163    168    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 86, Size: 86
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void c(final Throwable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.c:I
        //     3: istore          4
        //     5: iload           4
        //     7: iconst_5       
        //     8: if_icmpne       37
        //    11: iconst_2       
        //    12: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    15: iconst_4       
        //    16: aaload         
        //    17: aload_0        
        //    18: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    21: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    24: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    27: getstatic       com/whatsapp/util/Log.l:Z
        //    30: istore          6
        //    32: iload           6
        //    34: ifeq            57
        //    37: getstatic       com/whatsapp/util/Log.c:I
        //    40: iconst_2       
        //    41: if_icmplt       57
        //    44: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    47: iconst_3       
        //    48: aaload         
        //    49: aload_0        
        //    50: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    53: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    56: pop            
        //    57: return         
        //    58: astore_1       
        //    59: aload_1        
        //    60: athrow         
        //    61: astore_2       
        //    62: aload_2        
        //    63: athrow         
        //    64: astore_3       
        //    65: aload_3        
        //    66: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      58     61     Ljava/lang/IllegalStateException;
        //  11     32     61     64     Ljava/lang/IllegalStateException;
        //  37     57     64     67     Ljava/lang/IllegalStateException;
        //  59     61     61     64     Ljava/lang/IllegalStateException;
        //  62     64     64     67     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 37, Size: 37
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static int d() {
        return Log.c;
    }
    
    private static void d(final int n, String string) {
        while (string.length() > 4000) {
            final String substring = string.substring(0, 3997);
            string = Log.z[68] + string.substring(3997);
            a(n, substring + Log.z[67]);
        }
        a(n, string);
    }
    
    public static void d(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.c:I
        //     3: istore          4
        //     5: iload           4
        //     7: iconst_5       
        //     8: if_icmpne       35
        //    11: iconst_4       
        //    12: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    15: bipush          54
        //    17: aaload         
        //    18: aload_0        
        //    19: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    22: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    25: getstatic       com/whatsapp/util/Log.l:Z
        //    28: istore          6
        //    30: iload           6
        //    32: ifeq            53
        //    35: getstatic       com/whatsapp/util/Log.c:I
        //    38: iconst_4       
        //    39: if_icmplt       53
        //    42: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    45: bipush          53
        //    47: aaload         
        //    48: aload_0        
        //    49: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    52: pop            
        //    53: return         
        //    54: astore_1       
        //    55: aload_1        
        //    56: athrow         
        //    57: astore_2       
        //    58: aload_2        
        //    59: athrow         
        //    60: astore_3       
        //    61: aload_3        
        //    62: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      54     57     Ljava/lang/IllegalStateException;
        //  11     30     57     60     Ljava/lang/IllegalStateException;
        //  35     53     60     63     Ljava/lang/IllegalStateException;
        //  55     57     57     60     Ljava/lang/IllegalStateException;
        //  58     60     60     63     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 35, Size: 35
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void d(final Throwable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.c:I
        //     3: istore          4
        //     5: iload           4
        //     7: iconst_5       
        //     8: if_icmpne       38
        //    11: iconst_3       
        //    12: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    15: bipush          47
        //    17: aaload         
        //    18: aload_0        
        //    19: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    22: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    25: invokestatic    com/whatsapp/util/Log.d:(ILjava/lang/String;)V
        //    28: getstatic       com/whatsapp/util/Log.l:Z
        //    31: istore          6
        //    33: iload           6
        //    35: ifeq            59
        //    38: getstatic       com/whatsapp/util/Log.c:I
        //    41: iconst_3       
        //    42: if_icmplt       59
        //    45: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //    48: bipush          48
        //    50: aaload         
        //    51: aload_0        
        //    52: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    55: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    58: pop            
        //    59: return         
        //    60: astore_1       
        //    61: aload_1        
        //    62: athrow         
        //    63: astore_2       
        //    64: aload_2        
        //    65: athrow         
        //    66: astore_3       
        //    67: aload_3        
        //    68: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      60     63     Ljava/lang/IllegalStateException;
        //  11     33     63     66     Ljava/lang/IllegalStateException;
        //  38     59     66     69     Ljava/lang/IllegalStateException;
        //  61     63     63     66     Ljava/lang/IllegalStateException;
        //  64     66     66     69     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 37, Size: 37
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static String e() {
        return Log.z[18] + b();
    }
    
    public static void e(final String s) {
        while (true) {
            try {
                if (Log.c == 5) {
                    d(1, a(Log.z[74], s));
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (Log.c >= 1) {
                    a(Log.z[73], s);
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    private static ArrayList f() {
        return ba.b(Log.k, Log.i);
    }
    
    private static boolean g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.d:Z
        //     3: ifeq            29
        //     6: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //     9: astore          15
        //    11: aload           15
        //    13: ifnull          29
        //    16: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //    19: invokevirtual   java/nio/channels/FileChannel.isOpen:()Z
        //    22: istore          16
        //    24: iload           16
        //    26: ifne            339
        //    29: getstatic       com/whatsapp/util/Log.n:Ljava/lang/Object;
        //    32: astore_2       
        //    33: aload_2        
        //    34: monitorenter   
        //    35: getstatic       com/whatsapp/util/Log.d:Z
        //    38: istore          4
        //    40: iload           4
        //    42: ifeq            84
        //    45: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //    48: ifnull          84
        //    51: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //    54: invokevirtual   java/nio/channels/FileChannel.isOpen:()Z
        //    57: istore          14
        //    59: iload           14
        //    61: ifeq            84
        //    64: aload_2        
        //    65: monitorexit    
        //    66: iconst_1       
        //    67: ireturn        
        //    68: astore_0       
        //    69: aload_0        
        //    70: athrow         
        //    71: astore_1       
        //    72: aload_1        
        //    73: athrow         
        //    74: astore          13
        //    76: aload           13
        //    78: athrow         
        //    79: astore_3       
        //    80: aload_2        
        //    81: monitorexit    
        //    82: aload_3        
        //    83: athrow         
        //    84: getstatic       com/whatsapp/util/Log.e:Ljava/util/concurrent/atomic/AtomicReference;
        //    87: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    90: checkcast       Landroid/content/Context;
        //    93: astore          5
        //    95: aload           5
        //    97: ifnonnull       104
        //   100: aload_2        
        //   101: monitorexit    
        //   102: iconst_0       
        //   103: ireturn        
        //   104: new             Ljava/io/File;
        //   107: dup            
        //   108: aload           5
        //   110: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //   113: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   116: bipush          11
        //   118: aaload         
        //   119: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   122: astore          6
        //   124: aload           6
        //   126: invokevirtual   java/io/File.exists:()Z
        //   129: ifne            159
        //   132: aload           6
        //   134: invokevirtual   java/io/File.mkdirs:()Z
        //   137: pop            
        //   138: aload           6
        //   140: invokevirtual   java/io/File.exists:()Z
        //   143: istore          12
        //   145: iload           12
        //   147: ifne            159
        //   150: aload_2        
        //   151: monitorexit    
        //   152: iconst_0       
        //   153: ireturn        
        //   154: astore          7
        //   156: aload           7
        //   158: athrow         
        //   159: new             Ljava/io/File;
        //   162: dup            
        //   163: aload           6
        //   165: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   168: bipush          6
        //   170: aaload         
        //   171: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   174: putstatic       com/whatsapp/util/Log.k:Ljava/io/File;
        //   177: new             Ljava/io/File;
        //   180: dup            
        //   181: aload           6
        //   183: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   186: bipush          10
        //   188: aaload         
        //   189: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   192: putstatic       com/whatsapp/util/Log.i:Ljava/io/File;
        //   195: new             Ljava/io/FileOutputStream;
        //   198: dup            
        //   199: getstatic       com/whatsapp/util/Log.k:Ljava/io/File;
        //   202: iconst_1       
        //   203: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;Z)V
        //   206: invokevirtual   java/io/FileOutputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //   209: putstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //   212: new             Ljava/io/PrintStream;
        //   215: dup            
        //   216: new             Lcom/whatsapp/util/be;
        //   219: dup            
        //   220: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   223: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //   226: invokestatic    java/nio/channels/Channels.newOutputStream:(Ljava/nio/channels/WritableByteChannel;)Ljava/io/OutputStream;
        //   229: invokespecial   com/whatsapp/util/be.<init>:(Ljava/io/OutputStream;Ljava/io/OutputStream;)V
        //   232: iconst_1       
        //   233: invokespecial   java/io/PrintStream.<init>:(Ljava/io/OutputStream;Z)V
        //   236: invokestatic    java/lang/System.setErr:(Ljava/io/PrintStream;)V
        //   239: iconst_1       
        //   240: putstatic       com/whatsapp/util/Log.d:Z
        //   243: invokestatic    java/util/Calendar.getInstance:()Ljava/util/Calendar;
        //   246: astore          9
        //   248: aload           9
        //   250: bipush          15
        //   252: invokevirtual   java/util/Calendar.get:(I)I
        //   255: aload           9
        //   257: bipush          16
        //   259: invokevirtual   java/util/Calendar.get:(I)I
        //   262: iadd           
        //   263: ldc_w           60000
        //   266: idiv           
        //   267: putstatic       com/whatsapp/util/Log.j:I
        //   270: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   273: bipush          7
        //   275: aaload         
        //   276: new             Ljava/lang/StringBuilder;
        //   279: dup            
        //   280: invokespecial   java/lang/StringBuilder.<init>:()V
        //   283: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   286: iconst_5       
        //   287: aaload         
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: getstatic       com/whatsapp/util/Log.c:I
        //   294: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   297: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   300: bipush          9
        //   302: aaload         
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: getstatic       com/whatsapp/util/Log.j:I
        //   309: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   312: getstatic       com/whatsapp/util/Log.z:[Ljava/lang/String;
        //   315: bipush          8
        //   317: aaload         
        //   318: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   321: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   324: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   327: pop            
        //   328: aload_2        
        //   329: monitorexit    
        //   330: goto            339
        //   333: astore          8
        //   335: aload_2        
        //   336: monitorexit    
        //   337: iconst_0       
        //   338: ireturn        
        //   339: iconst_1       
        //   340: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      11     68     71     Ljava/io/FileNotFoundException;
        //  16     24     71     74     Ljava/io/FileNotFoundException;
        //  35     40     79     84     Any
        //  45     59     74     79     Ljava/io/FileNotFoundException;
        //  45     59     79     84     Any
        //  64     66     79     84     Any
        //  69     71     71     74     Ljava/io/FileNotFoundException;
        //  76     79     79     84     Any
        //  80     82     79     84     Any
        //  84     95     79     84     Any
        //  100    102    79     84     Any
        //  104    124    79     84     Any
        //  124    145    154    159    Ljava/io/FileNotFoundException;
        //  124    145    79     84     Any
        //  150    152    79     84     Any
        //  156    159    79     84     Any
        //  159    195    79     84     Any
        //  195    212    333    339    Ljava/io/FileNotFoundException;
        //  195    212    79     84     Any
        //  212    330    79     84     Any
        //  335    337    79     84     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 164, Size: 164
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void h() {
        bl.a(Log.k, 3);
    }
    
    public static File i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_0       
        //     4: invokestatic    com/whatsapp/util/Log.g:()Z
        //     7: istore_1       
        //     8: aconst_null    
        //     9: astore_2       
        //    10: iload_1        
        //    11: ifeq            89
        //    14: getstatic       com/whatsapp/util/Log.b:Ljava/lang/Object;
        //    17: astore_3       
        //    18: aload_3        
        //    19: monitorenter   
        //    20: getstatic       com/whatsapp/util/Log.m:Ljava/lang/Object;
        //    23: astore          5
        //    25: aload           5
        //    27: monitorenter   
        //    28: invokestatic    com/whatsapp/util/Log.f:()Ljava/util/ArrayList;
        //    31: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    34: astore          12
        //    36: aconst_null    
        //    37: astore          9
        //    39: aload           12
        //    41: invokeinterface java/util/Iterator.hasNext:()Z
        //    46: ifeq            81
        //    49: aload           12
        //    51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    56: checkcast       Ljava/io/File;
        //    59: astore          13
        //    61: getstatic       com/whatsapp/util/Log.k:Ljava/io/File;
        //    64: aload           13
        //    66: invokestatic    com/whatsapp/util/bl.b:(Ljava/io/File;Ljava/io/File;)Ljava/io/File;
        //    69: astore          9
        //    71: aload           13
        //    73: invokevirtual   java/io/File.delete:()Z
        //    76: pop            
        //    77: iload_0        
        //    78: ifeq            39
        //    81: aload           9
        //    83: astore_2       
        //    84: aload           5
        //    86: monitorexit    
        //    87: aload_3        
        //    88: monitorexit    
        //    89: aload_2        
        //    90: areturn        
        //    91: astore          10
        //    93: aconst_null    
        //    94: astore          9
        //    96: aload           10
        //    98: astore          11
        //   100: aload           11
        //   102: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   105: aload           9
        //   107: astore_2       
        //   108: goto            84
        //   111: aload           8
        //   113: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   116: goto            81
        //   119: astore          6
        //   121: aload           5
        //   123: monitorexit    
        //   124: aload           6
        //   126: athrow         
        //   127: astore          4
        //   129: aload_3        
        //   130: monitorexit    
        //   131: aload           4
        //   133: athrow         
        //   134: astore          8
        //   136: goto            111
        //   139: astore          11
        //   141: goto            100
        //   144: astore          7
        //   146: aload           7
        //   148: astore          8
        //   150: aconst_null    
        //   151: astore          9
        //   153: goto            111
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  20     28     127    134    Any
        //  28     36     91     100    Ljava/io/IOException;
        //  28     36     144    156    Ljava/lang/SecurityException;
        //  28     36     119    127    Any
        //  39     77     139    144    Ljava/io/IOException;
        //  39     77     134    139    Ljava/lang/SecurityException;
        //  39     77     119    127    Any
        //  84     87     119    127    Any
        //  87     89     127    134    Any
        //  100    105    119    127    Any
        //  111    116    119    127    Any
        //  121    124    119    127    Any
        //  124    127    127    134    Any
        //  129    131    127    134    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void i(final String s) {
        while (true) {
            try {
                if (Log.c == 5) {
                    d(3, a(Log.z[37], s));
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (Log.c >= 3) {
                    a(Log.z[38], s);
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    public static boolean j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/util/Log.g:()Z
        //     3: istore_0       
        //     4: iconst_0       
        //     5: istore_1       
        //     6: iload_0        
        //     7: ifeq            53
        //    10: getstatic       com/whatsapp/util/Log.m:Ljava/lang/Object;
        //    13: astore_2       
        //    14: aload_2        
        //    15: monitorenter   
        //    16: getstatic       com/whatsapp/util/Log.n:Ljava/lang/Object;
        //    19: astore          4
        //    21: aload           4
        //    23: monitorenter   
        //    24: getstatic       com/whatsapp/util/Log.a:Ljava/nio/channels/FileChannel;
        //    27: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    30: getstatic       com/whatsapp/util/Log.k:Ljava/io/File;
        //    33: getstatic       com/whatsapp/util/Log.i:Ljava/io/File;
        //    36: invokestatic    com/whatsapp/util/bl.a:(Ljava/io/File;Ljava/io/File;)Z
        //    39: istore_1       
        //    40: iconst_0       
        //    41: putstatic       com/whatsapp/util/Log.d:Z
        //    44: invokestatic    com/whatsapp/util/Log.g:()Z
        //    47: pop            
        //    48: aload           4
        //    50: monitorexit    
        //    51: aload_2        
        //    52: monitorexit    
        //    53: iload_1        
        //    54: ireturn        
        //    55: astore          6
        //    57: aload           4
        //    59: monitorexit    
        //    60: aload_2        
        //    61: monitorexit    
        //    62: iconst_0       
        //    63: ireturn        
        //    64: astore_3       
        //    65: aload_2        
        //    66: monitorexit    
        //    67: aload_3        
        //    68: athrow         
        //    69: astore          5
        //    71: aload           4
        //    73: monitorexit    
        //    74: aload           5
        //    76: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  16     24     64     69     Any
        //  24     30     55     64     Ljava/io/IOException;
        //  24     30     69     77     Any
        //  30     51     69     77     Any
        //  51     53     64     69     Any
        //  57     60     69     77     Any
        //  60     62     64     69     Any
        //  65     67     64     69     Any
        //  71     74     69     77     Any
        //  74     77     64     69     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void v(final String s) {
        try {
            if (Log.c >= 5) {
                d(5, a(Log.z[59], s));
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public static void w(final String s) {
        while (true) {
            try {
                if (Log.c == 5) {
                    d(2, a(Log.z[71], s));
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (Log.c >= 2) {
                    a(Log.z[72], s);
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
}
