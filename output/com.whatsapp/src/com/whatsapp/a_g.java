// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import java.util.ArrayList;

class a_g extends a_e
{
    private static final String z;
    final AccountInfoActivity a;
    
    static {
        final char[] charArray = "keD\u0013\u0014dr\n\u0015\u000fli\b\u001d\u0002iiR\u0012\u0015'iE\u000f\u0004xpB\u000eNinF\u0012\u0006ob\u0007\u000e\u0004kuH\u0012\\/u\u0007\u0013\rn;\u0002\u0018AdcPADn&I\u0013\u00167#C".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'a';
                    break;
                }
                case 0: {
                    c2 = '\n';
                    break;
                }
                case 1: {
                    c2 = '\u0006';
                    break;
                }
                case 2: {
                    c2 = '\'';
                    break;
                }
                case 3: {
                    c2 = '|';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a_g(final AccountInfoActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final h6 p0, final long p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          6
        //     5: invokestatic    java/lang/System.currentTimeMillis:()J
        //     8: lstore          7
        //    10: getstatic       com/whatsapp/a_g.z:Ljava/lang/String;
        //    13: astore          15
        //    15: iconst_4       
        //    16: anewarray       Ljava/lang/Object;
        //    19: astore          16
        //    21: aload           16
        //    23: iconst_0       
        //    24: aload_1        
        //    25: aastore        
        //    26: aload           16
        //    28: iconst_1       
        //    29: lload_2        
        //    30: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    33: aastore        
        //    34: aload           16
        //    36: iconst_2       
        //    37: lload           4
        //    39: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    42: aastore        
        //    43: aload           16
        //    45: iconst_3       
        //    46: lload           7
        //    48: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    51: aastore        
        //    52: aload           15
        //    54: aconst_null    
        //    55: aload           16
        //    57: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //    60: getstatic       com/whatsapp/we.a:[I
        //    63: aload_1        
        //    64: invokevirtual   com/whatsapp/h6.ordinal:()I
        //    67: iaload         
        //    68: istore          17
        //    70: iload           17
        //    72: tableswitch {
        //                2: 113
        //                3: 160
        //                4: 160
        //          default: 100
        //        }
        //   100: new             Ljava/lang/RuntimeException;
        //   103: dup            
        //   104: invokespecial   java/lang/RuntimeException.<init>:()V
        //   107: athrow         
        //   108: astore          14
        //   110: aload           14
        //   112: athrow         
        //   113: lload_2        
        //   114: lload           4
        //   116: lcmp           
        //   117: ifge            138
        //   120: aload_0        
        //   121: getfield        com/whatsapp/a_g.a:Lcom/whatsapp/AccountInfoActivity;
        //   124: invokestatic    com/whatsapp/AccountInfoActivity.o:(Lcom/whatsapp/AccountInfoActivity;)Landroid/os/Handler;
        //   127: bipush          9
        //   129: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   132: pop            
        //   133: iload           6
        //   135: ifeq            175
        //   138: lload_2        
        //   139: lload           4
        //   141: lcmp           
        //   142: ifle            175
        //   145: aload_0        
        //   146: getfield        com/whatsapp/a_g.a:Lcom/whatsapp/AccountInfoActivity;
        //   149: lload_2        
        //   150: lload           4
        //   152: invokestatic    com/whatsapp/ade.a:(Landroid/app/Activity;JJ)V
        //   155: iload           6
        //   157: ifeq            175
        //   160: aload_0        
        //   161: getfield        com/whatsapp/a_g.a:Lcom/whatsapp/AccountInfoActivity;
        //   164: lload_2        
        //   165: lload           4
        //   167: invokestatic    com/whatsapp/ade.a:(Landroid/app/Activity;JJ)V
        //   170: iload           6
        //   172: ifne            100
        //   175: aload_0        
        //   176: getfield        com/whatsapp/a_g.a:Lcom/whatsapp/AccountInfoActivity;
        //   179: invokestatic    com/whatsapp/AccountInfoActivity.o:(Lcom/whatsapp/AccountInfoActivity;)Landroid/os/Handler;
        //   182: iconst_5       
        //   183: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   186: pop            
        //   187: return         
        //   188: astore          9
        //   190: aload           9
        //   192: athrow         
        //   193: astore          10
        //   195: aload           10
        //   197: athrow         
        //   198: astore          11
        //   200: aload           11
        //   202: athrow         
        //   203: astore          12
        //   205: aload           12
        //   207: athrow         
        //   208: astore          13
        //   210: aload           13
        //   212: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  10     70     188    198    Ljava/lang/RuntimeException;
        //  100    108    108    113    Ljava/lang/RuntimeException;
        //  120    133    198    208    Ljava/lang/RuntimeException;
        //  145    155    208    213    Ljava/lang/RuntimeException;
        //  160    170    108    113    Ljava/lang/RuntimeException;
        //  190    193    193    198    Ljava/lang/RuntimeException;
        //  195    198    198    208    Ljava/lang/RuntimeException;
        //  200    203    203    208    Ljava/lang/RuntimeException;
        //  205    208    208    213    Ljava/lang/RuntimeException;
        //  210    213    108    113    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 98, Size: 98
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
    
    @Override
    public void a(final h6 h6, final long n, final long n2, final ArrayList list) {
        AccountInfoActivity.o(this.a).sendMessage(AccountInfoActivity.o(this.a).obtainMessage(11, (Object)ade.a(this.a, list)));
    }
}
