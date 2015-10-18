// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class dl extends dS implements bA
{
    public static final int e = 1;
    private static final dl f;
    public static du h;
    private static final long serialVersionUID;
    private List g;
    private byte i;
    private final ce j;
    private int k;
    
    static {
        dl.h = new hO();
        (f = new dl(true)).i();
    }
    
    private dl(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       com/google/dt.b:Z
        //     5: istore          4
        //     7: aload_0        
        //     8: invokespecial   com/google/dS.<init>:()V
        //    11: aload_0        
        //    12: iconst_m1      
        //    13: putfield        com/google/dl.i:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/dl.k:I
        //    21: aload_0        
        //    22: invokespecial   com/google/dl.i:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            144
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 177
        //               10: 96
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: aload_1        
        //    74: aload           5
        //    76: aload_2        
        //    77: iload           12
        //    79: invokevirtual   com/google/dl.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    82: istore          14
        //    84: iload           14
        //    86: ifne            139
        //    89: iload           4
        //    91: ifeq            267
        //    94: iconst_1       
        //    95: istore_3       
        //    96: iload           6
        //    98: iconst_1       
        //    99: iand           
        //   100: iconst_1       
        //   101: if_icmpeq       121
        //   104: aload_0        
        //   105: new             Ljava/util/ArrayList;
        //   108: dup            
        //   109: invokespecial   java/util/ArrayList.<init>:()V
        //   112: putfield        com/google/dl.g:Ljava/util/List;
        //   115: iload           6
        //   117: iconst_1       
        //   118: ior            
        //   119: istore          6
        //   121: aload_0        
        //   122: getfield        com/google/dl.g:Ljava/util/List;
        //   125: aload_1        
        //   126: getstatic       com/google/dO.z:Lcom/google/du;
        //   129: aload_2        
        //   130: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   133: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   138: pop            
        //   139: iload           4
        //   141: ifeq            33
        //   144: iload           6
        //   146: iconst_1       
        //   147: iand           
        //   148: iconst_1       
        //   149: if_icmpne       163
        //   152: aload_0        
        //   153: aload_0        
        //   154: getfield        com/google/dl.g:Ljava/util/List;
        //   157: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   160: putfield        com/google/dl.g:Ljava/util/List;
        //   163: aload_0        
        //   164: aload           5
        //   166: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   169: putfield        com/google/dl.j:Lcom/google/ce;
        //   172: aload_0        
        //   173: invokevirtual   com/google/dl.c:()V
        //   176: return         
        //   177: iload           4
        //   179: ifeq            267
        //   182: iconst_1       
        //   183: istore_3       
        //   184: goto            72
        //   187: astore          13
        //   189: aload           13
        //   191: athrow         
        //   192: astore          11
        //   194: aload           11
        //   196: aload_0        
        //   197: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   200: athrow         
        //   201: astore          9
        //   203: iload           6
        //   205: iconst_1       
        //   206: iand           
        //   207: iconst_1       
        //   208: if_icmpne       222
        //   211: aload_0        
        //   212: aload_0        
        //   213: getfield        com/google/dl.g:Ljava/util/List;
        //   216: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   219: putfield        com/google/dl.g:Ljava/util/List;
        //   222: aload_0        
        //   223: aload           5
        //   225: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   228: putfield        com/google/dl.j:Lcom/google/ce;
        //   231: aload_0        
        //   232: invokevirtual   com/google/dl.c:()V
        //   235: aload           9
        //   237: athrow         
        //   238: astore          7
        //   240: aload           7
        //   242: athrow         
        //   243: astore          8
        //   245: new             Lcom/google/bg;
        //   248: dup            
        //   249: aload           8
        //   251: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   254: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   257: aload_0        
        //   258: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   261: athrow         
        //   262: astore          10
        //   264: aload           10
        //   266: athrow         
        //   267: iconst_1       
        //   268: istore_3       
        //   269: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     192    201    Lcom/google/bg;
        //  37     43     243    262    Ljava/io/IOException;
        //  37     43     201    238    Any
        //  72     84     187    192    Lcom/google/bg;
        //  72     84     243    262    Ljava/io/IOException;
        //  72     84     201    238    Any
        //  104    115    192    201    Lcom/google/bg;
        //  104    115    243    262    Ljava/io/IOException;
        //  104    115    201    238    Any
        //  121    139    192    201    Lcom/google/bg;
        //  121    139    243    262    Ljava/io/IOException;
        //  121    139    201    238    Any
        //  152    163    238    243    Lcom/google/bg;
        //  189    192    192    201    Lcom/google/bg;
        //  189    192    243    262    Ljava/io/IOException;
        //  189    192    201    238    Any
        //  194    201    201    238    Any
        //  211    222    262    267    Lcom/google/bg;
        //  245    262    201    238    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 129, Size: 129
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    dl(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dl(final fp fp) {
        super(fp);
        this.i = -1;
        this.k = -1;
        this.j = fp.getUnknownFields();
    }
    
    dl(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dl(final boolean b) {
        this.i = -1;
        this.k = -1;
        this.j = ce.d();
    }
    
    public static dl a(final cL cl) {
        return (dl)dl.h.a(cl);
    }
    
    public static dl a(final cL cl, final fu fu) {
        return (dl)dl.h.a(cl, fu);
    }
    
    public static dl a(final hv hv) {
        return (dl)dl.h.a(hv);
    }
    
    public static dl a(final hv hv, final fu fu) {
        return (dl)dl.h.a(hv, fu);
    }
    
    public static dl a(final InputStream inputStream) {
        return (dl)dl.h.b(inputStream);
    }
    
    public static dl a(final InputStream inputStream, final fu fu) {
        return (dl)dl.h.a(inputStream, fu);
    }
    
    public static dl a(final byte[] array) {
        return (dl)dl.h.a(array);
    }
    
    public static dl a(final byte[] array, final fu fu) {
        return (dl)dl.h.a(array, fu);
    }
    
    public static gT a(final dl dl) {
        return h().a(dl);
    }
    
    static List a(final dl dl, final List g) {
        return dl.g = g;
    }
    
    public static dl b() {
        return dl.f;
    }
    
    public static dl b(final InputStream inputStream) {
        return (dl)dl.h.a(inputStream);
    }
    
    public static dl b(final InputStream inputStream, final fu fu) {
        return (dl)dl.h.b(inputStream, fu);
    }
    
    static List b(final dl dl) {
        return dl.g;
    }
    
    public static gT h() {
        return gT.g();
    }
    
    private void i() {
        this.g = Collections.emptyList();
    }
    
    public static final bl j() {
        return hM.w();
    }
    
    public dO a(final int n) {
        return this.g.get(n);
    }
    
    public gT a() {
        return h();
    }
    
    protected gT a(final dg dg) {
        return new gT(dg, null);
    }
    
    public g b(final int n) {
        return this.g.get(n);
    }
    
    public gT c() {
        return a(this);
    }
    
    public dl d() {
        return dl.f;
    }
    
    public List e() {
        return this.g;
    }
    
    public int f() {
        return this.g.size();
    }
    
    public List g() {
        return this.g;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.d();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.d();
    }
    
    @Override
    public du getParserForType() {
        return dl.h;
    }
    
    @Override
    public int getSerializedSize() {
        final boolean b = dt.b;
        final int k = this.k;
        if (k != -1) {
            return k;
        }
        int i = 0;
        int n = 0;
        while (i < this.g.size()) {
            n += ep.f(1, this.g.get(i));
            final int n2 = i + 1;
            if (b) {
                break;
            }
            i = n2;
        }
        return this.k = n + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.j;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.l().a(dl.class, gT.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        final byte i = this.i;
        if (i != -1) {
            return i == 1;
        }
        int j = 0;
        while (j < this.f()) {
            if (!this.a(j).isInitialized()) {
                this.i = 0;
                return false;
            }
            ++j;
            if (b) {
                break;
            }
        }
        this.i = 1;
        return true;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.a();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.a();
    }
    
    @Override
    public a8 toBuilder() {
        return this.c();
    }
    
    @Override
    public aJ toBuilder() {
        return this.c();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        this.getSerializedSize();
        int n;
        for (int i = 0; i < this.g.size(); i = n) {
            ep.e(1, (ci)this.g.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        this.getUnknownFields().writeTo(ep);
    }
}
