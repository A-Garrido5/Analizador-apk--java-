// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.io.InputStream;
import java.util.ArrayList;

class hu extends hv
{
    private static final int[] c;
    private static final String[] z;
    private int d;
    private final hv e;
    private final int f;
    private final int g;
    private final hv h;
    
    static {
        int n = 1;
        int i = 0;
        final String[] z2 = new String[3];
        final char[] charArray = "Lln7\u0015%>*bW%".toCharArray();
        for (int j = charArray.length, n2 = 0; j > n2; ++n2) {
            final char c2 = charArray[n2];
            char c3 = '\0';
            switch (n2 % 5) {
                default: {
                    c3 = 'm';
                    break;
                }
                case 0: {
                    c3 = '\u0005';
                    break;
                }
                case 1: {
                    c3 = '\u0002';
                    break;
                }
                case 2: {
                    c3 = '\n';
                    break;
                }
                case 3: {
                    c3 = 'R';
                    break;
                }
            }
            charArray[n2] = (char)(c3 ^ c2);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "Lln7\u0015%<*>\bke~:W%".toCharArray();
        for (int k = charArray2.length, n3 = 0; k > n3; ++n3) {
            final char c4 = charArray2[n3];
            char c5 = '\0';
            switch (n3 % 5) {
                default: {
                    c5 = 'm';
                    break;
                }
                case 0: {
                    c5 = '\u0005';
                    break;
                }
                case 1: {
                    c5 = '\u0002';
                    break;
                }
                case 2: {
                    c5 = '\n';
                    break;
                }
                case 3: {
                    c5 = 'R';
                    break;
                }
            }
            charArray2[n3] = (char)(c5 ^ c4);
        }
        z2[n] = new String(charArray2).intern();
        final char[] charArray3 = ")\"".toCharArray();
        for (int l = charArray3.length, n4 = 0; l > n4; ++n4) {
            final char c6 = charArray3[n4];
            char c7 = '\0';
            switch (n4 % 5) {
                default: {
                    c7 = 'm';
                    break;
                }
                case 0: {
                    c7 = '\u0005';
                    break;
                }
                case 1: {
                    c7 = '\u0002';
                    break;
                }
                case 2: {
                    c7 = '\n';
                    break;
                }
                case 3: {
                    c7 = 'R';
                    break;
                }
            }
            charArray3[n4] = (char)(c7 ^ c6);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
        final ArrayList<Integer> list = new ArrayList<Integer>();
        int n6;
        for (int n5 = n; n5 > 0; n5 = n6) {
            list.add(n5);
            n6 = n + n5;
            n = n5;
        }
        list.add(Integer.MAX_VALUE);
        c = new int[list.size()];
        try {
            while (i < hu.c.length) {
                hu.c[i] = (int)list.get(i);
                ++i;
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw ex;
        }
    }
    
    static hv a(final hu hu) {
        return hu.e;
    }
    
    private boolean a(final hv hv) {
        final boolean b = dt.b;
        final w w = new w(this, null);
        final hj hj = w.next();
        final w w2 = new w(hv, null);
        hj hj2 = w2.next();
        int n = 0;
        hj hj3 = hj;
        int n2 = 0;
        int n3 = 0;
    Label_0112_Outer:
        while (true) {
            final int n4 = hj3.c() - n2;
            final int n5 = hj2.c() - n;
            final int min = Math.min(n4, n5);
            while (true) {
                Label_0124: {
                    if (n2 != 0) {
                        break Label_0124;
                    }
                    Label_0140: {
                        try {
                            final boolean b2 = hj3.a(hj2, n, min);
                            if (!b2) {
                                return false;
                            }
                            break Label_0140;
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {
                            throw ex;
                        }
                        break Label_0124;
                    }
                    final int n6 = n3 + min;
                    Label_0189: {
                        try {
                            if (n6 < this.f) {
                                break Label_0189;
                            }
                            final int n7 = n6;
                            final hu hu = this;
                            final int n8 = hu.f;
                            if (n7 == n8) {
                                return true;
                            }
                            break;
                        }
                        catch (ArrayIndexOutOfBoundsException ex2) {
                            throw ex2;
                        }
                        try {
                            final int n7 = n6;
                            final hu hu = this;
                            final int n8 = hu.f;
                            if (n7 == n8) {
                                return true;
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException ex3) {
                            throw ex3;
                        }
                        break;
                    }
                    Label_0225: {
                        hj hj4;
                        if (min == n4) {
                            hj4 = w.next();
                            if (!b) {
                                hj3 = hj4;
                                n2 = 0;
                                break Label_0225;
                            }
                            n2 = 0;
                        }
                        else {
                            hj4 = hj3;
                        }
                        n2 += min;
                        hj3 = hj4;
                    }
                    hj hj5 = null;
                    int n9 = 0;
                    Label_0258: {
                        if (min == n5) {
                            hj5 = w2.next();
                            if (!b) {
                                n9 = 0;
                                break Label_0258;
                            }
                            n = 0;
                        }
                        else {
                            hj5 = hj2;
                        }
                        n9 = n + min;
                    }
                    n = n9;
                    hj2 = hj5;
                    n3 = n6;
                    continue Label_0112_Outer;
                }
                final boolean b2 = hj2.a(hj3, n2, min);
                continue;
            }
        }
        throw new IllegalStateException();
    }
    
    static hv b(final hu hu) {
        return hu.h;
    }
    
    @Override
    protected int a(final int n, final int n2, final int n3) {
        final int n4 = n2 + n3;
        try {
            if (n4 <= this.g) {
                return this.h.a(n, n2, n3);
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw ex;
        }
        try {
            if (n2 >= this.g) {
                return this.e.a(n, n2 - this.g, n3);
            }
        }
        catch (ArrayIndexOutOfBoundsException ex2) {
            throw ex2;
        }
        final int n5 = this.g - n2;
        return this.e.a(this.h.a(n, n2, n5), 0, n3 - n5);
    }
    
    @Override
    public String a(final String s) {
        return new String(this.a(), s);
    }
    
    @Override
    protected void a(final byte[] p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore          5
        //     5: iload_2        
        //     6: iload           4
        //     8: iadd           
        //     9: istore          6
        //    11: aload_0        
        //    12: getfield        com/google/hu.g:I
        //    15: istore          10
        //    17: iload           6
        //    19: iload           10
        //    21: if_icmpgt       41
        //    24: aload_0        
        //    25: getfield        com/google/hu.h:Lcom/google/hv;
        //    28: aload_1        
        //    29: iload_2        
        //    30: iload_3        
        //    31: iload           4
        //    33: invokevirtual   com/google/hv.a:([BIII)V
        //    36: iload           5
        //    38: ifeq            109
        //    41: iload_2        
        //    42: aload_0        
        //    43: getfield        com/google/hu.g:I
        //    46: if_icmplt       71
        //    49: aload_0        
        //    50: getfield        com/google/hu.e:Lcom/google/hv;
        //    53: aload_1        
        //    54: iload_2        
        //    55: aload_0        
        //    56: getfield        com/google/hu.g:I
        //    59: isub           
        //    60: iload_3        
        //    61: iload           4
        //    63: invokevirtual   com/google/hv.a:([BIII)V
        //    66: iload           5
        //    68: ifeq            109
        //    71: aload_0        
        //    72: getfield        com/google/hu.g:I
        //    75: iload_2        
        //    76: isub           
        //    77: istore          11
        //    79: aload_0        
        //    80: getfield        com/google/hu.h:Lcom/google/hv;
        //    83: aload_1        
        //    84: iload_2        
        //    85: iload_3        
        //    86: iload           11
        //    88: invokevirtual   com/google/hv.a:([BIII)V
        //    91: aload_0        
        //    92: getfield        com/google/hu.e:Lcom/google/hv;
        //    95: aload_1        
        //    96: iconst_0       
        //    97: iload_3        
        //    98: iload           11
        //   100: iadd           
        //   101: iload           4
        //   103: iload           11
        //   105: isub           
        //   106: invokevirtual   com/google/hv.a:([BIII)V
        //   109: return         
        //   110: astore          7
        //   112: aload           7
        //   114: athrow         
        //   115: astore          8
        //   117: aload           8
        //   119: athrow         
        //   120: astore          9
        //   122: aload           9
        //   124: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  11     17     110    115    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  24     36     115    120    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  41     66     120    125    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  112    115    115    120    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  117    120    120    125    Ljava/lang/ArrayIndexOutOfBoundsException;
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
    public byte b(final int n) {
        if (n < 0) {
            try {
                throw new ArrayIndexOutOfBoundsException(hu.z[0] + n);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
        }
        try {
            if (n > this.f) {
                throw new ArrayIndexOutOfBoundsException(hu.z[1] + n + hu.z[2] + this.f);
            }
        }
        catch (ArrayIndexOutOfBoundsException ex2) {
            throw ex2;
        }
        if (n < this.g) {
            final byte b = this.h.b(n);
            if (!dt.b) {
                return b;
            }
        }
        return this.e.b(n - this.g);
    }
    
    @Override
    protected int b(final int n, final int n2, final int n3) {
        final int n4 = n2 + n3;
        try {
            if (n4 <= this.g) {
                return this.h.b(n, n2, n3);
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw ex;
        }
        try {
            if (n2 >= this.g) {
                return this.e.b(n, n2 - this.g, n3);
            }
        }
        catch (ArrayIndexOutOfBoundsException ex2) {
            throw ex2;
        }
        final int n5 = this.g - n2;
        return this.e.b(this.h.b(n, n2, n5), 0, n3 - n5);
    }
    
    @Override
    public boolean b() {
        final int a = this.e.a(this.h.a(0, 0, this.g), 0, this.e.c());
        boolean b = false;
        if (a == 0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public int c() {
        return this.f;
    }
    
    @Override
    protected int e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            try {
                if (!(o instanceof hv)) {
                    return false;
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
            final hv hv = (hv)o;
            try {
                if (this.f != hv.c()) {
                    return false;
                }
            }
            catch (ArrayIndexOutOfBoundsException ex2) {
                throw ex2;
            }
            int e;
            try {
                if (this.f == 0) {
                    return true;
                }
                if (this.d == 0) {
                    return this.a(hv);
                }
                e = hv.e();
                if (e == 0) {
                    return this.a(hv);
                }
                final hu hu = this;
                final int d = hu.d;
                final int d2 = d;
                final int n = e;
                if (d2 != n) {
                    return false;
                }
                return this.a(hv);
            }
            catch (ArrayIndexOutOfBoundsException ex3) {
                throw ex3;
            }
            try {
                final hu hu = this;
                final int d2;
                final int d = d2 = hu.d;
                final int n = e;
                if (d2 != n) {
                    return false;
                }
            }
            catch (ArrayIndexOutOfBoundsException ex4) {
                throw ex4;
            }
            return this.a(hv);
        }
        return true;
    }
    
    @Override
    public hb f() {
        return new er(this, null);
    }
    
    @Override
    public cL g() {
        return cL.a(new h_(this));
    }
    
    @Override
    public InputStream h() {
        return new h_(this);
    }
    
    @Override
    public int hashCode() {
        int d = this.d;
        if (d == 0) {
            d = this.b(this.f, 0, this.f);
            if (d == 0) {
                d = 1;
            }
            this.d = d;
        }
        return d;
    }
    
    @Override
    public Iterator iterator() {
        return this.f();
    }
}
