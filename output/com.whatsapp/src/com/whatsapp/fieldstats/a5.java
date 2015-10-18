// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import com.whatsapp.util.Log;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import android.content.Context;
import android.os.Handler$Callback;
import android.os.Handler;
import java.util.EnumMap;
import android.os.HandlerThread;
import java.io.OutputStream;

public final class a5
{
    private static volatile OutputStream a;
    private static final HandlerThread b;
    private static final EnumMap c;
    private static volatile long d;
    private static final byte[] e;
    private static final Handler f;
    private static final EnumMap g;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[31];
        String s = "D{{w1Gi&o?T48";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0807:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = 'P';
                        break;
                    }
                    case 0: {
                        c3 = '3';
                        break;
                    }
                    case 1: {
                        c3 = '\u001a';
                        break;
                    }
                    case 2: {
                        c3 = '\b';
                        break;
                    }
                    case 3: {
                        c3 = '\u0003';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Ftia<V:|lpDhaw5\u0013ng##G{|ppUsdf";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Ftia<V:|lp\\jmmp@niw#\u0013|ao5";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Ftia<V:|lpPhmb$V:{w1Gi(e9_\u007f";
                    n = 2;
                    n2 = 3;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "D{{w1Gi&g9^i";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "D{{w1Gi&o?T48";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "D{{w1Gi&o?T";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "D{{w1Gi&g9^i";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "Ftia<V:|lpA\u007figpP{kk5W:lj=Vt{j?]i(e9_\u007f";
                    n = 7;
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "D{{w1Gi&g9^i";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0013\u007fpj#Gi(a%G:app]u|#\"V{lb2_\u007f";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "D{{w1Gi&w9^\u007f{w1^j";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "zUM{3Vj|j?]:lv\"Zto#\"V{l#6Aue# Vtlj>T:{w1Gi(o1@n(q?G{|fpGsefpUsdf";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "D{{w1Gi&o?T";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "Pozq5]n(p)@nmnpGsefpZi(j<_\u007fob<\t:";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "Ftia<V:|lpFjlb$V:kb3[\u007fl#4Zwmm#ZufppUsdf";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "D{{w1Gi&o?T48";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "C\u007ffg9]}(p$Rn{#%Cvgb4\u0013ujo9G\u007fzb$V~(g%V:|lpVbkf#@s~fp@srf";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "Zu(f\"Auz#2_ukh5W:{w1Gi(q?G{|j?]";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "C\u007ffg9]}(p$Rn{#%Cvgb4\u0013xdl3X\u007fl##G{|ppAu|b$Zuf";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u001a:|lpGrm# Vtlj>T:}s<\\{l##G{|ppUsdfp\u001b";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "D{{w1Gi&o?T";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "D{{w1Gi&o?T48";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "Ftia<V:|lpA\u007ffb=V:{w1Gi(e9_\u007f(+";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "Ftia<V:|lpW\u007fdf$V:xf>WsfdpFjdl1W:{w1Gi(e9_\u007f(+";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "D{{w1Gi&w9^\u007f{w1^j";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    s = "Z5g#5AhgqpDrao5\u0013mzj$Zto# Vtlj>T:{w1Gi(o1@n(q?G{|fpGsefpUsdf";
                    n = 25;
                    n2 = 26;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    array = z2;
                    s = "Ftia<V:|lp\\jmmpC\u007ffg9]}(p$Rn{#<Ri|#\"\\niw5\u0013nan5\u0013|ao5\u0013|gqpDhaw9]}";
                    n = 26;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "D{{w1Gi&o?T";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "D{{w1Gi&o?T48";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "`niw#";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    break Label_0807;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        (b = new HandlerThread(a5.z[30])).start();
        f = new Handler(a5.b.getLooper(), (Handler$Callback)new ad());
        e = new byte[] { 87, 65, 83, 84, 65, 84, 83, 1 };
        c = new EnumMap((Class<K>)o.class);
        g = new EnumMap((Class<K>)o.class);
    }
    
    private static double a(final Boolean b) {
        if (b == null) {
            return Double.NaN;
        }
        while (true) {
            while (true) {
                try {
                    if (b) {
                        return 1;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    private static double a(final Integer n) {
        if (n == null) {
            return Double.NaN;
        }
        return n;
    }
    
    static OutputStream a() {
        return a5.a;
    }
    
    private static void a(final long n, final OutputStream outputStream) {
        outputStream.write(a5.e);
        final int n2 = (int)(n / 1000L);
        outputStream.write((byte)n2);
        outputStream.write((byte)(n2 >> 8));
        outputStream.write((byte)(n2 >> 16));
        outputStream.write((byte)(n2 >> 24));
        outputStream.flush();
    }
    
    private static void a(final Context p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: lload_1        
        //     4: putstatic       com/whatsapp/fieldstats/a5.d:J
        //     7: aconst_null    
        //     8: astore          4
        //    10: new             Ljava/io/DataOutputStream;
        //    13: dup            
        //    14: new             Ljava/io/FileOutputStream;
        //    17: dup            
        //    18: new             Ljava/io/File;
        //    21: dup            
        //    22: aload_0        
        //    23: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    26: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    29: bipush          25
        //    31: aaload         
        //    32: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    35: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    38: invokespecial   java/io/DataOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    41: astore          5
        //    43: aload           5
        //    45: lload_1        
        //    46: invokevirtual   java/io/DataOutputStream.writeLong:(J)V
        //    49: aload           5
        //    51: ifnull          59
        //    54: aload           5
        //    56: invokevirtual   java/io/DataOutputStream.close:()V
        //    59: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    61: monitorexit    
        //    62: return         
        //    63: astore          6
        //    65: aconst_null    
        //    66: astore          5
        //    68: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    71: bipush          27
        //    73: aaload         
        //    74: aload           6
        //    76: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    79: aload           5
        //    81: ifnull          59
        //    84: aload           5
        //    86: invokevirtual   java/io/DataOutputStream.close:()V
        //    89: goto            59
        //    92: astore          10
        //    94: goto            59
        //    97: astore          11
        //    99: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //   102: bipush          26
        //   104: aaload         
        //   105: aload           11
        //   107: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   110: aload           4
        //   112: ifnull          59
        //   115: aload           4
        //   117: invokevirtual   java/io/DataOutputStream.close:()V
        //   120: goto            59
        //   123: astore          12
        //   125: goto            59
        //   128: astore          7
        //   130: aload           4
        //   132: ifnull          140
        //   135: aload           4
        //   137: invokevirtual   java/io/DataOutputStream.close:()V
        //   140: aload           7
        //   142: athrow         
        //   143: astore_3       
        //   144: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   146: monitorexit    
        //   147: aload_3        
        //   148: athrow         
        //   149: astore          9
        //   151: aload           9
        //   153: athrow         
        //   154: astore          13
        //   156: goto            59
        //   159: astore          8
        //   161: goto            140
        //   164: astore          7
        //   166: aload           5
        //   168: astore          4
        //   170: goto            130
        //   173: astore          11
        //   175: aload           5
        //   177: astore          4
        //   179: goto            99
        //   182: astore          6
        //   184: goto            68
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      7      143    149    Any
        //  10     43     63     68     Ljava/io/FileNotFoundException;
        //  10     43     97     99     Ljava/io/IOException;
        //  10     43     128    130    Any
        //  43     49     182    187    Ljava/io/FileNotFoundException;
        //  43     49     173    182    Ljava/io/IOException;
        //  43     49     164    173    Any
        //  54     59     154    159    Ljava/io/IOException;
        //  54     59     143    149    Any
        //  68     79     164    173    Any
        //  84     89     92     97     Ljava/io/IOException;
        //  84     89     143    149    Any
        //  99     110    128    130    Any
        //  115    120    123    128    Ljava/io/IOException;
        //  115    120    143    149    Any
        //  135    140    159    164    Ljava/io/IOException;
        //  135    140    149    154    Ljava/lang/IllegalStateException;
        //  135    140    143    149    Any
        //  140    143    143    149    Any
        //  151    154    143    149    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    public static void a(final Context context, final a1 a1, final Double n) {
        while (true) {
            final ByteBuffer a2 = bo.a();
            while (true) {
                try {
                    final byte type = a1.getType();
                    final int code = a1.getCode();
                    final long currentTimeMillis = System.currentTimeMillis();
                    if (n == null) {
                        final double doubleValue = Double.NaN;
                        bo.a(type, code, currentTimeMillis, Double.valueOf(doubleValue), a2);
                        a2.flip();
                        a(context, a2, false);
                        return;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final double doubleValue = n;
                continue;
            }
        }
    }
    
    public static void a(final Context context, final a1 a1, final Integer n) {
        a(context, a1, Double.valueOf(a(n)));
    }
    
    public static void a(final Context context, final b9 b9) {
        synchronized (a5.class) {
            b9.updateFields(context);
        }
    }
    
    public static void a(final Context context, final o o) {
        a(context, o, (Double)null);
    }
    
    public static void a(final Context context, final o o, final Boolean b) {
        a(context, o, Double.valueOf(a(b)));
    }
    
    public static void a(final Context p0, final o p1, final Double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: getstatic       com/whatsapp/fieldstats/a5.g:Ljava/util/EnumMap;
        //     6: aload_1        
        //     7: invokevirtual   java/util/EnumMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    10: checkcast       Ljava/lang/Double;
        //    13: astore          4
        //    15: getstatic       com/whatsapp/fieldstats/a5.g:Ljava/util/EnumMap;
        //    18: aload_1        
        //    19: invokevirtual   java/util/EnumMap.containsKey:(Ljava/lang/Object;)Z
        //    22: istore          8
        //    24: iload           8
        //    26: ifeq            72
        //    29: aload           4
        //    31: ifnonnull       63
        //    34: aload_2        
        //    35: ifnonnull       72
        //    38: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    40: monitorexit    
        //    41: return         
        //    42: astore          5
        //    44: aload           5
        //    46: athrow         
        //    47: astore          6
        //    49: aload           6
        //    51: athrow         
        //    52: astore          7
        //    54: aload           7
        //    56: athrow         
        //    57: astore_3       
        //    58: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    60: monitorexit    
        //    61: aload_3        
        //    62: athrow         
        //    63: aload           4
        //    65: aload_2        
        //    66: invokevirtual   java/lang/Double.equals:(Ljava/lang/Object;)Z
        //    69: ifne            38
        //    72: invokestatic    com/whatsapp/fieldstats/bo.a:()Ljava/nio/ByteBuffer;
        //    75: astore          9
        //    77: aload_1        
        //    78: invokevirtual   com/whatsapp/fieldstats/o.getType:()B
        //    81: istore          11
        //    83: aload_1        
        //    84: invokevirtual   com/whatsapp/fieldstats/o.getCode:()I
        //    87: istore          12
        //    89: invokestatic    java/lang/System.currentTimeMillis:()J
        //    92: lstore          13
        //    94: aload_2        
        //    95: ifnonnull       177
        //    98: ldc2_w          NaN
        //   101: dstore          17
        //   103: iload           11
        //   105: iload           12
        //   107: lload           13
        //   109: dload           17
        //   111: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   114: aload           9
        //   116: invokestatic    com/whatsapp/fieldstats/bo.a:(BIJLjava/lang/Double;Ljava/nio/ByteBuffer;)V
        //   119: aload           9
        //   121: invokevirtual   java/nio/ByteBuffer.flip:()Ljava/nio/Buffer;
        //   124: pop            
        //   125: aload_2        
        //   126: ifnonnull       153
        //   129: getstatic       com/whatsapp/fieldstats/a5.g:Ljava/util/EnumMap;
        //   132: aload_1        
        //   133: aconst_null    
        //   134: invokevirtual   java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
        //   137: pop            
        //   138: getstatic       com/whatsapp/fieldstats/a5.c:Ljava/util/EnumMap;
        //   141: aload_1        
        //   142: aconst_null    
        //   143: invokevirtual   java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
        //   146: pop            
        //   147: getstatic       com/whatsapp/fieldstats/aj.a:I
        //   150: ifeq            162
        //   153: getstatic       com/whatsapp/fieldstats/a5.g:Ljava/util/EnumMap;
        //   156: aload_1        
        //   157: aload_2        
        //   158: invokevirtual   java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
        //   161: pop            
        //   162: aload_0        
        //   163: aload           9
        //   165: iconst_1       
        //   166: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Ljava/nio/ByteBuffer;Z)V
        //   169: goto            38
        //   172: astore          10
        //   174: aload           10
        //   176: athrow         
        //   177: aload_2        
        //   178: invokevirtual   java/lang/Double.doubleValue:()D
        //   181: dstore          15
        //   183: dload           15
        //   185: dstore          17
        //   187: goto            103
        //   190: astore          19
        //   192: aload           19
        //   194: athrow         
        //   195: astore          20
        //   197: aload           20
        //   199: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      15     57     63     Any
        //  15     24     42     57     Ljava/lang/IllegalStateException;
        //  15     24     57     63     Any
        //  44     47     47     57     Ljava/lang/IllegalStateException;
        //  44     47     57     63     Any
        //  49     52     52     57     Ljava/lang/IllegalStateException;
        //  49     52     57     63     Any
        //  54     57     57     63     Any
        //  63     72     57     63     Any
        //  72     77     57     63     Any
        //  77     94     172    177    Ljava/lang/IllegalStateException;
        //  77     94     57     63     Any
        //  103    125    190    195    Ljava/lang/IllegalStateException;
        //  103    125    57     63     Any
        //  129    153    195    200    Ljava/lang/IllegalStateException;
        //  129    153    57     63     Any
        //  153    162    195    200    Ljava/lang/IllegalStateException;
        //  153    162    57     63     Any
        //  162    169    57     63     Any
        //  174    177    57     63     Any
        //  177    183    57     63     Any
        //  192    195    195    200    Ljava/lang/IllegalStateException;
        //  192    195    57     63     Any
        //  197    200    57     63     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 101, Size: 101
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
    
    public static void a(final Context context, final o o, final Integer n) {
        a(context, o, Double.valueOf(a(n)));
    }
    
    public static void a(final Context p0, final o p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: getstatic       com/whatsapp/fieldstats/aj.a:I
        //     6: istore          4
        //     8: getstatic       com/whatsapp/fieldstats/a5.c:Ljava/util/EnumMap;
        //    11: aload_1        
        //    12: invokevirtual   java/util/EnumMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    15: checkcast       Ljava/lang/String;
        //    18: astore          5
        //    20: getstatic       com/whatsapp/fieldstats/a5.c:Ljava/util/EnumMap;
        //    23: aload_1        
        //    24: invokevirtual   java/util/EnumMap.containsKey:(Ljava/lang/Object;)Z
        //    27: istore          9
        //    29: iload           9
        //    31: ifeq            77
        //    34: aload           5
        //    36: ifnonnull       68
        //    39: aload_2        
        //    40: ifnonnull       77
        //    43: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    45: monitorexit    
        //    46: return         
        //    47: astore          6
        //    49: aload           6
        //    51: athrow         
        //    52: astore          7
        //    54: aload           7
        //    56: athrow         
        //    57: astore          8
        //    59: aload           8
        //    61: athrow         
        //    62: astore_3       
        //    63: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    65: monitorexit    
        //    66: aload_3        
        //    67: athrow         
        //    68: aload           5
        //    70: aload_2        
        //    71: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    74: ifne            43
        //    77: invokestatic    com/whatsapp/fieldstats/bo.b:()Ljava/nio/ByteBuffer;
        //    80: astore          10
        //    82: aload_2        
        //    83: ifnonnull       113
        //    86: aload_1        
        //    87: invokevirtual   com/whatsapp/fieldstats/o.getType:()B
        //    90: aload_1        
        //    91: invokevirtual   com/whatsapp/fieldstats/o.getCode:()I
        //    94: invokestatic    java/lang/System.currentTimeMillis:()J
        //    97: ldc2_w          NaN
        //   100: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   103: aload           10
        //   105: invokestatic    com/whatsapp/fieldstats/bo.a:(BIJLjava/lang/Double;Ljava/nio/ByteBuffer;)V
        //   108: iload           4
        //   110: ifeq            130
        //   113: aload_1        
        //   114: invokevirtual   com/whatsapp/fieldstats/o.getType:()B
        //   117: aload_1        
        //   118: invokevirtual   com/whatsapp/fieldstats/o.getCode:()I
        //   121: invokestatic    java/lang/System.currentTimeMillis:()J
        //   124: aload_2        
        //   125: aload           10
        //   127: invokestatic    com/whatsapp/fieldstats/bo.a:(BIJLjava/lang/String;Ljava/nio/ByteBuffer;)V
        //   130: aload           10
        //   132: invokevirtual   java/nio/ByteBuffer.flip:()Ljava/nio/Buffer;
        //   135: pop            
        //   136: aload_2        
        //   137: ifnonnull       163
        //   140: getstatic       com/whatsapp/fieldstats/a5.g:Ljava/util/EnumMap;
        //   143: aload_1        
        //   144: aconst_null    
        //   145: invokevirtual   java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
        //   148: pop            
        //   149: getstatic       com/whatsapp/fieldstats/a5.c:Ljava/util/EnumMap;
        //   152: aload_1        
        //   153: aconst_null    
        //   154: invokevirtual   java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
        //   157: pop            
        //   158: iload           4
        //   160: ifeq            172
        //   163: getstatic       com/whatsapp/fieldstats/a5.c:Ljava/util/EnumMap;
        //   166: aload_1        
        //   167: aload_2        
        //   168: invokevirtual   java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
        //   171: pop            
        //   172: aload_0        
        //   173: aload           10
        //   175: iconst_1       
        //   176: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Ljava/nio/ByteBuffer;Z)V
        //   179: goto            43
        //   182: astore          11
        //   184: aload           11
        //   186: athrow         
        //   187: astore          12
        //   189: aload           12
        //   191: athrow         
        //   192: astore          13
        //   194: aload           13
        //   196: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      20     62     68     Any
        //  20     29     47     62     Ljava/lang/IllegalStateException;
        //  20     29     62     68     Any
        //  49     52     52     62     Ljava/lang/IllegalStateException;
        //  49     52     62     68     Any
        //  54     57     57     62     Ljava/lang/IllegalStateException;
        //  54     57     62     68     Any
        //  59     62     62     68     Any
        //  68     77     62     68     Any
        //  77     82     62     68     Any
        //  86     108    182    187    Ljava/lang/IllegalStateException;
        //  86     108    62     68     Any
        //  113    130    182    187    Ljava/lang/IllegalStateException;
        //  113    130    62     68     Any
        //  130    136    187    192    Ljava/lang/IllegalStateException;
        //  130    136    62     68     Any
        //  140    158    192    197    Ljava/lang/IllegalStateException;
        //  140    158    62     68     Any
        //  163    172    192    197    Ljava/lang/IllegalStateException;
        //  163    172    62     68     Any
        //  172    179    62     68     Any
        //  184    187    62     68     Any
        //  189    192    192    197    Ljava/lang/IllegalStateException;
        //  189    192    62     68     Any
        //  194    197    62     68     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 99, Size: 99
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
    
    public static void a(final Context context, final s s) {
        double n;
        if (s == null) {
            n = Double.NaN;
        }
        else {
            n = s.getCode();
        }
        a(context, o.PLATFORM, Double.valueOf(n));
    }
    
    private static void a(final Context p0, final ByteBuffer p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: getstatic       com/whatsapp/fieldstats/a5.a:Ljava/io/OutputStream;
        //     6: astore          5
        //     8: aload           5
        //    10: ifnonnull       18
        //    13: aload_0        
        //    14: invokestatic    com/whatsapp/fieldstats/a5.r:(Landroid/content/Context;)Z
        //    17: pop            
        //    18: getstatic       com/whatsapp/fieldstats/a5.a:Ljava/io/OutputStream;
        //    21: astore          7
        //    23: aload           7
        //    25: ifnonnull       36
        //    28: aload_0        
        //    29: invokestatic    com/whatsapp/fieldstats/a5.g:(Landroid/content/Context;)V
        //    32: aload_0        
        //    33: invokestatic    com/whatsapp/fieldstats/a5.p:(Landroid/content/Context;)V
        //    36: getstatic       com/whatsapp/fieldstats/a5.a:Ljava/io/OutputStream;
        //    39: astore          8
        //    41: aload           8
        //    43: ifnull          134
        //    46: getstatic       com/whatsapp/fieldstats/a5.a:Ljava/io/OutputStream;
        //    49: aload_1        
        //    50: invokevirtual   java/nio/ByteBuffer.array:()[B
        //    53: aload_1        
        //    54: invokevirtual   java/nio/ByteBuffer.arrayOffset:()I
        //    57: aload_1        
        //    58: invokevirtual   java/nio/ByteBuffer.remaining:()I
        //    61: invokevirtual   java/io/OutputStream.write:([BII)V
        //    64: iload_2        
        //    65: ifne            82
        //    68: getstatic       com/whatsapp/fieldstats/a5.f:Landroid/os/Handler;
        //    71: iconst_0       
        //    72: invokevirtual   android/os/Handler.hasMessages:(I)Z
        //    75: istore          12
        //    77: iload           12
        //    79: ifeq            209
        //    82: iconst_1       
        //    83: istore          13
        //    85: getstatic       com/whatsapp/fieldstats/a5.f:Landroid/os/Handler;
        //    88: iconst_1       
        //    89: invokevirtual   android/os/Handler.removeMessages:(I)V
        //    92: getstatic       com/whatsapp/fieldstats/a5.f:Landroid/os/Handler;
        //    95: iconst_0       
        //    96: invokevirtual   android/os/Handler.removeMessages:(I)V
        //    99: getstatic       com/whatsapp/fieldstats/a5.f:Landroid/os/Handler;
        //   102: astore          15
        //   104: iconst_0       
        //   105: istore          16
        //   107: iload           13
        //   109: ifeq            220
        //   112: aload           15
        //   114: iload           16
        //   116: aload_0        
        //   117: invokestatic    android/os/Message.obtain:(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
        //   120: astore          17
        //   122: getstatic       com/whatsapp/fieldstats/a5.f:Landroid/os/Handler;
        //   125: aload           17
        //   127: ldc2_w          500
        //   130: invokevirtual   android/os/Handler.sendMessageDelayed:(Landroid/os/Message;J)Z
        //   133: pop            
        //   134: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   136: monitorexit    
        //   137: return         
        //   138: astore          4
        //   140: aload           4
        //   142: athrow         
        //   143: astore_3       
        //   144: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   146: monitorexit    
        //   147: aload_3        
        //   148: athrow         
        //   149: astore          20
        //   151: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //   154: iconst_2       
        //   155: aaload         
        //   156: aload           20
        //   158: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   161: goto            18
        //   164: astore          6
        //   166: aload           6
        //   168: athrow         
        //   169: astore          19
        //   171: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //   174: iconst_3       
        //   175: aaload         
        //   176: aload           19
        //   178: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   181: goto            36
        //   184: astore          9
        //   186: aload           9
        //   188: athrow         
        //   189: astore          10
        //   191: aload           10
        //   193: athrow         
        //   194: astore          11
        //   196: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //   199: iconst_1       
        //   200: aaload         
        //   201: aload           11
        //   203: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   206: goto            134
        //   209: iconst_0       
        //   210: istore          13
        //   212: goto            85
        //   215: astore          14
        //   217: aload           14
        //   219: athrow         
        //   220: iconst_1       
        //   221: istore          16
        //   223: goto            112
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      8      138    143    Ljava/lang/IllegalStateException;
        //  3      8      143    149    Any
        //  13     18     149    164    Ljava/io/IOException;
        //  13     18     138    143    Ljava/lang/IllegalStateException;
        //  13     18     143    149    Any
        //  18     23     164    169    Ljava/lang/IllegalStateException;
        //  18     23     143    149    Any
        //  28     36     169    184    Ljava/io/IOException;
        //  28     36     164    169    Ljava/lang/IllegalStateException;
        //  28     36     143    149    Any
        //  36     41     143    149    Any
        //  46     64     184    194    Ljava/io/IOException;
        //  46     64     143    149    Any
        //  68     77     184    194    Ljava/io/IOException;
        //  68     77     143    149    Any
        //  85     104    215    220    Ljava/io/IOException;
        //  85     104    143    149    Any
        //  112    134    194    209    Ljava/io/IOException;
        //  112    134    143    149    Any
        //  140    143    143    149    Any
        //  151    161    143    149    Any
        //  166    169    143    149    Any
        //  171    181    143    149    Any
        //  186    189    189    194    Ljava/io/IOException;
        //  186    189    143    149    Any
        //  191    194    194    209    Ljava/io/IOException;
        //  191    194    143    149    Any
        //  196    206    143    149    Any
        //  217    220    194    209    Ljava/io/IOException;
        //  217    220    143    149    Any
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
    
    public static boolean a(final Context context) {
        synchronized (a5.class) {
            final File file = new File(context.getFilesDir(), a5.z[0]);
            try {
                final long n = lcmp(file.length(), 0L);
                boolean b = false;
                if (n > 0) {
                    b = true;
                }
                return b;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    private static void b() {
        synchronized (a5.class) {
            try {
                if (a5.a != null) {
                    a5.a.close();
                    a5.a = null;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    public static byte[] b(final Context context) {
        // monitorenter(a5.class)
        try {
            final int i = aj.a;
            final File file = new File(context.getFilesDir(), a5.z[5]);
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int)file.length());
            try {
                final FileInputStream fileInputStream = new FileInputStream(file);
                final byte[] array = new byte[8192];
                do {
                    final int read = fileInputStream.read(array);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(array, 0, read);
                } while (i == 0);
                fileInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            catch (FileNotFoundException ex) {
                Log.c(ex);
            }
            catch (IOException ex2) {
                Log.b(ex2);
            }
        }
        finally {}
    }
    
    private static void c(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: invokestatic    com/whatsapp/fieldstats/a5.b:()V
        //     6: new             Ljava/io/File;
        //     9: dup            
        //    10: aload_0        
        //    11: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    14: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    17: bipush          21
        //    19: aaload         
        //    20: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    23: astore_2       
        //    24: new             Ljava/io/File;
        //    27: dup            
        //    28: aload_0        
        //    29: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    32: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    35: bipush          22
        //    37: aaload         
        //    38: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    41: astore_3       
        //    42: aload_3        
        //    43: invokevirtual   java/io/File.exists:()Z
        //    46: istore          6
        //    48: iload           6
        //    50: ifeq            91
        //    53: aload_3        
        //    54: invokevirtual   java/io/File.delete:()Z
        //    57: ifne            91
        //    60: new             Ljava/lang/StringBuilder;
        //    63: dup            
        //    64: invokespecial   java/lang/StringBuilder.<init>:()V
        //    67: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    70: bipush          24
        //    72: aaload         
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    76: aload_3        
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    80: bipush          41
        //    82: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    85: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    88: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    91: aload_2        
        //    92: invokevirtual   java/io/File.exists:()Z
        //    95: istore          9
        //    97: iload           9
        //    99: ifeq            185
        //   102: aload_2        
        //   103: aload_3        
        //   104: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   107: ifne            185
        //   110: new             Ljava/io/IOException;
        //   113: dup            
        //   114: new             Ljava/lang/StringBuilder;
        //   117: dup            
        //   118: invokespecial   java/lang/StringBuilder.<init>:()V
        //   121: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //   124: bipush          23
        //   126: aaload         
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: aload_2        
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   134: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //   137: bipush          20
        //   139: aaload         
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   143: aload_3        
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   147: bipush          41
        //   149: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   152: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   155: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   158: athrow         
        //   159: astore          8
        //   161: aload           8
        //   163: athrow         
        //   164: astore_1       
        //   165: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   167: monitorexit    
        //   168: aload_1        
        //   169: athrow         
        //   170: astore          4
        //   172: aload           4
        //   174: athrow         
        //   175: astore          5
        //   177: aload           5
        //   179: athrow         
        //   180: astore          7
        //   182: aload           7
        //   184: athrow         
        //   185: aload_0        
        //   186: invokestatic    com/whatsapp/fieldstats/a5.l:(Landroid/content/Context;)V
        //   189: aload_0        
        //   190: invokestatic    java/lang/System.currentTimeMillis:()J
        //   193: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;J)V
        //   196: aload_0        
        //   197: invokestatic    com/whatsapp/fieldstats/a5.g:(Landroid/content/Context;)V
        //   200: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   202: monitorexit    
        //   203: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      42     164    170    Any
        //  42     48     170    175    Ljava/lang/IllegalStateException;
        //  42     48     164    170    Any
        //  53     91     175    180    Ljava/lang/IllegalStateException;
        //  53     91     164    170    Any
        //  91     97     180    185    Ljava/lang/IllegalStateException;
        //  91     97     164    170    Any
        //  102    159    159    164    Ljava/lang/IllegalStateException;
        //  102    159    164    170    Any
        //  161    164    164    170    Any
        //  172    175    175    180    Ljava/lang/IllegalStateException;
        //  172    175    164    170    Any
        //  177    180    164    170    Any
        //  182    185    159    164    Ljava/lang/IllegalStateException;
        //  182    185    164    170    Any
        //  185    200    164    170    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 100, Size: 100
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
    
    public static boolean d(final Context context) {
        synchronized (a5.class) {
            return new File(context.getFilesDir(), a5.z[29]).delete();
        }
    }
    
    public static boolean e(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: new             Ljava/io/File;
        //     6: dup            
        //     7: aload_0        
        //     8: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    11: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    14: bipush          6
        //    16: aaload         
        //    17: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    20: astore_1       
        //    21: aload_1        
        //    22: invokevirtual   java/io/File.length:()J
        //    25: lstore          5
        //    27: lload           5
        //    29: ldc2_w          153600
        //    32: lcmp           
        //    33: iflt            70
        //    36: aload_0        
        //    37: invokestatic    com/whatsapp/fieldstats/a5.m:(Landroid/content/Context;)Z
        //    40: istore          8
        //    42: iload           8
        //    44: ifeq            70
        //    47: iconst_1       
        //    48: istore          7
        //    50: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    52: monitorexit    
        //    53: iload           7
        //    55: ireturn        
        //    56: astore_3       
        //    57: aload_3        
        //    58: athrow         
        //    59: astore          4
        //    61: aload           4
        //    63: athrow         
        //    64: astore_2       
        //    65: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    67: monitorexit    
        //    68: aload_2        
        //    69: athrow         
        //    70: iconst_0       
        //    71: istore          7
        //    73: goto            50
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      21     64     70     Any
        //  21     27     56     59     Ljava/lang/IllegalStateException;
        //  21     27     64     70     Any
        //  36     42     59     64     Ljava/lang/IllegalStateException;
        //  36     42     64     70     Any
        //  57     59     59     64     Ljava/lang/IllegalStateException;
        //  57     59     64     70     Any
        //  61     64     64     70     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
    
    private static void f(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: new             Ljava/io/File;
        //     6: dup            
        //     7: aload_0        
        //     8: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    11: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    14: bipush          11
        //    16: aaload         
        //    17: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    20: astore_1       
        //    21: aconst_null    
        //    22: astore_2       
        //    23: new             Ljava/io/DataInputStream;
        //    26: dup            
        //    27: new             Ljava/io/FileInputStream;
        //    30: dup            
        //    31: aload_1        
        //    32: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    35: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    38: astore_3       
        //    39: aload_3        
        //    40: invokevirtual   java/io/DataInputStream.readLong:()J
        //    43: putstatic       com/whatsapp/fieldstats/a5.d:J
        //    46: aload_3        
        //    47: ifnull          54
        //    50: aload_3        
        //    51: invokevirtual   java/io/DataInputStream.close:()V
        //    54: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    56: monitorexit    
        //    57: return         
        //    58: astore          15
        //    60: aconst_null    
        //    61: astore_3       
        //    62: ldc2_w          -1
        //    65: putstatic       com/whatsapp/fieldstats/a5.d:J
        //    68: aload_3        
        //    69: ifnull          54
        //    72: aload_3        
        //    73: invokevirtual   java/io/DataInputStream.close:()V
        //    76: goto            54
        //    79: astore          10
        //    81: goto            54
        //    84: astore          12
        //    86: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    89: bipush          12
        //    91: aaload         
        //    92: aload           12
        //    94: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    97: ldc2_w          -1
        //   100: putstatic       com/whatsapp/fieldstats/a5.d:J
        //   103: aload_2        
        //   104: ifnull          54
        //   107: aload_2        
        //   108: invokevirtual   java/io/DataInputStream.close:()V
        //   111: goto            54
        //   114: astore          13
        //   116: goto            54
        //   119: astore          6
        //   121: aload_2        
        //   122: ifnull          129
        //   125: aload_2        
        //   126: invokevirtual   java/io/DataInputStream.close:()V
        //   129: aload           6
        //   131: athrow         
        //   132: astore          7
        //   134: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   136: monitorexit    
        //   137: aload           7
        //   139: athrow         
        //   140: astore          9
        //   142: aload           9
        //   144: athrow         
        //   145: astore          14
        //   147: goto            54
        //   150: astore          8
        //   152: goto            129
        //   155: astore          5
        //   157: aload_3        
        //   158: astore_2       
        //   159: aload           5
        //   161: astore          6
        //   163: goto            121
        //   166: astore          11
        //   168: aload_3        
        //   169: astore_2       
        //   170: aload           11
        //   172: astore          12
        //   174: goto            86
        //   177: astore          4
        //   179: goto            62
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      21     132    140    Any
        //  23     39     58     62     Ljava/io/FileNotFoundException;
        //  23     39     84     86     Ljava/io/IOException;
        //  23     39     119    121    Any
        //  39     46     177    182    Ljava/io/FileNotFoundException;
        //  39     46     166    177    Ljava/io/IOException;
        //  39     46     155    166    Any
        //  50     54     145    150    Ljava/io/IOException;
        //  50     54     132    140    Any
        //  62     68     155    166    Any
        //  72     76     79     84     Ljava/io/IOException;
        //  72     76     132    140    Any
        //  86     103    119    121    Any
        //  107    111    114    119    Ljava/io/IOException;
        //  107    111    132    140    Any
        //  125    129    150    155    Ljava/io/IOException;
        //  125    129    140    145    Ljava/lang/IllegalStateException;
        //  125    129    132    140    Any
        //  129    132    132    140    Any
        //  142    145    132    140    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
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
    
    private static void g(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: new             Ljava/io/File;
        //     6: dup            
        //     7: aload_0        
        //     8: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    11: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    14: bipush          13
        //    16: aaload         
        //    17: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    20: astore_1       
        //    21: invokestatic    java/lang/System.currentTimeMillis:()J
        //    24: lstore_3       
        //    25: lload_3        
        //    26: ldc2_w          1000
        //    29: ldiv           
        //    30: lstore          7
        //    32: lload           7
        //    34: lconst_0       
        //    35: lcmp           
        //    36: iflt            51
        //    39: lload_3        
        //    40: ldc2_w          1000
        //    43: ldiv           
        //    44: ldc2_w          4294967296
        //    47: lcmp           
        //    48: iflt            98
        //    51: new             Ljava/lang/IllegalStateException;
        //    54: dup            
        //    55: new             Ljava/lang/StringBuilder;
        //    58: dup            
        //    59: invokespecial   java/lang/StringBuilder.<init>:()V
        //    62: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    65: bipush          14
        //    67: aaload         
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: lload_3        
        //    72: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    75: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    78: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    81: athrow         
        //    82: astore          6
        //    84: aload           6
        //    86: athrow         
        //    87: astore_2       
        //    88: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    90: monitorexit    
        //    91: aload_2        
        //    92: athrow         
        //    93: astore          5
        //    95: aload           5
        //    97: athrow         
        //    98: new             Ljava/io/BufferedOutputStream;
        //   101: dup            
        //   102: new             Ljava/io/FileOutputStream;
        //   105: dup            
        //   106: aload_1        
        //   107: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   110: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   113: astore          9
        //   115: lload_3        
        //   116: aload           9
        //   118: invokestatic    com/whatsapp/fieldstats/a5.a:(JLjava/io/OutputStream;)V
        //   121: aload           9
        //   123: putstatic       com/whatsapp/fieldstats/a5.a:Ljava/io/OutputStream;
        //   126: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   128: monitorexit    
        //   129: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      25     87     93     Any
        //  25     32     93     98     Ljava/lang/IllegalStateException;
        //  25     32     87     93     Any
        //  39     51     82     87     Ljava/lang/IllegalStateException;
        //  39     51     87     93     Any
        //  51     82     82     87     Ljava/lang/IllegalStateException;
        //  51     82     87     93     Any
        //  84     87     87     93     Any
        //  95     98     82     87     Ljava/lang/IllegalStateException;
        //  95     98     87     93     Any
        //  98     126    87     93     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    private static boolean h(final Context context) {
        while (true) {
            synchronized (a5.class) {
                final File file = new File(context.getFilesDir(), a5.z[16]);
                try {
                    if (file.length() >= 524288L) {
                        return true;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            return false;
        }
    }
    
    public static boolean i(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: getstatic       com/whatsapp/fieldstats/a5.d:J
        //     6: lconst_0       
        //     7: lcmp           
        //     8: ifne            15
        //    11: aload_0        
        //    12: invokestatic    com/whatsapp/fieldstats/a5.f:(Landroid/content/Context;)V
        //    15: ldc2_w          86400000
        //    18: getstatic       com/whatsapp/fieldstats/a5.d:J
        //    21: ladd           
        //    22: lstore          5
        //    24: invokestatic    java/lang/System.currentTimeMillis:()J
        //    27: lstore          7
        //    29: lload           5
        //    31: lload           7
        //    33: lcmp           
        //    34: ifge            74
        //    37: aload_0        
        //    38: invokestatic    com/whatsapp/fieldstats/a5.m:(Landroid/content/Context;)Z
        //    41: istore          10
        //    43: iload           10
        //    45: ifeq            74
        //    48: iconst_1       
        //    49: istore          9
        //    51: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    53: monitorexit    
        //    54: iload           9
        //    56: ireturn        
        //    57: astore_2       
        //    58: aload_2        
        //    59: athrow         
        //    60: astore_1       
        //    61: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    63: monitorexit    
        //    64: aload_1        
        //    65: athrow         
        //    66: astore_3       
        //    67: aload_3        
        //    68: athrow         
        //    69: astore          4
        //    71: aload           4
        //    73: athrow         
        //    74: iconst_0       
        //    75: istore          9
        //    77: goto            51
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      15     57     60     Ljava/lang/IllegalStateException;
        //  3      15     60     66     Any
        //  15     29     66     69     Ljava/lang/IllegalStateException;
        //  15     29     60     66     Any
        //  37     43     69     74     Ljava/lang/IllegalStateException;
        //  37     43     60     66     Any
        //  58     60     60     66     Any
        //  67     69     69     74     Ljava/lang/IllegalStateException;
        //  67     69     60     66     Any
        //  71     74     60     66     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 46, Size: 46
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
    
    public static void j(final Context context) {
        synchronized (a5.class) {
            try {
                q(context);
            }
            catch (IOException ex) {
                Log.b(a5.z[8], ex);
                l(context);
            }
        }
    }
    
    private static void k(final Context context) {
        synchronized (a5.class) {
            try {
                o(context);
            }
            catch (IOException ex) {
                Log.b(a5.z[15], ex);
                l(context);
            }
        }
    }
    
    private static void l(final Context context) {
        synchronized (a5.class) {
            new File(context.getFilesDir(), a5.z[4]).delete();
        }
    }
    
    public static boolean m(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     4: monitorenter   
        //     5: aload_0        
        //     6: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;)Z
        //     9: ifeq            51
        //    12: aload_0        
        //    13: invokestatic    com/whatsapp/fieldstats/a5.h:(Landroid/content/Context;)Z
        //    16: istore          8
        //    18: iload           8
        //    20: ifne            51
        //    23: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    26: bipush          19
        //    28: aaload         
        //    29: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    32: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    34: monitorexit    
        //    35: iload_1        
        //    36: ireturn        
        //    37: astore_3       
        //    38: aload_3        
        //    39: athrow         
        //    40: astore          4
        //    42: aload           4
        //    44: athrow         
        //    45: astore_2       
        //    46: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    48: monitorexit    
        //    49: aload_2        
        //    50: athrow         
        //    51: aload_0        
        //    52: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;)Z
        //    55: ifeq            72
        //    58: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    61: bipush          17
        //    63: aaload         
        //    64: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    67: aload_0        
        //    68: invokestatic    com/whatsapp/fieldstats/a5.d:(Landroid/content/Context;)Z
        //    71: pop            
        //    72: aload_0        
        //    73: invokestatic    com/whatsapp/fieldstats/a5.c:(Landroid/content/Context;)V
        //    76: aload_0        
        //    77: invokestatic    com/whatsapp/fieldstats/a5.p:(Landroid/content/Context;)V
        //    80: iconst_1       
        //    81: istore_1       
        //    82: goto            32
        //    85: astore          5
        //    87: aload           5
        //    89: athrow         
        //    90: astore          6
        //    92: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    95: bipush          18
        //    97: aaload         
        //    98: aload           6
        //   100: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   103: iconst_0       
        //   104: istore_1       
        //   105: goto            32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      18     37     40     Ljava/io/IOException;
        //  5      18     45     51     Any
        //  23     32     40     45     Ljava/io/IOException;
        //  23     32     45     51     Any
        //  38     40     40     45     Ljava/io/IOException;
        //  38     40     45     51     Any
        //  42     45     45     51     Any
        //  51     72     85     90     Ljava/io/IOException;
        //  51     72     45     51     Any
        //  72     80     90     108    Ljava/io/IOException;
        //  72     80     45     51     Any
        //  87     90     45     51     Any
        //  92     103    45     51     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    static void n(final Context context) {
        k(context);
    }
    
    private static void o(final Context context) {
        synchronized (a5.class) {
            final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), a5.z[7]))));
            objectOutputStream.writeObject(a5.g);
            objectOutputStream.writeObject(a5.c);
            objectOutputStream.close();
        }
    }
    
    private static void p(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: getstatic       com/whatsapp/fieldstats/aj.a:I
        //     6: istore_2       
        //     7: getstatic       com/whatsapp/fieldstats/a5.a:Ljava/io/OutputStream;
        //    10: ifnull          279
        //    13: invokestatic    java/lang/System.currentTimeMillis:()J
        //    16: lstore_3       
        //    17: invokestatic    com/whatsapp/fieldstats/bo.a:()Ljava/nio/ByteBuffer;
        //    20: astore          5
        //    22: getstatic       com/whatsapp/fieldstats/a5.g:Ljava/util/EnumMap;
        //    25: invokevirtual   java/util/EnumMap.entrySet:()Ljava/util/Set;
        //    28: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    33: astore          6
        //    35: aload           6
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: ifeq            146
        //    45: aload           6
        //    47: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    52: checkcast       Ljava/util/Map$Entry;
        //    55: astore          13
        //    57: aload           13
        //    59: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    64: ifnull          142
        //    67: aload           5
        //    69: invokevirtual   java/nio/ByteBuffer.clear:()Ljava/nio/Buffer;
        //    72: pop            
        //    73: aload           13
        //    75: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    80: checkcast       Lcom/whatsapp/fieldstats/o;
        //    83: invokevirtual   com/whatsapp/fieldstats/o.getType:()B
        //    86: aload           13
        //    88: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    93: checkcast       Lcom/whatsapp/fieldstats/o;
        //    96: invokevirtual   com/whatsapp/fieldstats/o.getCode:()I
        //    99: lload_3        
        //   100: aload           13
        //   102: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   107: checkcast       Ljava/lang/Double;
        //   110: aload           5
        //   112: invokestatic    com/whatsapp/fieldstats/bo.a:(BIJLjava/lang/Double;Ljava/nio/ByteBuffer;)V
        //   115: aload           5
        //   117: invokevirtual   java/nio/ByteBuffer.flip:()Ljava/nio/Buffer;
        //   120: pop            
        //   121: getstatic       com/whatsapp/fieldstats/a5.a:Ljava/io/OutputStream;
        //   124: aload           5
        //   126: invokevirtual   java/nio/ByteBuffer.array:()[B
        //   129: aload           5
        //   131: invokevirtual   java/nio/ByteBuffer.arrayOffset:()I
        //   134: aload           5
        //   136: invokevirtual   java/nio/ByteBuffer.remaining:()I
        //   139: invokevirtual   java/io/OutputStream.write:([BII)V
        //   142: iload_2        
        //   143: ifeq            35
        //   146: invokestatic    com/whatsapp/fieldstats/bo.b:()Ljava/nio/ByteBuffer;
        //   149: astore          7
        //   151: getstatic       com/whatsapp/fieldstats/a5.c:Ljava/util/EnumMap;
        //   154: invokevirtual   java/util/EnumMap.entrySet:()Ljava/util/Set;
        //   157: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   162: astore          8
        //   164: aload           8
        //   166: invokeinterface java/util/Iterator.hasNext:()Z
        //   171: ifeq            275
        //   174: aload           8
        //   176: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   181: checkcast       Ljava/util/Map$Entry;
        //   184: astore          9
        //   186: aload           9
        //   188: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   193: ifnull          271
        //   196: aload           7
        //   198: invokevirtual   java/nio/ByteBuffer.clear:()Ljava/nio/Buffer;
        //   201: pop            
        //   202: aload           9
        //   204: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   209: checkcast       Lcom/whatsapp/fieldstats/o;
        //   212: invokevirtual   com/whatsapp/fieldstats/o.getType:()B
        //   215: aload           9
        //   217: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   222: checkcast       Lcom/whatsapp/fieldstats/o;
        //   225: invokevirtual   com/whatsapp/fieldstats/o.getCode:()I
        //   228: lload_3        
        //   229: aload           9
        //   231: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   236: checkcast       Ljava/lang/String;
        //   239: aload           7
        //   241: invokestatic    com/whatsapp/fieldstats/bo.a:(BIJLjava/lang/String;Ljava/nio/ByteBuffer;)V
        //   244: aload           7
        //   246: invokevirtual   java/nio/ByteBuffer.flip:()Ljava/nio/Buffer;
        //   249: pop            
        //   250: getstatic       com/whatsapp/fieldstats/a5.a:Ljava/io/OutputStream;
        //   253: aload           7
        //   255: invokevirtual   java/nio/ByteBuffer.array:()[B
        //   258: aload           7
        //   260: invokevirtual   java/nio/ByteBuffer.arrayOffset:()I
        //   263: aload           7
        //   265: invokevirtual   java/nio/ByteBuffer.remaining:()I
        //   268: invokevirtual   java/io/OutputStream.write:([BII)V
        //   271: iload_2        
        //   272: ifeq            164
        //   275: aload_0        
        //   276: invokestatic    com/whatsapp/fieldstats/a5.k:(Landroid/content/Context;)V
        //   279: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   281: monitorexit    
        //   282: return         
        //   283: astore          14
        //   285: aload           14
        //   287: athrow         
        //   288: astore_1       
        //   289: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   291: monitorexit    
        //   292: aload_1        
        //   293: athrow         
        //   294: astore          10
        //   296: aload           10
        //   298: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      35     288    294    Any
        //  35     57     288    294    Any
        //  57     142    283    288    Ljava/lang/IllegalStateException;
        //  57     142    288    294    Any
        //  146    164    288    294    Any
        //  164    186    288    294    Any
        //  186    271    294    299    Ljava/lang/IllegalStateException;
        //  186    271    288    294    Any
        //  275    279    288    294    Any
        //  285    288    288    294    Any
        //  296    299    288    294    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0271:
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
    
    private static void q(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //     2: monitorenter   
        //     3: getstatic       com/whatsapp/fieldstats/a5.g:Ljava/util/EnumMap;
        //     6: invokevirtual   java/util/EnumMap.clear:()V
        //     9: getstatic       com/whatsapp/fieldstats/a5.c:Ljava/util/EnumMap;
        //    12: invokevirtual   java/util/EnumMap.clear:()V
        //    15: new             Ljava/io/File;
        //    18: dup            
        //    19: aload_0        
        //    20: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    23: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    26: bipush          9
        //    28: aaload         
        //    29: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    32: astore_2       
        //    33: aload_2        
        //    34: invokevirtual   java/io/File.exists:()Z
        //    37: ifeq            51
        //    40: aload_2        
        //    41: invokevirtual   java/io/File.canRead:()Z
        //    44: istore          7
        //    46: iload           7
        //    48: ifne            111
        //    51: aload_2        
        //    52: invokevirtual   java/io/File.exists:()Z
        //    55: istore          6
        //    57: iload           6
        //    59: ifeq            88
        //    62: new             Ljava/lang/StringBuilder;
        //    65: dup            
        //    66: invokespecial   java/lang/StringBuilder.<init>:()V
        //    69: aload_2        
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    73: getstatic       com/whatsapp/fieldstats/a5.z:[Ljava/lang/String;
        //    76: bipush          10
        //    78: aaload         
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    85: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    88: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //    90: monitorexit    
        //    91: return         
        //    92: astore_3       
        //    93: aload_3        
        //    94: athrow         
        //    95: astore          4
        //    97: aload           4
        //    99: athrow         
        //   100: astore          5
        //   102: aload           5
        //   104: athrow         
        //   105: astore_1       
        //   106: ldc             Lcom/whatsapp/fieldstats/a5;.class
        //   108: monitorexit    
        //   109: aload_1        
        //   110: athrow         
        //   111: new             Ljava/io/ObjectInputStream;
        //   114: dup            
        //   115: new             Ljava/io/BufferedInputStream;
        //   118: dup            
        //   119: new             Ljava/io/FileInputStream;
        //   122: dup            
        //   123: aload_2        
        //   124: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   127: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //   130: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //   133: astore          8
        //   135: aload           8
        //   137: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //   140: checkcast       Ljava/util/EnumMap;
        //   143: astore          11
        //   145: aload           8
        //   147: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //   150: checkcast       Ljava/util/EnumMap;
        //   153: astore          12
        //   155: getstatic       com/whatsapp/fieldstats/a5.g:Ljava/util/EnumMap;
        //   158: aload           11
        //   160: invokevirtual   java/util/EnumMap.putAll:(Ljava/util/Map;)V
        //   163: getstatic       com/whatsapp/fieldstats/a5.c:Ljava/util/EnumMap;
        //   166: aload           12
        //   168: invokevirtual   java/util/EnumMap.putAll:(Ljava/util/Map;)V
        //   171: aload           8
        //   173: invokevirtual   java/io/ObjectInputStream.close:()V
        //   176: goto            88
        //   179: astore          9
        //   181: aload           9
        //   183: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   186: aload_2        
        //   187: invokevirtual   java/io/File.delete:()Z
        //   190: pop            
        //   191: goto            171
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      33     105    111    Any
        //  33     46     92     95     Ljava/lang/Exception;
        //  33     46     105    111    Any
        //  51     57     95     100    Ljava/lang/Exception;
        //  51     57     105    111    Any
        //  62     88     100    105    Ljava/lang/Exception;
        //  62     88     105    111    Any
        //  93     95     95     100    Ljava/lang/Exception;
        //  93     95     105    111    Any
        //  97     100    100    105    Ljava/lang/Exception;
        //  97     100    105    111    Any
        //  102    105    105    111    Any
        //  111    135    105    111    Any
        //  135    171    179    194    Ljava/lang/Exception;
        //  135    171    105    111    Any
        //  171    176    105    111    Any
        //  181    191    105    111    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 91, Size: 91
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    private static boolean r(final Context context) {
        while (true) {
            final File file;
            synchronized (a5.class) {
                file = new File(context.getFilesDir(), a5.z[28]);
                try {
                    final boolean exists = file.exists();
                    final boolean b = false;
                    if (!exists) {
                        return b;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            try {
                final long n = lcmp(file.length(), 0L);
                boolean b = false;
                if (n != 0) {
                    final BufferedOutputStream a = new BufferedOutputStream(new FileOutputStream(file, true));
                    a(System.currentTimeMillis(), a);
                    a5.a = a;
                    b = true;
                    return b;
                }
                return b;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
}
