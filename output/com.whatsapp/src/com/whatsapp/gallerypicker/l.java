// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import android.content.ContentResolver;

public class l extends k implements bj
{
    private static final String[] m;
    private static final String z;
    private int l;
    
    static {
        final char[] charArray = "]\u001b\u000f\u0000YX\u0007\f\u000bOY\u0006\f\b}\u0010\u0015\u000e\u001d-U\n\u0002\f}D\u001b\u000e\u0007".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\r';
                    break;
                }
                case 0: {
                    c2 = '0';
                    break;
                }
                case 1: {
                    c2 = 'r';
                    break;
                }
                case 2: {
                    c2 = 'a';
                    break;
                }
                case 3: {
                    c2 = 'i';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        final String[] j = new String[3];
        String s = "o\u001b\u0005";
        int n2 = -1;
        String[] array = j;
        int n3 = 0;
        String intern = null;
    Label_0333:
        while (true) {
            final char[] charArray2 = s.toCharArray();
            for (int k = charArray2.length, n4 = 0; k > n4; ++n4) {
                final char c3 = charArray2[n4];
                char c4 = '\0';
                switch (n4 % 5) {
                    default: {
                        c4 = '\r';
                        break;
                    }
                    case 0: {
                        c4 = '0';
                        break;
                    }
                    case 1: {
                        c4 = 'r';
                        break;
                    }
                    case 2: {
                        c4 = 'a';
                        break;
                    }
                    case 3: {
                        c4 = 'i';
                        break;
                    }
                }
                charArray2[n4] = (char)(c4 ^ c3);
            }
            intern = new String(charArray2).intern();
            switch (n2) {
                default: {
                    array[n3] = intern;
                    s = "G\u001b\u0005\u001de";
                    n3 = 1;
                    array = j;
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n3] = intern;
                    n3 = 2;
                    array = j;
                    s = "X\u0017\b\u000eeD";
                    n2 = 1;
                    continue;
                }
                case 1: {
                    break Label_0333;
                }
            }
        }
        array[n3] = intern;
        m = j;
    }
    
    public l(final ba ba, final ContentResolver contentResolver, final long n, final int n2, final Uri uri, final String s, final String s2, final long n3, final String s3, final int l) {
        super(ba, contentResolver, n, n2, uri, s, s2, n3, s3);
        this.l = l;
    }
    
    @Override
    public int a() {
        return this.l;
    }
    
    @Override
    public Bitmap a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     3: bipush          14
        //     5: if_icmpge       180
        //     8: new             Landroid/media/ExifInterface;
        //    11: dup            
        //    12: aload_0        
        //    13: getfield        com/whatsapp/gallerypicker/l.k:Ljava/lang/String;
        //    16: invokespecial   android/media/ExifInterface.<init>:(Ljava/lang/String;)V
        //    19: invokevirtual   android/media/ExifInterface.getThumbnail:()[B
        //    22: astore          16
        //    24: aload           16
        //    26: astore          11
        //    28: aload           11
        //    30: ifnull          359
        //    33: new             Landroid/graphics/BitmapFactory$Options;
        //    36: dup            
        //    37: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //    40: astore          12
        //    42: aload           12
        //    44: iconst_1       
        //    45: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //    48: aload           11
        //    50: iconst_0       
        //    51: aload           11
        //    53: arraylength    
        //    54: aload           12
        //    56: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    59: pop            
        //    60: aload           12
        //    62: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //    65: iload_1        
        //    66: if_icmplt       359
        //    69: aload           12
        //    71: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //    74: istore          15
        //    76: iload           15
        //    78: iload_1        
        //    79: if_icmplt       359
        //    82: aload           12
        //    84: aload           12
        //    86: iload_1        
        //    87: iconst_2       
        //    88: iload_1        
        //    89: iload_1        
        //    90: imul           
        //    91: imul           
        //    92: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/graphics/BitmapFactory$Options;II)I
        //    95: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //    98: aload           12
        //   100: iconst_0       
        //   101: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   104: aload           12
        //   106: iconst_0       
        //   107: putfield        android/graphics/BitmapFactory$Options.inDither:Z
        //   110: aload           12
        //   112: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   115: putfield        android/graphics/BitmapFactory$Options.inPreferredConfig:Landroid/graphics/Bitmap$Config;
        //   118: aload           11
        //   120: iconst_0       
        //   121: aload           11
        //   123: arraylength    
        //   124: aload           12
        //   126: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   129: astore          4
        //   131: aload           4
        //   133: ifnull          147
        //   136: aload           4
        //   138: aload_0        
        //   139: invokevirtual   com/whatsapp/gallerypicker/l.a:()I
        //   142: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
        //   145: astore          4
        //   147: aload           4
        //   149: ifnonnull       164
        //   152: aload_0        
        //   153: iload_1        
        //   154: iconst_2       
        //   155: iload_1        
        //   156: iload_1        
        //   157: imul           
        //   158: imul           
        //   159: invokevirtual   com/whatsapp/gallerypicker/l.a:(II)Landroid/graphics/Bitmap;
        //   162: astore          4
        //   164: aload           4
        //   166: areturn        
        //   167: astore          10
        //   169: aconst_null    
        //   170: astore          11
        //   172: goto            28
        //   175: astore          13
        //   177: aload           13
        //   179: athrow         
        //   180: iload_1        
        //   181: sipush          144
        //   184: if_icmpge       241
        //   187: aload_0        
        //   188: getfield        com/whatsapp/gallerypicker/l.d:J
        //   191: lstore          7
        //   193: invokestatic    com/whatsapp/gallerypicker/a2.a:()Lcom/whatsapp/gallerypicker/a2;
        //   196: aload_0        
        //   197: getfield        com/whatsapp/gallerypicker/l.i:Landroid/content/ContentResolver;
        //   200: lload           7
        //   202: iconst_3       
        //   203: aconst_null    
        //   204: iconst_0       
        //   205: invokevirtual   com/whatsapp/gallerypicker/a2.a:(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;Z)Landroid/graphics/Bitmap;
        //   208: astore          9
        //   210: aload           9
        //   212: astore          4
        //   214: aload           4
        //   216: ifnull          164
        //   219: aload           4
        //   221: aload_0        
        //   222: invokevirtual   com/whatsapp/gallerypicker/l.a:()I
        //   225: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
        //   228: areturn        
        //   229: astore          6
        //   231: getstatic       com/whatsapp/gallerypicker/l.z:Ljava/lang/String;
        //   234: aload           6
        //   236: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   239: aconst_null    
        //   240: areturn        
        //   241: new             Landroid/graphics/BitmapFactory$Options;
        //   244: dup            
        //   245: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   248: astore_2       
        //   249: aload_2        
        //   250: iconst_0       
        //   251: putfield        android/graphics/BitmapFactory$Options.inDither:Z
        //   254: aload_2        
        //   255: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   258: putfield        android/graphics/BitmapFactory$Options.inPreferredConfig:Landroid/graphics/Bitmap$Config;
        //   261: aload_0        
        //   262: getfield        com/whatsapp/gallerypicker/l.i:Landroid/content/ContentResolver;
        //   265: aload_0        
        //   266: getfield        com/whatsapp/gallerypicker/l.d:J
        //   269: iconst_1       
        //   270: getstatic       com/whatsapp/gallerypicker/l.m:[Ljava/lang/String;
        //   273: invokestatic    android/provider/MediaStore$Images$Thumbnails.queryMiniThumbnail:(Landroid/content/ContentResolver;JI[Ljava/lang/String;)Landroid/database/Cursor;
        //   276: astore_3       
        //   277: aload_3        
        //   278: ifnull          332
        //   281: aload_3        
        //   282: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   287: ifeq            326
        //   290: aload_2        
        //   291: aload_3        
        //   292: iconst_1       
        //   293: invokeinterface android/database/Cursor.getInt:(I)I
        //   298: putfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   301: aload_2        
        //   302: aload_3        
        //   303: iconst_2       
        //   304: invokeinterface android/database/Cursor.getInt:(I)I
        //   309: putfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   312: aload_2        
        //   313: aload_2        
        //   314: iload_1        
        //   315: iconst_2       
        //   316: iload_1        
        //   317: iload_1        
        //   318: imul           
        //   319: imul           
        //   320: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/graphics/BitmapFactory$Options;II)I
        //   323: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   326: aload_3        
        //   327: invokeinterface android/database/Cursor.close:()V
        //   332: invokestatic    com/whatsapp/gallerypicker/a2.a:()Lcom/whatsapp/gallerypicker/a2;
        //   335: aload_0        
        //   336: getfield        com/whatsapp/gallerypicker/l.i:Landroid/content/ContentResolver;
        //   339: aload_0        
        //   340: getfield        com/whatsapp/gallerypicker/l.d:J
        //   343: iconst_1       
        //   344: aload_2        
        //   345: iconst_0       
        //   346: invokevirtual   com/whatsapp/gallerypicker/a2.a:(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;Z)Landroid/graphics/Bitmap;
        //   349: astore          4
        //   351: goto            214
        //   354: astore          5
        //   356: aload           5
        //   358: athrow         
        //   359: aconst_null    
        //   360: astore          4
        //   362: goto            131
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      24     167    175    Ljava/lang/Throwable;
        //  42     76     175    180    Ljava/lang/Throwable;
        //  187    210    229    241    Ljava/lang/Throwable;
        //  281    326    354    359    Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0131:
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
