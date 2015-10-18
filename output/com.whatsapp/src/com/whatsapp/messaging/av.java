// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.io.FilterOutputStream;

final class av extends FilterOutputStream
{
    private static final String[] z;
    private final ByteBuffer a;
    private boolean b;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u0001/}\u0003\u0010";
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
                        c2 = '\u001a';
                        break;
                    }
                    case 0: {
                        c2 = '1';
                        break;
                    }
                    case 1: {
                        c2 = '\"';
                        break;
                    }
                    case 2: {
                        c2 = 'w';
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
                    s = "dv1#\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "dv1#\"";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "^W\u0003.wP[W`uE\u0002\u0015k:_W\u001bb";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "am$Z:\u001eA\u001fon\u0011j#ZJ\u001e\u0013Y?\u0017;j\u0018}n\u000b\u0002\u0014 mYC\u0003}{ARY`\u007fE/}[iTPZO}TL\u00034:|M\rgv]CX;4\u0001\u0002_mu\\R\u0016zsSN\u00125:fc4f{E\rF (\n\u0002\\fnERM!5FU\u0000 mYC\u0003}{ARYmu\\\r\u0014atEC\u0014z3<(#|{_Q\u0011kh\u001cg\u0019muUK\u0019i \u0011A\u001f{tZG\u0013\u0003\u0010<(";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "dv1#\"";
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
    
    public av(final OutputStream outputStream) {
        super(outputStream);
        if (outputStream == null) {
            throw new NullPointerException(av.z[3]);
        }
        this.a = ByteBuffer.allocate(8192);
    }
    
    private void a() {
        super.out.write(av.z[4].getBytes(av.z[5]));
        this.b = true;
    }
    
    @Override
    public void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aconst_null    
        //     3: astore_1       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/messaging/av.flush:()V
        //     8: aload_0        
        //     9: getfield        com/whatsapp/messaging/av.out:Ljava/io/OutputStream;
        //    12: getstatic       com/whatsapp/messaging/av.z:[Ljava/lang/String;
        //    15: iconst_0       
        //    16: aaload         
        //    17: getstatic       com/whatsapp/messaging/av.z:[Ljava/lang/String;
        //    20: iconst_1       
        //    21: aaload         
        //    22: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    25: invokevirtual   java/io/OutputStream.write:([B)V
        //    28: aload_0        
        //    29: invokespecial   java/io/FilterOutputStream.close:()V
        //    32: aload_1        
        //    33: ifnull          43
        //    36: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    39: aload_1        
        //    40: invokevirtual   java/lang/Thread.stop:(Ljava/lang/Throwable;)V
        //    43: aload_0        
        //    44: monitorexit    
        //    45: return         
        //    46: astore          5
        //    48: new             Ljava/lang/Error;
        //    51: dup            
        //    52: aload           5
        //    54: invokespecial   java/lang/Error.<init>:(Ljava/lang/Throwable;)V
        //    57: athrow         
        //    58: astore          4
        //    60: aload_0        
        //    61: monitorexit    
        //    62: aload           4
        //    64: athrow         
        //    65: astore_2       
        //    66: aload_1        
        //    67: ifnonnull       32
        //    70: aload_2        
        //    71: astore_1       
        //    72: goto            32
        //    75: astore_3       
        //    76: aload_3        
        //    77: athrow         
        //    78: astore_1       
        //    79: goto            28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                          
        //  -----  -----  -----  -----  ----------------------------------------------
        //  4      28     46     58     Ljava/nio/charset/UnsupportedCharsetException;
        //  4      28     78     82     Ljava/lang/Throwable;
        //  4      28     58     65     Any
        //  28     32     65     75     Ljava/lang/Throwable;
        //  28     32     58     65     Any
        //  36     43     75     78     Ljava/nio/charset/UnsupportedCharsetException;
        //  36     43     58     65     Any
        //  48     58     58     65     Any
        //  76     78     58     65     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 48, Size: 48
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
    public void flush() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/whatsapp/messaging/av.b:Z
        //     6: ifne            13
        //     9: aload_0        
        //    10: invokespecial   com/whatsapp/messaging/av.a:()V
        //    13: aload_0        
        //    14: getfield        com/whatsapp/messaging/av.a:Ljava/nio/ByteBuffer;
        //    17: invokevirtual   java/nio/ByteBuffer.position:()I
        //    20: ifle            114
        //    23: aload_0        
        //    24: getfield        com/whatsapp/messaging/av.out:Ljava/io/OutputStream;
        //    27: aload_0        
        //    28: getfield        com/whatsapp/messaging/av.a:Ljava/nio/ByteBuffer;
        //    31: invokevirtual   java/nio/ByteBuffer.position:()I
        //    34: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    37: getstatic       com/whatsapp/messaging/av.z:[Ljava/lang/String;
        //    40: iconst_2       
        //    41: aaload         
        //    42: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    45: invokevirtual   java/io/OutputStream.write:([B)V
        //    48: aload_0        
        //    49: getfield        com/whatsapp/messaging/av.out:Ljava/io/OutputStream;
        //    52: bipush          13
        //    54: invokevirtual   java/io/OutputStream.write:(I)V
        //    57: aload_0        
        //    58: getfield        com/whatsapp/messaging/av.out:Ljava/io/OutputStream;
        //    61: bipush          10
        //    63: invokevirtual   java/io/OutputStream.write:(I)V
        //    66: aload_0        
        //    67: getfield        com/whatsapp/messaging/av.out:Ljava/io/OutputStream;
        //    70: aload_0        
        //    71: getfield        com/whatsapp/messaging/av.a:Ljava/nio/ByteBuffer;
        //    74: invokevirtual   java/nio/ByteBuffer.array:()[B
        //    77: iconst_0       
        //    78: aload_0        
        //    79: getfield        com/whatsapp/messaging/av.a:Ljava/nio/ByteBuffer;
        //    82: invokevirtual   java/nio/ByteBuffer.position:()I
        //    85: invokevirtual   java/io/OutputStream.write:([BII)V
        //    88: aload_0        
        //    89: getfield        com/whatsapp/messaging/av.out:Ljava/io/OutputStream;
        //    92: bipush          13
        //    94: invokevirtual   java/io/OutputStream.write:(I)V
        //    97: aload_0        
        //    98: getfield        com/whatsapp/messaging/av.out:Ljava/io/OutputStream;
        //   101: bipush          10
        //   103: invokevirtual   java/io/OutputStream.write:(I)V
        //   106: aload_0        
        //   107: getfield        com/whatsapp/messaging/av.a:Ljava/nio/ByteBuffer;
        //   110: invokevirtual   java/nio/ByteBuffer.clear:()Ljava/nio/Buffer;
        //   113: pop            
        //   114: aload_0        
        //   115: invokespecial   java/io/FilterOutputStream.flush:()V
        //   118: aload_0        
        //   119: monitorexit    
        //   120: return         
        //   121: astore_2       
        //   122: aload_2        
        //   123: athrow         
        //   124: astore_1       
        //   125: aload_0        
        //   126: monitorexit    
        //   127: aload_1        
        //   128: athrow         
        //   129: astore_3       
        //   130: aload_3        
        //   131: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      13     121    124    Ljava/lang/NullPointerException;
        //  2      13     124    129    Any
        //  13     114    129    132    Ljava/lang/NullPointerException;
        //  13     114    124    129    Any
        //  114    118    124    129    Any
        //  122    124    124    129    Any
        //  130    132    124    129    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0013:
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
    public void write(final int n) {
        synchronized (this) {
            try {
                if (!this.a.hasRemaining()) {
                    this.flush();
                }
                this.a.put((byte)n);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        synchronized (this) {
            final boolean a = e.a;
            int i = n2;
            int n3 = n;
            while (i > this.a.remaining()) {
                final int remaining = this.a.remaining();
                this.a.put(array, n3, remaining);
                this.flush();
                n3 += remaining;
                i -= remaining;
                if (a) {
                    break;
                }
            }
            this.a.put(array, n3, i);
        }
    }
}
