// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import android.content.SharedPreferences;
import android.net.Uri;
import com.twitter.library.client.Session;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import com.twitter.internal.android.service.d;
import com.twitter.internal.network.HttpOperation;

public abstract class c extends y
{
    private static final boolean a;
    private int e;
    private HttpOperation f;
    private boolean g;
    protected final d n;
    
    static {
        a = (App.l() && Log.isLoggable("APIRequest", 3));
    }
    
    protected c(final Context context, final String s, final Session session) {
        super(context, s, session);
        this.e = 0;
        this.f = null;
        this.g = true;
        if (session == null) {
            throw new IllegalArgumentException("Session cannot be null");
        }
        this.n = new d();
    }
    
    protected c(final Context context, final String s, final ab ab) {
        super(context, s, ab);
        this.e = 0;
        this.f = null;
        this.g = true;
        if (ab == null) {
            throw new IllegalArgumentException("SessionStamp cannot be null");
        }
        this.n = new d();
    }
    
    protected final f M() {
        final f f = new f(this.p);
        if (App.f()) {
            final SharedPreferences sharedPreferences = this.p.getSharedPreferences("debug_prefs", 0);
            if (sharedPreferences.getBoolean("staging_enabled", false)) {
                final String string = sharedPreferences.getString("staging_url", (String)null);
                if (string != null) {
                    final Uri parse = Uri.parse(string);
                    f.c(parse.getScheme()).b(parse.getAuthority());
                }
            }
        }
        return f;
    }
    
    public void N() {
        synchronized (this) {
            this.cancel(true);
            final HttpOperation f = this.f;
            // monitorexit(this)
            if (f != null) {
                f.b();
            }
        }
    }
    
    protected abstract e a();
    
    protected void a(final HttpOperation httpOperation, final aa aa, final com.twitter.library.service.d d) {
    }
    
