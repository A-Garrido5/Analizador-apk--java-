// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class dB extends dS implements cU
{
    private static final dB f;
    public static final int g = 3;
    public static final int j = 1;
    public static du n;
    public static final int o = 2;
    private static final long serialVersionUID;
    private List e;
    private final ce h;
    private int i;
    private int k;
    private byte l;
    private dh m;
    private Object p;
    
    static {
        dB.n = new hm();
        (f = new dB(true)).b();
    }
    
    private dB(final cL p0, final fu p1) {
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
        //    13: putfield        com/google/dB.l:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/dB.k:I
        //    21: aload_0        
        //    22: invokespecial   com/google/dB.b:()V
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
        //    98: invokevirtual   com/google/dB.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
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
        //   119: getfield        com/google/dB.i:I
        //   122: ior            
        //   123: putfield        com/google/dB.i:I
        //   126: aload_0        
        //   127: aload_1        
        //   128: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   131: putfield        com/google/dB.p:Ljava/lang/Object;
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
        //   155: putfield        com/google/dB.e:Ljava/util/List;
        //   158: iload           6
        //   160: iconst_2       
        //   161: ior            
        //   162: istore          6
        //   164: aload_0        
        //   165: getfield        com/google/dB.e:Ljava/util/List;
        //   168: aload_1        
        //   169: getstatic       com/google/dc.q:Lcom/google/du;
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
        //   192: getfield        com/google/dB.i:I
        //   195: iand           
        //   196: iconst_2       
        //   197: if_icmpne       415
        //   200: aload_0        
        //   201: getfield        com/google/dB.m:Lcom/google/dh;
        //   204: invokevirtual   com/google/dh.f:()Lcom/google/gR;
        //   207: astore          20
        //   209: aload           20
        //   211: astore          17
        //   213: aload_0        
        //   214: aload_1        
        //   215: getstatic       com/google/dh.l:Lcom/google/du;
        //   218: aload_2        
        //   219: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   222: checkcast       Lcom/google/dh;
        //   225: putfield        com/google/dB.m:Lcom/google/dh;
        //   228: aload           17
        //   230: ifnull          252
        //   233: aload           17
        //   235: aload_0        
        //   236: getfield        com/google/dB.m:Lcom/google/dh;
        //   239: invokevirtual   com/google/gR.a:(Lcom/google/dh;)Lcom/google/gR;
        //   242: pop            
        //   243: aload_0        
        //   244: aload           17
        //   246: invokevirtual   com/google/gR.a:()Lcom/google/dh;
        //   249: putfield        com/google/dB.m:Lcom/google/dh;
        //   252: aload_0        
        //   253: iconst_2       
        //   254: aload_0        
        //   255: getfield        com/google/dB.i:I
        //   258: ior            
        //   259: putfield        com/google/dB.i:I
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
        //   280: getfield        com/google/dB.e:Ljava/util/List;
        //   283: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   286: putfield        com/google/dB.e:Ljava/util/List;
        //   289: aload_0        
        //   290: aload           5
        //   292: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   295: putfield        com/google/dB.h:Lcom/google/ce;
        //   298: aload_0        
        //   299: invokevirtual   com/google/dB.c:()V
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
        //   340: getfield        com/google/dB.e:Ljava/util/List;
        //   343: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   346: putfield        com/google/dB.e:Ljava/util/List;
        //   349: aload_0        
        //   350: aload           5
        //   352: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   355: putfield        com/google/dB.h:Lcom/google/ce;
        //   358: aload_0        
        //   359: invokevirtual   com/google/dB.c:()V
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
    
    dB(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dB(final fp fp) {
        super(fp);
        this.l = -1;
        this.k = -1;
        this.h = fp.getUnknownFields();
    }
    
    dB(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dB(final boolean b) {
        this.l = -1;
        this.k = -1;
        this.h = ce.d();
    }
    
    static int a(final dB db, final int i) {
        return db.i = i;
    }
    
    public static dB a(final cL cl) {
        return (dB)dB.n.a(cl);
    }
    
    public static dB a(final cL cl, final fu fu) {
        return (dB)dB.n.a(cl, fu);
    }
    
    public static dB a(final hv hv) {
        return (dB)dB.n.a(hv);
    }
    
    public static dB a(final hv hv, final fu fu) {
        return (dB)dB.n.a(hv, fu);
    }
    
    public static dB a(final InputStream inputStream) {
        return (dB)dB.n.a(inputStream);
    }
    
    public static dB a(final InputStream inputStream, final fu fu) {
        return (dB)dB.n.a(inputStream, fu);
    }
    
    public static dB a(final byte[] array) {
        return (dB)dB.n.a(array);
    }
    
    public static dB a(final byte[] array, final fu fu) {
        return (dB)dB.n.a(array, fu);
    }
    
    static dh a(final dB db, final dh m) {
        return db.m = m;
    }
    
    static Object a(final dB db, final Object p2) {
        return db.p = p2;
    }
    
    static List a(final dB db) {
        return db.e;
    }
    
    static List a(final dB db, final List e) {
        return db.e = e;
    }
    
    public static dB b(final InputStream inputStream) {
        return (dB)dB.n.b(inputStream);
    }
    
    public static dB b(final InputStream inputStream, final fu fu) {
        return (dB)dB.n.b(inputStream, fu);
    }
    
    public static gt b(final dB db) {
        return d().a(db);
    }
    
    private void b() {
        this.p = "";
        this.e = Collections.emptyList();
        this.m = dh.g();
    }
    
    static Object c(final dB db) {
        return db.p;
    }
    
    public static gt d() {
        return gt.n();
    }
    
    public static dB f() {
        return dB.f;
    }
    
    public static final bl j() {
        return hM.i();
    }
    
    public dc a(final int n) {
        return this.e.get(n);
    }
    
    protected gt a(final dg dg) {
        return new gt(dg, null);
    }
    
    public dP b(final int n) {
        return this.e.get(n);
    }
    
    public boolean c() {
        return (0x2 & this.i) == 0x2;
    }
    
    public int e() {
        return this.e.size();
    }
    
    public boolean g() {
        return (0x1 & this.i) == 0x1;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.n();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.n();
    }
    
    @Override
    public du getParserForType() {
        return dB.n;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean b = dt.b;
        final int k = this.k;
        if (k != -1) {
            return k;
        }
        int n;
        if ((0x1 & this.i) == 0x1) {
            n = 0 + ep.b(1, this.q());
        }
        else {
            n = 0;
        }
        int n2 = n;
        while (true) {
            while (i < this.e.size()) {
                int n3 = n2 + ep.f(2, this.e.get(i));
                ++i;
                if (b) {
                    if ((0x2 & this.i) == 0x2) {
                        n3 += ep.f(3, this.m);
                    }
                    return this.k = n3 + this.getUnknownFields().getSerializedSize();
                }
                n2 = n3;
            }
            int n3 = n2;
            continue;
        }
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.h;
    }
    
    public gt h() {
        return b(this);
    }
    
    public gt i() {
        return d();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.b().a(dB.class, gt.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        final byte l = this.l;
        if (l != -1) {
            return l == 1;
        }
        int i = 0;
        while (i < this.e()) {
            if (!this.a(i).isInitialized()) {
                this.l = 0;
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (this.c() && !this.m().isInitialized()) {
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }
    
    public List k() {
        return this.e;
    }
    
    public fY l() {
        return this.m;
    }
    
    public dh m() {
        return this.m;
    }
    
    public dB n() {
        return dB.f;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.i();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.i();
    }
    
    public List o() {
        return this.e;
    }
    
    public String p() {
        final Object p = this.p;
        if (p instanceof String) {
            return (String)p;
        }
        final hv hv = (hv)p;
        final String i = hv.i();
        if (hv.b()) {
            this.p = i;
        }
        return i;
    }
    
    public hv q() {
        final Object p = this.p;
        if (p instanceof String) {
            return (hv)(this.p = hv.b((String)p));
        }
        return (hv)p;
    }
    
    @Override
    public a8 toBuilder() {
        return this.h();
    }
    
    @Override
    public aJ toBuilder() {
        return this.h();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        this.getSerializedSize();
        if ((0x1 & this.i) == 0x1) {
            ep.c(1, this.q());
        }
        int n;
        for (int i = 0; i < this.e.size(); i = n) {
            ep.e(2, (ci)this.e.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        if ((0x2 & this.i) == 0x2) {
            ep.e(3, this.m);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
