// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;

public final class aY implements aJ
{
    private static final String[] z;
    private int a;
    private ea b;
    private Map c;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = "\u001f^|+\u000f#\\=)\u0014\"V=.F/Bi*F,Io.\u001fmOu=\u0003:\u001b|!F\u0004tX7\u0005(Ki&\t#\u001b5<\u000e\"Nq+F#^k*\u0014mS|?\u0016(U4a".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'f';
                    break;
                }
                case 0: {
                    c2 = 'M';
                    break;
                }
                case 1: {
                    c2 = ';';
                    break;
                }
                case 2: {
                    c2 = '\u001d';
                    break;
                }
                case 3: {
                    c2 = 'O';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0017^o F$H=!\t9\u001b|o\u0010,Wt+F+Rx#\u0002mUh\"\u0004(I3".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'f';
                    break;
                }
                case 0: {
                    c4 = 'M';
                    break;
                }
                case 1: {
                    c4 = ';';
                    break;
                }
                case 2: {
                    c4 = '\u001d';
                    break;
                }
                case 3: {
                    c4 = 'O';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0017^o F$H=!\t9\u001b|o\u0010,Wt+F+Rx#\u0002mUh\"\u0004(I3".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'f';
                    break;
                }
                case 0: {
                    c6 = 'M';
                    break;
                }
                case 1: {
                    c6 = ';';
                    break;
                }
                case 2: {
                    c6 = '\u001d';
                    break;
                }
                case 3: {
                    c6 = 'O';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0017^o F$H=!\t9\u001b|o\u0010,Wt+F+Rx#\u0002mUh\"\u0004(I3".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'f';
                    break;
                }
                case 0: {
                    c8 = 'M';
                    break;
                }
                case 1: {
                    c8 = ';';
                    break;
                }
                case 2: {
                    c8 = '\u001d';
                    break;
                }
                case 3: {
                    c8 = 'O';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u0017^o F$H=!\t9\u001b|o\u0010,Wt+F+Rx#\u0002mUh\"\u0004(I3".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'f';
                    break;
                }
                case 0: {
                    c10 = 'M';
                    break;
                }
                case 1: {
                    c10 = ';';
                    break;
                }
                case 2: {
                    c10 = '\u001d';
                    break;
                }
                case 3: {
                    c10 = 'O';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        z = z2;
    }
    
    private ea b(final int a) {
        Label_0046: {
            Label_0030: {
                try {
                    if (this.b == null) {
                        break Label_0046;
                    }
                    final int n = a;
                    final aY ay = this;
                    final int n2 = ay.a;
                    if (n == n2) {
                        final aY ay2 = this;
                        return ay2.b;
                    }
                    break Label_0030;
                }
                catch (IllegalArgumentException ex) {
                    try {
                        throw ex;
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
                try {
                    final int n = a;
                    final aY ay = this;
                    final int n2 = ay.a;
                    if (n == n2) {
                        final aY ay2 = this;
                        return ay2.b;
                    }
                }
                catch (IllegalArgumentException ex4) {}
            }
            this.b(this.a, this.b.b());
        }
        if (a == 0) {
            return null;
        }
        final am am = this.c.get(a);
        try {
            this.a = a;
            this.b = com.google.am.c();
            if (am != null) {
                this.b.a(am);
            }
            return this.b;
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
    }
    
    private static aY c() {
        final aY ay = new aY();
        ay.d();
        return ay;
    }
    
    private void d() {
        this.c = Collections.emptyMap();
        this.a = 0;
        this.b = null;
    }
    
    static aY f() {
        return c();
    }
    
    @Override
    public aJ a(final byte[] array) {
        return this.a(array);
    }
    
    public aY a(final int n, final int n2) {
        if (n == 0) {
            try {
                throw new IllegalArgumentException(aY.z[2]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.b(n).b(n2);
        return this;
    }
    
    public aY a(final int p0, final am p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: ifne            22
        //     4: new             Ljava/lang/IllegalArgumentException;
        //     7: dup            
        //     8: getstatic       com/google/aY.z:[Ljava/lang/String;
        //    11: iconst_4       
        //    12: aaload         
        //    13: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    16: athrow         
        //    17: astore          8
        //    19: aload           8
        //    21: athrow         
        //    22: aload_0        
        //    23: iload_1        
        //    24: invokevirtual   com/google/aY.a:(I)Z
        //    27: istore          5
        //    29: iload           5
        //    31: ifeq            50
        //    34: aload_0        
        //    35: iload_1        
        //    36: invokespecial   com/google/aY.b:(I)Lcom/google/ea;
        //    39: aload_2        
        //    40: invokevirtual   com/google/ea.a:(Lcom/google/am;)Lcom/google/ea;
        //    43: pop            
        //    44: getstatic       com/google/dt.b:Z
        //    47: ifeq            67
        //    50: aload_0        
        //    51: iload_1        
        //    52: aload_2        
        //    53: invokevirtual   com/google/aY.b:(ILcom/google/am;)Lcom/google/aY;
        //    56: pop            
        //    57: aload_0        
        //    58: areturn        
        //    59: astore_3       
        //    60: aload_3        
        //    61: athrow         
        //    62: astore          4
        //    64: aload           4
        //    66: athrow         
        //    67: aload_0        
        //    68: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      17     17     22     Ljava/lang/IllegalArgumentException;
        //  22     29     59     62     Ljava/lang/IllegalArgumentException;
        //  34     50     62     67     Ljava/lang/IllegalArgumentException;
        //  50     57     62     67     Ljava/lang/IllegalArgumentException;
        //  60     62     62     67     Ljava/lang/IllegalArgumentException;
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
    
    public aY a(final cL cl) {
        final boolean b = dt.b;
        while (true) {
            final int a = cl.a();
            if (a == 0) {
                return this;
            }
            try {
                if ((!this.a(a, cl) && !b) || b) {
                    return this;
                }
                continue;
            }
            catch (IllegalArgumentException ex) {
                try {
                    throw ex;
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
        }
    }
    
    public aY a(final cL cl, final fu fu) {
        return this.a(cl);
    }
    
    public aY a(final ce ce) {
        final boolean b = dt.b;
        if (ce != ce.d()) {
            for (final Map.Entry<Integer, V> entry : ce.a(ce).entrySet()) {
                this.a(entry.getKey(), (am)entry.getValue());
                if (b) {
                    break;
                }
            }
        }
        return this;
    }
    
    @Override
    public aY a(final byte[] array) {
        try {
            final cL a = cL.a(array);
            this.a(a);
            a.g(0);
            return this;
        }
        catch (bg bg) {
            throw bg;
        }
        catch (IOException ex) {
            throw new RuntimeException(aY.z[0], ex);
        }
    }
    
    public ce a() {
        return this.g();
    }
    
    public boolean a(final int n) {
        if (n == 0) {
            try {
                throw new IllegalArgumentException(aY.z[3]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (n == this.a) {
                return true;
            }
            final aY ay = this;
            final Map map = ay.c;
            final int n2 = n;
            final Integer n3 = n2;
            final boolean b = map.containsKey(n3);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            final aY ay = this;
            final Map map = ay.c;
            final int n2 = n;
            final Integer n3 = n2;
            final boolean b = map.containsKey(n3);
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        return false;
    }
    
    public boolean a(final int n, final cL cl) {
        final int b = cp.b(n);
        Label_0139: {
            Label_0106: {
                Label_0091: {
                    try {
                        switch (cp.a(n)) {
                            default: {
                                throw bg.i();
                            }
                            case 0: {
                                this.b(b).b(cl.k());
                                return true;
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                break Label_0091;
                            }
                            case 3: {
                                break Label_0106;
                            }
                            case 4: {
                                return false;
                            }
                            case 5: {
                                break Label_0139;
                            }
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                    this.b(b).a(cl.n());
                    return true;
                }
                this.b(b).a(cl.e());
                return true;
            }
            final aY g = ce.g();
            cl.a(b, g, fU.a());
            this.b(b).a(g.g());
            return true;
        }
        this.b(b).a(cl.p());
        return true;
    }
    
    public aY b() {
        this.b(0);
        return ce.g().a(new ce(this.c, null));
    }
    
    public aY b(final int p0, final am p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: ifne            22
        //     4: new             Ljava/lang/IllegalArgumentException;
        //     7: dup            
        //     8: getstatic       com/google/aY.z:[Ljava/lang/String;
        //    11: iconst_1       
        //    12: aaload         
        //    13: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    16: athrow         
        //    17: astore          8
        //    19: aload           8
        //    21: athrow         
        //    22: aload_0        
        //    23: getfield        com/google/aY.b:Lcom/google/ea;
        //    26: astore          5
        //    28: aload           5
        //    30: ifnull          51
        //    33: aload_0        
        //    34: getfield        com/google/aY.a:I
        //    37: iload_1        
        //    38: if_icmpne       51
        //    41: aload_0        
        //    42: aconst_null    
        //    43: putfield        com/google/aY.b:Lcom/google/ea;
        //    46: aload_0        
        //    47: iconst_0       
        //    48: putfield        com/google/aY.a:I
        //    51: aload_0        
        //    52: getfield        com/google/aY.c:Ljava/util/Map;
        //    55: invokeinterface java/util/Map.isEmpty:()Z
        //    60: ifeq            74
        //    63: aload_0        
        //    64: new             Ljava/util/TreeMap;
        //    67: dup            
        //    68: invokespecial   java/util/TreeMap.<init>:()V
        //    71: putfield        com/google/aY.c:Ljava/util/Map;
        //    74: aload_0        
        //    75: getfield        com/google/aY.c:Ljava/util/Map;
        //    78: iload_1        
        //    79: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    82: aload_2        
        //    83: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    88: pop            
        //    89: aload_0        
        //    90: areturn        
        //    91: astore_3       
        //    92: aload_3        
        //    93: athrow         
        //    94: astore          4
        //    96: aload           4
        //    98: athrow         
        //    99: astore          6
        //   101: aload           6
        //   103: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      17     17     22     Ljava/lang/IllegalArgumentException;
        //  22     28     91     94     Ljava/lang/IllegalArgumentException;
        //  33     51     94     99     Ljava/lang/IllegalArgumentException;
        //  51     74     99     104    Ljava/lang/IllegalArgumentException;
        //  92     94     94     99     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 54, Size: 54
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
    public ci build() {
        return this.g();
    }
    
    @Override
    public ci buildPartial() {
        return this.a();
    }
    
    public Object clone() {
        return this.b();
    }
    
    public ce e() {
        return ce.d();
    }
    
    public ce g() {
        this.b(0);
        ce d = null;
        Label_0044: {
            if (this.c.isEmpty()) {
                d = ce.d();
                if (!dt.b) {
                    break Label_0044;
                }
            }
            d = new ce(Collections.unmodifiableMap((Map<?, ?>)this.c), null);
        }
        this.c = null;
        return d;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.e();
    }
    
    @Override
    public boolean isInitialized() {
        return true;
    }
    
    @Override
    public aJ mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
}
