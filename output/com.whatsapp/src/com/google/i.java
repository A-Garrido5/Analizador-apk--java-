// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class i
{
    public static boolean e;
    private static final int[] h;
    private int a;
    private final L b;
    private int c;
    private int d;
    private int f;
    private boolean g;
    
    static {
        h = new int[] { 3808, 476, 2107, 1799 };
    }
    
    public i(final L b) {
        this.b = b;
    }
    
    private static float a(final cs cs, final cs cs2) {
        return gf.a(cs.a(), cs.b(), cs2.a(), cs2.b());
    }
    
    private static float a(final gZ gz, final gZ gz2) {
        return gf.a(gz.a(), gz.c(), gz2.a(), gz2.c());
    }
    
    private int a() {
        if (this.g) {
            return 11 + 4 * this.c;
        }
        if (this.c <= 4) {
            return 15 + 4 * this.c;
        }
        return 15 + (4 * this.c + 2 * (1 + (-4 + this.c) / 8));
    }
    
    private static int a(long n, final boolean b) {
        final boolean e = i.e;
        int n2 = 0;
        int n3 = 0;
        Label_0026: {
            if (b) {
                n2 = 7;
                n3 = 2;
                if (!e) {
                    break Label_0026;
                }
            }
            n2 = 10;
            n3 = 4;
        }
        final int n4 = n2 - n3;
        final int[] array = new int[n2];
        int i = n2 - 1;
        while (i >= 0) {
            array[i] = (0xF & (int)n);
            n >>= 4;
            --i;
            if (e) {
                break;
            }
        }
        try {
            new cO(gN.h).a(array, n4);
            int j = 0;
            int n5 = 0;
            while (j < n3) {
                n5 = (n5 << 4) + array[j];
                ++j;
                if (e) {
                    break;
                }
            }
            return n5;
        }
        catch (dA da) {
            throw fv.a();
        }
    }
    
    private int a(final cs cs, final cs cs2, final int n) {
        int n2 = 0;
        final boolean e = i.e;
        final float a = a(cs, cs2);
        final float n3 = a / n;
        final float a2 = cs.a();
        final float b = cs.b();
        final float n4 = n3 * (cs2.a() - cs.a()) / a;
        final float n5 = n3 * (cs2.b() - cs.b()) / a;
        int i = 0;
        while (i < n) {
            if (this.b.a(gf.a(a2 + n4 * i), gf.a(b + n5 * i))) {
                n2 |= 1 << -1 + (n - i);
            }
            ++i;
            if (e) {
                break;
            }
        }
        return n2;
    }
    
    private static int a(final int[] array, final int n) {
        final boolean e = i.e;
        final int length = array.length;
        int i = 0;
        int n2 = 0;
        while (i < length) {
            final int n3 = array[i];
            n2 = (n3 >> n - 2 << 1) + (n3 & 0x1) + (n2 << 3);
            ++i;
            if (e) {
                break;
            }
        }
        final int n4 = ((n2 & 0x1) << 11) + (n2 >> 1);
        int j = 0;
        while (j < 4) {
            if (Integer.bitCount(n4 ^ com.google.i.h[j]) <= 2) {
                return j;
            }
            ++j;
            if (e) {
                break;
            }
        }
        throw fv.a();
    }
    
    private L a(final L l, final cs cs, final cs cs2, final cs cs3, final cs cs4) {
        final W a = W.a();
        final int a2 = this.a();
        final float n = a2 / 2.0f - this.f;
        final float n2 = a2 / 2.0f + this.f;
        return a.a(l, a2, a2, n, n, n2, n, n2, n2, n, n2, cs.a(), cs.b(), cs2.a(), cs2.b(), cs3.a(), cs3.b(), cs4.a(), cs4.b());
    }
    
    private gZ a(final gZ gz, final boolean b, final int n, final int n2) {
        final boolean e = i.e;
        int n3 = n + gz.a();
        int n4 = n2 + gz.c();
        while (this.a(n3, n4) && this.b.a(n3, n4) == b) {
            n3 += n;
            n4 += n2;
            if (e) {
                break;
            }
        }
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        int n7 = n5;
        while (this.a(n7, n6) && this.b.a(n7, n6) == b) {
            n7 += n;
            if (e) {
                break;
            }
        }
        final int n8 = n7 - n;
        int n9 = n6;
        while (this.a(n8, n9) && this.b.a(n8, n9) == b) {
            n9 += n2;
            if (e) {
                break;
            }
        }
        return new gZ(n8, n9 - n2);
    }
    
    private void a(final cs[] array) {
        final boolean e = i.e;
        if (!this.a(array[0]) || !this.a(array[1]) || !this.a(array[2]) || !this.a(array[3])) {
            throw fv.a();
        }
        final int n = 2 * this.f;
        final int[] array2 = { this.a(array[0], array[1], n), this.a(array[1], array[2], n), this.a(array[2], array[3], n), this.a(array[3], array[0], n) };
        this.a = a(array2, n);
        long n2 = 0L;
        int i = 0;
        while (i < 4) {
            final int n3 = array2[(i + this.a) % 4];
            Label_0208: {
                if (this.g) {
                    n2 = (n2 << 7) + (0x7F & n3 >> 1);
                    if (!e) {
                        break Label_0208;
                    }
                }
                n2 = (n2 << 10) + ((0x3E0 & n3 >> 2) + (0x1F & n3 >> 1));
            }
            ++i;
            if (e) {
                break;
            }
        }
        final int a = a(n2, this.g);
        if (this.g) {
            this.c = 1 + (a >> 6);
            this.d = 1 + (a & 0x3F);
            if (!e) {
                return;
            }
        }
        this.c = 1 + (a >> 11);
        this.d = 1 + (a & 0x7FF);
    }
    
    private boolean a(final int n, final int n2) {
        return n >= 0 && n < this.b.g() && n2 > 0 && n2 < this.b.a();
    }
    
    private boolean a(final cs cs) {
        return this.a(gf.a(cs.a()), gf.a(cs.b()));
    }
    
    private boolean a(final gZ gz, final gZ gz2, final gZ gz3, final gZ gz4) {
        final gZ gz5 = new gZ(gz.a() - 3, 3 + gz.c());
        final gZ gz6 = new gZ(gz2.a() - 3, gz2.c() - 3);
        final gZ gz7 = new gZ(3 + gz3.a(), gz3.c() - 3);
        final gZ gz8 = new gZ(3 + gz4.a(), 3 + gz4.c());
        final int b = this.b(gz8, gz5);
        return b != 0 && this.b(gz5, gz6) == b && this.b(gz6, gz7) == b && this.b(gz7, gz8) == b;
    }
    
    private cs[] a(gZ gz) {
        final boolean e = i.e;
        boolean b = true;
        this.f = 1;
        gZ gz2 = gz;
        gZ gz3 = gz;
        gZ gz4 = gz;
        while (this.f < 9) {
            final gZ a = this.a(gz4, b, 1, -1);
            final gZ a2 = this.a(gz3, b, 1, 1);
            final gZ a3 = this.a(gz2, b, -1, 1);
            final gZ a4 = this.a(gz, b, -1, -1);
            if (this.f > 2) {
                final float n = a(a4, a) * this.f / (a(gz, gz4) * (2 + this.f));
                if (n < 0.75 || n > 1.25 || (!this.a(a, a2, a3, a4) && !e)) {
                    break;
                }
            }
            b = !b;
            ++this.f;
            if (e) {
                gz = a4;
                gz2 = a3;
                gz3 = a2;
                gz4 = a;
                break;
            }
            gz = a4;
            gz2 = a3;
            gz3 = a2;
            gz4 = a;
        }
        if (this.f != 5 && this.f != 7) {
            throw fv.a();
        }
        this.g = (this.f == 5);
        return a(new cs[] { new cs(0.5f + gz4.a(), gz4.c() - 0.5f), new cs(0.5f + gz3.a(), 0.5f + gz3.c()), new cs(gz2.a() - 0.5f, 0.5f + gz2.c()), new cs(gz.a() - 0.5f, gz.c() - 0.5f) }, -3 + 2 * this.f, 2 * this.f);
    }
    
    private static cs[] a(final cs[] array, final float n, final float n2) {
        final float n3 = n2 / (2.0f * n);
        final float n4 = array[0].a() - array[2].a();
        final float n5 = array[0].b() - array[2].b();
        final float n6 = (array[0].a() + array[2].a()) / 2.0f;
        final float n7 = (array[0].b() + array[2].b()) / 2.0f;
        final cs cs = new cs(n6 + n3 * n4, n7 + n3 * n5);
        final cs cs2 = new cs(n6 - n4 * n3, n7 - n5 * n3);
        final float n8 = array[1].a() - array[3].a();
        final float n9 = array[1].b() - array[3].b();
        final float n10 = (array[1].a() + array[3].a()) / 2.0f;
        final float n11 = (array[1].b() + array[3].b()) / 2.0f;
        return new cs[] { cs, new cs(n10 + n3 * n8, n11 + n3 * n9), cs2, new cs(n10 - n8 * n3, n11 - n3 * n9) };
    }
    
    private int b(final gZ gz, final gZ gz2) {
        final boolean e = i.e;
        final float a = a(gz, gz2);
        final float n = (gz2.a() - gz.a()) / a;
        final float n2 = (gz2.c() - gz.c()) / a;
        final float n3 = gz.a();
        final float n4 = gz.c();
        final boolean a2 = this.b.a(gz.a(), gz.c());
        int n5 = 0;
        float n6 = n3;
        float n7 = n4;
        int n8 = 0;
        while (n8 < a) {
            n6 += n;
            n7 += n2;
            if (this.b.a(gf.a(n6), gf.a(n7)) != a2) {
                ++n5;
            }
            ++n8;
            if (e) {
                break;
            }
        }
        final float n9 = n5 / a;
        if (n9 > 0.1f && n9 < 0.9f) {
            return 0;
        }
        if (n9 <= 0.1f == a2) {
            return 1;
        }
        return -1;
    }
    
    private gZ b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/google/et;
        //     3: dup            
        //     4: aload_0        
        //     5: getfield        com/google/i.b:Lcom/google/L;
        //     8: invokespecial   com/google/et.<init>:(Lcom/google/L;)V
        //    11: invokevirtual   com/google/et.a:()[Lcom/google/cs;
        //    14: astore          16
        //    16: aload           16
        //    18: iconst_0       
        //    19: aaload         
        //    20: astore          4
        //    22: aload           16
        //    24: iconst_1       
        //    25: aaload         
        //    26: astore          5
        //    28: aload           16
        //    30: iconst_2       
        //    31: aaload         
        //    32: astore          6
        //    34: aload           16
        //    36: iconst_3       
        //    37: aaload         
        //    38: astore          7
        //    40: aload           4
        //    42: invokevirtual   com/google/cs.a:()F
        //    45: aload           7
        //    47: invokevirtual   com/google/cs.a:()F
        //    50: fadd           
        //    51: aload           5
        //    53: invokevirtual   com/google/cs.a:()F
        //    56: fadd           
        //    57: aload           6
        //    59: invokevirtual   com/google/cs.a:()F
        //    62: fadd           
        //    63: ldc             4.0
        //    65: fdiv           
        //    66: invokestatic    com/google/gf.a:(F)I
        //    69: istore          8
        //    71: aload           4
        //    73: invokevirtual   com/google/cs.b:()F
        //    76: aload           7
        //    78: invokevirtual   com/google/cs.b:()F
        //    81: fadd           
        //    82: aload           5
        //    84: invokevirtual   com/google/cs.b:()F
        //    87: fadd           
        //    88: aload           6
        //    90: invokevirtual   com/google/cs.b:()F
        //    93: fadd           
        //    94: ldc             4.0
        //    96: fdiv           
        //    97: invokestatic    com/google/gf.a:(F)I
        //   100: istore          9
        //   102: new             Lcom/google/et;
        //   105: dup            
        //   106: aload_0        
        //   107: getfield        com/google/i.b:Lcom/google/L;
        //   110: bipush          15
        //   112: iload           8
        //   114: iload           9
        //   116: invokespecial   com/google/et.<init>:(Lcom/google/L;III)V
        //   119: invokevirtual   com/google/et.a:()[Lcom/google/cs;
        //   122: astore          15
        //   124: aload           15
        //   126: iconst_0       
        //   127: aaload         
        //   128: astore          11
        //   130: aload           15
        //   132: iconst_1       
        //   133: aaload         
        //   134: astore          12
        //   136: aload           15
        //   138: iconst_2       
        //   139: aaload         
        //   140: astore          13
        //   142: aload           15
        //   144: iconst_3       
        //   145: aaload         
        //   146: astore          14
        //   148: new             Lcom/google/gZ;
        //   151: dup            
        //   152: aload           11
        //   154: invokevirtual   com/google/cs.a:()F
        //   157: aload           14
        //   159: invokevirtual   com/google/cs.a:()F
        //   162: fadd           
        //   163: aload           12
        //   165: invokevirtual   com/google/cs.a:()F
        //   168: fadd           
        //   169: aload           13
        //   171: invokevirtual   com/google/cs.a:()F
        //   174: fadd           
        //   175: ldc             4.0
        //   177: fdiv           
        //   178: invokestatic    com/google/gf.a:(F)I
        //   181: aload           11
        //   183: invokevirtual   com/google/cs.b:()F
        //   186: aload           14
        //   188: invokevirtual   com/google/cs.b:()F
        //   191: fadd           
        //   192: aload           12
        //   194: invokevirtual   com/google/cs.b:()F
        //   197: fadd           
        //   198: aload           13
        //   200: invokevirtual   com/google/cs.b:()F
        //   203: fadd           
        //   204: ldc             4.0
        //   206: fdiv           
        //   207: invokestatic    com/google/gf.a:(F)I
        //   210: invokespecial   com/google/gZ.<init>:(II)V
        //   213: areturn        
        //   214: astore_1       
        //   215: aload_0        
        //   216: getfield        com/google/i.b:Lcom/google/L;
        //   219: invokevirtual   com/google/L.g:()I
        //   222: iconst_2       
        //   223: idiv           
        //   224: istore_2       
        //   225: aload_0        
        //   226: getfield        com/google/i.b:Lcom/google/L;
        //   229: invokevirtual   com/google/L.a:()I
        //   232: iconst_2       
        //   233: idiv           
        //   234: istore_3       
        //   235: aload_0        
        //   236: new             Lcom/google/gZ;
        //   239: dup            
        //   240: iload_2        
        //   241: bipush          7
        //   243: iadd           
        //   244: iload_3        
        //   245: bipush          7
        //   247: isub           
        //   248: invokespecial   com/google/gZ.<init>:(II)V
        //   251: iconst_0       
        //   252: iconst_1       
        //   253: iconst_m1      
        //   254: invokespecial   com/google/i.a:(Lcom/google/gZ;ZII)Lcom/google/gZ;
        //   257: invokevirtual   com/google/gZ.b:()Lcom/google/cs;
        //   260: astore          4
        //   262: aload_0        
        //   263: new             Lcom/google/gZ;
        //   266: dup            
        //   267: iload_2        
        //   268: bipush          7
        //   270: iadd           
        //   271: iload_3        
        //   272: bipush          7
        //   274: iadd           
        //   275: invokespecial   com/google/gZ.<init>:(II)V
        //   278: iconst_0       
        //   279: iconst_1       
        //   280: iconst_1       
        //   281: invokespecial   com/google/i.a:(Lcom/google/gZ;ZII)Lcom/google/gZ;
        //   284: invokevirtual   com/google/gZ.b:()Lcom/google/cs;
        //   287: astore          5
        //   289: aload_0        
        //   290: new             Lcom/google/gZ;
        //   293: dup            
        //   294: iload_2        
        //   295: bipush          7
        //   297: isub           
        //   298: iload_3        
        //   299: bipush          7
        //   301: iadd           
        //   302: invokespecial   com/google/gZ.<init>:(II)V
        //   305: iconst_0       
        //   306: iconst_m1      
        //   307: iconst_1       
        //   308: invokespecial   com/google/i.a:(Lcom/google/gZ;ZII)Lcom/google/gZ;
        //   311: invokevirtual   com/google/gZ.b:()Lcom/google/cs;
        //   314: astore          6
        //   316: aload_0        
        //   317: new             Lcom/google/gZ;
        //   320: dup            
        //   321: iload_2        
        //   322: bipush          7
        //   324: isub           
        //   325: iload_3        
        //   326: bipush          7
        //   328: isub           
        //   329: invokespecial   com/google/gZ.<init>:(II)V
        //   332: iconst_0       
        //   333: iconst_m1      
        //   334: iconst_m1      
        //   335: invokespecial   com/google/i.a:(Lcom/google/gZ;ZII)Lcom/google/gZ;
        //   338: invokevirtual   com/google/gZ.b:()Lcom/google/cs;
        //   341: astore          7
        //   343: goto            40
        //   346: astore          10
        //   348: aload_0        
        //   349: new             Lcom/google/gZ;
        //   352: dup            
        //   353: iload           8
        //   355: bipush          7
        //   357: iadd           
        //   358: iload           9
        //   360: bipush          7
        //   362: isub           
        //   363: invokespecial   com/google/gZ.<init>:(II)V
        //   366: iconst_0       
        //   367: iconst_1       
        //   368: iconst_m1      
        //   369: invokespecial   com/google/i.a:(Lcom/google/gZ;ZII)Lcom/google/gZ;
        //   372: invokevirtual   com/google/gZ.b:()Lcom/google/cs;
        //   375: astore          11
        //   377: aload_0        
        //   378: new             Lcom/google/gZ;
        //   381: dup            
        //   382: iload           8
        //   384: bipush          7
        //   386: iadd           
        //   387: iload           9
        //   389: bipush          7
        //   391: iadd           
        //   392: invokespecial   com/google/gZ.<init>:(II)V
        //   395: iconst_0       
        //   396: iconst_1       
        //   397: iconst_1       
        //   398: invokespecial   com/google/i.a:(Lcom/google/gZ;ZII)Lcom/google/gZ;
        //   401: invokevirtual   com/google/gZ.b:()Lcom/google/cs;
        //   404: astore          12
        //   406: aload_0        
        //   407: new             Lcom/google/gZ;
        //   410: dup            
        //   411: iload           8
        //   413: bipush          7
        //   415: isub           
        //   416: iload           9
        //   418: bipush          7
        //   420: iadd           
        //   421: invokespecial   com/google/gZ.<init>:(II)V
        //   424: iconst_0       
        //   425: iconst_m1      
        //   426: iconst_1       
        //   427: invokespecial   com/google/i.a:(Lcom/google/gZ;ZII)Lcom/google/gZ;
        //   430: invokevirtual   com/google/gZ.b:()Lcom/google/cs;
        //   433: astore          13
        //   435: aload_0        
        //   436: new             Lcom/google/gZ;
        //   439: dup            
        //   440: iload           8
        //   442: bipush          7
        //   444: isub           
        //   445: iload           9
        //   447: bipush          7
        //   449: isub           
        //   450: invokespecial   com/google/gZ.<init>:(II)V
        //   453: iconst_0       
        //   454: iconst_m1      
        //   455: iconst_m1      
        //   456: invokespecial   com/google/i.a:(Lcom/google/gZ;ZII)Lcom/google/gZ;
        //   459: invokevirtual   com/google/gZ.b:()Lcom/google/cs;
        //   462: astore          14
        //   464: goto            148
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  0      40     214    346    Lcom/google/fv;
        //  102    148    346    467    Lcom/google/fv;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
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
    
    private cs[] b(final cs[] array) {
        return a(array, 2 * this.f, this.a());
    }
    
    public fi a(final boolean b) {
        final boolean e = i.e;
        final cs[] a = this.a(this.b());
        if (b) {
            final cs cs = a[0];
            a[0] = a[2];
            a[2] = cs;
        }
        this.a(a);
        final fi fi = new fi(this.a(this.b, a[this.a % 4], a[(1 + this.a) % 4], a[(2 + this.a) % 4], a[(3 + this.a) % 4]), this.b(a), this.g, this.d, this.c);
        if (e) {
            ++fN.a;
        }
        return fi;
    }
}
