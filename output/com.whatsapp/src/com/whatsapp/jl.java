// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.wallpaper.h;
import com.whatsapp.messaging.MessageService;
import android.content.Context;
import com.whatsapp.util.Log;
import android.os.AsyncTask;

public class jl extends AsyncTask
{
    private static final String[] z;
    boolean a;
    boolean b;
    final pr c;
    boolean d;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0011\u0014hc \u001e\u001cim5\u0013\u001ehoi\u0014\u0004yi#\u0014\u0002";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = 'g';
                        break;
                    }
                    case 1: {
                        c2 = 'q';
                        break;
                    }
                    case 2: {
                        c2 = '\u001a';
                        break;
                    }
                    case 3: {
                        c2 = '\n';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0011\u0014hc \u001e\u001cim5\u0013\u001ehoi\u0001\u0010sf#\u0003";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0011\u0014hc \u001e\u001cim5\u0013\u001ehoi\u0014\u0014tnk\u0006\u0012nc0\u0002";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public jl(final pr c, final boolean d, final boolean b, final boolean b2) {
        this.c = c;
        this.a = false;
        this.d = d;
        this.b = b2;
    }
    
    static void a(final jl jl, final Object[] array) {
        jl.publishProgress(array);
    }
    
    protected a8v a(final Object[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a8v.FAILED:Lcom/whatsapp/a8v;
        //     3: astore_2       
        //     4: new             Lcom/whatsapp/ado;
        //     7: dup            
        //     8: aload_0        
        //     9: invokespecial   com/whatsapp/ado.<init>:(Lcom/whatsapp/jl;)V
        //    12: astore_3       
        //    13: invokestatic    java/lang/System.currentTimeMillis:()J
        //    16: lstore          7
        //    18: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    21: aload_0        
        //    22: getfield        com/whatsapp/jl.d:Z
        //    25: aload_3        
        //    26: invokevirtual   com/whatsapp/vy.a:(ZLcom/whatsapp/awf;)Lcom/whatsapp/a8v;
        //    29: astore          9
        //    31: aload           9
        //    33: astore          5
        //    35: iconst_1       
        //    36: anewarray       Ljava/lang/Integer;
        //    39: astore          10
        //    41: aload           10
        //    43: iconst_0       
        //    44: bipush          100
        //    46: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    49: aastore        
        //    50: aload_0        
        //    51: aload           10
        //    53: invokevirtual   com/whatsapp/jl.publishProgress:([Ljava/lang/Object;)V
        //    56: invokestatic    java/lang/System.currentTimeMillis:()J
        //    59: lstore          11
        //    61: ldc2_w          3000
        //    64: lload           11
        //    66: lload           7
        //    68: lsub           
        //    69: lsub           
        //    70: lstore          13
        //    72: aload_0        
        //    73: getfield        com/whatsapp/jl.d:Z
        //    76: istore          17
        //    78: iload           17
        //    80: ifeq            95
        //    83: lload           13
        //    85: lconst_0       
        //    86: lcmp           
        //    87: ifle            95
        //    90: lload           13
        //    92: invokestatic    java/lang/Thread.sleep:(J)V
        //    95: aload           5
        //    97: areturn        
        //    98: astore          15
        //   100: aload           15
        //   102: athrow         
        //   103: astore          16
        //   105: aload           16
        //   107: athrow         
        //   108: astore          6
        //   110: aload           6
        //   112: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   115: aload_0        
        //   116: iconst_1       
        //   117: putfield        com/whatsapp/jl.a:Z
        //   120: aload           5
        //   122: areturn        
        //   123: astore          18
        //   125: aload           5
        //   127: areturn        
        //   128: astore          4
        //   130: aload_2        
        //   131: astore          5
        //   133: aload           4
        //   135: astore          6
        //   137: goto            110
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  13     31     128    140    Ljava/io/IOException;
        //  35     61     108    110    Ljava/io/IOException;
        //  72     78     98     103    Ljava/lang/InterruptedException;
        //  72     78     108    110    Ljava/io/IOException;
        //  90     95     123    128    Ljava/lang/InterruptedException;
        //  90     95     103    108    Ljava/io/IOException;
        //  100    103    103    108    Ljava/io/IOException;
        //  105    108    108    110    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0095:
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
    
    protected void a(final a8v a8v) {
        if (pr.b != null) {
            pr.a(this.c).removeDialog(100);
            pr.b = null;
        }
        App.ak.y();
        Label_0126: {
            if (a8v != a8v.FAILED) {
                Log.i(jl.z[0]);
                if (this.d && a8v == a8v.SUCCESS_CREATED) {
                    pr.a(this.c).showDialog(108);
                }
                App.ak.e();
                App.a1();
                App.ai();
                if (!this.c.a) {
                    App.r((Context)App.aq);
                    Log.i(jl.z[2]);
                    App.e(true);
                }
                App.aA();
                if (!App.I) {
                    break Label_0126;
                }
            }
            Log.i(jl.z[1]);
        }
        if (!this.c.a) {
            MessageService.b((Context)App.aq);
        }
        if (this.c.a && this.d) {
            h.b((Context)pr.a(this.c));
        }
        this.c.c();
        this.c.b();
    }
    
    public void a(final Integer[] array) {
        if (pr.b != null) {
            pr.b.setProgress((int)array[0]);
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a(array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((a8v)o);
    }
    
    public void onProgressUpdate(final Object[] array) {
        this.a((Integer[])array);
    }
}
