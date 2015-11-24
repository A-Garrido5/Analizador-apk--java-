// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class d7
{
    private static final String z;
    private final StringBuilder a;
    private final fB b;
    private final hN c;
    
    static {
        final char[] charArray = "kL_5\u0019FG[z\u0014A_]6\u0014K\t]6\rGHR/\u0010J[U9]YHP/\u0018\u0015\t".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '}';
                    break;
                }
                case 0: {
                    c2 = '/';
                    break;
                }
                case 1: {
                    c2 = ')';
                    break;
                }
                case 2: {
                    c2 = '<';
                    break;
                }
                case 3: {
                    c2 = 'Z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    d7(final hN c) {
        this.b = new fB();
        this.a = new StringBuilder();
        this.c = c;
    }
    
    static int a(final hN hn, final int n, final int n2) {
        int n3 = 0;
        final int c = ay.c;
        int i = 0;
        while (i < n2) {
            if (hn.a(n + i)) {
                n3 |= 1 << -1 + (n2 - i);
            }
            ++i;
            if (c != 0) {
                break;
            }
        }
        return n3;
    }
    
    private cR a(final int n) {
        final int c = ay.c;
        final int a = this.a(n, 5);
        if (a == 15) {
            try {
                return new cR(n + 5, '$');
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        if (a >= 5 && a < 15) {
            try {
                return new cR(n + 5, (char)(-5 + (a + 48)));
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        final int a2 = this.a(n, 7);
        if (a2 >= 64 && a2 < 90) {
            try {
                return new cR(n + 7, (char)(a2 + 1));
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
        }
        if (a2 >= 90 && a2 < 116) {
            try {
                return new cR(n + 7, (char)(a2 + 7));
            }
            catch (IllegalStateException ex4) {
                throw ex4;
            }
        }
        while (true) {
            Label_0441: {
                switch (this.a(n, 8)) {
                    case 232: {
                        final char c2 = '!';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 233: {
                        final char c2 = '\"';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 234: {
                        final char c2 = '%';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 235: {
                        final char c2 = '&';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 236: {
                        final char c2 = '\'';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 237: {
                        final char c2 = '(';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 238: {
                        final char c2 = ')';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 239: {
                        final char c2 = '*';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 240: {
                        final char c2 = '+';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 241: {
                        final char c2 = ',';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 242: {
                        final char c2 = '-';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 243: {
                        final char c2 = '.';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 244: {
                        final char c2 = '/';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 245: {
                        final char c2 = ':';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 246: {
                        final char c2 = ';';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 247: {
                        final char c2 = '<';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 248: {
                        final char c2 = '=';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 249: {
                        final char c2 = '>';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 250: {
                        final char c2 = '?';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 251: {
                        final char c2 = '_';
                        if (c != 0) {
                            break Label_0441;
                        }
                        return new cR(n + 8, c2);
                    }
                    case 252: {
                        final char c2 = ' ';
                        if (c == 0) {
                            return new cR(n + 8, c2);
                        }
                        break;
                    }
                }
            }
            try {
                throw fD.a();
            }
            catch (IllegalStateException ex5) {
                throw ex5;
            }
            continue;
        }
    }
    
    private fj a() {
        final int c = ay.c;
        while (this.b(this.b.f())) {
            final cy g = this.g(this.b.f());
            try {
                this.b.b(g.a());
                if (g.c()) {
                    if (g.d()) {
                        final cm cm = new cm(this.b.f(), this.a.toString());
                        if (c == 0) {
                            return new fj(cm, true);
                        }
                    }
                    final cm cm = new cm(this.b.f(), this.a.toString(), g.e());
                    return new fj(cm, true);
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            this.a.append(g.b());
            if (g.d()) {
                return new fj(new cm(this.b.f(), this.a.toString()), true);
            }
            this.a.append(g.e());
            if (c != 0) {
                break;
            }
        }
        try {
            if (this.e(this.b.f())) {
                this.b.a();
                this.b.a(4);
            }
            return new fj(false);
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
    }
    
    private cm b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/ay.c:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/d7.b:Lcom/google/fB;
        //     8: invokevirtual   com/google/fB.f:()I
        //    11: istore_2       
        //    12: aload_0        
        //    13: getfield        com/google/d7.b:Lcom/google/fB;
        //    16: invokevirtual   com/google/fB.d:()Z
        //    19: ifeq            39
        //    22: aload_0        
        //    23: invokespecial   com/google/d7.c:()Lcom/google/fj;
        //    26: astore          11
        //    28: aload           11
        //    30: invokevirtual   com/google/fj.a:()Z
        //    33: istore          12
        //    35: iload_1        
        //    36: ifeq            144
        //    39: aload_0        
        //    40: getfield        com/google/d7.b:Lcom/google/fB;
        //    43: invokevirtual   com/google/fB.c:()Z
        //    46: istore          4
        //    48: iload           4
        //    50: ifeq            70
        //    53: aload_0        
        //    54: invokespecial   com/google/d7.d:()Lcom/google/fj;
        //    57: astore          11
        //    59: aload           11
        //    61: invokevirtual   com/google/fj.a:()Z
        //    64: istore          12
        //    66: iload_1        
        //    67: ifeq            144
        //    70: aload_0        
        //    71: invokespecial   com/google/d7.a:()Lcom/google/fj;
        //    74: astore          5
        //    76: aload           5
        //    78: invokevirtual   com/google/fj.a:()Z
        //    81: istore          6
        //    83: aload           5
        //    85: astore          7
        //    87: aload_0        
        //    88: getfield        com/google/d7.b:Lcom/google/fB;
        //    91: invokevirtual   com/google/fB.f:()I
        //    94: istore          9
        //    96: iload_2        
        //    97: iload           9
        //    99: if_icmpeq       138
        //   102: iconst_1       
        //   103: istore          10
        //   105: iload           10
        //   107: ifne            119
        //   110: iload           6
        //   112: ifne            119
        //   115: iload_1        
        //   116: ifeq            124
        //   119: iload           6
        //   121: ifeq            4
        //   124: aload           7
        //   126: invokevirtual   com/google/fj.b:()Lcom/google/cm;
        //   129: areturn        
        //   130: astore_3       
        //   131: aload_3        
        //   132: athrow         
        //   133: astore          8
        //   135: aload           8
        //   137: athrow         
        //   138: iconst_0       
        //   139: istore          10
        //   141: goto            105
        //   144: iload           12
        //   146: istore          6
        //   148: aload           11
        //   150: astore          7
        //   152: goto            87
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  39     48     130    133    Ljava/lang/IllegalStateException;
        //  87     96     133    138    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    private boolean b(final int n) {
        final int c = ay.c;
        final int n2 = n + 7;
        Label_0055: {
            int n3;
            try {
                if (n2 <= this.c.b()) {
                    break Label_0055;
                }
                final int n4;
                n3 = (n4 = n + 4);
                final d7 d7 = this;
                final hN hn = d7.c;
                final int n5 = hn.b();
                if (n4 <= n5) {
                    return true;
                }
                return false;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final int n4 = n3;
                final d7 d7 = this;
                final hN hn = d7.c;
                final int n5 = hn.b();
                if (n4 <= n5) {
                    return true;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            return false;
        }
        int n6 = n;
    Label_0089_Outer:
        while (true) {
            while (true) {
                if (n6 < n + 3) {
                    try {
                        if (!this.c.a(n6)) {
                            ++n6;
                            if (c != 0) {
                                return this.c.a(n + 3);
                            }
                            continue Label_0089_Outer;
                        }
                    }
                    catch (IllegalStateException ex3) {
                        throw ex3;
                    }
                    break;
                }
                continue;
            }
        }
        return true;
    }
    
    private fj c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/ay.c:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: aload_0        
        //     6: getfield        com/google/d7.b:Lcom/google/fB;
        //     9: invokevirtual   com/google/fB.f:()I
        //    12: invokespecial   com/google/d7.h:(I)Z
        //    15: ifeq            98
        //    18: aload_0        
        //    19: aload_0        
        //    20: getfield        com/google/d7.b:Lcom/google/fB;
        //    23: invokevirtual   com/google/fB.f:()I
        //    26: invokespecial   com/google/d7.i:(I)Lcom/google/cR;
        //    29: astore          11
        //    31: aload_0        
        //    32: getfield        com/google/d7.b:Lcom/google/fB;
        //    35: aload           11
        //    37: invokevirtual   com/google/cR.a:()I
        //    40: invokevirtual   com/google/fB.b:(I)V
        //    43: aload           11
        //    45: invokevirtual   com/google/cR.b:()Z
        //    48: ifeq            81
        //    51: new             Lcom/google/fj;
        //    54: dup            
        //    55: new             Lcom/google/cm;
        //    58: dup            
        //    59: aload_0        
        //    60: getfield        com/google/d7.b:Lcom/google/fB;
        //    63: invokevirtual   com/google/fB.f:()I
        //    66: aload_0        
        //    67: getfield        com/google/d7.a:Ljava/lang/StringBuilder;
        //    70: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    73: invokespecial   com/google/cm.<init>:(ILjava/lang/String;)V
        //    76: iconst_1       
        //    77: invokespecial   com/google/fj.<init>:(Lcom/google/cm;Z)V
        //    80: areturn        
        //    81: aload_0        
        //    82: getfield        com/google/d7.a:Ljava/lang/StringBuilder;
        //    85: aload           11
        //    87: invokevirtual   com/google/cR.a:()C
        //    90: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: iload_1        
        //    95: ifeq            4
        //    98: aload_0        
        //    99: aload_0        
        //   100: getfield        com/google/d7.b:Lcom/google/fB;
        //   103: invokevirtual   com/google/fB.f:()I
        //   106: invokespecial   com/google/d7.d:(I)Z
        //   109: istore          7
        //   111: iload           7
        //   113: ifeq            135
        //   116: aload_0        
        //   117: getfield        com/google/d7.b:Lcom/google/fB;
        //   120: iconst_3       
        //   121: invokevirtual   com/google/fB.a:(I)V
        //   124: aload_0        
        //   125: getfield        com/google/d7.b:Lcom/google/fB;
        //   128: invokevirtual   com/google/fB.b:()V
        //   131: iload_1        
        //   132: ifeq            213
        //   135: aload_0        
        //   136: aload_0        
        //   137: getfield        com/google/d7.b:Lcom/google/fB;
        //   140: invokevirtual   com/google/fB.f:()I
        //   143: invokespecial   com/google/d7.f:(I)Z
        //   146: istore          8
        //   148: iload           8
        //   150: ifeq            213
        //   153: iconst_5       
        //   154: aload_0        
        //   155: getfield        com/google/d7.b:Lcom/google/fB;
        //   158: invokevirtual   com/google/fB.f:()I
        //   161: iadd           
        //   162: istore          9
        //   164: aload_0        
        //   165: getfield        com/google/d7.c:Lcom/google/hN;
        //   168: invokevirtual   com/google/hN.b:()I
        //   171: istore          10
        //   173: iload           9
        //   175: iload           10
        //   177: if_icmpge       192
        //   180: aload_0        
        //   181: getfield        com/google/d7.b:Lcom/google/fB;
        //   184: iconst_5       
        //   185: invokevirtual   com/google/fB.a:(I)V
        //   188: iload_1        
        //   189: ifeq            206
        //   192: aload_0        
        //   193: getfield        com/google/d7.b:Lcom/google/fB;
        //   196: aload_0        
        //   197: getfield        com/google/d7.c:Lcom/google/hN;
        //   200: invokevirtual   com/google/hN.b:()I
        //   203: invokevirtual   com/google/fB.b:(I)V
        //   206: aload_0        
        //   207: getfield        com/google/d7.b:Lcom/google/fB;
        //   210: invokevirtual   com/google/fB.e:()V
        //   213: new             Lcom/google/fj;
        //   216: dup            
        //   217: iconst_0       
        //   218: invokespecial   com/google/fj.<init>:(Z)V
        //   221: areturn        
        //   222: astore_2       
        //   223: aload_2        
        //   224: athrow         
        //   225: astore_3       
        //   226: aload_3        
        //   227: athrow         
        //   228: astore          4
        //   230: aload           4
        //   232: athrow         
        //   233: astore          5
        //   235: aload           5
        //   237: athrow         
        //   238: astore          6
        //   240: aload           6
        //   242: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  98     111    222    225    Ljava/lang/IllegalStateException;
        //  116    131    225    228    Ljava/lang/IllegalStateException;
        //  135    148    228    233    Ljava/lang/IllegalStateException;
        //  153    173    233    238    Ljava/lang/IllegalStateException;
        //  180    188    238    243    Ljava/lang/IllegalStateException;
        //  192    206    238    243    Ljava/lang/IllegalStateException;
        //  223    225    225    228    Ljava/lang/IllegalStateException;
        //  226    228    228    233    Ljava/lang/IllegalStateException;
        //  230    233    233    238    Ljava/lang/IllegalStateException;
        //  235    238    238    243    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 117, Size: 117
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
    
    private boolean c(final int n) {
        boolean b;
        while (true) {
            b = true;
            final int n2 = n + 5;
            try {
                if (n2 > this.c.b()) {
                    return false;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            final int a = this.a(n, 5);
            if (a >= 5 && a < 16) {
                break;
            }
            final int n3 = n + 7;
            try {
                if (n3 > this.c.b()) {
                    return false;
                }
                final int a2 = this.a(n, 7);
                if (a2 >= 64 && a2 < 116) {
                    return b;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            while (true) {
                final int n4 = n + 8;
                try {
                    if (n4 > this.c.b()) {
                        return false;
                    }
                    final int a3 = this.a(n, 8);
                    if (a3 >= 232 && a3 < 253) {
                        return b;
                    }
                }
                catch (IllegalStateException ex3) {
                    throw ex3;
                }
                b = false;
                return b;
            }
        }
        return b;
    }
    
    private fj d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/ay.c:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: aload_0        
        //     6: getfield        com/google/d7.b:Lcom/google/fB;
        //     9: invokevirtual   com/google/fB.f:()I
        //    12: invokespecial   com/google/d7.c:(I)Z
        //    15: ifeq            98
        //    18: aload_0        
        //    19: aload_0        
        //    20: getfield        com/google/d7.b:Lcom/google/fB;
        //    23: invokevirtual   com/google/fB.f:()I
        //    26: invokespecial   com/google/d7.a:(I)Lcom/google/cR;
        //    29: astore          11
        //    31: aload_0        
        //    32: getfield        com/google/d7.b:Lcom/google/fB;
        //    35: aload           11
        //    37: invokevirtual   com/google/cR.a:()I
        //    40: invokevirtual   com/google/fB.b:(I)V
        //    43: aload           11
        //    45: invokevirtual   com/google/cR.b:()Z
        //    48: ifeq            81
        //    51: new             Lcom/google/fj;
        //    54: dup            
        //    55: new             Lcom/google/cm;
        //    58: dup            
        //    59: aload_0        
        //    60: getfield        com/google/d7.b:Lcom/google/fB;
        //    63: invokevirtual   com/google/fB.f:()I
        //    66: aload_0        
        //    67: getfield        com/google/d7.a:Ljava/lang/StringBuilder;
        //    70: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    73: invokespecial   com/google/cm.<init>:(ILjava/lang/String;)V
        //    76: iconst_1       
        //    77: invokespecial   com/google/fj.<init>:(Lcom/google/cm;Z)V
        //    80: areturn        
        //    81: aload_0        
        //    82: getfield        com/google/d7.a:Ljava/lang/StringBuilder;
        //    85: aload           11
        //    87: invokevirtual   com/google/cR.a:()C
        //    90: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: iload_1        
        //    95: ifeq            4
        //    98: aload_0        
        //    99: aload_0        
        //   100: getfield        com/google/d7.b:Lcom/google/fB;
        //   103: invokevirtual   com/google/fB.f:()I
        //   106: invokespecial   com/google/d7.d:(I)Z
        //   109: istore          7
        //   111: iload           7
        //   113: ifeq            135
        //   116: aload_0        
        //   117: getfield        com/google/d7.b:Lcom/google/fB;
        //   120: iconst_3       
        //   121: invokevirtual   com/google/fB.a:(I)V
        //   124: aload_0        
        //   125: getfield        com/google/d7.b:Lcom/google/fB;
        //   128: invokevirtual   com/google/fB.b:()V
        //   131: iload_1        
        //   132: ifeq            213
        //   135: aload_0        
        //   136: aload_0        
        //   137: getfield        com/google/d7.b:Lcom/google/fB;
        //   140: invokevirtual   com/google/fB.f:()I
        //   143: invokespecial   com/google/d7.f:(I)Z
        //   146: istore          8
        //   148: iload           8
        //   150: ifeq            213
        //   153: iconst_5       
        //   154: aload_0        
        //   155: getfield        com/google/d7.b:Lcom/google/fB;
        //   158: invokevirtual   com/google/fB.f:()I
        //   161: iadd           
        //   162: istore          9
        //   164: aload_0        
        //   165: getfield        com/google/d7.c:Lcom/google/hN;
        //   168: invokevirtual   com/google/hN.b:()I
        //   171: istore          10
        //   173: iload           9
        //   175: iload           10
        //   177: if_icmpge       192
        //   180: aload_0        
        //   181: getfield        com/google/d7.b:Lcom/google/fB;
        //   184: iconst_5       
        //   185: invokevirtual   com/google/fB.a:(I)V
        //   188: iload_1        
        //   189: ifeq            206
        //   192: aload_0        
        //   193: getfield        com/google/d7.b:Lcom/google/fB;
        //   196: aload_0        
        //   197: getfield        com/google/d7.c:Lcom/google/hN;
        //   200: invokevirtual   com/google/hN.b:()I
        //   203: invokevirtual   com/google/fB.b:(I)V
        //   206: aload_0        
        //   207: getfield        com/google/d7.b:Lcom/google/fB;
        //   210: invokevirtual   com/google/fB.a:()V
        //   213: new             Lcom/google/fj;
        //   216: dup            
        //   217: iconst_0       
        //   218: invokespecial   com/google/fj.<init>:(Z)V
        //   221: areturn        
        //   222: astore_2       
        //   223: aload_2        
        //   224: athrow         
        //   225: astore_3       
        //   226: aload_3        
        //   227: athrow         
        //   228: astore          4
        //   230: aload           4
        //   232: athrow         
        //   233: astore          5
        //   235: aload           5
        //   237: athrow         
        //   238: astore          6
        //   240: aload           6
        //   242: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  98     111    222    225    Ljava/lang/IllegalStateException;
        //  116    131    225    228    Ljava/lang/IllegalStateException;
        //  135    148    228    233    Ljava/lang/IllegalStateException;
        //  153    173    233    238    Ljava/lang/IllegalStateException;
        //  180    188    238    243    Ljava/lang/IllegalStateException;
        //  192    206    238    243    Ljava/lang/IllegalStateException;
        //  223    225    225    228    Ljava/lang/IllegalStateException;
        //  226    228    228    233    Ljava/lang/IllegalStateException;
        //  230    233    233    238    Ljava/lang/IllegalStateException;
        //  235    238    238    243    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 117, Size: 117
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
    
    private boolean d(final int n) {
        while (true) {
            final int c = ay.c;
            final int n2 = n + 3;
            try {
                if (n2 > this.c.b()) {
                    return false;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            int n3 = n;
            while (true) {
                if (n3 >= n + 3) {
                    return true;
                }
                try {
                    if (this.c.a(n3)) {
                        return false;
                    }
                    ++n3;
                    if (c != 0) {
                        return true;
                    }
                    continue;
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
        }
    }
    
    private boolean e(final int n) {
        while (true) {
            final int c = ay.c;
            final int n2 = n + 1;
            try {
                if (n2 > this.c.b()) {
                    return false;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            int i = 0;
            while (i < 4) {
                final int n3 = i + n;
                try {
                    if (n3 >= this.c.b()) {
                        break;
                    }
                    final d7 d7 = this;
                    final hN hn = d7.c;
                    final int n4 = n;
                    final int n5 = i;
                    final int n6 = n4 + n5;
                    final boolean b = hn.a(n6);
                    if (b) {
                        return false;
                    }
                    ++i;
                    final int n7 = c;
                    if (n7 != 0) {
                        break;
                    }
                    continue;
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
                try {
                    final d7 d7 = this;
                    final hN hn = d7.c;
                    final int n4 = n;
                    final int n5 = i;
                    final int n6 = n4 + n5;
                    final boolean b = hn.a(n6);
                    if (b) {
                        return false;
                    }
                    ++i;
                    final int n7 = c;
                    if (n7 == 0) {
                        continue;
                    }
                }
                catch (IllegalStateException ex3) {
                    throw ex3;
                }
                break;
            }
            break;
        }
        return true;
    }
    
    private boolean f(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/ay.c:I
        //     3: istore_2       
        //     4: iload_1        
        //     5: iconst_1       
        //     6: iadd           
        //     7: istore_3       
        //     8: aload_0        
        //     9: getfield        com/google/d7.c:Lcom/google/hN;
        //    12: invokevirtual   com/google/hN.b:()I
        //    15: istore          5
        //    17: iload_3        
        //    18: iload           5
        //    20: if_icmple       30
        //    23: iconst_0       
        //    24: ireturn        
        //    25: astore          4
        //    27: aload           4
        //    29: athrow         
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload           6
        //    35: iconst_5       
        //    36: if_icmpge       91
        //    39: iload           6
        //    41: iload_1        
        //    42: iadd           
        //    43: istore          7
        //    45: aload_0        
        //    46: getfield        com/google/d7.c:Lcom/google/hN;
        //    49: invokevirtual   com/google/hN.b:()I
        //    52: istore          11
        //    54: iload           7
        //    56: iload           11
        //    58: if_icmpge       91
        //    61: iload           6
        //    63: iconst_2       
        //    64: if_icmpne       108
        //    67: aload_0        
        //    68: getfield        com/google/d7.c:Lcom/google/hN;
        //    71: iload_1        
        //    72: iconst_2       
        //    73: iadd           
        //    74: invokevirtual   com/google/hN.a:(I)Z
        //    77: istore          14
        //    79: iload           14
        //    81: ifeq            23
        //    84: iinc            6, 1
        //    87: iload_2        
        //    88: ifeq            33
        //    91: iconst_1       
        //    92: ireturn        
        //    93: astore          8
        //    95: aload           8
        //    97: athrow         
        //    98: astore          9
        //   100: aload           9
        //   102: athrow         
        //   103: astore          10
        //   105: aload           10
        //   107: athrow         
        //   108: aload_0        
        //   109: getfield        com/google/d7.c:Lcom/google/hN;
        //   112: iload_1        
        //   113: iload           6
        //   115: iadd           
        //   116: invokevirtual   com/google/hN.a:(I)Z
        //   119: istore          13
        //   121: iload           13
        //   123: ifeq            84
        //   126: iconst_0       
        //   127: ireturn        
        //   128: astore          12
        //   130: aload           12
        //   132: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      17     25     30     Ljava/lang/IllegalStateException;
        //  45     54     93     103    Ljava/lang/IllegalStateException;
        //  67     79     103    108    Ljava/lang/IllegalStateException;
        //  95     98     98     103    Ljava/lang/IllegalStateException;
        //  100    103    103    108    Ljava/lang/IllegalStateException;
        //  108    121    128    133    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0084:
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
    
    private cy g(final int n) {
        if (n + 7 > this.c.b()) {
            final int a = this.a(n, 4);
            if (a == 0) {
                try {
                    return new cy(this.c.b(), 10, 10);
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            return new cy(this.c.b(), a - 1, 10);
        }
        final int a2 = this.a(n, 7);
        return new cy(n + 7, (a2 - 8) / 11, (a2 - 8) % 11);
    }
    
    private boolean h(final int n) {
        boolean b;
        while (true) {
            b = true;
            final int n2 = n + 5;
            try {
                if (n2 > this.c.b()) {
                    return false;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            final int a = this.a(n, 5);
            if (a >= 5 && a < 16) {
                break;
            }
            while (true) {
                final int n3 = n + 6;
                try {
                    if (n3 > this.c.b()) {
                        return false;
                    }
                    final int a2 = this.a(n, 6);
                    if (a2 >= 16 && a2 < 63) {
                        return b;
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
                b = false;
                return b;
            }
        }
        return b;
    }
    
    private cR i(final int n) {
        final int c = ay.c;
        final int a = this.a(n, 5);
        if (a == 15) {
            try {
                return new cR(n + 5, '$');
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        if (a >= 5 && a < 15) {
            try {
                return new cR(n + 5, (char)(-5 + (a + 48)));
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        final int a2 = this.a(n, 6);
        if (a2 >= 32 && a2 < 58) {
            try {
                return new cR(n + 6, (char)(a2 + 33));
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
        }
        while (true) {
            Label_0230: {
                switch (a2) {
                    case 58: {
                        final char c2 = '*';
                        if (c != 0) {
                            break Label_0230;
                        }
                        return new cR(n + 6, c2);
                    }
                    case 59: {
                        final char c2 = ',';
                        if (c != 0) {
                            break Label_0230;
                        }
                        return new cR(n + 6, c2);
                    }
                    case 60: {
                        final char c2 = '-';
                        if (c != 0) {
                            break Label_0230;
                        }
                        return new cR(n + 6, c2);
                    }
                    case 61: {
                        final char c2 = '.';
                        if (c != 0) {
                            break Label_0230;
                        }
                        return new cR(n + 6, c2);
                    }
                    case 62: {
                        final char c2 = '/';
                        if (c == 0) {
                            return new cR(n + 6, c2);
                        }
                        break;
                    }
                }
            }
            try {
                throw new IllegalStateException(d7.z + a2);
            }
            catch (IllegalStateException ex4) {
                throw ex4;
            }
            continue;
        }
    }
    
    int a(final int n, final int n2) {
        return a(this.c, n, n2);
    }
    
    cm a(final int n, final String s) {
        cm b;
        try {
            this.a.setLength(0);
            if (s != null) {
                this.a.append(s);
            }
            this.b.b(n);
            b = this.b();
            if (b == null) {
                return new cm(this.b.f(), this.a.toString());
            }
            final cm cm = b;
            final boolean b2 = cm.b();
            if (b2) {
                final d7 d7 = this;
                final fB fb = d7.b;
                final int n2 = fb.f();
                final d7 d8 = this;
                final StringBuilder sb = d8.a;
                final String s2 = sb.toString();
                final cm cm2 = b;
                final int n3 = cm2.c();
                final cm cm3 = new cm(n2, s2, n3);
                return cm3;
            }
            return new cm(this.b.f(), this.a.toString());
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final cm cm = b;
            final boolean b2 = cm.b();
            if (b2) {
                final d7 d7 = this;
                final fB fb = d7.b;
                final int n2 = fb.f();
                final d7 d8 = this;
                final StringBuilder sb = d8.a;
                final String s2 = sb.toString();
                final cm cm2 = b;
                final int n3 = cm2.c();
                final cm cm4;
                final cm cm3 = cm4 = new cm(n2, s2, n3);
                return cm4;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return new cm(this.b.f(), this.a.toString());
    }
    
    String a(final StringBuilder sb, int a) {
        final int c = ay.c;
        String value = null;
        while (true) {
            final cm a2 = this.a(a, value);
            final String a3 = dz.a(a2.a());
            if (a3 != null) {
                sb.append(a3);
            }
            Label_0063: {
                if (a2.b()) {
                    value = String.valueOf(a2.c());
                    if (c == 0) {
                        break Label_0063;
                    }
                }
                value = null;
                try {
                    if (a != a2.a() || c != 0) {
                        a = a2.a();
                        if (c == 0) {
                            continue;
                        }
                    }
                    return sb.toString();
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
        }
    }
}
