import java.util.Date;
import org.json.JSONObject;
import com.twitter.internal.android.service.d;
import com.twitter.internal.network.HttpOperation;

// 
// Decompiled by Procyon v0.5.30
// 

public final class ke extends kc
{
    static final /* synthetic */ boolean i;
    public String a;
    public ki b;
    public int c;
    public kj d;
    public String e;
    public long f;
    public long g;
    public kl h;
    private HttpOperation j;
    private d k;
    
    static {
        i = !ke.class.desiredAssertionStatus();
    }
    
    public ke(final HttpOperation j, long f, final d k) {
        long a = -1L;
        this.a = null;
        this.e = null;
        this.g = a;
        this.h = null;
        this.j = j;
        this.k = k;
        this.b = new ki(j);
        if (this.k != null) {
            this.c = this.k.hashCode();
            a = this.k.a("blocking", a);
        }
        else {
            this.c = j.hashCode();
        }
        if (a > 0L) {
            f = a;
        }
        this.f = f;
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject jsonObject;
        synchronized (this) {
            if (this.j != null) {
                this.g = System.currentTimeMillis() - this.f;
                this.h = new kl(this.j, this.k);
                this.d = new kj(this.j);
                this.d.h = -1;
                this.h.f = this.g - this.h.f - this.h.a - this.h.c - this.h.b - this.h.d - this.h.g - this.h.e;
            }
            jsonObject = new JSONObject();
            jsonObject.put("pageref", (Object)"twitter_android");
            jsonObject.put("startedDateTime", (Object)this.a(new Date(this.f)));
            jsonObject.put("time", this.g);
            jsonObject.put("requestId", this.c);
            if (!ke.i && this.b == null) {
                throw new AssertionError((Object)"request was not set");
            }
        }
        jsonObject.put("request", (Object)this.b.a());
        if (!ke.i && this.d == null) {
            throw new AssertionError((Object)"response was not set");
        }
        jsonObject.put("response", (Object)this.d.a());
        jsonObject.put("cache", (Object)new JSONObject());
        if (!ke.i && this.h == null) {
            throw new AssertionError((Object)"timings was not set");
        }
        jsonObject.put("timings", (Object)this.h.a());
        jsonObject.put("serverIPAddress", (Object)this.e);
        jsonObject.put("comment", (Object)this.a);
        // monitorexit(this)
        return jsonObject;
    }
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: new             Lkj;
        //     6: dup            
        //     7: aload_0        
        //     8: getfield        ke.j:Lcom/twitter/internal/network/HttpOperation;
        //    11: invokespecial   kj.<init>:(Lcom/twitter/internal/network/HttpOperation;)V
        //    14: putfield        ke.d:Lkj;
        //    17: aload_0        
        //    18: getfield        ke.j:Lcom/twitter/internal/network/HttpOperation;
        //    21: invokevirtual   com/twitter/internal/network/HttpOperation.l:()Lcom/twitter/internal/network/l;
        //    24: astore_3       
        //    25: aload_0        
        //    26: getfield        ke.k:Lcom/twitter/internal/android/service/d;
        //    29: ifnull          107
        //    32: aload_0        
        //    33: getfield        ke.k:Lcom/twitter/internal/android/service/d;
        //    36: invokevirtual   com/twitter/internal/android/service/d.a:()J
        //    39: lstore          4
        //    41: aload_0        
        //    42: lload           4
        //    44: aload_3        
        //    45: getfield        com/twitter/internal/network/l.e:J
        //    48: ladd           
        //    49: putfield        ke.g:J
        //    52: aload_0        
        //    53: new             Lkl;
        //    56: dup            
        //    57: aload_0        
        //    58: getfield        ke.j:Lcom/twitter/internal/network/HttpOperation;
        //    61: aload_0        
        //    62: getfield        ke.k:Lcom/twitter/internal/android/service/d;
        //    65: invokespecial   kl.<init>:(Lcom/twitter/internal/network/HttpOperation;Lcom/twitter/internal/android/service/d;)V
        //    68: putfield        ke.h:Lkl;
        //    71: aload_0        
        //    72: getfield        ke.j:Lcom/twitter/internal/network/HttpOperation;
        //    75: invokevirtual   com/twitter/internal/network/HttpOperation.o:()Z
        //    78: ifeq            94
        //    81: aload_0        
        //    82: aload_0        
        //    83: getfield        ke.j:Lcom/twitter/internal/network/HttpOperation;
        //    86: ldc             "Server"
        //    88: invokevirtual   com/twitter/internal/network/HttpOperation.b:(Ljava/lang/String;)Ljava/lang/String;
        //    91: putfield        ke.e:Ljava/lang/String;
        //    94: aload_0        
        //    95: aconst_null    
        //    96: putfield        ke.j:Lcom/twitter/internal/network/HttpOperation;
        //    99: aload_0        
        //   100: aconst_null    
        //   101: putfield        ke.k:Lcom/twitter/internal/android/service/d;
        //   104: aload_0        
        //   105: monitorexit    
        //   106: return         
        //   107: lconst_0       
        //   108: lstore          4
        //   110: goto            41
        //   113: astore_1       
        //   114: aload_0        
        //   115: aconst_null    
        //   116: putfield        ke.j:Lcom/twitter/internal/network/HttpOperation;
        //   119: aload_0        
        //   120: aconst_null    
        //   121: putfield        ke.k:Lcom/twitter/internal/android/service/d;
        //   124: aload_1        
        //   125: athrow         
        //   126: astore_2       
        //   127: aload_0        
        //   128: monitorexit    
        //   129: aload_2        
        //   130: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      41     113    126    Any
        //  41     94     113    126    Any
        //  94     104    126    131    Any
        //  114    126    126    131    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
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
}
