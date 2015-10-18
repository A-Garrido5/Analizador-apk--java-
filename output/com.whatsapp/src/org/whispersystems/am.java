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

public final class am extends dS implements k
{
    public static final int e = 3;
    public static du h;
    public static final int j = 2;
    public static final int k = 1;
    private static final am n;
    private static final long serialVersionUID;
    private int f;
    private hv g;
    private final ce i;
    private byte l;
    private int m;
    private hv o;
    private int p;
    
    static {
        am.h = new bZ();
        (n = new am(true)).g();
    }
    
    private am(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        org/whispersystems/am.l:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/am.p:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/am.g:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            174
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 188
        //                8: 108
        //               18: 130
        //               26: 152
        //          default: 84
        //        }
        //    84: aload_0        
        //    85: aload_1        
        //    86: aload           4
        //    88: aload_2        
        //    89: iload           9
        //    91: invokevirtual   org/whispersystems/am.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    94: istore          11
        //    96: iload           11
        //    98: ifne            170
        //   101: iload_3        
        //   102: ifeq            264
        //   105: iconst_1       
        //   106: istore          5
        //   108: aload_0        
        //   109: iconst_1       
        //   110: aload_0        
        //   111: getfield        org/whispersystems/am.f:I
        //   114: ior            
        //   115: putfield        org/whispersystems/am.f:I
        //   118: aload_0        
        //   119: aload_1        
        //   120: invokevirtual   com/google/cL.l:()I
        //   123: putfield        org/whispersystems/am.m:I
        //   126: iload_3        
        //   127: ifeq            170
        //   130: aload_0        
        //   131: iconst_2       
        //   132: aload_0        
        //   133: getfield        org/whispersystems/am.f:I
        //   136: ior            
        //   137: putfield        org/whispersystems/am.f:I
        //   140: aload_0        
        //   141: aload_1        
        //   142: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   145: putfield        org/whispersystems/am.o:Lcom/google/hv;
        //   148: iload_3        
        //   149: ifeq            170
        //   152: aload_0        
        //   153: iconst_4       
        //   154: aload_0        
        //   155: getfield        org/whispersystems/am.f:I
        //   158: ior            
        //   159: putfield        org/whispersystems/am.f:I
        //   162: aload_0        
        //   163: aload_1        
        //   164: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   167: putfield        org/whispersystems/am.g:Lcom/google/hv;
        //   170: iload_3        
        //   171: ifeq            30
        //   174: aload_0        
        //   175: aload           4
        //   177: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   180: putfield        org/whispersystems/am.i:Lcom/google/ce;
        //   183: aload_0        
        //   184: invokevirtual   org/whispersystems/am.c:()V
        //   187: return         
        //   188: iload_3        
        //   189: ifeq            264
        //   192: iconst_1       
        //   193: istore          5
        //   195: goto            84
        //   198: astore          10
        //   200: aload           10
        //   202: athrow         
        //   203: astore          8
        //   205: aload           8
        //   207: aload_0        
        //   208: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   211: athrow         
        //   212: astore          7
        //   214: aload_0        
        //   215: aload           4
        //   217: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   220: putfield        org/whispersystems/am.i:Lcom/google/ce;
        //   223: aload_0        
        //   224: invokevirtual   org/whispersystems/am.c:()V
        //   227: aload           7
        //   229: athrow         
        //   230: astore          12
        //   232: aload           12
        //   234: athrow         
        //   235: astore          13
        //   237: aload           13
        //   239: athrow         
        //   240: astore          14
        //   242: aload           14
        //   244: athrow         
        //   245: astore          6
        //   247: new             Lcom/google/bg;
        //   250: dup            
        //   251: aload           6
        //   253: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   256: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   259: aload_0        
        //   260: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   263: athrow         
        //   264: iconst_1       
        //   265: istore          5
        //   267: goto            170
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     203    212    Lcom/google/bg;
        //  35     41     245    264    Ljava/io/IOException;
        //  35     41     212    230    Any
        //  84     96     198    203    Lcom/google/bg;
        //  84     96     245    264    Ljava/io/IOException;
        //  84     96     212    230    Any
        //  108    126    230    235    Lcom/google/bg;
        //  108    126    245    264    Ljava/io/IOException;
        //  108    126    212    230    Any
        //  130    148    235    240    Lcom/google/bg;
        //  130    148    245    264    Ljava/io/IOException;
        //  130    148    212    230    Any
        //  152    170    240    245    Lcom/google/bg;
        //  152    170    245    264    Ljava/io/IOException;
        //  152    170    212    230    Any
        //  200    203    203    212    Lcom/google/bg;
        //  200    203    245    264    Ljava/io/IOException;
        //  200    203    212    230    Any
        //  205    212    212    230    Any
        //  232    235    235    240    Lcom/google/bg;
        //  232    235    245    264    Ljava/io/IOException;
        //  232    235    212    230    Any
        //  237    240    240    245    Lcom/google/bg;
        //  237    240    245    264    Ljava/io/IOException;
        //  237    240    212    230    Any
        //  242    245    203    212    Lcom/google/bg;
        //  242    245    245    264    Ljava/io/IOException;
        //  242    245    212    230    Any
        //  247    264    212    230    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 122, Size: 122
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
    
    am(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private am(final fp fp) {
        super(fp);
        this.l = -1;
        this.p = -1;
        this.i = fp.getUnknownFields();
    }
    
    am(final fp fp, final j j) {
        this(fp);
    }
    
    private am(final boolean b) {
        this.l = -1;
        this.p = -1;
        this.i = ce.d();
    }
    
    static int a(final am am, final int f) {
        return am.f = f;
    }
    
    static hv a(final am am, final hv o) {
        return am.o = o;
    }
    
    public static am a(final cL cl) {
        return (am)am.h.a(cl);
    }
    
    public static am a(final cL cl, final fu fu) {
        return (am)am.h.a(cl, fu);
    }
    
    public static am a(final hv hv) {
        return (am)am.h.a(hv);
    }
    
    public static am a(final hv hv, final fu fu) {
        return (am)am.h.a(hv, fu);
    }
    
    public static am a(final InputStream inputStream) {
        return (am)am.h.b(inputStream);
    }
    
    public static am a(final InputStream inputStream, final fu fu) {
        return (am)am.h.a(inputStream, fu);
    }
    
    public static am a(final byte[] array) {
        return (am)am.h.a(array);
    }
    
    public static am a(final byte[] array, final fu fu) {
        return (am)am.h.a(array, fu);
    }
    
    public static ap a(final am am) {
        return f().a(am);
    }
    
    static int b(final am am, final int m) {
        return am.m = m;
    }
    
    static hv b(final am am, final hv g) {
        return am.g = g;
    }
    
    public static am b(final InputStream inputStream) {
        return (am)am.h.a(inputStream);
    }
    
    public static am b(final InputStream inputStream, final fu fu) {
        return (am)am.h.b(inputStream, fu);
    }
    
    public static final bl c() {
        return bO.c();
    }
    
    public static ap f() {
        return ap.f();
    }
    
    private void g() {
        this.m = 0;
        this.o = hv.b;
        this.g = hv.b;
    }
    
    public static am k() {
        return am.n;
    }
    
    static boolean m() {
        return am.d;
    }
    
    public hv a() {
        return this.o;
    }
    
    protected ap a(final dg dg) {
        return new ap(dg, null);
    }
    
    public boolean b() {
        return (0x2 & this.f) == 0x2;
    }
    
    public am d() {
        return am.n;
    }
    
    public boolean e() {
        return (0x4 & this.f) == 0x4;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.d();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.d();
    }
    
    @Override
    public du getParserForType() {
        return am.h;
    }
    
    @Override
    public int getSerializedSize() {
        final int p = this.p;
        if (p != -1) {
            return p;
        }
        final int n = 0x1 & this.f;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.m);
        }
        if ((0x2 & this.f) == 0x2) {
            n2 += ep.b(2, this.o);
        }
        if ((0x4 & this.f) == 0x4) {
            n2 += ep.b(3, this.g);
        }
        return this.p = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.i;
    }
    
    public ap h() {
        return a(this);
    }
    
    public hv i() {
        return this.g;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.m().a(am.class, ap.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte l = this.l;
        if (l != -1) {
            return l == 1;
        }
        this.l = 1;
        return true;
    }
    
    public int j() {
        return this.m;
    }
    
    public ap l() {
        return f();
    }
    
    public boolean n() {
        return (0x1 & this.f) == 0x1;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.l();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.l();
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
        this.getSerializedSize();
        if ((0x1 & this.f) == 0x1) {
            ep.a(1, this.m);
        }
        if ((0x2 & this.f) == 0x2) {
            ep.c(2, this.o);
        }
        if ((0x4 & this.f) == 0x4) {
            ep.c(3, this.g);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
