// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import java.util.regex.Pattern;

public final class m3
{
    private static final Pattern a;
    private static String b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = ">h|I }I6";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'I';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = ',';
                        break;
                    }
                    case 2: {
                        c2 = '\u0019';
                        break;
                    }
                    case 3: {
                        c2 = '?';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ",\u0002(\rg/\u001b/";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u007f\\i\u0010<mIk\u0012(yIwKfsC}Z%";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "_B}M&wH";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "kBrQ&iB";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "kBrQ&iB";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u007f\\i\u0010<mIk\u0012(yIwKfsMwJ/\u007fOmJ;{^";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u007f\\i\u0010<mIk\u0012(yIwKflIuZ(mI";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "kBrQ&iB";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final char[] charArray2 = "Er5cgB[E\u0012\u00156p0b".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = 'I';
                    break;
                }
                case 0: {
                    c4 = '\u001e';
                    break;
                }
                case 1: {
                    c4 = ',';
                    break;
                }
                case 2: {
                    c4 = '\u0019';
                    break;
                }
                case 3: {
                    c4 = '?';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        a = Pattern.compile(new String(charArray2).intern());
    }
    
    public static String a() {
        return m3.b;
    }
    
    static void a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/m3.z:[Ljava/lang/String;
        //     3: iconst_1       
        //     4: aaload         
        //     5: bipush          32
        //     7: bipush          95
        //     9: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //    12: astore_1       
        //    13: getstatic       com/whatsapp/m3.z:[Ljava/lang/String;
        //    16: iconst_3       
        //    17: aaload         
        //    18: bipush          32
        //    20: bipush          95
        //    22: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //    25: astore_2       
        //    26: aload_0        
        //    27: ldc             2131231990
        //    29: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    32: bipush          32
        //    34: bipush          95
        //    36: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //    39: astore_3       
        //    40: getstatic       com/whatsapp/m3.z:[Ljava/lang/String;
        //    43: bipush          8
        //    45: aaload         
        //    46: astore          4
        //    48: getstatic       com/whatsapp/m3.z:[Ljava/lang/String;
        //    51: iconst_5       
        //    52: aaload         
        //    53: astore          5
        //    55: getstatic       com/whatsapp/m3.z:[Ljava/lang/String;
        //    58: iconst_4       
        //    59: aaload         
        //    60: astore          6
        //    62: getstatic       com/whatsapp/m3.a:Ljava/util/regex/Pattern;
        //    65: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //    68: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    71: ldc             "_"
        //    73: invokevirtual   java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
        //    76: astore          12
        //    78: aload           12
        //    80: astore          4
        //    82: getstatic       com/whatsapp/m3.a:Ljava/util/regex/Pattern;
        //    85: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //    88: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    91: ldc             "_"
        //    93: invokevirtual   java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
        //    96: astore          11
        //    98: aload           11
        //   100: astore          5
        //   102: getstatic       com/whatsapp/m3.a:Ljava/util/regex/Pattern;
        //   105: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   108: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   111: ldc             "_"
        //   113: invokevirtual   java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
        //   116: astore          10
        //   118: aload           10
        //   120: astore          6
        //   122: new             Ljava/lang/StringBuilder;
        //   125: dup            
        //   126: invokespecial   java/lang/StringBuilder.<init>:()V
        //   129: aload_3        
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: ldc             "/"
        //   135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   138: aload_1        
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: ldc             " "
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: aload_2        
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: ldc             "/"
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: aload           4
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: getstatic       com/whatsapp/m3.z:[Ljava/lang/String;
        //   164: iconst_0       
        //   165: aaload         
        //   166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   169: aload           5
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: ldc             "-"
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: aload           6
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: putstatic       com/whatsapp/m3.b:Ljava/lang/String;
        //   190: return         
        //   191: astore          7
        //   193: getstatic       com/whatsapp/m3.z:[Ljava/lang/String;
        //   196: bipush          7
        //   198: aaload         
        //   199: aload           7
        //   201: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   204: goto            82
        //   207: astore          8
        //   209: getstatic       com/whatsapp/m3.z:[Ljava/lang/String;
        //   212: bipush          6
        //   214: aaload         
        //   215: aload           8
        //   217: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   220: goto            102
        //   223: astore          9
        //   225: getstatic       com/whatsapp/m3.z:[Ljava/lang/String;
        //   228: iconst_2       
        //   229: aaload         
        //   230: aload           9
        //   232: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   235: goto            122
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  62     78     191    207    Ljava/lang/NoSuchFieldError;
        //  82     98     207    223    Ljava/lang/NoSuchFieldError;
        //  102    118    223    238    Ljava/lang/NoSuchFieldError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 108, Size: 108
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
