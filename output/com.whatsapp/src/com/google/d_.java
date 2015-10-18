// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class d_ extends df implements fg
{
    public static du h;
    private static final d_ i;
    public static final int j = 999;
    public static final int k = 2;
    public static final int l = 1;
    private static final long serialVersionUID;
    private final ce f;
    private boolean g;
    private byte m;
    private List n;
    private int o;
    private int p;
    private boolean q;
    
    static {
        d_.h = new hc();
        (i = new d_(true)).l();
    }
    
    private d_(final cL p0, final fu p1) {
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
        //     8: invokespecial   com/google/df.<init>:()V
        //    11: aload_0        
        //    12: iconst_m1      
        //    13: putfield        com/google/d_.m:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/d_.o:I
        //    21: aload_0        
        //    22: invokespecial   com/google/d_.l:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            206
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 239
        //                8: 112
        //               16: 135
        //             7994: 158
        //          default: 88
        //        }
        //    88: aload_0        
        //    89: aload_1        
        //    90: aload           5
        //    92: aload_2        
        //    93: iload           12
        //    95: invokevirtual   com/google/d_.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    98: istore          14
        //   100: iload           14
        //   102: ifne            201
        //   105: iload           4
        //   107: ifeq            344
        //   110: iconst_1       
        //   111: istore_3       
        //   112: aload_0        
        //   113: iconst_1       
        //   114: aload_0        
        //   115: getfield        com/google/d_.p:I
        //   118: ior            
        //   119: putfield        com/google/d_.p:I
        //   122: aload_0        
        //   123: aload_1        
        //   124: invokevirtual   com/google/cL.x:()Z
        //   127: putfield        com/google/d_.q:Z
        //   130: iload           4
        //   132: ifeq            201
        //   135: aload_0        
        //   136: iconst_2       
        //   137: aload_0        
        //   138: getfield        com/google/d_.p:I
        //   141: ior            
        //   142: putfield        com/google/d_.p:I
        //   145: aload_0        
        //   146: aload_1        
        //   147: invokevirtual   com/google/cL.x:()Z
        //   150: putfield        com/google/d_.g:Z
        //   153: iload           4
        //   155: ifeq            201
        //   158: iload           6
        //   160: iconst_4       
        //   161: iand           
        //   162: iconst_4       
        //   163: if_icmpeq       183
        //   166: aload_0        
        //   167: new             Ljava/util/ArrayList;
        //   170: dup            
        //   171: invokespecial   java/util/ArrayList.<init>:()V
        //   174: putfield        com/google/d_.n:Ljava/util/List;
        //   177: iload           6
        //   179: iconst_4       
        //   180: ior            
        //   181: istore          6
        //   183: aload_0        
        //   184: getfield        com/google/d_.n:Ljava/util/List;
        //   187: aload_1        
        //   188: getstatic       com/google/dy.k:Lcom/google/du;
        //   191: aload_2        
        //   192: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   195: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   200: pop            
        //   201: iload           4
        //   203: ifeq            33
        //   206: iload           6
        //   208: iconst_4       
        //   209: iand           
        //   210: iconst_4       
        //   211: if_icmpne       225
        //   214: aload_0        
        //   215: aload_0        
        //   216: getfield        com/google/d_.n:Ljava/util/List;
        //   219: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   222: putfield        com/google/d_.n:Ljava/util/List;
        //   225: aload_0        
        //   226: aload           5
        //   228: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   231: putfield        com/google/d_.f:Lcom/google/ce;
        //   234: aload_0        
        //   235: invokevirtual   com/google/d_.c:()V
        //   238: return         
        //   239: iload           4
        //   241: ifeq            344
        //   244: iconst_1       
        //   245: istore_3       
        //   246: goto            88
        //   249: astore          13
        //   251: aload           13
        //   253: athrow         
        //   254: astore          11
        //   256: aload           11
        //   258: aload_0        
        //   259: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   262: athrow         
        //   263: astore          9
        //   265: iload           6
        //   267: iconst_4       
        //   268: iand           
        //   269: iconst_4       
        //   270: if_icmpne       284
        //   273: aload_0        
        //   274: aload_0        
        //   275: getfield        com/google/d_.n:Ljava/util/List;
        //   278: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   281: putfield        com/google/d_.n:Ljava/util/List;
        //   284: aload_0        
        //   285: aload           5
        //   287: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   290: putfield        com/google/d_.f:Lcom/google/ce;
        //   293: aload_0        
        //   294: invokevirtual   com/google/d_.c:()V
        //   297: aload           9
        //   299: athrow         
        //   300: astore          15
        //   302: aload           15
        //   304: athrow         
        //   305: astore          16
        //   307: aload           16
        //   309: athrow         
        //   310: astore          17
        //   312: aload           17
        //   314: athrow         
        //   315: astore          8
        //   317: new             Lcom/google/bg;
        //   320: dup            
        //   321: aload           8
        //   323: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   326: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   329: aload_0        
        //   330: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   333: athrow         
        //   334: astore          10
        //   336: aload           10
        //   338: athrow         
        //   339: astore          7
        //   341: aload           7
        //   343: athrow         
        //   344: iconst_1       
        //   345: istore_3       
        //   346: goto            201
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     254    263    Lcom/google/bg;
        //  37     43     315    334    Ljava/io/IOException;
        //  37     43     263    300    Any
        //  88     100    249    254    Lcom/google/bg;
        //  88     100    315    334    Ljava/io/IOException;
        //  88     100    263    300    Any
        //  112    130    300    305    Lcom/google/bg;
        //  112    130    315    334    Ljava/io/IOException;
        //  112    130    263    300    Any
        //  135    153    305    315    Lcom/google/bg;
        //  135    153    315    334    Ljava/io/IOException;
        //  135    153    263    300    Any
        //  166    177    254    263    Lcom/google/bg;
        //  166    177    315    334    Ljava/io/IOException;
        //  166    177    263    300    Any
        //  183    201    254    263    Lcom/google/bg;
        //  183    201    315    334    Ljava/io/IOException;
        //  183    201    263    300    Any
        //  214    225    339    344    Lcom/google/bg;
        //  251    254    254    263    Lcom/google/bg;
        //  251    254    315    334    Ljava/io/IOException;
        //  251    254    263    300    Any
        //  256    263    263    300    Any
        //  273    284    334    339    Lcom/google/bg;
        //  302    305    305    315    Lcom/google/bg;
        //  302    305    315    334    Ljava/io/IOException;
        //  302    305    263    300    Any
        //  307    310    310    315    Lcom/google/bg;
        //  307    310    315    334    Ljava/io/IOException;
        //  307    310    263    300    Any
        //  312    315    254    263    Lcom/google/bg;
        //  312    315    315    334    Ljava/io/IOException;
        //  312    315    263    300    Any
        //  317    334    263    300    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 162, Size: 162
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
    
    d_(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private d_(final gq gq) {
        super(gq);
        this.m = -1;
        this.o = -1;
        this.f = gq.getUnknownFields();
    }
    
    d_(final gq gq, final fM fm) {
        this(gq);
    }
    
    private d_(final boolean b) {
        this.m = -1;
        this.o = -1;
        this.f = ce.d();
    }
    
    static int a(final d_ d_, final int p2) {
        return d_.p = p2;
    }
    
    public static d_ a(final cL cl) {
        return (d_)d_.h.a(cl);
    }
    
    public static d_ a(final cL cl, final fu fu) {
        return (d_)d_.h.a(cl, fu);
    }
    
    public static d_ a(final hv hv) {
        return (d_)d_.h.a(hv);
    }
    
    public static d_ a(final hv hv, final fu fu) {
        return (d_)d_.h.a(hv, fu);
    }
    
    public static d_ a(final InputStream inputStream) {
        return (d_)d_.h.b(inputStream);
    }
    
    public static d_ a(final InputStream inputStream, final fu fu) {
        return (d_)d_.h.a(inputStream, fu);
    }
    
    public static d_ a(final byte[] array) {
        return (d_)d_.h.a(array);
    }
    
    public static d_ a(final byte[] array, final fu fu) {
        return (d_)d_.h.a(array, fu);
    }
    
    public static gc a(final d_ d_) {
        return b().a(d_);
    }
    
    static List a(final d_ d_, final List n) {
        return d_.n = n;
    }
    
    static boolean a(final d_ d_, final boolean q) {
        return d_.q = q;
    }
    
    public static d_ b(final InputStream inputStream) {
        return (d_)d_.h.a(inputStream);
    }
    
    public static d_ b(final InputStream inputStream, final fu fu) {
        return (d_)d_.h.b(inputStream, fu);
    }
    
    public static gc b() {
        return gc.b();
    }
    
    static List b(final d_ d_) {
        return d_.n;
    }
    
    static boolean b(final d_ d_, final boolean g) {
        return d_.g = g;
    }
    
    public static d_ h() {
        return d_.i;
    }
    
    private void l() {
        this.q = false;
        this.g = false;
        this.n = Collections.emptyList();
    }
    
    public static final bl n() {
        return hM.j();
    }
    
    public dy a(final int n) {
        return this.n.get(n);
    }
    
    protected gc a(final dg dg) {
        return new gc(dg, null);
    }
    
    public boolean a() {
        return this.q;
    }
    
    public f b(final int n) {
        return this.n.get(n);
    }
    
    public boolean c() {
        return (0x2 & this.p) == 0x2;
    }
    
    public boolean d() {
        return (0x1 & this.p) == 0x1;
    }
    
    public List e() {
        return this.n;
    }
    
    public List f() {
        return this.n;
    }
    
    public d_ g() {
        return d_.i;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.g();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.g();
    }
    
    @Override
    public du getParserForType() {
        return d_.h;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean b = dt.b;
        final int o = this.o;
        if (o != -1) {
            return o;
        }
        int n;
        if ((0x1 & this.p) == 0x1) {
            n = 0 + ep.a(1, this.q);
        }
        else {
            n = 0;
        }
        if ((0x2 & this.p) == 0x2) {
            n += ep.a(2, this.g);
        }
        int n2 = n;
        while (i < this.n.size()) {
            final int n3 = n2 + ep.f(999, this.n.get(i));
            ++i;
            if (b) {
                return this.o = n3 + this.c() + this.getUnknownFields().getSerializedSize();
            }
            n2 = n3;
        }
        final int n3 = n2;
        return this.o = n3 + this.c() + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.f;
    }
    
    public gc i() {
        return a(this);
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.G().a(d_.class, gc.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        final byte m = this.m;
        if (m != -1) {
            return m == 1;
        }
        int i = 0;
        while (i < this.j()) {
            if (!this.a(i).isInitialized()) {
                this.m = 0;
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (!this.e()) {
            this.m = 0;
            return false;
        }
        this.m = 1;
        return true;
    }
    
    public int j() {
        return this.n.size();
    }
    
    public gc k() {
        return b();
    }
    
    public boolean m() {
        return this.g;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.k();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.k();
    }
    
    @Override
    public a8 toBuilder() {
        return this.i();
    }
    
    @Override
    public aJ toBuilder() {
        return this.i();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        this.getSerializedSize();
        final ar b2 = this.b();
        if ((0x1 & this.p) == 0x1) {
            ep.b(1, this.q);
        }
        if ((0x2 & this.p) == 0x2) {
            ep.b(2, this.g);
        }
        int n;
        for (int i = 0; i < this.n.size(); i = n) {
            ep.e(999, (ci)this.n.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        b2.a(536870912, ep);
        this.getUnknownFields().writeTo(ep);
    }
}
