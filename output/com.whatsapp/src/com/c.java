// 
// Decompiled by Procyon v0.5.30
// 

package com;

import com.whatsapp.util.Log;
import android.os.Build;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.DataInputStream;
import java.security.SecureRandomSpi;

public final class c extends SecureRandomSpi
{
    private static DataInputStream a;
    private static final Object b;
    private static final File c;
    private static OutputStream e;
    private static final String[] z;
    private boolean d;
    
    static {
        final String[] z2 = new String[7];
        String s = "\u0001p`4\\#1}7\u0019(al6\u0019";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '9';
                        break;
                    }
                    case 0: {
                        c3 = 'G';
                        break;
                    }
                    case 1: {
                        c3 = '\u0011';
                        break;
                    }
                    case 2: {
                        c3 = '\t';
                        break;
                    }
                    case 3: {
                        c3 = 'X';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "gwf*\u00195th<P)v";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0001p`4\\#1}7\u00195th<\u0019!cf5\u0019";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "4pd+L)v";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "#t\u007f1Z\"1`+\u0019*pg-_&r}-K\"u):@gBh5J2\u007fnc\u00192\u007fh:U\"1}7\u00194tl<\u0019\u0017CG\u001f\u0019!xe=\u0019";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "2\u007fh:U\"1}7\u00194tl<\u0019\u0017CG\u001f";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "hul.\u00162ch6](|";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        c = new File(com.c.z[6]);
        b = new Object();
    }
    
    private DataInputStream a() {
        synchronized (com.c.b) {
            Label_0034: {
                if (com.c.a != null) {
                    break Label_0034;
                }
                try {
                    com.c.a = new DataInputStream(new FileInputStream(com.c.c));
                    return com.c.a;
                }
                catch (IOException ex) {
                    throw new SecurityException(com.c.z[0] + com.c.c + com.c.z[1], ex);
                }
            }
        }
    }
    
    private OutputStream b() {
        synchronized (com.c.b) {
            if (com.c.e == null) {
                com.c.e = new FileOutputStream(com.c.c);
            }
            return com.c.e;
        }
    }
    
    @Override
    protected byte[] engineGenerateSeed(final int n) {
        final byte[] array = new byte[n];
        this.engineNextBytes(array);
        return array;
    }
    
    @Override
    protected void engineNextBytes(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/b.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/c.d:Z
        //     8: ifne            18
        //    11: aload_0        
        //    12: invokestatic    com/b.d:()[B
        //    15: invokevirtual   com/c.engineSetSeed:([B)V
        //    18: getstatic       com/c.b:Ljava/lang/Object;
        //    21: astore          5
        //    23: aload           5
        //    25: monitorenter   
        //    26: aload_0        
        //    27: invokespecial   com/c.a:()Ljava/io/DataInputStream;
        //    30: astore          7
        //    32: aload           5
        //    34: monitorexit    
        //    35: aload           7
        //    37: monitorenter   
        //    38: aload           7
        //    40: aload_1        
        //    41: invokevirtual   java/io/DataInputStream.readFully:([B)V
        //    44: aload           7
        //    46: monitorexit    
        //    47: iload_2        
        //    48: ifeq            69
        //    51: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //    54: istore          10
        //    56: iload           10
        //    58: ifeq            130
        //    61: iconst_0       
        //    62: istore          11
        //    64: iload           11
        //    66: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //    69: return         
        //    70: astore_3       
        //    71: aload_3        
        //    72: athrow         
        //    73: astore          6
        //    75: aload           5
        //    77: monitorexit    
        //    78: aload           6
        //    80: athrow         
        //    81: astore          4
        //    83: new             Ljava/lang/SecurityException;
        //    86: dup            
        //    87: new             Ljava/lang/StringBuilder;
        //    90: dup            
        //    91: invokespecial   java/lang/StringBuilder.<init>:()V
        //    94: getstatic       com/c.z:[Ljava/lang/String;
        //    97: iconst_2       
        //    98: aaload         
        //    99: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   102: getstatic       com/c.c:Ljava/io/File;
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   108: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   111: aload           4
        //   113: invokespecial   java/lang/SecurityException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   116: athrow         
        //   117: astore          8
        //   119: aload           7
        //   121: monitorexit    
        //   122: aload           8
        //   124: athrow         
        //   125: astore          9
        //   127: aload           9
        //   129: athrow         
        //   130: iconst_1       
        //   131: istore          11
        //   133: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      18     70     73     Ljava/io/IOException;
        //  18     26     81     117    Ljava/io/IOException;
        //  26     35     73     81     Any
        //  35     38     81     117    Ljava/io/IOException;
        //  38     47     117    125    Any
        //  51     56     125    130    Ljava/io/IOException;
        //  75     78     73     81     Any
        //  78     81     81     117    Ljava/io/IOException;
        //  119    122    117    125    Any
        //  122    125    81     117    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 70, Size: 70
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
    protected void engineSetSeed(final byte[] array) {
        try {
            if (com.c.z[3].equalsIgnoreCase(Build.MANUFACTURER)) {
                Log.w(com.c.z[4] + com.c.c);
                this.d = true;
                return;
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        Object b;
        try {
            b = com.c.b;
            // monitorenter(b)
            final c c = this;
            final OutputStream outputStream = c.b();
            final Object o = b;
            // monitorexit(o)
            final OutputStream outputStream2 = outputStream;
            final byte[] array2 = array;
            outputStream2.write(array2);
            final OutputStream outputStream3 = outputStream;
            outputStream3.flush();
            final c c2 = this;
            final boolean b2 = true;
            c2.d = b2;
            return;
        }
        catch (IOException ex2) {
            Log.c(com.c.z[5], ex2);
            return;
        }
        try {
            final c c = this;
            final OutputStream outputStream = c.b();
            final Object o = b;
            // monitorexit(o)
            final OutputStream outputStream2 = outputStream;
            final byte[] array2 = array;
            outputStream2.write(array2);
            final OutputStream outputStream3 = outputStream;
            outputStream3.flush();
            final c c2 = this;
            final boolean b2 = true;
            c2.d = b2;
        }
        finally {
        }
        // monitorexit(b)
    }
}
