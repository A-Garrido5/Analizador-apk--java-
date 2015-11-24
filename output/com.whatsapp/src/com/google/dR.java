// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class dR extends dS implements ff
{
    public static du f;
    public static final int g = 1;
    private static final dR i;
    private static final long serialVersionUID;
    private final ce e;
    private List h;
    private int j;
    private byte k;
    
    static {
        dR.f = new hn();
        (i = new dR(true)).e();
    }
    
    private dR(final cL p0, final fu p1) {
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
        //    13: putfield        com/google/dR.k:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/dR.j:I
        //    21: aload_0        
        //    22: invokespecial   com/google/dR.e:()V
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
        //    79: invokevirtual   com/google/dR.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
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
        //   112: putfield        com/google/dR.h:Ljava/util/List;
        //   115: iload           6
        //   117: iconst_1       
        //   118: ior            
        //   119: istore          6
        //   121: aload_0        
        //   122: getfield        com/google/dR.h:Ljava/util/List;
        //   125: aload_1        
        //   126: getstatic       com/google/dm.q:Lcom/google/du;
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
        //   154: getfield        com/google/dR.h:Ljava/util/List;
        //   157: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   160: putfield        com/google/dR.h:Ljava/util/List;
        //   163: aload_0        
        //   164: aload           5
        //   166: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   169: putfield        com/google/dR.e:Lcom/google/ce;
        //   172: aload_0        
        //   173: invokevirtual   com/google/dR.c:()V
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
        //   213: getfield        com/google/dR.h:Ljava/util/List;
        //   216: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   219: putfield        com/google/dR.h:Ljava/util/List;
        //   222: aload_0        
        //   223: aload           5
        //   225: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   228: putfield        com/google/dR.e:Lcom/google/ce;
        //   231: aload_0        
        //   232: invokevirtual   com/google/dR.c:()V
        //   235: aload           9
        //   237: athrow         
        //   238: astore          8
        //   240: new             Lcom/google/bg;
        //   243: dup            
        //   244: aload           8
        //   246: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   249: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   252: aload_0        
        //   253: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   256: athrow         
        //   257: astore          10
        //   259: aload           10
        //   261: athrow         
        //   262: astore          7
        //   264: aload           7
        //   266: athrow         
        //   267: iconst_1       
        //   268: istore_3       
        //   269: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     192    201    Lcom/google/bg;
        //  37     43     238    257    Ljava/io/IOException;
        //  37     43     201    238    Any
        //  72     84     187    192    Lcom/google/bg;
        //  72     84     238    257    Ljava/io/IOException;
        //  72     84     201    238    Any
        //  104    115    192    201    Lcom/google/bg;
        //  104    115    238    257    Ljava/io/IOException;
        //  104    115    201    238    Any
        //  121    139    192    201    Lcom/google/bg;
        //  121    139    238    257    Ljava/io/IOException;
        //  121    139    201    238    Any
        //  152    163    262    267    Lcom/google/bg;
        //  189    192    192    201    Lcom/google/bg;
        //  189    192    238    257    Ljava/io/IOException;
        //  189    192    201    238    Any
        //  194    201    201    238    Any
        //  211    222    257    262    Lcom/google/bg;
        //  240    257    201    238    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0177:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    dR(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dR(final fp fp) {
        super(fp);
        this.k = -1;
        this.j = -1;
        this.e = fp.getUnknownFields();
    }
    
    dR(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dR(final boolean b) {
        this.k = -1;
        this.j = -1;
        this.e = ce.d();
    }
    
    public static dR a() {
        return dR.i;
    }
    
    public static dR a(final cL cl) {
        return (dR)dR.f.a(cl);
    }
    
    public static dR a(final cL cl, final fu fu) {
        return (dR)dR.f.a(cl, fu);
    }
    
    public static dR a(final hv hv) {
        return (dR)dR.f.a(hv);
    }
    
    public static dR a(final hv hv, final fu fu) {
        return (dR)dR.f.a(hv, fu);
    }
    
    public static dR a(final InputStream inputStream) {
        return (dR)dR.f.b(inputStream);
    }
    
    public static dR a(final InputStream inputStream, final fu fu) {
        return (dR)dR.f.a(inputStream, fu);
    }
    
    public static dR a(final byte[] array) {
        return (dR)dR.f.a(array);
    }
    
    public static dR a(final byte[] array, final fu fu) {
        return (dR)dR.f.a(array, fu);
    }
    
    static List a(final dR dr) {
        return dr.h;
    }
    
    static List a(final dR dr, final List h) {
        return dr.h = h;
    }
    
    public static final bl b() {
        return hM.d();
    }
    
    public static dR b(final InputStream inputStream) {
        return (dR)dR.f.a(inputStream);
    }
    
    public static dR b(final InputStream inputStream, final fu fu) {
        return (dR)dR.f.b(inputStream, fu);
    }
    
    public static g4 b(final dR dr) {
        return i().a(dr);
    }
    
    private void e() {
        this.h = Collections.emptyList();
    }
    
    public static g4 i() {
        return g4.h();
    }
    
    public aB a(final int n) {
        return this.h.get(n);
    }
    
    protected g4 a(final dg dg) {
        return new g4(dg, null);
    }
    
    public dm b(final int n) {
        return this.h.get(n);
    }
    
    public int c() {
        return this.h.size();
    }
    
    public List d() {
        return this.h;
    }
    
    public List f() {
        return this.h;
    }
    
    public g4 g() {
        return b(this);
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.j();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.j();
    }
    
    @Override
    public du getParserForType() {
        return dR.f;
    }
    
    @Override
    public int getSerializedSize() {
        final boolean b = dt.b;
        final int j = this.j;
        if (j != -1) {
            return j;
        }
        int i = 0;
        int n = 0;
        while (i < this.h.size()) {
            n += ep.f(1, this.h.get(i));
            final int n2 = i + 1;
            if (b) {
                break;
            }
            i = n2;
        }
        return this.j = n + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.e;
    }
    
    public g4 h() {
        return i();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.D().a(dR.class, g4.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte k = this.k;
        if (k != -1) {
            return k == 1;
        }
        this.k = 1;
        return true;
    }
    
    public dR j() {
        return dR.i;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.h();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.h();
    }
    
    @Override
    public a8 toBuilder() {
        return this.g();
    }
    
    @Override
    public aJ toBuilder() {
        return this.g();
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
        for (int i = 0; i < this.h.size(); i = n) {
            ep.e(1, (ci)this.h.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        this.getUnknownFields().writeTo(ep);
    }
}
