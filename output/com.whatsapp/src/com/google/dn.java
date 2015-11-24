// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.InputStream;

public final class dn extends dS implements eC
{
    public static du f;
    public static final int g = 1;
    private static final dn j;
    public static final int m = 2;
    private static final long serialVersionUID;
    private boolean e;
    private int h;
    private Object i;
    private byte k;
    private final ce l;
    private int n;
    
    static {
        dn.f = new hF();
        (j = new dn(true)).j();
    }
    
    private dn(final cL p0, final fu p1) {
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
        //    10: putfield        com/google/dn.k:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        com/google/dn.h:I
        //    18: aload_0        
        //    19: invokespecial   com/google/dn.j:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            144
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 158
        //               10: 100
        //               16: 122
        //          default: 76
        //        }
        //    76: aload_0        
        //    77: aload_1        
        //    78: aload           4
        //    80: aload_2        
        //    81: iload           9
        //    83: invokevirtual   com/google/dn.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    86: istore          11
        //    88: iload           11
        //    90: ifne            140
        //    93: iload_3        
        //    94: ifeq            229
        //    97: iconst_1       
        //    98: istore          5
        //   100: aload_0        
        //   101: iconst_1       
        //   102: aload_0        
        //   103: getfield        com/google/dn.n:I
        //   106: ior            
        //   107: putfield        com/google/dn.n:I
        //   110: aload_0        
        //   111: aload_1        
        //   112: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   115: putfield        com/google/dn.i:Ljava/lang/Object;
        //   118: iload_3        
        //   119: ifeq            140
        //   122: aload_0        
        //   123: iconst_2       
        //   124: aload_0        
        //   125: getfield        com/google/dn.n:I
        //   128: ior            
        //   129: putfield        com/google/dn.n:I
        //   132: aload_0        
        //   133: aload_1        
        //   134: invokevirtual   com/google/cL.x:()Z
        //   137: putfield        com/google/dn.e:Z
        //   140: iload_3        
        //   141: ifeq            30
        //   144: aload_0        
        //   145: aload           4
        //   147: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   150: putfield        com/google/dn.l:Lcom/google/ce;
        //   153: aload_0        
        //   154: invokevirtual   com/google/dn.c:()V
        //   157: return         
        //   158: iload_3        
        //   159: ifeq            229
        //   162: iconst_1       
        //   163: istore          5
        //   165: goto            76
        //   168: astore          10
        //   170: aload           10
        //   172: athrow         
        //   173: astore          8
        //   175: aload           8
        //   177: aload_0        
        //   178: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   181: athrow         
        //   182: astore          7
        //   184: aload_0        
        //   185: aload           4
        //   187: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   190: putfield        com/google/dn.l:Lcom/google/ce;
        //   193: aload_0        
        //   194: invokevirtual   com/google/dn.c:()V
        //   197: aload           7
        //   199: athrow         
        //   200: astore          12
        //   202: aload           12
        //   204: athrow         
        //   205: astore          13
        //   207: aload           13
        //   209: athrow         
        //   210: astore          6
        //   212: new             Lcom/google/bg;
        //   215: dup            
        //   216: aload           6
        //   218: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   221: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   224: aload_0        
        //   225: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   228: athrow         
        //   229: iconst_1       
        //   230: istore          5
        //   232: goto            140
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     173    182    Lcom/google/bg;
        //  35     41     210    229    Ljava/io/IOException;
        //  35     41     182    200    Any
        //  76     88     168    173    Lcom/google/bg;
        //  76     88     210    229    Ljava/io/IOException;
        //  76     88     182    200    Any
        //  100    118    200    205    Lcom/google/bg;
        //  100    118    210    229    Ljava/io/IOException;
        //  100    118    182    200    Any
        //  122    140    205    210    Lcom/google/bg;
        //  122    140    210    229    Ljava/io/IOException;
        //  122    140    182    200    Any
        //  170    173    173    182    Lcom/google/bg;
        //  170    173    210    229    Ljava/io/IOException;
        //  170    173    182    200    Any
        //  175    182    182    200    Any
        //  202    205    205    210    Lcom/google/bg;
        //  202    205    210    229    Ljava/io/IOException;
        //  202    205    182    200    Any
        //  207    210    173    182    Lcom/google/bg;
        //  207    210    210    229    Ljava/io/IOException;
        //  207    210    182    200    Any
        //  212    229    182    200    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 107, Size: 107
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
    
    dn(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dn(final fp fp) {
        super(fp);
        this.k = -1;
        this.h = -1;
        this.l = fp.getUnknownFields();
    }
    
    dn(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dn(final boolean b) {
        this.k = -1;
        this.h = -1;
        this.l = ce.d();
    }
    
    static int a(final dn dn, final int n) {
        return dn.n = n;
    }
    
    public static dn a(final cL cl) {
        return (dn)dn.f.a(cl);
    }
    
    public static dn a(final cL cl, final fu fu) {
        return (dn)dn.f.a(cl, fu);
    }
    
    public static dn a(final hv hv) {
        return (dn)dn.f.a(hv);
    }
    
    public static dn a(final hv hv, final fu fu) {
        return (dn)dn.f.a(hv, fu);
    }
    
    public static dn a(final InputStream inputStream) {
        return (dn)dn.f.a(inputStream);
    }
    
    public static dn a(final InputStream inputStream, final fu fu) {
        return (dn)dn.f.b(inputStream, fu);
    }
    
    public static dn a(final byte[] array) {
        return (dn)dn.f.a(array);
    }
    
    public static dn a(final byte[] array, final fu fu) {
        return (dn)dn.f.a(array, fu);
    }
    
    static Object a(final dn dn) {
        return dn.i;
    }
    
    static Object a(final dn dn, final Object i) {
        return dn.i = i;
    }
    
    static boolean a(final dn dn, final boolean e) {
        return dn.e = e;
    }
    
    public static dn b(final InputStream inputStream) {
        return (dn)dn.f.b(inputStream);
    }
    
    public static dn b(final InputStream inputStream, final fu fu) {
        return (dn)dn.f.a(inputStream, fu);
    }
    
    public static gr b(final dn dn) {
        return g().a(dn);
    }
    
    public static gr g() {
        return gr.i();
    }
    
    private void j() {
        this.i = "";
        this.e = false;
    }
    
    public static dn k() {
        return dn.j;
    }
    
    public static final bl l() {
        return hM.M();
    }
    
    protected gr a(final dg dg) {
        return new gr(dg, null);
    }
    
    public boolean a() {
        return (0x2 & this.n) == 0x2;
    }
    
    public gr b() {
        return b(this);
    }
    
    public gr c() {
        return g();
    }
    
    public boolean d() {
        return this.e;
    }
    
    public String e() {
        final Object i = this.i;
        if (i instanceof String) {
            return (String)i;
        }
        final hv hv = (hv)i;
        final String j = hv.i();
        if (hv.b()) {
            this.i = j;
        }
        return j;
    }
    
    public boolean f() {
        return (0x1 & this.n) == 0x1;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.i();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.i();
    }
    
    @Override
    public du getParserForType() {
        return dn.f;
    }
    
    @Override
    public int getSerializedSize() {
        final int h = this.h;
        if (h != -1) {
            return h;
        }
        final int n = 0x1 & this.n;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.h());
        }
        if ((0x2 & this.n) == 0x2) {
            n2 += ep.a(2, this.e);
        }
        return this.h = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.l;
    }
    
    public hv h() {
        final Object i = this.i;
        if (i instanceof String) {
            return (hv)(this.i = hv.b((String)i));
        }
        return (hv)i;
    }
    
    public dn i() {
        return dn.j;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.N().a(dn.class, gr.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte k = this.k;
        if (k != -1) {
            return k == 1;
        }
        if (!this.f()) {
            this.k = 0;
            return false;
        }
        if (!this.a()) {
            this.k = 0;
            return false;
        }
        this.k = 1;
        return true;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.c();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.c();
    }
    
    @Override
    public a8 toBuilder() {
        return this.b();
    }
    
    @Override
    public aJ toBuilder() {
        return this.b();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.n) == 0x1) {
            ep.c(1, this.h());
        }
        if ((0x2 & this.n) == 0x2) {
            ep.b(2, this.e);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
