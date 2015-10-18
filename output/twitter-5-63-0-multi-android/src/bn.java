import java.util.zip.Deflater;

// 
// Decompiled by Procyon v0.5.30
// 

public final class bn implements cc
{
    private final bi a;
    private final Deflater b;
    private boolean c;
    
    public bn(final cc cc, final Deflater b) {
        this.a = bt.a(cc);
        this.b = b;
    }
    
    private void a(final boolean b) {
        final bq b2 = this.a.b();
        while (true) {
            final ca f = b2.f(1);
            int n;
            if (b) {
                n = this.b.deflate(f.a, f.c, 2048 - f.c, 2);
            }
            else {
                n = this.b.deflate(f.a, f.c, 2048 - f.c);
            }
            if (n > 0) {
                f.c += n;
                b2.b += n;
                this.a.c();
            }
            else {
                if (this.b.needsInput()) {
                    break;
                }
                continue;
            }
        }
    }
    
    @Override
    public void a() {
        this.a(true);
        this.a.a();
    }
    
    @Override
    public void a(final bq bq, long n) {
        ce.a(bq.b, 0L, n);
        while (n > 0L) {
            final ca a = bq.a;
            final int n2 = (int)Math.min(n, a.c - a.b);
            this.b.setInput(a.a, a.b, n2);
            this.a(false);
            bq.b -= n2;
            a.b += n2;
            if (a.b == a.c) {
                bq.a = a.a();
                cb.a.a(a);
            }
            n -= n2;
        }
    }
    
    @Override
    public void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        bn.c:Z
        //     4: ifeq            8
        //     7: return         
        //     8: aconst_null    
        //     9: astore_1       
        //    10: aload_0        
        //    11: getfield        bn.b:Ljava/util/zip/Deflater;
        //    14: invokevirtual   java/util/zip/Deflater.finish:()V
        //    17: aload_0        
        //    18: iconst_0       
        //    19: invokespecial   bn.a:(Z)V
        //    22: aload_0        
        //    23: getfield        bn.b:Ljava/util/zip/Deflater;
        //    26: invokevirtual   java/util/zip/Deflater.end:()V
        //    29: aload_1        
        //    30: astore_3       
        //    31: aload_0        
        //    32: getfield        bn.a:Lbi;
        //    35: invokeinterface bi.close:()V
        //    40: aload_0        
        //    41: iconst_1       
        //    42: putfield        bn.c:Z
        //    45: aload_3        
        //    46: ifnull          7
        //    49: aload_3        
        //    50: invokestatic    ce.a:(Ljava/lang/Throwable;)V
        //    53: return         
        //    54: astore_2       
        //    55: aload_2        
        //    56: astore_1       
        //    57: goto            22
        //    60: astore_3       
        //    61: aload_1        
        //    62: ifnull          31
        //    65: aload_1        
        //    66: astore_3       
        //    67: goto            31
        //    70: astore          4
        //    72: aload_3        
        //    73: ifnonnull       40
        //    76: aload           4
        //    78: astore_3       
        //    79: goto            40
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     22     54     60     Ljava/lang/Throwable;
        //  22     29     60     70     Ljava/lang/Throwable;
        //  31     40     70     82     Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 44, Size: 44
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
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
    
    @Override
    public String toString() {
        return "DeflaterSink(" + this.a + ")";
    }
}
