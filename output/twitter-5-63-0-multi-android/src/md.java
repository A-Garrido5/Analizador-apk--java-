import com.twitter.library.service.d;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.List;
import java.util.Map;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class md extends c
{
    Map a;
    List e;
    final mf f;
    
    protected md(final Context context, final Session session) {
        this(context, md.class.getName(), session, new mf());
    }
    
    protected md(final Context context, final String s, final Session session, final mf f) {
        super(context, s, session);
        this.b(1);
        this.a(1);
        this.f = f;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "videoads/prerolls" });
        final String f = this.f();
        if (f != null) {
            a.a("tweets", f);
        }
        return a.a();
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        if (this.X()) {
            this.a = this.f.c();
        }
    }
    
    public void a(final List e) {
        if (e != null && e.size() > 10) {
            throw new IllegalArgumentException(String.format("Too many tweets %d, max %d", e.size(), 10));
        }
        this.e = e;
    }
    
    public Map b() {
        return this.a;
    }
    
    public List e() {
        return this.e;
    }
    
    String f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/io/StringWriter.<init>:()V
        //     7: astore_1       
        //     8: iconst_0       
        //     9: istore_2       
        //    10: getstatic       com/twitter/library/api/bh.a:Lcom/fasterxml/jackson/core/JsonFactory;
        //    13: aload_1        
        //    14: invokevirtual   com/fasterxml/jackson/core/JsonFactory.a:(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;
        //    17: astore          7
        //    19: aload           7
        //    21: astore          6
        //    23: aload           6
        //    25: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.c:()V
        //    28: aload           6
        //    30: ldc             "tweets"
        //    32: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.d:(Ljava/lang/String;)V
        //    35: aload_0        
        //    36: getfield        md.e:Ljava/util/List;
        //    39: astore          9
        //    41: iconst_0       
        //    42: istore_2       
        //    43: aload           9
        //    45: ifnull          162
        //    48: aload_0        
        //    49: getfield        md.e:Ljava/util/List;
        //    52: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    57: astore          10
        //    59: iconst_0       
        //    60: istore          11
        //    62: aload           10
        //    64: invokeinterface java/util/Iterator.hasNext:()Z
        //    69: ifeq            159
        //    72: aload           10
        //    74: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    79: checkcast       Lcom/twitter/library/av/a;
        //    82: astore          13
        //    84: iinc            11, 1
        //    87: aload           6
        //    89: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.c:()V
        //    92: aload           6
        //    94: ldc             "tweet_id"
        //    96: aload           13
        //    98: getfield        com/twitter/library/av/a.a:J
        //   101: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;J)V
        //   104: aload           13
        //   106: getfield        com/twitter/library/av/a.b:Lcom/twitter/library/api/PromotedContent;
        //   109: astore          14
        //   111: aload           14
        //   113: ifnull          128
        //   116: aload           6
        //   118: ldc             "impression_id"
        //   120: aload           14
        //   122: getfield        com/twitter/library/api/PromotedContent.impressionId:Ljava/lang/String;
        //   125: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   128: aload           6
        //   130: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.d:()V
        //   133: goto            62
        //   136: astore          12
        //   138: iload           11
        //   140: istore_2       
        //   141: aload           6
        //   143: astore          4
        //   145: aload           4
        //   147: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   150: iload_2        
        //   151: ifle            193
        //   154: aload_1        
        //   155: invokevirtual   java/io/StringWriter.toString:()Ljava/lang/String;
        //   158: areturn        
        //   159: iload           11
        //   161: istore_2       
        //   162: aload           6
        //   164: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.b:()V
        //   167: aload           6
        //   169: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.flush:()V
        //   172: aload           6
        //   174: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   177: goto            150
        //   180: astore          5
        //   182: aconst_null    
        //   183: astore          6
        //   185: aload           6
        //   187: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   190: aload           5
        //   192: athrow         
        //   193: aconst_null    
        //   194: areturn        
        //   195: astore          5
        //   197: goto            185
        //   200: astore_3       
        //   201: iconst_0       
        //   202: istore_2       
        //   203: aconst_null    
        //   204: astore          4
        //   206: goto            145
        //   209: astore          8
        //   211: aload           6
        //   213: astore          4
        //   215: goto            145
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     19     200    209    Ljava/io/IOException;
        //  10     19     180    185    Any
        //  23     41     209    218    Ljava/io/IOException;
        //  23     41     195    200    Any
        //  48     59     209    218    Ljava/io/IOException;
        //  48     59     195    200    Any
        //  62     84     136    145    Ljava/io/IOException;
        //  62     84     195    200    Any
        //  87     111    136    145    Ljava/io/IOException;
        //  87     111    195    200    Any
        //  116    128    136    145    Ljava/io/IOException;
        //  116    128    195    200    Any
        //  128    133    136    145    Ljava/io/IOException;
        //  128    133    195    200    Any
        //  162    172    209    218    Ljava/io/IOException;
        //  162    172    195    200    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0062:
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
    
    protected mf g() {
        return this.f;
    }
}
