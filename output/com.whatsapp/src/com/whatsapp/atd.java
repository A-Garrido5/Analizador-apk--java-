// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.bi;
import java.io.IOException;
import com.whatsapp.util.Log;
import java.io.File;

public class atd
{
    public static Statistics$Data a;
    private static File b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = ";Pua\u0018~Qfx\u00030E'}\u001e?Vn}\u001e7At.\f7Nb";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'j';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = '\"';
                        break;
                    }
                    case 2: {
                        c2 = '\u0007';
                        break;
                    }
                    case 3: {
                        c2 = '\u000e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "-Vfz\u0003-Vnm\u0019";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "-Vfz\u0003-Vnm\u0019~";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "-Vfz\u0003-Vnm\u0019~Pb}\u000f*\u0002c{\u000f~Vh.\u0019;Pno\u00067Xfz\u00031L'm\u0002?L`kP~";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "-Vfz\u0003-Vnm\u0019~Pb}\u000f*\u0002c{\u000f~Vh.\u0003qM'k\u0012=Gwz\u00031L=.";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "-Vfz\u0003-Vnm\u0019~Pb}\u000f*\u0002c{\u000f~Vh.\u00077Qtg\u00049\u0002db\u000b-Q=.";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static void a() {
        atd.a = new Statistics$Data(true);
        try {
            c();
        }
        catch (IOException ex) {
            Log.b(atd.z[0], ex);
        }
    }
    
    public static void a(final byte b) {
        if (b == 0) {
            final Statistics$Data a = atd.a;
            ++a.tx_text_msgs;
            if (!App.I) {
                return;
            }
        }
        final Statistics$Data a2 = atd.a;
        ++a2.tx_media_msgs;
    }
    
    public static void a(final long n, final int n2) {
        final boolean i = App.I;
        Label_0100: {
            switch (n2) {
                case 0: {
                    final Statistics$Data a = atd.a;
                    a.tx_media_bytes += n;
                    if (i) {
                        break Label_0100;
                    }
                    break;
                }
                case 1: {
                    final Statistics$Data a2 = atd.a;
                    a2.tx_message_service_bytes += n;
                    if (i) {
                        break Label_0100;
                    }
                    break;
                }
                case 2: {
                    final Statistics$Data a3 = atd.a;
                    a3.tx_voip_bytes += n;
                    if (i) {
                        break Label_0100;
                    }
                    break;
                }
                case 3: {
                    final Statistics$Data a4 = atd.a;
                    a4.tx_google_drive_bytes += n;
                }
            }
        }
    }
    
    public static void a(final bi bi) {
        final long n = System.currentTimeMillis() - bi.u;
        if (n > 1000L) {
            final Statistics$Data a = atd.a;
            final long n2 = n + atd.a.rx_offline_delay * atd.a.rx_offline_msgs;
            final Statistics$Data a2 = atd.a;
            final long rx_offline_msgs = 1L + a2.rx_offline_msgs;
            a2.rx_offline_msgs = rx_offline_msgs;
            a.rx_offline_delay = n2 / rx_offline_msgs;
        }
        if (bi.I == 0) {
            final Statistics$Data a3 = atd.a;
            ++a3.rx_text_msgs;
            if (!App.I) {
                return;
            }
        }
        final Statistics$Data a4 = atd.a;
        ++a4.rx_media_msgs;
    }
    
    public static void a(final File file) {
        atd.b = new File(file, atd.z[1]);
        final boolean b = b();
        final Handler handler = new Handler();
        handler.postDelayed((Runnable)new gq(handler), 900000L);
        if (!b) {
            atd.a = new Statistics$Data(false);
        }
        Log.i(atd.z[2] + atd.a.toString());
    }
    
    public static void b(final long n, final int n2) {
        final boolean i = App.I;
        Label_0100: {
            switch (n2) {
                case 0: {
                    final Statistics$Data a = atd.a;
                    a.rx_media_bytes += n;
                    if (i) {
                        break Label_0100;
                    }
                    break;
                }
                case 1: {
                    final Statistics$Data a2 = atd.a;
                    a2.rx_message_service_bytes += n;
                    if (i) {
                        break Label_0100;
                    }
                    break;
                }
                case 2: {
                    final Statistics$Data a3 = atd.a;
                    a3.rx_voip_bytes += n;
                    if (i) {
                        break Label_0100;
                    }
                    break;
                }
                case 3: {
                    final Statistics$Data a4 = atd.a;
                    a4.rx_google_drive_bytes += n;
                }
            }
        }
    }
    
    public static void b(final bi bi) {
        if (bi.I == 8) {
            if (bi.a.b) {
                final Statistics$Data a = atd.a;
                ++a.tx_voip_calls;
                if (!App.I) {
                    return;
                }
            }
            final Statistics$Data a2 = atd.a;
            ++a2.rx_voip_calls;
        }
    }
    
    public static boolean b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/atd.b:Ljava/io/File;
        //     3: invokevirtual   java/io/File.exists:()Z
        //     6: ifeq            227
        //     9: aconst_null    
        //    10: astore_0       
        //    11: new             Ljava/io/ObjectInputStream;
        //    14: dup            
        //    15: new             Ljava/io/FileInputStream;
        //    18: dup            
        //    19: getstatic       com/whatsapp/atd.b:Ljava/io/File;
        //    22: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    25: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    28: astore_1       
        //    29: aload_1        
        //    30: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    33: checkcast       Lcom/whatsapp/Statistics$Data;
        //    36: putstatic       com/whatsapp/atd.a:Lcom/whatsapp/Statistics$Data;
        //    39: aload_1        
        //    40: ifnull          47
        //    43: aload_1        
        //    44: invokevirtual   java/io/ObjectInputStream.close:()V
        //    47: iconst_1       
        //    48: ireturn        
        //    49: astore_2       
        //    50: aconst_null    
        //    51: astore_1       
        //    52: new             Ljava/lang/StringBuilder;
        //    55: dup            
        //    56: invokespecial   java/lang/StringBuilder.<init>:()V
        //    59: getstatic       com/whatsapp/atd.z:[Ljava/lang/String;
        //    62: iconst_5       
        //    63: aaload         
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: aload_2        
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    71: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    74: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    77: new             Lcom/whatsapp/Statistics$Data;
        //    80: dup            
        //    81: iconst_1       
        //    82: invokespecial   com/whatsapp/Statistics$Data.<init>:(Z)V
        //    85: putstatic       com/whatsapp/atd.a:Lcom/whatsapp/Statistics$Data;
        //    88: aload_1        
        //    89: ifnull          96
        //    92: aload_1        
        //    93: invokevirtual   java/io/ObjectInputStream.close:()V
        //    96: iconst_1       
        //    97: ireturn        
        //    98: astore          7
        //   100: aload           7
        //   102: athrow         
        //   103: astore          8
        //   105: new             Ljava/lang/StringBuilder;
        //   108: dup            
        //   109: invokespecial   java/lang/StringBuilder.<init>:()V
        //   112: getstatic       com/whatsapp/atd.z:[Ljava/lang/String;
        //   115: iconst_3       
        //   116: aaload         
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: aload           8
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   125: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   128: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   131: new             Lcom/whatsapp/Statistics$Data;
        //   134: dup            
        //   135: iconst_1       
        //   136: invokespecial   com/whatsapp/Statistics$Data.<init>:(Z)V
        //   139: putstatic       com/whatsapp/atd.a:Lcom/whatsapp/Statistics$Data;
        //   142: aload_0        
        //   143: ifnull          150
        //   146: aload_0        
        //   147: invokevirtual   java/io/ObjectInputStream.close:()V
        //   150: iconst_1       
        //   151: ireturn        
        //   152: astore          10
        //   154: aload           10
        //   156: athrow         
        //   157: astore          11
        //   159: new             Ljava/lang/StringBuilder;
        //   162: dup            
        //   163: invokespecial   java/lang/StringBuilder.<init>:()V
        //   166: getstatic       com/whatsapp/atd.z:[Ljava/lang/String;
        //   169: iconst_4       
        //   170: aaload         
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: aload           11
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   179: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   182: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   185: new             Lcom/whatsapp/Statistics$Data;
        //   188: dup            
        //   189: iconst_1       
        //   190: invokespecial   com/whatsapp/Statistics$Data.<init>:(Z)V
        //   193: putstatic       com/whatsapp/atd.a:Lcom/whatsapp/Statistics$Data;
        //   196: aload_0        
        //   197: ifnull          204
        //   200: aload_0        
        //   201: invokevirtual   java/io/ObjectInputStream.close:()V
        //   204: iconst_1       
        //   205: ireturn        
        //   206: astore          13
        //   208: aload           13
        //   210: athrow         
        //   211: astore_3       
        //   212: aload_0        
        //   213: ifnull          220
        //   216: aload_0        
        //   217: invokevirtual   java/io/ObjectInputStream.close:()V
        //   220: aload_3        
        //   221: athrow         
        //   222: astore          5
        //   224: aload           5
        //   226: athrow         
        //   227: iconst_0       
        //   228: ireturn        
        //   229: astore          14
        //   231: goto            47
        //   234: astore          6
        //   236: goto            96
        //   239: astore          9
        //   241: goto            150
        //   244: astore          12
        //   246: goto            204
        //   249: astore          4
        //   251: goto            220
        //   254: astore_3       
        //   255: aload_1        
        //   256: astore_0       
        //   257: goto            212
        //   260: astore          11
        //   262: aload_1        
        //   263: astore_0       
        //   264: goto            159
        //   267: astore          8
        //   269: aload_1        
        //   270: astore_0       
        //   271: goto            105
        //   274: astore_2       
        //   275: goto            52
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  11     29     49     52     Ljava/lang/ClassNotFoundException;
        //  11     29     103    105    Ljava/io/InvalidClassException;
        //  11     29     157    159    Ljava/io/IOException;
        //  11     29     211    212    Any
        //  29     39     274    278    Ljava/lang/ClassNotFoundException;
        //  29     39     267    274    Ljava/io/InvalidClassException;
        //  29     39     260    267    Ljava/io/IOException;
        //  29     39     254    260    Any
        //  43     47     229    234    Ljava/io/IOException;
        //  52     88     254    260    Any
        //  92     96     234    239    Ljava/io/IOException;
        //  92     96     98     103    Ljava/lang/ClassNotFoundException;
        //  105    142    211    212    Any
        //  146    150    239    244    Ljava/io/IOException;
        //  146    150    152    157    Ljava/lang/ClassNotFoundException;
        //  159    196    211    212    Any
        //  200    204    244    249    Ljava/io/IOException;
        //  200    204    206    211    Ljava/lang/ClassNotFoundException;
        //  216    220    249    254    Ljava/io/IOException;
        //  216    220    222    227    Ljava/lang/ClassNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 139, Size: 139
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
    
    public static void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/ObjectOutputStream;
        //     3: dup            
        //     4: new             Lcom/whatsapp/util/c;
        //     7: dup            
        //     8: getstatic       com/whatsapp/App.T:Lcom/whatsapp/util/p;
        //    11: getstatic       com/whatsapp/atd.b:Ljava/io/File;
        //    14: invokespecial   com/whatsapp/util/c.<init>:(Lcom/whatsapp/util/p;Ljava/io/File;)V
        //    17: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    20: astore_0       
        //    21: aload_0        
        //    22: getstatic       com/whatsapp/atd.a:Lcom/whatsapp/Statistics$Data;
        //    25: invokevirtual   java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
        //    28: aload_0        
        //    29: ifnull          36
        //    32: aload_0        
        //    33: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    36: return         
        //    37: astore_1       
        //    38: aconst_null    
        //    39: astore_0       
        //    40: aload_0        
        //    41: ifnull          48
        //    44: aload_0        
        //    45: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    48: aload_1        
        //    49: athrow         
        //    50: astore_1       
        //    51: goto            40
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      21     37     40     Any
        //  21     28     50     54     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
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
}
