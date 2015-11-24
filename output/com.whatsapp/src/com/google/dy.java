// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class dy extends dS implements f
{
    public static final int e = 3;
    public static final int i = 8;
    public static du k;
    public static final int l = 2;
    public static final int m = 6;
    public static final int n = 4;
    public static final int q = 7;
    private static final dy s;
    private static final long serialVersionUID = 0L;
    public static final int w = 5;
    private double f;
    private int g;
    private List h;
    private hv j;
    private final ce o;
    private long p;
    private Object r;
    private Object t;
    private int u;
    private byte v;
    private long x;
    
    static {
        dy.k = new ha();
        (s = new dy(true)).o();
    }
    
    private dy(final cL p0, final fu p1) {
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
        //    13: putfield        com/google/dy.v:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/dy.g:I
        //    21: aload_0        
        //    22: invokespecial   com/google/dy.o:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            333
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 366
        //               18: 144
        //               26: 192
        //               32: 215
        //               40: 238
        //               49: 261
        //               58: 285
        //               66: 309
        //          default: 120
        //        }
        //   120: aload_0        
        //   121: aload_1        
        //   122: aload           5
        //   124: aload_2        
        //   125: iload           12
        //   127: invokevirtual   com/google/dy.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   130: istore          14
        //   132: iload           14
        //   134: ifne            328
        //   137: iload           4
        //   139: ifeq            486
        //   142: iconst_1       
        //   143: istore_3       
        //   144: iload           6
        //   146: iconst_1       
        //   147: iand           
        //   148: iconst_1       
        //   149: if_icmpeq       169
        //   152: aload_0        
        //   153: new             Ljava/util/ArrayList;
        //   156: dup            
        //   157: invokespecial   java/util/ArrayList.<init>:()V
        //   160: putfield        com/google/dy.h:Ljava/util/List;
        //   163: iload           6
        //   165: iconst_1       
        //   166: ior            
        //   167: istore          6
        //   169: aload_0        
        //   170: getfield        com/google/dy.h:Ljava/util/List;
        //   173: aload_1        
        //   174: getstatic       com/google/dn.f:Lcom/google/du;
        //   177: aload_2        
        //   178: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   181: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   186: pop            
        //   187: iload           4
        //   189: ifeq            328
        //   192: aload_0        
        //   193: iconst_1       
        //   194: aload_0        
        //   195: getfield        com/google/dy.u:I
        //   198: ior            
        //   199: putfield        com/google/dy.u:I
        //   202: aload_0        
        //   203: aload_1        
        //   204: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   207: putfield        com/google/dy.r:Ljava/lang/Object;
        //   210: iload           4
        //   212: ifeq            328
        //   215: aload_0        
        //   216: iconst_2       
        //   217: aload_0        
        //   218: getfield        com/google/dy.u:I
        //   221: ior            
        //   222: putfield        com/google/dy.u:I
        //   225: aload_0        
        //   226: aload_1        
        //   227: invokevirtual   com/google/cL.t:()J
        //   230: putfield        com/google/dy.x:J
        //   233: iload           4
        //   235: ifeq            328
        //   238: aload_0        
        //   239: iconst_4       
        //   240: aload_0        
        //   241: getfield        com/google/dy.u:I
        //   244: ior            
        //   245: putfield        com/google/dy.u:I
        //   248: aload_0        
        //   249: aload_1        
        //   250: invokevirtual   com/google/cL.k:()J
        //   253: putfield        com/google/dy.p:J
        //   256: iload           4
        //   258: ifeq            328
        //   261: aload_0        
        //   262: bipush          8
        //   264: aload_0        
        //   265: getfield        com/google/dy.u:I
        //   268: ior            
        //   269: putfield        com/google/dy.u:I
        //   272: aload_0        
        //   273: aload_1        
        //   274: invokevirtual   com/google/cL.u:()D
        //   277: putfield        com/google/dy.f:D
        //   280: iload           4
        //   282: ifeq            328
        //   285: aload_0        
        //   286: bipush          16
        //   288: aload_0        
        //   289: getfield        com/google/dy.u:I
        //   292: ior            
        //   293: putfield        com/google/dy.u:I
        //   296: aload_0        
        //   297: aload_1        
        //   298: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   301: putfield        com/google/dy.j:Lcom/google/hv;
        //   304: iload           4
        //   306: ifeq            328
        //   309: aload_0        
        //   310: bipush          32
        //   312: aload_0        
        //   313: getfield        com/google/dy.u:I
        //   316: ior            
        //   317: putfield        com/google/dy.u:I
        //   320: aload_0        
        //   321: aload_1        
        //   322: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   325: putfield        com/google/dy.t:Ljava/lang/Object;
        //   328: iload           4
        //   330: ifeq            33
        //   333: iload           6
        //   335: iconst_1       
        //   336: iand           
        //   337: iconst_1       
        //   338: if_icmpne       352
        //   341: aload_0        
        //   342: aload_0        
        //   343: getfield        com/google/dy.h:Ljava/util/List;
        //   346: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   349: putfield        com/google/dy.h:Ljava/util/List;
        //   352: aload_0        
        //   353: aload           5
        //   355: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   358: putfield        com/google/dy.o:Lcom/google/ce;
        //   361: aload_0        
        //   362: invokevirtual   com/google/dy.c:()V
        //   365: return         
        //   366: iload           4
        //   368: ifeq            486
        //   371: iconst_1       
        //   372: istore_3       
        //   373: goto            120
        //   376: astore          13
        //   378: aload           13
        //   380: athrow         
        //   381: astore          11
        //   383: aload           11
        //   385: aload_0        
        //   386: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   389: athrow         
        //   390: astore          9
        //   392: iload           6
        //   394: iconst_1       
        //   395: iand           
        //   396: iconst_1       
        //   397: if_icmpne       411
        //   400: aload_0        
        //   401: aload_0        
        //   402: getfield        com/google/dy.h:Ljava/util/List;
        //   405: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   408: putfield        com/google/dy.h:Ljava/util/List;
        //   411: aload_0        
        //   412: aload           5
        //   414: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   417: putfield        com/google/dy.o:Lcom/google/ce;
        //   420: aload_0        
        //   421: invokevirtual   com/google/dy.c:()V
        //   424: aload           9
        //   426: athrow         
        //   427: astore          15
        //   429: aload           15
        //   431: athrow         
        //   432: astore          16
        //   434: aload           16
        //   436: athrow         
        //   437: astore          17
        //   439: aload           17
        //   441: athrow         
        //   442: astore          18
        //   444: aload           18
        //   446: athrow         
        //   447: astore          19
        //   449: aload           19
        //   451: athrow         
        //   452: astore          20
        //   454: aload           20
        //   456: athrow         
        //   457: astore          8
        //   459: new             Lcom/google/bg;
        //   462: dup            
        //   463: aload           8
        //   465: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   468: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   471: aload_0        
        //   472: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   475: athrow         
        //   476: astore          10
        //   478: aload           10
        //   480: athrow         
        //   481: astore          7
        //   483: aload           7
        //   485: athrow         
        //   486: iconst_1       
        //   487: istore_3       
        //   488: goto            328
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     381    390    Lcom/google/bg;
        //  37     43     457    476    Ljava/io/IOException;
        //  37     43     390    427    Any
        //  120    132    376    381    Lcom/google/bg;
        //  120    132    457    476    Ljava/io/IOException;
        //  120    132    390    427    Any
        //  152    163    381    390    Lcom/google/bg;
        //  152    163    457    476    Ljava/io/IOException;
        //  152    163    390    427    Any
        //  169    187    427    432    Lcom/google/bg;
        //  169    187    457    476    Ljava/io/IOException;
        //  169    187    390    427    Any
        //  192    210    427    432    Lcom/google/bg;
        //  192    210    457    476    Ljava/io/IOException;
        //  192    210    390    427    Any
        //  215    233    432    437    Lcom/google/bg;
        //  215    233    457    476    Ljava/io/IOException;
        //  215    233    390    427    Any
        //  238    256    437    442    Lcom/google/bg;
        //  238    256    457    476    Ljava/io/IOException;
        //  238    256    390    427    Any
        //  261    280    442    447    Lcom/google/bg;
        //  261    280    457    476    Ljava/io/IOException;
        //  261    280    390    427    Any
        //  285    304    447    452    Lcom/google/bg;
        //  285    304    457    476    Ljava/io/IOException;
        //  285    304    390    427    Any
        //  309    328    452    457    Lcom/google/bg;
        //  309    328    457    476    Ljava/io/IOException;
        //  309    328    390    427    Any
        //  341    352    481    486    Lcom/google/bg;
        //  378    381    381    390    Lcom/google/bg;
        //  378    381    457    476    Ljava/io/IOException;
        //  378    381    390    427    Any
        //  383    390    390    427    Any
        //  400    411    476    481    Lcom/google/bg;
        //  429    432    432    437    Lcom/google/bg;
        //  429    432    457    476    Ljava/io/IOException;
        //  429    432    390    427    Any
        //  434    437    437    442    Lcom/google/bg;
        //  434    437    457    476    Ljava/io/IOException;
        //  434    437    390    427    Any
        //  439    442    442    447    Lcom/google/bg;
        //  439    442    457    476    Ljava/io/IOException;
        //  439    442    390    427    Any
        //  444    447    447    452    Lcom/google/bg;
        //  444    447    457    476    Ljava/io/IOException;
        //  444    447    390    427    Any
        //  449    452    452    457    Lcom/google/bg;
        //  449    452    457    476    Ljava/io/IOException;
        //  449    452    390    427    Any
        //  454    457    381    390    Lcom/google/bg;
        //  454    457    457    476    Ljava/io/IOException;
        //  454    457    390    427    Any
        //  459    476    390    427    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 219, Size: 219
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
    
    dy(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dy(final fp fp) {
        super(fp);
        this.v = -1;
        this.g = -1;
        this.o = fp.getUnknownFields();
    }
    
    dy(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dy(final boolean b) {
        this.v = -1;
        this.g = -1;
        this.o = ce.d();
    }
    
    static double a(final dy dy, final double f) {
        return dy.f = f;
    }
    
    static int a(final dy dy, final int u) {
        return dy.u = u;
    }
    
    static long a(final dy dy, final long p2) {
        return dy.p = p2;
    }
    
    public static dy a(final cL cl) {
        return (dy)dy.k.a(cl);
    }
    
    public static dy a(final cL cl, final fu fu) {
        return (dy)dy.k.a(cl, fu);
    }
    
    public static dy a(final hv hv) {
        return (dy)dy.k.a(hv);
    }
    
    public static dy a(final hv hv, final fu fu) {
        return (dy)dy.k.a(hv, fu);
    }
    
    public static dy a(final InputStream inputStream) {
        return (dy)dy.k.b(inputStream);
    }
    
    public static dy a(final InputStream inputStream, final fu fu) {
        return (dy)dy.k.a(inputStream, fu);
    }
    
    public static dy a(final byte[] array) {
        return (dy)dy.k.a(array);
    }
    
    public static dy a(final byte[] array, final fu fu) {
        return (dy)dy.k.a(array, fu);
    }
    
    static hv a(final dy dy, final hv j) {
        return dy.j = j;
    }
    
    static Object a(final dy dy) {
        return dy.r;
    }
    
    static Object a(final dy dy, final Object r) {
        return dy.r = r;
    }
    
    static List a(final dy dy, final List h) {
        return dy.h = h;
    }
    
    static long b(final dy dy, final long x) {
        return dy.x = x;
    }
    
    public static dy b(final InputStream inputStream) {
        return (dy)dy.k.a(inputStream);
    }
    
    public static dy b(final InputStream inputStream, final fu fu) {
        return (dy)dy.k.b(inputStream, fu);
    }
    
    public static gQ b(final dy dy) {
        return m().a(dy);
    }
    
    static Object b(final dy dy, final Object t) {
        return dy.t = t;
    }
    
    public static dy c() {
        return dy.s;
    }
    
    static Object c(final dy dy) {
        return dy.t;
    }
    
    static List d(final dy dy) {
        return dy.h;
    }
    
    public static final bl g() {
        return hM.A();
    }
    
    public static gQ m() {
        return gQ.g();
    }
    
    private void o() {
        this.h = Collections.emptyList();
        this.r = "";
        this.x = 0L;
        this.p = 0L;
        this.f = 0.0;
        this.j = hv.b;
        this.t = "";
    }
    
    public dn a(final int n) {
        return this.h.get(n);
    }
    
    protected gQ a(final dg dg) {
        return new gQ(dg, null);
    }
    
    public boolean a() {
        return (0x8 & this.u) == 0x8;
    }
    
    public eC b(final int n) {
        return this.h.get(n);
    }
    
    public boolean b() {
        return (0x4 & this.u) == 0x4;
    }
    
    public boolean d() {
        return (0x10 & this.u) == 0x10;
    }
    
    public hv e() {
        final Object t = this.t;
        if (t instanceof String) {
            return (hv)(this.t = hv.b((String)t));
        }
        return (hv)t;
    }
    
    public boolean f() {
        return (0x1 & this.u) == 0x1;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.p();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.p();
    }
    
    @Override
    public du getParserForType() {
        return dy.k;
    }
    
    @Override
    public int getSerializedSize() {
        final boolean b = dt.b;
        final int g = this.g;
        if (g != -1) {
            return g;
        }
        int i = 0;
        int n = 0;
        while (i < this.h.size()) {
            n += ep.f(2, this.h.get(i));
            final int n2 = i + 1;
            if (b) {
                break;
            }
            i = n2;
        }
        if ((0x1 & this.u) == 0x1) {
            n += ep.b(3, this.r());
        }
        if ((0x2 & this.u) == 0x2) {
            n += ep.e(4, this.x);
        }
        if ((0x4 & this.u) == 0x4) {
            n += ep.f(5, this.p);
        }
        if ((0x8 & this.u) == 0x8) {
            n += ep.a(6, this.f);
        }
        if ((0x10 & this.u) == 0x10) {
            n += ep.b(7, this.j);
        }
        if ((0x20 & this.u) == 0x20) {
            n += ep.b(8, this.e());
        }
        return this.g = n + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.o;
    }
    
    public boolean h() {
        return (0x2 & this.u) == 0x2;
    }
    
    public String i() {
        final Object t = this.t;
        if (t instanceof String) {
            return (String)t;
        }
        final hv hv = (hv)t;
        final String i = hv.i();
        if (hv.b()) {
            this.t = i;
        }
        return i;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.k().a(dy.class, gQ.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        final byte v = this.v;
        if (v != -1) {
            return v == 1;
        }
        int i = 0;
        while (i < this.v()) {
            if (!this.a(i).isInitialized()) {
                this.v = 0;
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        this.v = 1;
        return true;
    }
    
    public long j() {
        return this.p;
    }
    
    public List k() {
        return this.h;
    }
    
    public String l() {
        final Object r = this.r;
        if (r instanceof String) {
            return (String)r;
        }
        final hv hv = (hv)r;
        final String i = hv.i();
        if (hv.b()) {
            this.r = i;
        }
        return i;
    }
    
    public boolean n() {
        return (0x20 & this.u) == 0x20;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.x();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.x();
    }
    
    public dy p() {
        return dy.s;
    }
    
    public List q() {
        return this.h;
    }
    
    public hv r() {
        final Object r = this.r;
        if (r instanceof String) {
            return (hv)(this.r = hv.b((String)r));
        }
        return (hv)r;
    }
    
    public long s() {
        return this.x;
    }
    
    public hv t() {
        return this.j;
    }
    
    @Override
    public a8 toBuilder() {
        return this.u();
    }
    
    @Override
    public aJ toBuilder() {
        return this.u();
    }
    
    public gQ u() {
        return b(this);
    }
    
    public int v() {
        return this.h.size();
    }
    
    public double w() {
        return this.f;
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
            ep.e(2, (ci)this.h.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        if ((0x1 & this.u) == 0x1) {
            ep.c(3, this.r());
        }
        if ((0x2 & this.u) == 0x2) {
            ep.b(4, this.x);
        }
        if ((0x4 & this.u) == 0x4) {
            ep.a(5, this.p);
        }
        if ((0x8 & this.u) == 0x8) {
            ep.b(6, this.f);
        }
        if ((0x10 & this.u) == 0x10) {
            ep.c(7, this.j);
        }
        if ((0x20 & this.u) == 0x20) {
            ep.c(8, this.e());
        }
        this.getUnknownFields().writeTo(ep);
    }
    
    public gQ x() {
        return m();
    }
}
