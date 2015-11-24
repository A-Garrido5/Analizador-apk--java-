// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.aQ;

public final class tb implements aQ
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0015>\r\u001dA *.\u001eI3#\u0010Q\u0006";
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
                        c2 = '.';
                        break;
                    }
                    case 0: {
                        c2 = 'T';
                        break;
                    }
                    case 1: {
                        c2 = 'F';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = 'q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "!(\u0010\u0014M;!\f\u0018T1\"B\u0001\\=)\u0010\u0018Z-fJ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "}|B";
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
    
    @Override
    public void a(final int p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/ha.c:I
        //     3: istore          4
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/tb.z:[Ljava/lang/String;
        //    15: iconst_0       
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: aload_2        
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    24: getstatic       com/whatsapp/tb.z:[Ljava/lang/String;
        //    27: iconst_2       
        //    28: aaload         
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: aload_3        
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: astore          5
        //    41: iload_1        
        //    42: tableswitch {
        //                4: 165
        //                5: 160
        //                6: 150
        //                7: 140
        //                8: 130
        //                9: 120
        //          default: 80
        //        }
        //    80: new             Ljava/lang/IllegalArgumentException;
        //    83: dup            
        //    84: new             Ljava/lang/StringBuilder;
        //    87: dup            
        //    88: invokespecial   java/lang/StringBuilder.<init>:()V
        //    91: getstatic       com/whatsapp/tb.z:[Ljava/lang/String;
        //    94: iconst_1       
        //    95: aaload         
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    99: iload_1        
        //   100: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   103: bipush          41
        //   105: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   108: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   111: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   114: athrow         
        //   115: astore          6
        //   117: aload           6
        //   119: athrow         
        //   120: aload           5
        //   122: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;)V
        //   125: iload           4
        //   127: ifeq            170
        //   130: aload           5
        //   132: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   135: iload           4
        //   137: ifeq            170
        //   140: aload           5
        //   142: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   145: iload           4
        //   147: ifeq            170
        //   150: aload           5
        //   152: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   155: iload           4
        //   157: ifeq            170
        //   160: iload           4
        //   162: ifeq            170
        //   165: iload           4
        //   167: ifne            80
        //   170: return         
        //   171: astore          11
        //   173: aload           11
        //   175: athrow         
        //   176: astore          10
        //   178: aload           10
        //   180: athrow         
        //   181: astore          9
        //   183: aload           9
        //   185: athrow         
        //   186: astore          7
        //   188: aload           7
        //   190: athrow         
        //   191: astore          8
        //   193: aload           8
        //   195: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  80     115    115    120    Ljava/lang/IllegalArgumentException;
        //  120    125    171    176    Ljava/lang/IllegalArgumentException;
        //  130    135    176    181    Ljava/lang/IllegalArgumentException;
        //  140    145    181    186    Ljava/lang/IllegalArgumentException;
        //  150    155    186    196    Ljava/lang/IllegalArgumentException;
        //  173    176    176    181    Ljava/lang/IllegalArgumentException;
        //  178    181    181    186    Ljava/lang/IllegalArgumentException;
        //  183    186    186    196    Ljava/lang/IllegalArgumentException;
        //  188    191    191    196    Ljava/lang/IllegalArgumentException;
        //  193    196    115    120    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 76, Size: 76
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
}
