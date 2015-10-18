// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Build$VERSION;
import android.content.res.Resources;
import java.lang.reflect.Method;

public class aai
{
    private static final String[] z;
    private Method a;
    private Resources b;
    private String c;
    private el d;
    
    static {
        final String[] z2 = new String[4];
        String s = "A|+\u001d;Uv*==C[>(\nCa+";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '^';
                        break;
                    }
                    case 0: {
                        c2 = '&';
                        break;
                    }
                    case 1: {
                        c2 = '\u0019';
                        break;
                    }
                    case 2: {
                        c2 = '_';
                        break;
                    }
                    case 3: {
                        c2 = 'O';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "vu*=?J9-*-Il-,;\u0006P\u001bo}\u0016a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0006h*.0Rp+6c";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0006p+*3\u001b";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public aai(final Resources b) {
        this.b = b;
        if (Build$VERSION.SDK_INT >= 11) {
            return;
        }
        try {
            (this.a = b.getAssets().getClass().getDeclaredMethod(aai.z[0], Integer.TYPE, Integer.TYPE)).setAccessible(true);
        }
        catch (SecurityException ex) {
            Log.b(ex);
        }
        catch (NoSuchMethodException ex2) {
            Log.b(ex2);
        }
    }
    
    public String a(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     3: bipush          11
        //     5: if_icmplt       25
        //     8: aload_0        
        //     9: getfield        com/whatsapp/aai.b:Landroid/content/res/Resources;
        //    12: iload_1        
        //    13: iload_2        
        //    14: invokevirtual   android/content/res/Resources.getQuantityString:(II)Ljava/lang/String;
        //    17: astore          22
        //    19: aload           22
        //    21: areturn        
        //    22: astore_3       
        //    23: aload_3        
        //    24: athrow         
        //    25: aload_0        
        //    26: getfield        com/whatsapp/aai.a:Ljava/lang/reflect/Method;
        //    29: ifnonnull       51
        //    32: aload_0        
        //    33: getfield        com/whatsapp/aai.b:Landroid/content/res/Resources;
        //    36: iload_1        
        //    37: iload_2        
        //    38: invokevirtual   android/content/res/Resources.getQuantityString:(II)Ljava/lang/String;
        //    41: astore          21
        //    43: aload           21
        //    45: areturn        
        //    46: astore          4
        //    48: aload           4
        //    50: athrow         
        //    51: aload_0        
        //    52: getfield        com/whatsapp/aai.b:Landroid/content/res/Resources;
        //    55: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //    58: getfield        android/content/res/Configuration.locale:Ljava/util/Locale;
        //    61: astore          5
        //    63: aload           5
        //    65: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //    68: aload_0        
        //    69: getfield        com/whatsapp/aai.c:Ljava/lang/String;
        //    72: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    75: ifne            96
        //    78: aload_0        
        //    79: aload           5
        //    81: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //    84: putfield        com/whatsapp/aai.c:Ljava/lang/String;
        //    87: aload_0        
        //    88: aload           5
        //    90: invokestatic    com/whatsapp/el.a:(Ljava/util/Locale;)Lcom/whatsapp/el;
        //    93: putfield        com/whatsapp/aai.d:Lcom/whatsapp/el;
        //    96: aload_0        
        //    97: getfield        com/whatsapp/aai.d:Lcom/whatsapp/el;
        //   100: ifnonnull       127
        //   103: aload_0        
        //   104: getfield        com/whatsapp/aai.b:Landroid/content/res/Resources;
        //   107: iload_1        
        //   108: iload_2        
        //   109: invokevirtual   android/content/res/Resources.getQuantityString:(II)Ljava/lang/String;
        //   112: astore          20
        //   114: aload           20
        //   116: areturn        
        //   117: astore          6
        //   119: aload           6
        //   121: athrow         
        //   122: astore          7
        //   124: aload           7
        //   126: athrow         
        //   127: aconst_null    
        //   128: astore          8
        //   130: iconst_0       
        //   131: ifne            192
        //   134: aload_0        
        //   135: getfield        com/whatsapp/aai.a:Ljava/lang/reflect/Method;
        //   138: astore          17
        //   140: aload_0        
        //   141: getfield        com/whatsapp/aai.b:Landroid/content/res/Resources;
        //   144: invokevirtual   android/content/res/Resources.getAssets:()Landroid/content/res/AssetManager;
        //   147: astore          18
        //   149: iconst_2       
        //   150: anewarray       Ljava/lang/Object;
        //   153: astore          19
        //   155: aload           19
        //   157: iconst_0       
        //   158: iload_1        
        //   159: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   162: aastore        
        //   163: aload           19
        //   165: iconst_1       
        //   166: aload_0        
        //   167: getfield        com/whatsapp/aai.d:Lcom/whatsapp/el;
        //   170: iload_2        
        //   171: invokevirtual   com/whatsapp/el.b:(I)I
        //   174: invokestatic    com/whatsapp/el.c:(I)I
        //   177: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   180: aastore        
        //   181: aload           17
        //   183: aload           18
        //   185: aload           19
        //   187: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   190: astore          8
        //   192: aload           8
        //   194: ifnonnull       250
        //   197: aload_0        
        //   198: getfield        com/whatsapp/aai.a:Ljava/lang/reflect/Method;
        //   201: astore          12
        //   203: aload_0        
        //   204: getfield        com/whatsapp/aai.b:Landroid/content/res/Resources;
        //   207: invokevirtual   android/content/res/Resources.getAssets:()Landroid/content/res/AssetManager;
        //   210: astore          13
        //   212: iconst_2       
        //   213: anewarray       Ljava/lang/Object;
        //   216: astore          14
        //   218: aload           14
        //   220: iconst_0       
        //   221: iload_1        
        //   222: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   225: aastore        
        //   226: aload           14
        //   228: iconst_1       
        //   229: ldc             16777220
        //   231: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   234: aastore        
        //   235: aload           12
        //   237: aload           13
        //   239: aload           14
        //   241: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   244: astore          15
        //   246: aload           15
        //   248: astore          8
        //   250: aload           8
        //   252: ifnonnull       372
        //   255: new             Landroid/content/res/Resources$NotFoundException;
        //   258: dup            
        //   259: new             Ljava/lang/StringBuilder;
        //   262: dup            
        //   263: invokespecial   java/lang/StringBuilder.<init>:()V
        //   266: getstatic       com/whatsapp/aai.z:[Ljava/lang/String;
        //   269: iconst_1       
        //   270: aaload         
        //   271: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   274: iload_1        
        //   275: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   281: getstatic       com/whatsapp/aai.z:[Ljava/lang/String;
        //   284: iconst_2       
        //   285: aaload         
        //   286: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   289: iload_2        
        //   290: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   293: getstatic       com/whatsapp/aai.z:[Ljava/lang/String;
        //   296: iconst_3       
        //   297: aaload         
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: aload_0        
        //   302: getfield        com/whatsapp/aai.d:Lcom/whatsapp/el;
        //   305: iload_2        
        //   306: invokevirtual   com/whatsapp/el.b:(I)I
        //   309: invokestatic    com/whatsapp/el.a:(I)Ljava/lang/String;
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   318: invokespecial   android/content/res/Resources$NotFoundException.<init>:(Ljava/lang/String;)V
        //   321: athrow         
        //   322: astore          16
        //   324: aload           16
        //   326: athrow         
        //   327: astore          11
        //   329: new             Landroid/content/res/Resources$NotFoundException;
        //   332: dup            
        //   333: aload           11
        //   335: invokevirtual   java/lang/IllegalArgumentException.getMessage:()Ljava/lang/String;
        //   338: invokespecial   android/content/res/Resources$NotFoundException.<init>:(Ljava/lang/String;)V
        //   341: athrow         
        //   342: astore          10
        //   344: new             Landroid/content/res/Resources$NotFoundException;
        //   347: dup            
        //   348: aload           10
        //   350: invokevirtual   java/lang/IllegalAccessException.getMessage:()Ljava/lang/String;
        //   353: invokespecial   android/content/res/Resources$NotFoundException.<init>:(Ljava/lang/String;)V
        //   356: athrow         
        //   357: astore          9
        //   359: new             Landroid/content/res/Resources$NotFoundException;
        //   362: dup            
        //   363: aload           9
        //   365: invokevirtual   java/lang/reflect/InvocationTargetException.getMessage:()Ljava/lang/String;
        //   368: invokespecial   android/content/res/Resources$NotFoundException.<init>:(Ljava/lang/String;)V
        //   371: athrow         
        //   372: aload           8
        //   374: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   377: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  0      19     22     25     Ljava/lang/IllegalArgumentException;
        //  25     43     46     51     Ljava/lang/IllegalArgumentException;
        //  63     96     117    122    Ljava/lang/IllegalArgumentException;
        //  96     114    122    127    Ljava/lang/IllegalArgumentException;
        //  134    192    327    342    Ljava/lang/IllegalArgumentException;
        //  134    192    342    357    Ljava/lang/IllegalAccessException;
        //  134    192    357    372    Ljava/lang/reflect/InvocationTargetException;
        //  197    246    327    342    Ljava/lang/IllegalArgumentException;
        //  197    246    342    357    Ljava/lang/IllegalAccessException;
        //  197    246    357    372    Ljava/lang/reflect/InvocationTargetException;
        //  255    322    322    327    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
    
    public String a(final int n, final int n2, final Object[] array) {
        return String.format(this.b.getConfiguration().locale, this.a(n, n2), array);
    }
}
