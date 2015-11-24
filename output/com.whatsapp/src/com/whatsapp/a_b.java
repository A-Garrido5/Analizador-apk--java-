// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.app.Activity;
import java.util.ArrayList;

class a_b extends a_e
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "b\u0003w\u0000ts\u001fx\u0002xn\u00026\u0017rb\u0003l\u0018e,\u0003{\u0005ts\u001a|\u0004>e\u0005x\u001a~fC~\u001fwuL".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0011';
                    break;
                }
                case 0: {
                    c2 = '\u0001';
                    break;
                }
                case 1: {
                    c2 = 'l';
                    break;
                }
                case 2: {
                    c2 = '\u0019';
                    break;
                }
                case 3: {
                    c2 = 'v';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a_b(final Conversation a) {
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
        //     8: pop2           
        //     9: getstatic       com/whatsapp/aqz.a:[I
        //    12: aload_1        
        //    13: invokevirtual   com/whatsapp/h6.ordinal:()I
        //    16: iaload         
        //    17: istore          15
        //    19: iload           15
        //    21: tableswitch {
        //                2: 61
        //                3: 103
        //                4: 103
        //          default: 48
        //        }
        //    48: new             Ljava/lang/RuntimeException;
        //    51: dup            
        //    52: invokespecial   java/lang/RuntimeException.<init>:()V
        //    55: athrow         
        //    56: astore          14
        //    58: aload           14
        //    60: athrow         
        //    61: lload_2        
        //    62: lload           4
        //    64: lcmp           
        //    65: ifge            82
        //    68: aload_0        
        //    69: getfield        com/whatsapp/a_b.a:Lcom/whatsapp/Conversation;
        //    72: bipush          119
        //    74: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //    77: iload           6
        //    79: ifeq            118
        //    82: lload_2        
        //    83: lload           4
        //    85: lcmp           
        //    86: ifle            118
        //    89: aload_0        
        //    90: getfield        com/whatsapp/a_b.a:Lcom/whatsapp/Conversation;
        //    93: bipush          121
        //    95: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //    98: iload           6
        //   100: ifeq            118
        //   103: aload_0        
        //   104: getfield        com/whatsapp/a_b.a:Lcom/whatsapp/Conversation;
        //   107: lload_2        
        //   108: lload           4
        //   110: invokestatic    com/whatsapp/ade.a:(Landroid/app/Activity;JJ)V
        //   113: iload           6
        //   115: ifne            48
        //   118: return         
        //   119: astore          9
        //   121: aload           9
        //   123: athrow         
        //   124: astore          10
        //   126: aload           10
        //   128: athrow         
        //   129: astore          11
        //   131: aload           11
        //   133: athrow         
        //   134: astore          12
        //   136: aload           12
        //   138: athrow         
        //   139: astore          13
        //   141: aload           13
        //   143: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  9      19     119    129    Ljava/lang/RuntimeException;
        //  48     56     56     61     Ljava/lang/RuntimeException;
        //  68     77     129    139    Ljava/lang/RuntimeException;
        //  89     98     139    144    Ljava/lang/RuntimeException;
        //  103    113    56     61     Ljava/lang/RuntimeException;
        //  121    124    124    129    Ljava/lang/RuntimeException;
        //  126    129    129    139    Ljava/lang/RuntimeException;
        //  131    134    134    139    Ljava/lang/RuntimeException;
        //  136    139    139    144    Ljava/lang/RuntimeException;
        //  141    144    56     61     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 61, Size: 61
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
        final String a = ade.a(this.a, list);
        Log.i(a_b.z + a);
        this.a.f(a);
    }
}
