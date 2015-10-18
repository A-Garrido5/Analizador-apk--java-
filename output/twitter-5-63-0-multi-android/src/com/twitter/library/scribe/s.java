// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.util.Log;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.network.OAuthToken;
import android.content.Context;
import java.nio.charset.Charset;

public abstract class s
{
    protected static final Charset a;
    protected final Context b;
    protected final long c;
    protected final OAuthToken d;
    protected final ic e;
    protected final String f;
    protected final c g;
    protected final q h;
    protected final boolean i;
    protected final ScribeDatabaseHelper$LogType j;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public s(final Context b, final long c, final OAuthToken d, final ic e, final String f, final c g, final q h, final boolean i, final ScribeDatabaseHelper$LogType j) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    protected abstract int a(final Object p0);
    
    public final boolean a() {
        int n = 100;
        boolean b = true;
        boolean a;
        do {
            final String a2 = com.twitter.util.q.a(6);
            try {
                final Object b2 = this.b(a2, n);
                if (b2 != null) {
                    if (this.b(b2)) {
                        b = (a = this.a(b2, a2));
                        continue;
                    }
                }
            }
            catch (OutOfMemoryError outOfMemoryError) {
                ErrorReporter.a(outOfMemoryError);
                if (n != 20) {
                    if (this.i) {
                        Log.d("ScribeService", "OOM while flush user logs, tune down the log size");
                        n = 20;
                        a = true;
                    }
                    else {
                        n = 20;
                        a = true;
                    }
                }
                else {
                    if (this.i) {
                        Log.d("ScribeService", "OOM while flush user logs, abort");
                    }
                    b = false;
                    a = false;
                }
                this.g.a(a2, "0", this.j.toString());
                continue;
            }
            a = false;
        } while (a);
        return b;
    }
    
