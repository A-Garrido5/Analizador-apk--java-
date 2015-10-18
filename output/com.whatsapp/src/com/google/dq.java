// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class dq extends dS implements q
{
    public static du e;
    public static final int f = 1;
    public static final int k = 3;
    private static final dq o;
    public static final int p = 2;
    private static final long serialVersionUID;
    private byte g;
    private List h;
    private int i;
    private int j;
    private da l;
    private final ce m;
    private Object n;
    
    static {
        dq.e = new h4();
        (o = new dq(true)).d();
    }
    
    private dq(final cL p0, final fu p1) {
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
        //    13: putfield        com/google/dq.g:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/dq.i:I
        //    21: aload_0        
        //    22: invokespecial   com/google/dq.d:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            270
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 303
        //               10: 433
        //               18: 427
        //               26: 190
        //          default: 88
        //        }
        //    88: iload_3        
        //    89: istore          13
        //    91: aload_0        
        //    92: aload_1        
        //    93: aload           5
        //    95: aload_2        
        //    96: iload           12
        //    98: invokevirtual   com/google/dq.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   101: istore          22
        //   103: iload           22
        //   105: ifne            265
        //   108: iload           4
        //   110: ifeq            421
        //   113: iconst_1       
        //   114: istore          13
        //   116: aload_0        
        //   117: iconst_1       
        //   118: aload_0        
        //   119: getfield        com/google/dq.j:I
        //   122: ior            
        //   123: putfield        com/google/dq.j:I
        //   126: aload_0        
        //   127: aload_1        
        //   128: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   131: putfield        com/google/dq.n:Ljava/lang/Object;
        //   134: iload           4
        //   136: ifeq            265
        //   139: iload           6
        //   141: iconst_2       
        //   142: iand           
        //   143: iconst_2       
        //   144: if_icmpeq       164
        //   147: aload_0        
        //   148: new             Ljava/util/ArrayList;
        //   151: dup            
        //   152: invokespecial   java/util/ArrayList.<init>:()V
        //   155: putfield        com/google/dq.h:Ljava/util/List;
        //   158: iload           6
        //   160: iconst_2       
        //   161: ior            
        //   162: istore          6
        //   164: aload_0        
        //   165: getfield        com/google/dq.h:Ljava/util/List;
        //   168: aload_1        
        //   169: getstatic       com/google/dW.l:Lcom/google/du;
        //   172: aload_2        
        //   173: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   176: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   181: pop            
        //   182: iload           4
        //   184: ifeq            265
        //   187: iload           13
        //   189: istore_3       
        //   190: iconst_2       
        //   191: aload_0        
        //   192: getfield        com/google/dq.j:I
        //   195: iand           
        //   196: iconst_2       
        //   197: if_icmpne       415
        //   200: aload_0        
        //   201: getfield        com/google/dq.l:Lcom/google/da;
        //   204: invokevirtual   com/google/da.m:()Lcom/google/gW;
        //   207: astore          20
        //   209: aload           20
        //   211: astore          17
        //   213: aload_0        
        //   214: aload_1        
        //   215: getstatic       com/google/da.l:Lcom/google/du;
        //   218: aload_2        
        //   219: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   222: checkcast       Lcom/google/da;
        //   225: putfield        com/google/dq.l:Lcom/google/da;
        //   228: aload           17
        //   230: ifnull          252
        //   233: aload           17
        //   235: aload_0        
        //   236: getfield        com/google/dq.l:Lcom/google/da;
        //   239: invokevirtual   com/google/gW.a:(Lcom/google/da;)Lcom/google/gW;
        //   242: pop            
        //   243: aload_0        
        //   244: aload           17
        //   246: invokevirtual   com/google/gW.f:()Lcom/google/da;
        //   249: putfield        com/google/dq.l:Lcom/google/da;
        //   252: aload_0        
        //   253: iconst_2       
        //   254: aload_0        
        //   255: getfield        com/google/dq.j:I
        //   258: ior            
        //   259: putfield        com/google/dq.j:I
        //   262: iload_3        
        //   263: istore          13
        //   265: iload           4
        //   267: ifeq            409
        //   270: iload           6
        //   272: iconst_2       
        //   273: iand           
        //   274: iconst_2       
        //   275: if_icmpne       289
        //   278: aload_0        
        //   279: aload_0        
        //   280: getfield        com/google/dq.h:Ljava/util/List;
        //   283: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   286: putfield        com/google/dq.h:Ljava/util/List;
        //   289: aload_0        
        //   290: aload           5
        //   292: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   295: putfield        com/google/dq.m:Lcom/google/ce;
        //   298: aload_0        
        //   299: invokevirtual   com/google/dq.c:()V
        //   302: return         
        //   303: iload           4
        //   305: ifeq            421
        //   308: iconst_1       
        //   309: istore          13
        //   311: goto            91
        //   314: astore          21
        //   316: aload           21
        //   318: athrow         
        //   319: astore          11
        //   321: aload           11
        //   323: aload_0        
        //   324: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   327: athrow         
        //   328: astore          9
        //   330: iload           6
        //   332: iconst_2       
        //   333: iand           
        //   334: iconst_2       
        //   335: if_icmpne       349
        //   338: aload_0        
        //   339: aload_0        
        //   340: getfield        com/google/dq.h:Ljava/util/List;
        //   343: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   346: putfield        com/google/dq.h:Ljava/util/List;
        //   349: aload_0        
        //   350: aload           5
        //   352: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   355: putfield        com/google/dq.m:Lcom/google/ce;
        //   358: aload_0        
        //   359: invokevirtual   com/google/dq.c:()V
        //   362: aload           9
        //   364: athrow         
        //   365: astore          14
        //   367: aload           14
        //   369: athrow         
        //   370: astore          15
        //   372: aload           15
        //   374: athrow         
        //   375: astore          8
        //   377: new             Lcom/google/bg;
        //   380: dup            
        //   381: aload           8
        //   383: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   386: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   389: aload_0        
        //   390: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   393: athrow         
        //   394: astore          18
        //   396: aload           18
        //   398: athrow         
        //   399: astore          10
        //   401: aload           10
        //   403: athrow         
        //   404: astore          7
        //   406: aload           7
        //   408: athrow         
        //   409: iload           13
        //   411: istore_3       
        //   412: goto            33
        //   415: aconst_null    
        //   416: astore          17
        //   418: goto            213
        //   421: iconst_1       
        //   422: istore          13
        //   424: goto            265
        //   427: iload_3        
        //   428: istore          13
        //   430: goto            139
        //   433: iload_3        
        //   434: istore          13
        //   436: goto            116
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     319    328    Lcom/google/bg;
        //  37     43     375    394    Ljava/io/IOException;
        //  37     43     328    365    Any
        //  91     103    314    319    Lcom/google/bg;
        //  91     103    375    394    Ljava/io/IOException;
        //  91     103    328    365    Any
        //  116    134    365    375    Lcom/google/bg;
        //  116    134    375    394    Ljava/io/IOException;
        //  116    134    328    365    Any
        //  147    158    319    328    Lcom/google/bg;
        //  147    158    375    394    Ljava/io/IOException;
        //  147    158    328    365    Any
        //  164    182    319    328    Lcom/google/bg;
        //  164    182    375    394    Ljava/io/IOException;
        //  164    182    328    365    Any
        //  190    209    319    328    Lcom/google/bg;
        //  190    209    375    394    Ljava/io/IOException;
        //  190    209    328    365    Any
        //  213    228    394    399    Lcom/google/bg;
        //  213    228    375    394    Ljava/io/IOException;
        //  213    228    328    365    Any
        //  233    252    394    399    Lcom/google/bg;
        //  233    252    375    394    Ljava/io/IOException;
        //  233    252    328    365    Any
        //  252    262    319    328    Lcom/google/bg;
        //  252    262    375    394    Ljava/io/IOException;
        //  252    262    328    365    Any
        //  278    289    404    409    Lcom/google/bg;
        //  316    319    319    328    Lcom/google/bg;
        //  316    319    375    394    Ljava/io/IOException;
        //  316    319    328    365    Any
        //  321    328    328    365    Any
        //  338    349    399    404    Lcom/google/bg;
        //  367    370    370    375    Lcom/google/bg;
        //  367    370    375    394    Ljava/io/IOException;
        //  367    370    328    365    Any
        //  372    375    319    328    Lcom/google/bg;
        //  372    375    375    394    Ljava/io/IOException;
        //  372    375    328    365    Any
        //  377    394    328    365    Any
        //  396    399    319    328    Lcom/google/bg;
        //  396    399    375    394    Ljava/io/IOException;
        //  396    399    328    365    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 206, Size: 206
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
    
    dq(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dq(final fp fp) {
        super(fp);
        this.g = -1;
        this.i = -1;
        this.m = fp.getUnknownFields();
    }
    
    dq(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dq(final boolean b) {
        this.g = -1;
        this.i = -1;
        this.m = ce.d();
    }
    
    static int a(final dq dq, final int j) {
        return dq.j = j;
    }
    
    static da a(final dq dq, final da l) {
        return dq.l = l;
    }
    
    public static dq a(final cL cl) {
        return (dq)dq.e.a(cl);
    }
    
    public static dq a(final cL cl, final fu fu) {
        return (dq)dq.e.a(cl, fu);
    }
    
    public static dq a(final hv hv) {
        return (dq)dq.e.a(hv);
    }
    
    public static dq a(final hv hv, final fu fu) {
        return (dq)dq.e.a(hv, fu);
    }
    
    public static dq a(final InputStream inputStream) {
        return (dq)dq.e.a(inputStream);
    }
    
    public static dq a(final InputStream inputStream, final fu fu) {
        return (dq)dq.e.b(inputStream, fu);
    }
    
    public static dq a(final byte[] array) {
        return (dq)dq.e.a(array);
    }
    
    public static dq a(final byte[] array, final fu fu) {
        return (dq)dq.e.a(array, fu);
    }
    
    static Object a(final dq dq) {
        return dq.n;
    }
    
    static Object a(final dq dq, final Object n) {
        return dq.n = n;
    }
    
    static List a(final dq dq, final List h) {
        return dq.h = h;
    }
    
    public static dq b(final InputStream inputStream) {
        return (dq)dq.e.b(inputStream);
    }
    
    public static dq b(final InputStream inputStream, final fu fu) {
        return (dq)dq.e.a(inputStream, fu);
    }
    
    public static fI b(final dq dq) {
        return k().a(dq);
    }
    
    static List c(final dq dq) {
        return dq.h;
    }
    
    private void d() {
        this.n = "";
        this.h = Collections.emptyList();
        this.l = da.j();
    }
    
    public static dq i() {
        return dq.o;
    }
    
    public static fI k() {
        return fI.f();
    }
    
    public static final bl p() {
        return hM.p();
    }
    
    public dW a(final int n) {
        return this.h.get(n);
    }
    
    protected fI a(final dg dg) {
        return new fI(dg, null);
    }
    
    public String a() {
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
    
    public g7 b(final int n) {
        return this.h.get(n);
    }
    
    public List b() {
        return this.h;
    }
    
    public boolean e() {
        return (0x2 & this.j) == 0x2;
    }
    
    public int f() {
        return this.h.size();
    }
    
    public hv g() {
        final Object n = this.n;
        if (n instanceof String) {
            return (hv)(this.n = hv.b((String)n));
        }
        return (hv)n;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.o();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.o();
    }
    
    @Override
    public du getParserForType() {
        return dq.e;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean b = dt.b;
        final int j = this.i;
        if (j != -1) {
            return j;
        }
        int n;
        if ((0x1 & this.j) == 0x1) {
            n = 0 + ep.b(1, this.g());
        }
        else {
            n = 0;
        }
        int n2 = n;
        while (true) {
            while (i < this.h.size()) {
                int n3 = n2 + ep.f(2, this.h.get(i));
                ++i;
                if (b) {
                    if ((0x2 & this.j) == 0x2) {
                        n3 += ep.f(3, this.l);
                    }
                    return this.i = n3 + this.getUnknownFields().getSerializedSize();
                }
                n2 = n3;
            }
            int n3 = n2;
            continue;
        }
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.m;
    }
    
    public fI h() {
        return k();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.c().a(dq.class, fI.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        final byte g = this.g;
        if (g != -1) {
            return g == 1;
        }
        int i = 0;
        while (i < this.f()) {
            if (!this.a(i).isInitialized()) {
                this.g = 0;
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (this.e() && !this.m().isInitialized()) {
            this.g = 0;
            return false;
        }
        this.g = 1;
        return true;
    }
    
    public List j() {
        return this.h;
    }
    
    public ho l() {
        return this.l;
    }
    
    public da m() {
        return this.l;
    }
    
    public fI n() {
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
    
    public dq o() {
        return dq.o;
    }
    
    public boolean q() {
        return (0x1 & this.j) == 0x1;
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
        final boolean b = dt.b;
        this.getSerializedSize();
        if ((0x1 & this.j) == 0x1) {
            ep.c(1, this.g());
        }
        int n;
        for (int i = 0; i < this.h.size(); i = n) {
            ep.e(2, (ci)this.h.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        if ((0x2 & this.j) == 0x2) {
            ep.e(3, this.l);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
