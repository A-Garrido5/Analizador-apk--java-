// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.network.a;
import com.twitter.library.network.t;
import com.twitter.library.network.g;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.io.UnsupportedEncodingException;
import org.apache.http.entity.StringEntity;
import java.util.List;
import com.twitter.library.util.bn;
import java.util.ArrayList;
import com.twitter.library.util.bd;
import java.io.IOException;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.internal.network.q;
import com.twitter.library.network.l;
import android.net.Uri;
import org.apache.http.HttpEntity;
import com.twitter.internal.network.j;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.ab;
import android.content.Context;

public class ah
{
    public final Context a;
    public final ab b;
    public StringBuilder c;
    public HttpOperation$RequestMethod d;
    public j e;
    public int f;
    public HttpEntity g;
    
    public ah(final Context a, final ab b) {
        this.a = a;
        this.b = b;
        this.d = HttpOperation$RequestMethod.b;
        this.f = 60000;
    }
    
    public ah a() {
        final ah ah = new ah(this.a, this.b);
        String string;
        if (this.c == null) {
            string = "";
        }
        else {
            string = this.c.toString();
        }
        ah.c = new StringBuilder(string);
        ah.d = this.d;
        ah.e = this.e;
        ah.f = this.f;
        ah.g = this.g;
        return ah;
    }
    
    public ah a(final j e) {
        this.e = e;
        return this;
    }
    
    public ah a(final String s, final Uri uri) {
        while (true) {
            Label_0051: {
                if (uri == null) {
                    break Label_0051;
                }
                try {
                    final Object g = new l(this.a, null);
                    ((l)g).a(s, com.twitter.util.q.a(8), uri);
                    ((l)g).a();
                    this.g = (HttpEntity)g;
                    return this;
                }
                catch (IOException ex) {
                    ErrorReporter.a(ex);
                    final Object g = null;
                    continue;
                }
            }
            final Object g = null;
            continue;
        }
    }
    
    public ah a(final String p0, final bd p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/twitter/library/network/l;
        //     3: dup            
        //     4: aload_0        
        //     5: getfield        com/twitter/library/api/upload/ah.a:Landroid/content/Context;
        //     8: aconst_null    
        //     9: invokespecial   com/twitter/library/network/l.<init>:(Landroid/content/Context;Lcom/twitter/internal/network/q;)V
        //    12: astore          4
        //    14: aload           4
        //    16: aload_1        
        //    17: bipush          8
        //    19: invokestatic    com/twitter/util/q.a:(I)Ljava/lang/String;
        //    22: aload_2        
        //    23: iload_3        
        //    24: invokevirtual   com/twitter/library/network/l.a:(Ljava/lang/String;Ljava/lang/String;Lcom/twitter/library/util/bd;I)V
        //    27: aload           4
        //    29: invokevirtual   com/twitter/library/network/l.a:()V
        //    32: aload_0        
        //    33: aload           4
        //    35: putfield        com/twitter/library/api/upload/ah.g:Lorg/apache/http/HttpEntity;
        //    38: aload_0        
        //    39: areturn        
        //    40: astore          6
        //    42: aconst_null    
        //    43: astore          4
        //    45: goto            32
        //    48: astore          5
        //    50: goto            32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      14     40     48     Ljava/io/IOException;
        //  14     32     48     53     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    public ah a(final StringBuilder c) {
        this.c = c;
        return this;
    }
    
    public ah a(final ArrayList list) {
        if (list == null || list.isEmpty()) {
            return this;
        }
        try {
            final String a = bn.a(list);
            if (a != null) {
                this.g = (HttpEntity)new StringEntity(a, "UTF-8");
                ((StringEntity)this.g).setContentType("application/x-www-form-urlencoded");
            }
            return this;
        }
        catch (UnsupportedEncodingException ex) {
            return this;
        }
    }
    
    public aa a(final HttpOperation httpOperation, final aa aa) {
        if (httpOperation != null) {
            aa.a(httpOperation);
            return aa;
        }
        aa.a(false);
        return aa;
    }
    
    public StringBuilder b() {
        return this.c;
    }
    
    public HttpOperation c() {
        if (this.c == null) {
            throw new IllegalStateException();
        }
        final HttpOperation a = new g(this.a, this.c).a(this.b.c).a(this.d).b("Uploads are always triggered by a user action.").a(new t(this.b.d)).a(this.e).a(this.g).a();
        if (this.f > 0) {
            a.a(this.f);
        }
        return a;
    }
}
