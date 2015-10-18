// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class aR
{
    private static final String[] z;
    private final int[] a;
    private final bp b;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u0014$\r93,89#3 8I(0y%\u00068\u007f1*\u001f)\u007f**\u0004)\u007f\u0014$\r93,8.\n\u007f?\"\f ;";
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
                        c2 = '_';
                        break;
                    }
                    case 0: {
                        c2 = 'Y';
                        break;
                    }
                    case 1: {
                        c2 = 'K';
                        break;
                    }
                    case 2: {
                        c2 = 'i';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0014$\r93,89#3 8I(0y%\u00068\u007f1*\u001f)\u007f**\u0004)\u007f\u0014$\r93,8.\n\u007f?\"\f ;";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "yfI";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "y`I";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "!\u0015";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0014$\r93,89#3 8I(0y%\u00068\u007f1*\u001f)\u007f**\u0004)\u007f\u0014$\r93,8.\n\u007f?\"\f ;";
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
    
    aR(final bp b, final int[] a) {
        int i = 1;
        if (a.length == 0) {
            throw new IllegalArgumentException();
        }
        this.b = b;
        final int length = a.length;
        Label_0125: {
            if (length > i) {
            Label_0076:
                while (true) {
                    try {
                        if (a[0] == 0) {
                            while (i < length) {
                                final int[] array = a;
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
                        final int[] array = a;
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
                        this.a = new int[] { 0 };
                        return;
                    }
                    catch (IllegalArgumentException ex3) {
                        throw ex3;
                    }
                }
                System.arraycopy(a, i, this.a = new int[length - i], 0, this.a.length);
                return;
            }
        }
        this.a = a;
    }
    
    aR a() {
        final int c = bp.c;
        final int length = this.a.length;
        final int[] array = new int[length];
        int i = 0;
        while (i < length) {
            array[i] = this.b.b(0, this.a[i]);
            ++i;
            if (c != 0) {
                break;
            }
        }
        try {
            final aR ar = new aR(this.b, array);
            if (fN.a != 0) {
                bp.c = c + 1;
            }
            return ar;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    aR a(final int n) {
        final int c = bp.c;
        Label_0027: {
            if (n != 0) {
                break Label_0027;
            }
            try {
                this = this.b.c();
                return this;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if (n != 1) {
            final int length = this.a.length;
            final int[] array = new int[length];
            int i = 0;
            while (i < length) {
                array[i] = this.b.c(this.a[i], n);
                ++i;
                if (c != 0) {
                    break;
                }
            }
            return new aR(this.b, array);
        }
        return this;
    }
    
    aR a(final int n, final int n2) {
        final int c = bp.c;
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
                return this.b.c();
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final int length = this.a.length;
        final int[] array = new int[length + n];
        int i = 0;
        while (i < length) {
            array[i] = this.b.c(this.a[i], n2);
            ++i;
            if (c != 0) {
                break;
            }
        }
        return new aR(this.b, array);
    }
    
    aR a(final aR ar) {
        final int c = bp.c;
        try {
            if (!this.b.equals(ar.b)) {
                throw new IllegalArgumentException(aR.z[5]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (this.b()) {
                return ar;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (ar.b()) {
                return this;
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        int[] a = this.a;
        int[] a2 = ar.a;
        if (a.length <= a2.length) {
            final int[] array = a2;
            a2 = a;
            a = array;
        }
        final int[] array2 = new int[a.length];
        final int n = a.length - a2.length;
        System.arraycopy(a, 0, array2, 0, n);
        int i = n;
        while (i < a.length) {
            array2[i] = this.b.d(a2[i - n], a[i]);
            ++i;
            if (c != 0) {
                break;
            }
        }
        return new aR(this.b, array2);
    }
    
    int b(final int n) {
        return this.a[-1 + this.a.length - n];
    }
    
    aR b(final aR p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/google/aR.b:Lcom/google/bp;
        //     8: aload_1        
        //     9: getfield        com/google/aR.b:Lcom/google/bp;
        //    12: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    15: ifne            34
        //    18: new             Ljava/lang/IllegalArgumentException;
        //    21: dup            
        //    22: getstatic       com/google/aR.z:[Ljava/lang/String;
        //    25: iconst_1       
        //    26: aaload         
        //    27: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    30: athrow         
        //    31: astore_3       
        //    32: aload_3        
        //    33: athrow         
        //    34: aload_0        
        //    35: invokevirtual   com/google/aR.b:()Z
        //    38: istore          6
        //    40: iload           6
        //    42: ifne            52
        //    45: aload_1        
        //    46: invokevirtual   com/google/aR.b:()Z
        //    49: ifeq            70
        //    52: aload_0        
        //    53: getfield        com/google/aR.b:Lcom/google/bp;
        //    56: invokevirtual   com/google/bp.c:()Lcom/google/aR;
        //    59: areturn        
        //    60: astore          4
        //    62: aload           4
        //    64: athrow         
        //    65: astore          5
        //    67: aload           5
        //    69: athrow         
        //    70: aload_0        
        //    71: getfield        com/google/aR.a:[I
        //    74: astore          7
        //    76: aload           7
        //    78: arraylength    
        //    79: istore          8
        //    81: aload_1        
        //    82: getfield        com/google/aR.a:[I
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
        //   110: if_icmpge       184
        //   113: aload           7
        //   115: iload           12
        //   117: iaload         
        //   118: istore          13
        //   120: iconst_0       
        //   121: istore          14
        //   123: iload           14
        //   125: iload           10
        //   127: if_icmpge       174
        //   130: aload           11
        //   132: iload           12
        //   134: iload           14
        //   136: iadd           
        //   137: aload_0        
        //   138: getfield        com/google/aR.b:Lcom/google/bp;
        //   141: aload           11
        //   143: iload           12
        //   145: iload           14
        //   147: iadd           
        //   148: iaload         
        //   149: aload_0        
        //   150: getfield        com/google/aR.b:Lcom/google/bp;
        //   153: iload           13
        //   155: aload           9
        //   157: iload           14
        //   159: iaload         
        //   160: invokevirtual   com/google/bp.c:(II)I
        //   163: invokevirtual   com/google/bp.d:(II)I
        //   166: iastore        
        //   167: iinc            14, 1
        //   170: iload_2        
        //   171: ifeq            123
        //   174: iload           12
        //   176: iconst_1       
        //   177: iadd           
        //   178: istore          15
        //   180: iload_2        
        //   181: ifeq            198
        //   184: new             Lcom/google/aR;
        //   187: dup            
        //   188: aload_0        
        //   189: getfield        com/google/aR.b:Lcom/google/bp;
        //   192: aload           11
        //   194: invokespecial   com/google/aR.<init>:(Lcom/google/bp;[I)V
        //   197: areturn        
        //   198: iload           15
        //   200: istore          12
        //   202: goto            106
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
    
    boolean b() {
        try {
            final int n = this.a[0];
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
    
    int c() {
        return -1 + this.a.length;
    }
    
    int c(final int n) {
        int i = 0;
        final int c = bp.c;
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
        final int length = this.a.length;
        if (n == 1) {
            final int[] a = this.a;
            final int length2 = a.length;
            int n2 = 0;
            while (i < length2) {
                n2 = this.b.d(n2, a[i]);
                ++i;
                if (c != 0) {
                    return n2;
                }
            }
            return n2;
        }
        int n2 = this.a[0];
        int j = 1;
        while (j < length) {
            n2 = this.b.d(this.b.c(n, n2), this.a[j]);
            ++j;
            if (c != 0) {
                return n2;
            }
        }
        return n2;
    }
    
    aR c(final aR ar) {
        try {
            if (!this.b.equals(ar.b)) {
                throw new IllegalArgumentException(aR.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (ar.b()) {
                return this;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return this.a(ar.a());
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/bp.c:I
        //     3: istore_1       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: bipush          8
        //    10: aload_0        
        //    11: invokevirtual   com/google/aR.c:()I
        //    14: imul           
        //    15: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    18: astore_2       
        //    19: aload_0        
        //    20: invokevirtual   com/google/aR.c:()I
        //    23: istore_3       
        //    24: iload_3        
        //    25: iflt            143
        //    28: aload_0        
        //    29: iload_3        
        //    30: invokevirtual   com/google/aR.b:(I)I
        //    33: istore          4
        //    35: iload           4
        //    37: ifeq            134
        //    40: iload           4
        //    42: ifge            64
        //    45: aload_2        
        //    46: getstatic       com/google/aR.z:[Ljava/lang/String;
        //    49: iconst_2       
        //    50: aaload         
        //    51: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    54: pop            
        //    55: iload           4
        //    57: ineg           
        //    58: istore          4
        //    60: iload_1        
        //    61: ifeq            81
        //    64: aload_2        
        //    65: invokevirtual   java/lang/StringBuilder.length:()I
        //    68: ifle            81
        //    71: aload_2        
        //    72: getstatic       com/google/aR.z:[Ljava/lang/String;
        //    75: iconst_3       
        //    76: aaload         
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: pop            
        //    81: iload_3        
        //    82: ifeq            91
        //    85: iload           4
        //    87: iconst_1       
        //    88: if_icmpeq       98
        //    91: aload_2        
        //    92: iload           4
        //    94: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    97: pop            
        //    98: iload_3        
        //    99: ifeq            134
        //   102: iload_3        
        //   103: iconst_1       
        //   104: if_icmpne       118
        //   107: aload_2        
        //   108: bipush          120
        //   110: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   113: pop            
        //   114: iload_1        
        //   115: ifeq            134
        //   118: aload_2        
        //   119: getstatic       com/google/aR.z:[Ljava/lang/String;
        //   122: iconst_4       
        //   123: aaload         
        //   124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: pop            
        //   128: aload_2        
        //   129: iload_3        
        //   130: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   133: pop            
        //   134: iload_3        
        //   135: iconst_1       
        //   136: isub           
        //   137: istore          5
        //   139: iload_1        
        //   140: ifeq            163
        //   143: aload_2        
        //   144: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   147: areturn        
        //   148: astore          6
        //   150: aload           6
        //   152: athrow         
        //   153: astore          7
        //   155: aload           7
        //   157: athrow         
        //   158: astore          9
        //   160: aload           9
        //   162: athrow         
        //   163: iload           5
        //   165: istore_3       
        //   166: goto            24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  64     81     148    153    Ljava/lang/IllegalArgumentException;
        //  91     98     153    158    Ljava/lang/IllegalArgumentException;
        //  107    114    158    163    Ljava/lang/IllegalArgumentException;
        //  118    134    158    163    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 94, Size: 94
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