    @Override
    protected final void a_(final aa p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/twitter/library/service/c.a:()Lcom/twitter/library/service/e;
        //     4: astore_2       
        //     5: aload_0        
        //     6: invokevirtual   com/twitter/library/service/c.P:()Lcom/twitter/library/service/ab;
        //     9: astore_3       
        //    10: new             Lcom/twitter/library/service/a;
        //    13: dup            
        //    14: aload_3        
        //    15: getfield        com/twitter/library/service/ab.c:J
        //    18: aload_2        
        //    19: getfield        com/twitter/library/service/e.a:Ljava/lang/CharSequence;
        //    22: invokespecial   com/twitter/library/service/a.<init>:(JLjava/lang/CharSequence;)V
        //    25: astore          4
        //    27: aload_0        
        //    28: invokevirtual   com/twitter/library/service/c.h:()Lcom/twitter/library/service/d;
        //    31: astore          5
        //    33: aload           5
        //    35: ifnull          45
        //    38: aload           5
        //    40: aload           4
        //    42: invokevirtual   com/twitter/library/service/d.a:(Lcom/twitter/errorreporter/a;)V
        //    45: aload_0        
        //    46: aload_0        
        //    47: getfield        com/twitter/library/service/c.p:Landroid/content/Context;
        //    50: aload_2        
        //    51: getfield        com/twitter/library/service/e.a:Ljava/lang/CharSequence;
        //    54: invokevirtual   com/twitter/library/service/c.a:(Landroid/content/Context;Ljava/lang/CharSequence;)Lcom/twitter/library/network/g;
        //    57: aload_3        
        //    58: getfield        com/twitter/library/service/ab.c:J
        //    61: invokevirtual   com/twitter/library/network/g.a:(J)Lcom/twitter/library/network/g;
        //    64: aload_2        
        //    65: getfield        com/twitter/library/service/e.b:Lcom/twitter/internal/network/HttpOperation$RequestMethod;
        //    68: invokevirtual   com/twitter/library/network/g.a:(Lcom/twitter/internal/network/HttpOperation$RequestMethod;)Lcom/twitter/library/network/g;
        //    71: aload_2        
        //    72: getfield        com/twitter/library/service/e.c:Lorg/apache/http/HttpEntity;
        //    75: invokevirtual   com/twitter/library/network/g.a:(Lorg/apache/http/HttpEntity;)Lcom/twitter/library/network/g;
        //    78: aload           5
        //    80: invokevirtual   com/twitter/library/network/g.a:(Lcom/twitter/internal/network/j;)Lcom/twitter/library/network/g;
        //    83: aload_0        
        //    84: getfield        com/twitter/library/service/c.n:Lcom/twitter/internal/android/service/d;
        //    87: invokevirtual   com/twitter/library/network/g.a:(Lcom/twitter/internal/android/service/d;)Lcom/twitter/library/network/g;
        //    90: aload_0        
        //    91: getfield        com/twitter/library/service/c.g:Z
        //    94: invokevirtual   com/twitter/library/network/g.a:(Z)Lcom/twitter/library/network/g;
        //    97: astore          6
        //    99: aload_2        
        //   100: getfield        com/twitter/library/service/e.e:Lcom/twitter/library/network/a;
        //   103: ifnull          167
        //   106: aload           6
        //   108: aload_2        
        //   109: getfield        com/twitter/library/service/e.e:Lcom/twitter/library/network/a;
        //   112: invokevirtual   com/twitter/library/network/g.a:(Lcom/twitter/library/network/a;)Lcom/twitter/library/network/g;
        //   115: pop            
        //   116: aload_0        
        //   117: getfield        com/twitter/library/service/c.e:I
        //   120: ifle            133
        //   123: aload           6
        //   125: aload_0        
        //   126: getfield        com/twitter/library/service/c.e:I
        //   129: invokevirtual   com/twitter/library/network/g.a:(I)Lcom/twitter/library/network/g;
        //   132: pop            
        //   133: aload           6
        //   135: invokevirtual   com/twitter/library/network/g.a:()Lcom/twitter/internal/network/HttpOperation;
        //   138: astore          8
        //   140: aload_0        
        //   141: monitorenter   
        //   142: aload_0        
        //   143: aload           8
        //   145: putfield        com/twitter/library/service/c.f:Lcom/twitter/internal/network/HttpOperation;
        //   148: aload_0        
        //   149: invokevirtual   com/twitter/library/service/c.isCancelled:()Z
        //   152: ifeq            194
        //   155: aload_0        
        //   156: monitorexit    
        //   157: aload_0        
        //   158: monitorenter   
        //   159: aload_0        
        //   160: aconst_null    
        //   161: putfield        com/twitter/library/service/c.f:Lcom/twitter/internal/network/HttpOperation;
        //   164: aload_0        
        //   165: monitorexit    
        //   166: return         
        //   167: aload           6
        //   169: new             Lcom/twitter/library/network/t;
        //   172: dup            
        //   173: aload_3        
        //   174: getfield        com/twitter/library/service/ab.d:Lcom/twitter/library/network/OAuthToken;
        //   177: invokespecial   com/twitter/library/network/t.<init>:(Lcom/twitter/library/network/OAuthToken;)V
        //   180: invokevirtual   com/twitter/library/network/g.b:(Lcom/twitter/library/network/a;)Lcom/twitter/library/network/g;
        //   183: pop            
        //   184: goto            116
        //   187: astore          18
        //   189: aload_0        
        //   190: monitorexit    
        //   191: aload           18
        //   193: athrow         
        //   194: aload_0        
        //   195: monitorexit    
        //   196: aload_2        
        //   197: getfield        com/twitter/library/service/e.d:Ljava/util/List;
        //   200: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   205: astore          12
        //   207: aload           12
        //   209: invokeinterface java/util/Iterator.hasNext:()Z
        //   214: ifeq            275
        //   217: aload           12
        //   219: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   224: checkcast       Landroid/util/Pair;
        //   227: astore          16
        //   229: aload           8
        //   231: aload           16
        //   233: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   236: checkcast       Ljava/lang/String;
        //   239: aload           16
        //   241: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   244: checkcast       Ljava/lang/String;
        //   247: invokevirtual   com/twitter/internal/network/HttpOperation.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/twitter/internal/network/HttpOperation;
        //   250: pop            
        //   251: goto            207
        //   254: astore          9
        //   256: aload_0        
        //   257: monitorenter   
        //   258: aload_0        
        //   259: aconst_null    
        //   260: putfield        com/twitter/library/service/c.f:Lcom/twitter/internal/network/HttpOperation;
        //   263: aload_0        
        //   264: monitorexit    
        //   265: aload           9
        //   267: athrow         
        //   268: astore          11
        //   270: aload_0        
        //   271: monitorexit    
        //   272: aload           11
        //   274: athrow         
        //   275: aload_1        
        //   276: aload           8
        //   278: invokevirtual   com/twitter/internal/network/HttpOperation.c:()Lcom/twitter/internal/network/HttpOperation;
        //   281: invokevirtual   com/twitter/library/service/aa.a:(Lcom/twitter/internal/network/HttpOperation;)V
        //   284: aload           4
        //   286: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Lcom/twitter/errorreporter/a;)V
        //   289: aload_1        
        //   290: invokevirtual   com/twitter/library/service/aa.a:()Z
        //   293: ifne            310
        //   296: aload           5
        //   298: ifnull          310
        //   301: aload_1        
        //   302: aload           5
        //   304: invokevirtual   com/twitter/library/service/d.ax_:()Lcom/twitter/library/service/b;
        //   307: invokevirtual   com/twitter/library/service/aa.a:(Lcom/twitter/library/service/x;)V
        //   310: aload_0        
        //   311: monitorenter   
        //   312: aload_0        
        //   313: aconst_null    
        //   314: putfield        com/twitter/library/service/c.f:Lcom/twitter/internal/network/HttpOperation;
        //   317: aload_0        
        //   318: monitorexit    
        //   319: aload_0        
        //   320: aload           8
        //   322: aload_1        
        //   323: aload           5
        //   325: invokevirtual   com/twitter/library/service/c.a:(Lcom/twitter/internal/network/HttpOperation;Lcom/twitter/library/service/aa;Lcom/twitter/library/service/d;)V
        //   328: aload_1        
        //   329: invokevirtual   com/twitter/library/service/aa.b:()Ljava/lang/Exception;
        //   332: astore          14
        //   334: aload           14
        //   336: ifnull          348
        //   339: aload_0        
        //   340: getfield        com/twitter/library/service/c.p:Landroid/content/Context;
        //   343: aload           14
        //   345: invokestatic    com/twitter/library/scribe/ScribeService.a:(Landroid/content/Context;Ljava/lang/Throwable;)V
        //   348: getstatic       com/twitter/library/service/c.a:Z
        //   351: ifeq            166
        //   354: ldc             "APIRequest"
        //   356: new             Ljava/lang/StringBuilder;
        //   359: dup            
        //   360: invokespecial   java/lang/StringBuilder.<init>:()V
        //   363: ldc_w           "Action complete: "
        //   366: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   369: aload_0        
        //   370: invokevirtual   com/twitter/library/service/c.O:()I
        //   373: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   376: ldc_w           ", success: "
        //   379: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   382: aload_1        
        //   383: invokevirtual   com/twitter/library/service/aa.a:()Z
        //   386: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   389: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   392: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   395: pop            
        //   396: return         
        //   397: astore          13
        //   399: aload_0        
        //   400: monitorexit    
        //   401: aload           13
        //   403: athrow         
        //   404: astore          10
        //   406: aload_0        
        //   407: monitorexit    
        //   408: aload           10
        //   410: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  140    142    254    411    Any
        //  142    157    268    275    Any
        //  159    166    187    194    Any
        //  189    191    187    194    Any
        //  194    196    268    275    Any
        //  196    207    254    411    Any
        //  207    251    254    411    Any
        //  258    265    404    411    Any
        //  270    272    268    275    Any
        //  272    275    254    411    Any
        //  275    296    254    411    Any
        //  301    310    254    411    Any
        //  312    319    397    404    Any
        //  399    401    397    404    Any
        //  406    408    404    411    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0166:
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
    
    public void e(final boolean g) {
        this.g = g;
    }
    
    public void f(final int e) {
        this.e = e;
    }
    
    protected abstract com.twitter.library.service.d h();
    
    @Override
    public d m() {
        return this.n;
    }
}
