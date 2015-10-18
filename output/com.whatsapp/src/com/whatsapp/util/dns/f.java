// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

class f
{
    private static final String[] z;
    private final short a;
    private final String[] b;
    private final int c;
    
    static {
        final String[] z2 = new String[7];
        String s = "P(\u0013az\u0004*\u0019}4J(\f$vAg\u0014kzC\"\n$`L&\u0016$\"\u0017g\u001a}`A4";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0014';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = 'G';
                        break;
                    }
                    case 2: {
                        c2 = 'x';
                        break;
                    }
                    case 3: {
                        c2 = '\u0004';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "q\u0013>),";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "F>\fag\u0004.\u000b$}J$\u0017idH\"\fa";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "M)\u000bqrB.\u001bmqJ3X`uP&";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "F>\fag\u0004*\u0019}4J(\f$vAg\u0016qxH";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "P(\u0013az\u0004*\u0019}4J(\f$vAg\u0014kzC\"\n$`L&\u0016$\"\u0017g\u001a}`A4";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "q\u0013>),";
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
    }
    
    private f(final String[] b, final short a, final int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    static f a(final byte[] array, final int n) {
        final boolean a = b.a;
        if (array == null) {
            try {
                throw new NullPointerException(f.z[4]);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        try {
            if (array.length < 1) {
                throw new IllegalArgumentException(f.z[3]);
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        final ArrayList<String> list = new ArrayList<String>();
        final StringBuilder sb = new StringBuilder();
        int n2 = n;
        while (array[n2] != 0 && (0xC0 & array[n2]) == 0x0) {
            final byte b = (byte)(0x3F & array[n2]);
            final int n3 = n2 + 1;
            try {
                if (array.length < 1 + (n3 + b)) {
                    throw new IllegalArgumentException(f.z[2]);
                }
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
            sb.setLength(0);
            byte b2 = 0;
            while (b2 < b) {
                sb.append((char)array[n3 + b2]);
                ++b2;
                if (a) {
                    break;
                }
            }
            n2 = n3 + b;
            list.add(sb.toString());
            if (a) {
                break;
            }
        }
        if (array[n2] == 0) {
            ++n2;
            if (!a) {
                final int n4 = n2;
                final short a2 = 0;
                return new f(list.toArray(new String[list.size()]), a2, n4 - n);
            }
        }
        final short a2 = i.a((byte)(0x3F & array[n2]), array[n2 + 1]);
        final int n4 = n2 + 2;
        return new f(list.toArray(new String[list.size()]), a2, n4 - n);
    }
    
    static f a(final String[] array, final short n) {
        int n2 = 0;
        final boolean a = b.a;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final String s = array[i];
            byte[] bytes;
            try {
                bytes = s.getBytes(f.z[6]);
                try {
                    if (bytes.length > 63) {
                        throw new IllegalStateException(f.z[5]);
                    }
                }
                catch (UnsupportedEncodingException ex) {
                    throw ex;
                }
            }
            catch (UnsupportedEncodingException ex2) {
                throw new Error(ex2);
            }
            n2 += 1 + bytes.length;
            ++i;
            if (a) {
                break;
            }
        }
        if (n == 0) {
            ++n2;
            if (!a) {
                return new f(array, n, n2);
            }
        }
        n2 += 2;
        return new f(array, n, n2);
    }
    
    int a() {
        return this.c;
    }
    
    void a(final OutputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/util/dns/b.a:Z
        //     5: istore_3       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/util/dns/f.b:[Ljava/lang/String;
        //    10: astore          4
        //    12: aload           4
        //    14: arraylength    
        //    15: istore          5
        //    17: iload_2        
        //    18: iload           5
        //    20: if_icmpge       83
        //    23: aload           4
        //    25: iload_2        
        //    26: aaload         
        //    27: getstatic       com/whatsapp/util/dns/f.z:[Ljava/lang/String;
        //    30: iconst_1       
        //    31: aaload         
        //    32: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    35: astore          9
        //    37: aload           9
        //    39: arraylength    
        //    40: bipush          63
        //    42: if_icmple       63
        //    45: new             Ljava/lang/IllegalStateException;
        //    48: dup            
        //    49: getstatic       com/whatsapp/util/dns/f.z:[Ljava/lang/String;
        //    52: iconst_0       
        //    53: aaload         
        //    54: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    57: athrow         
        //    58: astore          10
        //    60: aload           10
        //    62: athrow         
        //    63: aload_1        
        //    64: aload           9
        //    66: arraylength    
        //    67: invokevirtual   java/io/OutputStream.write:(I)V
        //    70: aload_1        
        //    71: aload           9
        //    73: invokevirtual   java/io/OutputStream.write:([B)V
        //    76: iinc            2, 1
        //    79: iload_3        
        //    80: ifeq            17
        //    83: aload_0        
        //    84: getfield        com/whatsapp/util/dns/f.a:S
        //    87: istore          8
        //    89: iload           8
        //    91: ifeq            128
        //    94: aload_1        
        //    95: sipush          192
        //    98: bipush          63
        //   100: aload_0        
        //   101: getfield        com/whatsapp/util/dns/f.a:S
        //   104: bipush          8
        //   106: iushr          
        //   107: iand           
        //   108: ior            
        //   109: invokevirtual   java/io/OutputStream.write:(I)V
        //   112: aload_1        
        //   113: sipush          255
        //   116: aload_0        
        //   117: getfield        com/whatsapp/util/dns/f.a:S
        //   120: iand           
        //   121: invokevirtual   java/io/OutputStream.write:(I)V
        //   124: iload_3        
        //   125: ifeq            144
        //   128: aload_1        
        //   129: iconst_0       
        //   130: invokevirtual   java/io/OutputStream.write:(I)V
        //   133: return         
        //   134: astore          6
        //   136: aload           6
        //   138: athrow         
        //   139: astore          7
        //   141: aload           7
        //   143: athrow         
        //   144: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  37     58     58     63     Ljava/lang/IllegalStateException;
        //  83     89     134    139    Ljava/lang/IllegalStateException;
        //  94     124    139    144    Ljava/lang/IllegalStateException;
        //  128    133    139    144    Ljava/lang/IllegalStateException;
        //  136    139    139    144    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0128:
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
    
    short b() {
        return this.a;
    }
    
    String[] c() {
        return this.b;
    }
}
