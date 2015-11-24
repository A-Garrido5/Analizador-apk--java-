// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.io.InputStream;
import java.io.OutputStream;

public class c implements j
{
    private final byte[] a;
    private final OutputStream b;
    private final q c;
    
    public c() {
        this(null, null);
    }
    
    public c(final OutputStream b, final q c) {
        this.a = new byte[2048];
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final int p0, final InputStream p1, final int p2, final String p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/internal/network/c.b:Ljava/io/OutputStream;
        //     4: ifnull          104
        //     7: aload_0        
        //     8: getfield        com/twitter/internal/network/c.c:Lcom/twitter/internal/network/q;
        //    11: ifnull          104
        //    14: new             Lcom/twitter/internal/network/a;
        //    17: dup            
        //    18: aload_0        
        //    19: getfield        com/twitter/internal/network/c.b:Ljava/io/OutputStream;
        //    22: iload_3        
        //    23: i2l            
        //    24: aload_0        
        //    25: getfield        com/twitter/internal/network/c.c:Lcom/twitter/internal/network/q;
        //    28: invokespecial   com/twitter/internal/network/a.<init>:(Ljava/io/OutputStream;JLcom/twitter/internal/network/q;)V
        //    31: astore          6
        //    33: aload_0        
        //    34: getfield        com/twitter/internal/network/c.a:[B
        //    37: astore          7
        //    39: iload_3        
        //    40: ifge            138
        //    43: aload_2        
        //    44: aload           7
        //    46: iconst_0       
        //    47: aload           7
        //    49: arraylength    
        //    50: invokevirtual   java/io/InputStream.read:([BII)I
        //    53: istore          14
        //    55: iload           14
        //    57: iconst_m1      
        //    58: if_icmpeq       191
        //    61: aload           6
        //    63: ifnull          43
        //    66: aload           6
        //    68: aload           7
        //    70: iconst_0       
        //    71: iload           14
        //    73: invokevirtual   java/io/OutputStream.write:([BII)V
        //    76: goto            43
        //    79: astore          9
        //    81: aload_2        
        //    82: invokestatic    yh.a:(Ljava/io/InputStream;)I
        //    85: pop            
        //    86: aload           6
        //    88: ifnull          101
        //    91: aload           6
        //    93: invokevirtual   java/io/OutputStream.flush:()V
        //    96: aload           6
        //    98: invokevirtual   java/io/OutputStream.close:()V
        //   101: aload           9
        //   103: athrow         
        //   104: aload_0        
        //   105: getfield        com/twitter/internal/network/c.b:Ljava/io/OutputStream;
        //   108: astore          6
        //   110: goto            33
        //   113: iload           8
        //   115: ifle            138
        //   118: iload_3        
        //   119: iload           8
        //   121: isub           
        //   122: istore_3       
        //   123: aload           6
        //   125: ifnull          138
        //   128: aload           6
        //   130: aload           7
        //   132: iconst_0       
        //   133: iload           8
        //   135: invokevirtual   java/io/OutputStream.write:([BII)V
        //   138: iload_3        
        //   139: ifle            191
        //   142: aload_2        
        //   143: aload           7
        //   145: iconst_0       
        //   146: iload_3        
        //   147: aload           7
        //   149: arraylength    
        //   150: invokestatic    java/lang/Math.min:(II)I
        //   153: invokevirtual   java/io/InputStream.read:([BII)I
        //   156: istore          8
        //   158: iload           8
        //   160: iconst_m1      
        //   161: if_icmpne       113
        //   164: new             Ljava/io/IOException;
        //   167: dup            
        //   168: new             Ljava/lang/StringBuilder;
        //   171: dup            
        //   172: invokespecial   java/lang/StringBuilder.<init>:()V
        //   175: ldc             "Invalid content length: "
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: iload_3        
        //   181: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   190: athrow         
        //   191: aload_2        
        //   192: invokestatic    yh.a:(Ljava/io/InputStream;)I
        //   195: pop            
        //   196: aload           6
        //   198: ifnull          211
        //   201: aload           6
        //   203: invokevirtual   java/io/OutputStream.flush:()V
        //   206: aload           6
        //   208: invokevirtual   java/io/OutputStream.close:()V
        //   211: return         
        //   212: astore          11
        //   214: goto            101
        //   217: astore          13
        //   219: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  43     55     79     104    Any
        //  66     76     79     104    Any
        //  91     101    212    217    Ljava/io/IOException;
        //  128    138    79     104    Any
        //  142    158    79     104    Any
        //  164    191    79     104    Any
        //  201    211    217    220    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0101:
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
    
    @Override
    public void a(final l l) {
    }
}
