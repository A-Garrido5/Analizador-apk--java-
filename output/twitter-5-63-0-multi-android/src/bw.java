import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.5.30
// 

final class bw implements bi
{
    public final bq a;
    public final cc b;
    private AtomicBoolean c;
    
    public bw(final cc cc) {
        this(cc, new bq());
    }
    
    public bw(final cc b, final bq a) {
        this.c = new AtomicBoolean();
        if (b == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.a = a;
        this.b = b;
    }
    
    private void e() {
        if (this.c.get()) {
            throw new IllegalStateException("closed");
        }
    }
    
    @Override
    public bi a(final int n) {
        this.e();
        this.a.d(n);
        return this.c();
    }
    
    @Override
    public bi a(final bk bk) {
        this.e();
        this.a.b(bk);
        return this.c();
    }
    
    @Override
    public bi a(final String s) {
        this.e();
        this.a.b(s);
        return this.c();
    }
    
    @Override
    public bi a(final byte[] array) {
        this.e();
        this.a.b(array);
        return this.c();
    }
    
    @Override
    public bi a(final byte[] array, final int n, final int n2) {
        this.e();
        this.a.c(array, n, n2);
        return this.c();
    }
    
    @Override
    public void a() {
        this.e();
        if (this.a.b > 0L) {
            this.b.a(this.a, this.a.b);
        }
        this.b.a();
    }
    
    @Override
    public void a(final bq bq, final long n) {
        this.e();
        this.a.a(bq, n);
        this.c();
    }
    
    @Override
    public bi b(final int n) {
        this.e();
        this.a.e(n);
        return this.c();
    }
    
    @Override
    public bq b() {
        return this.a;
    }
    
    @Override
    public bi c() {
        this.e();
        final long n = this.a.n();
        if (n > 0L) {
            this.b.a(this.a, n);
        }
        return this;
    }
    
    @Override
    public void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        bw.c:Ljava/util/concurrent/atomic/AtomicBoolean;
        //     4: iconst_1       
        //     5: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //     8: ifeq            12
        //    11: return         
        //    12: aload_0        
        //    13: getfield        bw.a:Lbq;
        //    16: getfield        bq.b:J
        //    19: lconst_0       
        //    20: lcmp           
        //    21: istore          4
        //    23: aconst_null    
        //    24: astore_2       
        //    25: iload           4
        //    27: ifle            50
        //    30: aload_0        
        //    31: getfield        bw.b:Lcc;
        //    34: aload_0        
        //    35: getfield        bw.a:Lbq;
        //    38: aload_0        
        //    39: getfield        bw.a:Lbq;
        //    42: getfield        bq.b:J
        //    45: invokeinterface cc.a:(Lbq;J)V
        //    50: aload_0        
        //    51: getfield        bw.b:Lcc;
        //    54: invokeinterface cc.close:()V
        //    59: aload_2        
        //    60: astore_3       
        //    61: aload_3        
        //    62: ifnull          11
        //    65: aload_3        
        //    66: invokestatic    ce.a:(Ljava/lang/Throwable;)V
        //    69: return         
        //    70: astore_1       
        //    71: aload_1        
        //    72: astore_2       
        //    73: goto            50
        //    76: astore_3       
        //    77: aload_2        
        //    78: ifnull          61
        //    81: aload_2        
        //    82: astore_3       
        //    83: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  12     23     70     76     Ljava/lang/Throwable;
        //  30     50     70     76     Ljava/lang/Throwable;
        //  50     59     76     86     Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    public OutputStream d() {
        return new bx(this);
    }
    
    @Override
    public String toString() {
        return "buffer(" + this.b + ")";
    }
}
