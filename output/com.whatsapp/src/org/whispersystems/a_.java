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
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import java.util.List;
import com.google.hv;
import com.google.du;
import com.google.dS;

public final class a_ extends dS implements a
{
    public static final int e = 2;
    public static du g;
    public static final int i = 4;
    public static final int l = 3;
    private static final a_ m;
    public static final int o = 1;
    private static final long serialVersionUID;
    private hv f;
    private List h;
    private int j;
    private byte k;
    private int n;
    private hv p;
    private final ce q;
    private aN r;
    
    static {
        a_.g = new b6();
        (m = new a_(true)).o();
    }
    
    private a_(final cL p0, final fu p1) {
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
        //    13: putfield        org/whispersystems/a_.k:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        org/whispersystems/a_.n:I
        //    21: aload_0        
        //    22: invokespecial   org/whispersystems/a_.o:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            300
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 335
        //               10: 120
        //               18: 143
        //               26: 464
        //               34: 249
        //          default: 96
        //        }
        //    96: aload_0        
        //    97: aload_1        
        //    98: aload           5
        //   100: aload_2        
        //   101: iload           12
        //   103: invokevirtual   org/whispersystems/a_.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   106: istore          21
        //   108: iload           21
        //   110: ifne            295
        //   113: iload           4
        //   115: ifeq            459
        //   118: iconst_1       
        //   119: istore_3       
        //   120: aload_0        
        //   121: iconst_1       
        //   122: aload_0        
        //   123: getfield        org/whispersystems/a_.j:I
        //   126: ior            
        //   127: putfield        org/whispersystems/a_.j:I
        //   130: aload_0        
        //   131: aload_1        
        //   132: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   135: putfield        org/whispersystems/a_.p:Lcom/google/hv;
        //   138: iload           4
        //   140: ifeq            295
        //   143: aload_0        
        //   144: iconst_2       
        //   145: aload_0        
        //   146: getfield        org/whispersystems/a_.j:I
        //   149: ior            
        //   150: putfield        org/whispersystems/a_.j:I
        //   153: aload_0        
        //   154: aload_1        
        //   155: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   158: putfield        org/whispersystems/a_.f:Lcom/google/hv;
        //   161: iload           4
        //   163: ifeq            295
        //   166: iload_3        
        //   167: istore          13
        //   169: iconst_4       
        //   170: aload_0        
        //   171: getfield        org/whispersystems/a_.j:I
        //   174: iand           
        //   175: iconst_4       
        //   176: if_icmpne       453
        //   179: aload_0        
        //   180: getfield        org/whispersystems/a_.r:Lorg/whispersystems/aN;
        //   183: invokevirtual   org/whispersystems/aN.e:()Lorg/whispersystems/bi;
        //   186: astore          19
        //   188: aload           19
        //   190: astore          14
        //   192: aload_0        
        //   193: aload_1        
        //   194: getstatic       org/whispersystems/aN.PARSER:Lcom/google/du;
        //   197: aload_2        
        //   198: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   201: checkcast       Lorg/whispersystems/aN;
        //   204: putfield        org/whispersystems/a_.r:Lorg/whispersystems/aN;
        //   207: aload           14
        //   209: ifnull          231
        //   212: aload           14
        //   214: aload_0        
        //   215: getfield        org/whispersystems/a_.r:Lorg/whispersystems/aN;
        //   218: invokevirtual   org/whispersystems/bi.a:(Lorg/whispersystems/aN;)Lorg/whispersystems/bi;
        //   221: pop            
        //   222: aload_0        
        //   223: aload           14
        //   225: invokevirtual   org/whispersystems/bi.i:()Lorg/whispersystems/aN;
        //   228: putfield        org/whispersystems/a_.r:Lorg/whispersystems/aN;
        //   231: aload_0        
        //   232: iconst_4       
        //   233: aload_0        
        //   234: getfield        org/whispersystems/a_.j:I
        //   237: ior            
        //   238: putfield        org/whispersystems/a_.j:I
        //   241: iload           4
        //   243: ifeq            447
        //   246: iload           13
        //   248: istore_3       
        //   249: iload           6
        //   251: bipush          8
        //   253: iand           
        //   254: bipush          8
        //   256: if_icmpeq       277
        //   259: aload_0        
        //   260: new             Ljava/util/ArrayList;
        //   263: dup            
        //   264: invokespecial   java/util/ArrayList.<init>:()V
        //   267: putfield        org/whispersystems/a_.h:Ljava/util/List;
        //   270: iload           6
        //   272: bipush          8
        //   274: ior            
        //   275: istore          6
        //   277: aload_0        
        //   278: getfield        org/whispersystems/a_.h:Ljava/util/List;
        //   281: aload_1        
        //   282: getstatic       org/whispersystems/ah.PARSER:Lcom/google/du;
        //   285: aload_2        
        //   286: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   289: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   294: pop            
        //   295: iload           4
        //   297: ifeq            33
        //   300: iload           6
        //   302: bipush          8
        //   304: iand           
        //   305: bipush          8
        //   307: if_icmpne       321
        //   310: aload_0        
        //   311: aload_0        
        //   312: getfield        org/whispersystems/a_.h:Ljava/util/List;
        //   315: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   318: putfield        org/whispersystems/a_.h:Ljava/util/List;
        //   321: aload_0        
        //   322: aload           5
        //   324: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   327: putfield        org/whispersystems/a_.q:Lcom/google/ce;
        //   330: aload_0        
        //   331: invokevirtual   org/whispersystems/a_.c:()V
        //   334: return         
        //   335: iload           4
        //   337: ifeq            459
        //   340: iconst_1       
        //   341: istore_3       
        //   342: goto            96
        //   345: astore          20
        //   347: aload           20
        //   349: athrow         
        //   350: astore          11
        //   352: aload           11
        //   354: aload_0        
        //   355: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   358: athrow         
        //   359: astore          9
        //   361: iload           6
        //   363: bipush          8
        //   365: iand           
        //   366: bipush          8
        //   368: if_icmpne       382
        //   371: aload_0        
        //   372: aload_0        
        //   373: getfield        org/whispersystems/a_.h:Ljava/util/List;
        //   376: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   379: putfield        org/whispersystems/a_.h:Ljava/util/List;
        //   382: aload_0        
        //   383: aload           5
        //   385: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   388: putfield        org/whispersystems/a_.q:Lcom/google/ce;
        //   391: aload_0        
        //   392: invokevirtual   org/whispersystems/a_.c:()V
        //   395: aload           9
        //   397: athrow         
        //   398: astore          22
        //   400: aload           22
        //   402: athrow         
        //   403: astore          23
        //   405: aload           23
        //   407: athrow         
        //   408: astore          8
        //   410: new             Lcom/google/bg;
        //   413: dup            
        //   414: aload           8
        //   416: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   419: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   422: aload_0        
        //   423: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   426: athrow         
        //   427: astore          15
        //   429: aload           15
        //   431: athrow         
        //   432: astore          17
        //   434: aload           17
        //   436: athrow         
        //   437: astore          7
        //   439: aload           7
        //   441: athrow         
        //   442: astore          10
        //   444: aload           10
        //   446: athrow         
        //   447: iload           13
        //   449: istore_3       
        //   450: goto            295
        //   453: aconst_null    
        //   454: astore          14
        //   456: goto            192
        //   459: iconst_1       
        //   460: istore_3       
        //   461: goto            295
        //   464: iload_3        
        //   465: istore          13
        //   467: goto            169
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     350    359    Lcom/google/bg;
        //  37     43     408    427    Ljava/io/IOException;
        //  37     43     359    398    Any
        //  96     108    345    350    Lcom/google/bg;
        //  96     108    408    427    Ljava/io/IOException;
        //  96     108    359    398    Any
        //  120    138    398    403    Lcom/google/bg;
        //  120    138    408    427    Ljava/io/IOException;
        //  120    138    359    398    Any
        //  143    161    403    408    Lcom/google/bg;
        //  143    161    408    427    Ljava/io/IOException;
        //  143    161    359    398    Any
        //  169    188    350    359    Lcom/google/bg;
        //  169    188    408    427    Ljava/io/IOException;
        //  169    188    359    398    Any
        //  192    207    427    432    Lcom/google/bg;
        //  192    207    408    427    Ljava/io/IOException;
        //  192    207    359    398    Any
        //  212    231    427    432    Lcom/google/bg;
        //  212    231    408    427    Ljava/io/IOException;
        //  212    231    359    398    Any
        //  231    241    432    437    Lcom/google/bg;
        //  231    241    408    427    Ljava/io/IOException;
        //  231    241    359    398    Any
        //  259    270    350    359    Lcom/google/bg;
        //  259    270    408    427    Ljava/io/IOException;
        //  259    270    359    398    Any
        //  277    295    350    359    Lcom/google/bg;
        //  277    295    408    427    Ljava/io/IOException;
        //  277    295    359    398    Any
        //  310    321    437    442    Lcom/google/bg;
        //  347    350    350    359    Lcom/google/bg;
        //  347    350    408    427    Ljava/io/IOException;
        //  347    350    359    398    Any
        //  352    359    359    398    Any
        //  371    382    442    447    Lcom/google/bg;
        //  400    403    403    408    Lcom/google/bg;
        //  400    403    408    427    Ljava/io/IOException;
        //  400    403    359    398    Any
        //  405    408    350    359    Lcom/google/bg;
        //  405    408    408    427    Ljava/io/IOException;
        //  405    408    359    398    Any
        //  410    427    359    398    Any
        //  429    432    350    359    Lcom/google/bg;
        //  429    432    408    427    Ljava/io/IOException;
        //  429    432    359    398    Any
        //  434    437    350    359    Lcom/google/bg;
        //  434    437    408    427    Ljava/io/IOException;
        //  434    437    359    398    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 216, Size: 216
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    a_(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private a_(final fp fp) {
        super(fp);
        this.k = -1;
        this.n = -1;
        this.q = fp.getUnknownFields();
    }
    
    a_(final fp fp, final j j) {
        this(fp);
    }
    
    private a_(final boolean b) {
        this.k = -1;
        this.n = -1;
        this.q = ce.d();
    }
    
    static int a(final a_ a_, final int j) {
        return a_.j = j;
    }
    
    static hv a(final a_ a_, final hv f) {
        return a_.f = f;
    }
    
    static List a(final a_ a_) {
        return a_.h;
    }
    
    static List a(final a_ a_, final List h) {
        return a_.h = h;
    }
    
    static aN a(final a_ a_, final aN r) {
        return a_.r = r;
    }
    
    public static a_ a(final cL cl) {
        return (a_)a_.g.a(cl);
    }
    
    public static a_ a(final cL cl, final fu fu) {
        return (a_)a_.g.a(cl, fu);
    }
    
    public static a_ a(final hv hv) {
        return (a_)a_.g.a(hv);
    }
    
    public static a_ a(final hv hv, final fu fu) {
        return (a_)a_.g.a(hv, fu);
    }
    
    public static a_ a(final InputStream inputStream) {
        return (a_)a_.g.a(inputStream);
    }
    
    public static a_ a(final InputStream inputStream, final fu fu) {
        return (a_)a_.g.b(inputStream, fu);
    }
    
    public static a_ a(final byte[] array) {
        return (a_)a_.g.a(array);
    }
    
    public static a_ a(final byte[] array, final fu fu) {
        return (a_)a_.g.a(array, fu);
    }
    
    static boolean a() {
        return a_.d;
    }
    
    static hv b(final a_ a_, final hv p2) {
        return a_.p = p2;
    }
    
    public static a_ b(final InputStream inputStream) {
        return (a_)a_.g.b(inputStream);
    }
    
    public static a_ b(final InputStream inputStream, final fu fu) {
        return (a_)a_.g.a(inputStream, fu);
    }
    
    public static bT b(final a_ a_) {
        return s().a(a_);
    }
    
    public static a_ m() {
        return a_.m;
    }
    
    private void o() {
        this.p = hv.b;
        this.f = hv.b;
        this.r = aN.i();
        this.h = Collections.emptyList();
    }
    
    public static final bl q() {
        return bO.a();
    }
    
    static boolean r() {
        return a_.d;
    }
    
    public static bT s() {
        return bT.f();
    }
    
    public ah a(final int n) {
        return this.h.get(n);
    }
    
    protected bT a(final dg dg) {
        return new bT(dg, null);
    }
    
    public List b() {
        return this.h;
    }
    
    public e b(final int n) {
        return this.h.get(n);
    }
    
    public boolean c() {
        return (0x4 & this.j) == 0x4;
    }
    
    public bT d() {
        return b(this);
    }
    
    public aN e() {
        return this.r;
    }
    
    public hv f() {
        return this.p;
    }
    
    public bT g() {
        return s();
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
        return a_.g;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean o = aZ.o;
        final int n = this.n;
        if (n != -1) {
            return n;
        }
        int n2;
        if ((0x1 & this.j) == 0x1) {
            n2 = 0 + ep.b(1, this.p);
        }
        else {
            n2 = 0;
        }
        if ((0x2 & this.j) == 0x2) {
            n2 += ep.b(2, this.f);
        }
        if ((0x4 & this.j) == 0x4) {
            n2 += ep.f(3, this.r);
        }
        int n3 = n2;
        while (i < this.h.size()) {
            final int n4 = n3 + ep.f(4, this.h.get(i));
            ++i;
            if (o) {
                return this.n = n4 + this.getUnknownFields().getSerializedSize();
            }
            n3 = n4;
        }
        final int n4 = n3;
        return this.n = n4 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.q;
    }
    
    public ag h() {
        return this.r;
    }
    
    public int i() {
        return this.h.size();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.r().a(a_.class, bT.class);
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
    
    public hv j() {
        return this.f;
    }
    
    public boolean k() {
        return (0x2 & this.j) == 0x2;
    }
    
    public List l() {
        return this.h;
    }
    
    public boolean n() {
        return (0x1 & this.j) == 0x1;
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
    
    public a_ p() {
        return a_.m;
    }
    
    @Override
    public a8 toBuilder() {
        return this.d();
    }
    
    @Override
    public aJ toBuilder() {
        return this.d();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean o = aZ.o;
        this.getSerializedSize();
        if ((0x1 & this.j) == 0x1) {
            ep.c(1, this.p);
        }
        if ((0x2 & this.j) == 0x2) {
            ep.c(2, this.f);
        }
        if ((0x4 & this.j) == 0x4) {
            ep.e(3, this.r);
        }
        int n;
        for (int i = 0; i < this.h.size(); i = n) {
            ep.e(4, (ci)this.h.get(i));
            n = i + 1;
            if (o) {
                break;
            }
        }
        this.getUnknownFields().writeTo(ep);
    }
}
