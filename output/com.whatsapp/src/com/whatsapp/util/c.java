// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.OutputStream;

public class c extends OutputStream
{
    private static final String z;
    final File a;
    final FileOutputStream b;
    boolean c;
    final File d;
    
    static {
        final char[] charArray = "\u0010D\t\u000bm$H\u000b\u000f.3y\nN%7D\t\u000b'".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'C';
                    break;
                }
                case 0: {
                    c2 = 'V';
                    break;
                }
                case 1: {
                    c2 = '-';
                    break;
                }
                case 2: {
                    c2 = 'e';
                    break;
                }
                case 3: {
                    c2 = 'n';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public c(final p p2, final File file) {
        this(p2, file, false);
    }
    
    public c(final p p0, final File p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/io/OutputStream.<init>:()V
        //     4: aload_0        
        //     5: iconst_0       
        //     6: putfield        com/whatsapp/util/c.c:Z
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokevirtual   com/whatsapp/util/p.e:()Ljava/io/File;
        //    14: putfield        com/whatsapp/util/c.d:Ljava/io/File;
        //    17: aload_0        
        //    18: aload_2        
        //    19: putfield        com/whatsapp/util/c.a:Ljava/io/File;
        //    22: aload_0        
        //    23: new             Ljava/io/FileOutputStream;
        //    26: dup            
        //    27: aload_0        
        //    28: getfield        com/whatsapp/util/c.d:Ljava/io/File;
        //    31: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    34: putfield        com/whatsapp/util/c.b:Ljava/io/FileOutputStream;
        //    37: iload_3        
        //    38: iconst_1       
        //    39: if_icmpne       93
        //    42: aload_0        
        //    43: getfield        com/whatsapp/util/c.a:Ljava/io/File;
        //    46: invokevirtual   java/io/File.exists:()Z
        //    49: ifeq            93
        //    52: aconst_null    
        //    53: astore          4
        //    55: new             Ljava/io/FileInputStream;
        //    58: dup            
        //    59: aload_0        
        //    60: getfield        com/whatsapp/util/c.a:Ljava/io/File;
        //    63: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    66: astore          5
        //    68: aload           5
        //    70: invokevirtual   java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //    73: aload_0        
        //    74: getfield        com/whatsapp/util/c.b:Ljava/io/FileOutputStream;
        //    77: invokevirtual   java/io/FileOutputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //    80: invokestatic    com/whatsapp/util/ba.a:(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
        //    83: aload           5
        //    85: ifnull          93
        //    88: aload           5
        //    90: invokevirtual   java/io/FileInputStream.close:()V
        //    93: return         
        //    94: astore          13
        //    96: aconst_null    
        //    97: astore          5
        //    99: aload           5
        //   101: ifnull          93
        //   104: aload           5
        //   106: invokevirtual   java/io/FileInputStream.close:()V
        //   109: return         
        //   110: astore          7
        //   112: aload           7
        //   114: athrow         
        //   115: astore          9
        //   117: aload_0        
        //   118: getfield        com/whatsapp/util/c.b:Ljava/io/FileOutputStream;
        //   121: invokevirtual   java/io/FileOutputStream.close:()V
        //   124: aload           9
        //   126: athrow         
        //   127: astore          10
        //   129: aload           4
        //   131: ifnull          139
        //   134: aload           4
        //   136: invokevirtual   java/io/FileInputStream.close:()V
        //   139: aload           10
        //   141: athrow         
        //   142: astore          11
        //   144: aload           11
        //   146: athrow         
        //   147: astore          12
        //   149: aload           5
        //   151: astore          4
        //   153: aload           12
        //   155: astore          10
        //   157: goto            129
        //   160: astore          8
        //   162: aload           5
        //   164: astore          4
        //   166: aload           8
        //   168: astore          9
        //   170: goto            117
        //   173: astore          6
        //   175: goto            99
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  55     68     94     99     Ljava/io/FileNotFoundException;
        //  55     68     115    117    Ljava/io/IOException;
        //  55     68     127    129    Any
        //  68     83     173    178    Ljava/io/FileNotFoundException;
        //  68     83     160    173    Ljava/io/IOException;
        //  68     83     147    160    Any
        //  104    109    110    115    Ljava/io/FileNotFoundException;
        //  117    127    127    129    Any
        //  134    139    142    147    Ljava/io/FileNotFoundException;
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
        synchronized (this) {
            if (!this.c) {
                this.c = true;
                this.b.close();
                this.a.delete();
                if (!this.d.renameTo(this.a)) {
                    throw new IOException(com.whatsapp.util.c.z);
                }
            }
        }
    }
    // monitorexit(this)
    
    @Override
    public void flush() {
        this.b.flush();
    }
    
    @Override
    public void write(final int n) {
        this.b.write(n);
    }
    
    @Override
    public void write(final byte[] array) {
        this.b.write(array);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        this.b.write(array, n, n2);
    }
}
