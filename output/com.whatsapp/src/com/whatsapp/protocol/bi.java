// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import com.whatsapp.DialogToastActivity;

public class bi
{
    public static final int[] A;
    public static int O;
    private static final String[] S;
    private static final Object h;
    private static final String i;
    private static int r;
    private byte[] B;
    public String C;
    public int D;
    public int E;
    public String F;
    public double G;
    private byte[] H;
    public byte I;
    public String J;
    public long K;
    public long L;
    public String M;
    public Object N;
    public String P;
    public String Q;
    public long R;
    public c6 a;
    public Integer b;
    public int c;
    public String d;
    public boolean e;
    private int f;
    private int g;
    public int j;
    public String k;
    public String[] l;
    private String m;
    public int n;
    public String o;
    public double p;
    public long q;
    public String s;
    public String t;
    public long u;
    private boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public long z;
    
    static {
        final String[] s = new String[13];
        String s2 = "\\wx0gO%u6)O`uymIq`yh[%u<q\\%n7)ZdvydMvr8nM";
        int n = -1;
        String[] array = s;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s2.toCharArray();
            for (int j = charArray.length, n3 = 0; j > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\t';
                        break;
                    }
                    case 0: {
                        c2 = '(';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = 'Y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s2 = "^f`+m";
                    n2 = 1;
                    array = s;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s2 = "Ah`>l";
                    n2 = 2;
                    array = s;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = s;
                    s2 = "Djb8}Ajo";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s2 = "Ipe0f";
                    n = 3;
                    array = s;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s2 = "^le<f";
                    n = 4;
                    n2 = 5;
                    array = s;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = s;
                    s2 = "[|r-lE";
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s2 = "Ah`>l";
                    n = 6;
                    array = s;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s2 = "^f`+m";
                    n = 7;
                    array = s;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    s2 = "[|r-lE";
                    n = 8;
                    n2 = 9;
                    array = s;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    array = s;
                    s2 = "^le<f";
                    n = 9;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s2 = "Ipe0f";
                    n = 10;
                    array = s;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s2 = "Djb8}Ajo";
                    n = 11;
                    array = s;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        S = s;
        A = new int[] { 14, 0, 1, 2, 3, 4, 5, 11, 12, 13, 8, 9, 10, 7, 6 };
        i = System.currentTimeMillis() / 1000L + "-";
        bi.r = 0;
        h = new Object();
    }
    
    public bi(final bi bi) {
        final int o = bi.O;
        this(bi.a);
        this.t = bi.t;
        this.Q = bi.Q;
        this.m = bi.m;
        this.H = bi.H;
        this.B = bi.B;
        this.g = bi.g;
        this.n = bi.n;
        this.u = bi.u;
        this.E = bi.E;
        this.d = bi.d;
        this.F = bi.F;
        this.o = bi.o;
        this.I = bi.I;
        this.L = bi.L;
        this.P = bi.P;
        this.D = bi.D;
        this.k = bi.k;
        this.M = bi.M;
        this.e = bi.e;
        this.p = bi.p;
        this.G = bi.G;
        this.s = bi.s;
        this.x = bi.x;
        this.j = bi.j;
        this.R = bi.R;
        this.J = bi.J;
        this.z = bi.z;
        this.K = bi.K;
        this.q = bi.q;
        this.C = bi.C;
        this.N = bi.N;
        this.w = bi.w;
        this.b = bi.b;
        if (DialogToastActivity.h) {
            bi.O = o + 1;
        }
    }
    
    public bi(final c6 a) {
        this.w = true;
        this.b = null;
        this.a = a;
    }
    
    public bi(final String s, final String m, final Object n) {
        this(s, true);
        this.m = m;
        this.N = n;
        this.u = System.currentTimeMillis();
    }
    
    private bi(final String s, final boolean b) {
        this.w = true;
        this.b = null;
        this.a = a(s, b);
    }
    
    public bi(final String s, final byte[] h, final Object n) {
        this(s, true);
        this.H = h;
        this.N = n;
        this.u = System.currentTimeMillis();
    }
    
    public static byte a(final String s) {
        byte b = 1;
        while (true) {
            if (s != null) {
                while (true) {
                    try {
                        if (s.length() == 0) {
                            b = 0;
                            return b;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (s.equalsIgnoreCase(bi.S[6])) {
                            return 7;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    try {
                        if (s.equalsIgnoreCase(bi.S[2])) {
                            return b;
                        }
                        final String s2 = s;
                        final String[] array = bi.S;
                        final int n = 4;
                        final String s3 = array[n];
                        final boolean equalsIgnoreCase = s2.equalsIgnoreCase(s3);
                        final boolean equalsIgnoreCase2 = equalsIgnoreCase;
                        if (equalsIgnoreCase2) {
                            return 2;
                        }
                        break;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        final String s2 = s;
                        final String[] array = bi.S;
                        final int n = 4;
                        final String s3 = array[n];
                        final boolean equalsIgnoreCase2;
                        final boolean equalsIgnoreCase = equalsIgnoreCase2 = s2.equalsIgnoreCase(s3);
                        if (equalsIgnoreCase2) {
                            return 2;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    break;
                }
                try {
                    if (s.equalsIgnoreCase(bi.S[5])) {
                        return 3;
                    }
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
                try {
                    if (s.equalsIgnoreCase(bi.S[1])) {
                        return 4;
                    }
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
                try {
                    if (s.equalsIgnoreCase(bi.S[3])) {
                        return 5;
                    }
                }
                catch (RuntimeException ex7) {
                    throw ex7;
                }
                return 0;
            }
            continue;
        }
    }
    
    public static c6 a(final String s, final boolean b) {
        synchronized (bi.h) {
            ++bi.r;
            return new c6(s, b, bi.i + Integer.toString(bi.r));
        }
    }
    
    public static String a(final byte b) {
        if (b != 0) {
            if (b == 7) {
                try {
                    return bi.S[9];
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            if (b == 1) {
                try {
                    return bi.S[7];
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            if (b == 2) {
                try {
                    return bi.S[11];
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            if (b == 3) {
                try {
                    return bi.S[10];
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            if (b == 4) {
                try {
                    return bi.S[8];
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            if (b == 5) {
                try {
                    return bi.S[12];
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
            }
        }
        return null;
    }
    
    public void a(final int f) {
        this.f = f;
    }
    
    public void a(final boolean v) {
        this.v = v;
    }
    
    public void a(final byte[] h) {
        this.H = h;
        this.m = null;
    }
    
    public boolean a() {
        try {
            if (this.m != null) {
                return true;
            }
            final bi bi = this;
            final byte[] array = bi.H;
            if (array != null) {
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            final bi bi = this;
            final byte[] array = bi.H;
            if (array != null) {
                return true;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public int b() {
        return this.g;
    }
    
    public void b(final int g) {
        Label_0020: {
            if (g >= 0) {
                if (g <= 2) {
                    break Label_0020;
                }
            }
            try {
                throw new IllegalArgumentException();
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        this.g = g;
    }
    
    public void b(final String m) {
        this.m = m;
        this.H = null;
    }
    
    public void b(final byte[] b) {
        this.B = b;
    }
    
    public String c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/bi.n:I
        //     4: iconst_1       
        //     5: if_icmpne       24
        //     8: new             Ljava/lang/RuntimeException;
        //    11: dup            
        //    12: getstatic       com/whatsapp/protocol/bi.S:[Ljava/lang/String;
        //    15: iconst_0       
        //    16: aaload         
        //    17: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    20: athrow         
        //    21: astore_1       
        //    22: aload_1        
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        com/whatsapp/protocol/bi.m:Ljava/lang/String;
        //    28: astore          4
        //    30: aload           4
        //    32: ifnonnull       53
        //    35: aload_0        
        //    36: getfield        com/whatsapp/protocol/bi.H:[B
        //    39: ifnull          53
        //    42: aload_0        
        //    43: aload_0        
        //    44: getfield        com/whatsapp/protocol/bi.H:[B
        //    47: invokestatic    com/whatsapp/protocol/b7.a:([B)Ljava/lang/String;
        //    50: putfield        com/whatsapp/protocol/bi.m:Ljava/lang/String;
        //    53: aload_0        
        //    54: getfield        com/whatsapp/protocol/bi.m:Ljava/lang/String;
        //    57: areturn        
        //    58: astore_2       
        //    59: aload_2        
        //    60: athrow         
        //    61: astore_3       
        //    62: aload_3        
        //    63: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      21     21     24     Ljava/lang/RuntimeException;
        //  24     30     58     61     Ljava/lang/RuntimeException;
        //  35     53     61     64     Ljava/lang/RuntimeException;
        //  59     61     61     64     Ljava/lang/RuntimeException;
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
    
    public byte[] d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/bi.H:[B
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       27
        //     9: aload_0        
        //    10: getfield        com/whatsapp/protocol/bi.m:Ljava/lang/String;
        //    13: ifnull          27
        //    16: aload_0        
        //    17: aload_0        
        //    18: getfield        com/whatsapp/protocol/bi.m:Ljava/lang/String;
        //    21: invokestatic    com/whatsapp/protocol/b7.a:(Ljava/lang/String;)[B
        //    24: putfield        com/whatsapp/protocol/bi.H:[B
        //    27: aload_0        
        //    28: getfield        com/whatsapp/protocol/bi.H:[B
        //    31: areturn        
        //    32: astore_1       
        //    33: aload_1        
        //    34: athrow         
        //    35: astore_2       
        //    36: aload_2        
        //    37: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      5      32     35     Ljava/lang/RuntimeException;
        //  9      27     35     38     Ljava/lang/RuntimeException;
        //  33     35     35     38     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    public boolean e() {
        return this.v;
    }
    
    public byte[] f() {
        return this.B;
    }
    
    public int g() {
        return this.f;
    }
}
