// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class r
{
    private static final String[] z;
    private final gN a;
    private final int[] b;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u0012\t7\u0016\u0000<\u000f\u001e5\":\u0000 \u0000R1\u0003y\u001d\u001d!L1\u0012\u00040L*\u0012\u001f0L\u001e\u0016\u001c0\u001e0\u00105\u0013L?\u001a\u00179\b";
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
                        c2 = 'r';
                        break;
                    }
                    case 0: {
                        c2 = 'U';
                        break;
                    }
                    case 1: {
                        c2 = 'l';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = 's';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "uGy";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "42";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "-2";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "uAy";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0012\t7\u0016\u0000<\u000f\u001e5\":\u0000 \u0000R1\u0003y\u001d\u001d!L1\u0012\u00040L*\u0012\u001f0L\u001e\u0016\u001c0\u001e0\u00105\u0013L?\u001a\u00179\b";
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
    
    r(final gN a, final int[] b) {
        int i = 1;
        if (b.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        final int length = b.length;
        Label_0125: {
            if (length > i) {
            Label_0076:
                while (true) {
                    try {
                        if (b[0] == 0) {
                            while (i < length) {
                                final int[] array = b;
                                final int n = i;
                                final int n2 = array[n];
                                final int n3 = n2;
                                if (n3 != 0) {
                                    break;
                                }
                                ++i;
                            }
                            break Label_0076;
                        }
                        break Label_0125;
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                    try {
                        final int[] array = b;
                        final int n = i;
                        final int n3;
                        final int n2 = n3 = array[n];
                        if (n3 == 0) {
                            ++i;
                            continue;
                        }
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                    break;
                }
                if (i == length) {
                    try {
                        this.b = new int[] { 0 };
                        return;
                    }
                    catch (IllegalArgumentException ex3) {
                        throw ex3;
                    }
                }
                System.arraycopy(b, i, this.b = new int[length - i], 0, this.b.length);
                return;
            }
        }
        this.b = b;
    }
    
    r a(final int n) {
        final boolean n2 = gN.n;
        Label_0027: {
            if (n != 0) {
                break Label_0027;
            }
            try {
                this = this.a.c();
                return this;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if (n != 1) {
            final int length = this.b.length;
            final int[] array = new int[length];
            int i = 0;
            while (i < length) {
                array[i] = this.a.b(this.b[i], n);
                ++i;
                if (n2) {
                    break;
                }
            }
            return new r(this.a, array);
        }
        return this;
    }
    
    r a(final int n, final int n2) {
        final boolean n3 = gN.n;
        if (n < 0) {
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if (n2 == 0) {
            try {
                return this.a.c();
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final int length = this.b.length;
        final int[] array = new int[length + n];
        int i = 0;
        while (i < length) {
            array[i] = this.a.b(this.b[i], n2);
            ++i;
            if (n3) {
                break;
            }
        }
        return new r(this.a, array);
    }
    
    r a(final r r) {
        final boolean n = gN.n;
        try {
            if (!this.a.equals(r.a)) {
                throw new IllegalArgumentException(r.z[5]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (this.a()) {
                return r;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (r.a()) {
                return this;
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        int[] b = this.b;
        int[] b2 = r.b;
        if (b.length <= b2.length) {
            final int[] array = b2;
            b2 = b;
            b = array;
        }
        final int[] array2 = new int[b.length];
        final int n2 = b.length - b2.length;
        System.arraycopy(b, 0, array2, 0, n2);
        int i = n2;
        while (i < b.length) {
            array2[i] = gN.c(b2[i - n2], b[i]);
            ++i;
            if (n) {
                break;
            }
        }
        return new r(this.a, array2);
    }
    
    boolean a() {
        try {
            final int n = this.b[0];
            boolean b = false;
            if (n == 0) {
                b = true;
            }
            return b;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    int b() {
        return -1 + this.b.length;
    }
    
    int b(final int n) {
        return this.b[-1 + this.b.length - n];
    }
    
    r b(final r p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/google/r.a:Lcom/google/gN;
        //     8: aload_1        
        //     9: getfield        com/google/r.a:Lcom/google/gN;
        //    12: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    15: ifne            34
        //    18: new             Ljava/lang/IllegalArgumentException;
        //    21: dup            
        //    22: getstatic       com/google/r.z:[Ljava/lang/String;
        //    25: iconst_0       
        //    26: aaload         
        //    27: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    30: athrow         
        //    31: astore_3       
        //    32: aload_3        
        //    33: athrow         
        //    34: aload_0        
        //    35: invokevirtual   com/google/r.a:()Z
        //    38: istore          6
        //    40: iload           6
        //    42: ifne            52
        //    45: aload_1        
        //    46: invokevirtual   com/google/r.a:()Z
        //    49: ifeq            70
        //    52: aload_0        
        //    53: getfield        com/google/r.a:Lcom/google/gN;
        //    56: invokevirtual   com/google/gN.c:()Lcom/google/r;
        //    59: areturn        
        //    60: astore          4
        //    62: aload           4
        //    64: athrow         
        //    65: astore          5
        //    67: aload           5
        //    69: athrow         
        //    70: aload_0        
        //    71: getfield        com/google/r.b:[I
        //    74: astore          7
        //    76: aload           7
        //    78: arraylength    
        //    79: istore          8
        //    81: aload_1        
        //    82: getfield        com/google/r.b:[I
        //    85: astore          9
        //    87: aload           9
        //    89: arraylength    
        //    90: istore          10
        //    92: iconst_m1      
        //    93: iload           8
        //    95: iload           10
        //    97: iadd           
        //    98: iadd           
        //    99: newarray        I
        //   101: astore          11
        //   103: iconst_0       
        //   104: istore          12
        //   106: iload           12
        //   108: iload           8
        //   110: if_icmpge       180
        //   113: aload           7
        //   115: iload           12
        //   117: iaload         
        //   118: istore          13
        //   120: iconst_0       
        //   121: istore          14
        //   123: iload           14
        //   125: iload           10
        //   127: if_icmpge       170
        //   130: aload           11
        //   132: iload           12
        //   134: iload           14
        //   136: iadd           
        //   137: aload           11
        //   139: iload           12
        //   141: iload           14
        //   143: iadd           
        //   144: iaload         
        //   145: aload_0        
        //   146: getfield        com/google/r.a:Lcom/google/gN;
        //   149: iload           13
        //   151: aload           9
        //   153: iload           14
        //   155: iaload         
        //   156: invokevirtual   com/google/gN.b:(II)I
        //   159: invokestatic    com/google/gN.c:(II)I
        //   162: iastore        
        //   163: iinc            14, 1
        //   166: iload_2        
        //   167: ifeq            123
        //   170: iload           12
        //   172: iconst_1       
        //   173: iadd           
        //   174: istore          15
        //   176: iload_2        
        //   177: ifeq            194
        //   180: new             Lcom/google/r;
        //   183: dup            
        //   184: aload_0        
        //   185: getfield        com/google/r.a:Lcom/google/gN;
        //   188: aload           11
        //   190: invokespecial   com/google/r.<init>:(Lcom/google/gN;[I)V
        //   193: areturn        
        //   194: iload           15
        //   196: istore          12
        //   198: goto            106
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      31     31     34     Ljava/lang/IllegalArgumentException;
        //  34     40     60     65     Ljava/lang/IllegalArgumentException;
        //  45     52     65     70     Ljava/lang/IllegalArgumentException;
        //  52     60     65     70     Ljava/lang/IllegalArgumentException;
        //  62     65     65     70     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
    
    int c(final int n) {
        int i = 0;
        final boolean n2 = gN.n;
        Label_0029: {
            if (n != 0) {
                break Label_0029;
            }
            try {
                return this.b(0);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final int length = this.b.length;
        if (n == 1) {
            final int[] b = this.b;
            final int length2 = b.length;
            int n3 = 0;
            while (i < length2) {
                n3 = gN.c(n3, b[i]);
                ++i;
                if (n2) {
                    return n3;
                }
            }
            return n3;
        }
        int n3 = this.b[0];
        int j = 1;
        while (j < length) {
            n3 = gN.c(this.a.b(n, n3), this.b[j]);
            ++j;
            if (n2) {
                return n3;
            }
        }
        return n3;
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       com/google/gN.n:Z
        //     5: istore_2       
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: bipush          8
        //    12: aload_0        
        //    13: invokevirtual   com/google/r.b:()I
        //    16: imul           
        //    17: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    20: astore_3       
        //    21: aload_0        
        //    22: invokevirtual   com/google/r.b:()I
        //    25: istore          4
        //    27: iload           4
        //    29: iflt            207
        //    32: aload_0        
        //    33: iload           4
        //    35: invokevirtual   com/google/r.b:(I)I
        //    38: istore          9
        //    40: iload           9
        //    42: ifeq            197
        //    45: iload           9
        //    47: ifge            69
        //    50: aload_3        
        //    51: getstatic       com/google/r.z:[Ljava/lang/String;
        //    54: iconst_4       
        //    55: aaload         
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: iload           9
        //    62: ineg           
        //    63: istore          9
        //    65: iload_2        
        //    66: ifeq            86
        //    69: aload_3        
        //    70: invokevirtual   java/lang/StringBuilder.length:()I
        //    73: ifle            86
        //    76: aload_3        
        //    77: getstatic       com/google/r.z:[Ljava/lang/String;
        //    80: iconst_1       
        //    81: aaload         
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: pop            
        //    86: iload           4
        //    88: ifeq            97
        //    91: iload           9
        //    93: iload_1        
        //    94: if_icmpeq       158
        //    97: aload_0        
        //    98: getfield        com/google/r.a:Lcom/google/gN;
        //   101: iload           9
        //   103: invokevirtual   com/google/gN.b:(I)I
        //   106: istore          12
        //   108: iload           12
        //   110: ifne            124
        //   113: aload_3        
        //   114: bipush          49
        //   116: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   119: pop            
        //   120: iload_2        
        //   121: ifeq            158
        //   124: iload           12
        //   126: iload_1        
        //   127: if_icmpne       141
        //   130: aload_3        
        //   131: bipush          97
        //   133: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   136: pop            
        //   137: iload_2        
        //   138: ifeq            158
        //   141: aload_3        
        //   142: getstatic       com/google/r.z:[Ljava/lang/String;
        //   145: iconst_2       
        //   146: aaload         
        //   147: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   150: pop            
        //   151: aload_3        
        //   152: iload           12
        //   154: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   157: pop            
        //   158: iload           4
        //   160: ifeq            197
        //   163: iload           4
        //   165: iload_1        
        //   166: if_icmpne       180
        //   169: aload_3        
        //   170: bipush          120
        //   172: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   175: pop            
        //   176: iload_2        
        //   177: ifeq            197
        //   180: aload_3        
        //   181: getstatic       com/google/r.z:[Ljava/lang/String;
        //   184: iconst_3       
        //   185: aaload         
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: pop            
        //   190: aload_3        
        //   191: iload           4
        //   193: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   196: pop            
        //   197: iload           4
        //   199: iconst_1       
        //   200: isub           
        //   201: istore          10
        //   203: iload_2        
        //   204: ifeq            271
        //   207: aload_3        
        //   208: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   211: astore          7
        //   213: getstatic       com/google/fN.a:I
        //   216: istore          8
        //   218: iload           8
        //   220: ifeq            233
        //   223: iload_2        
        //   224: ifeq            229
        //   227: iconst_0       
        //   228: istore_1       
        //   229: iload_1        
        //   230: putstatic       com/google/gN.n:Z
        //   233: aload           7
        //   235: areturn        
        //   236: astore          11
        //   238: aload           11
        //   240: athrow         
        //   241: astore          21
        //   243: aload           21
        //   245: athrow         
        //   246: astore          22
        //   248: aload           22
        //   250: athrow         
        //   251: astore          13
        //   253: aload           13
        //   255: athrow         
        //   256: astore          16
        //   258: aload           16
        //   260: athrow         
        //   261: astore          5
        //   263: aload           5
        //   265: athrow         
        //   266: astore          6
        //   268: aload           6
        //   270: athrow         
        //   271: iload           10
        //   273: istore          4
        //   275: goto            27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  69     86     236    241    Ljava/lang/IllegalArgumentException;
        //  113    120    241    251    Ljava/lang/IllegalArgumentException;
        //  130    137    251    256    Ljava/lang/IllegalArgumentException;
        //  141    158    251    256    Ljava/lang/IllegalArgumentException;
        //  169    176    256    261    Ljava/lang/IllegalArgumentException;
        //  180    197    256    261    Ljava/lang/IllegalArgumentException;
        //  207    218    261    271    Ljava/lang/IllegalArgumentException;
        //  243    246    246    251    Ljava/lang/IllegalArgumentException;
        //  248    251    251    256    Ljava/lang/IllegalArgumentException;
        //  263    266    266    271    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 148, Size: 148
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
}
