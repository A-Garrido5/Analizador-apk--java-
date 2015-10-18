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
import java.io.InputStream;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import com.google.hv;
import com.google.du;
import com.google.dS;

public final class aB extends dS implements h
{
    public static du g;
    public static final int l = 1;
    public static final int m = 4;
    public static final int n = 3;
    private static final aB p;
    public static final int r = 2;
    private static final long serialVersionUID;
    private hv e;
    private int f;
    private int h;
    private int i;
    private hv j;
    private byte k;
    private final ce o;
    private int q;
    
    static {
        aB.g = new bF();
        (p = new aB(true)).p();
    }
    
    private aB(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/bR.h:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        org/whispersystems/aB.k:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/aB.i:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/aB.p:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            205
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 219
        //               10: 116
        //               16: 138
        //               24: 160
        //               34: 182
        //          default: 92
        //        }
        //    92: aload_0        
        //    93: aload_1        
        //    94: aload           4
        //    96: aload_2        
        //    97: iload           9
        //    99: invokevirtual   org/whispersystems/aB.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   102: istore          11
        //   104: iload           11
        //   106: ifne            201
        //   109: iload_3        
        //   110: ifeq            300
        //   113: iconst_1       
        //   114: istore          5
        //   116: aload_0        
        //   117: iconst_1       
        //   118: aload_0        
        //   119: getfield        org/whispersystems/aB.f:I
        //   122: ior            
        //   123: putfield        org/whispersystems/aB.f:I
        //   126: aload_0        
        //   127: aload_1        
        //   128: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   131: putfield        org/whispersystems/aB.e:Lcom/google/hv;
        //   134: iload_3        
        //   135: ifeq            201
        //   138: aload_0        
        //   139: iconst_2       
        //   140: aload_0        
        //   141: getfield        org/whispersystems/aB.f:I
        //   144: ior            
        //   145: putfield        org/whispersystems/aB.f:I
        //   148: aload_0        
        //   149: aload_1        
        //   150: invokevirtual   com/google/cL.l:()I
        //   153: putfield        org/whispersystems/aB.q:I
        //   156: iload_3        
        //   157: ifeq            201
        //   160: aload_0        
        //   161: iconst_4       
        //   162: aload_0        
        //   163: getfield        org/whispersystems/aB.f:I
        //   166: ior            
        //   167: putfield        org/whispersystems/aB.f:I
        //   170: aload_0        
        //   171: aload_1        
        //   172: invokevirtual   com/google/cL.l:()I
        //   175: putfield        org/whispersystems/aB.h:I
        //   178: iload_3        
        //   179: ifeq            201
        //   182: aload_0        
        //   183: bipush          8
        //   185: aload_0        
        //   186: getfield        org/whispersystems/aB.f:I
        //   189: ior            
        //   190: putfield        org/whispersystems/aB.f:I
        //   193: aload_0        
        //   194: aload_1        
        //   195: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   198: putfield        org/whispersystems/aB.j:Lcom/google/hv;
        //   201: iload_3        
        //   202: ifeq            30
        //   205: aload_0        
        //   206: aload           4
        //   208: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   211: putfield        org/whispersystems/aB.o:Lcom/google/ce;
        //   214: aload_0        
        //   215: invokevirtual   org/whispersystems/aB.c:()V
        //   218: return         
        //   219: iload_3        
        //   220: ifeq            300
        //   223: iconst_1       
        //   224: istore          5
        //   226: goto            92
        //   229: astore          10
        //   231: aload           10
        //   233: athrow         
        //   234: astore          8
        //   236: aload           8
        //   238: aload_0        
        //   239: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   242: athrow         
        //   243: astore          7
        //   245: aload_0        
        //   246: aload           4
        //   248: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   251: putfield        org/whispersystems/aB.o:Lcom/google/ce;
        //   254: aload_0        
        //   255: invokevirtual   org/whispersystems/aB.c:()V
        //   258: aload           7
        //   260: athrow         
        //   261: astore          12
        //   263: aload           12
        //   265: athrow         
        //   266: astore          13
        //   268: aload           13
        //   270: athrow         
        //   271: astore          14
        //   273: aload           14
        //   275: athrow         
        //   276: astore          15
        //   278: aload           15
        //   280: athrow         
        //   281: astore          6
        //   283: new             Lcom/google/bg;
        //   286: dup            
        //   287: aload           6
        //   289: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   292: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   295: aload_0        
        //   296: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   299: athrow         
        //   300: iconst_1       
        //   301: istore          5
        //   303: goto            201
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     234    243    Lcom/google/bg;
        //  35     41     281    300    Ljava/io/IOException;
        //  35     41     243    261    Any
        //  92     104    229    234    Lcom/google/bg;
        //  92     104    281    300    Ljava/io/IOException;
        //  92     104    243    261    Any
        //  116    134    261    266    Lcom/google/bg;
        //  116    134    281    300    Ljava/io/IOException;
        //  116    134    243    261    Any
        //  138    156    266    271    Lcom/google/bg;
        //  138    156    281    300    Ljava/io/IOException;
        //  138    156    243    261    Any
        //  160    178    271    276    Lcom/google/bg;
        //  160    178    281    300    Ljava/io/IOException;
        //  160    178    243    261    Any
        //  182    201    276    281    Lcom/google/bg;
        //  182    201    281    300    Ljava/io/IOException;
        //  182    201    243    261    Any
        //  231    234    234    243    Lcom/google/bg;
        //  231    234    281    300    Ljava/io/IOException;
        //  231    234    243    261    Any
        //  236    243    243    261    Any
        //  263    266    266    271    Lcom/google/bg;
        //  263    266    281    300    Ljava/io/IOException;
        //  263    266    243    261    Any
        //  268    271    271    276    Lcom/google/bg;
        //  268    271    281    300    Ljava/io/IOException;
        //  268    271    243    261    Any
        //  273    276    276    281    Lcom/google/bg;
        //  273    276    281    300    Ljava/io/IOException;
        //  273    276    243    261    Any
        //  278    281    234    243    Lcom/google/bg;
        //  278    281    281    300    Ljava/io/IOException;
        //  278    281    243    261    Any
        //  283    300    243    261    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 137, Size: 137
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
    
    aB(final cL cl, final fu fu, final U u) {
        this(cl, fu);
    }
    
    private aB(final fp fp) {
        super(fp);
        this.k = -1;
        this.i = -1;
        this.o = fp.getUnknownFields();
    }
    
    aB(final fp fp, final U u) {
        this(fp);
    }
    
    private aB(final boolean b) {
        this.k = -1;
        this.i = -1;
        this.o = ce.d();
    }
    
    static int a(final aB ab, final int q) {
        return ab.q = q;
    }
    
    static hv a(final aB ab, final hv j) {
        return ab.j = j;
    }
    
    public static aB a(final cL cl) {
        return (aB)aB.g.a(cl);
    }
    
    public static aB a(final cL cl, final fu fu) {
        return (aB)aB.g.a(cl, fu);
    }
    
    public static aB a(final hv hv) {
        return (aB)aB.g.a(hv);
    }
    
    public static aB a(final hv hv, final fu fu) {
        return (aB)aB.g.a(hv, fu);
    }
    
    public static aB a(final InputStream inputStream) {
        return (aB)aB.g.a(inputStream);
    }
    
    public static aB a(final InputStream inputStream, final fu fu) {
        return (aB)aB.g.a(inputStream, fu);
    }
    
    public static aB a(final byte[] array) {
        return (aB)aB.g.a(array);
    }
    
    public static aB a(final byte[] array, final fu fu) {
        return (aB)aB.g.a(array, fu);
    }
    
    public static ad a(final aB ab) {
        return o().a(ab);
    }
    
    static int b(final aB ab, final int h) {
        return ab.h = h;
    }
    
    static hv b(final aB ab, final hv e) {
        return ab.e = e;
    }
    
    public static aB b(final InputStream inputStream) {
        return (aB)aB.g.b(inputStream);
    }
    
    public static aB b(final InputStream inputStream, final fu fu) {
        return (aB)aB.g.b(inputStream, fu);
    }
    
    static int c(final aB ab, final int f) {
        return ab.f = f;
    }
    
    static boolean e() {
        return aB.d;
    }
    
    public static aB h() {
        return aB.p;
    }
    
    public static final bl j() {
        return bR.d();
    }
    
    public static ad o() {
        return ad.g();
    }
    
    private void p() {
        this.e = hv.b;
        this.q = 0;
        this.h = 0;
        this.j = hv.b;
    }
    
    protected ad a(final dg dg) {
        return new ad(dg, null);
    }
    
    public boolean a() {
        return (0x4 & this.f) == 0x4;
    }
    
    public hv c() {
        return this.j;
    }
    
    public boolean d() {
        return (0x2 & this.f) == 0x2;
    }
    
    public hv f() {
        return this.e;
    }
    
    public ad g() {
        return o();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.l();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.l();
    }
    
    @Override
    public du getParserForType() {
        return aB.g;
    }
    
    @Override
    public int getSerializedSize() {
        final int i = this.i;
        if (i != -1) {
            return i;
        }
        final int n = 0x1 & this.f;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.e);
        }
        if ((0x2 & this.f) == 0x2) {
            n2 += ep.b(2, this.q);
        }
        if ((0x4 & this.f) == 0x4) {
            n2 += ep.b(3, this.h);
        }
        if ((0x8 & this.f) == 0x8) {
            n2 += ep.b(4, this.j);
        }
        return this.i = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.o;
    }
    
    public int i() {
        return this.h;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bR.b().a(aB.class, ad.class);
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
    
    public ad k() {
        return a(this);
    }
    
    public aB l() {
        return aB.p;
    }
    
    public boolean m() {
        return (0x1 & this.f) == 0x1;
    }
    
    public boolean n() {
        return (0x8 & this.f) == 0x8;
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
    
    public int q() {
        return this.q;
    }
    
    @Override
    public a8 toBuilder() {
        return this.k();
    }
    
    @Override
    public aJ toBuilder() {
        return this.k();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.f) == 0x1) {
            ep.c(1, this.e);
        }
        if ((0x2 & this.f) == 0x2) {
            ep.a(2, this.q);
        }
        if ((0x4 & this.f) == 0x4) {
            ep.a(3, this.h);
        }
        if ((0x8 & this.f) == 0x8) {
            ep.c(4, this.j);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
