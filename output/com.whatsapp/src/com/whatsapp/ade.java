// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import android.app.Notification;
import android.support.v4.app.NotificationManagerCompat;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat$Builder;
import java.util.Iterator;
import android.util.Pair;
import java.util.ArrayList;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.app.Activity;
import com.whatsapp.util.b6;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import android.content.Context;
import java.util.Date;

public class ade
{
    static int a;
    static long b;
    static long c;
    private static final int[] d;
    private static final int[] e;
    static long f;
    private static final aw_ g;
    static boolean h;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[38];
        String s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0016:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
                while (true) {
                    Label_1082: {
                        if (length > n3) {
                            break Label_1082;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                n2 = 1;
                                array = z2;
                                s = "68]b$-8\\x\u00124>";
                                n = 0;
                                continue Label_0016;
                            }
                            case 0: {
                                array[n2] = intern;
                                n2 = 2;
                                s = ";:My\u000e4-qb\u0002*<";
                                n = 1;
                                array = z2;
                                continue Label_0016;
                            }
                            case 1: {
                                array[n2] = intern;
                                s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
                                n = 2;
                                n2 = 3;
                                array = z2;
                                continue Label_0016;
                            }
                            case 2: {
                                array[n2] = intern;
                                s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
                                n2 = 4;
                                array = z2;
                                n = 3;
                                continue Label_0016;
                            }
                            case 3: {
                                array[n2] = intern;
                                s = ";:My\u000e4-qb\u0002*<";
                                n2 = 5;
                                array = z2;
                                n = 4;
                                continue Label_0016;
                            }
                            case 4: {
                                array[n2] = intern;
                                s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
                                n2 = 6;
                                array = z2;
                                n = 5;
                                continue Label_0016;
                            }
                            case 5: {
                                array[n2] = intern;
                                n2 = 7;
                                array = z2;
                                s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
                                n = 6;
                                continue Label_0016;
                            }
                            case 6: {
                                array[n2] = intern;
                                n2 = 8;
                                s = "46Z\u007f\u001d#\nKd\r3:KS\u0003.<@r\u001e>y\u00036\u000e)<\\6\u00155-Gp\u001298Z\u007f\u00144";
                                n = 7;
                                array = z2;
                                continue Label_0016;
                            }
                            case 7: {
                                array[n2] = intern;
                                n2 = 9;
                                s = "\u001a*\u0000a\u0013;-]w\u000b*w@s\u000f";
                                n = 8;
                                array = z2;
                                continue Label_0016;
                            }
                            case 8: {
                                array[n2] = intern;
                                n2 = 10;
                                s = "46@s";
                                n = 9;
                                array = z2;
                                continue Label_0016;
                            }
                            case 9: {
                                array[n2] = intern;
                                n2 = 11;
                                s = "PS";
                                n = 10;
                                array = z2;
                                continue Label_0016;
                            }
                            case 10: {
                                array[n2] = intern;
                                n2 = 12;
                                s = ";:My\u000e4-\u0001s\u0003*0\\w\u000f36@6";
                                n = 11;
                                array = z2;
                                continue Label_0016;
                            }
                            case 11: {
                                array[n2] = intern;
                                n2 = 13;
                                s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
                                n = 12;
                                array = z2;
                                continue Label_0016;
                            }
                            case 12: {
                                array[n2] = intern;
                                n2 = 14;
                                s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
                                n = 13;
                                array = z2;
                                continue Label_0016;
                            }
                            case 13: {
                                array[n2] = intern;
                                n2 = 15;
                                s = "PS";
                                n = 14;
                                array = z2;
                                continue Label_0016;
                            }
                            case 14: {
                                array[n2] = intern;
                                n2 = 16;
                                s = "\r1Ob\b\u001b)^V\bt.Fw\u000f)8^fU4<Z";
                                n = 15;
                                array = z2;
                                continue Label_0016;
                            }
                            case 15: {
                                array[n2] = intern;
                                n2 = 17;
                                s = "PS";
                                n = 16;
                                array = z2;
                                continue Label_0016;
                            }
                            case 16: {
                                array[n2] = intern;
                                n2 = 18;
                                s = ";:My\u000e4-\u0001d\u001e;=\u0001p\u001a35\u000e";
                                n = 17;
                                array = z2;
                                continue Label_0016;
                            }
                            case 17: {
                                array[n2] = intern;
                                n2 = 19;
                                s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
                                n = 18;
                                array = z2;
                                continue Label_0016;
                            }
                            case 18: {
                                array[n2] = intern;
                                n2 = 20;
                                s = "z7KaF";
                                n = 19;
                                array = z2;
                                continue Label_0016;
                            }
                            case 19: {
                                array[n2] = intern;
                                n2 = 21;
                                s = ";:My\u000e4-\u0001s\u0003*0\\w\u000f36@9\t55Bt\u001a92\u000ey\u0017>d";
                                n = 20;
                                array = z2;
                                continue Label_0016;
                            }
                            case 20: {
                                array[n2] = intern;
                                n2 = 22;
                                s = "z7KaF";
                                n = 21;
                                array = z2;
                                continue Label_0016;
                            }
                            case 21: {
                                array[n2] = intern;
                                n2 = 23;
                                s = ";:My\u000e4-\u0001s\u0003*0\\w\u000f36@9\u001e\"-Kx\u001f?=\u000ey\u0017>d";
                                n = 22;
                                array = z2;
                                continue Label_0016;
                            }
                            case 22: {
                                array[n2] = intern;
                                n2 = 24;
                                s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
                                n = 23;
                                array = z2;
                                continue Label_0016;
                            }
                            case 23: {
                                array[n2] = intern;
                                n2 = 25;
                                s = ";:My\u000e4-\u0001z\u001a)-qa\u001a(7qb\u00127<\u000e";
                                n = 24;
                                array = z2;
                                continue Label_0016;
                            }
                            case 24: {
                                array[n2] = intern;
                                n2 = 26;
                                s = "?!^\u007f\t;-Gy\u0015\u0005=Ob\u001e";
                                n = 25;
                                array = z2;
                                continue Label_0016;
                            }
                            case 25: {
                                array[n2] = intern;
                                n2 = 27;
                                s = "96C8\f28Ze\u001a*)qf\t??Kd\u001e4:Ke";
                                n = 26;
                                array = z2;
                                continue Label_0016;
                            }
                            case 26: {
                                array[n2] = intern;
                                n2 = 28;
                                s = ")6Hb\f;+KI\u001e\")Gd\u001a.0Ax$68]b$-8\\x\u001e>";
                                n = 27;
                                array = z2;
                                continue Label_0016;
                            }
                            case 27: {
                                array[n2] = intern;
                                n2 = 29;
                                s = ")6Hb\f;+K9\u001e\")Gd\u001a.0AxT),^f\t?*]9In1";
                                n = 28;
                                array = z2;
                                continue Label_0016;
                            }
                            case 28: {
                                array[n2] = intern;
                                n2 = 30;
                                s = ")6Hb\f;+K9\u001e\")Gd\u001a.0AxT<8Gz\u001e>\u0006]w\r?\u0006Bw\b.\u0006Yw\t4";
                                n = 29;
                                array = z2;
                                continue Label_0016;
                            }
                            case 29: {
                                array[n2] = intern;
                                n2 = 31;
                                s = ")6Hb\f;+KI\u001e\")Gd\u001a.0Ax$68]b$-8\\x\u001e>";
                                n = 30;
                                array = z2;
                                continue Label_0016;
                            }
                            case 30: {
                                array[n2] = intern;
                                n2 = 32;
                                s = "68]b$-8\\x\u00124>";
                                n = 31;
                                array = z2;
                                continue Label_0016;
                            }
                            case 31: {
                                array[n2] = intern;
                                n2 = 33;
                                s = ";:My\u000e4-\u0001z\u001a)-qa\u001a(7qb\u00127<\u000e";
                                n = 32;
                                array = z2;
                                continue Label_0016;
                            }
                            case 32: {
                                array[n2] = intern;
                                n2 = 34;
                                s = "68]b$-8\\x\u00124>";
                                n = 33;
                                array = z2;
                                continue Label_0016;
                            }
                            case 33: {
                                array[n2] = intern;
                                n2 = 35;
                                s = ";:My\u000e4-\u0001x\u0014.0HoV*8GrV<6\\;\u001857Zw\u0018.*\u0001{\u001e)*Oq\u001ez";
                                n = 34;
                                array = z2;
                                continue Label_0016;
                            }
                            case 34: {
                                array[n2] = intern;
                                n2 = 36;
                                s = "68]b$-8\\x\u00124>";
                                n = 35;
                                array = z2;
                                continue Label_0016;
                            }
                            case 35: {
                                array[n2] = intern;
                                n2 = 37;
                                s = "68]b$-8\\x\u00124>";
                                n = 36;
                                array = z2;
                                continue Label_0016;
                            }
                            case 36: {
                                break;
                            }
                        }
                        while (true) {
                            array[n2] = intern;
                            z = z2;
                            while (true) {
                                Label_1214: {
                                    try {
                                        d = new int[] { 1, 2, 3, 5, 14 };
                                        switch (App.aV) {
                                            default: {
                                                e = new int[] { 1, 2, 3 };
                                                break;
                                            }
                                            case 0: {
                                                e = new int[] { 1, 2, 3, 5, 14, 30 };
                                                break;
                                            }
                                            case 1: {
                                                break Label_1214;
                                            }
                                        }
                                        ade.a = -1;
                                        g = new aw_(null);
                                        return;
                                        char c = '\0';
                                        Label_1145: {
                                            c = 'Z';
                                        }
                                        Label_1128: {
                                            break Label_1128;
                                            Label_1124:
                                            c = '{';
                                            break Label_1128;
                                            Label_1152:
                                            c = 'Y';
                                            break Label_1128;
                                            Label_1166:
                                            c = '\u0016';
                                            break Label_1128;
                                            Label_1159:
                                            c = '.';
                                        }
                                        final char c2;
                                        charArray[n3] = (char)(c ^ c2);
                                        ++n3;
                                        break;
                                        c2 = charArray[n3];
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@2ddb7ce8, n3 % 5)
                                    catch (NumberFormatException ex) {
                                        throw ex;
                                    }
                                }
                                e = new int[] { 1, 2, 3, 7 };
                                continue;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    private static int a(final long n, final Date date) {
        return 1 + (int)((date.getTime() - n) / 86400000L);
    }
    
    public static int a(final Context context) {
        int i = 0;
        final boolean j = App.I;
        final SharedPreferences sharedPreferences = context.getSharedPreferences(ade.z[27], 0);
        final long long1 = sharedPreferences.getLong(ade.z[31], 0L);
        final long currentTimeMillis = System.currentTimeMillis();
        Label_0066: {
            if (86400000L + long1 <= currentTimeMillis) {
                break Label_0066;
            }
            try {
                Log.i(ade.z[29]);
                return -1;
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        final Date a9 = App.a9();
        final int a10 = a(currentTimeMillis, a9);
        final int a11 = a(long1, a9);
        final int[] e = ade.e;
        while (i < e.length) {
            final int n = e[i];
            if (a10 <= n && a11 > n) {
                final SharedPreferences$Editor edit = sharedPreferences.edit();
                try {
                    edit.putLong(ade.z[28], currentTimeMillis);
                    if (!edit.commit()) {
                        Log.e(ade.z[30]);
                    }
                    return a10;
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
            ++i;
            if (j) {
                return -1;
            }
        }
        return -1;
    }
    
    public static int a(final boolean b) {
        final boolean i = App.I;
        final long a = a(ade.z[0]);
        if (a != 0L) {
            final long n = a - System.currentTimeMillis();
            final long a2 = a(ade.z[1]);
            if (n < 0L) {
                if (b) {
                    return 0;
                }
                try {
                    if (!b6.a(a2)) {
                        return 0;
                    }
                    return -1;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
            }
            final int n2 = 1 + (int)(n / 86400000L);
            final int[] d = ade.d;
            int n4;
            for (int length = d.length, j = 0; j < length; j = n4) {
                final int n3 = d[j];
                if (n2 == n3) {
                    try {
                        if (!b6.a(a2)) {
                            return n3;
                        }
                    }
                    catch (NumberFormatException ex2) {
                        throw ex2;
                    }
                }
                n4 = j + 1;
                if (i) {
                    break;
                }
            }
        }
        return -1;
    }
    
    static long a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: new             Ljava/io/File;
        //     5: dup            
        //     6: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //     9: invokevirtual   com/whatsapp/App.getFilesDir:()Ljava/io/File;
        //    12: aload_0        
        //    13: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    16: astore_1       
        //    17: aload_1        
        //    18: invokevirtual   java/io/File.exists:()Z
        //    21: istore_3       
        //    22: iload_3        
        //    23: ifeq            117
        //    26: aconst_null    
        //    27: astore          4
        //    29: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    32: bipush          19
        //    34: aaload         
        //    35: aload_0        
        //    36: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    39: istore          8
        //    41: aconst_null    
        //    42: astore          4
        //    44: iload           8
        //    46: ifeq            166
        //    49: getstatic       com/whatsapp/ade.c:J
        //    52: lstore          9
        //    54: lload           9
        //    56: lconst_0       
        //    57: lcmp           
        //    58: ifeq            126
        //    61: getstatic       com/whatsapp/ade.c:J
        //    64: lstore          14
        //    66: aconst_null    
        //    67: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    70: aload_0        
        //    71: monitorexit    
        //    72: lload           14
        //    74: lreturn        
        //    75: astore          6
        //    77: aload           6
        //    79: athrow         
        //    80: astore          7
        //    82: new             Ljava/lang/StringBuilder;
        //    85: dup            
        //    86: invokespecial   java/lang/StringBuilder.<init>:()V
        //    89: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    92: bipush          18
        //    94: aaload         
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: aload           7
        //   100: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   109: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   112: aload           4
        //   114: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   117: aload_0        
        //   118: monitorexit    
        //   119: lconst_0       
        //   120: lreturn        
        //   121: astore_2       
        //   122: aload_0        
        //   123: monitorexit    
        //   124: aload_2        
        //   125: athrow         
        //   126: new             Ljava/io/ObjectInputStream;
        //   129: dup            
        //   130: new             Ljava/io/FileInputStream;
        //   133: dup            
        //   134: aload_1        
        //   135: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   138: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //   141: astore          11
        //   143: aload           11
        //   145: invokevirtual   java/io/ObjectInputStream.readLong:()J
        //   148: putstatic       com/whatsapp/ade.c:J
        //   151: getstatic       com/whatsapp/ade.c:J
        //   154: lstore          12
        //   156: aload           11
        //   158: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   161: aload_0        
        //   162: monitorexit    
        //   163: lload           12
        //   165: lreturn        
        //   166: getstatic       com/whatsapp/ade.f:J
        //   169: lconst_0       
        //   170: lcmp           
        //   171: istore          16
        //   173: aconst_null    
        //   174: astore          4
        //   176: iload           16
        //   178: ifeq            195
        //   181: getstatic       com/whatsapp/ade.f:J
        //   184: lstore          17
        //   186: aconst_null    
        //   187: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   190: aload_0        
        //   191: monitorexit    
        //   192: lload           17
        //   194: lreturn        
        //   195: new             Ljava/io/ObjectInputStream;
        //   198: dup            
        //   199: new             Ljava/io/FileInputStream;
        //   202: dup            
        //   203: aload_1        
        //   204: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   207: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //   210: astore          19
        //   212: aload           19
        //   214: invokevirtual   java/io/ObjectInputStream.readLong:()J
        //   217: putstatic       com/whatsapp/ade.f:J
        //   220: getstatic       com/whatsapp/ade.f:J
        //   223: lstore          20
        //   225: aload           19
        //   227: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   230: aload_0        
        //   231: monitorexit    
        //   232: lload           20
        //   234: lreturn        
        //   235: aload           4
        //   237: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   240: aload           5
        //   242: athrow         
        //   243: astore          5
        //   245: aload           11
        //   247: astore          4
        //   249: goto            235
        //   252: astore          5
        //   254: aload           19
        //   256: astore          4
        //   258: goto            235
        //   261: astore          7
        //   263: aload           11
        //   265: astore          4
        //   267: goto            82
        //   270: astore          7
        //   272: aload           19
        //   274: astore          4
        //   276: goto            82
        //   279: astore          5
        //   281: goto            235
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      22     121    126    Any
        //  29     41     75     80     Ljava/io/IOException;
        //  29     41     279    284    Any
        //  49     54     75     80     Ljava/io/IOException;
        //  49     54     279    284    Any
        //  61     66     80     82     Ljava/io/IOException;
        //  61     66     279    284    Any
        //  66     72     121    126    Any
        //  77     80     80     82     Ljava/io/IOException;
        //  77     80     279    284    Any
        //  82     112    279    284    Any
        //  112    117    121    126    Any
        //  117    119    121    126    Any
        //  122    124    121    126    Any
        //  126    143    80     82     Ljava/io/IOException;
        //  126    143    279    284    Any
        //  143    156    261    270    Ljava/io/IOException;
        //  143    156    243    252    Any
        //  156    163    121    126    Any
        //  166    173    80     82     Ljava/io/IOException;
        //  166    173    279    284    Any
        //  181    186    80     82     Ljava/io/IOException;
        //  181    186    279    284    Any
        //  186    192    121    126    Any
        //  195    212    80     82     Ljava/io/IOException;
        //  195    212    279    284    Any
        //  212    225    270    279    Ljava/io/IOException;
        //  212    225    252    261    Any
        //  225    232    121    126    Any
        //  235    243    121    126    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0117:
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
    
    public static Dialog a(final Activity activity) {
        final int a = a(System.currentTimeMillis(), App.a9());
        return new AlertDialog$Builder((Context)activity).setTitle(2131231752).setMessage(String.format(App.C.a(2131296299, a), a)).setPositiveButton(2131231875, (DialogInterface$OnClickListener)new a_v(activity)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new aat(activity)).create();
    }
    
    public static String a(final long n, final long n2, final boolean b) {
        boolean b2 = true;
        if (n != n2 && (n2 < 4444444444000L || n < 4444444444000L)) {
            String s;
            if (n2 < n) {
                s = yt.b();
                if (b) {
                    final long n3 = lcmp(n2, 4444444444000L);
                    boolean b3 = false;
                    if (n3 >= 0) {
                        b3 = b2;
                    }
                    a(b2, b3);
                    return s;
                }
            }
            else {
                if (n2 >= 4444444444000L) {
                    return App.aq.getString(2131231108);
                }
                if (n <= System.currentTimeMillis()) {
                    return yt.d();
                }
                s = yt.a();
                if (b) {
                    if (n2 < 4444444444000L) {
                        b2 = false;
                    }
                    a(false, b2);
                }
            }
            return s;
        }
        return null;
    }
    
    public static String a(final Activity p0, final String p1, final String p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //     4: istore          21
        //     6: iload           21
        //     8: istore          5
        //    10: iload           5
        //    12: i2f            
        //    13: ldc_w           365.0
        //    16: fdiv           
        //    17: f2d            
        //    18: invokestatic    java/lang/Math.floor:(D)D
        //    21: d2i            
        //    22: istore          6
        //    24: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    27: bipush          10
        //    29: aaload         
        //    30: aload_1        
        //    31: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    34: istore          8
        //    36: iload           8
        //    38: ifeq            191
        //    41: iload           6
        //    43: ifle            179
        //    46: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //    49: ldc_w           2131296260
        //    52: iload           6
        //    54: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //    57: astore          19
        //    59: iconst_1       
        //    60: anewarray       Ljava/lang/Object;
        //    63: astore          20
        //    65: aload           20
        //    67: iconst_0       
        //    68: iload           6
        //    70: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    73: aastore        
        //    74: aload           19
        //    76: aload           20
        //    78: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    81: astore          11
        //    83: iload_3        
        //    84: ifeq            163
        //    87: new             Ljava/lang/StringBuilder;
        //    90: dup            
        //    91: invokespecial   java/lang/StringBuilder.<init>:()V
        //    94: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    97: bipush          11
        //    99: aaload         
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: astore          12
        //   105: iconst_1       
        //   106: anewarray       Ljava/lang/Object;
        //   109: astore          13
        //   111: aload           13
        //   113: iconst_0       
        //   114: aload_0        
        //   115: getstatic       com/whatsapp/ade.c:J
        //   118: invokestatic    com/whatsapp/util/b6.g:(Landroid/content/Context;J)Ljava/lang/String;
        //   121: aastore        
        //   122: aload           12
        //   124: aload_0        
        //   125: ldc_w           2131231105
        //   128: aload           13
        //   130: invokevirtual   android/app/Activity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   136: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   139: astore          14
        //   141: new             Ljava/lang/StringBuilder;
        //   144: dup            
        //   145: invokespecial   java/lang/StringBuilder.<init>:()V
        //   148: aload           11
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: aload           14
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   158: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   161: astore          11
        //   163: aload           11
        //   165: areturn        
        //   166: astore          4
        //   168: iconst_0       
        //   169: istore          5
        //   171: goto            10
        //   174: astore          7
        //   176: aload           7
        //   178: athrow         
        //   179: aload_0        
        //   180: ldc_w           2131230775
        //   183: invokevirtual   android/app/Activity.getString:(I)Ljava/lang/String;
        //   186: astore          11
        //   188: goto            83
        //   191: aload_1        
        //   192: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //   195: bipush          9
        //   197: aaload         
        //   198: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   201: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //   204: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   207: aload_1        
        //   208: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   211: astore          9
        //   213: aload           9
        //   215: ifnonnull       284
        //   218: aload_1        
        //   219: invokestatic    com/whatsapp/a_9.a:(Ljava/lang/String;)Ljava/lang/String;
        //   222: astore          18
        //   224: aload           18
        //   226: astore          10
        //   228: iload           6
        //   230: ifle            295
        //   233: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   236: ldc_w           2131296259
        //   239: iload           6
        //   241: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   244: astore          15
        //   246: iconst_2       
        //   247: anewarray       Ljava/lang/Object;
        //   250: astore          16
        //   252: aload           16
        //   254: iconst_0       
        //   255: aload           10
        //   257: aastore        
        //   258: aload           16
        //   260: iconst_1       
        //   261: iload           6
        //   263: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   266: aastore        
        //   267: aload           15
        //   269: aload           16
        //   271: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   274: astore          11
        //   276: goto            83
        //   279: astore          17
        //   281: aload           17
        //   283: athrow         
        //   284: aload           9
        //   286: aload_0        
        //   287: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   290: astore          10
        //   292: goto            228
        //   295: aload_0        
        //   296: ldc_w           2131230774
        //   299: iconst_1       
        //   300: anewarray       Ljava/lang/Object;
        //   303: dup            
        //   304: iconst_0       
        //   305: aload           10
        //   307: aastore        
        //   308: invokevirtual   android/app/Activity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   311: astore          11
        //   313: goto            83
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      166    174    Ljava/lang/NumberFormatException;
        //  24     36     174    179    Ljava/lang/NumberFormatException;
        //  218    224    279    284    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
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
    
    public static String a(final Activity p0, final ArrayList p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //     8: astore_3       
        //     9: ldc_w           ""
        //    12: astore          4
        //    14: aload_3        
        //    15: invokeinterface java/util/Iterator.hasNext:()Z
        //    20: ifeq            417
        //    23: aload_3        
        //    24: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    29: checkcast       Landroid/util/Pair;
        //    32: astore          22
        //    34: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    37: bipush          16
        //    39: aaload         
        //    40: aload           22
        //    42: getfield        android/util/Pair.first:Ljava/lang/Object;
        //    45: checkcast       Ljava/lang/String;
        //    48: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    51: istore          24
        //    53: iload           24
        //    55: ifeq            62
        //    58: iload_2        
        //    59: ifeq            410
        //    62: new             Ljava/lang/StringBuilder;
        //    65: dup            
        //    66: invokespecial   java/lang/StringBuilder.<init>:()V
        //    69: aload           4
        //    71: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    74: aload_0        
        //    75: aload           22
        //    77: getfield        android/util/Pair.first:Ljava/lang/Object;
        //    80: checkcast       Ljava/lang/String;
        //    83: aload           22
        //    85: getfield        android/util/Pair.second:Ljava/lang/Object;
        //    88: checkcast       Ljava/lang/String;
        //    91: iconst_0       
        //    92: invokestatic    com/whatsapp/ade.a:(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: ldc_w           " "
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   107: astore          5
        //   109: iload_2        
        //   110: ifeq            424
        //   113: aload           5
        //   115: ldc_w           ""
        //   118: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   121: istore          8
        //   123: iload           8
        //   125: ifeq            252
        //   128: getstatic       com/whatsapp/ade.a:I
        //   131: ifne            193
        //   134: getstatic       com/whatsapp/ade.c:J
        //   137: lstore          19
        //   139: lload           19
        //   141: ldc2_w          4444444444000
        //   144: lcmp           
        //   145: iflt            161
        //   148: aload_0        
        //   149: ldc_w           2131231108
        //   152: invokevirtual   android/app/Activity.getString:(I)Ljava/lang/String;
        //   155: astore          5
        //   157: iload_2        
        //   158: ifeq            382
        //   161: iconst_1       
        //   162: anewarray       Ljava/lang/Object;
        //   165: astore          21
        //   167: aload           21
        //   169: iconst_0       
        //   170: aload_0        
        //   171: getstatic       com/whatsapp/ade.c:J
        //   174: invokestatic    com/whatsapp/util/b6.g:(Landroid/content/Context;J)Ljava/lang/String;
        //   177: aastore        
        //   178: aload_0        
        //   179: ldc_w           2131231106
        //   182: aload           21
        //   184: invokevirtual   android/app/Activity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   187: astore          5
        //   189: iload_2        
        //   190: ifeq            382
        //   193: getstatic       com/whatsapp/ade.c:J
        //   196: lstore          16
        //   198: lload           16
        //   200: ldc2_w          4444444444000
        //   203: lcmp           
        //   204: iflt            220
        //   207: aload_0        
        //   208: ldc_w           2131231511
        //   211: invokevirtual   android/app/Activity.getString:(I)Ljava/lang/String;
        //   214: astore          5
        //   216: iload_2        
        //   217: ifeq            382
        //   220: iconst_1       
        //   221: anewarray       Ljava/lang/Object;
        //   224: astore          18
        //   226: aload           18
        //   228: iconst_0       
        //   229: aload_0        
        //   230: getstatic       com/whatsapp/ade.c:J
        //   233: invokestatic    com/whatsapp/util/b6.g:(Landroid/content/Context;J)Ljava/lang/String;
        //   236: aastore        
        //   237: aload_0        
        //   238: ldc_w           2131231105
        //   241: aload           18
        //   243: invokevirtual   android/app/Activity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   246: astore          5
        //   248: iload_2        
        //   249: ifeq            382
        //   252: getstatic       com/whatsapp/ade.c:J
        //   255: lstore          10
        //   257: lload           10
        //   259: ldc2_w          4444444444000
        //   262: lcmp           
        //   263: iflt            306
        //   266: new             Ljava/lang/StringBuilder;
        //   269: dup            
        //   270: invokespecial   java/lang/StringBuilder.<init>:()V
        //   273: aload           5
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //   281: bipush          17
        //   283: aaload         
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: aload_0        
        //   288: ldc_w           2131231511
        //   291: invokevirtual   android/app/Activity.getString:(I)Ljava/lang/String;
        //   294: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   297: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   300: astore          5
        //   302: iload_2        
        //   303: ifeq            382
        //   306: new             Ljava/lang/StringBuilder;
        //   309: dup            
        //   310: invokespecial   java/lang/StringBuilder.<init>:()V
        //   313: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //   316: bipush          15
        //   318: aaload         
        //   319: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   322: astore          12
        //   324: iconst_1       
        //   325: anewarray       Ljava/lang/Object;
        //   328: astore          13
        //   330: aload           13
        //   332: iconst_0       
        //   333: aload_0        
        //   334: getstatic       com/whatsapp/ade.c:J
        //   337: invokestatic    com/whatsapp/util/b6.g:(Landroid/content/Context;J)Ljava/lang/String;
        //   340: aastore        
        //   341: aload           12
        //   343: aload_0        
        //   344: ldc_w           2131231105
        //   347: aload           13
        //   349: invokevirtual   android/app/Activity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   352: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   355: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   358: astore          14
        //   360: new             Ljava/lang/StringBuilder;
        //   363: dup            
        //   364: invokespecial   java/lang/StringBuilder.<init>:()V
        //   367: aload           5
        //   369: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   372: aload           14
        //   374: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   377: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   380: astore          5
        //   382: aload           5
        //   384: areturn        
        //   385: astore          23
        //   387: aload           23
        //   389: athrow         
        //   390: astore          6
        //   392: aload           6
        //   394: athrow         
        //   395: astore          7
        //   397: aload           7
        //   399: athrow         
        //   400: astore          15
        //   402: aload           15
        //   404: athrow         
        //   405: astore          9
        //   407: aload           9
        //   409: athrow         
        //   410: aload           4
        //   412: astore          5
        //   414: goto            109
        //   417: aload           4
        //   419: astore          5
        //   421: goto            113
        //   424: aload           5
        //   426: astore          4
        //   428: goto            14
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  34     53     385    390    Ljava/lang/NumberFormatException;
        //  113    123    390    395    Ljava/lang/NumberFormatException;
        //  128    139    395    400    Ljava/lang/NumberFormatException;
        //  193    198    400    405    Ljava/lang/NumberFormatException;
        //  252    257    405    410    Ljava/lang/NumberFormatException;
        //  392    395    395    400    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 194, Size: 194
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
    
    public static String a(final Activity activity, final boolean b) {
        String string;
        if (ade.h) {
            string = activity.getString(2131230765, new Object[] { "+" + App.aX.jabber_id, b6.g((Context)activity, a(ade.z[26])) });
            ade.h = false;
        }
        else {
            final int a = a(b);
            if (a > 0) {
                return String.format(App.C.a(2131296298, a), a);
            }
            string = null;
            if (a == 0) {
                return activity.getString(2131231287);
            }
        }
        return string;
    }
    
    public static String a(final Context p0, final String[] p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: aload_1        
        //     5: arraylength    
        //     6: istore          5
        //     8: iload           5
        //    10: ifle            169
        //    13: iconst_1       
        //    14: istore          6
        //    16: iload           6
        //    18: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //    21: aload_2        
        //    22: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    25: istore          20
        //    27: iload           20
        //    29: istore          8
        //    31: new             Ljava/util/ArrayList;
        //    34: dup            
        //    35: aload_1        
        //    36: arraylength    
        //    37: invokespecial   java/util/ArrayList.<init>:(I)V
        //    40: astore          9
        //    42: iconst_0       
        //    43: istore          10
        //    45: iload           10
        //    47: aload_1        
        //    48: arraylength    
        //    49: if_icmpge       97
        //    52: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    55: aload_1        
        //    56: iload           10
        //    58: aaload         
        //    59: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    62: astore          15
        //    64: aload           15
        //    66: ifnonnull       188
        //    69: aload_1        
        //    70: iload           10
        //    72: aaload         
        //    73: invokestatic    com/whatsapp/a_9.a:(Ljava/lang/String;)Ljava/lang/String;
        //    76: astore          19
        //    78: aload           19
        //    80: astore          16
        //    82: aload           9
        //    84: aload           16
        //    86: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    89: pop            
        //    90: iinc            10, 1
        //    93: iload_3        
        //    94: ifeq            45
        //    97: aload           9
        //    99: invokestatic    com/whatsapp/adc.a:(Ljava/util/ArrayList;)Ljava/lang/String;
        //   102: astore          11
        //   104: iload           8
        //   106: i2d            
        //   107: ldc2_w          365.0
        //   110: ddiv           
        //   111: invokestatic    java/lang/Math.floor:(D)D
        //   114: d2i            
        //   115: istore          12
        //   117: iload           12
        //   119: ifle            199
        //   122: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   125: ldc_w           2131296256
        //   128: iload           12
        //   130: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   133: astore          13
        //   135: iconst_2       
        //   136: anewarray       Ljava/lang/Object;
        //   139: astore          14
        //   141: aload           14
        //   143: iconst_0       
        //   144: iload           12
        //   146: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   149: aastore        
        //   150: aload           14
        //   152: iconst_1       
        //   153: aload           11
        //   155: aastore        
        //   156: aload           13
        //   158: aload           14
        //   160: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   163: areturn        
        //   164: astore          4
        //   166: aload           4
        //   168: athrow         
        //   169: iconst_0       
        //   170: istore          6
        //   172: goto            16
        //   175: astore          7
        //   177: iconst_0       
        //   178: istore          8
        //   180: goto            31
        //   183: astore          18
        //   185: aload           18
        //   187: athrow         
        //   188: aload           15
        //   190: aload_0        
        //   191: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   194: astore          16
        //   196: goto            82
        //   199: aload_0        
        //   200: ldc_w           2131230772
        //   203: iconst_1       
        //   204: anewarray       Ljava/lang/Object;
        //   207: dup            
        //   208: iconst_0       
        //   209: aload           11
        //   211: aastore        
        //   212: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   215: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      8      164    169    Ljava/lang/NumberFormatException;
        //  21     27     175    183    Ljava/lang/NumberFormatException;
        //  69     78     183    188    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 111, Size: 111
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
    
    public static void a(final int a) {
        ade.a = a;
    }
    
    static void a(final long f) {
        Log.i(ade.z[25] + new Date(f));
        c(ade.f = f);
    }
    
    public static void a(final Activity p0, final long p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: invokestatic    java/lang/System.currentTimeMillis:()J
        //     8: lstore          6
        //    10: lload_1        
        //    11: lload_3        
        //    12: lcmp           
        //    13: ifeq            102
        //    16: lload_3        
        //    17: ldc2_w          4444444444000
        //    20: lcmp           
        //    21: iflt            32
        //    24: lload_1        
        //    25: ldc2_w          4444444444000
        //    28: lcmp           
        //    29: ifge            102
        //    32: invokestatic    com/whatsapp/ChangeNumber.g:()Z
        //    35: istore          15
        //    37: iload           15
        //    39: ifne            102
        //    42: lload_3        
        //    43: lload_1        
        //    44: lcmp           
        //    45: ifge            59
        //    48: aload_0        
        //    49: bipush          121
        //    51: invokevirtual   android/app/Activity.showDialog:(I)V
        //    54: iload           5
        //    56: ifeq            102
        //    59: lload_3        
        //    60: ldc2_w          4444444444000
        //    63: lcmp           
        //    64: iflt            78
        //    67: aload_0        
        //    68: bipush          120
        //    70: invokevirtual   android/app/Activity.showDialog:(I)V
        //    73: iload           5
        //    75: ifeq            102
        //    78: lload_1        
        //    79: lload           6
        //    81: lcmp           
        //    82: ifgt            96
        //    85: aload_0        
        //    86: bipush          118
        //    88: invokevirtual   android/app/Activity.showDialog:(I)V
        //    91: iload           5
        //    93: ifeq            102
        //    96: aload_0        
        //    97: bipush          117
        //    99: invokevirtual   android/app/Activity.showDialog:(I)V
        //   102: return         
        //   103: astore          8
        //   105: aload           8
        //   107: athrow         
        //   108: astore          9
        //   110: aload           9
        //   112: athrow         
        //   113: astore          10
        //   115: aload           10
        //   117: athrow         
        //   118: astore          11
        //   120: aload           11
        //   122: athrow         
        //   123: astore          12
        //   125: aload           12
        //   127: athrow         
        //   128: astore          13
        //   130: aload           13
        //   132: athrow         
        //   133: astore          14
        //   135: aload           14
        //   137: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  32     37     103    113    Ljava/lang/NumberFormatException;
        //  48     54     113    123    Ljava/lang/NumberFormatException;
        //  67     73     123    133    Ljava/lang/NumberFormatException;
        //  85     91     133    138    Ljava/lang/NumberFormatException;
        //  96     102    133    138    Ljava/lang/NumberFormatException;
        //  105    108    108    113    Ljava/lang/NumberFormatException;
        //  110    113    113    123    Ljava/lang/NumberFormatException;
        //  115    118    118    123    Ljava/lang/NumberFormatException;
        //  120    123    123    133    Ljava/lang/NumberFormatException;
        //  125    128    128    133    Ljava/lang/NumberFormatException;
        //  130    133    133    138    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
    
    public static void a(final a_e a_e) {
        ade.g.registerObserver((Object)a_e);
    }
    
    public static void a(final h6 h6, final long n) {
        a(h6, n, false);
    }
    
    public static void a(final h6 h6, final long n, final boolean b) {
        a(h6, n, b, null);
    }
    
    public static void a(final h6 p0, final long p1, final boolean p2, final ArrayList p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //     8: bipush          24
        //    10: aaload         
        //    11: invokestatic    com/whatsapp/ade.a:(Ljava/lang/String;)J
        //    14: lstore          6
        //    16: lload_1        
        //    17: invokestatic    com/whatsapp/ade.b:(J)V
        //    20: iload_3        
        //    21: ifne            321
        //    24: lload           6
        //    26: lload_1        
        //    27: lcmp           
        //    28: ifeq            31
        //    31: lload           6
        //    33: lload_1        
        //    34: lcmp           
        //    35: ifge            158
        //    38: invokestatic    java/lang/System.currentTimeMillis:()J
        //    41: lstore          26
        //    43: lload_1        
        //    44: lload           26
        //    46: ldc2_w          2592000000
        //    49: ladd           
        //    50: lcmp           
        //    51: ifle            158
        //    54: lload           6
        //    56: lconst_0       
        //    57: lcmp           
        //    58: ifeq            158
        //    61: new             Ljava/lang/StringBuilder;
        //    64: dup            
        //    65: invokespecial   java/lang/StringBuilder.<init>:()V
        //    68: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    71: bipush          23
        //    73: aaload         
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: new             Ljava/util/Date;
        //    80: dup            
        //    81: lload           6
        //    83: invokespecial   java/util/Date.<init>:(J)V
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    89: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    92: bipush          20
        //    94: aaload         
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: new             Ljava/util/Date;
        //   101: dup            
        //   102: lload_1        
        //   103: invokespecial   java/util/Date.<init>:(J)V
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   109: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   112: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   115: lload_1        
        //   116: putstatic       com/whatsapp/ade.b:J
        //   119: invokestatic    com/whatsapp/ChangeNumber.g:()Z
        //   122: istore          28
        //   124: iload           28
        //   126: ifne            149
        //   129: lload_1        
        //   130: ldc2_w          4444444444000
        //   133: lcmp           
        //   134: iflt            352
        //   137: iconst_1       
        //   138: istore          31
        //   140: iconst_0       
        //   141: iload           31
        //   143: invokestatic    com/whatsapp/ade.a:(ZZ)V
        //   146: invokestatic    com/whatsapp/App.W:()V
        //   149: iconst_0       
        //   150: putstatic       com/whatsapp/ade.h:Z
        //   153: iload           5
        //   155: ifeq            250
        //   158: lload           6
        //   160: lload_1        
        //   161: lcmp           
        //   162: ifle            250
        //   165: lload_1        
        //   166: putstatic       com/whatsapp/ade.b:J
        //   169: invokestatic    com/whatsapp/ChangeNumber.g:()Z
        //   172: istore          20
        //   174: iload           20
        //   176: ifne            196
        //   179: lload_1        
        //   180: ldc2_w          4444444444000
        //   183: lcmp           
        //   184: iflt            378
        //   187: iconst_1       
        //   188: istore          21
        //   190: iconst_1       
        //   191: iload           21
        //   193: invokestatic    com/whatsapp/ade.a:(ZZ)V
        //   196: new             Ljava/lang/StringBuilder;
        //   199: dup            
        //   200: invokespecial   java/lang/StringBuilder.<init>:()V
        //   203: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //   206: bipush          21
        //   208: aaload         
        //   209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   212: new             Ljava/util/Date;
        //   215: dup            
        //   216: lload           6
        //   218: invokespecial   java/util/Date.<init>:(J)V
        //   221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   224: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //   227: bipush          22
        //   229: aaload         
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: new             Ljava/util/Date;
        //   236: dup            
        //   237: lload_1        
        //   238: invokespecial   java/util/Date.<init>:(J)V
        //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   244: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   247: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   250: getstatic       com/whatsapp/h6.GIFT_RECEIVED:Lcom/whatsapp/h6;
        //   253: astore          13
        //   255: aload_0        
        //   256: aload           13
        //   258: if_acmpeq       276
        //   261: getstatic       com/whatsapp/ade.g:Lcom/whatsapp/aw_;
        //   264: aload_0        
        //   265: lload           6
        //   267: lload_1        
        //   268: invokevirtual   com/whatsapp/aw_.a:(Lcom/whatsapp/h6;JJ)V
        //   271: iload           5
        //   273: ifeq            321
        //   276: aload           4
        //   278: ifnull          399
        //   281: iconst_1       
        //   282: istore          14
        //   284: iload           14
        //   286: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //   289: aload           4
        //   291: invokevirtual   java/util/ArrayList.size:()I
        //   294: istore          16
        //   296: iload           16
        //   298: ifle            410
        //   301: iconst_1       
        //   302: istore          17
        //   304: iload           17
        //   306: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //   309: getstatic       com/whatsapp/ade.g:Lcom/whatsapp/aw_;
        //   312: aload_0        
        //   313: lload           6
        //   315: lload_1        
        //   316: aload           4
        //   318: invokevirtual   com/whatsapp/aw_.a:(Lcom/whatsapp/h6;JJLjava/util/ArrayList;)V
        //   321: return         
        //   322: astore          8
        //   324: aload           8
        //   326: athrow         
        //   327: astore          9
        //   329: aload           9
        //   331: athrow         
        //   332: astore          22
        //   334: aload           22
        //   336: athrow         
        //   337: astore          23
        //   339: aload           23
        //   341: athrow         
        //   342: astore          24
        //   344: aload           24
        //   346: athrow         
        //   347: astore          25
        //   349: aload           25
        //   351: athrow         
        //   352: iconst_0       
        //   353: istore          31
        //   355: goto            140
        //   358: astore          29
        //   360: aload           29
        //   362: athrow         
        //   363: astore          30
        //   365: aload           30
        //   367: athrow         
        //   368: astore          18
        //   370: aload           18
        //   372: athrow         
        //   373: astore          19
        //   375: aload           19
        //   377: athrow         
        //   378: iconst_0       
        //   379: istore          21
        //   381: goto            190
        //   384: astore          10
        //   386: aload           10
        //   388: athrow         
        //   389: astore          11
        //   391: aload           11
        //   393: athrow         
        //   394: astore          12
        //   396: aload           12
        //   398: athrow         
        //   399: iconst_0       
        //   400: istore          14
        //   402: goto            284
        //   405: astore          15
        //   407: aload           15
        //   409: athrow         
        //   410: iconst_0       
        //   411: istore          17
        //   413: goto            304
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  16     20     322    332    Ljava/lang/NumberFormatException;
        //  38     43     332    342    Ljava/lang/NumberFormatException;
        //  61     124    342    352    Ljava/lang/NumberFormatException;
        //  149    153    358    368    Ljava/lang/NumberFormatException;
        //  165    174    368    378    Ljava/lang/NumberFormatException;
        //  250    255    384    389    Ljava/lang/NumberFormatException;
        //  261    271    389    399    Ljava/lang/NumberFormatException;
        //  284    296    405    410    Ljava/lang/NumberFormatException;
        //  324    327    327    332    Ljava/lang/NumberFormatException;
        //  334    337    337    342    Ljava/lang/NumberFormatException;
        //  339    342    342    352    Ljava/lang/NumberFormatException;
        //  344    347    347    352    Ljava/lang/NumberFormatException;
        //  360    363    363    368    Ljava/lang/NumberFormatException;
        //  365    368    368    378    Ljava/lang/NumberFormatException;
        //  370    373    373    378    Ljava/lang/NumberFormatException;
        //  386    389    389    399    Ljava/lang/NumberFormatException;
        //  391    394    394    399    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 204, Size: 204
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
    
    public static void a(final ArrayList list) {
        final boolean i = App.I;
        final Iterator<Pair> iterator = list.iterator();
        String s = "";
        while (true) {
            while (iterator.hasNext()) {
                final Pair pair = iterator.next();
                final String string = s + a((Context)App.aq, (String[])pair.first, (String)pair.second) + " ";
                if (i) {
                    b(string);
                    return;
                }
                s = string;
            }
            final String string = s;
            continue;
        }
    }
    
    private static void a(final boolean p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //     7: bipush          8
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: new             Landroid/support/v4/app/NotificationCompat$Builder;
        //    16: dup            
        //    17: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    20: invokespecial   android/support/v4/app/NotificationCompat$Builder.<init>:(Landroid/content/Context;)V
        //    23: astore_3       
        //    24: aload_3        
        //    25: ldc_w           2130838963
        //    28: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setSmallIcon:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //    31: pop            
        //    32: iload_0        
        //    33: ifeq            54
        //    36: aload_3        
        //    37: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    40: ldc_w           2131231652
        //    43: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //    46: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setTicker:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //    49: pop            
        //    50: iload_2        
        //    51: ifeq            68
        //    54: aload_3        
        //    55: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    58: ldc_w           2131231650
        //    61: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //    64: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setTicker:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //    67: pop            
        //    68: iload_0        
        //    69: ifeq            90
        //    72: aload_3        
        //    73: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    76: ldc_w           2131231651
        //    79: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //    82: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //    85: pop            
        //    86: iload_2        
        //    87: ifeq            104
        //    90: aload_3        
        //    91: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    94: ldc_w           2131231649
        //    97: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //   100: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   103: pop            
        //   104: iload_1        
        //   105: ifeq            151
        //   108: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   111: astore          18
        //   113: iconst_1       
        //   114: anewarray       Ljava/lang/Object;
        //   117: astore          19
        //   119: aload           19
        //   121: iconst_0       
        //   122: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   125: ldc_w           2131231266
        //   128: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //   131: aastore        
        //   132: aload_3        
        //   133: aload           18
        //   135: ldc_w           2131231646
        //   138: aload           19
        //   140: invokevirtual   com/whatsapp/App.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   143: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   146: pop            
        //   147: iload_2        
        //   148: ifeq            190
        //   151: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   154: astore          11
        //   156: iconst_1       
        //   157: anewarray       Ljava/lang/Object;
        //   160: astore          12
        //   162: aload           12
        //   164: iconst_0       
        //   165: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   168: getstatic       com/whatsapp/ade.b:J
        //   171: invokestatic    com/whatsapp/util/b6.g:(Landroid/content/Context;J)Ljava/lang/String;
        //   174: aastore        
        //   175: aload_3        
        //   176: aload           11
        //   178: ldc_w           2131231646
        //   181: aload           12
        //   183: invokevirtual   com/whatsapp/App.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   186: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   189: pop            
        //   190: new             Landroid/content/Intent;
        //   193: dup            
        //   194: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   197: invokestatic    com/whatsapp/Main.h:()Ljava/lang/Class;
        //   200: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   203: astore          14
        //   205: aload_3        
        //   206: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   209: iconst_0       
        //   210: aload           14
        //   212: ldc_w           268435456
        //   215: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   218: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   221: pop            
        //   222: aload_3        
        //   223: iconst_3       
        //   224: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setDefaults:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //   227: pop            
        //   228: aload_3        
        //   229: invokevirtual   android/support/v4/app/NotificationCompat$Builder.build:()Landroid/app/Notification;
        //   232: astore          17
        //   234: aload           17
        //   236: bipush          16
        //   238: aload           17
        //   240: getfield        android/app/Notification.flags:I
        //   243: ior            
        //   244: putfield        android/app/Notification.flags:I
        //   247: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   250: invokestatic    android/support/v4/app/NotificationManagerCompat.from:(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;
        //   253: iconst_3       
        //   254: aload           17
        //   256: invokevirtual   android/support/v4/app/NotificationManagerCompat.notify:(ILandroid/app/Notification;)V
        //   259: return         
        //   260: astore          4
        //   262: aload           4
        //   264: athrow         
        //   265: astore          5
        //   267: aload           5
        //   269: athrow         
        //   270: astore          8
        //   272: aload           8
        //   274: athrow         
        //   275: astore          10
        //   277: aload           10
        //   279: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  24     32     260    265    Ljava/lang/NumberFormatException;
        //  36     50     265    270    Ljava/lang/NumberFormatException;
        //  54     68     265    270    Ljava/lang/NumberFormatException;
        //  72     86     270    275    Ljava/lang/NumberFormatException;
        //  90     104    270    275    Ljava/lang/NumberFormatException;
        //  108    147    275    280    Ljava/lang/NumberFormatException;
        //  151    190    275    280    Ljava/lang/NumberFormatException;
        //  262    265    265    270    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 132, Size: 132
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
    
    public static boolean a() {
        final long a = a(ade.z[6]);
        if (a != 0L) {
            try {
                if (a < System.currentTimeMillis()) {
                    return true;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    public static long b() {
        return a(ade.z[7]);
    }
    
    public static void b(final int n) {
        c(n);
    }
    
    private static void b(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //     3: bipush          13
        //     5: aaload         
        //     6: astore_2       
        //     7: aload_2        
        //     8: monitorenter   
        //     9: lload_0        
        //    10: putstatic       com/whatsapp/ade.c:J
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    23: bipush          12
        //    25: aaload         
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: new             Ljava/util/Date;
        //    32: dup            
        //    33: lload_0        
        //    34: invokespecial   java/util/Date.<init>:(J)V
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    40: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    43: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    46: aconst_null    
        //    47: astore          4
        //    49: new             Ljava/io/ObjectOutputStream;
        //    52: dup            
        //    53: new             Ljava/io/FileOutputStream;
        //    56: dup            
        //    57: new             Ljava/io/File;
        //    60: dup            
        //    61: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    64: invokevirtual   com/whatsapp/App.getFilesDir:()Ljava/io/File;
        //    67: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    70: bipush          14
        //    72: aaload         
        //    73: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    76: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    79: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    82: astore          5
        //    84: aload           5
        //    86: lload_0        
        //    87: invokevirtual   java/io/ObjectOutputStream.writeLong:(J)V
        //    90: aload           5
        //    92: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    95: aload_2        
        //    96: monitorexit    
        //    97: return         
        //    98: astore          6
        //   100: aconst_null    
        //   101: astore          5
        //   103: aload           6
        //   105: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   108: aload           5
        //   110: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   113: goto            95
        //   116: astore_3       
        //   117: aload_2        
        //   118: monitorexit    
        //   119: aload_3        
        //   120: athrow         
        //   121: astore          7
        //   123: aload           4
        //   125: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   128: aload           7
        //   130: athrow         
        //   131: astore          7
        //   133: aload           5
        //   135: astore          4
        //   137: goto            123
        //   140: astore          6
        //   142: goto            103
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      46     116    121    Any
        //  49     84     98     103    Ljava/io/IOException;
        //  49     84     121    123    Any
        //  84     90     140    145    Ljava/io/IOException;
        //  84     90     131    140    Any
        //  90     95     116    121    Any
        //  95     97     116    121    Any
        //  103    108    131    140    Any
        //  108    113    116    121    Any
        //  117    119    116    121    Any
        //  123    131    116    121    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0095:
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
    
    public static void b(final a_e a_e) {
        ade.g.unregisterObserver((Object)a_e);
    }
    
    private static void b(final String contentText) {
        Log.i(ade.z[35] + contentText);
        final NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder((Context)App.aq);
        notificationCompat$Builder.setSmallIcon(2130838963);
        notificationCompat$Builder.setTicker(App.aq.getString(2131231448));
        notificationCompat$Builder.setContentTitle(App.aq.getString(2131231448));
        notificationCompat$Builder.setContentText(contentText);
        notificationCompat$Builder.setContentIntent(PendingIntent.getActivity((Context)App.aq, 0, new Intent((Context)App.aq, Main.h()), 268435456));
        notificationCompat$Builder.setDefaults(3);
        final Notification build = notificationCompat$Builder.build();
        build.flags |= 0x10;
        NotificationManagerCompat.from((Context)App.aq).notify(5, build);
    }
    
    static int c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/File;
        //     3: dup            
        //     4: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //     7: invokevirtual   com/whatsapp/App.getFilesDir:()Ljava/io/File;
        //    10: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    13: iconst_5       
        //    14: aaload         
        //    15: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    18: astore_0       
        //    19: aload_0        
        //    20: invokevirtual   java/io/File.exists:()Z
        //    23: ifeq            68
        //    26: aconst_null    
        //    27: astore_1       
        //    28: new             Ljava/io/ObjectInputStream;
        //    31: dup            
        //    32: new             Ljava/io/FileInputStream;
        //    35: dup            
        //    36: aload_0        
        //    37: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    40: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    43: astore_2       
        //    44: aload_2        
        //    45: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    48: istore          5
        //    50: aload_2        
        //    51: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    54: iload           5
        //    56: ireturn        
        //    57: astore_3       
        //    58: aconst_null    
        //    59: astore_2       
        //    60: aload_3        
        //    61: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //    64: aload_2        
        //    65: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    68: iconst_m1      
        //    69: ireturn        
        //    70: astore          4
        //    72: aload_1        
        //    73: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    76: aload           4
        //    78: athrow         
        //    79: astore          4
        //    81: aload_2        
        //    82: astore_1       
        //    83: goto            72
        //    86: astore_3       
        //    87: goto            60
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  28     44     57     60     Ljava/io/IOException;
        //  28     44     70     72     Any
        //  44     50     86     90     Ljava/io/IOException;
        //  44     50     79     86     Any
        //  60     64     79     86     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0060:
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
    
    private static void c(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_0        
        //     1: iconst_m1      
        //     2: if_icmpeq       49
        //     5: aconst_null    
        //     6: astore_1       
        //     7: new             Ljava/io/ObjectOutputStream;
        //    10: dup            
        //    11: new             Ljava/io/FileOutputStream;
        //    14: dup            
        //    15: new             Ljava/io/File;
        //    18: dup            
        //    19: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    22: invokevirtual   com/whatsapp/App.getFilesDir:()Ljava/io/File;
        //    25: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    28: iconst_2       
        //    29: aaload         
        //    30: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    33: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    36: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    39: astore_2       
        //    40: aload_2        
        //    41: iload_0        
        //    42: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //    45: aload_2        
        //    46: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    49: return         
        //    50: astore_3       
        //    51: aconst_null    
        //    52: astore_2       
        //    53: aload_3        
        //    54: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //    57: aload_2        
        //    58: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    61: return         
        //    62: astore          4
        //    64: aload_1        
        //    65: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    68: aload           4
        //    70: athrow         
        //    71: astore          4
        //    73: aload_2        
        //    74: astore_1       
        //    75: goto            64
        //    78: astore_3       
        //    79: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      40     50     53     Ljava/io/IOException;
        //  7      40     62     64     Any
        //  40     45     78     82     Ljava/io/IOException;
        //  40     45     71     78     Any
        //  53     57     71     78     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    private static void c(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //     3: bipush          32
        //     5: aaload         
        //     6: astore_2       
        //     7: aload_2        
        //     8: monitorenter   
        //     9: new             Ljava/lang/StringBuilder;
        //    12: dup            
        //    13: invokespecial   java/lang/StringBuilder.<init>:()V
        //    16: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    19: bipush          33
        //    21: aaload         
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: new             Ljava/util/Date;
        //    28: dup            
        //    29: lload_0        
        //    30: invokespecial   java/util/Date.<init>:(J)V
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: new             Ljava/io/File;
        //    45: dup            
        //    46: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    49: invokevirtual   com/whatsapp/App.getFilesDir:()Ljava/io/File;
        //    52: getstatic       com/whatsapp/ade.z:[Ljava/lang/String;
        //    55: bipush          34
        //    57: aaload         
        //    58: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    61: astore          4
        //    63: aconst_null    
        //    64: astore          5
        //    66: new             Ljava/io/ObjectOutputStream;
        //    69: dup            
        //    70: new             Ljava/io/FileOutputStream;
        //    73: dup            
        //    74: aload           4
        //    76: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    79: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    82: astore          6
        //    84: aload           6
        //    86: lload_0        
        //    87: invokevirtual   java/io/ObjectOutputStream.writeLong:(J)V
        //    90: aload           6
        //    92: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    95: aload_2        
        //    96: monitorexit    
        //    97: return         
        //    98: astore          7
        //   100: aconst_null    
        //   101: astore          6
        //   103: aload           7
        //   105: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   108: aload           6
        //   110: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   113: goto            95
        //   116: astore_3       
        //   117: aload_2        
        //   118: monitorexit    
        //   119: aload_3        
        //   120: athrow         
        //   121: astore          8
        //   123: aload           5
        //   125: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   128: aload           8
        //   130: athrow         
        //   131: astore          8
        //   133: aload           6
        //   135: astore          5
        //   137: goto            123
        //   140: astore          7
        //   142: goto            103
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      63     116    121    Any
        //  66     84     98     103    Ljava/io/IOException;
        //  66     84     121    123    Any
        //  84     90     140    145    Ljava/io/IOException;
        //  84     90     131    140    Any
        //  90     95     116    121    Any
        //  95     97     116    121    Any
        //  103    108    131    140    Any
        //  108    113    116    121    Any
        //  117    119    116    121    Any
        //  123    131    116    121    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0095:
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
    
    public static void d() {
        synchronized (ade.z[36]) {
            new File(App.aq.getFilesDir(), ade.z[37]).delete();
            ade.f = 0L;
        }
    }
    
    public static void e() {
        synchronized (ade.z[4]) {
            new File(App.aq.getFilesDir(), ade.z[3]).delete();
            ade.c = 0L;
        }
    }
}
