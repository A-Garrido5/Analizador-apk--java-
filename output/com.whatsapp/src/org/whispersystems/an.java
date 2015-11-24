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
import java.util.Collections;
import com.google.bl;
import java.io.InputStream;
import com.google.hv;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import java.util.List;
import com.google.du;
import com.google.dS;

public final class an extends dS implements v
{
    public static final int e = 1;
    public static du f;
    private static final an k;
    private static final long serialVersionUID;
    private int g;
    private List h;
    private final ce i;
    private byte j;
    
    static {
        an.f = new bN();
        (k = new an(true)).f();
    }
    
    private an(final cL p0, final fu p1) {
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
        //    13: putfield        org/whispersystems/an.j:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        org/whispersystems/an.g:I
        //    21: aload_0        
        //    22: invokespecial   org/whispersystems/an.f:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            144
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 177
        //               10: 96
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: aload_1        
        //    74: aload           5
        //    76: aload_2        
        //    77: iload           12
        //    79: invokevirtual   org/whispersystems/an.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    82: istore          14
        //    84: iload           14
        //    86: ifne            139
        //    89: iload           4
        //    91: ifeq            267
        //    94: iconst_1       
        //    95: istore_3       
        //    96: iload           6
        //    98: iconst_1       
        //    99: iand           
        //   100: iconst_1       
        //   101: if_icmpeq       121
        //   104: aload_0        
        //   105: new             Ljava/util/ArrayList;
        //   108: dup            
        //   109: invokespecial   java/util/ArrayList.<init>:()V
        //   112: putfield        org/whispersystems/an.h:Ljava/util/List;
        //   115: iload           6
        //   117: iconst_1       
        //   118: ior            
        //   119: istore          6
        //   121: aload_0        
        //   122: getfield        org/whispersystems/an.h:Ljava/util/List;
        //   125: aload_1        
        //   126: getstatic       org/whispersystems/af.k:Lcom/google/du;
        //   129: aload_2        
        //   130: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   133: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   138: pop            
        //   139: iload           4
        //   141: ifeq            33
        //   144: iload           6
        //   146: iconst_1       
        //   147: iand           
        //   148: iconst_1       
        //   149: if_icmpne       163
        //   152: aload_0        
        //   153: aload_0        
        //   154: getfield        org/whispersystems/an.h:Ljava/util/List;
        //   157: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   160: putfield        org/whispersystems/an.h:Ljava/util/List;
        //   163: aload_0        
        //   164: aload           5
        //   166: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   169: putfield        org/whispersystems/an.i:Lcom/google/ce;
        //   172: aload_0        
        //   173: invokevirtual   org/whispersystems/an.c:()V
        //   176: return         
        //   177: iload           4
        //   179: ifeq            267
        //   182: iconst_1       
        //   183: istore_3       
        //   184: goto            72
        //   187: astore          13
        //   189: aload           13
        //   191: athrow         
        //   192: astore          11
        //   194: aload           11
        //   196: aload_0        
        //   197: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   200: athrow         
        //   201: astore          9
        //   203: iload           6
        //   205: iconst_1       
        //   206: iand           
        //   207: iconst_1       
        //   208: if_icmpne       222
        //   211: aload_0        
        //   212: aload_0        
        //   213: getfield        org/whispersystems/an.h:Ljava/util/List;
        //   216: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   219: putfield        org/whispersystems/an.h:Ljava/util/List;
        //   222: aload_0        
        //   223: aload           5
        //   225: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   228: putfield        org/whispersystems/an.i:Lcom/google/ce;
        //   231: aload_0        
        //   232: invokevirtual   org/whispersystems/an.c:()V
        //   235: aload           9
        //   237: athrow         
        //   238: astore          7
        //   240: aload           7
        //   242: athrow         
        //   243: astore          8
        //   245: new             Lcom/google/bg;
        //   248: dup            
        //   249: aload           8
        //   251: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   254: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   257: aload_0        
        //   258: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   261: athrow         
        //   262: astore          10
        //   264: aload           10
        //   266: athrow         
        //   267: iconst_1       
        //   268: istore_3       
        //   269: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     192    201    Lcom/google/bg;
        //  37     43     243    262    Ljava/io/IOException;
        //  37     43     201    238    Any
        //  72     84     187    192    Lcom/google/bg;
        //  72     84     243    262    Ljava/io/IOException;
        //  72     84     201    238    Any
        //  104    115    192    201    Lcom/google/bg;
        //  104    115    243    262    Ljava/io/IOException;
        //  104    115    201    238    Any
        //  121    139    192    201    Lcom/google/bg;
        //  121    139    243    262    Ljava/io/IOException;
        //  121    139    201    238    Any
        //  152    163    238    243    Lcom/google/bg;
        //  189    192    192    201    Lcom/google/bg;
        //  189    192    243    262    Ljava/io/IOException;
        //  189    192    201    238    Any
        //  194    201    201    238    Any
        //  211    222    262    267    Lcom/google/bg;
        //  245    262    201    238    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 129, Size: 129
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
    
    an(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private an(final fp fp) {
        super(fp);
        this.j = -1;
        this.g = -1;
        this.i = fp.getUnknownFields();
    }
    
    an(final fp fp, final j j) {
        this(fp);
    }
    
    private an(final boolean b) {
        this.j = -1;
        this.g = -1;
        this.i = ce.d();
    }
    
    static List a(final an an, final List h) {
        return an.h = h;
    }
    
    public static aX a(final an an) {
        return l().a(an);
    }
    
    public static an a() {
        return an.k;
    }
    
    public static an a(final cL cl) {
        return (an)an.f.a(cl);
    }
    
    public static an a(final cL cl, final fu fu) {
        return (an)an.f.a(cl, fu);
    }
    
    public static an a(final hv hv) {
        return (an)an.f.a(hv);
    }
    
    public static an a(final hv hv, final fu fu) {
        return (an)an.f.a(hv, fu);
    }
    
    public static an a(final InputStream inputStream) {
        return (an)an.f.a(inputStream);
    }
    
    public static an a(final InputStream inputStream, final fu fu) {
        return (an)an.f.b(inputStream, fu);
    }
    
    public static an a(final byte[] array) {
        return (an)an.f.a(array);
    }
    
    public static an a(final byte[] array, final fu fu) {
        return (an)an.f.a(array, fu);
    }
    
    static List b(final an an) {
        return an.h;
    }
    
    public static an b(final InputStream inputStream) {
        return (an)an.f.b(inputStream);
    }
    
    public static an b(final InputStream inputStream, final fu fu) {
        return (an)an.f.a(inputStream, fu);
    }
    
    static boolean c() {
        return an.d;
    }
    
    public static final bl e() {
        return bO.p();
    }
    
    private void f() {
        this.h = Collections.emptyList();
    }
    
    static boolean h() {
        return an.d;
    }
    
    public static aX l() {
        return aX.d();
    }
    
    protected aX a(final dg dg) {
        return new aX(dg, null);
    }
    
    public bb a(final int n) {
        return this.h.get(n);
    }
    
    public aX b() {
        return a(this);
    }
    
    public af b(final int n) {
        return this.h.get(n);
    }
    
    public an d() {
        return an.k;
    }
    
    public int g() {
        return this.h.size();
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
        return an.f;
    }
    
    @Override
    public int getSerializedSize() {
        final boolean o = aZ.o;
        final int g = this.g;
        if (g != -1) {
            return g;
        }
        int i = 0;
        int n = 0;
        while (i < this.h.size()) {
            n += ep.f(1, this.h.get(i));
            final int n2 = i + 1;
            if (o) {
                break;
            }
            i = n2;
        }
        return this.g = n + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.i;
    }
    
    public List i() {
        return this.h;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.h().a(an.class, aX.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte j = this.j;
        if (j != -1) {
            return j == 1;
        }
        this.j = 1;
        return true;
    }
    
    public List j() {
        return this.h;
    }
    
    public aX k() {
        return l();
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.k();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.k();
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
        final boolean o = aZ.o;
        this.getSerializedSize();
        int n;
        for (int i = 0; i < this.h.size(); i = n) {
            ep.e(1, (ci)this.h.get(i));
            n = i + 1;
            if (o) {
                break;
            }
        }
        this.getUnknownFields().writeTo(ep);
    }
}
