// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.provider.MediaStore;
import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;
import android.os.Environment;

public class a6
{
    public static final String a;
    public static final String b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = ".{mfF&pGz]";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = 'C';
                        break;
                    }
                    case 1: {
                        c2 = '\u0014';
                        break;
                    }
                    case 2: {
                        c2 = '\u0018';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ".{mfF&p";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "5{t}_&";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "&llm@-ut";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "lP[A\u007f";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "mdjgP&";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final StringBuilder append = new StringBuilder().append(Environment.getExternalStorageDirectory().toString());
        final char[] charArray2 = "lP[A\u007flWyeW1u".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = '2';
                    break;
                }
                case 0: {
                    c4 = 'C';
                    break;
                }
                case 1: {
                    c4 = '\u0014';
                    break;
                }
                case 2: {
                    c4 = '\u0018';
                    break;
                }
                case 3: {
                    c4 = '\b';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        a = append.append(new String(charArray2).intern()).toString();
        b = a(a6.a);
    }
    
    private static Cursor a(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        if (contentResolver == null) {
            return null;
        }
        try {
            return contentResolver.query(uri, array, s, array2, s2);
        }
        catch (UnsupportedOperationException ex) {
            return null;
        }
    }
    
    public static aa a() {
        return a(null, c());
    }
    
    public static aa a(final ContentResolver p0, final ak p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gallerypicker/MediaGalleryBase.v:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: getfield        com/whatsapp/gallerypicker/ak.e:Lcom/whatsapp/gallerypicker/bv;
        //     8: astore_3       
        //     9: aload_1        
        //    10: getfield        com/whatsapp/gallerypicker/ak.b:I
        //    13: istore          4
        //    15: aload_1        
        //    16: getfield        com/whatsapp/gallerypicker/ak.f:I
        //    19: istore          5
        //    21: aload_1        
        //    22: getfield        com/whatsapp/gallerypicker/ak.a:Ljava/lang/String;
        //    25: astore          6
        //    27: aload_1        
        //    28: getfield        com/whatsapp/gallerypicker/ak.d:Landroid/net/Uri;
        //    31: astore          7
        //    33: aload_1        
        //    34: getfield        com/whatsapp/gallerypicker/ak.c:Z
        //    37: ifne            44
        //    40: aload_0        
        //    41: ifnonnull       62
        //    44: new             Lcom/whatsapp/gallerypicker/ax;
        //    47: dup            
        //    48: aconst_null    
        //    49: invokespecial   com/whatsapp/gallerypicker/ax.<init>:(Lcom/whatsapp/gallerypicker/b9;)V
        //    52: astore          8
        //    54: aload           8
        //    56: areturn        
        //    57: astore          9
        //    59: aload           9
        //    61: athrow         
        //    62: aload           7
        //    64: ifnull          87
        //    67: new             Lcom/whatsapp/gallerypicker/bw;
        //    70: dup            
        //    71: aload_0        
        //    72: aload           7
        //    74: invokespecial   com/whatsapp/gallerypicker/bw.<init>:(Landroid/content/ContentResolver;Landroid/net/Uri;)V
        //    77: astore          27
        //    79: aload           27
        //    81: areturn        
        //    82: astore          28
        //    84: aload           28
        //    86: athrow         
        //    87: iconst_0       
        //    88: invokestatic    com/whatsapp/gallerypicker/a6.a:(Z)Z
        //    91: istore          10
        //    93: new             Ljava/util/ArrayList;
        //    96: dup            
        //    97: invokespecial   java/util/ArrayList.<init>:()V
        //   100: astore          11
        //   102: iload           10
        //   104: ifeq            174
        //   107: getstatic       com/whatsapp/gallerypicker/bv.INTERNAL:Lcom/whatsapp/gallerypicker/bv;
        //   110: astore          23
        //   112: aload_3        
        //   113: aload           23
        //   115: if_acmpeq       174
        //   118: iload           4
        //   120: iconst_1       
        //   121: iand           
        //   122: ifeq            146
        //   125: aload           11
        //   127: new             Lcom/whatsapp/gallerypicker/b0;
        //   130: dup            
        //   131: aload_0        
        //   132: getstatic       android/provider/MediaStore$Images$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   135: iload           5
        //   137: aload           6
        //   139: invokespecial   com/whatsapp/gallerypicker/b0.<init>:(Landroid/content/ContentResolver;Landroid/net/Uri;ILjava/lang/String;)V
        //   142: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   145: pop            
        //   146: iload           4
        //   148: iconst_4       
        //   149: iand           
        //   150: ifeq            174
        //   153: aload           11
        //   155: new             Lcom/whatsapp/gallerypicker/b2;
        //   158: dup            
        //   159: aload_0        
        //   160: getstatic       android/provider/MediaStore$Video$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   163: iload           5
        //   165: aload           6
        //   167: invokespecial   com/whatsapp/gallerypicker/b2.<init>:(Landroid/content/ContentResolver;Landroid/net/Uri;ILjava/lang/String;)V
        //   170: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   173: pop            
        //   174: getstatic       com/whatsapp/gallerypicker/bv.INTERNAL:Lcom/whatsapp/gallerypicker/bv;
        //   177: astore          15
        //   179: aload_3        
        //   180: aload           15
        //   182: if_acmpeq       196
        //   185: getstatic       com/whatsapp/gallerypicker/bv.ALL:Lcom/whatsapp/gallerypicker/bv;
        //   188: astore          20
        //   190: aload_3        
        //   191: aload           20
        //   193: if_acmpne       224
        //   196: iload           4
        //   198: iconst_1       
        //   199: iand           
        //   200: ifeq            224
        //   203: aload           11
        //   205: new             Lcom/whatsapp/gallerypicker/b0;
        //   208: dup            
        //   209: aload_0        
        //   210: getstatic       android/provider/MediaStore$Images$Media.INTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   213: iload           5
        //   215: aload           6
        //   217: invokespecial   com/whatsapp/gallerypicker/b0.<init>:(Landroid/content/ContentResolver;Landroid/net/Uri;ILjava/lang/String;)V
        //   220: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   223: pop            
        //   224: aload           11
        //   226: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   229: astore          16
        //   231: aload           16
        //   233: invokeinterface java/util/Iterator.hasNext:()Z
        //   238: ifeq            277
        //   241: aload           16
        //   243: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   248: checkcast       Lcom/whatsapp/gallerypicker/ba;
        //   251: astore          17
        //   253: aload           17
        //   255: invokevirtual   com/whatsapp/gallerypicker/ba.d:()Z
        //   258: ifeq            273
        //   261: aload           17
        //   263: invokevirtual   com/whatsapp/gallerypicker/ba.a:()V
        //   266: aload           16
        //   268: invokeinterface java/util/Iterator.remove:()V
        //   273: iload_2        
        //   274: ifeq            231
        //   277: aload           11
        //   279: invokevirtual   java/util/ArrayList.size:()I
        //   282: iconst_1       
        //   283: if_icmpne       331
        //   286: aload           11
        //   288: iconst_0       
        //   289: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   292: checkcast       Lcom/whatsapp/gallerypicker/ba;
        //   295: areturn        
        //   296: astore          21
        //   298: aload           21
        //   300: athrow         
        //   301: astore          22
        //   303: aload           22
        //   305: athrow         
        //   306: astore          24
        //   308: aload           24
        //   310: athrow         
        //   311: astore          12
        //   313: aload           12
        //   315: athrow         
        //   316: astore          13
        //   318: aload           13
        //   320: athrow         
        //   321: astore          14
        //   323: aload           14
        //   325: athrow         
        //   326: astore          18
        //   328: aload           18
        //   330: athrow         
        //   331: new             Lcom/whatsapp/gallerypicker/aj;
        //   334: dup            
        //   335: aload           11
        //   337: aload           11
        //   339: invokevirtual   java/util/ArrayList.size:()I
        //   342: anewarray       Lcom/whatsapp/gallerypicker/aa;
        //   345: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   348: checkcast       [Lcom/whatsapp/gallerypicker/aa;
        //   351: iload           5
        //   353: invokespecial   com/whatsapp/gallerypicker/aj.<init>:([Lcom/whatsapp/gallerypicker/aa;I)V
        //   356: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  44     54     57     62     Ljava/lang/UnsupportedOperationException;
        //  67     79     82     87     Ljava/lang/UnsupportedOperationException;
        //  107    112    296    301    Ljava/lang/UnsupportedOperationException;
        //  125    146    301    306    Ljava/lang/UnsupportedOperationException;
        //  153    174    306    311    Ljava/lang/UnsupportedOperationException;
        //  174    179    311    316    Ljava/lang/UnsupportedOperationException;
        //  185    190    316    321    Ljava/lang/UnsupportedOperationException;
        //  203    224    321    326    Ljava/lang/UnsupportedOperationException;
        //  253    273    326    331    Ljava/lang/UnsupportedOperationException;
        //  298    301    301    306    Ljava/lang/UnsupportedOperationException;
        //  313    316    316    321    Ljava/lang/UnsupportedOperationException;
        //  318    321    321    326    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 171, Size: 171
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
    
    public static aa a(final ContentResolver contentResolver, final bv bv, final int n, final int n2, final String s) {
        return a(contentResolver, a(bv, n, n2, s));
    }
    
    public static ak a(final bv e, final int b, final int f, final String a) {
        final ak ak = new ak();
        ak.e = e;
        ak.b = b;
        ak.f = f;
        ak.a = a;
        return ak;
    }
    
    public static String a(final String s) {
        return String.valueOf(s.toLowerCase().hashCode());
    }
    
    public static boolean a(final ContentResolver contentResolver) {
        final Cursor a = a(contentResolver, MediaStore.getMediaScannerUri(), new String[] { a6.z[2] }, null, null, null);
        if (a == null) {
            return false;
        }
        while (true) {
            while (true) {
                try {
                    if (a.getCount() == 1) {
                        a.moveToFirst();
                        final boolean equals = a6.z[3].equals(a.getString(0));
                        a.close();
                        return equals;
                    }
                }
                catch (UnsupportedOperationException ex) {
                    throw ex;
                }
                final boolean equals = false;
                continue;
            }
        }
    }
    
    public static boolean a(final boolean b) {
        while (true) {
            boolean b2 = true;
            final String externalStorageState = Environment.getExternalStorageState();
            try {
                if (a6.z[1].equals(externalStorageState)) {
                    if (b) {
                        b2 = b();
                    }
                    return b2;
                }
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
            if (b) {
                return false;
            }
            try {
                if (!a6.z[0].equals(externalStorageState)) {
                    return false;
                }
                return b2;
            }
            catch (UnsupportedOperationException ex2) {
                throw ex2;
            }
        }
    }
    
    private static boolean b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: invokestatic    android/os/Environment.getExternalStorageDirectory:()Ljava/io/File;
        //    10: invokevirtual   java/io/File.toString:()Ljava/lang/String;
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: getstatic       com/whatsapp/gallerypicker/a6.z:[Ljava/lang/String;
        //    19: iconst_4       
        //    20: aaload         
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    24: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    27: astore_0       
        //    28: new             Ljava/io/File;
        //    31: dup            
        //    32: aload_0        
        //    33: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    36: astore_1       
        //    37: aload_1        
        //    38: invokevirtual   java/io/File.isDirectory:()Z
        //    41: ifne            63
        //    44: aload_1        
        //    45: invokevirtual   java/io/File.mkdirs:()Z
        //    48: istore          9
        //    50: iload           9
        //    52: ifne            63
        //    55: iconst_0       
        //    56: ireturn        
        //    57: astore_2       
        //    58: aload_2        
        //    59: athrow         
        //    60: astore_3       
        //    61: aload_3        
        //    62: athrow         
        //    63: new             Ljava/io/File;
        //    66: dup            
        //    67: aload_0        
        //    68: getstatic       com/whatsapp/gallerypicker/a6.z:[Ljava/lang/String;
        //    71: iconst_5       
        //    72: aaload         
        //    73: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    76: astore          4
        //    78: aload           4
        //    80: invokevirtual   java/io/File.exists:()Z
        //    83: ifeq            92
        //    86: aload           4
        //    88: invokevirtual   java/io/File.delete:()Z
        //    91: pop            
        //    92: aload           4
        //    94: invokevirtual   java/io/File.createNewFile:()Z
        //    97: ifeq            55
        //   100: aload           4
        //   102: invokevirtual   java/io/File.delete:()Z
        //   105: pop            
        //   106: iconst_1       
        //   107: ireturn        
        //   108: astore          5
        //   110: aload           5
        //   112: athrow         
        //   113: astore          6
        //   115: iconst_0       
        //   116: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     50     57     63     Ljava/io/IOException;
        //  58     60     60     63     Ljava/io/IOException;
        //  78     92     108    113    Ljava/io/IOException;
        //  92     106    113    117    Ljava/io/IOException;
        //  110    113    113    117    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0092:
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
    
    public static ak c() {
        final ak ak = new ak();
        ak.c = true;
        return ak;
    }
}
