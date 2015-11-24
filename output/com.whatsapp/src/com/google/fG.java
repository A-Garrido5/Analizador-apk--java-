// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.lang.reflect.Array;

public final class fG
{
    private static final c4 a;
    public static boolean b;
    
    static {
        a = new c4();
    }
    
    private static int a(final cr cr, int n, final int n2, final boolean b) {
        final boolean b2 = fG.b;
        int n3;
        if (b) {
            n3 = 1;
        }
        else {
            n3 = -1;
        }
        final boolean a = a(cr, n - n3);
        N a2 = null;
        if (a) {
            a2 = cr.a(n - n3).a(n2);
        }
        if (a2 != null) {
            if (b) {
                return a2.b();
            }
            return a2.f();
        }
        else {
            N n4 = cr.a(n).b(n2);
            if (n4 != null) {
                if (b) {
                    return n4.f();
                }
                return n4.b();
            }
            else {
                if (a(cr, n - n3)) {
                    n4 = cr.a(n - n3).b(n2);
                }
                if (n4 != null) {
                    if (b) {
                        return n4.b();
                    }
                    return n4.f();
                }
                else {
                    int n5 = 0;
                    while (a(cr, n - n3)) {
                        n -= n3;
                        final N[] a3 = cr.a(n).a();
                        final int length = a3.length;
                        int i = 0;
                        while (i < length) {
                            final N n6 = a3[i];
                            if (n6 != null) {
                                int n7;
                                if (b) {
                                    n7 = n6.b();
                                }
                                else {
                                    n7 = n6.f();
                                }
                                return n7 + n3 * n5 * (n6.b() - n6.f());
                            }
                            ++i;
                            if (b2) {
                                break;
                            }
                        }
                        ++n5;
                        if (b2) {
                            break;
                        }
                    }
                    if (b) {
                        return cr.g().a();
                    }
                    return cr.g().d();
                }
            }
        }
    }
    
    private static int a(final int[] array) {
        final boolean b = fG.b;
        final int length = array.length;
        int max = -1;
        int i = 0;
        while (i < length) {
            max = Math.max(max, array[i]);
            ++i;
            if (b) {
                break;
            }
        }
        return max;
    }
    
    private static int a(final int[] array, final int[] array2, final int n) {
        if ((array2 != null && array2.length > 3 + n / 2) || n < 0 || n > 512) {
            throw fh.a();
        }
        return fG.a.a(array, n, array2);
    }
    
    private static N a(final L l, final int n, final int n2, final boolean b, final int n3, final int n4, final int n5, final int n6) {
        final boolean b2 = fG.b;
        int b3 = b(l, n, n2, b, n3, n4);
        final int[] a = a(l, n, n2, b, b3, n4);
        if (a == null) {
            return null;
        }
        final int a2 = ex.a(a);
        int n8 = 0;
        Label_0125: {
            if (b) {
                final int n7 = b3 + a2;
                if (!b2) {
                    n8 = b3;
                    b3 = n7;
                    break Label_0125;
                }
            }
            int i = 0;
            while (i < a.length / 2) {
                final int n9 = a[i];
                a[i] = a[-1 + a.length - i];
                a[-1 + a.length - i] = n9;
                ++i;
                if (b2) {
                    break;
                }
            }
            n8 = b3 - a2;
        }
        if (!a(a2, n5, n6)) {
            return null;
        }
        final int e = dM.e(a);
        final int a3 = ex.a(e);
        if (a3 == -1) {
            return null;
        }
        return new N(n8, b3, b(e), a3);
    }
    