    protected final boolean a(final Object p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       6
        //     4: iconst_0       
        //     5: ireturn        
        //     6: aload_0        
        //     7: getfield        com/twitter/library/scribe/s.i:Z
        //    10: ifeq            21
        //    13: ldc             "ScribeService"
        //    15: ldc             "Starting request"
        //    17: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    20: pop            
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   com/twitter/library/scribe/s.a:(Ljava/lang/Object;)I
        //    26: istore          8
        //    28: iload           8
        //    30: istore          4
        //    32: aload_0        
        //    33: getfield        com/twitter/library/scribe/s.h:Lcom/twitter/library/scribe/q;
        //    36: invokeinterface com/twitter/library/scribe/q.a:()Z
        //    41: istore          10
        //    43: iload           10
        //    45: istore          5
        //    47: aload_0        
        //    48: getfield        com/twitter/library/scribe/s.h:Lcom/twitter/library/scribe/q;
        //    51: invokeinterface com/twitter/library/scribe/q.b:()I
        //    56: istore          12
        //    58: iload           5
        //    60: ifeq            125
        //    63: aload_0        
        //    64: getfield        com/twitter/library/scribe/s.i:Z
        //    67: ifeq            95
        //    70: ldc             "ScribeService"
        //    72: new             Ljava/lang/StringBuilder;
        //    75: dup            
        //    76: invokespecial   java/lang/StringBuilder.<init>:()V
        //    79: ldc             "request success reqId="
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: aload_2        
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    91: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    94: pop            
        //    95: aload_0        
        //    96: getfield        com/twitter/library/scribe/s.g:Lcom/twitter/library/scribe/c;
        //    99: aload_2        
        //   100: invokeinterface com/twitter/library/scribe/c.a:(Ljava/lang/String;)V
        //   105: aload_0        
        //   106: getfield        com/twitter/library/scribe/s.e:Lic;
        //   109: ifnull          122
        //   112: aload_0        
        //   113: getfield        com/twitter/library/scribe/s.e:Lic;
        //   116: iload           4
        //   118: i2l            
        //   119: invokevirtual   ic.a:(J)V
        //   122: iload           5
        //   124: ireturn        
        //   125: aload_0        
        //   126: getfield        com/twitter/library/scribe/s.i:Z
        //   129: ifeq            167
        //   132: ldc             "ScribeService"
        //   134: new             Ljava/lang/StringBuilder;
        //   137: dup            
        //   138: invokespecial   java/lang/StringBuilder.<init>:()V
        //   141: ldc             "request failed reqId="
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: aload_2        
        //   147: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   150: ldc             " statusCode="
        //   152: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   155: iload           12
        //   157: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   160: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   163: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   166: pop            
        //   167: iload           12
        //   169: ifeq            182
        //   172: aload_0        
        //   173: getfield        com/twitter/library/scribe/s.g:Lcom/twitter/library/scribe/c;
        //   176: aload_2        
        //   177: invokeinterface com/twitter/library/scribe/c.b:(Ljava/lang/String;)V
        //   182: aload_0        
        //   183: getfield        com/twitter/library/scribe/s.g:Lcom/twitter/library/scribe/c;
        //   186: aload_2        
        //   187: iconst_0       
        //   188: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   191: aload_0        
        //   192: getfield        com/twitter/library/scribe/s.j:Lcom/twitter/library/scribe/ScribeDatabaseHelper$LogType;
        //   195: invokevirtual   com/twitter/library/scribe/ScribeDatabaseHelper$LogType.toString:()Ljava/lang/String;
        //   198: invokeinterface com/twitter/library/scribe/c.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   203: aload_0        
        //   204: getfield        com/twitter/library/scribe/s.g:Lcom/twitter/library/scribe/c;
        //   207: invokeinterface com/twitter/library/scribe/c.a:()V
        //   212: goto            122
        //   215: astore_3       
        //   216: iconst_0       
        //   217: istore          4
        //   219: iconst_0       
        //   220: istore          5
        //   222: iload           5
        //   224: ifeq            289
        //   227: aload_0        
        //   228: getfield        com/twitter/library/scribe/s.i:Z
        //   231: ifeq            259
        //   234: ldc             "ScribeService"
        //   236: new             Ljava/lang/StringBuilder;
        //   239: dup            
        //   240: invokespecial   java/lang/StringBuilder.<init>:()V
        //   243: ldc             "request success reqId="
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: aload_2        
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   255: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   258: pop            
        //   259: aload_0        
        //   260: getfield        com/twitter/library/scribe/s.g:Lcom/twitter/library/scribe/c;
        //   263: aload_2        
        //   264: invokeinterface com/twitter/library/scribe/c.a:(Ljava/lang/String;)V
        //   269: aload_0        
        //   270: getfield        com/twitter/library/scribe/s.e:Lic;
        //   273: ifnull          286
        //   276: aload_0        
        //   277: getfield        com/twitter/library/scribe/s.e:Lic;
        //   280: iload           4
        //   282: i2l            
        //   283: invokevirtual   ic.a:(J)V
        //   286: iload           5
        //   288: ireturn        
        //   289: aload_0        
        //   290: getfield        com/twitter/library/scribe/s.i:Z
        //   293: ifeq            330
        //   296: ldc             "ScribeService"
        //   298: new             Ljava/lang/StringBuilder;
        //   301: dup            
        //   302: invokespecial   java/lang/StringBuilder.<init>:()V
        //   305: ldc             "request failed reqId="
        //   307: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   310: aload_2        
        //   311: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   314: ldc             " statusCode="
        //   316: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   319: iconst_0       
        //   320: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   323: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   326: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   329: pop            
        //   330: aload_0        
        //   331: getfield        com/twitter/library/scribe/s.g:Lcom/twitter/library/scribe/c;
        //   334: aload_2        
        //   335: iconst_0       
        //   336: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   339: aload_0        
        //   340: getfield        com/twitter/library/scribe/s.j:Lcom/twitter/library/scribe/ScribeDatabaseHelper$LogType;
        //   343: invokevirtual   com/twitter/library/scribe/ScribeDatabaseHelper$LogType.toString:()Ljava/lang/String;
        //   346: invokeinterface com/twitter/library/scribe/c.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   351: aload_0        
        //   352: getfield        com/twitter/library/scribe/s.g:Lcom/twitter/library/scribe/c;
        //   355: invokeinterface com/twitter/library/scribe/c.a:()V
        //   360: goto            286
        //   363: astore          9
        //   365: iconst_0       
        //   366: istore          5
        //   368: goto            222
        //   371: astore          11
        //   373: goto            222
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  21     28     215    222    Any
        //  32     43     363    371    Any
        //  47     58     371    376    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 166, Size: 166
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
    
    protected abstract Object b(final String p0, final int p1);
    
    protected abstract boolean b(final Object p0);
}
