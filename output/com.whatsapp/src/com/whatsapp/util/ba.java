// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.nio.channels.WritableByteChannel;
import java.nio.channels.FileChannel;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;

public class ba
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = ">F`D_\nr4Y\u0016";
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
                        c2 = 'r';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = '\u0019';
                        break;
                    }
                    case 3: {
                        c2 = '=';
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
                    s = "i\u000e";
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
    
    private static int a(final File p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //     8: astore_3       
        //     9: iconst_1       
        //    10: aload_3        
        //    11: invokevirtual   java/lang/String.length:()I
        //    14: iadd           
        //    15: istore          4
        //    17: aload_0        
        //    18: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    21: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    24: astore          5
        //    26: iconst_0       
        //    27: istore          6
        //    29: aload           5
        //    31: ifnull          135
        //    34: aload           5
        //    36: arraylength    
        //    37: istore          7
        //    39: iconst_0       
        //    40: istore          8
        //    42: iload           8
        //    44: iload           7
        //    46: if_icmpge       135
        //    49: aload           5
        //    51: iload           8
        //    53: aaload         
        //    54: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    57: astore          9
        //    59: aload           9
        //    61: aload_3        
        //    62: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    65: ifeq            125
        //    68: aload           9
        //    70: invokevirtual   java/lang/String.length:()I
        //    73: istore          11
        //    75: aload           9
        //    77: invokevirtual   java/lang/String.length:()I
        //    80: istore          13
        //    82: iload           11
        //    84: iload           13
        //    86: if_icmpgt       125
        //    89: iload           4
        //    91: iload           11
        //    93: if_icmpge       125
        //    96: aload           9
        //    98: iload           4
        //   100: iload           11
        //   102: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   105: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   108: istore          15
        //   110: iload           15
        //   112: istore          16
        //   114: iload           16
        //   116: iload           6
        //   118: if_icmple       155
        //   121: iload           16
        //   123: istore          6
        //   125: iload           8
        //   127: iconst_1       
        //   128: iadd           
        //   129: istore          10
        //   131: iload_2        
        //   132: ifeq            148
        //   135: iload           6
        //   137: ireturn        
        //   138: astore          12
        //   140: aload           12
        //   142: athrow         
        //   143: astore          14
        //   145: goto            125
        //   148: iload           10
        //   150: istore          8
        //   152: goto            42
        //   155: iload           6
        //   157: istore          16
        //   159: goto            121
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  75     82     138    143    Ljava/lang/NumberFormatException;
        //  96     110    143    148    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
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
    
    private static int a(final String s) {
        return s.indexOf(46) + "-".length();
    }
    
    public static String a(final File p0, final Date p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //     8: aload_1        
        //     9: invokestatic    com/whatsapp/util/ba.a:(Ljava/lang/String;Ljava/util/Date;)Ljava/lang/String;
        //    12: astore          4
        //    14: aload_0        
        //    15: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    18: aload_2        
        //    19: invokestatic    com/whatsapp/util/ba.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    22: astore          5
        //    24: aload_0        
        //    25: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    28: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    31: astore          6
        //    33: aconst_null    
        //    34: astore          7
        //    36: aload           6
        //    38: ifnull          183
        //    41: aload           6
        //    43: arraylength    
        //    44: istore          10
        //    46: iconst_0       
        //    47: istore          11
        //    49: iconst_0       
        //    50: istore          12
        //    52: iload           11
        //    54: iload           10
        //    56: if_icmpge       183
        //    59: aload           6
        //    61: iload           11
        //    63: aaload         
        //    64: astore          13
        //    66: aload           13
        //    68: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    71: astore          14
        //    73: aload           14
        //    75: aload           4
        //    77: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    80: ifeq            173
        //    83: aload           14
        //    85: aload           5
        //    87: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    90: istore          17
        //    92: iload           17
        //    94: ifeq            173
        //    97: iconst_1       
        //    98: aload           4
        //   100: invokevirtual   java/lang/String.length:()I
        //   103: iadd           
        //   104: istore          18
        //   106: aload           14
        //   108: invokevirtual   java/lang/String.length:()I
        //   111: aload           5
        //   113: invokevirtual   java/lang/String.length:()I
        //   116: isub           
        //   117: istore          19
        //   119: aload           14
        //   121: invokevirtual   java/lang/String.length:()I
        //   124: istore          21
        //   126: iload           19
        //   128: iload           21
        //   130: if_icmpge       173
        //   133: iload           18
        //   135: iload           19
        //   137: if_icmpge       173
        //   140: aload           14
        //   142: iload           18
        //   144: iload           19
        //   146: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   149: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   152: istore          23
        //   154: iload           23
        //   156: iload           12
        //   158: if_icmple       247
        //   161: iload           23
        //   163: istore          24
        //   165: iload           24
        //   167: istore          12
        //   169: aload           13
        //   171: astore          7
        //   173: iload           11
        //   175: iconst_1       
        //   176: iadd           
        //   177: istore          16
        //   179: iload_3        
        //   180: ifeq            258
        //   183: aload           7
        //   185: ifnull          213
        //   188: aload           7
        //   190: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   193: astore          9
        //   195: aload           9
        //   197: areturn        
        //   198: astore          15
        //   200: aload           15
        //   202: athrow         
        //   203: astore          20
        //   205: aload           20
        //   207: athrow         
        //   208: astore          8
        //   210: aload           8
        //   212: athrow         
        //   213: new             Ljava/lang/StringBuilder;
        //   216: dup            
        //   217: invokespecial   java/lang/StringBuilder.<init>:()V
        //   220: aload           4
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: getstatic       com/whatsapp/util/ba.z:[Ljava/lang/String;
        //   228: iconst_1       
        //   229: aaload         
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: aload           5
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   241: areturn        
        //   242: astore          22
        //   244: goto            173
        //   247: aload           7
        //   249: astore          13
        //   251: iload           12
        //   253: istore          24
        //   255: goto            165
        //   258: iload           16
        //   260: istore          11
        //   262: goto            52
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  73     92     198    203    Ljava/lang/NumberFormatException;
        //  119    126    203    208    Ljava/lang/NumberFormatException;
        //  140    154    242    247    Ljava/lang/NumberFormatException;
        //  188    195    208    213    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 127, Size: 127
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
    
    private static String a(final String s, final String s2) {
        return s.substring(s.indexOf(46)) + s2;
    }
    
    private static String a(final String s, final Date date) {
        return s.substring(0, s.indexOf(46)) + "-" + a().format(date);
    }
    
    private static SimpleDateFormat a() {
        return new SimpleDateFormat(ba.z[0], Locale.US);
    }
    
    public static ArrayList a(final File p0, final int p1, final String[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_3       
        //     4: invokestatic    com/whatsapp/util/ba.a:()Ljava/text/SimpleDateFormat;
        //     7: astore          4
        //     9: new             Ljava/util/ArrayList;
        //    12: dup            
        //    13: invokespecial   java/util/ArrayList.<init>:()V
        //    16: astore          5
        //    18: new             Ljava/util/Date;
        //    21: dup            
        //    22: invokespecial   java/util/Date.<init>:()V
        //    25: astore          6
        //    27: aload           4
        //    29: invokevirtual   java/text/SimpleDateFormat.toPattern:()Ljava/lang/String;
        //    32: astore          7
        //    34: aload_0        
        //    35: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    38: invokestatic    com/whatsapp/util/ba.b:(Ljava/lang/String;)Ljava/lang/String;
        //    41: astore          8
        //    43: aload_0        
        //    44: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    47: ldc             ""
        //    49: invokestatic    com/whatsapp/util/ba.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    52: astore          9
        //    54: aload_2        
        //    55: arraylength    
        //    56: anewarray       Ljava/lang/String;
        //    59: astore          10
        //    61: iconst_0       
        //    62: istore          11
        //    64: iload           11
        //    66: aload           10
        //    68: arraylength    
        //    69: if_icmpge       95
        //    72: aload           10
        //    74: iload           11
        //    76: aload_0        
        //    77: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    80: aload_2        
        //    81: iload           11
        //    83: aaload         
        //    84: invokestatic    com/whatsapp/util/ba.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    87: aastore        
        //    88: iinc            11, 1
        //    91: iload_3        
        //    92: ifeq            64
        //    95: aload_0        
        //    96: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    99: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //   102: astore          12
        //   104: aload           12
        //   106: ifnull          313
        //   109: aload           12
        //   111: arraylength    
        //   112: istore          25
        //   114: iconst_0       
        //   115: istore          26
        //   117: iload           26
        //   119: iload           25
        //   121: if_icmpge       313
        //   124: aload           12
        //   126: iload           26
        //   128: aaload         
        //   129: astore          27
        //   131: aload           27
        //   133: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   136: astore          28
        //   138: aload           28
        //   140: aload           8
        //   142: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   145: istore          30
        //   147: iload           30
        //   149: ifne            156
        //   152: iload_3        
        //   153: ifeq            303
        //   156: aload           28
        //   158: aload           9
        //   160: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   163: istore          31
        //   165: aload           10
        //   167: arraylength    
        //   168: istore          32
        //   170: iload           31
        //   172: istore          33
        //   174: iconst_0       
        //   175: istore          34
        //   177: iload           34
        //   179: iload           32
        //   181: if_icmpge       229
        //   184: aload           10
        //   186: iload           34
        //   188: aaload         
        //   189: astore          43
        //   191: iload           33
        //   193: ifeq            200
        //   196: iload_3        
        //   197: ifeq            229
        //   200: iload           33
        //   202: ifne            219
        //   205: aload           28
        //   207: aload           43
        //   209: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   212: istore          46
        //   214: iload           46
        //   216: ifeq            465
        //   219: iconst_1       
        //   220: istore          33
        //   222: iinc            34, 1
        //   225: iload_3        
        //   226: ifeq            177
        //   229: iload           33
        //   231: ifeq            303
        //   234: aload           28
        //   236: aload           8
        //   238: invokevirtual   java/lang/String.length:()I
        //   241: aload           8
        //   243: invokevirtual   java/lang/String.length:()I
        //   246: aload           7
        //   248: invokevirtual   java/lang/String.length:()I
        //   251: iadd           
        //   252: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   255: astore          36
        //   257: aload           4
        //   259: aload           36
        //   261: invokevirtual   java/text/SimpleDateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
        //   264: astore          38
        //   266: aload           6
        //   268: invokevirtual   java/util/Date.getTime:()J
        //   271: aload           38
        //   273: invokevirtual   java/util/Date.getTime:()J
        //   276: lsub           
        //   277: ldc2_w          86400000
        //   280: ldiv           
        //   281: lstore          39
        //   283: iload_1        
        //   284: iflt            295
        //   287: lload           39
        //   289: iload_1        
        //   290: i2l            
        //   291: lcmp           
        //   292: ifge            303
        //   295: aload           5
        //   297: aload           27
        //   299: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   302: pop            
        //   303: iload           26
        //   305: iconst_1       
        //   306: iadd           
        //   307: istore          35
        //   309: iload_3        
        //   310: ifeq            501
        //   313: iload_1        
        //   314: ifge            328
        //   317: aload_0        
        //   318: invokevirtual   java/io/File.exists:()Z
        //   321: istore          24
        //   323: iload           24
        //   325: ifne            336
        //   328: aload_0        
        //   329: iload_1        
        //   330: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;I)Z
        //   333: ifeq            343
        //   336: aload           5
        //   338: aload_0        
        //   339: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   342: pop            
        //   343: aload_2        
        //   344: arraylength    
        //   345: istore          15
        //   347: iconst_0       
        //   348: istore          16
        //   350: iload           16
        //   352: iload           15
        //   354: if_icmpge       434
        //   357: aload_2        
        //   358: iload           16
        //   360: aaload         
        //   361: astore          17
        //   363: new             Ljava/io/File;
        //   366: dup            
        //   367: new             Ljava/lang/StringBuilder;
        //   370: dup            
        //   371: invokespecial   java/lang/StringBuilder.<init>:()V
        //   374: aload_0        
        //   375: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   378: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   381: aload           17
        //   383: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   386: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   389: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   392: astore          18
        //   394: iload_1        
        //   395: ifge            410
        //   398: aload           18
        //   400: invokevirtual   java/io/File.exists:()Z
        //   403: istore          22
        //   405: iload           22
        //   407: ifne            419
        //   410: aload           18
        //   412: iload_1        
        //   413: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;I)Z
        //   416: ifeq            427
        //   419: aload           5
        //   421: aload           18
        //   423: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   426: pop            
        //   427: iinc            16, 1
        //   430: iload_3        
        //   431: ifeq            350
        //   434: aload           5
        //   436: new             Lcom/whatsapp/util/bd;
        //   439: dup            
        //   440: aconst_null    
        //   441: invokespecial   com/whatsapp/util/bd.<init>:(Lcom/whatsapp/util/a1;)V
        //   444: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   447: aload           5
        //   449: areturn        
        //   450: astore          29
        //   452: aload           29
        //   454: athrow         
        //   455: astore          44
        //   457: aload           44
        //   459: athrow         
        //   460: astore          45
        //   462: aload           45
        //   464: athrow         
        //   465: iconst_0       
        //   466: istore          33
        //   468: goto            222
        //   471: astore          41
        //   473: aload           41
        //   475: athrow         
        //   476: astore          37
        //   478: goto            303
        //   481: astore          23
        //   483: aload           23
        //   485: athrow         
        //   486: astore          13
        //   488: aload           13
        //   490: athrow         
        //   491: astore          21
        //   493: aload           21
        //   495: athrow         
        //   496: astore          19
        //   498: aload           19
        //   500: athrow         
        //   501: iload           35
        //   503: istore          26
        //   505: goto            117
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  138    147    450    455    Ljava/text/ParseException;
        //  205    214    455    465    Ljava/text/ParseException;
        //  257    283    476    481    Ljava/text/ParseException;
        //  295    303    471    476    Ljava/text/ParseException;
        //  317    323    481    486    Ljava/text/ParseException;
        //  328    336    486    491    Ljava/text/ParseException;
        //  336    343    486    491    Ljava/text/ParseException;
        //  398    405    491    496    Ljava/text/ParseException;
        //  410    419    496    501    Ljava/text/ParseException;
        //  419    427    496    501    Ljava/text/ParseException;
        //  457    460    460    465    Ljava/text/ParseException;
        //  473    476    476    481    Ljava/text/ParseException;
        //  483    486    486    491    Ljava/text/ParseException;
        //  493    496    496    501    Ljava/text/ParseException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 249, Size: 249
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
    
    public static ArrayList a(final ArrayList list) {
        Collections.sort((List<Object>)list, new bd(null));
        return list;
    }
    
    public static void a(final File p0, final int p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_3       
        //     4: invokestatic    com/whatsapp/util/ba.a:()Ljava/text/SimpleDateFormat;
        //     7: astore          4
        //     9: new             Ljava/util/Date;
        //    12: dup            
        //    13: invokespecial   java/util/Date.<init>:()V
        //    16: astore          5
        //    18: aload           4
        //    20: invokevirtual   java/text/SimpleDateFormat.toPattern:()Ljava/lang/String;
        //    23: astore          6
        //    25: aload_0        
        //    26: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    29: aload_2        
        //    30: invokestatic    com/whatsapp/util/ba.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    33: astore          7
        //    35: aload_0        
        //    36: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    39: invokestatic    com/whatsapp/util/ba.b:(Ljava/lang/String;)Ljava/lang/String;
        //    42: astore          8
        //    44: aconst_null    
        //    45: astore          9
        //    47: iload_1        
        //    48: ifge            81
        //    51: aload_0        
        //    52: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    55: bipush          46
        //    57: invokevirtual   java/lang/String.indexOf:(I)I
        //    60: istore          35
        //    62: iload           35
        //    64: iconst_m1      
        //    65: if_icmpne       69
        //    68: return         
        //    69: aload_0        
        //    70: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    73: iconst_0       
        //    74: iload           35
        //    76: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    79: astore          9
        //    81: aload_0        
        //    82: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    85: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    88: astore          10
        //    90: aload           10
        //    92: ifnull          68
        //    95: aload           10
        //    97: arraylength    
        //    98: istore          11
        //   100: iconst_0       
        //   101: istore          12
        //   103: iload           12
        //   105: iload           11
        //   107: if_icmpge       68
        //   110: aload           10
        //   112: iload           12
        //   114: aaload         
        //   115: astore          13
        //   117: aload           13
        //   119: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   122: astore          14
        //   124: iload_1        
        //   125: ifge            172
        //   128: aload           14
        //   130: aload           9
        //   132: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   135: istore          32
        //   137: iload           32
        //   139: ifeq            148
        //   142: aload           13
        //   144: invokevirtual   java/io/File.delete:()Z
        //   147: pop            
        //   148: iinc            12, 1
        //   151: iload_3        
        //   152: ifeq            103
        //   155: return         
        //   156: astore          31
        //   158: aload           31
        //   160: athrow         
        //   161: astore          30
        //   163: aload           30
        //   165: athrow         
        //   166: astore          33
        //   168: iload_3        
        //   169: ifeq            148
        //   172: aload           14
        //   174: aload           8
        //   176: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   179: istore          17
        //   181: iload           17
        //   183: ifeq            148
        //   186: aload           14
        //   188: aload           7
        //   190: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   193: istore          18
        //   195: iload           18
        //   197: ifeq            148
        //   200: aload           8
        //   202: invokevirtual   java/lang/String.length:()I
        //   205: aload           6
        //   207: invokevirtual   java/lang/String.length:()I
        //   210: iadd           
        //   211: istore          19
        //   213: aload           14
        //   215: invokevirtual   java/lang/String.length:()I
        //   218: istore          21
        //   220: iload           19
        //   222: iload           21
        //   224: if_icmple       231
        //   227: iload_3        
        //   228: ifeq            148
        //   231: aload           14
        //   233: aload           8
        //   235: invokevirtual   java/lang/String.length:()I
        //   238: iload           19
        //   240: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   243: astore          22
        //   245: aload           4
        //   247: aload           22
        //   249: invokevirtual   java/text/SimpleDateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
        //   252: astore          25
        //   254: aload           5
        //   256: invokevirtual   java/util/Date.getTime:()J
        //   259: aload           25
        //   261: invokevirtual   java/util/Date.getTime:()J
        //   264: lsub           
        //   265: ldc2_w          86400000
        //   268: ldiv           
        //   269: lstore          26
        //   271: lload           26
        //   273: iload_1        
        //   274: i2l            
        //   275: lcmp           
        //   276: ifle            148
        //   279: aload           13
        //   281: invokevirtual   java/io/File.delete:()Z
        //   284: pop            
        //   285: goto            148
        //   288: astore          28
        //   290: aload           28
        //   292: athrow         
        //   293: astore          24
        //   295: goto            148
        //   298: astore          15
        //   300: aload           15
        //   302: athrow         
        //   303: astore          16
        //   305: aload           16
        //   307: athrow         
        //   308: astore          20
        //   310: aload           20
        //   312: athrow         
        //   313: astore          23
        //   315: goto            148
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  128    137    156    161    Ljava/lang/SecurityException;
        //  128    137    161    166    Ljava/text/ParseException;
        //  142    148    166    172    Ljava/lang/SecurityException;
        //  142    148    161    166    Ljava/text/ParseException;
        //  158    161    161    166    Ljava/text/ParseException;
        //  172    181    298    303    Ljava/lang/SecurityException;
        //  186    195    303    308    Ljava/lang/SecurityException;
        //  213    220    308    313    Ljava/lang/SecurityException;
        //  245    271    293    298    Ljava/text/ParseException;
        //  245    271    313    318    Ljava/lang/SecurityException;
        //  279    285    288    293    Ljava/lang/SecurityException;
        //  279    285    293    298    Ljava/text/ParseException;
        //  290    293    293    298    Ljava/text/ParseException;
        //  290    293    313    318    Ljava/lang/SecurityException;
        //  300    303    303    308    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 153, Size: 153
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
    
    public static void a(final FileChannel fileChannel, final WritableByteChannel writableByteChannel) {
        final boolean l = Log.l;
        long n = 0L;
        while (n < fileChannel.size()) {
            fileChannel.transferTo(n, Math.min(131072L, fileChannel.size() - n), writableByteChannel);
            n += 131072L;
            if (l) {
                break;
            }
        }
    }
    
    private static boolean a(final File file, final int n) {
        final float n2 = (System.currentTimeMillis() - file.lastModified()) / 86400000L;
        try {
            if (!file.exists()) {
                return false;
            }
            final long n3 = System.currentTimeMillis();
            final File file2 = file;
            final long n4 = file2.lastModified();
            final long n5 = n3 - n4;
            final long n6 = 86400000L;
            final long n7 = n5 / n6;
            final int n8 = n;
            final long n9 = n8;
            final long n10 = lcmp(n7, n9);
            if (n10 <= 0) {
                return true;
            }
            return false;
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            final long n3 = System.currentTimeMillis();
            final File file2 = file;
            final long n4 = file2.lastModified();
            final long n5 = n3 - n4;
            final long n6 = 86400000L;
            final long n7 = n5 / n6;
            final int n8 = n;
            final long n9 = n8;
            final long n10 = lcmp(n7, n9);
            if (n10 <= 0) {
                return true;
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public static boolean a(final File file, final String s) {
        final boolean exists = file.exists();
        boolean renameTo = false;
        if (!exists) {
            return renameTo;
        }
        try {
            renameTo = file.renameTo(new File(file.getParentFile(), a(file, new Date(), s)));
            return renameTo;
        }
        catch (SecurityException ex) {
            return false;
        }
    }
    
    public static File b(final File file, final String s) {
        final Date date = new Date();
        final String a = a(file.getName(), date);
        final String a2 = a(file.getName(), s);
        String string = "1";
        final String a3 = a(file, date, s);
        while (true) {
            if (a3 == null) {
                break Label_0095;
            }
            final int n = 1 + a.length();
            final int n2 = a3.length() - a2.length();
            if (n >= n2) {
                break Label_0095;
            }
            try {
                string = Integer.toString(1 + Integer.parseInt(a3.substring(n, n2)));
                final File file2 = new File(file.getParent(), a + "." + string + a2);
                file2.createNewFile();
                return file2;
            }
            catch (NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    private static String b(final String s) {
        return a(s, new Date()).substring(0, a(s));
    }
    
    public static ArrayList b(final File p0, final int p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_3       
        //     4: invokestatic    com/whatsapp/util/ba.a:()Ljava/text/SimpleDateFormat;
        //     7: astore          4
        //     9: new             Ljava/util/ArrayList;
        //    12: dup            
        //    13: invokespecial   java/util/ArrayList.<init>:()V
        //    16: astore          5
        //    18: new             Ljava/util/Date;
        //    21: dup            
        //    22: invokespecial   java/util/Date.<init>:()V
        //    25: astore          6
        //    27: aload           4
        //    29: invokevirtual   java/text/SimpleDateFormat.toPattern:()Ljava/lang/String;
        //    32: astore          7
        //    34: aload_0        
        //    35: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    38: aload_2        
        //    39: invokestatic    com/whatsapp/util/ba.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    42: astore          8
        //    44: aload_0        
        //    45: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    48: invokestatic    com/whatsapp/util/ba.b:(Ljava/lang/String;)Ljava/lang/String;
        //    51: astore          9
        //    53: aload_0        
        //    54: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    57: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    60: astore          10
        //    62: aload           10
        //    64: ifnull          197
        //    67: aload           10
        //    69: invokestatic    java/util/Arrays.sort:([Ljava/lang/Object;)V
        //    72: aload           10
        //    74: arraylength    
        //    75: istore          11
        //    77: iconst_0       
        //    78: istore          12
        //    80: iload           12
        //    82: iload           11
        //    84: if_icmpge       197
        //    87: aload           10
        //    89: iload           12
        //    91: aaload         
        //    92: astore          13
        //    94: aload           13
        //    96: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    99: astore          14
        //   101: aload           14
        //   103: aload           9
        //   105: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   108: ifeq            190
        //   111: aload           14
        //   113: aload           8
        //   115: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   118: istore          16
        //   120: iload           16
        //   122: ifeq            190
        //   125: aload           14
        //   127: aload           9
        //   129: invokevirtual   java/lang/String.length:()I
        //   132: aload           9
        //   134: invokevirtual   java/lang/String.length:()I
        //   137: aload           7
        //   139: invokevirtual   java/lang/String.length:()I
        //   142: iadd           
        //   143: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   146: astore          17
        //   148: aload           4
        //   150: aload           17
        //   152: invokevirtual   java/text/SimpleDateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
        //   155: astore          19
        //   157: aload           6
        //   159: invokevirtual   java/util/Date.getTime:()J
        //   162: aload           19
        //   164: invokevirtual   java/util/Date.getTime:()J
        //   167: lsub           
        //   168: ldc2_w          86400000
        //   171: ldiv           
        //   172: lstore          20
        //   174: lload           20
        //   176: iload_1        
        //   177: i2l            
        //   178: lcmp           
        //   179: ifge            190
        //   182: aload           5
        //   184: aload           13
        //   186: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   189: pop            
        //   190: iinc            12, 1
        //   193: iload_3        
        //   194: ifeq            80
        //   197: aload           5
        //   199: areturn        
        //   200: astore          15
        //   202: aload           15
        //   204: athrow         
        //   205: astore          22
        //   207: aload           22
        //   209: athrow         
        //   210: astore          18
        //   212: goto            190
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  101    120    200    205    Ljava/text/ParseException;
        //  148    174    210    215    Ljava/text/ParseException;
        //  182    190    205    210    Ljava/text/ParseException;
        //  207    210    210    215    Ljava/text/ParseException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0190:
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
    
    public static ArrayList b(final File file, final File file2) {
        final boolean l = Log.l;
        final ArrayList<File> list = new ArrayList<File>();
        final int a = a(file, file2);
        final String parent = file.getParent();
        int n = 1;
        while (true) {
            if (n > a) {
                return list;
            }
            final File file3 = new File(parent, file2.getName() + "." + n);
            try {
                if (file3.exists()) {
                    list.add(file3);
                }
                ++n;
                if (l) {
                    return list;
                }
                continue;
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    public static boolean c(final File file, final File file2) {
        final boolean exists = file.exists();
        boolean renameTo = false;
        if (!exists) {
            return renameTo;
        }
        final File file3 = new File(file2.getPath() + "." + (a(file, file2) + 1));
        try {
            renameTo = file.renameTo(file3);
            return renameTo;
        }
        catch (SecurityException ex) {
            return false;
        }
    }
}
