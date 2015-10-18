// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.fasterxml.jackson.core.JsonGenerator;

public class e
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public long i;
    public int j;
    
    public e() {
        this.i = -1L;
        this.j = -1;
    }
    
    private void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        jsonGenerator.e("amplify_details");
        if (this.h != null) {
            jsonGenerator.a("playlist_url", this.h);
        }
        if (this.g != null) {
            jsonGenerator.a("content_id", this.g);
        }
        if (this.a != null) {
            jsonGenerator.a("video_uuid", this.a);
        }
        if (this.b != null) {
            jsonGenerator.a("video_type", this.b);
        }
        if (this.c != null) {
            jsonGenerator.a("cta_url", this.c);
        }
        if (this.d != null) {
            jsonGenerator.a("play_store_id", this.d);
        }
        if (this.e != null) {
            jsonGenerator.a("play_store_name", this.e);
        }
        if (this.f != null) {
            jsonGenerator.a("preroll_uuid", this.f);
        }
        if (this.j != -1) {
            jsonGenerator.a("dynamic_preroll_type", this.j);
        }
        if (this.i != -1L) {
            jsonGenerator.a("preroll_owner_id", this.i);
        }
        jsonGenerator.d();
        jsonGenerator.d();
    }
    
    public String a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/StringWriter;
        //     3: dup            
        //     4: invokespecial   java/io/StringWriter.<init>:()V
        //     7: astore_1       
        //     8: new             Lcom/fasterxml/jackson/core/JsonFactory;
        //    11: dup            
        //    12: invokespecial   com/fasterxml/jackson/core/JsonFactory.<init>:()V
        //    15: aload_1        
        //    16: invokevirtual   com/fasterxml/jackson/core/JsonFactory.a:(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;
        //    19: astore          6
        //    21: aload           6
        //    23: astore_3       
        //    24: aload_0        
        //    25: aload_3        
        //    26: invokespecial   com/twitter/library/av/e.a:(Lcom/fasterxml/jackson/core/JsonGenerator;)V
        //    29: aload_3        
        //    30: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.flush:()V
        //    33: aload_1        
        //    34: invokevirtual   java/io/StringWriter.getBuffer:()Ljava/lang/StringBuffer;
        //    37: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //    40: astore          8
        //    42: aload_3        
        //    43: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    46: aload           8
        //    48: areturn        
        //    49: astore          5
        //    51: aconst_null    
        //    52: astore_3       
        //    53: aload_3        
        //    54: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    57: ldc             ""
        //    59: areturn        
        //    60: astore_2       
        //    61: aconst_null    
        //    62: astore_3       
        //    63: aload_2        
        //    64: astore          4
        //    66: aload_3        
        //    67: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    70: aload           4
        //    72: athrow         
        //    73: astore          4
        //    75: goto            66
        //    78: astore          7
        //    80: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      21     49     53     Ljava/io/IOException;
        //  0      21     60     66     Any
        //  24     42     78     83     Ljava/io/IOException;
        //  24     42     73     78     Any
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
}
