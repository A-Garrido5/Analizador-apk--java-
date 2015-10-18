// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.aJ;
import com.google.a8;
import com.google.ch;
import com.google.ep;
import com.google.fm;
import com.google.ci;
import com.google.dg;
import com.google.bl;
import java.util.Collections;
import java.io.InputStream;
import com.google.hv;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import java.util.List;
import com.google.ce;
import com.google.du;
import com.google.dS;

public final class af extends dS implements bb
{
    public static final int e = 4;
    public static final int h = 1;
    public static final int j = 2;
    public static du k;
    private static final af o;
    public static final int p = 3;
    private static final long serialVersionUID;
    private aa f;
    private int g;
    private int i;
    private final ce l;
    private byte m;
    private List n;
    private int q;
    private as r;
    
    static {
        af.k = new bh();
        (o = new af(true)).d();
    }
    
    private af(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       org/whispersystems/aZ.o:Z
        //     5: istore          4
        //     7: aload_0        
        //     8: invokespecial   com/google/dS.<init>:()V
        //    11: aload_0        
        //    12: iconst_m1      
        //    13: putfield        org/whispersystems/af.m:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        org/whispersystems/af.g:I
        //    21: aload_0        
        //    22: invokespecial   org/whispersystems/af.d:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            354
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 389
        //                8: 120
        //               18: 530
        //               26: 524
        //               34: 303
        //          default: 96
        //        }
        //    96: aload_0        
        //    97: aload_1        
        //    98: aload           5
        //   100: aload_2        
        //   101: iload           12
        //   103: invokevirtual   org/whispersystems/af.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   106: istore          25
        //   108: iload           25
        //   110: ifne            349
        //   113: iload           4
        //   115: ifeq            519
        //   118: iconst_1       
        //   119: istore_3       
        //   120: aload_0        
        //   121: iconst_1       
        //   122: aload_0        
        //   123: getfield        org/whispersystems/af.i:I
        //   126: ior            
        //   127: putfield        org/whispersystems/af.i:I
        //   130: aload_0        
        //   131: aload_1        
        //   132: invokevirtual   com/google/cL.l:()I
        //   135: putfield        org/whispersystems/af.q:I
        //   138: iload           4
        //   140: ifeq            349
        //   143: iload_3        
        //   144: istore          13
        //   146: iconst_2       
        //   147: aload_0        
        //   148: getfield        org/whispersystems/af.i:I
        //   151: iand           
        //   152: iconst_2       
        //   153: if_icmpne       513
        //   156: aload_0        
        //   157: getfield        org/whispersystems/af.f:Lorg/whispersystems/aa;
        //   160: invokevirtual   org/whispersystems/aa.h:()Lorg/whispersystems/a0;
        //   163: astore          23
        //   165: aload           23
        //   167: astore          14
        //   169: aload_0        
        //   170: aload_1        
        //   171: getstatic       org/whispersystems/aa.PARSER:Lcom/google/du;
        //   174: aload_2        
        //   175: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   178: checkcast       Lorg/whispersystems/aa;
        //   181: putfield        org/whispersystems/af.f:Lorg/whispersystems/aa;
        //   184: aload           14
        //   186: ifnull          208
        //   189: aload           14
        //   191: aload_0        
        //   192: getfield        org/whispersystems/af.f:Lorg/whispersystems/aa;
        //   195: invokevirtual   org/whispersystems/a0.a:(Lorg/whispersystems/aa;)Lorg/whispersystems/a0;
        //   198: pop            
        //   199: aload_0        
        //   200: aload           14
        //   202: invokevirtual   org/whispersystems/a0.a:()Lorg/whispersystems/aa;
        //   205: putfield        org/whispersystems/af.f:Lorg/whispersystems/aa;
        //   208: aload_0        
        //   209: iconst_2       
        //   210: aload_0        
        //   211: getfield        org/whispersystems/af.i:I
        //   214: ior            
        //   215: putfield        org/whispersystems/af.i:I
        //   218: iload           4
        //   220: ifeq            501
        //   223: iconst_4       
        //   224: aload_0        
        //   225: getfield        org/whispersystems/af.i:I
        //   228: iand           
        //   229: iconst_4       
        //   230: if_icmpne       507
        //   233: aload_0        
        //   234: getfield        org/whispersystems/af.r:Lorg/whispersystems/as;
        //   237: invokevirtual   org/whispersystems/as.e:()Lorg/whispersystems/a7;
        //   240: astore          22
        //   242: aload           22
        //   244: astore          17
        //   246: aload_0        
        //   247: aload_1        
        //   248: getstatic       org/whispersystems/as.PARSER:Lcom/google/du;
        //   251: aload_2        
        //   252: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   255: checkcast       Lorg/whispersystems/as;
        //   258: putfield        org/whispersystems/af.r:Lorg/whispersystems/as;
        //   261: aload           17
        //   263: ifnull          285
        //   266: aload           17
        //   268: aload_0        
        //   269: getfield        org/whispersystems/af.r:Lorg/whispersystems/as;
        //   272: invokevirtual   org/whispersystems/a7.a:(Lorg/whispersystems/as;)Lorg/whispersystems/a7;
        //   275: pop            
        //   276: aload_0        
        //   277: aload           17
        //   279: invokevirtual   org/whispersystems/a7.h:()Lorg/whispersystems/as;
        //   282: putfield        org/whispersystems/af.r:Lorg/whispersystems/as;
        //   285: aload_0        
        //   286: iconst_4       
        //   287: aload_0        
        //   288: getfield        org/whispersystems/af.i:I
        //   291: ior            
        //   292: putfield        org/whispersystems/af.i:I
        //   295: iload           4
        //   297: ifeq            501
        //   300: iload           13
        //   302: istore_3       
        //   303: iload           6
        //   305: bipush          8
        //   307: iand           
        //   308: bipush          8
        //   310: if_icmpeq       331
        //   313: aload_0        
        //   314: new             Ljava/util/ArrayList;
        //   317: dup            
        //   318: invokespecial   java/util/ArrayList.<init>:()V
        //   321: putfield        org/whispersystems/af.n:Ljava/util/List;
        //   324: iload           6
        //   326: bipush          8
        //   328: ior            
        //   329: istore          6
        //   331: aload_0        
        //   332: getfield        org/whispersystems/af.n:Ljava/util/List;
        //   335: aload_1        
        //   336: getstatic       org/whispersystems/aF.PARSER:Lcom/google/du;
        //   339: aload_2        
        //   340: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   343: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   348: pop            
        //   349: iload           4
        //   351: ifeq            33
        //   354: iload           6
        //   356: bipush          8
        //   358: iand           
        //   359: bipush          8
        //   361: if_icmpne       375
        //   364: aload_0        
        //   365: aload_0        
        //   366: getfield        org/whispersystems/af.n:Ljava/util/List;
        //   369: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   372: putfield        org/whispersystems/af.n:Ljava/util/List;
        //   375: aload_0        
        //   376: aload           5
        //   378: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   381: putfield        org/whispersystems/af.l:Lcom/google/ce;
        //   384: aload_0        
        //   385: invokevirtual   org/whispersystems/af.c:()V
        //   388: return         
        //   389: iload           4
        //   391: ifeq            519
        //   394: iconst_1       
        //   395: istore_3       
        //   396: goto            96
        //   399: astore          24
        //   401: aload           24
        //   403: athrow         
        //   404: astore          11
        //   406: aload           11
        //   408: aload_0        
        //   409: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   412: athrow         
        //   413: astore          9
        //   415: iload           6
        //   417: bipush          8
        //   419: iand           
        //   420: bipush          8
        //   422: if_icmpne       436
        //   425: aload_0        
        //   426: aload_0        
        //   427: getfield        org/whispersystems/af.n:Ljava/util/List;
        //   430: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   433: putfield        org/whispersystems/af.n:Ljava/util/List;
        //   436: aload_0        
        //   437: aload           5
        //   439: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   442: putfield        org/whispersystems/af.l:Lcom/google/ce;
        //   445: aload_0        
        //   446: invokevirtual   org/whispersystems/af.c:()V
        //   449: aload           9
        //   451: athrow         
        //   452: astore          26
        //   454: aload           26
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
        //   476: astore          15
        //   478: aload           15
        //   480: athrow         
        //   481: astore          18
        //   483: aload           18
        //   485: athrow         
        //   486: astore          20
        //   488: aload           20
        //   490: athrow         
        //   491: astore          7
        //   493: aload           7
        //   495: athrow         
        //   496: astore          10
        //   498: aload           10
        //   500: athrow         
        //   501: iload           13
        //   503: istore_3       
        //   504: goto            349
        //   507: aconst_null    
        //   508: astore          17
        //   510: goto            246
        //   513: aconst_null    
        //   514: astore          14
        //   516: goto            169
        //   519: iconst_1       
        //   520: istore_3       
        //   521: goto            349
        //   524: iload_3        
        //   525: istore          13
        //   527: goto            223
        //   530: iload_3        
        //   531: istore          13
        //   533: goto            146
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     404    413    Lcom/google/bg;
        //  37     43     457    476    Ljava/io/IOException;
        //  37     43     413    452    Any
        //  96     108    399    404    Lcom/google/bg;
        //  96     108    457    476    Ljava/io/IOException;
        //  96     108    413    452    Any
        //  120    138    452    457    Lcom/google/bg;
        //  120    138    457    476    Ljava/io/IOException;
        //  120    138    413    452    Any
        //  146    165    404    413    Lcom/google/bg;
        //  146    165    457    476    Ljava/io/IOException;
        //  146    165    413    452    Any
        //  169    184    476    481    Lcom/google/bg;
        //  169    184    457    476    Ljava/io/IOException;
        //  169    184    413    452    Any
        //  189    208    476    481    Lcom/google/bg;
        //  189    208    457    476    Ljava/io/IOException;
        //  189    208    413    452    Any
        //  208    218    404    413    Lcom/google/bg;
        //  208    218    457    476    Ljava/io/IOException;
        //  208    218    413    452    Any
        //  223    242    404    413    Lcom/google/bg;
        //  223    242    457    476    Ljava/io/IOException;
        //  223    242    413    452    Any
        //  246    261    481    486    Lcom/google/bg;
        //  246    261    457    476    Ljava/io/IOException;
        //  246    261    413    452    Any
        //  266    285    481    486    Lcom/google/bg;
        //  266    285    457    476    Ljava/io/IOException;
        //  266    285    413    452    Any
        //  285    295    486    491    Lcom/google/bg;
        //  285    295    457    476    Ljava/io/IOException;
        //  285    295    413    452    Any
        //  313    324    404    413    Lcom/google/bg;
        //  313    324    457    476    Ljava/io/IOException;
        //  313    324    413    452    Any
        //  331    349    404    413    Lcom/google/bg;
        //  331    349    457    476    Ljava/io/IOException;
        //  331    349    413    452    Any
        //  364    375    491    496    Lcom/google/bg;
        //  401    404    404    413    Lcom/google/bg;
        //  401    404    457    476    Ljava/io/IOException;
        //  401    404    413    452    Any
        //  406    413    413    452    Any
        //  425    436    496    501    Lcom/google/bg;
        //  454    457    404    413    Lcom/google/bg;
        //  454    457    457    476    Ljava/io/IOException;
        //  454    457    413    452    Any
        //  459    476    413    452    Any
        //  478    481    404    413    Lcom/google/bg;
        //  478    481    457    476    Ljava/io/IOException;
        //  478    481    413    452    Any
        //  483    486    404    413    Lcom/google/bg;
        //  483    486    457    476    Ljava/io/IOException;
        //  483    486    413    452    Any
        //  488    491    404    413    Lcom/google/bg;
        //  488    491    457    476    Ljava/io/IOException;
        //  488    491    413    452    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 248, Size: 248
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    af(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private af(final fp fp) {
        super(fp);
        this.m = -1;
        this.g = -1;
        this.l = fp.getUnknownFields();
    }
    
    af(final fp fp, final j j) {
        this(fp);
    }
    
    private af(final boolean b) {
        this.m = -1;
        this.g = -1;
        this.l = ce.d();
    }
    
    static int a(final af af, final int i) {
        return af.i = i;
    }
    
    static List a(final af af, final List n) {
        return af.n = n;
    }
    
    public static aI a(final af af) {
        return i().a(af);
    }
    
    static aa a(final af af, final aa f) {
        return af.f = f;
    }
    
    public static af a(final cL cl) {
        return (af)af.k.a(cl);
    }
    
    public static af a(final cL cl, final fu fu) {
        return (af)af.k.a(cl, fu);
    }
    
    public static af a(final hv hv) {
        return (af)af.k.a(hv);
    }
    
    public static af a(final hv hv, final fu fu) {
        return (af)af.k.a(hv, fu);
    }
    
    public static af a(final InputStream inputStream) {
        return (af)af.k.b(inputStream);
    }
    
    public static af a(final InputStream inputStream, final fu fu) {
        return (af)af.k.a(inputStream, fu);
    }
    
    public static af a(final byte[] array) {
        return (af)af.k.a(array);
    }
    
    public static af a(final byte[] array, final fu fu) {
        return (af)af.k.a(array, fu);
    }
    
    static as a(final af af, final as r) {
        return af.r = r;
    }
    
    static boolean a() {
        return af.d;
    }
    
    static int b(final af af, final int q) {
        return af.q = q;
    }
    
    static List b(final af af) {
        return af.n;
    }
    
    public static af b(final InputStream inputStream) {
        return (af)af.k.a(inputStream);
    }
    
    public static af b(final InputStream inputStream, final fu fu) {
        return (af)af.k.b(inputStream, fu);
    }
    
    private void d() {
        this.q = 0;
        this.f = aa.i();
        this.r = as.f();
        this.n = Collections.emptyList();
    }
    
    public static aI i() {
        return aI.a();
    }
    
    static boolean p() {
        return af.d;
    }
    
    public static final bl r() {
        return bO.A();
    }
    
    public static af s() {
        return af.o;
    }
    
    public aF a(final int n) {
        return this.n.get(n);
    }
    
    protected aI a(final dg dg) {
        return new aI(dg, null);
    }
    
    public int b() {
        return this.q;
    }
    
    public aM b(final int n) {
        return this.n.get(n);
    }
    
    public boolean e() {
        return (0x4 & this.i) == 0x4;
    }
    
    public List f() {
        return this.n;
    }
    
    public aI g() {
        return i();
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
        return af.k;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean o = aZ.o;
        final int g = this.g;
        if (g != -1) {
            return g;
        }
        int n;
        if ((0x1 & this.i) == 0x1) {
            n = 0 + ep.b(1, this.q);
        }
        else {
            n = 0;
        }
        if ((0x2 & this.i) == 0x2) {
            n += ep.f(2, this.f);
        }
        if ((0x4 & this.i) == 0x4) {
            n += ep.f(3, this.r);
        }
        int n2 = n;
        while (i < this.n.size()) {
            final int n3 = n2 + ep.f(4, this.n.get(i));
            ++i;
            if (o) {
                return this.g = n3 + this.getUnknownFields().getSerializedSize();
            }
            n2 = n3;
        }
        final int n3 = n2;
        return this.g = n3 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.l;
    }
    
    public int h() {
        return this.n.size();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.t().a(af.class, aI.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte m = this.m;
        if (m != -1) {
            return m == 1;
        }
        this.m = 1;
        return true;
    }
    
    public aI j() {
        return a(this);
    }
    
    public as k() {
        return this.r;
    }
    
    public boolean l() {
        return (0x1 & this.i) == 0x1;
    }
    
    public boolean m() {
        return (0x2 & this.i) == 0x2;
    }
    
    public af n() {
        return af.o;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.g();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.g();
    }
    
    public aw o() {
        return this.f;
    }
    
    public L q() {
        return this.r;
    }
    
    public aa t() {
        return this.f;
    }
    
    @Override
    public a8 toBuilder() {
        return this.j();
    }
    
    @Override
    public aJ toBuilder() {
        return this.j();
    }
    
    public List u() {
        return this.n;
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean o = aZ.o;
        this.getSerializedSize();
        if ((0x1 & this.i) == 0x1) {
            ep.a(1, this.q);
        }
        if ((0x2 & this.i) == 0x2) {
            ep.e(2, this.f);
        }
        if ((0x4 & this.i) == 0x4) {
            ep.e(3, this.r);
        }
        int n;
        for (int i = 0; i < this.n.size(); i = n) {
            ep.e(4, (ci)this.n.get(i));
            n = i + 1;
            if (o) {
                break;
            }
        }
        this.getUnknownFields().writeTo(ep);
    }
}
