// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.InputStream;

public final class dW extends dS implements g7
{
    public static final int j = 2;
    public static du l;
    private static final dW m;
    public static final int o = 3;
    public static final int p = 1;
    private static final long serialVersionUID;
    private Object e;
    private final ce f;
    private int g;
    private byte h;
    private int i;
    private dF k;
    private int n;
    
    static {
        dW.l = new hQ();
        (m = new dW(true)).f();
    }
    
    private dW(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        com/google/dW.h:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        com/google/dW.n:I
        //    18: aload_0        
        //    19: invokespecial   com/google/dW.f:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            240
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 254
        //               10: 356
        //               16: 349
        //               26: 160
        //          default: 84
        //        }
        //    84: iload           5
        //    86: istore          10
        //    88: aload_0        
        //    89: aload_1        
        //    90: aload           4
        //    92: aload_2        
        //    93: iload           9
        //    95: invokevirtual   com/google/dW.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    98: istore          18
        //   100: iload           18
        //   102: ifne            236
        //   105: iload_3        
        //   106: ifeq            343
        //   109: iconst_1       
        //   110: istore          10
        //   112: aload_0        
        //   113: iconst_1       
        //   114: aload_0        
        //   115: getfield        com/google/dW.i:I
        //   118: ior            
        //   119: putfield        com/google/dW.i:I
        //   122: aload_0        
        //   123: aload_1        
        //   124: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   127: putfield        com/google/dW.e:Ljava/lang/Object;
        //   130: iload_3        
        //   131: ifeq            236
        //   134: aload_0        
        //   135: iconst_2       
        //   136: aload_0        
        //   137: getfield        com/google/dW.i:I
        //   140: ior            
        //   141: putfield        com/google/dW.i:I
        //   144: aload_0        
        //   145: aload_1        
        //   146: invokevirtual   com/google/cL.j:()I
        //   149: putfield        com/google/dW.g:I
        //   152: iload_3        
        //   153: ifeq            236
        //   156: iload           10
        //   158: istore          5
        //   160: iconst_4       
        //   161: aload_0        
        //   162: getfield        com/google/dW.i:I
        //   165: iand           
        //   166: iconst_4       
        //   167: if_icmpne       337
        //   170: aload_0        
        //   171: getfield        com/google/dW.k:Lcom/google/dF;
        //   174: invokevirtual   com/google/dF.g:()Lcom/google/gC;
        //   177: astore          16
        //   179: aload           16
        //   181: astore          13
        //   183: aload_0        
        //   184: aload_1        
        //   185: getstatic       com/google/dF.i:Lcom/google/du;
        //   188: aload_2        
        //   189: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   192: checkcast       Lcom/google/dF;
        //   195: putfield        com/google/dW.k:Lcom/google/dF;
        //   198: aload           13
        //   200: ifnull          222
        //   203: aload           13
        //   205: aload_0        
        //   206: getfield        com/google/dW.k:Lcom/google/dF;
        //   209: invokevirtual   com/google/gC.a:(Lcom/google/dF;)Lcom/google/gC;
        //   212: pop            
        //   213: aload_0        
        //   214: aload           13
        //   216: invokevirtual   com/google/gC.i:()Lcom/google/dF;
        //   219: putfield        com/google/dW.k:Lcom/google/dF;
        //   222: aload_0        
        //   223: iconst_4       
        //   224: aload_0        
        //   225: getfield        com/google/dW.i:I
        //   228: ior            
        //   229: putfield        com/google/dW.i:I
        //   232: iload           5
        //   234: istore          10
        //   236: iload_3        
        //   237: ifeq            330
        //   240: aload_0        
        //   241: aload           4
        //   243: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   246: putfield        com/google/dW.f:Lcom/google/ce;
        //   249: aload_0        
        //   250: invokevirtual   com/google/dW.c:()V
        //   253: return         
        //   254: iload_3        
        //   255: ifeq            343
        //   258: iconst_1       
        //   259: istore          10
        //   261: goto            88
        //   264: astore          17
        //   266: aload           17
        //   268: athrow         
        //   269: astore          8
        //   271: aload           8
        //   273: aload_0        
        //   274: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   277: athrow         
        //   278: astore          7
        //   280: aload_0        
        //   281: aload           4
        //   283: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   286: putfield        com/google/dW.f:Lcom/google/ce;
        //   289: aload_0        
        //   290: invokevirtual   com/google/dW.c:()V
        //   293: aload           7
        //   295: athrow         
        //   296: astore          11
        //   298: aload           11
        //   300: athrow         
        //   301: astore          12
        //   303: aload           12
        //   305: athrow         
        //   306: astore          6
        //   308: new             Lcom/google/bg;
        //   311: dup            
        //   312: aload           6
        //   314: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   317: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   320: aload_0        
        //   321: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   324: athrow         
        //   325: astore          14
        //   327: aload           14
        //   329: athrow         
        //   330: iload           10
        //   332: istore          5
        //   334: goto            30
        //   337: aconst_null    
        //   338: astore          13
        //   340: goto            183
        //   343: iconst_1       
        //   344: istore          10
        //   346: goto            236
        //   349: iload           5
        //   351: istore          10
        //   353: goto            134
        //   356: iload           5
        //   358: istore          10
        //   360: goto            112
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     269    278    Lcom/google/bg;
        //  35     41     306    325    Ljava/io/IOException;
        //  35     41     278    296    Any
        //  88     100    264    269    Lcom/google/bg;
        //  88     100    306    325    Ljava/io/IOException;
        //  88     100    278    296    Any
        //  112    130    296    301    Lcom/google/bg;
        //  112    130    306    325    Ljava/io/IOException;
        //  112    130    278    296    Any
        //  134    152    301    306    Lcom/google/bg;
        //  134    152    306    325    Ljava/io/IOException;
        //  134    152    278    296    Any
        //  160    179    269    278    Lcom/google/bg;
        //  160    179    306    325    Ljava/io/IOException;
        //  160    179    278    296    Any
        //  183    198    325    330    Lcom/google/bg;
        //  183    198    306    325    Ljava/io/IOException;
        //  183    198    278    296    Any
        //  203    222    325    330    Lcom/google/bg;
        //  203    222    306    325    Ljava/io/IOException;
        //  203    222    278    296    Any
        //  222    232    269    278    Lcom/google/bg;
        //  222    232    306    325    Ljava/io/IOException;
        //  222    232    278    296    Any
        //  266    269    269    278    Lcom/google/bg;
        //  266    269    306    325    Ljava/io/IOException;
        //  266    269    278    296    Any
        //  271    278    278    296    Any
        //  298    301    301    306    Lcom/google/bg;
        //  298    301    306    325    Ljava/io/IOException;
        //  298    301    278    296    Any
        //  303    306    269    278    Lcom/google/bg;
        //  303    306    306    325    Ljava/io/IOException;
        //  303    306    278    296    Any
        //  308    325    278    296    Any
        //  327    330    269    278    Lcom/google/bg;
        //  327    330    306    325    Ljava/io/IOException;
        //  327    330    278    296    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 166, Size: 166
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    dW(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dW(final fp fp) {
        super(fp);
        this.h = -1;
        this.n = -1;
        this.f = fp.getUnknownFields();
    }
    
    dW(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dW(final boolean b) {
        this.h = -1;
        this.n = -1;
        this.f = ce.d();
    }
    
    static int a(final dW dw, final int g) {
        return dw.g = g;
    }
    
    static dF a(final dW dw, final dF k) {
        return dw.k = k;
    }
    
    public static dW a(final cL cl) {
        return (dW)dW.l.a(cl);
    }
    
    public static dW a(final cL cl, final fu fu) {
        return (dW)dW.l.a(cl, fu);
    }
    
    public static dW a(final hv hv) {
        return (dW)dW.l.a(hv);
    }
    
    public static dW a(final hv hv, final fu fu) {
        return (dW)dW.l.a(hv, fu);
    }
    
    public static dW a(final InputStream inputStream) {
        return (dW)dW.l.a(inputStream);
    }
    
    public static dW a(final InputStream inputStream, final fu fu) {
        return (dW)dW.l.a(inputStream, fu);
    }
    
    public static dW a(final byte[] array) {
        return (dW)dW.l.a(array);
    }
    
    public static dW a(final byte[] array, final fu fu) {
        return (dW)dW.l.a(array, fu);
    }
    
    static Object a(final dW dw) {
        return dw.e;
    }
    
    static Object a(final dW dw, final Object e) {
        return dw.e = e;
    }
    
    static int b(final dW dw, final int i) {
        return dw.i = i;
    }
    
    public static dW b(final InputStream inputStream) {
        return (dW)dW.l.b(inputStream);
    }
    
    public static dW b(final InputStream inputStream, final fu fu) {
        return (dW)dW.l.b(inputStream, fu);
    }
    
    public static fz b(final dW dw) {
        return p().a(dw);
    }
    
    private void f() {
        this.e = "";
        this.g = 0;
        this.k = dF.i();
    }
    
    public static final bl j() {
        return hM.C();
    }
    
    public static dW m() {
        return dW.m;
    }
    
    public static fz p() {
        return fz.l();
    }
    
    protected fz a(final dg dg) {
        return new fz(dg, null);
    }
    
    public String a() {
        final Object e = this.e;
        if (e instanceof String) {
            return (String)e;
        }
        final hv hv = (hv)e;
        final String i = hv.i();
        if (hv.b()) {
            this.e = i;
        }
        return i;
    }
    
    public hv c() {
        final Object e = this.e;
        if (e instanceof String) {
            return (hv)(this.e = hv.b((String)e));
        }
        return (hv)e;
    }
    
    public dF d() {
        return this.k;
    }
    
    public dW e() {
        return dW.m;
    }
    
    public boolean g() {
        return (0x4 & this.i) == 0x4;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.e();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.e();
    }
    
    @Override
    public du getParserForType() {
        return dW.l;
    }
    
    @Override
    public int getSerializedSize() {
        final int n = this.n;
        if (n != -1) {
            return n;
        }
        final int n2 = 0x1 & this.i;
        int n3 = 0;
        if (n2 == 1) {
            n3 = 0 + ep.b(1, this.c());
        }
        if ((0x2 & this.i) == 0x2) {
            n3 += ep.c(2, this.g);
        }
        if ((0x4 & this.i) == 0x4) {
            n3 += ep.f(3, this.k);
        }
        return this.n = n3 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.f;
    }
    
    public fz h() {
        return p();
    }
    
    public int i() {
        return this.g;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.B().a(dW.class, fz.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte h = this.h;
        if (h != -1) {
            return h == 1;
        }
        if (this.g() && !this.d().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }
    
    public aG k() {
        return this.k;
    }
    
    public boolean l() {
        return (0x1 & this.i) == 0x1;
    }
    
    public fz n() {
        return b(this);
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
    
    public boolean o() {
        return (0x2 & this.i) == 0x2;
    }
    
    @Override
    public a8 toBuilder() {
        return this.n();
    }
    
    @Override
    public aJ toBuilder() {
        return this.n();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.i) == 0x1) {
            ep.c(1, this.c());
        }
        if ((0x2 & this.i) == 0x2) {
            ep.e(2, this.g);
        }
        if ((0x4 & this.i) == 0x4) {
            ep.e(3, this.k);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
