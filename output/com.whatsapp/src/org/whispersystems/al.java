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

public final class al extends dS implements f
{
    private static final al e;
    public static du g;
    public static final int h = 1;
    public static final int j = 3;
    public static final int o = 4;
    public static final int p = 2;
    private static final long serialVersionUID;
    private int f;
    private hv i;
    private int k;
    private int l;
    private int m;
    private final ce n;
    private byte q;
    private hv r;
    
    static {
        al.g = new bf();
        (e = new al(true)).e();
    }
    
    private al(final cL p0, final fu p1) {
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
        //    10: putfield        org/whispersystems/al.q:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/al.m:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/al.e:()V
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
        //                8: 116
        //               16: 138
        //               26: 160
        //               34: 182
        //          default: 92
        //        }
        //    92: aload_0        
        //    93: aload_1        
        //    94: aload           4
        //    96: aload_2        
        //    97: iload           9
        //    99: invokevirtual   org/whispersystems/al.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
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
        //   119: getfield        org/whispersystems/al.k:I
        //   122: ior            
        //   123: putfield        org/whispersystems/al.k:I
        //   126: aload_0        
        //   127: aload_1        
        //   128: invokevirtual   com/google/cL.l:()I
        //   131: putfield        org/whispersystems/al.l:I
        //   134: iload_3        
        //   135: ifeq            201
        //   138: aload_0        
        //   139: iconst_2       
        //   140: aload_0        
        //   141: getfield        org/whispersystems/al.k:I
        //   144: ior            
        //   145: putfield        org/whispersystems/al.k:I
        //   148: aload_0        
        //   149: aload_1        
        //   150: invokevirtual   com/google/cL.l:()I
        //   153: putfield        org/whispersystems/al.f:I
        //   156: iload_3        
        //   157: ifeq            201
        //   160: aload_0        
        //   161: iconst_4       
        //   162: aload_0        
        //   163: getfield        org/whispersystems/al.k:I
        //   166: ior            
        //   167: putfield        org/whispersystems/al.k:I
        //   170: aload_0        
        //   171: aload_1        
        //   172: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   175: putfield        org/whispersystems/al.r:Lcom/google/hv;
        //   178: iload_3        
        //   179: ifeq            201
        //   182: aload_0        
        //   183: bipush          8
        //   185: aload_0        
        //   186: getfield        org/whispersystems/al.k:I
        //   189: ior            
        //   190: putfield        org/whispersystems/al.k:I
        //   193: aload_0        
        //   194: aload_1        
        //   195: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   198: putfield        org/whispersystems/al.i:Lcom/google/hv;
        //   201: iload_3        
        //   202: ifeq            30
        //   205: aload_0        
        //   206: aload           4
        //   208: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   211: putfield        org/whispersystems/al.n:Lcom/google/ce;
        //   214: aload_0        
        //   215: invokevirtual   org/whispersystems/al.c:()V
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
        //   251: putfield        org/whispersystems/al.n:Lcom/google/ce;
        //   254: aload_0        
        //   255: invokevirtual   org/whispersystems/al.c:()V
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
    
    al(final cL cl, final fu fu, final U u) {
        this(cl, fu);
    }
    
    private al(final fp fp) {
        super(fp);
        this.q = -1;
        this.m = -1;
        this.n = fp.getUnknownFields();
    }
    
    al(final fp fp, final U u) {
        this(fp);
    }
    
    private al(final boolean b) {
        this.q = -1;
        this.m = -1;
        this.n = ce.d();
    }
    
    static int a(final al al, final int l) {
        return al.l = l;
    }
    
    static hv a(final al al, final hv r) {
        return al.r = r;
    }
    
    public static aE a(final al al) {
        return d().a(al);
    }
    
    public static al a(final cL cl) {
        return (al)al.g.a(cl);
    }
    
    public static al a(final cL cl, final fu fu) {
        return (al)al.g.a(cl, fu);
    }
    
    public static al a(final hv hv) {
        return (al)al.g.a(hv);
    }
    
    public static al a(final hv hv, final fu fu) {
        return (al)al.g.a(hv, fu);
    }
    
    public static al a(final InputStream inputStream) {
        return (al)al.g.b(inputStream);
    }
    
    public static al a(final InputStream inputStream, final fu fu) {
        return (al)al.g.a(inputStream, fu);
    }
    
    public static al a(final byte[] array) {
        return (al)al.g.a(array);
    }
    
    public static al a(final byte[] array, final fu fu) {
        return (al)al.g.a(array, fu);
    }
    
    static int b(final al al, final int f) {
        return al.f = f;
    }
    
    static hv b(final al al, final hv i) {
        return al.i = i;
    }
    
    public static al b(final InputStream inputStream) {
        return (al)al.g.a(inputStream);
    }
    
    public static al b(final InputStream inputStream, final fu fu) {
        return (al)al.g.b(inputStream, fu);
    }
    
    static int c(final al al, final int k) {
        return al.k = k;
    }
    
    public static aE d() {
        return aE.b();
    }
    
    private void e() {
        this.l = 0;
        this.f = 0;
        this.r = hv.b;
        this.i = hv.b;
    }
    
    public static al g() {
        return al.e;
    }
    
    public static final bl l() {
        return bR.f();
    }
    
    static boolean m() {
        return al.d;
    }
    
    protected aE a(final dg dg) {
        return new aE(dg, null);
    }
    
    public boolean a() {
        return (0x1 & this.k) == 0x1;
    }
    
    public aE b() {
        return a(this);
    }
    
    public int c() {
        return this.f;
    }
    
    public boolean f() {
        return (0x4 & this.k) == 0x4;
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
        return al.g;
    }
    
    @Override
    public int getSerializedSize() {
        final int m = this.m;
        if (m != -1) {
            return m;
        }
        final int n = 0x1 & this.k;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.l);
        }
        if ((0x2 & this.k) == 0x2) {
            n2 += ep.b(2, this.f);
        }
        if ((0x4 & this.k) == 0x4) {
            n2 += ep.b(3, this.r);
        }
        if ((0x8 & this.k) == 0x8) {
            n2 += ep.b(4, this.i);
        }
        return this.m = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.n;
    }
    
    public int h() {
        return this.l;
    }
    
    public hv i() {
        return this.i;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bR.i().a(al.class, aE.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte q = this.q;
        if (q != -1) {
            return q == 1;
        }
        this.q = 1;
        return true;
    }
    
    public aE j() {
        return d();
    }
    
    public hv k() {
        return this.r;
    }
    
    public al n() {
        return al.e;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.j();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.j();
    }
    
    public boolean o() {
        return (0x2 & this.k) == 0x2;
    }
    
    public boolean p() {
        return (0x8 & this.k) == 0x8;
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
        if ((0x1 & this.k) == 0x1) {
            ep.a(1, this.l);
        }
        if ((0x2 & this.k) == 0x2) {
            ep.a(2, this.f);
        }
        if ((0x4 & this.k) == 0x4) {
            ep.c(3, this.r);
        }
        if ((0x8 & this.k) == 0x8) {
            ep.c(4, this.i);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
