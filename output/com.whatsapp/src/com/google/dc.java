// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.InputStream;

public final class dc extends dS implements dP
{
    public static final int f = 2;
    public static final int h = 1;
    public static final int m = 4;
    public static final int o = 3;
    private static final dc p;
    public static du q;
    private static final long serialVersionUID;
    private int e;
    private final ce g;
    private Object i;
    private dN j;
    private byte k;
    private Object l;
    private Object n;
    private int r;
    
    static {
        dc.q = new hB();
        (p = new dc(true)).i();
    }
    
    private dc(final cL p0, final fu p1) {
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
        //    10: putfield        com/google/dc.k:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        com/google/dc.e:I
        //    18: aload_0        
        //    19: invokespecial   com/google/dc.i:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            273
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 287
        //               10: 401
        //               18: 394
        //               26: 387
        //               34: 190
        //          default: 92
        //        }
        //    92: iload           5
        //    94: istore          10
        //    96: aload_0        
        //    97: aload_1        
        //    98: aload           4
        //   100: aload_2        
        //   101: iload           9
        //   103: invokevirtual   com/google/dc.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   106: istore          19
        //   108: iload           19
        //   110: ifne            269
        //   113: iload_3        
        //   114: ifeq            381
        //   117: iconst_1       
        //   118: istore          10
        //   120: aload_0        
        //   121: iconst_1       
        //   122: aload_0        
        //   123: getfield        com/google/dc.r:I
        //   126: ior            
        //   127: putfield        com/google/dc.r:I
        //   130: aload_0        
        //   131: aload_1        
        //   132: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   135: putfield        com/google/dc.l:Ljava/lang/Object;
        //   138: iload_3        
        //   139: ifeq            269
        //   142: aload_0        
        //   143: iconst_2       
        //   144: aload_0        
        //   145: getfield        com/google/dc.r:I
        //   148: ior            
        //   149: putfield        com/google/dc.r:I
        //   152: aload_0        
        //   153: aload_1        
        //   154: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   157: putfield        com/google/dc.i:Ljava/lang/Object;
        //   160: iload_3        
        //   161: ifeq            269
        //   164: aload_0        
        //   165: iconst_4       
        //   166: aload_0        
        //   167: getfield        com/google/dc.r:I
        //   170: ior            
        //   171: putfield        com/google/dc.r:I
        //   174: aload_0        
        //   175: aload_1        
        //   176: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   179: putfield        com/google/dc.n:Ljava/lang/Object;
        //   182: iload_3        
        //   183: ifeq            269
        //   186: iload           10
        //   188: istore          5
        //   190: bipush          8
        //   192: aload_0        
        //   193: getfield        com/google/dc.r:I
        //   196: iand           
        //   197: bipush          8
        //   199: if_icmpne       375
        //   202: aload_0        
        //   203: getfield        com/google/dc.j:Lcom/google/dN;
        //   206: invokevirtual   com/google/dN.i:()Lcom/google/gB;
        //   209: astore          17
        //   211: aload           17
        //   213: astore          14
        //   215: aload_0        
        //   216: aload_1        
        //   217: getstatic       com/google/dN.g:Lcom/google/du;
        //   220: aload_2        
        //   221: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   224: checkcast       Lcom/google/dN;
        //   227: putfield        com/google/dc.j:Lcom/google/dN;
        //   230: aload           14
        //   232: ifnull          254
        //   235: aload           14
        //   237: aload_0        
        //   238: getfield        com/google/dc.j:Lcom/google/dN;
        //   241: invokevirtual   com/google/gB.a:(Lcom/google/dN;)Lcom/google/gB;
        //   244: pop            
        //   245: aload_0        
        //   246: aload           14
        //   248: invokevirtual   com/google/gB.a:()Lcom/google/dN;
        //   251: putfield        com/google/dc.j:Lcom/google/dN;
        //   254: aload_0        
        //   255: bipush          8
        //   257: aload_0        
        //   258: getfield        com/google/dc.r:I
        //   261: ior            
        //   262: putfield        com/google/dc.r:I
        //   265: iload           5
        //   267: istore          10
        //   269: iload_3        
        //   270: ifeq            368
        //   273: aload_0        
        //   274: aload           4
        //   276: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   279: putfield        com/google/dc.g:Lcom/google/ce;
        //   282: aload_0        
        //   283: invokevirtual   com/google/dc.c:()V
        //   286: return         
        //   287: iload_3        
        //   288: ifeq            381
        //   291: iconst_1       
        //   292: istore          10
        //   294: goto            96
        //   297: astore          18
        //   299: aload           18
        //   301: athrow         
        //   302: astore          8
        //   304: aload           8
        //   306: aload_0        
        //   307: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   310: athrow         
        //   311: astore          7
        //   313: aload_0        
        //   314: aload           4
        //   316: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   319: putfield        com/google/dc.g:Lcom/google/ce;
        //   322: aload_0        
        //   323: invokevirtual   com/google/dc.c:()V
        //   326: aload           7
        //   328: athrow         
        //   329: astore          11
        //   331: aload           11
        //   333: athrow         
        //   334: astore          12
        //   336: aload           12
        //   338: athrow         
        //   339: astore          13
        //   341: aload           13
        //   343: athrow         
        //   344: astore          6
        //   346: new             Lcom/google/bg;
        //   349: dup            
        //   350: aload           6
        //   352: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   355: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   358: aload_0        
        //   359: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   362: athrow         
        //   363: astore          15
        //   365: aload           15
        //   367: athrow         
        //   368: iload           10
        //   370: istore          5
        //   372: goto            30
        //   375: aconst_null    
        //   376: astore          14
        //   378: goto            215
        //   381: iconst_1       
        //   382: istore          10
        //   384: goto            269
        //   387: iload           5
        //   389: istore          10
        //   391: goto            164
        //   394: iload           5
        //   396: istore          10
        //   398: goto            142
        //   401: iload           5
        //   403: istore          10
        //   405: goto            120
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     302    311    Lcom/google/bg;
        //  35     41     344    363    Ljava/io/IOException;
        //  35     41     311    329    Any
        //  96     108    297    302    Lcom/google/bg;
        //  96     108    344    363    Ljava/io/IOException;
        //  96     108    311    329    Any
        //  120    138    329    334    Lcom/google/bg;
        //  120    138    344    363    Ljava/io/IOException;
        //  120    138    311    329    Any
        //  142    160    334    339    Lcom/google/bg;
        //  142    160    344    363    Ljava/io/IOException;
        //  142    160    311    329    Any
        //  164    182    339    344    Lcom/google/bg;
        //  164    182    344    363    Ljava/io/IOException;
        //  164    182    311    329    Any
        //  190    211    302    311    Lcom/google/bg;
        //  190    211    344    363    Ljava/io/IOException;
        //  190    211    311    329    Any
        //  215    230    363    368    Lcom/google/bg;
        //  215    230    344    363    Ljava/io/IOException;
        //  215    230    311    329    Any
        //  235    254    363    368    Lcom/google/bg;
        //  235    254    344    363    Ljava/io/IOException;
        //  235    254    311    329    Any
        //  254    265    302    311    Lcom/google/bg;
        //  254    265    344    363    Ljava/io/IOException;
        //  254    265    311    329    Any
        //  299    302    302    311    Lcom/google/bg;
        //  299    302    344    363    Ljava/io/IOException;
        //  299    302    311    329    Any
        //  304    311    311    329    Any
        //  331    334    334    339    Lcom/google/bg;
        //  331    334    344    363    Ljava/io/IOException;
        //  331    334    311    329    Any
        //  336    339    339    344    Lcom/google/bg;
        //  336    339    344    363    Ljava/io/IOException;
        //  336    339    311    329    Any
        //  341    344    302    311    Lcom/google/bg;
        //  341    344    344    363    Ljava/io/IOException;
        //  341    344    311    329    Any
        //  346    363    311    329    Any
        //  365    368    302    311    Lcom/google/bg;
        //  365    368    344    363    Ljava/io/IOException;
        //  365    368    311    329    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 184, Size: 184
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
    
    dc(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dc(final fp fp) {
        super(fp);
        this.k = -1;
        this.e = -1;
        this.g = fp.getUnknownFields();
    }
    
    dc(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dc(final boolean b) {
        this.k = -1;
        this.e = -1;
        this.g = ce.d();
    }
    
    static int a(final dc dc, final int r) {
        return dc.r = r;
    }
    
    static dN a(final dc dc, final dN j) {
        return dc.j = j;
    }
    
    public static dc a(final cL cl) {
        return (dc)dc.q.a(cl);
    }
    
    public static dc a(final cL cl, final fu fu) {
        return (dc)dc.q.a(cl, fu);
    }
    
    public static dc a(final hv hv) {
        return (dc)dc.q.a(hv);
    }
    
    public static dc a(final hv hv, final fu fu) {
        return (dc)dc.q.a(hv, fu);
    }
    
    public static dc a(final InputStream inputStream) {
        return (dc)dc.q.a(inputStream);
    }
    
    public static dc a(final InputStream inputStream, final fu fu) {
        return (dc)dc.q.b(inputStream, fu);
    }
    
    public static dc a(final byte[] array) {
        return (dc)dc.q.a(array);
    }
    
    public static dc a(final byte[] array, final fu fu) {
        return (dc)dc.q.a(array, fu);
    }
    
    public static gi a(final dc dc) {
        return f().a(dc);
    }
    
    static Object a(final dc dc, final Object i) {
        return dc.i = i;
    }
    
    public static dc b(final InputStream inputStream) {
        return (dc)dc.q.b(inputStream);
    }
    
    public static dc b(final InputStream inputStream, final fu fu) {
        return (dc)dc.q.a(inputStream, fu);
    }
    
    static Object b(final dc dc) {
        return dc.n;
    }
    
    static Object b(final dc dc, final Object n) {
        return dc.n = n;
    }
    
    static Object c(final dc dc) {
        return dc.i;
    }
    
    static Object c(final dc dc, final Object l) {
        return dc.l = l;
    }
    
    public static final bl d() {
        return hM.m();
    }
    
    static Object d(final dc dc) {
        return dc.l;
    }
    
    public static gi f() {
        return gi.f();
    }
    
    public static dc h() {
        return dc.p;
    }
    
    private void i() {
        this.l = "";
        this.i = "";
        this.n = "";
        this.j = dN.h();
    }
    
    public dc a() {
        return dc.p;
    }
    
    protected gi a(final dg dg) {
        return new gi(dg, null);
    }
    
    public hv c() {
        final Object i = this.i;
        if (i instanceof String) {
            return (hv)(this.i = hv.b((String)i));
        }
        return (hv)i;
    }
    
    public gi e() {
        return a(this);
    }
    
    public boolean g() {
        return (0x4 & this.r) == 0x4;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.a();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.a();
    }
    
    @Override
    public du getParserForType() {
        return dc.q;
    }
    
    @Override
    public int getSerializedSize() {
        final int e = this.e;
        if (e != -1) {
            return e;
        }
        final int n = 0x1 & this.r;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.n());
        }
        if ((0x2 & this.r) == 0x2) {
            n2 += ep.b(2, this.c());
        }
        if ((0x4 & this.r) == 0x4) {
            n2 += ep.b(3, this.o());
        }
        if ((0x8 & this.r) == 0x8) {
            n2 += ep.f(4, this.j);
        }
        return this.e = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.g;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.v().a(dc.class, gi.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte k = this.k;
        if (k != -1) {
            return k == 1;
        }
        if (this.p() && !this.t().isInitialized()) {
            this.k = 0;
            return false;
        }
        this.k = 1;
        return true;
    }
    
    public e7 j() {
        return this.j;
    }
    
    public boolean k() {
        return (0x1 & this.r) == 0x1;
    }
    
    public String l() {
        final Object l = this.l;
        if (l instanceof String) {
            return (String)l;
        }
        final hv hv = (hv)l;
        final String i = hv.i();
        if (hv.b()) {
            this.l = i;
        }
        return i;
    }
    
    public gi m() {
        return f();
    }
    
    public hv n() {
        final Object l = this.l;
        if (l instanceof String) {
            return (hv)(this.l = hv.b((String)l));
        }
        return (hv)l;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.m();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.m();
    }
    
    public hv o() {
        final Object n = this.n;
        if (n instanceof String) {
            return (hv)(this.n = hv.b((String)n));
        }
        return (hv)n;
    }
    
    public boolean p() {
        return (0x8 & this.r) == 0x8;
    }
    
    public String q() {
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
    
    public String r() {
        final Object n = this.n;
        if (n instanceof String) {
            return (String)n;
        }
        final hv hv = (hv)n;
        final String i = hv.i();
        if (hv.b()) {
            this.n = i;
        }
        return i;
    }
    
    public boolean s() {
        return (0x2 & this.r) == 0x2;
    }
    
    public dN t() {
        return this.j;
    }
    
    @Override
    public a8 toBuilder() {
        return this.e();
    }
    
    @Override
    public aJ toBuilder() {
        return this.e();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.r) == 0x1) {
            ep.c(1, this.n());
        }
        if ((0x2 & this.r) == 0x2) {
            ep.c(2, this.c());
        }
        if ((0x4 & this.r) == 0x4) {
            ep.c(3, this.o());
        }
        if ((0x8 & this.r) == 0x8) {
            ep.e(4, this.j);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
