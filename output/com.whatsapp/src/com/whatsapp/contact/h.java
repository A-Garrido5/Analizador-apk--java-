// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

public enum h
{
    public static final h BACKGROUND_DELTA;
    public static final h BACKGROUND_FULL;
    public static final h INTERACTIVE_DELTA;
    public static final h INTERACTIVE_FULL;
    public static final h REGISTRATION_FULL;
    private static final String[] z;
    private final d a;
    private final a c;
    
    static {
        final String[] z2 = new String[7];
        String s = "\u001fCd,$$X%\u0015.8I*p";
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
                        c2 = 'A';
                        break;
                    }
                    case 0: {
                        c2 = '\\';
                        break;
                    }
                    case 1: {
                        c2 = ',';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = 'X';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u\fn7a2C~x39\\x=29B~x |^o;.;Bc\"$8\fY!/?xs($";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0015b^\u001d\u0013\u001do^\u0011\u0017\u0019sL\r\r\u0010";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0015b^\u001d\u0013\u001do^\u0011\u0017\u0019sN\u001d\r\bm";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001emI\u0013\u0006\u000ec_\u0016\u0005\u0003j_\u0014\r";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001emI\u0013\u0006\u000ec_\u0016\u0005\u0003hO\u0014\u0015\u001d";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000eiM\u0011\u0012\b~K\f\b\u0013bU\u001e\u0014\u0010`";
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
        REGISTRATION_FULL = new h(h.z[6], 0, d.REGISTRATION, a.FULL);
        INTERACTIVE_FULL = new h(h.z[2], 1, d.INTERACTIVE, a.FULL);
        INTERACTIVE_DELTA = new h(h.z[3], 2, d.INTERACTIVE, a.DELTA);
        BACKGROUND_FULL = new h(h.z[4], 3, d.BACKGROUND, a.FULL);
        BACKGROUND_DELTA = new h(h.z[5], 4, d.BACKGROUND, a.DELTA);
    }
    
    private h(final String s, final int n, final d a, final a c) {
        this.a = a;
        this.c = c;
    }
    
    private static h a(final d d, final a a) {
        final boolean f = com.whatsapp.contact.f.f;
        final h[] values = values();
        final int length = values.length;
        int i = 0;
        while (i < length) {
            final h h = values[i];
            Label_0063: {
                try {
                    if (h.a != d) {
                        break Label_0063;
                    }
                    final h h2 = h;
                    final a a2 = h2.c;
                    final a a3 = a;
                    if (a2 == a3) {
                        return h;
                    }
                    break Label_0063;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                try {
                    final h h2 = h;
                    final a a2 = h2.c;
                    final a a3 = a;
                    if (a2 == a3) {
                        return h;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            ++i;
            if (f) {
                break;
            }
        }
        throw new IllegalArgumentException(h.z[0] + d + "/" + a + h.z[1]);
    }
    
    public static h combine(final h p0, final h p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: if_acmpeq       9
        //     5: aload_1        
        //     6: ifnonnull       13
        //     9: aload_0        
        //    10: astore_1       
        //    11: aload_1        
        //    12: areturn        
        //    13: aload_0        
        //    14: ifnull          11
        //    17: aload_0        
        //    18: getfield        com/whatsapp/contact/h.a:Lcom/whatsapp/contact/d;
        //    21: astore_2       
        //    22: aload_1        
        //    23: getfield        com/whatsapp/contact/h.a:Lcom/whatsapp/contact/d;
        //    26: astore_3       
        //    27: aload_2        
        //    28: aload_3        
        //    29: invokevirtual   com/whatsapp/contact/d.compareTo:(Ljava/lang/Enum;)I
        //    32: istore          5
        //    34: iload           5
        //    36: ifge            77
        //    39: aload_0        
        //    40: getfield        com/whatsapp/contact/h.c:Lcom/whatsapp/contact/a;
        //    43: astore          6
        //    45: aload_1        
        //    46: getfield        com/whatsapp/contact/h.c:Lcom/whatsapp/contact/a;
        //    49: astore          7
        //    51: aload           6
        //    53: aload           7
        //    55: invokevirtual   com/whatsapp/contact/a.compareTo:(Ljava/lang/Enum;)I
        //    58: istore          9
        //    60: iload           9
        //    62: ifge            87
        //    65: aload_2        
        //    66: aload           6
        //    68: invokestatic    com/whatsapp/contact/h.a:(Lcom/whatsapp/contact/d;Lcom/whatsapp/contact/a;)Lcom/whatsapp/contact/h;
        //    71: areturn        
        //    72: astore          4
        //    74: aload           4
        //    76: athrow         
        //    77: aload_3        
        //    78: astore_2       
        //    79: goto            39
        //    82: astore          8
        //    84: aload           8
        //    86: athrow         
        //    87: aload           7
        //    89: astore          6
        //    91: goto            65
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  27     34     72     77     Ljava/lang/IllegalArgumentException;
        //  51     60     82     87     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public String getSyncContext() {
        return this.a.getContextString();
    }
    
    public String getSyncMode() {
        return this.c.getModeString();
    }
    
    public boolean isFullSync() {
        try {
            if (this.c == com.whatsapp.contact.a.FULL) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
}
