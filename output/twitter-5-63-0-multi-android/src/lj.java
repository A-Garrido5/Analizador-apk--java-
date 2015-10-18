import java.io.InputStream;
import com.twitter.library.provider.bg;
import com.twitter.library.api.ReferralCampaign;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class lj
{
    private static lj a;
    private Context b;
    
    private lj(final Context b) {
        this.b = b;
    }
    
    public static ReferralCampaign a(final String s) {
        return bg.a(lj.a.b, 0L).h(s);
    }
    
    public static void a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/fasterxml/jackson/core/JsonFactory;
        //     3: dup            
        //     4: invokespecial   com/fasterxml/jackson/core/JsonFactory.<init>:()V
        //     7: astore_1       
        //     8: aconst_null    
        //     9: astore_2       
        //    10: aload_1        
        //    11: aload_0        
        //    12: invokestatic    lj.b:(Landroid/content/Context;)Llj;
        //    15: invokevirtual   lj.a:()Ljava/io/InputStream;
        //    18: invokevirtual   com/fasterxml/jackson/core/JsonFactory.a:(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;
        //    21: astore          7
        //    23: aload           7
        //    25: astore_2       
        //    26: aload_2        
        //    27: invokevirtual   com/fasterxml/jackson/core/JsonParser.a:()Lcom/fasterxml/jackson/core/JsonToken;
        //    30: pop            
        //    31: aload_2        
        //    32: invokestatic    com/twitter/library/api/bh.aa:(Lcom/fasterxml/jackson/core/JsonParser;)Ljava/util/ArrayList;
        //    35: astore          10
        //    37: aload           10
        //    39: ifnull          53
        //    42: aload_0        
        //    43: lconst_0       
        //    44: invokestatic    com/twitter/library/provider/bg.a:(Landroid/content/Context;J)Lcom/twitter/library/provider/bg;
        //    47: aload           10
        //    49: invokevirtual   com/twitter/library/provider/bg.b:(Ljava/util/List;)I
        //    52: pop            
        //    53: aload_2        
        //    54: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    57: return         
        //    58: astore          6
        //    60: aload_2        
        //    61: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    64: return         
        //    65: astore_3       
        //    66: aconst_null    
        //    67: astore          4
        //    69: aload_3        
        //    70: astore          5
        //    72: aload           4
        //    74: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    77: aload           5
        //    79: athrow         
        //    80: astore          8
        //    82: aload_2        
        //    83: astore          4
        //    85: aload           8
        //    87: astore          5
        //    89: goto            72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     23     58     65     Ljava/io/IOException;
        //  10     23     65     72     Any
        //  26     37     58     65     Ljava/io/IOException;
        //  26     37     80     92     Any
        //  42     53     58     65     Ljava/io/IOException;
        //  42     53     80     92     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    public static lj b(final Context context) {
        if (lj.a == null) {
            lj.a = new lj(context);
        }
        return lj.a;
    }
    
    public InputStream a() {
        return this.b.getResources().openRawResource(this.b.getResources().getIdentifier("referral_campaigns", "raw", this.b.getPackageName()));
    }
}
