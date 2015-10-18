// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public final class by
{
    private static final String[] z;
    private dO a;
    private final by[] b;
    private final hg[] c;
    private final b7 d;
    private final bW[] e;
    private final by[] f;
    private final bl[] g;
    private final E[] h;
    
    static {
        final String[] z2 = new String[9];
        final char[] charArray = "\u0003z?XE#piI\\(x Z\t.q9\\G.q'ZPj}']L2:".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ')';
                    break;
                }
                case 0: {
                    c2 = 'J';
                    break;
                }
                case 1: {
                    c2 = '\u0014';
                    break;
                }
                case 2: {
                    c2 = 'I';
                    break;
                }
                case 3: {
                    c2 = '9';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u000eq9\\G.q'Z@/giIH9g,]\t>{i\u007f@&q\r\\Z)f I]%fg[\\#x-\u007f[%ya\u0010\t.{'\u001e]jy(MJ\"4=QF9qiU@9`,]\t#ziMA/4\u000fPE/P,JJ8}9MF8D;V]%:".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = ')';
                    break;
                }
                case 0: {
                    c4 = 'J';
                    break;
                }
                case 1: {
                    c4 = '\u0014';
                    break;
                }
                case 2: {
                    c4 = 'I';
                    break;
                }
                case 3: {
                    c4 = '9';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u000eq9\\G.q'Z@/giIH9g,]\t>{i\u007f@&q\r\\Z)f I]%fg[\\#x-\u007f[%ya\u0010\t.{'\u001e]jy(MJ\"4=QF9qiU@9`,]\t#ziMA/4\u000fPE/P,JJ8}9MF8D;V]%:".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = ')';
                    break;
                }
                case 0: {
                    c6 = 'J';
                    break;
                }
                case 1: {
                    c6 = '\u0014';
                    break;
                }
                case 2: {
                    c6 = 'I';
                    break;
                }
                case 3: {
                    c6 = '9';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\fu UL.4=V\t:u;JLjd;V]%w&U\t(a/_L84-\\Z)f I]%fi_F84.\\G/f(ML.4*VM/:".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = ')';
                    break;
                }
                case 0: {
                    c8 = 'J';
                    break;
                }
                case 1: {
                    c8 = '\u0014';
                    break;
                }
                case 2: {
                    c8 = 'I';
                    break;
                }
                case 3: {
                    c8 = '9';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u0019`(WM+f-\u0019L$w&]@$sipz\u00059q\u0001\u001cs9x\u0019G%`iJ\\:d&K]/pi[Pj^\u001ft\u0007".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = ')';
                    break;
                }
                case 0: {
                    c10 = 'J';
                    break;
                }
                case 1: {
                    c10 = '\u0014';
                    break;
                }
                case 2: {
                    c10 = 'I';
                    break;
                }
                case 3: {
                    c10 = '9';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\fu UL.4=V\t:u;JLjd;V]%w&U\t(a/_L84-\\Z)f I]%fi_F84.\\G/f(ML.4*VM/:".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = ')';
                    break;
                }
                case 0: {
                    c12 = 'J';
                    break;
                }
                case 1: {
                    c12 = '\u0014';
                    break;
                }
                case 2: {
                    c12 = 'I';
                    break;
                }
                case 3: {
                    c12 = '9';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\u0003G\u0006\u0014\u0011r!p\u0014\u0018".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = ')';
                    break;
                }
                case 0: {
                    c14 = 'J';
                    break;
                }
                case 1: {
                    c14 = '\u0014';
                    break;
                }
                case 2: {
                    c14 = 'I';
                    break;
                }
                case 3: {
                    c14 = '9';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\u0003z?XE#pi\\D(q-]L.4-\\Z)f I]%fi_F84k".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = ')';
                    break;
                }
                case 0: {
                    c16 = 'J';
                    break;
                }
                case 1: {
                    c16 = '\u0014';
                    break;
                }
                case 2: {
                    c16 = 'I';
                    break;
                }
                case 3: {
                    c16 = '9';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "h:".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = ')';
                    break;
                }
                case 0: {
                    c18 = 'J';
                    break;
                }
                case 1: {
                    c18 = '\u0014';
                    break;
                }
                case 2: {
                    c18 = 'I';
                    break;
                }
                case 3: {
                    c18 = '9';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        z = z2;
    }
    
    private by(final dO a, final by[] array, final b7 d) {
        this.d = d;
        this.a = a;
        this.f = array.clone();
        this.b = new by[a.p()];
        for (int i = 0; i < a.p(); ++i) {
            final int d2 = a.d(i);
            Label_0071: {
                if (d2 < 0) {
                    break Label_0071;
                }
                try {
                    if (d2 >= this.f.length) {
                        throw new gG(this, by.z[0], null);
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            this.b[i] = this.f[a.d(i)];
        }
        d.a(this.d(), this);
        this.g = new bl[a.w()];
        int j = 0;
        try {
            while (j < a.w()) {
                this.g[j] = new bl(a.g(j), this, null, j, null);
                ++j;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        this.h = new E[a.g()];
        int k = 0;
        try {
            while (k < a.g()) {
                this.h[k] = new E(a.a(k), this, null, k, null);
                ++k;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        this.e = new bW[a.c()];
        int l = 0;
        try {
            while (l < a.c()) {
                this.e[l] = new bW(a.i(l), this, l, null);
                ++l;
            }
        }
        catch (RuntimeException ex4) {
            throw ex4;
        }
        this.c = new hg[a.I()];
        int n = 0;
        try {
            while (n < a.I()) {
                this.c[n] = new hg(a.h(n), this, null, n, true, null);
                ++n;
            }
        }
        catch (RuntimeException ex5) {
            throw ex5;
        }
    }
    
    static b7 a(final by by) {
        return by.d;
    }
    
    public static by a(final dO do1, final by[] array) {
        final by by = new by(do1, array, new b7(array));
        try {
            if (array.length != do1.o()) {
                throw new gG(by, com.google.by.z[2], null);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        int n = 0;
        while (true) {
            try {
                if (n >= do1.o()) {
                    break;
                }
                try {
                    if (!array[n].c().equals(do1.j(n))) {
                        throw new gG(by, com.google.by.z[1], null);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            ++n;
        }
        by.a();
        return by;
    }
    
    private void a() {
        int i = 0;
        final bl[] g = this.g;
        for (int length = g.length, j = 0; j < length; ++j) {
            bl.a(g[j]);
        }
        final bW[] e = this.e;
        for (int length2 = e.length, k = 0; k < length2; ++k) {
            bW.a(e[k]);
        }
        for (hg[] c = this.c; i < c.length; ++i) {
            hg.b(c[i]);
        }
    }
    
    private void a(final dO a) {
        this.a = a;
        int i = 0;
        try {
            while (i < this.g.length) {
                bl.a(this.g[i], a.g(i));
                ++i;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        int j = 0;
        try {
            while (j < this.h.length) {
                E.a(this.h[j], a.a(j));
                ++j;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        int n = 0;
        int k;
        try {
            while (true) {
                final int length = this.e.length;
                k = 0;
                if (n >= length) {
                    break;
                }
                bW.a(this.e[n], a.i(n));
                ++n;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        try {
            while (k < this.c.length) {
                hg.a(this.c[k], a.h(k));
                ++k;
            }
        }
        catch (RuntimeException ex4) {
            throw ex4;
        }
    }
    
    public static void a(final String[] p0, final by[] p1, final hA p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: astore_3       
        //     8: aload_0        
        //     9: arraylength    
        //    10: istore          4
        //    12: iconst_0       
        //    13: istore          5
        //    15: iload           5
        //    17: iload           4
        //    19: if_icmpge       37
        //    22: aload_3        
        //    23: aload_0        
        //    24: iload           5
        //    26: aaload         
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: pop            
        //    31: iinc            5, 1
        //    34: goto            15
        //    37: aload_3        
        //    38: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    41: getstatic       com/google/by.z:[Ljava/lang/String;
        //    44: bipush          6
        //    46: aaload         
        //    47: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    50: astore          7
        //    52: aload           7
        //    54: invokestatic    com/google/dO.a:([B)Lcom/google/dO;
        //    57: astore          9
        //    59: aload           9
        //    61: aload_1        
        //    62: invokestatic    com/google/by.a:(Lcom/google/dO;[Lcom/google/by;)Lcom/google/by;
        //    65: astore          11
        //    67: aload_2        
        //    68: aload           11
        //    70: invokeinterface com/google/hA.assignDescriptors:(Lcom/google/by;)Lcom/google/fU;
        //    75: astore          12
        //    77: aload           12
        //    79: ifnull          98
        //    82: aload           7
        //    84: aload           12
        //    86: invokestatic    com/google/dO.a:([BLcom/google/fu;)Lcom/google/dO;
        //    89: astore          14
        //    91: aload           11
        //    93: aload           14
        //    95: invokespecial   com/google/by.a:(Lcom/google/dO;)V
        //    98: return         
        //    99: astore          6
        //   101: new             Ljava/lang/RuntimeException;
        //   104: dup            
        //   105: getstatic       com/google/by.z:[Ljava/lang/String;
        //   108: iconst_4       
        //   109: aaload         
        //   110: aload           6
        //   112: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   115: athrow         
        //   116: astore          8
        //   118: new             Ljava/lang/IllegalArgumentException;
        //   121: dup            
        //   122: getstatic       com/google/by.z:[Ljava/lang/String;
        //   125: iconst_5       
        //   126: aaload         
        //   127: aload           8
        //   129: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   132: athrow         
        //   133: astore          10
        //   135: new             Ljava/lang/IllegalArgumentException;
        //   138: dup            
        //   139: new             Ljava/lang/StringBuilder;
        //   142: dup            
        //   143: invokespecial   java/lang/StringBuilder.<init>:()V
        //   146: getstatic       com/google/by.z:[Ljava/lang/String;
        //   149: bipush          7
        //   151: aaload         
        //   152: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   155: aload           9
        //   157: invokevirtual   com/google/dO.q:()Ljava/lang/String;
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: getstatic       com/google/by.z:[Ljava/lang/String;
        //   166: bipush          8
        //   168: aaload         
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   175: aload           10
        //   177: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   180: athrow         
        //   181: astore          13
        //   183: new             Ljava/lang/IllegalArgumentException;
        //   186: dup            
        //   187: getstatic       com/google/by.z:[Ljava/lang/String;
        //   190: iconst_3       
        //   191: aaload         
        //   192: aload           13
        //   194: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   197: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  37     52     99     116    Ljava/io/UnsupportedEncodingException;
        //  52     59     116    133    Lcom/google/bg;
        //  59     67     133    181    Lcom/google/gG;
        //  82     91     181    198    Lcom/google/bg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 96, Size: 96
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
    
    public List b() {
        return Collections.unmodifiableList((List<?>)Arrays.asList((T[])this.b));
    }
    
    public String c() {
        return this.a.q();
    }
    
    public String d() {
        return this.a.E();
    }
    
    public List e() {
        return Collections.unmodifiableList((List<?>)Arrays.asList((T[])this.g));
    }
    
    public dO f() {
        return this.a;
    }
}
