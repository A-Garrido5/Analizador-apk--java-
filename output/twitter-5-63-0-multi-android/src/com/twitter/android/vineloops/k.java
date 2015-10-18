// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import com.twitter.library.service.aa;
import com.twitter.internal.network.j;
import org.apache.http.HttpEntity;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.g;
import org.apache.http.entity.StringEntity;
import com.twitter.internal.network.HttpOperation;
import org.json.JSONObject;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.n;
import java.util.concurrent.TimeUnit;
import com.twitter.library.network.ae;
import android.content.Context;
import com.twitter.internal.android.service.a;

class k extends a
{
    final /* synthetic */ i a;
    private final Context e;
    private final String f;
    private final String g;
    
    public k(final i a, final Context context) {
        this.a = a;
        super(k.class.getName());
        this.e = context.getApplicationContext();
        final ae a2 = ae.a(this.e);
        this.f = a2.h.toString();
        this.g = String.format("%s/%s", "tw_android", a2.j);
        this.a(new n(5, 10000L, 600000L, TimeUnit.MILLISECONDS, com.twitter.android.vineloops.i.a, com.twitter.android.vineloops.i.b));
    }
    
    HttpOperation a(final JSONObject jsonObject, final ww ww) {
        final StringEntity stringEntity = new StringEntity(jsonObject.toString(), "UTF-8");
        stringEntity.setContentType("application/json");
        return new g(this.e, "https://api.vineapp.com/loops").a(HttpOperation$RequestMethod.b).a((HttpEntity)stringEntity).a(ww).c(false).a();
    }
    
    protected aa a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/android/vineloops/k.e:Landroid/content/Context;
        //     4: invokestatic    com/twitter/android/vineloops/VineLoopAggregator.a:(Landroid/content/Context;)Lcom/twitter/android/vineloops/VineLoopAggregator;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokevirtual   com/twitter/android/vineloops/VineLoopAggregator.b:()Ljava/util/List;
        //    12: astore_2       
        //    13: new             Lcom/twitter/library/service/aa;
        //    16: dup            
        //    17: invokespecial   com/twitter/library/service/aa.<init>:()V
        //    20: astore_3       
        //    21: aload_3        
        //    22: iconst_1       
        //    23: invokevirtual   com/twitter/library/service/aa.a:(Z)V
        //    26: aload_2        
        //    27: invokeinterface java/util/List.isEmpty:()Z
        //    32: ifeq            37
        //    35: aload_3        
        //    36: areturn        
        //    37: aload_2        
        //    38: invokestatic    com/twitter/android/vineloops/i.a:(Ljava/util/List;)Lorg/json/JSONObject;
        //    41: astore          5
        //    43: new             Lww;
        //    46: dup            
        //    47: invokespecial   ww.<init>:()V
        //    50: astore          6
        //    52: aload_0        
        //    53: aload           5
        //    55: aload           6
        //    57: invokevirtual   com/twitter/android/vineloops/k.a:(Lorg/json/JSONObject;Lww;)Lcom/twitter/internal/network/HttpOperation;
        //    60: astore          8
        //    62: aload           8
        //    64: ldc             "User-Agent"
        //    66: aload_0        
        //    67: getfield        com/twitter/android/vineloops/k.f:Ljava/lang/String;
        //    70: invokevirtual   com/twitter/internal/network/HttpOperation.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/twitter/internal/network/HttpOperation;
        //    73: pop            
        //    74: aload           8
        //    76: ldc             "X-Vine-Client"
        //    78: aload_0        
        //    79: getfield        com/twitter/android/vineloops/k.g:Ljava/lang/String;
        //    82: invokevirtual   com/twitter/internal/network/HttpOperation.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/twitter/internal/network/HttpOperation;
        //    85: pop            
        //    86: aload           8
        //    88: invokevirtual   com/twitter/internal/network/HttpOperation.c:()Lcom/twitter/internal/network/HttpOperation;
        //    91: pop            
        //    92: aload           8
        //    94: invokevirtual   com/twitter/internal/network/HttpOperation.l:()Lcom/twitter/internal/network/l;
        //    97: astore          12
        //    99: aload           8
        //   101: invokevirtual   com/twitter/internal/network/HttpOperation.k:()Z
        //   104: ifne            240
        //   107: aload           12
        //   109: getfield        com/twitter/internal/network/l.d:Z
        //   112: ifne            163
        //   115: aload           12
        //   117: getfield        com/twitter/internal/network/l.a:I
        //   120: ifeq            163
        //   123: new             Lcom/twitter/errorreporter/a;
        //   126: dup            
        //   127: invokespecial   com/twitter/errorreporter/a.<init>:()V
        //   130: ldc             "statusCode"
        //   132: aload           12
        //   134: getfield        com/twitter/internal/network/l.a:I
        //   137: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   140: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   143: ldc             "json"
        //   145: aload           5
        //   147: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   150: new             Ljava/lang/Throwable;
        //   153: dup            
        //   154: invokespecial   java/lang/Throwable.<init>:()V
        //   157: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //   160: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Lcom/twitter/errorreporter/a;)V
        //   163: aload_1        
        //   164: aload_2        
        //   165: invokevirtual   com/twitter/android/vineloops/VineLoopAggregator.a:(Ljava/util/List;)V
        //   168: aload_0        
        //   169: getfield        com/twitter/android/vineloops/k.a:Lcom/twitter/android/vineloops/i;
        //   172: sipush          10000
        //   175: invokevirtual   com/twitter/android/vineloops/i.a:(I)V
        //   178: aload_3        
        //   179: aload           12
        //   181: getfield        com/twitter/internal/network/l.a:I
        //   184: invokevirtual   com/twitter/library/service/aa.a:(I)V
        //   187: aload_3        
        //   188: areturn        
        //   189: astore          4
        //   191: new             Lcom/twitter/errorreporter/a;
        //   194: dup            
        //   195: invokespecial   com/twitter/errorreporter/a.<init>:()V
        //   198: ldc             "records"
        //   200: aload_2        
        //   201: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   204: aload           4
        //   206: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //   209: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Lcom/twitter/errorreporter/a;)V
        //   212: aload_3        
        //   213: areturn        
        //   214: astore          7
        //   216: new             Lcom/twitter/errorreporter/a;
        //   219: dup            
        //   220: invokespecial   com/twitter/errorreporter/a.<init>:()V
        //   223: ldc             "json"
        //   225: aload           5
        //   227: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   230: aload           7
        //   232: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //   235: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Lcom/twitter/errorreporter/a;)V
        //   238: aload_3        
        //   239: areturn        
        //   240: aload_0        
        //   241: getfield        com/twitter/android/vineloops/k.a:Lcom/twitter/android/vineloops/i;
        //   244: aload           6
        //   246: invokevirtual   ww.c:()Ljava/lang/Integer;
        //   249: invokevirtual   java/lang/Integer.intValue:()I
        //   252: invokevirtual   com/twitter/android/vineloops/i.a:(I)V
        //   255: aload_3        
        //   256: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  37     43     189    214    Lorg/json/JSONException;
        //  52     86     214    240    Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0163:
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
    
    protected aa b() {
        final aa aa = new aa();
        aa.a(false);
        return aa;
    }
}
