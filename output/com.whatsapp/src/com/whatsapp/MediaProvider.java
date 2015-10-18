// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.Cursor;
import android.content.ContentValues;
import android.net.Uri;
import android.content.UriMatcher;
import android.content.ContentProvider;

public class MediaProvider extends ContentProvider
{
    private static final UriMatcher a;
    public static final Uri b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        int n = 0;
        String[] array = z2;
        String s = "gA(G)}";
        int n2 = -1;
        String z3 = null;
    Label_0197:
        while (true) {
            z3 = z(z(s));
            switch (n2) {
                default: {
                    array[n] = z3;
                    s = "[B\"N#yBiu\u001eG\f";
                    n = 1;
                    array = z2;
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n] = z3;
                    s = "gB*L9jI";
                    n = 2;
                    array = z2;
                    n2 = 1;
                    continue;
                }
                case 1: {
                    array[n] = z3;
                    s = "xE-E#";
                    n = 3;
                    array = z2;
                    n2 = 2;
                    continue;
                }
                case 2: {
                    array[n] = z3;
                    n = 4;
                    array = z2;
                    s = "lY*K)ze-";
                    n2 = 3;
                    continue;
                }
                case 3: {
                    array[n] = z3;
                    n = 5;
                    s = "[B\"N#yBiu\u001eG\f";
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n] = z3;
                    n = 6;
                    s = "xB-\u000e-`H;O%j\u0002*U>}C;\u000e(g^fV\"j\u0002*O! [!A8}M9Pb~^&V%jI;\u000e!kH AblY*K)z_";
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n] = z3;
                    n = 7;
                    s = "xB-\u000e-`H;O%j\u0002*U>}C;\u000e(g^fV\"j\u0002*O! [!A8}M9Pb~^&V%jI;\u000e!kH AbgX,M?";
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0197;
                }
            }
        }
        array[n] = z3;
        z = z2;
        b = Uri.parse(z(z("mC'T)`Xs\u000fcmC$\u000e;fM=S-~\\gP>aZ D)|\u0002$E(gM")));
        a = new UriMatcher(-1);
        UriMatcher uriMatcher = MediaProvider.a;
        String s2 = "mC$\u000e;fM=S-~\\gP>aZ D)|\u0002$E(gM";
        int n3 = -1;
        String z4 = null;
        String z5 = null;
    Label_0343:
        while (true) {
            z4 = z(z(s2));
            String s3 = null;
            int n4 = 0;
            switch (n3) {
                default: {
                    s3 = "lY*K)z_";
                    n4 = -1;
                    break;
                }
                case 0: {
                    s3 = "gX,M?";
                    n4 = 0;
                    break;
                }
            }
            z5 = z(z(s3));
            switch (n4) {
                default: {
                    uriMatcher.addURI(z4, z5, 1);
                    uriMatcher = MediaProvider.a;
                    s2 = "mC$\u000e;fM=S-~\\gP>aZ D)|\u0002$E(gM";
                    n3 = 0;
                    continue;
                }
                case 0: {
                    break Label_0343;
                }
            }
        }
        uriMatcher.addURI(z4, z5, 2);
    }
    
    private static String z(final char[] array) {
        for (int i = array.length, n = 0; i > n; ++n) {
            final char c = array[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'L';
                    break;
                }
                case 0: {
                    c2 = '\u000e';
                    break;
                }
                case 1: {
                    c2 = ',';
                    break;
                }
                case 2: {
                    c2 = 'I';
                    break;
                }
                case 3: {
                    c2 = ' ';
                    break;
                }
            }
            array[n] = (char)(c2 ^ c);
        }
        return new String(array).intern();
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length < 2) {
            charArray[0] ^= 'L';
        }
        return charArray;
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        throw new UnsupportedOperationException();
    }
    
    public String getType(final Uri uri) {
        try {
            switch (MediaProvider.a.match(uri)) {
                default: {
                    throw new IllegalArgumentException(MediaProvider.z[5] + uri);
                }
                case 1: {
                    return MediaProvider.z[6];
                }
                case 2: {
                    break;
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return MediaProvider.z[7];
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }
    
    public boolean onCreate() {
        return true;
    }
    
    public Cursor query(final Uri p0, final String[] p1, final String p2, final String[] p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/MediaProvider.a:Landroid/content/UriMatcher;
        //     3: aload_1        
        //     4: invokevirtual   android/content/UriMatcher.match:(Landroid/net/Uri;)I
        //     7: istore          7
        //     9: iload           7
        //    11: tableswitch {
        //                2: 62
        //                3: 83
        //          default: 32
        //        }
        //    32: new             Ljava/lang/IllegalArgumentException;
        //    35: dup            
        //    36: new             Ljava/lang/StringBuilder;
        //    39: dup            
        //    40: invokespecial   java/lang/StringBuilder.<init>:()V
        //    43: getstatic       com/whatsapp/MediaProvider.z:[Ljava/lang/String;
        //    46: iconst_1       
        //    47: aaload         
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: aload_1        
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    55: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    58: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    61: athrow         
        //    62: new             Lcom/whatsapp/a0k;
        //    65: dup            
        //    66: aload_0        
        //    67: invokevirtual   com/whatsapp/MediaProvider.getContext:()Landroid/content/Context;
        //    70: invokespecial   com/whatsapp/a0k.<init>:(Landroid/content/Context;)V
        //    73: astore          21
        //    75: aload           21
        //    77: areturn        
        //    78: astore          6
        //    80: aload           6
        //    82: athrow         
        //    83: aload_1        
        //    84: getstatic       com/whatsapp/MediaProvider.z:[Ljava/lang/String;
        //    87: iconst_4       
        //    88: aaload         
        //    89: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //    92: astore          8
        //    94: aload_1        
        //    95: getstatic       com/whatsapp/MediaProvider.z:[Ljava/lang/String;
        //    98: iconst_2       
        //    99: aaload         
        //   100: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   103: astore          9
        //   105: aload           9
        //   107: ifnonnull       137
        //   110: new             Lcom/whatsapp/a8a;
        //   113: dup            
        //   114: aload           8
        //   116: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   119: aload           8
        //   121: invokevirtual   com/whatsapp/vy.z:(Ljava/lang/String;)Landroid/database/Cursor;
        //   124: invokespecial   com/whatsapp/a8a.<init>:(Ljava/lang/String;Landroid/database/Cursor;)V
        //   127: astore          19
        //   129: aload           19
        //   131: areturn        
        //   132: astore          20
        //   134: aload           20
        //   136: athrow         
        //   137: aload           9
        //   139: invokevirtual   java/lang/String.hashCode:()I
        //   142: istore          11
        //   144: iload           11
        //   146: lookupswitch {
        //          -1185250696: 328
        //          112202875: 218
        //          default: 172
        //        }
        //   172: iconst_m1      
        //   173: istore          12
        //   175: iload           12
        //   177: tableswitch {
        //                0: 281
        //                1: 309
        //          default: 200
        //        }
        //   200: new             Lcom/whatsapp/a8a;
        //   203: dup            
        //   204: aload           8
        //   206: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   209: aload           8
        //   211: invokevirtual   com/whatsapp/vy.z:(Ljava/lang/String;)Landroid/database/Cursor;
        //   214: invokespecial   com/whatsapp/a8a.<init>:(Ljava/lang/String;Landroid/database/Cursor;)V
        //   217: areturn        
        //   218: aload           9
        //   220: getstatic       com/whatsapp/MediaProvider.z:[Ljava/lang/String;
        //   223: iconst_3       
        //   224: aaload         
        //   225: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   228: istore          17
        //   230: iload           17
        //   232: ifeq            172
        //   235: getstatic       com/whatsapp/App.I:Z
        //   238: istore          18
        //   240: iconst_0       
        //   241: istore          12
        //   243: iload           18
        //   245: ifeq            175
        //   248: aload           9
        //   250: getstatic       com/whatsapp/MediaProvider.z:[Ljava/lang/String;
        //   253: iconst_0       
        //   254: aaload         
        //   255: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   258: istore          14
        //   260: iload           14
        //   262: ifeq            175
        //   265: iconst_1       
        //   266: istore          12
        //   268: goto            175
        //   271: astore          10
        //   273: aload           10
        //   275: athrow         
        //   276: astore          13
        //   278: aload           13
        //   280: athrow         
        //   281: new             Lcom/whatsapp/a8a;
        //   284: dup            
        //   285: aload           8
        //   287: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   290: aload           8
        //   292: iconst_3       
        //   293: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;B)Landroid/database/Cursor;
        //   296: invokespecial   com/whatsapp/a8a.<init>:(Ljava/lang/String;Landroid/database/Cursor;)V
        //   299: astore          15
        //   301: aload           15
        //   303: areturn        
        //   304: astore          16
        //   306: aload           16
        //   308: athrow         
        //   309: new             Lcom/whatsapp/a8a;
        //   312: dup            
        //   313: aload           8
        //   315: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   318: aload           8
        //   320: iconst_1       
        //   321: invokevirtual   com/whatsapp/vy.a:(Ljava/lang/String;B)Landroid/database/Cursor;
        //   324: invokespecial   com/whatsapp/a8a.<init>:(Ljava/lang/String;Landroid/database/Cursor;)V
        //   327: areturn        
        //   328: iconst_m1      
        //   329: istore          12
        //   331: goto            248
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      9      78     83     Ljava/lang/IllegalArgumentException;
        //  62     75     78     83     Ljava/lang/IllegalArgumentException;
        //  110    129    132    137    Ljava/lang/IllegalArgumentException;
        //  137    144    271    276    Ljava/lang/IllegalArgumentException;
        //  218    230    271    276    Ljava/lang/IllegalArgumentException;
        //  235    240    276    281    Ljava/lang/IllegalArgumentException;
        //  248    260    276    281    Ljava/lang/IllegalArgumentException;
        //  281    301    304    309    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0248:
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
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException();
    }
}
