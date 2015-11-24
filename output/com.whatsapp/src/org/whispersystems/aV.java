// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.hv;

public class aV implements ai
{
    private static final String[] z;
    private final ak a;
    private final byte[] b;
    private final int c;
    private final int d;
    private final byte[] e;
    
    static {
        final String[] z2 = new String[3];
        String s = "+*(\b6\t*c\u0010<\f7*\t7Dd";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Y';
                        break;
                    }
                    case 0: {
                        c2 = '~';
                        break;
                    }
                    case 1: {
                        c2 = 'D';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "7* \t4\u000e(&\u0012<^)&\u0015*\u001f#&H";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "2!$\u0007:\u0007d.\u0003*\r%$\u0003c^";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public aV(final int c, final int d, final byte[] e, final ak a) {
        final byte[] array = { m.a(3, 3) };
        final byte[] a2 = al.d().a(c).b(d).a(hv.a(e)).b(hv.a(a.a())).c().a();
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = m.a(new byte[][] { array, a2 });
    }
    
    public aV(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_1        
        //     5: iconst_1       
        //     6: iconst_m1      
        //     7: aload_1        
        //     8: arraylength    
        //     9: iadd           
        //    10: invokestatic    org/whispersystems/m.b:([BII)[[B
        //    13: astore_3       
        //    14: aload_3        
        //    15: iconst_0       
        //    16: aaload         
        //    17: iconst_0       
        //    18: baload         
        //    19: istore          4
        //    21: aload_3        
        //    22: iconst_1       
        //    23: aaload         
        //    24: astore          5
        //    26: iload           4
        //    28: invokestatic    org/whispersystems/m.a:(B)I
        //    31: iconst_3       
        //    32: if_icmpge       84
        //    35: new             Lorg/whispersystems/bW;
        //    38: dup            
        //    39: new             Ljava/lang/StringBuilder;
        //    42: dup            
        //    43: invokespecial   java/lang/StringBuilder.<init>:()V
        //    46: getstatic       org/whispersystems/aV.z:[Ljava/lang/String;
        //    49: iconst_2       
        //    50: aaload         
        //    51: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    54: iload           4
        //    56: invokestatic    org/whispersystems/m.a:(B)I
        //    59: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    62: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    65: invokespecial   org/whispersystems/bW.<init>:(Ljava/lang/String;)V
        //    68: athrow         
        //    69: astore          6
        //    71: aload           6
        //    73: athrow         
        //    74: astore_2       
        //    75: new             Lorg/whispersystems/I;
        //    78: dup            
        //    79: aload_2        
        //    80: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/Throwable;)V
        //    83: athrow         
        //    84: iload           4
        //    86: invokestatic    org/whispersystems/m.a:(B)I
        //    89: iconst_3       
        //    90: if_icmple       132
        //    93: new             Lorg/whispersystems/I;
        //    96: dup            
        //    97: new             Ljava/lang/StringBuilder;
        //   100: dup            
        //   101: invokespecial   java/lang/StringBuilder.<init>:()V
        //   104: getstatic       org/whispersystems/aV.z:[Ljava/lang/String;
        //   107: iconst_0       
        //   108: aaload         
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: iload           4
        //   114: invokestatic    org/whispersystems/m.a:(B)I
        //   117: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   120: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   123: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/String;)V
        //   126: athrow         
        //   127: astore          7
        //   129: aload           7
        //   131: athrow         
        //   132: aload           5
        //   134: invokestatic    org/whispersystems/al.a:([B)Lorg/whispersystems/al;
        //   137: astore          8
        //   139: aload           8
        //   141: invokevirtual   org/whispersystems/al.a:()Z
        //   144: ifeq            183
        //   147: aload           8
        //   149: invokevirtual   org/whispersystems/al.o:()Z
        //   152: istore          13
        //   154: iload           13
        //   156: ifeq            183
        //   159: aload           8
        //   161: invokevirtual   org/whispersystems/al.f:()Z
        //   164: istore          14
        //   166: iload           14
        //   168: ifeq            183
        //   171: aload           8
        //   173: invokevirtual   org/whispersystems/al.p:()Z
        //   176: istore          15
        //   178: iload           15
        //   180: ifne            216
        //   183: new             Lorg/whispersystems/I;
        //   186: dup            
        //   187: getstatic       org/whispersystems/aV.z:[Ljava/lang/String;
        //   190: iconst_1       
        //   191: aaload         
        //   192: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/String;)V
        //   195: athrow         
        //   196: astore          12
        //   198: aload           12
        //   200: athrow         
        //   201: astore          9
        //   203: aload           9
        //   205: athrow         
        //   206: astore          10
        //   208: aload           10
        //   210: athrow         
        //   211: astore          11
        //   213: aload           11
        //   215: athrow         
        //   216: aload_0        
        //   217: aload_1        
        //   218: putfield        org/whispersystems/aV.b:[B
        //   221: aload_0        
        //   222: aload           8
        //   224: invokevirtual   org/whispersystems/al.h:()I
        //   227: putfield        org/whispersystems/aV.c:I
        //   230: aload_0        
        //   231: aload           8
        //   233: invokevirtual   org/whispersystems/al.c:()I
        //   236: putfield        org/whispersystems/aV.d:I
        //   239: aload_0        
        //   240: aload           8
        //   242: invokevirtual   org/whispersystems/al.k:()Lcom/google/hv;
        //   245: invokevirtual   com/google/hv.a:()[B
        //   248: putfield        org/whispersystems/aV.e:[B
        //   251: aload_0        
        //   252: aload           8
        //   254: invokevirtual   org/whispersystems/al.i:()Lcom/google/hv;
        //   257: invokevirtual   com/google/hv.a:()[B
        //   260: iconst_0       
        //   261: invokestatic    org/whispersystems/s.a:([BI)Lorg/whispersystems/ak;
        //   264: putfield        org/whispersystems/aV.a:Lorg/whispersystems/ak;
        //   267: return         
        //   268: astore_2       
        //   269: goto            75
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  4      26     74     75     Lcom/google/bg;
        //  4      26     268    272    Lorg/whispersystems/aA;
        //  26     69     69     74     Lcom/google/bg;
        //  26     69     268    272    Lorg/whispersystems/aA;
        //  71     74     74     75     Lcom/google/bg;
        //  71     74     268    272    Lorg/whispersystems/aA;
        //  84     127    127    132    Lcom/google/bg;
        //  84     127    268    272    Lorg/whispersystems/aA;
        //  129    132    74     75     Lcom/google/bg;
        //  129    132    268    272    Lorg/whispersystems/aA;
        //  132    139    74     75     Lcom/google/bg;
        //  132    139    268    272    Lorg/whispersystems/aA;
        //  139    154    201    206    Lcom/google/bg;
        //  139    154    268    272    Lorg/whispersystems/aA;
        //  159    166    206    211    Lcom/google/bg;
        //  159    166    268    272    Lorg/whispersystems/aA;
        //  171    178    211    216    Lcom/google/bg;
        //  171    178    268    272    Lorg/whispersystems/aA;
        //  183    196    196    201    Lcom/google/bg;
        //  183    196    268    272    Lorg/whispersystems/aA;
        //  198    201    74     75     Lcom/google/bg;
        //  198    201    268    272    Lorg/whispersystems/aA;
        //  203    206    206    211    Lcom/google/bg;
        //  203    206    268    272    Lorg/whispersystems/aA;
        //  208    211    211    216    Lcom/google/bg;
        //  208    211    268    272    Lorg/whispersystems/aA;
        //  213    216    196    201    Lcom/google/bg;
        //  213    216    268    272    Lorg/whispersystems/aA;
        //  216    267    74     75     Lcom/google/bg;
        //  216    267    268    272    Lorg/whispersystems/aA;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 136, Size: 136
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    @Override
    public byte[] a() {
        return this.b;
    }
    
    @Override
    public int b() {
        return 5;
    }
    
    public byte[] b() {
        return this.e;
    }
    
    public int c() {
        return this.d;
    }
    
    public ak d() {
        return this.a;
    }
    
    public int e() {
        return this.c;
    }
}