    private static Q a(final L l, final g3 g3, final cs cs, final boolean b, final int n, final int n2) {
        final boolean b2 = fG.b;
        final Q q = new Q(g3, b);
        int n6;
        for (int i = 0; i < 2; i = n6) {
            int n3;
            if (i == 0) {
                n3 = 1;
            }
            else {
                n3 = -1;
            }
            int n4 = (int)cs.a();
            int n5 = (int)cs.b();
            while (n5 <= g3.g() && n5 >= g3.b()) {
                final N a = a(l, 0, l.g(), b, n4, n5, n, n2);
                Label_0122: {
                    if (a != null) {
                        q.a(n5, a);
                        if (b) {
                            n4 = a.f();
                            if (!b2) {
                                break Label_0122;
                            }
                        }
                        n4 = a.b();
                    }
                }
                n5 += n3;
                if (b2) {
                    break;
                }
            }
            n6 = i + 1;
            if (b2) {
                break;
            }
        }
        return q;
    }
    
    private static aS a(final int p0, final int[] p1, final int[] p2, final int[] p3, final int[][] p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/fG.b:Z
        //     3: istore          5
        //     5: aload_3        
        //     6: arraylength    
        //     7: newarray        I
        //     9: astore          6
        //    11: bipush          100
        //    13: istore          7
        //    15: iload           7
        //    17: iconst_1       
        //    18: isub           
        //    19: istore          8
        //    21: iload           7
        //    23: ifle            190
        //    26: iconst_0       
        //    27: istore          9
        //    29: iload           9
        //    31: aload           6
        //    33: arraylength    
        //    34: if_icmpge       62
        //    37: aload_1        
        //    38: aload_3        
        //    39: iload           9
        //    41: iaload         
        //    42: aload           4
        //    44: iload           9
        //    46: aaload         
        //    47: aload           6
        //    49: iload           9
        //    51: iaload         
        //    52: iaload         
        //    53: iastore        
        //    54: iinc            9, 1
        //    57: iload           5
        //    59: ifeq            29
        //    62: aload_1        
        //    63: iload_0        
        //    64: aload_2        
        //    65: invokestatic    com/google/fG.a:([II[I)Lcom/google/aS;
        //    68: astore          18
        //    70: aload           18
        //    72: areturn        
        //    73: astore          10
        //    75: aload           6
        //    77: arraylength    
        //    78: ifne            90
        //    81: invokestatic    com/google/fh.a:()Lcom/google/fh;
        //    84: athrow         
        //    85: astore          11
        //    87: aload           11
        //    89: athrow         
        //    90: iconst_0       
        //    91: istore          12
        //    93: iload           12
        //    95: aload           6
        //    97: arraylength    
        //    98: if_icmpge       185
        //   101: aload           6
        //   103: iload           12
        //   105: iaload         
        //   106: istore          16
        //   108: aload           4
        //   110: iload           12
        //   112: aaload         
        //   113: arraylength    
        //   114: istore          17
        //   116: iload           16
        //   118: iload           17
        //   120: iconst_1       
        //   121: isub           
        //   122: if_icmpge       142
        //   125: aload           6
        //   127: iload           12
        //   129: iconst_1       
        //   130: aload           6
        //   132: iload           12
        //   134: iaload         
        //   135: iadd           
        //   136: iastore        
        //   137: iload           5
        //   139: ifeq            185
        //   142: aload           6
        //   144: iload           12
        //   146: iconst_0       
        //   147: iastore        
        //   148: iload           12
        //   150: iconst_m1      
        //   151: aload           6
        //   153: arraylength    
        //   154: iadd           
        //   155: if_icmpne       177
        //   158: invokestatic    com/google/fh.a:()Lcom/google/fh;
        //   161: athrow         
        //   162: astore          15
        //   164: aload           15
        //   166: athrow         
        //   167: astore          13
        //   169: aload           13
        //   171: athrow         
        //   172: astore          14
        //   174: aload           14
        //   176: athrow         
        //   177: iinc            12, 1
        //   180: iload           5
        //   182: ifeq            93
        //   185: iload           5
        //   187: ifeq            194
        //   190: invokestatic    com/google/fh.a:()Lcom/google/fh;
        //   193: athrow         
        //   194: iload           8
        //   196: istore          7
        //   198: goto            15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  62     70     73     190    Lcom/google/fh;
        //  75     85     85     90     Lcom/google/fh;
        //  101    116    167    172    Lcom/google/fh;
        //  125    137    172    177    Lcom/google/fh;
        //  142    162    162    167    Lcom/google/fh;
        //  169    172    172    177    Lcom/google/fh;
        //  174    177    162    167    Lcom/google/fh;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0142:
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
    
    public static aS a(final L l, final cs cs, final cs cs2, final cs cs3, final cs cs4, final int n, final int n2) {
        final boolean b = fG.b;
        final g3 g3 = new g3(l, cs, cs2, cs3, cs4);
        Q q = null;
        int i = 0;
        g3 g4 = g3;
        cr cr = null;
        Q q2 = null;
        while (true) {
            while (i < 2) {
                Q a;
                if (cs != null) {
                    a = a(l, g4, cs, true, n, n2);
                }
                else {
                    a = q2;
                }
                Q a2;
                if (cs3 != null) {
                    a2 = a(l, g4, cs3, false, n, n2);
                }
                else {
                    a2 = q;
                }
                final cr a3 = a(a, a2);
                if (a3 == null) {
                    throw fv.a();
                }
                Label_0176: {
                    Label_0165: {
                        if (i == 0 && a3.g() != null && (a3.g().b() < g4.b() || a3.g().g() > g4.g())) {
                            g4 = a3.g();
                            if (!b) {
                                break Label_0165;
                            }
                        }
                        a3.a(g4);
                        if (!b) {
                            break Label_0176;
                        }
                    }
                    final int n3 = i + 1;
                    if (!b) {
                        i = n3;
                        q = a2;
                        cr = a3;
                        q2 = a;
                        continue;
                    }
                }
                final cr cr2 = a3;
                final g3 g5 = g4;
                final Q q3 = a;
                final int n4 = 1 + cr2.a();
                cr2.a(0, q3);
                cr2.a(n4, a2);
                final boolean b2 = q3 != null;
                int j = 1;
                int max = n2;
                int min = n;
                while (j <= n4) {
                    int n5;
                    if (b2) {
                        n5 = j;
                    }
                    else {
                        n5 = n4 - j;
                    }
                    if (cr2.a(n5) == null || b) {
                        P p7 = null;
                        Label_0313: {
                            if (n5 == 0 || n5 == n4) {
                                final Q q4 = new Q(g5, n5 == 0);
                                if (!b) {
                                    p7 = q4;
                                    break Label_0313;
                                }
                            }
                            p7 = new P(g5);
                        }
                        cr2.a(n5, p7);
                        int k = g5.b();
                        int n6 = -1;
                    Label_0453_Outer:
                        while (k <= g5.g()) {
                            int a4 = a(cr2, n5, k, b2);
                            while (true) {
                                Label_0504: {
                                    if (a4 < 0 || a4 > g5.d()) {
                                        if (n6 == -1 && !b) {
                                            break Label_0504;
                                        }
                                        a4 = n6;
                                    }
                                    final N a5 = a(l, g5.a(), g5.d(), b2, a4, k, min, max);
                                    if (a5 == null) {
                                        break Label_0504;
                                    }
                                    p7.a(k, a5);
                                    min = Math.min(min, a5.g());
                                    max = Math.max(max, a5.g());
                                    final int n7 = a4;
                                    ++k;
                                    if (b) {
                                        break;
                                    }
                                    n6 = n7;
                                    continue Label_0453_Outer;
                                }
                                final int n7 = n6;
                                continue;
                            }
                        }
                    }
                    ++j;
                    if (b) {
                        break;
                    }
                }
                return b(cr2);
            }
            final cr cr2 = cr;
            final g3 g5 = g4;
            final Q q3 = q2;
            Q a2 = q;
            continue;
        }
    }
    
    private static aS a(final int[] array, final int n, final int[] array2) {
        if (array.length == 0) {
            throw fD.a();
        }
        final int n2 = 1 << n + 1;
        final int a = a(array, array2, n2);
        a(array, n2);
        final aS a2 = cD.a(array, String.valueOf(n));
        a2.b(a);
        a2.a(Integer.valueOf(array2.length));
        return a2;
    }
    
    private static cr a(final Q q, final Q q2) {
        if (q != null || q2 != null) {
            final hU b = b(q, q2);
            if (b != null) {
                return new cr(b, g3.a(a(q), a(q2)));
            }
        }
        return null;
    }
    
    private static g3 a(final Q q) {
        final boolean b = fG.b;
        if (q != null) {
            final int[] c = q.c();
            if (c != null) {
                final int a = a(c);
                final int length = c.length;
                int i = 0;
                int n = 0;
                while (i < length) {
                    final int n2 = c[i];
                    n += a - n2;
                    if (n2 > 0 && !b) {
                        break;
                    }
                    ++i;
                    if (b) {
                        break;
                    }
                }
                final N[] a2 = q.a();
                int n3 = 0;
                while (n > 0 && a2[n3] == null) {
                    --n;
                    ++n3;
                    if (b) {
                        break;
                    }
                }
                final int n4 = -1 + c.length;
                int n5 = 0;
                int j = n4;
                while (j >= 0) {
                    n5 += a - c[j];
                    if (c[j] > 0 && !b) {
                        break;
                    }
                    --j;
                    if (b) {
                        break;
                    }
                }
                int n6 = -1 + a2.length;
                while (n5 > 0 && a2[n6] == null) {
                    --n5;
                    --n6;
                    if (b) {
                        break;
                    }
                }
                return q.b().a(n, n5, q.a());
            }
        }
        return null;
    }
    
    private static void a(final cr cr, final bQ[][] array) {
        final int[] a = array[0][1].a();
        final int n = cr.a() * cr.f() - c(cr.d());
        if (a.length == 0) {
            if (n < 1 || n > 928) {
                throw fv.a();
            }
            array[0][1].a(n);
            if (!fG.b) {
                return;
            }
        }
        if (a[0] != n) {
            array[0][1].a(n);
        }
    }
    
    private static void a(final int[] array, final int n) {
        if (array.length < 4) {
            throw fD.a();
        }
        final int n2 = array[0];
        if (n2 > array.length) {
            throw fD.a();
        }
        if (n2 == 0) {
            if (n < array.length) {
                array[0] = array.length - n;
                if (!fG.b) {
                    return;
                }
            }
            throw fD.a();
        }
    }
    
    private static boolean a(final int n, final int n2, final int n3) {
        return n2 - 2 <= n && n <= n3 + 2;
    }
    
    private static boolean a(final cr cr, final int n) {
        return n >= 0 && n <= 1 + cr.a();
    }
    
    private static int[] a(int n) {
        final boolean b = fG.b;
        final int[] array = new int[8];
        int n2 = 0;
        int n3 = -1 + array.length;
        do {
            if ((n & 0x1) != n2) {
                n2 = (n & 0x1);
                if (--n3 < 0 && !b) {
                    break;
                }
            }
            ++array[n3];
            n >>= 1;
        } while (!b);
        return array;
    }
    
    private static int[] a(final L l, final int n, final int n2, final boolean b, final int n3, final int n4) {
        final boolean b2 = fG.b;
        final int[] array = new int[8];
        int n5;
        if (b) {
            n5 = 1;
        }
        else {
            n5 = -1;
        }
        boolean b3 = b;
        int n6 = 0;
        int n7 = n3;
        while (((b && n7 < n2) || (!b && n7 >= n)) && n6 < array.length) {
            if (l.a(n7, n4) == b3) {
                ++array[n6];
                n7 += n5;
                if (!b2) {
                    continue;
                }
            }
            ++n6;
            b3 = !b3;
            if (b2) {
                break;
            }
        }
        final int n8 = n6;
        final int n9 = n7;
        if (n8 == array.length || (((b && n9 == n2) || (!b && n9 == n)) && n8 == -1 + array.length)) {
            return array;
        }
        return null;
    }
    
    private static bQ[][] a(final cr cr) {
        final boolean b = fG.b;
        final bQ[][] array = (bQ[][])Array.newInstance(bQ.class, cr.f(), 2 + cr.a());
        int i = 0;
        while (i < array.length) {
            int j = 0;
            while (j < array[i].length) {
                array[i][j] = new bQ();
                ++j;
                if (b) {
                    break;
                }
            }
            ++i;
            if (b) {
                break;
            }
        }
        final P[] k = cr.i();
        final int length = k.length;
        int l = 0;
        int n = 0;
        while (l < length) {
            final P p = k[l];
            if (p != null) {
                final N[] a = p.a();
                final int length2 = a.length;
                int n2 = 0;
                while (n2 < length2) {
                    final N n3 = a[n2];
                    if (n3 != null) {
                        final int h = n3.h();
                        if (h >= 0) {
                            if (h >= array.length) {
                                throw fD.a();
                            }
                            array[h][n].a(n3.c());
                        }
                    }
                    ++n2;
                    if (b) {
                        break;
                    }
                }
            }
            ++n;
            final int n4 = l + 1;
            if (b) {
                break;
            }
            l = n4;
        }
        return array;
    }
    
    private static int b(final int n) {
        return b(a(n));
    }
    
    private static int b(final L l, final int n, final int n2, boolean b, final int n3, final int n4) {
        final boolean b2 = fG.b;
        int n5;
        if (b) {
            n5 = -1;
        }
        else {
            n5 = 1;
        }
        int i = 0;
        int n6 = n5;
        int n7 = n3;
    Label_0077:
        while (i < 2) {
            while (((b && n7 >= n) || (!b && n7 < n2)) && b == l.a(n7, n4)) {
                if (Math.abs(n3 - n7) > 2) {
                    n7 = n3;
                    break Label_0077;
                }
                n7 += n6;
                if (b2) {
                    break;
                }
            }
            final int n8 = -n6;
            boolean b3;
            if (!b) {
                b3 = true;
            }
            else {
                b3 = false;
            }
            ++i;
            if (b2) {
                break;
            }
            b = b3;
            n6 = n8;
        }
        return n7;
    }
    
    private static int b(final int[] array) {
        return (9 + (array[0] - array[2] + array[4] - array[6])) % 9;
    }
    
    private static aS b(final cr cr) {
        int i = 0;
        final boolean b = fG.b;
        final bQ[][] a = a(cr);
        a(cr, a);
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final int[] array = new int[cr.f() * cr.a()];
        final ArrayList<int[]> list2 = new ArrayList<int[]>();
        final ArrayList<Integer> list3 = new ArrayList<Integer>();
        int j = 0;
        while (j < cr.f()) {
            int k = 0;
            while (k < cr.a()) {
                final int[] a2 = a[j][k + 1].a();
                final int n = k + j * cr.a();
                Label_0172: {
                    if (a2.length == 0) {
                        list.add(n);
                        if (!b) {
                            break Label_0172;
                        }
                    }
                    if (a2.length == 1) {
                        array[n] = a2[0];
                        if (!b) {
                            break Label_0172;
                        }
                    }
                    list3.add(n);
                    list2.add(a2);
                }
                ++k;
                if (b) {
                    break;
                }
            }
            ++j;
            if (b) {
                break;
            }
        }
        final int[][] array2 = new int[list2.size()][];
        while (i < array2.length) {
            array2[i] = list2.get(i);
            ++i;
            if (b) {
                break;
            }
        }
        return a(cr.d(), array, ex.a(list), ex.a(list3), array2);
    }
    
    private static hU b(final Q q, final Q q2) {
        if (q != null) {
            final hU b = q.b();
            if (b != null) {
                if (q2 != null) {
                    final hU b2 = q2.b();
                    if (b2 != null) {
                        if (b.a() == b2.a() || b.c() == b2.c() || b.d() == b2.d()) {
                            return b;
                        }
                        return null;
                    }
                }
                return b;
            }
        }
        if (q2 != null) {
            return q2.b();
        }
        return null;
    }
    
    private static int c(final int n) {
        return 2 << n;
    }
}
