// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.Map;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.io.Writer;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.nio.charset.Charset;
import java.io.Closeable;

public final class n implements Closeable
{
    private static final Charset f;
    private static final String[] z;
    private long a;
    private final ExecutorService b;
    private final int c;
    private final File d;
    private final File e;
    private Writer g;
    private final int h;
    private final Callable i;
    private long j;
    private final long k;
    private final LinkedHashMap l;
    private final File m;
    private int n;
    
    static {
        final String[] z2 = new String[29];
        String s = "\tltnk";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0757:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '%';
                        break;
                    }
                    case 0: {
                        c2 = 'J';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = '1';
                        break;
                    }
                    case 3: {
                        c2 = '/';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0018epk";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0018e|`s\u000f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "?NTWU/CEJAjJ^ZW$A]\u000fI#NT\u0015\u0005";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000eic{|";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "?NTWU/CEJAjJ^ZW$A]\u000fI#NT\u0015\u0005";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0018epk\u0005";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "f\u0000";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "f\u0000";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "&ISLJ8E\u001fFJddX\\N\u0006RDlD)HT";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "?NTWU/CEJAjJ^ZW$A]\u000fM/AUJWp\u0000j";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "f\u0000";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = ",AXC@.\u0000E@\u0005.E]JQ/\u0000WFI/\u001a\u0011";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "$OE\u000fDjDX]@)T^]\\p\u0000";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = ",AXC@.\u0000E@\u0005.E]JQ/\u0000";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0018e|`s\u000f\u0000";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\tltnkj";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0018e|`s\u000f\u0000";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "/DX[\u0005.IUA\u0002>\u0000R]@+TT\u000fC#LT\u000f";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u000eic{|j";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "<A]Z@\tODAQj\u001c\f\u000f\u0015";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "'AI|L0E\u0011\u0013\u0018j\u0010";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\tltnkj";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "&ISLJ8E\u001fFJddX\\N\u0006RDlD)HT";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u000eic{|j";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = ")ARG@jIB\u000fF&OBJA";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "!EH\\\u0005'UB[\u0005$OE\u000fF%NENL$\u0000B_D)EB\u000fJ8\u0000_JR&I_JVp\u0000\u0013";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = " OD]K+L";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = " OD]K+L\u001f[H:";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    break Label_0757;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final char[] charArray2 = "\u001ftw\u0002\u001d".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = '%';
                    break;
                }
                case 0: {
                    c4 = 'J';
                    break;
                }
                case 1: {
                    c4 = ' ';
                    break;
                }
                case 2: {
                    c4 = '1';
                    break;
                }
                case 3: {
                    c4 = '/';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        f = Charset.forName(new String(charArray2).intern());
    }
    
    private n(final File m, final int h, final int c, final long k) {
        this.j = 0L;
        this.l = new LinkedHashMap(0, 0.75f, true);
        this.a = 0L;
        this.b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        this.i = new y(this);
        this.m = m;
        this.h = h;
        this.e = new File(m, com.whatsapp.util.n.z[27]);
        this.d = new File(m, com.whatsapp.util.n.z[28]);
        this.c = c;
        this.k = k;
    }
    
    static int a(final n n, final int n2) {
        return n.n = n2;
    }
    
    private bj a(final String p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: invokespecial   com/whatsapp/util/n.d:()V
        //     6: aload_0        
        //     7: aload_1        
        //     8: invokespecial   com/whatsapp/util/n.a:(Ljava/lang/String;)V
        //    11: aload_0        
        //    12: getfield        com/whatsapp/util/n.l:Ljava/util/LinkedHashMap;
        //    15: aload_1        
        //    16: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    19: checkcast       Lcom/whatsapp/util/bz;
        //    22: astore          5
        //    24: lload_2        
        //    25: ldc2_w          -1
        //    28: lcmp           
        //    29: ifeq            71
        //    32: aload           5
        //    34: ifnull          51
        //    37: aload           5
        //    39: invokestatic    com/whatsapp/util/bz.d:(Lcom/whatsapp/util/bz;)J
        //    42: lstore          14
        //    44: lload           14
        //    46: lload_2        
        //    47: lcmp           
        //    48: ifeq            71
        //    51: aconst_null    
        //    52: astore          7
        //    54: aload_0        
        //    55: monitorexit    
        //    56: aload           7
        //    58: areturn        
        //    59: astore          13
        //    61: aload           13
        //    63: athrow         
        //    64: astore          4
        //    66: aload_0        
        //    67: monitorexit    
        //    68: aload           4
        //    70: athrow         
        //    71: aload           5
        //    73: ifnonnull       109
        //    76: new             Lcom/whatsapp/util/bz;
        //    79: dup            
        //    80: aload_0        
        //    81: aload_1        
        //    82: aconst_null    
        //    83: invokespecial   com/whatsapp/util/bz.<init>:(Lcom/whatsapp/util/n;Ljava/lang/String;Lcom/whatsapp/util/y;)V
        //    86: astore          5
        //    88: aload_0        
        //    89: getfield        com/whatsapp/util/n.l:Ljava/util/LinkedHashMap;
        //    92: aload_1        
        //    93: aload           5
        //    95: invokevirtual   java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    98: pop            
        //    99: getstatic       com/whatsapp/util/Log.l:Z
        //   102: istore          12
        //   104: iload           12
        //   106: ifeq            199
        //   109: aload           5
        //   111: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;)Lcom/whatsapp/util/bj;
        //   114: ifnull          206
        //   117: aconst_null    
        //   118: astore          7
        //   120: goto            54
        //   123: astore          10
        //   125: aload           10
        //   127: athrow         
        //   128: astore          6
        //   130: aload           6
        //   132: athrow         
        //   133: new             Lcom/whatsapp/util/bj;
        //   136: dup            
        //   137: aload_0        
        //   138: aload           8
        //   140: aconst_null    
        //   141: invokespecial   com/whatsapp/util/bj.<init>:(Lcom/whatsapp/util/n;Lcom/whatsapp/util/bz;Lcom/whatsapp/util/y;)V
        //   144: astore          7
        //   146: aload           8
        //   148: aload           7
        //   150: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;Lcom/whatsapp/util/bj;)Lcom/whatsapp/util/bj;
        //   153: pop            
        //   154: aload_0        
        //   155: getfield        com/whatsapp/util/n.g:Ljava/io/Writer;
        //   158: new             Ljava/lang/StringBuilder;
        //   161: dup            
        //   162: invokespecial   java/lang/StringBuilder.<init>:()V
        //   165: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   168: bipush          19
        //   170: aaload         
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: aload_1        
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: bipush          10
        //   180: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   183: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   186: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   189: aload_0        
        //   190: getfield        com/whatsapp/util/n.g:Ljava/io/Writer;
        //   193: invokevirtual   java/io/Writer.flush:()V
        //   196: goto            54
        //   199: aload           5
        //   201: astore          8
        //   203: goto            133
        //   206: aload           5
        //   208: astore          8
        //   210: goto            133
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  2      24     64     71     Any
        //  37     44     59     64     Ljava/lang/IllegalArgumentException;
        //  37     44     64     71     Any
        //  61     64     64     71     Any
        //  76     88     64     71     Any
        //  88     104    123    128    Ljava/lang/IllegalArgumentException;
        //  88     104    64     71     Any
        //  109    117    128    133    Ljava/lang/IllegalArgumentException;
        //  109    117    64     71     Any
        //  125    128    128    133    Ljava/lang/IllegalArgumentException;
        //  125    128    64     71     Any
        //  130    133    64     71     Any
        //  133    196    64     71     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0109:
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
    
    public static n a(final File file, final int n, final int n2, final long n3) {
        if (n3 <= 0L) {
            try {
                throw new IllegalArgumentException(n.z[21]);
            }
            catch (IOException ex) {
                throw ex;
            }
        }
        if (n2 <= 0) {
            try {
                throw new IllegalArgumentException(n.z[20]);
            }
            catch (IOException ex2) {
                throw ex2;
            }
        }
        final n n4 = new n(file, n, n2, n3);
        Label_0129: {
            try {
                if (n4.e.exists()) {
                    final n n5 = n4;
                    n5.f();
                    final n n6 = n4;
                    n6.c();
                    final n n7 = n4;
                    final n n8 = n4;
                    final File file2 = n8.e;
                    final boolean b = true;
                    final FileWriter fileWriter = new FileWriter(file2, b);
                    final int n9 = 8192;
                    final BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, n9);
                    n7.g = bufferedWriter;
                    return n4;
                }
                break Label_0129;
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            try {
                final n n5 = n4;
                n5.f();
                final n n6 = n4;
                n6.c();
                final n n7 = n4;
                final n n8 = n4;
                final File file2 = n8.e;
                final boolean b = true;
                final FileWriter fileWriter = new FileWriter(file2, b);
                final int n9 = 8192;
                final BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, n9);
                n7.g = bufferedWriter;
                return n4;
            }
            catch (IOException ex4) {
                n4.g();
            }
        }
        file.mkdirs();
        final n n11 = new n(file, n, n2, n3);
        n11.b();
        return n11;
    }
    
    static Writer a(final n n) {
        return n.g;
    }
    
    public static String a(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_1       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: bipush          80
        //    10: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    13: astore_2       
        //    14: aload_0        
        //    15: invokevirtual   java/io/InputStream.read:()I
        //    18: istore_3       
        //    19: iload_3        
        //    20: iconst_m1      
        //    21: if_icmpne       32
        //    24: new             Ljava/io/EOFException;
        //    27: dup            
        //    28: invokespecial   java/io/EOFException.<init>:()V
        //    31: athrow         
        //    32: iload_3        
        //    33: bipush          10
        //    35: if_icmpne       42
        //    38: iload_1        
        //    39: ifeq            57
        //    42: iload_3        
        //    43: i2c            
        //    44: istore          4
        //    46: aload_2        
        //    47: iload           4
        //    49: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    52: pop            
        //    53: iload_1        
        //    54: ifeq            14
        //    57: aload_2        
        //    58: invokevirtual   java/lang/StringBuilder.length:()I
        //    61: istore          7
        //    63: iload           7
        //    65: ifle            93
        //    68: iload           7
        //    70: iconst_1       
        //    71: isub           
        //    72: istore          8
        //    74: aload_2        
        //    75: iload           8
        //    77: invokevirtual   java/lang/StringBuilder.charAt:(I)C
        //    80: bipush          13
        //    82: if_icmpne       93
        //    85: aload_2        
        //    86: iload           7
        //    88: iconst_1       
        //    89: isub           
        //    90: invokevirtual   java/lang/StringBuilder.setLength:(I)V
        //    93: aload_2        
        //    94: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    97: areturn        
        //    98: astore          5
        //   100: aload           5
        //   102: athrow         
        //   103: astore          9
        //   105: aload           9
        //   107: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  46     53     98     103    Ljava/lang/IllegalArgumentException;
        //  74     93     103    108    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0093:
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
    
    private void a() {
        final boolean l = Log.l;
        while (this.j > this.k) {
            this.d(this.l.entrySet().iterator().next().getKey());
            if (l) {
                break;
            }
        }
    }
    
    private void a(final bj p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: getstatic       com/whatsapp/util/Log.l:Z
        //     5: istore          4
        //     7: aload_1        
        //     8: invokestatic    com/whatsapp/util/bj.a:(Lcom/whatsapp/util/bj;)Lcom/whatsapp/util/bz;
        //    11: astore          5
        //    13: aload           5
        //    15: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;)Lcom/whatsapp/util/bj;
        //    18: aload_1        
        //    19: if_acmpeq       40
        //    22: new             Ljava/lang/IllegalStateException;
        //    25: dup            
        //    26: invokespecial   java/lang/IllegalStateException.<init>:()V
        //    29: athrow         
        //    30: astore          6
        //    32: aload           6
        //    34: athrow         
        //    35: astore_3       
        //    36: aload_0        
        //    37: monitorexit    
        //    38: aload_3        
        //    39: athrow         
        //    40: iconst_0       
        //    41: istore          7
        //    43: iload_2        
        //    44: ifeq            140
        //    47: aload           5
        //    49: invokestatic    com/whatsapp/util/bz.c:(Lcom/whatsapp/util/bz;)Z
        //    52: istore          37
        //    54: iconst_0       
        //    55: istore          7
        //    57: iload           37
        //    59: ifne            140
        //    62: iconst_0       
        //    63: istore          38
        //    65: aload_0        
        //    66: getfield        com/whatsapp/util/n.c:I
        //    69: istore          39
        //    71: iconst_0       
        //    72: istore          7
        //    74: iload           38
        //    76: iload           39
        //    78: if_icmpge       140
        //    81: aload           5
        //    83: iload           38
        //    85: invokevirtual   com/whatsapp/util/bz.a:(I)Ljava/io/File;
        //    88: invokevirtual   java/io/File.exists:()Z
        //    91: ifne            497
        //    94: aload_1        
        //    95: invokevirtual   com/whatsapp/util/bj.b:()V
        //    98: new             Ljava/lang/IllegalStateException;
        //   101: dup            
        //   102: new             Ljava/lang/StringBuilder;
        //   105: dup            
        //   106: invokespecial   java/lang/StringBuilder.<init>:()V
        //   109: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   112: bipush          18
        //   114: aaload         
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   118: iload           38
        //   120: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   123: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   126: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   129: athrow         
        //   130: astore          40
        //   132: aload           40
        //   134: athrow         
        //   135: astore          36
        //   137: aload           36
        //   139: athrow         
        //   140: iload           7
        //   142: aload_0        
        //   143: getfield        com/whatsapp/util/n.c:I
        //   146: if_icmpge       250
        //   149: aload           5
        //   151: iload           7
        //   153: invokevirtual   com/whatsapp/util/bz.a:(I)Ljava/io/File;
        //   156: astore          26
        //   158: iload_2        
        //   159: ifeq            237
        //   162: aload           26
        //   164: invokevirtual   java/io/File.exists:()Z
        //   167: istore          29
        //   169: iload           29
        //   171: ifeq            242
        //   174: aload           5
        //   176: iload           7
        //   178: invokevirtual   com/whatsapp/util/bz.b:(I)Ljava/io/File;
        //   181: astore          30
        //   183: aload           26
        //   185: aload           30
        //   187: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   190: pop            
        //   191: aload           5
        //   193: invokestatic    com/whatsapp/util/bz.b:(Lcom/whatsapp/util/bz;)[J
        //   196: iload           7
        //   198: laload         
        //   199: lstore          32
        //   201: aload           30
        //   203: invokevirtual   java/io/File.length:()J
        //   206: lstore          34
        //   208: aload           5
        //   210: invokestatic    com/whatsapp/util/bz.b:(Lcom/whatsapp/util/bz;)[J
        //   213: iload           7
        //   215: lload           34
        //   217: lastore        
        //   218: aload_0        
        //   219: lload           34
        //   221: aload_0        
        //   222: getfield        com/whatsapp/util/n.j:J
        //   225: lload           32
        //   227: lsub           
        //   228: ladd           
        //   229: putfield        com/whatsapp/util/n.j:J
        //   232: iload           4
        //   234: ifeq            242
        //   237: aload           26
        //   239: invokestatic    com/whatsapp/util/n.a:(Ljava/io/File;)V
        //   242: iinc            7, 1
        //   245: iload           4
        //   247: ifeq            140
        //   250: aload_0        
        //   251: iconst_1       
        //   252: aload_0        
        //   253: getfield        com/whatsapp/util/n.n:I
        //   256: iadd           
        //   257: putfield        com/whatsapp/util/n.n:I
        //   260: aload           5
        //   262: aconst_null    
        //   263: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;Lcom/whatsapp/util/bj;)Lcom/whatsapp/util/bj;
        //   266: pop            
        //   267: aload           5
        //   269: invokestatic    com/whatsapp/util/bz.c:(Lcom/whatsapp/util/bz;)Z
        //   272: istore          12
        //   274: iload           12
        //   276: iload_2        
        //   277: ior            
        //   278: ifeq            366
        //   281: aload           5
        //   283: iconst_1       
        //   284: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;Z)Z
        //   287: pop            
        //   288: aload_0        
        //   289: getfield        com/whatsapp/util/n.g:Ljava/io/Writer;
        //   292: new             Ljava/lang/StringBuilder;
        //   295: dup            
        //   296: invokespecial   java/lang/StringBuilder.<init>:()V
        //   299: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   302: bipush          16
        //   304: aaload         
        //   305: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   308: aload           5
        //   310: invokestatic    com/whatsapp/util/bz.e:(Lcom/whatsapp/util/bz;)Ljava/lang/String;
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   316: aload           5
        //   318: invokevirtual   com/whatsapp/util/bz.a:()Ljava/lang/String;
        //   321: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   324: bipush          10
        //   326: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   329: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   332: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   335: iload_2        
        //   336: ifeq            418
        //   339: aload_0        
        //   340: getfield        com/whatsapp/util/n.a:J
        //   343: lstore          22
        //   345: aload_0        
        //   346: lconst_1       
        //   347: lload           22
        //   349: ladd           
        //   350: putfield        com/whatsapp/util/n.a:J
        //   353: aload           5
        //   355: lload           22
        //   357: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;J)J
        //   360: pop2           
        //   361: iload           4
        //   363: ifeq            418
        //   366: aload_0        
        //   367: getfield        com/whatsapp/util/n.l:Ljava/util/LinkedHashMap;
        //   370: aload           5
        //   372: invokestatic    com/whatsapp/util/bz.e:(Lcom/whatsapp/util/bz;)Ljava/lang/String;
        //   375: invokevirtual   java/util/LinkedHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   378: pop            
        //   379: aload_0        
        //   380: getfield        com/whatsapp/util/n.g:Ljava/io/Writer;
        //   383: new             Ljava/lang/StringBuilder;
        //   386: dup            
        //   387: invokespecial   java/lang/StringBuilder.<init>:()V
        //   390: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   393: bipush          17
        //   395: aaload         
        //   396: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   399: aload           5
        //   401: invokestatic    com/whatsapp/util/bz.e:(Lcom/whatsapp/util/bz;)Ljava/lang/String;
        //   404: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   407: bipush          10
        //   409: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   412: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   415: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   418: aload_0        
        //   419: getfield        com/whatsapp/util/n.j:J
        //   422: lstore          16
        //   424: aload_0        
        //   425: getfield        com/whatsapp/util/n.k:J
        //   428: lstore          18
        //   430: lload           16
        //   432: lload           18
        //   434: lcmp           
        //   435: ifgt            445
        //   438: aload_0        
        //   439: invokespecial   com/whatsapp/util/n.e:()Z
        //   442: ifeq            459
        //   445: aload_0        
        //   446: getfield        com/whatsapp/util/n.b:Ljava/util/concurrent/ExecutorService;
        //   449: aload_0        
        //   450: getfield        com/whatsapp/util/n.i:Ljava/util/concurrent/Callable;
        //   453: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
        //   458: pop            
        //   459: aload_0        
        //   460: monitorexit    
        //   461: return         
        //   462: astore          28
        //   464: aload           28
        //   466: athrow         
        //   467: astore          27
        //   469: aload           27
        //   471: athrow         
        //   472: astore          8
        //   474: aload           8
        //   476: athrow         
        //   477: astore          9
        //   479: aload           9
        //   481: athrow         
        //   482: astore          10
        //   484: aload           10
        //   486: athrow         
        //   487: astore          14
        //   489: aload           14
        //   491: athrow         
        //   492: astore          15
        //   494: aload           15
        //   496: athrow         
        //   497: iinc            38, 1
        //   500: iload           4
        //   502: ifeq            65
        //   505: iconst_0       
        //   506: istore          7
        //   508: goto            140
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  2      13     35     40     Any
        //  13     30     30     35     Ljava/lang/IllegalArgumentException;
        //  13     30     35     40     Any
        //  32     35     35     40     Any
        //  47     54     135    140    Ljava/lang/IllegalArgumentException;
        //  47     54     35     40     Any
        //  65     71     35     40     Any
        //  81     130    130    135    Ljava/lang/IllegalArgumentException;
        //  81     130    35     40     Any
        //  132    135    35     40     Any
        //  137    140    35     40     Any
        //  140    158    35     40     Any
        //  162    169    462    467    Ljava/lang/IllegalArgumentException;
        //  162    169    35     40     Any
        //  174    208    35     40     Any
        //  208    232    467    472    Ljava/lang/IllegalArgumentException;
        //  208    232    35     40     Any
        //  237    242    467    472    Ljava/lang/IllegalArgumentException;
        //  237    242    35     40     Any
        //  250    274    472    477    Ljava/lang/IllegalArgumentException;
        //  250    274    35     40     Any
        //  281    335    477    482    Ljava/lang/IllegalArgumentException;
        //  281    335    35     40     Any
        //  339    361    482    487    Ljava/lang/IllegalArgumentException;
        //  339    361    35     40     Any
        //  366    418    482    487    Ljava/lang/IllegalArgumentException;
        //  366    418    35     40     Any
        //  418    430    487    492    Ljava/lang/IllegalArgumentException;
        //  418    430    35     40     Any
        //  438    445    492    497    Ljava/lang/IllegalArgumentException;
        //  438    445    35     40     Any
        //  445    459    492    497    Ljava/lang/IllegalArgumentException;
        //  445    459    35     40     Any
        //  464    467    35     40     Any
        //  469    472    35     40     Any
        //  474    477    477    482    Ljava/lang/IllegalArgumentException;
        //  474    477    35     40     Any
        //  479    482    482    487    Ljava/lang/IllegalArgumentException;
        //  479    482    35     40     Any
        //  484    487    35     40     Any
        //  489    492    492    497    Ljava/lang/IllegalArgumentException;
        //  489    492    35     40     Any
        //  494    497    35     40     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 249, Size: 249
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
    
    static void a(final n n, final bj bj, final boolean b) {
        n.a(bj, b);
    }
    
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {}
    }
    
    private static void a(final File file) {
        try {
            if (file.exists()) {
                try {
                    if (!file.delete()) {
                        throw new IOException();
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    private void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ldc_w           " "
        //     4: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //     7: istore          5
        //     9: iload           5
        //    11: ifne            38
        //    14: aload_1        
        //    15: ldc_w           "\n"
        //    18: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    21: istore          6
        //    23: iload           6
        //    25: ifne            38
        //    28: aload_1        
        //    29: ldc_w           "\r"
        //    32: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    35: ifeq            86
        //    38: new             Ljava/lang/IllegalArgumentException;
        //    41: dup            
        //    42: new             Ljava/lang/StringBuilder;
        //    45: dup            
        //    46: invokespecial   java/lang/StringBuilder.<init>:()V
        //    49: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //    52: bipush          26
        //    54: aaload         
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: aload_1        
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: ldc_w           "\""
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    71: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    74: athrow         
        //    75: astore          4
        //    77: aload           4
        //    79: athrow         
        //    80: astore_2       
        //    81: aload_2        
        //    82: athrow         
        //    83: astore_3       
        //    84: aload_3        
        //    85: athrow         
        //    86: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      9      80     83     Ljava/lang/IllegalArgumentException;
        //  14     23     83     86     Ljava/lang/IllegalArgumentException;
        //  28     38     75     80     Ljava/lang/IllegalArgumentException;
        //  38     75     75     80     Ljava/lang/IllegalArgumentException;
        //  81     83     83     86     Ljava/lang/IllegalArgumentException;
        //  84     86     75     80     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    
    private static Object[] a(final Object[] array, final int n, final int n2) {
        final int length = array.length;
        if (n > n2) {
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        Label_0043: {
            if (n >= 0) {
                if (n <= length) {
                    break Label_0043;
                }
            }
            try {
                throw new ArrayIndexOutOfBoundsException();
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final int n3 = n2 - n;
        final int min = Math.min(n3, length - n);
        final Object[] array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), n3);
        System.arraycopy(array, n, array2, 0, min);
        return array2;
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: getstatic       com/whatsapp/util/Log.l:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/util/n.g:Ljava/io/Writer;
        //    10: ifnull          20
        //    13: aload_0        
        //    14: getfield        com/whatsapp/util/n.g:Ljava/io/Writer;
        //    17: invokevirtual   java/io/Writer.close:()V
        //    20: new             Ljava/io/BufferedWriter;
        //    23: dup            
        //    24: new             Ljava/io/FileWriter;
        //    27: dup            
        //    28: aload_0        
        //    29: getfield        com/whatsapp/util/n.d:Ljava/io/File;
        //    32: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;)V
        //    35: sipush          8192
        //    38: invokespecial   java/io/BufferedWriter.<init>:(Ljava/io/Writer;I)V
        //    41: astore          4
        //    43: aload           4
        //    45: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //    48: bipush          23
        //    50: aaload         
        //    51: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    54: aload           4
        //    56: ldc_w           "\n"
        //    59: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    62: aload           4
        //    64: ldc_w           "1"
        //    67: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    70: aload           4
        //    72: ldc_w           "\n"
        //    75: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    78: aload           4
        //    80: aload_0        
        //    81: getfield        com/whatsapp/util/n.h:I
        //    84: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    87: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    90: aload           4
        //    92: ldc_w           "\n"
        //    95: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    98: aload           4
        //   100: aload_0        
        //   101: getfield        com/whatsapp/util/n.c:I
        //   104: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   107: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   110: aload           4
        //   112: ldc_w           "\n"
        //   115: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   118: aload           4
        //   120: ldc_w           "\n"
        //   123: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   126: aload_0        
        //   127: getfield        com/whatsapp/util/n.l:Ljava/util/LinkedHashMap;
        //   130: invokevirtual   java/util/LinkedHashMap.values:()Ljava/util/Collection;
        //   133: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   138: astore          5
        //   140: aload           5
        //   142: invokeinterface java/util/Iterator.hasNext:()Z
        //   147: ifeq            264
        //   150: aload           5
        //   152: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   157: checkcast       Lcom/whatsapp/util/bz;
        //   160: astore          7
        //   162: aload           7
        //   164: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;)Lcom/whatsapp/util/bj;
        //   167: astore          10
        //   169: aload           10
        //   171: ifnull          215
        //   174: aload           4
        //   176: new             Ljava/lang/StringBuilder;
        //   179: dup            
        //   180: invokespecial   java/lang/StringBuilder.<init>:()V
        //   183: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   186: bipush          24
        //   188: aaload         
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   192: aload           7
        //   194: invokestatic    com/whatsapp/util/bz.e:(Lcom/whatsapp/util/bz;)Ljava/lang/String;
        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   200: bipush          10
        //   202: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   205: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   208: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   211: iload_2        
        //   212: ifeq            260
        //   215: aload           4
        //   217: new             Ljava/lang/StringBuilder;
        //   220: dup            
        //   221: invokespecial   java/lang/StringBuilder.<init>:()V
        //   224: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   227: bipush          22
        //   229: aaload         
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: aload           7
        //   235: invokestatic    com/whatsapp/util/bz.e:(Lcom/whatsapp/util/bz;)Ljava/lang/String;
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: aload           7
        //   243: invokevirtual   com/whatsapp/util/bz.a:()Ljava/lang/String;
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: bipush          10
        //   251: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   254: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   257: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   260: iload_2        
        //   261: ifeq            140
        //   264: aload           4
        //   266: invokevirtual   java/io/Writer.close:()V
        //   269: aload_0        
        //   270: getfield        com/whatsapp/util/n.d:Ljava/io/File;
        //   273: aload_0        
        //   274: getfield        com/whatsapp/util/n.e:Ljava/io/File;
        //   277: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   280: pop            
        //   281: aload_0        
        //   282: new             Ljava/io/BufferedWriter;
        //   285: dup            
        //   286: new             Ljava/io/FileWriter;
        //   289: dup            
        //   290: aload_0        
        //   291: getfield        com/whatsapp/util/n.e:Ljava/io/File;
        //   294: iconst_1       
        //   295: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;Z)V
        //   298: sipush          8192
        //   301: invokespecial   java/io/BufferedWriter.<init>:(Ljava/io/Writer;I)V
        //   304: putfield        com/whatsapp/util/n.g:Ljava/io/Writer;
        //   307: aload_0        
        //   308: monitorexit    
        //   309: return         
        //   310: astore_3       
        //   311: aload_3        
        //   312: athrow         
        //   313: astore_1       
        //   314: aload_0        
        //   315: monitorexit    
        //   316: aload_1        
        //   317: athrow         
        //   318: astore          8
        //   320: aload           8
        //   322: athrow         
        //   323: astore          9
        //   325: aload           9
        //   327: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  2      6      313    318    Any
        //  6      20     310    313    Ljava/lang/IllegalArgumentException;
        //  6      20     313    318    Any
        //  20     140    313    318    Any
        //  140    162    313    318    Any
        //  162    169    318    323    Ljava/lang/IllegalArgumentException;
        //  162    169    313    318    Any
        //  174    211    323    328    Ljava/lang/IllegalArgumentException;
        //  174    211    313    318    Any
        //  215    260    323    328    Ljava/lang/IllegalArgumentException;
        //  215    260    313    318    Any
        //  264    307    313    318    Any
        //  311    313    313    318    Any
        //  320    323    323    328    Ljava/lang/IllegalArgumentException;
        //  320    323    313    318    Any
        //  325    328    313    318    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 144, Size: 144
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
    
    public static void b(final File file) {
        final boolean l = Log.l;
        final File[] listFiles = file.listFiles();
        if (listFiles == null) {
            try {
                throw new IllegalArgumentException(n.z[13] + file);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final int length = listFiles.length;
        int i = 0;
        while (i < length) {
            final File file2 = listFiles[i];
            try {
                if (file2.isDirectory()) {
                    b(file2);
                }
                try {
                    if (!file2.delete()) {
                        throw new IOException(n.z[12] + file2);
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            ++i;
            if (l) {
                break;
            }
        }
    }
    
    static boolean b(final n n) {
        return n.e();
    }
    
    private void c() {
        final boolean l = Log.l;
        a(this.d);
        final Iterator<bz> iterator = this.l.values().iterator();
        while (iterator.hasNext()) {
            final bz bz = iterator.next();
            Label_0138: {
                if (com.whatsapp.util.bz.a(bz) == null) {
                    int i = 0;
                    while (i < this.c) {
                        this.j += com.whatsapp.util.bz.b(bz)[i];
                        ++i;
                        if (l) {
                            break;
                        }
                    }
                    if (!l) {
                        break Label_0138;
                    }
                }
                com.whatsapp.util.bz.a(bz, (bj)null);
                int j = 0;
                while (j < this.c) {
                    a(bz.b(j));
                    a(bz.a(j));
                    ++j;
                    if (l) {
                        break;
                    }
                }
                iterator.remove();
            }
            if (l) {
                break;
            }
        }
    }
    
    static void c(final n n) {
        n.a();
    }
    
    private void d() {
        try {
            if (this.g == null) {
                throw new IllegalStateException(com.whatsapp.util.n.z[25]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    static void d(final n n) {
        n.b();
    }
    
    static File e(final n n) {
        return n.m;
    }
    
    private void e(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ldc_w           " "
        //     8: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_3        
        //    13: arraylength    
        //    14: iconst_2       
        //    15: if_icmpge       53
        //    18: new             Ljava/io/IOException;
        //    21: dup            
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //    32: iconst_5       
        //    33: aaload         
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: aload_1        
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    41: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    44: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    47: athrow         
        //    48: astore          4
        //    50: aload           4
        //    52: athrow         
        //    53: aload_3        
        //    54: iconst_1       
        //    55: aaload         
        //    56: astore          5
        //    58: aload_3        
        //    59: iconst_0       
        //    60: aaload         
        //    61: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //    64: iconst_2       
        //    65: aaload         
        //    66: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    69: istore          8
        //    71: iload           8
        //    73: ifeq            103
        //    76: aload_3        
        //    77: arraylength    
        //    78: iconst_2       
        //    79: if_icmpne       103
        //    82: aload_0        
        //    83: getfield        com/whatsapp/util/n.l:Ljava/util/LinkedHashMap;
        //    86: aload           5
        //    88: invokevirtual   java/util/LinkedHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    91: pop            
        //    92: return         
        //    93: astore          6
        //    95: aload           6
        //    97: athrow         
        //    98: astore          7
        //   100: aload           7
        //   102: athrow         
        //   103: aload_0        
        //   104: getfield        com/whatsapp/util/n.l:Ljava/util/LinkedHashMap;
        //   107: aload           5
        //   109: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   112: checkcast       Lcom/whatsapp/util/bz;
        //   115: astore          9
        //   117: aload           9
        //   119: ifnonnull       368
        //   122: new             Lcom/whatsapp/util/bz;
        //   125: dup            
        //   126: aload_0        
        //   127: aload           5
        //   129: aconst_null    
        //   130: invokespecial   com/whatsapp/util/bz.<init>:(Lcom/whatsapp/util/n;Ljava/lang/String;Lcom/whatsapp/util/y;)V
        //   133: astore          10
        //   135: aload_0        
        //   136: getfield        com/whatsapp/util/n.l:Ljava/util/LinkedHashMap;
        //   139: aload           5
        //   141: aload           10
        //   143: invokevirtual   java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   146: pop            
        //   147: aload           10
        //   149: astore          12
        //   151: aload_3        
        //   152: iconst_0       
        //   153: aaload         
        //   154: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   157: iconst_0       
        //   158: aaload         
        //   159: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   162: istore          21
        //   164: iload           21
        //   166: ifeq            221
        //   169: aload_3        
        //   170: arraylength    
        //   171: istore          27
        //   173: aload_0        
        //   174: getfield        com/whatsapp/util/n.c:I
        //   177: istore          28
        //   179: iload           27
        //   181: iload           28
        //   183: iconst_2       
        //   184: iadd           
        //   185: if_icmpne       221
        //   188: aload           12
        //   190: iconst_1       
        //   191: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;Z)Z
        //   194: pop            
        //   195: aload           12
        //   197: aconst_null    
        //   198: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;Lcom/whatsapp/util/bj;)Lcom/whatsapp/util/bj;
        //   201: pop            
        //   202: aload           12
        //   204: aload_3        
        //   205: iconst_2       
        //   206: aload_3        
        //   207: arraylength    
        //   208: invokestatic    com/whatsapp/util/n.a:([Ljava/lang/Object;II)[Ljava/lang/Object;
        //   211: checkcast       [Ljava/lang/String;
        //   214: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;[Ljava/lang/String;)V
        //   217: iload_2        
        //   218: ifeq            375
        //   221: aload_3        
        //   222: iconst_0       
        //   223: aaload         
        //   224: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   227: iconst_4       
        //   228: aaload         
        //   229: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   232: istore          22
        //   234: iload           22
        //   236: ifeq            270
        //   239: aload_3        
        //   240: arraylength    
        //   241: istore          25
        //   243: iload           25
        //   245: iconst_2       
        //   246: if_icmpne       270
        //   249: aload           12
        //   251: new             Lcom/whatsapp/util/bj;
        //   254: dup            
        //   255: aload_0        
        //   256: aload           12
        //   258: aconst_null    
        //   259: invokespecial   com/whatsapp/util/bj.<init>:(Lcom/whatsapp/util/n;Lcom/whatsapp/util/bz;Lcom/whatsapp/util/y;)V
        //   262: invokestatic    com/whatsapp/util/bz.a:(Lcom/whatsapp/util/bz;Lcom/whatsapp/util/bj;)Lcom/whatsapp/util/bj;
        //   265: pop            
        //   266: iload_2        
        //   267: ifeq            375
        //   270: aload_3        
        //   271: iconst_0       
        //   272: aaload         
        //   273: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   276: iconst_1       
        //   277: aaload         
        //   278: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   281: istore          23
        //   283: iload           23
        //   285: ifeq            298
        //   288: aload_3        
        //   289: arraylength    
        //   290: istore          24
        //   292: iload           24
        //   294: iconst_2       
        //   295: if_icmpeq       375
        //   298: new             Ljava/io/IOException;
        //   301: dup            
        //   302: new             Ljava/lang/StringBuilder;
        //   305: dup            
        //   306: invokespecial   java/lang/StringBuilder.<init>:()V
        //   309: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   312: iconst_3       
        //   313: aaload         
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: aload_1        
        //   318: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   321: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   324: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   327: athrow         
        //   328: astore          13
        //   330: aload           13
        //   332: athrow         
        //   333: astore          14
        //   335: aload           14
        //   337: athrow         
        //   338: astore          15
        //   340: aload           15
        //   342: athrow         
        //   343: astore          16
        //   345: aload           16
        //   347: athrow         
        //   348: astore          17
        //   350: aload           17
        //   352: athrow         
        //   353: astore          18
        //   355: aload           18
        //   357: athrow         
        //   358: astore          19
        //   360: aload           19
        //   362: athrow         
        //   363: astore          20
        //   365: aload           20
        //   367: athrow         
        //   368: aload           9
        //   370: astore          12
        //   372: goto            151
        //   375: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     48     48     53     Ljava/lang/IllegalArgumentException;
        //  58     71     93     98     Ljava/lang/IllegalArgumentException;
        //  76     92     98     103    Ljava/lang/IllegalArgumentException;
        //  95     98     98     103    Ljava/lang/IllegalArgumentException;
        //  151    164    328    333    Ljava/lang/IllegalArgumentException;
        //  169    179    333    338    Ljava/lang/IllegalArgumentException;
        //  188    217    338    343    Ljava/lang/IllegalArgumentException;
        //  221    234    343    348    Ljava/lang/IllegalArgumentException;
        //  239    243    348    353    Ljava/lang/IllegalArgumentException;
        //  249    266    353    358    Ljava/lang/IllegalArgumentException;
        //  270    283    358    363    Ljava/lang/IllegalArgumentException;
        //  288    292    363    368    Ljava/lang/IllegalArgumentException;
        //  330    333    333    338    Ljava/lang/IllegalArgumentException;
        //  335    338    338    343    Ljava/lang/IllegalArgumentException;
        //  340    343    343    348    Ljava/lang/IllegalArgumentException;
        //  345    348    348    353    Ljava/lang/IllegalArgumentException;
        //  350    353    353    358    Ljava/lang/IllegalArgumentException;
        //  355    358    358    363    Ljava/lang/IllegalArgumentException;
        //  360    363    363    368    Ljava/lang/IllegalArgumentException;
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
    
    private boolean e() {
        try {
            if (this.n < 2000) {
                return false;
            }
            final n n = this;
            final int n2 = n.n;
            final n n3 = this;
            final LinkedHashMap linkedHashMap = n3.l;
            final int n4 = linkedHashMap.size();
            if (n2 >= n4) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final n n = this;
            final int n2 = n.n;
            final n n3 = this;
            final LinkedHashMap linkedHashMap = n3.l;
            final int n4 = linkedHashMap.size();
            if (n2 >= n4) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    static int f(final n n) {
        return n.c;
    }
    
    private void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/BufferedInputStream;
        //     3: dup            
        //     4: new             Ljava/io/FileInputStream;
        //     7: dup            
        //     8: aload_0        
        //     9: getfield        com/whatsapp/util/n.e:Ljava/io/File;
        //    12: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    15: sipush          8192
        //    18: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;I)V
        //    21: astore_1       
        //    22: aload_1        
        //    23: invokestatic    com/whatsapp/util/n.a:(Ljava/io/InputStream;)Ljava/lang/String;
        //    26: astore_3       
        //    27: aload_1        
        //    28: invokestatic    com/whatsapp/util/n.a:(Ljava/io/InputStream;)Ljava/lang/String;
        //    31: astore          4
        //    33: aload_1        
        //    34: invokestatic    com/whatsapp/util/n.a:(Ljava/io/InputStream;)Ljava/lang/String;
        //    37: astore          5
        //    39: aload_1        
        //    40: invokestatic    com/whatsapp/util/n.a:(Ljava/io/InputStream;)Ljava/lang/String;
        //    43: astore          6
        //    45: aload_1        
        //    46: invokestatic    com/whatsapp/util/n.a:(Ljava/io/InputStream;)Ljava/lang/String;
        //    49: astore          7
        //    51: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //    54: bipush          9
        //    56: aaload         
        //    57: aload_3        
        //    58: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    61: ifeq            132
        //    64: ldc_w           "1"
        //    67: aload           4
        //    69: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    72: istore          13
        //    74: iload           13
        //    76: ifeq            132
        //    79: aload_0        
        //    80: getfield        com/whatsapp/util/n.h:I
        //    83: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    86: aload           5
        //    88: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    91: istore          14
        //    93: iload           14
        //    95: ifeq            132
        //    98: aload_0        
        //    99: getfield        com/whatsapp/util/n.c:I
        //   102: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   105: aload           6
        //   107: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   110: istore          15
        //   112: iload           15
        //   114: ifeq            132
        //   117: ldc_w           ""
        //   120: aload           7
        //   122: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   125: istore          16
        //   127: iload           16
        //   129: ifne            243
        //   132: new             Ljava/io/IOException;
        //   135: dup            
        //   136: new             Ljava/lang/StringBuilder;
        //   139: dup            
        //   140: invokespecial   java/lang/StringBuilder.<init>:()V
        //   143: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   146: bipush          10
        //   148: aaload         
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: aload_3        
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   159: bipush          7
        //   161: aaload         
        //   162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   165: aload           4
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   173: bipush          11
        //   175: aaload         
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: aload           6
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   187: bipush          8
        //   189: aaload         
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   193: aload           7
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: ldc_w           "]"
        //   201: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   204: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   207: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   210: athrow         
        //   211: astore          12
        //   213: aload           12
        //   215: athrow         
        //   216: astore_2       
        //   217: aload_1        
        //   218: invokestatic    com/whatsapp/util/n.a:(Ljava/io/Closeable;)V
        //   221: aload_2        
        //   222: athrow         
        //   223: astore          8
        //   225: aload           8
        //   227: athrow         
        //   228: astore          9
        //   230: aload           9
        //   232: athrow         
        //   233: astore          10
        //   235: aload           10
        //   237: athrow         
        //   238: astore          11
        //   240: aload           11
        //   242: athrow         
        //   243: aload_0        
        //   244: aload_1        
        //   245: invokestatic    com/whatsapp/util/n.a:(Ljava/io/InputStream;)Ljava/lang/String;
        //   248: invokespecial   com/whatsapp/util/n.e:(Ljava/lang/String;)V
        //   251: goto            243
        //   254: astore          17
        //   256: aload_1        
        //   257: invokestatic    com/whatsapp/util/n.a:(Ljava/io/Closeable;)V
        //   260: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                  
        //  -----  -----  -----  -----  ----------------------
        //  22     51     216    223    Any
        //  51     74     223    228    Ljava/io/EOFException;
        //  51     74     216    223    Any
        //  79     93     228    233    Ljava/io/EOFException;
        //  79     93     216    223    Any
        //  98     112    233    238    Ljava/io/EOFException;
        //  98     112    216    223    Any
        //  117    127    238    243    Ljava/io/EOFException;
        //  117    127    216    223    Any
        //  132    211    211    216    Ljava/io/EOFException;
        //  132    211    216    223    Any
        //  213    216    216    223    Any
        //  225    228    228    233    Ljava/io/EOFException;
        //  225    228    216    223    Any
        //  230    233    233    238    Ljava/io/EOFException;
        //  230    233    216    223    Any
        //  235    238    238    243    Ljava/io/EOFException;
        //  235    238    216    223    Any
        //  240    243    211    216    Ljava/io/EOFException;
        //  240    243    216    223    Any
        //  243    251    254    261    Ljava/io/EOFException;
        //  243    251    216    223    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 122, Size: 122
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
    
    public bj b(final String s) {
        return this.a(s, -1L);
    }
    
    public d c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: getstatic       com/whatsapp/util/Log.l:Z
        //     5: istore_3       
        //     6: aload_0        
        //     7: invokespecial   com/whatsapp/util/n.d:()V
        //    10: aload_0        
        //    11: aload_1        
        //    12: invokespecial   com/whatsapp/util/n.a:(Ljava/lang/String;)V
        //    15: aload_0        
        //    16: getfield        com/whatsapp/util/n.l:Ljava/util/LinkedHashMap;
        //    19: aload_1        
        //    20: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    23: checkcast       Lcom/whatsapp/util/bz;
        //    26: astore          4
        //    28: aconst_null    
        //    29: astore          5
        //    31: aload           4
        //    33: ifnonnull       41
        //    36: aload_0        
        //    37: monitorexit    
        //    38: aload           5
        //    40: areturn        
        //    41: aload           4
        //    43: invokestatic    com/whatsapp/util/bz.c:(Lcom/whatsapp/util/bz;)Z
        //    46: istore          7
        //    48: aconst_null    
        //    49: astore          5
        //    51: iload           7
        //    53: ifeq            36
        //    56: aload_0        
        //    57: getfield        com/whatsapp/util/n.c:I
        //    60: anewarray       Ljava/io/InputStream;
        //    63: astore          8
        //    65: iconst_0       
        //    66: istore          9
        //    68: iload           9
        //    70: aload_0        
        //    71: getfield        com/whatsapp/util/n.c:I
        //    74: if_icmpge       103
        //    77: aload           8
        //    79: iload           9
        //    81: new             Ljava/io/FileInputStream;
        //    84: dup            
        //    85: aload           4
        //    87: iload           9
        //    89: invokevirtual   com/whatsapp/util/bz.b:(I)Ljava/io/File;
        //    92: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    95: aastore        
        //    96: iinc            9, 1
        //    99: iload_3        
        //   100: ifeq            68
        //   103: aload_0        
        //   104: iconst_1       
        //   105: aload_0        
        //   106: getfield        com/whatsapp/util/n.n:I
        //   109: iadd           
        //   110: putfield        com/whatsapp/util/n.n:I
        //   113: aload_0        
        //   114: getfield        com/whatsapp/util/n.g:Ljava/io/Writer;
        //   117: new             Ljava/lang/StringBuilder;
        //   120: dup            
        //   121: invokespecial   java/lang/StringBuilder.<init>:()V
        //   124: getstatic       com/whatsapp/util/n.z:[Ljava/lang/String;
        //   127: bipush          6
        //   129: aaload         
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: aload_1        
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   137: bipush          10
        //   139: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   142: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   145: invokevirtual   java/io/Writer.append:(Ljava/lang/CharSequence;)Ljava/io/Writer;
        //   148: pop            
        //   149: aload_0        
        //   150: invokespecial   com/whatsapp/util/n.e:()Z
        //   153: ifeq            170
        //   156: aload_0        
        //   157: getfield        com/whatsapp/util/n.b:Ljava/util/concurrent/ExecutorService;
        //   160: aload_0        
        //   161: getfield        com/whatsapp/util/n.i:Ljava/util/concurrent/Callable;
        //   164: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
        //   169: pop            
        //   170: new             Lcom/whatsapp/util/d;
        //   173: dup            
        //   174: aload_0        
        //   175: aload_1        
        //   176: aload           4
        //   178: invokestatic    com/whatsapp/util/bz.d:(Lcom/whatsapp/util/bz;)J
        //   181: aload           8
        //   183: aconst_null    
        //   184: invokespecial   com/whatsapp/util/d.<init>:(Lcom/whatsapp/util/n;Ljava/lang/String;J[Ljava/io/InputStream;Lcom/whatsapp/util/y;)V
        //   187: astore          5
        //   189: goto            36
        //   192: astore_2       
        //   193: aload_0        
        //   194: monitorexit    
        //   195: aload_2        
        //   196: athrow         
        //   197: astore          6
        //   199: aload           6
        //   201: athrow         
        //   202: astore          11
        //   204: aload           11
        //   206: athrow         
        //   207: astore          10
        //   209: aconst_null    
        //   210: astore          5
        //   212: goto            36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  2      28     192    197    Any
        //  41     48     197    202    Ljava/io/FileNotFoundException;
        //  41     48     192    197    Any
        //  56     65     192    197    Any
        //  68     96     207    215    Ljava/io/FileNotFoundException;
        //  68     96     192    197    Any
        //  103    170    202    207    Ljava/io/FileNotFoundException;
        //  103    170    192    197    Any
        //  170    189    192    197    Any
        //  199    202    192    197    Any
        //  204    207    192    197    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 109, Size: 109
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
    
    @Override
    public void close() {
        while (true) {
            final boolean l;
            synchronized (this) {
                l = Log.l;
                try {
                    if (this.g == null) {
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            final Iterator<bz> iterator = new ArrayList<bz>(this.l.values()).iterator();
            while (true) {
                Label_0089: {
                    if (!iterator.hasNext()) {
                        break Label_0089;
                    }
                    final bz bz = iterator.next();
                    try {
                        if (com.whatsapp.util.bz.a(bz) != null) {
                            com.whatsapp.util.bz.a(bz).b();
                        }
                        if (l) {
                            this.a();
                            this.g.close();
                            this.g = null;
                            return;
                        }
                        continue;
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
        }
    }
    
    public boolean d(final String s) {
        while (true) {
            final boolean l;
            final bz bz;
            int i = 0;
            synchronized (this) {
                l = Log.l;
                this.d();
                this.a(s);
                bz = this.l.get(s);
                Label_0048: {
                    if (bz == null) {
                        break Label_0048;
                    }
                    try {
                        final bj a = com.whatsapp.util.bz.a(bz);
                        i = 0;
                        if (a != null) {
                            return false;
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                }
            }
            while (i < this.c) {
                final File b2 = bz.b(i);
                try {
                    if (!b2.delete()) {
                        throw new IOException(com.whatsapp.util.n.z[14] + b2);
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                this.j -= com.whatsapp.util.bz.b(bz)[i];
                com.whatsapp.util.bz.b(bz)[i] = 0L;
                ++i;
                if (l) {
                    break;
                }
            }
            try {
                ++this.n;
                this.g.append((CharSequence)(com.whatsapp.util.n.z[15] + s + '\n'));
                this.l.remove(s);
                if (this.e()) {
                    this.b.submit((Callable<Object>)this.i);
                }
                return true;
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
    }
    
    public void g() {
        this.close();
        b(this.m);
    }
    
    public boolean h() {
        try {
            if (this.g == null) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
}
