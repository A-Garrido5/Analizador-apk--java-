// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.app.Activity;
import android.view.LayoutInflater$Factory;

final class cw implements LayoutInflater$Factory
{
    private static final String[] z;
    final Activity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "DhbatLb(`nUviao\u000bp1=rKrcauDj(er@q(~~Ks(_rVrKvuPOrvvsocd";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001b';
                        break;
                    }
                    case 0: {
                        c2 = '%';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = '\u0006';
                        break;
                    }
                    case 3: {
                        c2 = '\u0013';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "Fik=zKbt|rA(o}o@thrw\u000bpovl\u000bkc}n\u000bJo`ohchfRQckEr@q";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    cw(final Activity a) {
        this.a = a;
    }
    
    public View onCreateView(final String p0, final Context p1, final AttributeSet p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getstatic       com/whatsapp/util/cw.z:[Ljava/lang/String;
        //     4: iconst_0       
        //     5: aaload         
        //     6: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //     9: ifne            28
        //    12: aload_1        
        //    13: getstatic       com/whatsapp/util/cw.z:[Ljava/lang/String;
        //    16: iconst_1       
        //    17: aaload         
        //    18: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    21: istore          8
        //    23: iload           8
        //    25: ifeq            109
        //    28: aload_2        
        //    29: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //    32: aload_1        
        //    33: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    36: ldc             Landroid/view/ViewGroup;.class
        //    38: invokevirtual   java/lang/Class.asSubclass:(Ljava/lang/Class;)Ljava/lang/Class;
        //    41: iconst_2       
        //    42: anewarray       Ljava/lang/Class;
        //    45: dup            
        //    46: iconst_0       
        //    47: ldc             Landroid/content/Context;.class
        //    49: aastore        
        //    50: dup            
        //    51: iconst_1       
        //    52: ldc             Landroid/util/AttributeSet;.class
        //    54: aastore        
        //    55: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    58: iconst_2       
        //    59: anewarray       Ljava/lang/Object;
        //    62: dup            
        //    63: iconst_0       
        //    64: aload_2        
        //    65: aastore        
        //    66: dup            
        //    67: iconst_1       
        //    68: aload_3        
        //    69: aastore        
        //    70: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    73: checkcast       Landroid/view/ViewGroup;
        //    76: astore          6
        //    78: new             Landroid/os/Handler;
        //    81: dup            
        //    82: invokespecial   android/os/Handler.<init>:()V
        //    85: new             Lcom/whatsapp/util/b2;
        //    88: dup            
        //    89: aload_0        
        //    90: aload           6
        //    92: invokespecial   com/whatsapp/util/b2.<init>:(Lcom/whatsapp/util/cw;Landroid/view/ViewGroup;)V
        //    95: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    98: pop            
        //    99: aload           6
        //   101: areturn        
        //   102: astore          4
        //   104: aload           4
        //   106: athrow         
        //   107: astore          5
        //   109: aconst_null    
        //   110: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      23     102    107    Ljava/lang/Exception;
        //  28     99     107    109    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
