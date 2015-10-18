// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.hv;

public class W implements ai
{
    private static final String[] z;
    private final int a;
    private final o b;
    private final R c;
    private final aH d;
    private final int e;
    private final ak f;
    private final byte[] g;
    private final int h;
    
    static {
        final String[] z2 = new String[2];
        String s = "V.\u000b/do,\r4l?-\r3z~'\rn";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\t';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = '@';
                        break;
                    }
                    case 2: {
                        c2 = 'h';
                        break;
                    }
                    case 3: {
                        c2 = '@';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "J.\u0003.fh.H6lm3\u0001/g%`";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public W(final int h, final int a, final R c, final int e, final ak f, final o b, final aH d) {
        this.h = h;
        this.a = a;
        this.c = c;
        this.e = e;
        this.f = f;
        this.b = b;
        this.d = d;
        final aJ a2 = aO.k().c(e).c(hv.a(f.a())).b(hv.a(b.b())).a(hv.a(d.a())).a(a);
        if (c.c()) {
            a2.b((int)c.d());
        }
        this.g = m.a(new byte[][] { { m.a(this.h, 3) }, a2.b().a() });
    }
    
    public W(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/bR.h:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: iconst_0       
        //    11: baload         
        //    12: invokestatic    org/whispersystems/m.a:(B)I
        //    15: putfield        org/whispersystems/W.h:I
        //    18: aload_0        
        //    19: getfield        org/whispersystems/W.h:I
        //    22: iconst_3       
        //    23: if_icmple       69
        //    26: new             Lorg/whispersystems/b9;
        //    29: dup            
        //    30: new             Ljava/lang/StringBuilder;
        //    33: dup            
        //    34: invokespecial   java/lang/StringBuilder.<init>:()V
        //    37: getstatic       org/whispersystems/W.z:[Ljava/lang/String;
        //    40: iconst_1       
        //    41: aaload         
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: aload_0        
        //    46: getfield        org/whispersystems/W.h:I
        //    49: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    52: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    55: invokespecial   org/whispersystems/b9.<init>:(Ljava/lang/String;)V
        //    58: athrow         
        //    59: astore_3       
        //    60: new             Lorg/whispersystems/I;
        //    63: dup            
        //    64: aload_3        
        //    65: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/Throwable;)V
        //    68: athrow         
        //    69: aload_1        
        //    70: iconst_1       
        //    71: iconst_m1      
        //    72: aload_1        
        //    73: arraylength    
        //    74: iadd           
        //    75: invokestatic    com/google/hv.a:([BII)Lcom/google/hv;
        //    78: invokestatic    org/whispersystems/aO.a:(Lcom/google/hv;)Lorg/whispersystems/aO;
        //    81: astore          4
        //    83: aload_0        
        //    84: getfield        org/whispersystems/W.h:I
        //    87: iconst_2       
        //    88: if_icmpne       103
        //    91: aload           4
        //    93: invokevirtual   org/whispersystems/aO.d:()Z
        //    96: istore          24
        //    98: iload           24
        //   100: ifeq            163
        //   103: aload_0        
        //   104: getfield        org/whispersystems/W.h:I
        //   107: istore          12
        //   109: iload           12
        //   111: iconst_3       
        //   112: if_icmpne       127
        //   115: aload           4
        //   117: invokevirtual   org/whispersystems/aO.q:()Z
        //   120: istore          23
        //   122: iload           23
        //   124: ifeq            163
        //   127: aload           4
        //   129: invokevirtual   org/whispersystems/aO.t:()Z
        //   132: istore          13
        //   134: iload           13
        //   136: ifeq            163
        //   139: aload           4
        //   141: invokevirtual   org/whispersystems/aO.i:()Z
        //   144: istore          14
        //   146: iload           14
        //   148: ifeq            163
        //   151: aload           4
        //   153: invokevirtual   org/whispersystems/aO.j:()Z
        //   156: istore          15
        //   158: iload           15
        //   160: ifne            219
        //   163: new             Lorg/whispersystems/I;
        //   166: dup            
        //   167: getstatic       org/whispersystems/W.z:[Ljava/lang/String;
        //   170: iconst_0       
        //   171: aaload         
        //   172: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/String;)V
        //   175: athrow         
        //   176: astore          11
        //   178: aload           11
        //   180: athrow         
        //   181: astore_3       
        //   182: goto            60
        //   185: astore          5
        //   187: aload           5
        //   189: athrow         
        //   190: astore          6
        //   192: aload           6
        //   194: athrow         
        //   195: astore          7
        //   197: aload           7
        //   199: athrow         
        //   200: astore          8
        //   202: aload           8
        //   204: athrow         
        //   205: astore          9
        //   207: aload           9
        //   209: athrow         
        //   210: astore          10
        //   212: aload           10
        //   214: athrow         
        //   215: astore_3       
        //   216: goto            60
        //   219: aload_0        
        //   220: aload_1        
        //   221: putfield        org/whispersystems/W.g:[B
        //   224: aload_0        
        //   225: aload           4
        //   227: invokevirtual   org/whispersystems/aO.m:()I
        //   230: putfield        org/whispersystems/W.a:I
        //   233: aload           4
        //   235: invokevirtual   org/whispersystems/aO.d:()Z
        //   238: ifeq            365
        //   241: aload           4
        //   243: invokevirtual   org/whispersystems/aO.h:()I
        //   246: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   249: invokestatic    org/whispersystems/R.a:(Ljava/lang/Object;)Lorg/whispersystems/R;
        //   252: astore          22
        //   254: aload           22
        //   256: astore          17
        //   258: aload_0        
        //   259: aload           17
        //   261: putfield        org/whispersystems/W.c:Lorg/whispersystems/R;
        //   264: aload           4
        //   266: invokevirtual   org/whispersystems/aO.q:()Z
        //   269: ifeq            378
        //   272: aload           4
        //   274: invokevirtual   org/whispersystems/aO.b:()I
        //   277: istore          21
        //   279: iload           21
        //   281: istore          19
        //   283: aload_0        
        //   284: iload           19
        //   286: putfield        org/whispersystems/W.e:I
        //   289: aload_0        
        //   290: aload           4
        //   292: invokevirtual   org/whispersystems/aO.f:()Lcom/google/hv;
        //   295: invokevirtual   com/google/hv.a:()[B
        //   298: iconst_0       
        //   299: invokestatic    org/whispersystems/s.a:([BI)Lorg/whispersystems/ak;
        //   302: putfield        org/whispersystems/W.f:Lorg/whispersystems/ak;
        //   305: aload_0        
        //   306: new             Lorg/whispersystems/o;
        //   309: dup            
        //   310: aload           4
        //   312: invokevirtual   org/whispersystems/aO.s:()Lcom/google/hv;
        //   315: invokevirtual   com/google/hv.a:()[B
        //   318: iconst_0       
        //   319: invokestatic    org/whispersystems/s.a:([BI)Lorg/whispersystems/ak;
        //   322: invokespecial   org/whispersystems/o.<init>:(Lorg/whispersystems/ak;)V
        //   325: putfield        org/whispersystems/W.b:Lorg/whispersystems/o;
        //   328: aload_0        
        //   329: new             Lorg/whispersystems/aH;
        //   332: dup            
        //   333: aload           4
        //   335: invokevirtual   org/whispersystems/aO.g:()Lcom/google/hv;
        //   338: invokevirtual   com/google/hv.a:()[B
        //   341: invokespecial   org/whispersystems/aH.<init>:([B)V
        //   344: putfield        org/whispersystems/W.d:Lorg/whispersystems/aH;
        //   347: getstatic       org/whispersystems/bO.s:I
        //   350: ifeq            359
        //   353: iload_2        
        //   354: iconst_1       
        //   355: iadd           
        //   356: putstatic       org/whispersystems/bR.h:I
        //   359: return         
        //   360: astore          16
        //   362: aload           16
        //   364: athrow         
        //   365: invokestatic    org/whispersystems/R.a:()Lorg/whispersystems/R;
        //   368: astore          17
        //   370: goto            258
        //   373: astore          18
        //   375: aload           18
        //   377: athrow         
        //   378: iconst_m1      
        //   379: istore          19
        //   381: goto            283
        //   384: astore          20
        //   386: aload           20
        //   388: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  8      59     59     60     Lcom/google/bg;
        //  8      59     181    185    Lorg/whispersystems/aA;
        //  8      59     215    219    Lorg/whispersystems/bW;
        //  69     83     59     60     Lcom/google/bg;
        //  69     83     181    185    Lorg/whispersystems/aA;
        //  69     83     215    219    Lorg/whispersystems/bW;
        //  83     98     185    190    Lcom/google/bg;
        //  83     98     181    185    Lorg/whispersystems/aA;
        //  83     98     215    219    Lorg/whispersystems/bW;
        //  103    109    190    195    Lcom/google/bg;
        //  103    109    181    185    Lorg/whispersystems/aA;
        //  103    109    215    219    Lorg/whispersystems/bW;
        //  115    122    195    200    Lcom/google/bg;
        //  115    122    181    185    Lorg/whispersystems/aA;
        //  115    122    215    219    Lorg/whispersystems/bW;
        //  127    134    200    205    Lcom/google/bg;
        //  127    134    181    185    Lorg/whispersystems/aA;
        //  127    134    215    219    Lorg/whispersystems/bW;
        //  139    146    205    210    Lcom/google/bg;
        //  139    146    181    185    Lorg/whispersystems/aA;
        //  139    146    215    219    Lorg/whispersystems/bW;
        //  151    158    210    215    Lcom/google/bg;
        //  151    158    181    185    Lorg/whispersystems/aA;
        //  151    158    215    219    Lorg/whispersystems/bW;
        //  163    176    176    181    Lcom/google/bg;
        //  163    176    181    185    Lorg/whispersystems/aA;
        //  163    176    215    219    Lorg/whispersystems/bW;
        //  178    181    59     60     Lcom/google/bg;
        //  178    181    181    185    Lorg/whispersystems/aA;
        //  178    181    215    219    Lorg/whispersystems/bW;
        //  187    190    190    195    Lcom/google/bg;
        //  187    190    181    185    Lorg/whispersystems/aA;
        //  187    190    215    219    Lorg/whispersystems/bW;
        //  192    195    195    200    Lcom/google/bg;
        //  192    195    181    185    Lorg/whispersystems/aA;
        //  192    195    215    219    Lorg/whispersystems/bW;
        //  197    200    200    205    Lcom/google/bg;
        //  197    200    181    185    Lorg/whispersystems/aA;
        //  197    200    215    219    Lorg/whispersystems/bW;
        //  202    205    205    210    Lcom/google/bg;
        //  202    205    181    185    Lorg/whispersystems/aA;
        //  202    205    215    219    Lorg/whispersystems/bW;
        //  207    210    210    215    Lcom/google/bg;
        //  207    210    181    185    Lorg/whispersystems/aA;
        //  207    210    215    219    Lorg/whispersystems/bW;
        //  212    215    176    181    Lcom/google/bg;
        //  212    215    181    185    Lorg/whispersystems/aA;
        //  212    215    215    219    Lorg/whispersystems/bW;
        //  219    254    360    365    Lcom/google/bg;
        //  219    254    181    185    Lorg/whispersystems/aA;
        //  219    254    215    219    Lorg/whispersystems/bW;
        //  258    279    373    378    Lcom/google/bg;
        //  258    279    181    185    Lorg/whispersystems/aA;
        //  258    279    215    219    Lorg/whispersystems/bW;
        //  283    347    59     60     Lcom/google/bg;
        //  283    347    181    185    Lorg/whispersystems/aA;
        //  283    347    215    219    Lorg/whispersystems/bW;
        //  347    359    384    389    Lcom/google/bg;
        //  362    365    59     60     Lcom/google/bg;
        //  362    365    181    185    Lorg/whispersystems/aA;
        //  362    365    215    219    Lorg/whispersystems/bW;
        //  365    370    59     60     Lcom/google/bg;
        //  365    370    181    185    Lorg/whispersystems/aA;
        //  365    370    215    219    Lorg/whispersystems/bW;
        //  375    378    59     60     Lcom/google/bg;
        //  375    378    181    185    Lorg/whispersystems/aA;
        //  375    378    215    219    Lorg/whispersystems/bW;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 189, Size: 189
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    public int a() {
        return this.e;
    }
    
    @Override
    public byte[] a() {
        return this.g;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    public o b() {
        return this.b;
    }
    
    public aH c() {
        return this.d;
    }
    
    public R d() {
        return this.c;
    }
    
    public int e() {
        return this.h;
    }
    
    public int f() {
        return this.a;
    }
    
    public ak g() {
        return this.f;
    }
}
