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
import com.google.hv;
import com.google.ce;
import com.google.du;
import com.google.dS;

public final class as extends dS implements L
{
    public static du PARSER;
    public static final int PRIVATE_FIELD_NUMBER = 2;
    public static final int PUBLIC_FIELD_NUMBER = 1;
    private static final as e;
    private static final long serialVersionUID;
    private byte f;
    private final ce g;
    private int h;
    private int i;
    private hv j;
    private hv k;
    
    static {
        as.PARSER = new bj();
        (e = new as(true)).j();
    }
    
    private as(final cL p0, final fu p1) {
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
        //    10: putfield        org/whispersystems/as.f:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/as.h:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/as.j:()V
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
        //    83: invokevirtual   org/whispersystems/as.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
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
        //   103: getfield        org/whispersystems/as.i:I
        //   106: ior            
        //   107: putfield        org/whispersystems/as.i:I
        //   110: aload_0        
        //   111: aload_1        
        //   112: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   115: putfield        org/whispersystems/as.k:Lcom/google/hv;
        //   118: iload_3        
        //   119: ifeq            140
        //   122: aload_0        
        //   123: iconst_2       
        //   124: aload_0        
        //   125: getfield        org/whispersystems/as.i:I
        //   128: ior            
        //   129: putfield        org/whispersystems/as.i:I
        //   132: aload_0        
        //   133: aload_1        
        //   134: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   137: putfield        org/whispersystems/as.j:Lcom/google/hv;
        //   140: iload_3        
        //   141: ifeq            30
        //   144: aload_0        
        //   145: aload           4
        //   147: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   150: putfield        org/whispersystems/as.g:Lcom/google/ce;
        //   153: aload_0        
        //   154: invokevirtual   org/whispersystems/as.c:()V
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
        //   190: putfield        org/whispersystems/as.g:Lcom/google/ce;
        //   193: aload_0        
        //   194: invokevirtual   org/whispersystems/as.c:()V
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
    
    as(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private as(final fp fp) {
        super(fp);
        this.f = -1;
        this.h = -1;
        this.g = fp.getUnknownFields();
    }
    
    as(final fp fp, final j j) {
        this(fp);
    }
    
    private as(final boolean b) {
        this.f = -1;
        this.h = -1;
        this.g = ce.d();
    }
    
    static int a(final as as, final int i) {
        return as.i = i;
    }
    
    static hv a(final as as, final hv k) {
        return as.k = k;
    }
    
    public static a7 a(final as as) {
        return c().a(as);
    }
    
    public static as a(final cL cl) {
        return (as)as.PARSER.a(cl);
    }
    
    public static as a(final cL cl, final fu fu) {
        return (as)as.PARSER.a(cl, fu);
    }
    
    public static as a(final hv hv) {
        return (as)as.PARSER.a(hv);
    }
    
    public static as a(final hv hv, final fu fu) {
        return (as)as.PARSER.a(hv, fu);
    }
    
    public static as a(final InputStream inputStream) {
        return (as)as.PARSER.a(inputStream);
    }
    
    public static as a(final InputStream inputStream, final fu fu) {
        return (as)as.PARSER.a(inputStream, fu);
    }
    
    public static as a(final byte[] array) {
        return (as)as.PARSER.a(array);
    }
    
    public static as a(final byte[] array, final fu fu) {
        return (as)as.PARSER.a(array, fu);
    }
    
    static hv b(final as as, final hv j) {
        return as.j = j;
    }
    
    public static as b(final InputStream inputStream) {
        return (as)as.PARSER.b(inputStream);
    }
    
    public static as b(final InputStream inputStream, final fu fu) {
        return (as)as.PARSER.b(inputStream, fu);
    }
    
    public static a7 c() {
        return a7.i();
    }
    
    public static as f() {
        return as.e;
    }
    
    public static final bl h() {
        return bO.u();
    }
    
    private void j() {
        this.k = hv.b;
        this.j = hv.b;
    }
    
    static boolean k() {
        return as.d;
    }
    
    public hv a() {
        return this.k;
    }
    
    protected a7 a(final dg dg) {
        return new a7(dg, null);
    }
    
    public boolean b() {
        return (0x2 & this.i) == 0x2;
    }
    
    public hv d() {
        return this.j;
    }
    
    public a7 e() {
        return a(this);
    }
    
    public boolean g() {
        return (0x1 & this.i) == 0x1;
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
        return as.PARSER;
    }
    
    @Override
    public int getSerializedSize() {
        final int h = this.h;
        if (h != -1) {
            return h;
        }
        final int n = 0x1 & this.i;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.k);
        }
        if ((0x2 & this.i) == 0x2) {
            n2 += ep.b(2, this.j);
        }
        return this.h = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.g;
    }
    
    public a7 i() {
        return c();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.l().a(as.class, a7.class);
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
    
    public as l() {
        return as.e;
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
        if ((0x1 & this.i) == 0x1) {
            ep.c(1, this.k);
        }
        if ((0x2 & this.i) == 0x2) {
            ep.c(2, this.j);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
