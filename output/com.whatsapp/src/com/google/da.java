// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class da extends df implements ho
{
    public static final int g = 999;
    public static final int k = 2;
    public static du l;
    private static final da m;
    private static final long serialVersionUID;
    private int f;
    private final ce h;
    private int i;
    private List j;
    private boolean n;
    private byte o;
    
    static {
        da.l = new hS();
        (m = new da(true)).d();
    }
    
    private da(final cL p0, final fu p1) {
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
        //     8: invokespecial   com/google/df.<init>:()V
        //    11: aload_0        
        //    12: iconst_m1      
        //    13: putfield        com/google/da.o:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/da.f:I
        //    21: aload_0        
        //    22: invokespecial   com/google/da.d:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            175
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 208
        //               16: 104
        //             7994: 127
        //          default: 80
        //        }
        //    80: aload_0        
        //    81: aload_1        
        //    82: aload           5
        //    84: aload_2        
        //    85: iload           12
        //    87: invokevirtual   com/google/da.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    90: istore          14
        //    92: iload           14
        //    94: ifne            170
        //    97: iload           4
        //    99: ifeq            308
        //   102: iconst_1       
        //   103: istore_3       
        //   104: aload_0        
        //   105: iconst_1       
        //   106: aload_0        
        //   107: getfield        com/google/da.i:I
        //   110: ior            
        //   111: putfield        com/google/da.i:I
        //   114: aload_0        
        //   115: aload_1        
        //   116: invokevirtual   com/google/cL.x:()Z
        //   119: putfield        com/google/da.n:Z
        //   122: iload           4
        //   124: ifeq            170
        //   127: iload           6
        //   129: iconst_2       
        //   130: iand           
        //   131: iconst_2       
        //   132: if_icmpeq       152
        //   135: aload_0        
        //   136: new             Ljava/util/ArrayList;
        //   139: dup            
        //   140: invokespecial   java/util/ArrayList.<init>:()V
        //   143: putfield        com/google/da.j:Ljava/util/List;
        //   146: iload           6
        //   148: iconst_2       
        //   149: ior            
        //   150: istore          6
        //   152: aload_0        
        //   153: getfield        com/google/da.j:Ljava/util/List;
        //   156: aload_1        
        //   157: getstatic       com/google/dy.k:Lcom/google/du;
        //   160: aload_2        
        //   161: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   164: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   169: pop            
        //   170: iload           4
        //   172: ifeq            33
        //   175: iload           6
        //   177: iconst_2       
        //   178: iand           
        //   179: iconst_2       
        //   180: if_icmpne       194
        //   183: aload_0        
        //   184: aload_0        
        //   185: getfield        com/google/da.j:Ljava/util/List;
        //   188: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   191: putfield        com/google/da.j:Ljava/util/List;
        //   194: aload_0        
        //   195: aload           5
        //   197: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   200: putfield        com/google/da.h:Lcom/google/ce;
        //   203: aload_0        
        //   204: invokevirtual   com/google/da.c:()V
        //   207: return         
        //   208: iload           4
        //   210: ifeq            308
        //   213: iconst_1       
        //   214: istore_3       
        //   215: goto            80
        //   218: astore          13
        //   220: aload           13
        //   222: athrow         
        //   223: astore          11
        //   225: aload           11
        //   227: aload_0        
        //   228: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   231: athrow         
        //   232: astore          9
        //   234: iload           6
        //   236: iconst_2       
        //   237: iand           
        //   238: iconst_2       
        //   239: if_icmpne       253
        //   242: aload_0        
        //   243: aload_0        
        //   244: getfield        com/google/da.j:Ljava/util/List;
        //   247: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   250: putfield        com/google/da.j:Ljava/util/List;
        //   253: aload_0        
        //   254: aload           5
        //   256: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   259: putfield        com/google/da.h:Lcom/google/ce;
        //   262: aload_0        
        //   263: invokevirtual   com/google/da.c:()V
        //   266: aload           9
        //   268: athrow         
        //   269: astore          15
        //   271: aload           15
        //   273: athrow         
        //   274: astore          16
        //   276: aload           16
        //   278: athrow         
        //   279: astore          8
        //   281: new             Lcom/google/bg;
        //   284: dup            
        //   285: aload           8
        //   287: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   290: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   293: aload_0        
        //   294: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   297: athrow         
        //   298: astore          10
        //   300: aload           10
        //   302: athrow         
        //   303: astore          7
        //   305: aload           7
        //   307: athrow         
        //   308: iconst_1       
        //   309: istore_3       
        //   310: goto            170
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     223    232    Lcom/google/bg;
        //  37     43     279    298    Ljava/io/IOException;
        //  37     43     232    269    Any
        //  80     92     218    223    Lcom/google/bg;
        //  80     92     279    298    Ljava/io/IOException;
        //  80     92     232    269    Any
        //  104    122    269    279    Lcom/google/bg;
        //  104    122    279    298    Ljava/io/IOException;
        //  104    122    232    269    Any
        //  135    146    223    232    Lcom/google/bg;
        //  135    146    279    298    Ljava/io/IOException;
        //  135    146    232    269    Any
        //  152    170    223    232    Lcom/google/bg;
        //  152    170    279    298    Ljava/io/IOException;
        //  152    170    232    269    Any
        //  183    194    303    308    Lcom/google/bg;
        //  220    223    223    232    Lcom/google/bg;
        //  220    223    279    298    Ljava/io/IOException;
        //  220    223    232    269    Any
        //  225    232    232    269    Any
        //  242    253    298    303    Lcom/google/bg;
        //  271    274    274    279    Lcom/google/bg;
        //  271    274    279    298    Ljava/io/IOException;
        //  271    274    232    269    Any
        //  276    279    223    232    Lcom/google/bg;
        //  276    279    279    298    Ljava/io/IOException;
        //  276    279    232    269    Any
        //  281    298    232    269    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 147, Size: 147
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
    
    da(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private da(final gq gq) {
        super(gq);
        this.o = -1;
        this.f = -1;
        this.h = gq.getUnknownFields();
    }
    
    da(final gq gq, final fM fm) {
        this(gq);
    }
    
    private da(final boolean b) {
        this.o = -1;
        this.f = -1;
        this.h = ce.d();
    }
    
    static int a(final da da, final int i) {
        return da.i = i;
    }
    
    public static da a(final cL cl) {
        return (da)da.l.a(cl);
    }
    
    public static da a(final cL cl, final fu fu) {
        return (da)da.l.a(cl, fu);
    }
    
    public static da a(final hv hv) {
        return (da)da.l.a(hv);
    }
    
    public static da a(final hv hv, final fu fu) {
        return (da)da.l.a(hv, fu);
    }
    
    public static da a(final InputStream inputStream) {
        return (da)da.l.a(inputStream);
    }
    
    public static da a(final InputStream inputStream, final fu fu) {
        return (da)da.l.a(inputStream, fu);
    }
    
    public static da a(final byte[] array) {
        return (da)da.l.a(array);
    }
    
    public static da a(final byte[] array, final fu fu) {
        return (da)da.l.a(array, fu);
    }
    
    static List a(final da da) {
        return da.j;
    }
    
    static List a(final da da, final List j) {
        return da.j = j;
    }
    
    static boolean a(final da da, final boolean n) {
        return da.n = n;
    }
    
    public static da b(final InputStream inputStream) {
        return (da)da.l.b(inputStream);
    }
    
    public static da b(final InputStream inputStream, final fu fu) {
        return (da)da.l.b(inputStream, fu);
    }
    
    public static gW b(final da da) {
        return i().a(da);
    }
    
    private void d() {
        this.n = true;
        this.j = Collections.emptyList();
    }
    
    public static gW i() {
        return gW.l();
    }
    
    public static da j() {
        return da.m;
    }
    
    public static final bl k() {
        return hM.K();
    }
    
    public dy a(final int n) {
        return this.j.get(n);
    }
    
    protected gW a(final dg dg) {
        return new gW(dg, null);
    }
    
    public boolean a() {
        return this.n;
    }
    
    public f b(final int n) {
        return this.j.get(n);
    }
    
    public boolean b() {
        return (0x1 & this.i) == 0x1;
    }
    
    public List e() {
        return this.j;
    }
    
    public da f() {
        return da.m;
    }
    
    public int g() {
        return this.j.size();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.f();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.f();
    }
    
    @Override
    public du getParserForType() {
        return da.l;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean b = dt.b;
        final int f = this.f;
        if (f != -1) {
            return f;
        }
        int n;
        if ((0x1 & this.i) == 0x1) {
            n = 0 + ep.a(2, this.n);
        }
        else {
            n = 0;
        }
        int n2 = n;
        while (i < this.j.size()) {
            final int n3 = n2 + ep.f(999, this.j.get(i));
            ++i;
            if (b) {
                return this.f = n3 + this.c() + this.getUnknownFields().getSerializedSize();
            }
            n2 = n3;
        }
        final int n3 = n2;
        return this.f = n3 + this.c() + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.h;
    }
    
    public gW h() {
        return i();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.q().a(da.class, gW.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        final byte o = this.o;
        if (o != -1) {
            return o == 1;
        }
        int i = 0;
        while (i < this.g()) {
            if (!this.a(i).isInitialized()) {
                this.o = 0;
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (!this.e()) {
            this.o = 0;
            return false;
        }
        this.o = 1;
        return true;
    }
    
    public List l() {
        return this.j;
    }
    
    public gW m() {
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
    
    @Override
    public a8 toBuilder() {
        return this.m();
    }
    
    @Override
    public aJ toBuilder() {
        return this.m();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        this.getSerializedSize();
        final ar b2 = this.b();
        if ((0x1 & this.i) == 0x1) {
            ep.b(2, this.n);
        }
        int n;
        for (int i = 0; i < this.j.size(); i = n) {
            ep.e(999, (ci)this.j.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        b2.a(536870912, ep);
        this.getUnknownFields().writeTo(ep);
    }
}
