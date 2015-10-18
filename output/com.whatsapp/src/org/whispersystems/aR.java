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

public final class aR extends dS implements bc
{
    public static final int h = 2;
    private static final aR i;
    public static final int l = 1;
    public static du m;
    private static final long serialVersionUID;
    private hv e;
    private byte f;
    private int g;
    private final ce j;
    private hv k;
    private int n;
    
    static {
        aR.m = new bs();
        (i = new aR(true)).b();
    }
    
    private aR(final cL p0, final fu p1) {
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
        //    10: putfield        org/whispersystems/aR.f:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/aR.g:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/aR.b:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            144
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 158
        //               10: 100
        //               18: 122
        //          default: 76
        //        }
        //    76: aload_0        
        //    77: aload_1        
        //    78: aload           4
        //    80: aload_2        
        //    81: iload           9
        //    83: invokevirtual   org/whispersystems/aR.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    86: istore          11
        //    88: iload           11
        //    90: ifne            140
        //    93: iload_3        
        //    94: ifeq            229
        //    97: iconst_1       
        //    98: istore          5
        //   100: aload_0        
        //   101: iconst_1       
        //   102: aload_0        
        //   103: getfield        org/whispersystems/aR.n:I
        //   106: ior            
        //   107: putfield        org/whispersystems/aR.n:I
        //   110: aload_0        
        //   111: aload_1        
        //   112: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   115: putfield        org/whispersystems/aR.e:Lcom/google/hv;
        //   118: iload_3        
        //   119: ifeq            140
        //   122: aload_0        
        //   123: iconst_2       
        //   124: aload_0        
        //   125: getfield        org/whispersystems/aR.n:I
        //   128: ior            
        //   129: putfield        org/whispersystems/aR.n:I
        //   132: aload_0        
        //   133: aload_1        
        //   134: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   137: putfield        org/whispersystems/aR.k:Lcom/google/hv;
        //   140: iload_3        
        //   141: ifeq            30
        //   144: aload_0        
        //   145: aload           4
        //   147: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   150: putfield        org/whispersystems/aR.j:Lcom/google/ce;
        //   153: aload_0        
        //   154: invokevirtual   org/whispersystems/aR.c:()V
        //   157: return         
        //   158: iload_3        
        //   159: ifeq            229
        //   162: iconst_1       
        //   163: istore          5
        //   165: goto            76
        //   168: astore          10
        //   170: aload           10
        //   172: athrow         
        //   173: astore          8
        //   175: aload           8
        //   177: aload_0        
        //   178: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   181: athrow         
        //   182: astore          7
        //   184: aload_0        
        //   185: aload           4
        //   187: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   190: putfield        org/whispersystems/aR.j:Lcom/google/ce;
        //   193: aload_0        
        //   194: invokevirtual   org/whispersystems/aR.c:()V
        //   197: aload           7
        //   199: athrow         
        //   200: astore          12
        //   202: aload           12
        //   204: athrow         
        //   205: astore          13
        //   207: aload           13
        //   209: athrow         
        //   210: astore          6
        //   212: new             Lcom/google/bg;
        //   215: dup            
        //   216: aload           6
        //   218: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   221: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   224: aload_0        
        //   225: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   228: athrow         
        //   229: iconst_1       
        //   230: istore          5
        //   232: goto            140
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     173    182    Lcom/google/bg;
        //  35     41     210    229    Ljava/io/IOException;
        //  35     41     182    200    Any
        //  76     88     168    173    Lcom/google/bg;
        //  76     88     210    229    Ljava/io/IOException;
        //  76     88     182    200    Any
        //  100    118    200    205    Lcom/google/bg;
        //  100    118    210    229    Ljava/io/IOException;
        //  100    118    182    200    Any
        //  122    140    205    210    Lcom/google/bg;
        //  122    140    210    229    Ljava/io/IOException;
        //  122    140    182    200    Any
        //  170    173    173    182    Lcom/google/bg;
        //  170    173    210    229    Ljava/io/IOException;
        //  170    173    182    200    Any
        //  175    182    182    200    Any
        //  202    205    205    210    Lcom/google/bg;
        //  202    205    210    229    Ljava/io/IOException;
        //  202    205    182    200    Any
        //  207    210    173    182    Lcom/google/bg;
        //  207    210    210    229    Ljava/io/IOException;
        //  207    210    182    200    Any
        //  212    229    182    200    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 107, Size: 107
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
    
    aR(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private aR(final fp fp) {
        super(fp);
        this.f = -1;
        this.g = -1;
        this.j = fp.getUnknownFields();
    }
    
    aR(final fp fp, final j j) {
        this(fp);
    }
    
    private aR(final boolean b) {
        this.f = -1;
        this.g = -1;
        this.j = ce.d();
    }
    
    static int a(final aR ar, final int n) {
        return ar.n = n;
    }
    
    static hv a(final aR ar, final hv k) {
        return ar.k = k;
    }
    
    public static a1 a() {
        return a1.g();
    }
    
    public static a1 a(final aR ar) {
        return a().a(ar);
    }
    
    public static aR a(final cL cl) {
        return (aR)aR.m.a(cl);
    }
    
    public static aR a(final cL cl, final fu fu) {
        return (aR)aR.m.a(cl, fu);
    }
    
    public static aR a(final hv hv) {
        return (aR)aR.m.a(hv);
    }
    
    public static aR a(final hv hv, final fu fu) {
        return (aR)aR.m.a(hv, fu);
    }
    
    public static aR a(final InputStream inputStream) {
        return (aR)aR.m.a(inputStream);
    }
    
    public static aR a(final InputStream inputStream, final fu fu) {
        return (aR)aR.m.b(inputStream, fu);
    }
    
    public static aR a(final byte[] array) {
        return (aR)aR.m.a(array);
    }
    
    public static aR a(final byte[] array, final fu fu) {
        return (aR)aR.m.a(array, fu);
    }
    
    static hv b(final aR ar, final hv e) {
        return ar.e = e;
    }
    
    public static aR b(final InputStream inputStream) {
        return (aR)aR.m.b(inputStream);
    }
    
    public static aR b(final InputStream inputStream, final fu fu) {
        return (aR)aR.m.a(inputStream, fu);
    }
    
    private void b() {
        this.e = hv.b;
        this.k = hv.b;
    }
    
    public static aR c() {
        return aR.i;
    }
    
    static boolean f() {
        return aR.d;
    }
    
    public static final bl k() {
        return bO.n();
    }
    
    protected a1 a(final dg dg) {
        return new a1(dg, null);
    }
    
    public hv d() {
        return this.k;
    }
    
    public aR e() {
        return aR.i;
    }
    
    public boolean g() {
        return (0x1 & this.n) == 0x1;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.e();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.e();
    }
    
    @Override
    public du getParserForType() {
        return aR.m;
    }
    
    @Override
    public int getSerializedSize() {
        final int g = this.g;
        if (g != -1) {
            return g;
        }
        final int n = 0x1 & this.n;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.e);
        }
        if ((0x2 & this.n) == 0x2) {
            n2 += ep.b(2, this.k);
        }
        return this.g = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.j;
    }
    
    public boolean h() {
        return (0x2 & this.n) == 0x2;
    }
    
    public a1 i() {
        return a(this);
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.g().a(aR.class, a1.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte f = this.f;
        if (f != -1) {
            return f == 1;
        }
        this.f = 1;
        return true;
    }
    
    public hv j() {
        return this.e;
    }
    
    public a1 l() {
        return a();
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
        this.getSerializedSize();
        if ((0x1 & this.n) == 0x1) {
            ep.c(1, this.e);
        }
        if ((0x2 & this.n) == 0x2) {
            ep.c(2, this.k);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
