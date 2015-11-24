// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.AsyncTask;

public class a_k extends AsyncTask
{
    private static final String z;
    final Main a;
    
    static {
        final char[] charArray = "/?\u0000{Z%1\u001dz4!*\u0000c\u001c6'".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'u';
                    break;
                }
                case 0: {
                    c2 = 'B';
                    break;
                }
                case 1: {
                    c2 = '^';
                    break;
                }
                case 2: {
                    c2 = 'i';
                    break;
                }
                case 3: {
                    c2 = '\u0015';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public a_k(final Main a) {
        this.a = a;
    }
    
    protected Void a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: iconst_0       
        //     5: istore_3       
        //     6: getstatic       com/whatsapp/adc.e:Z
        //     9: istore          5
        //    11: iload           5
        //    13: ifeq            48
        //    16: iload_3        
        //    17: ldc             45000
        //    19: if_icmpge       48
        //    22: iinc_w          3, 200
        //    28: ldc2_w          200
        //    31: invokestatic    java/lang/Thread.sleep:(J)V
        //    34: goto            6
        //    37: astore          7
        //    39: aload           7
        //    41: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //    44: iload_2        
        //    45: ifeq            6
        //    48: iload_3        
        //    49: ldc             45000
        //    51: if_icmplt       63
        //    54: getstatic       com/whatsapp/adc.e:Z
        //    57: ifeq            63
        //    60: invokestatic    com/whatsapp/adc.e:()V
        //    63: aconst_null    
        //    64: areturn        
        //    65: astore          4
        //    67: aload           4
        //    69: athrow         
        //    70: astore          6
        //    72: aload           6
        //    74: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  6      11     65     70     Ljava/lang/InterruptedException;
        //  28     34     37     48     Ljava/lang/InterruptedException;
        //  54     63     70     75     Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
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
    
    protected void a(final Void void1) {
        this.a.removeDialog(104);
        Log.e(a_k.z);
        Main.c(this.a);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Void)o);
    }
    
    protected void onPreExecute() {
        if (!this.a.isFinishing()) {
            this.a.showDialog(104);
        }
    }
}
