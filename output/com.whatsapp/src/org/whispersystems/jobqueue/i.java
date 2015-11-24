// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import java.util.Arrays;
import org.whispersystems.jobqueue.requirements.c;
import java.util.List;
import android.content.Context;

public class i
{
    private static final String z;
    private final Context a;
    private String b;
    private j c;
    private int d;
    private List e;
    private d f;
    
    static {
        final char[] charArray = "r\u0003bG(^\u001fcG6[\tt\u000e#RLvG+J\u0001rF".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'E';
                    break;
                }
                case 0: {
                    c2 = '+';
                    break;
                }
                case 1: {
                    c2 = 'l';
                    break;
                }
                case 2: {
                    c2 = '\u0017';
                    break;
                }
                case 3: {
                    c2 = 'g';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    i(final Context a) {
        this.a = a;
        this.d = 5;
    }
    
    public i a(final int d) {
        this.d = d;
        return this;
    }
    
    public i a(final String b) {
        this.b = b;
        return this;
    }
    
    public i a(final d f) {
        this.f = f;
        return this;
    }
    
    public i a(final j c) {
        this.c = c;
        return this;
    }
    
    public i a(final c[] array) {
        this.e = Arrays.asList(array);
        return this;
    }
    
    public v a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/jobqueue/v.h:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        org/whispersystems/jobqueue/i.b:Ljava/lang/String;
        //     8: ifnonnull       25
        //    11: new             Ljava/lang/IllegalArgumentException;
        //    14: dup            
        //    15: getstatic       org/whispersystems/jobqueue/i.z:Ljava/lang/String;
        //    18: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    21: athrow         
        //    22: astore_2       
        //    23: aload_2        
        //    24: athrow         
        //    25: aload_0        
        //    26: getfield        org/whispersystems/jobqueue/i.e:Ljava/util/List;
        //    29: ifnonnull       43
        //    32: aload_0        
        //    33: new             Ljava/util/LinkedList;
        //    36: dup            
        //    37: invokespecial   java/util/LinkedList.<init>:()V
        //    40: putfield        org/whispersystems/jobqueue/i.e:Ljava/util/List;
        //    43: new             Lorg/whispersystems/jobqueue/v;
        //    46: dup            
        //    47: aload_0        
        //    48: getfield        org/whispersystems/jobqueue/i.a:Landroid/content/Context;
        //    51: aload_0        
        //    52: getfield        org/whispersystems/jobqueue/i.b:Ljava/lang/String;
        //    55: aload_0        
        //    56: getfield        org/whispersystems/jobqueue/i.e:Ljava/util/List;
        //    59: aload_0        
        //    60: getfield        org/whispersystems/jobqueue/i.c:Lorg/whispersystems/jobqueue/j;
        //    63: aload_0        
        //    64: getfield        org/whispersystems/jobqueue/i.f:Lorg/whispersystems/jobqueue/d;
        //    67: aload_0        
        //    68: getfield        org/whispersystems/jobqueue/i.d:I
        //    71: aconst_null    
        //    72: invokespecial   org/whispersystems/jobqueue/v.<init>:(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lorg/whispersystems/jobqueue/j;Lorg/whispersystems/jobqueue/d;ILorg/whispersystems/jobqueue/w;)V
        //    75: astore          4
        //    77: getstatic       org/whispersystems/jobqueue/a.a:Z
        //    80: istore          7
        //    82: iload           7
        //    84: ifeq            99
        //    87: iload_1        
        //    88: ifeq            115
        //    91: iconst_0       
        //    92: istore          8
        //    94: iload           8
        //    96: putstatic       org/whispersystems/jobqueue/v.h:Z
        //    99: aload           4
        //   101: areturn        
        //   102: astore_3       
        //   103: aload_3        
        //   104: athrow         
        //   105: astore          5
        //   107: aload           5
        //   109: athrow         
        //   110: astore          6
        //   112: aload           6
        //   114: athrow         
        //   115: iconst_1       
        //   116: istore          8
        //   118: goto            94
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      22     22     25     Ljava/lang/IllegalArgumentException;
        //  25     43     102    105    Ljava/lang/IllegalArgumentException;
        //  43     82     105    115    Ljava/lang/IllegalArgumentException;
        //  107    110    110    115    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
