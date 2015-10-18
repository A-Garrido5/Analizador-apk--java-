// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.graphics.Point;
import android.content.SharedPreferences$Editor;
import java.io.FileOutputStream;
import java.io.IOException;
import com.whatsapp.util.Log;
import com.whatsapp.al5;
import com.whatsapp.App;
import android.net.Uri;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class h
{
    private static Drawable a;
    public static boolean b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[51];
        String s = "iRJ\u0011";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = '8';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = 'v';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "0YV\u001a=&H_\u0004b ]N!,+Tj\u0017=\"J\u0000-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "0YV\u001a=&H_\u0004`";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "$WWX:/YN\u0005,7He\u0006?\"^_\u0004()[_\u0005";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "$WWX:/YN\u0005,7H\u0014\u0001,+TJ\u0017=\"J";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "0YV\u001a=&H_\u0004b ]NV";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "0YV\u001a=&H_\u0004c-H]";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "0YV\u001a=&H_\u0004c-H]";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "0YV\u001a=&H_\u0004b$YT\u0018\"3\u0018^\u0013.(\\_V)\"^[\u0003!3\u0018M\u0017!+H[\u0006(5";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "0YV\u001a=&H_\u0004b ]NV#2TV";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "0YV\u001a=&H_\u0004c-H]";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "0YV\u001a=&H_\u0004b5]I\u00139";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "0YV\u001a=&H_\u0004b#]\\\u00178+L";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "0YV\u001a=&H_\u0004c-H]";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "0QT\u0012\"0";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0005YY\u001d87K";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "0YV\u001a=&H_\u0004c-H]";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "0YV\u001a=&H_\u0004b%YY\u001d87\u0017_\u0004?(J\u001a";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "0YV\u001a=&H_\u0004b%YY\u001d87\u0017I\u0012.&J^)8)YL\u0017$+YX\u001a(g";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "*WO\u00189\"\\";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "0YV\u001a=&H_\u0004c%SO\u0006";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "0YV\u001a=&H_\u0004b%YY\u001d87\u0017I\u001f7\"\u0018";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "0QT\u0012\"0";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "0YV\u001a=&H_\u0004c%SO\u0006";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u0015\u001983\u0017S\u0019(5JU\u0004m";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u0015\u001f#hQU\u0013?5WHV";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u0015\u0015\"7A\u001a";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u001a\u0015\"*HV\u00139\"";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u001a\u0005&.HJ\u001f# \u0018\\\u001f#&T\u001a\u0004()YW\u0013m#M_V9(\u0018I\u001f7\"\u0018W\u001f>*YN\u0015%";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u0015\u001983\u0017S\u0019(5JU\u0004m";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u0015\u001f#hQU\u0013?5WHV";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "0YV\u001a=&H_\u0004c-H]";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u0015\u001f#hQU\u0013?5WHV";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u0015\u001983\u0017S\u0019(5JU\u0004m";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u0005YY\u001d87K";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "0YV\u001a=&H_\u0004c%SO\u0006";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u001a\u0015\"2T^V#(L\u001a\u0004()YW\u0013m3UJV+.T_";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "0YV\u001a=&H_\u0004b5]I\u0002\"5]\u0015\u001f\"\"JH\u0019?g";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "0YV\u001a=&H_\u0004b(WW";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "0YV\u001a=&H_\u0004c-H]";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "0YV\u001a=&H_\u0004b5MT\u0002$*]_\u000e.\"HN\u001f\")";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "$WWX:/YN\u0005,7H\u0014\u0001,+TJ\u0017=\"J";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "0YV\u001a=&H_\u0004b4]NV";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "0YV\u001a=&H_\u0004b)YW\u0013#(L\\\u00198)\\_\u000e.\"HN\u001f\")";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "$WWX:/YN\u0005,7He\u0006?\"^_\u0004()[_\u0005";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "gD\u001a";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "wx";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "0YV\u001a=&H_\u0004b4]N!,+Tj\u0017=\"J\u0000-";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "gD\u001a";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "vx";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "0YV\u001a=&H_\u0004`";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    break Label_1307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private static Bitmap a(final Bitmap p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/wallpaper/ImageViewTouchBase.h:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: ifnonnull       12
        //     8: aconst_null    
        //     9: astore_0       
        //    10: aload_0        
        //    11: areturn        
        //    12: aload_0        
        //    13: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //    16: i2f            
        //    17: iload_1        
        //    18: i2f            
        //    19: fdiv           
        //    20: fstore          4
        //    22: aload_0        
        //    23: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //    26: i2f            
        //    27: iload_2        
        //    28: i2f            
        //    29: fdiv           
        //    30: fstore          5
        //    32: fload           4
        //    34: fload           5
        //    36: fcmpl          
        //    37: ifle            116
        //    40: aload_0        
        //    41: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //    44: i2f            
        //    45: fload           5
        //    47: fdiv           
        //    48: f2i            
        //    49: istore          10
        //    51: iload           10
        //    53: ifle            109
        //    56: iload_2        
        //    57: ifle            109
        //    60: iload_1        
        //    61: ifle            109
        //    64: aload_0        
        //    65: iload           10
        //    67: iload_2        
        //    68: iconst_1       
        //    69: invokestatic    android/graphics/Bitmap.createScaledBitmap:(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
        //    72: astore          11
        //    74: aload           11
        //    76: aload           11
        //    78: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //    81: iload_1        
        //    82: isub           
        //    83: iconst_2       
        //    84: idiv           
        //    85: iconst_0       
        //    86: iload_1        
        //    87: iload_2        
        //    88: invokestatic    android/graphics/Bitmap.createBitmap:(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
        //    91: astore          8
        //    93: aload           8
        //    95: aload           11
        //    97: if_acmpeq       105
        //   100: aload           11
        //   102: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   105: iload_3        
        //   106: ifeq            112
        //   109: aload_0        
        //   110: astore          8
        //   112: iload_3        
        //   113: ifeq            191
        //   116: aload_0        
        //   117: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   120: i2f            
        //   121: iload_1        
        //   122: i2f            
        //   123: fmul           
        //   124: aload_0        
        //   125: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   128: i2f            
        //   129: fdiv           
        //   130: f2i            
        //   131: istore          6
        //   133: iload           6
        //   135: ifle            10
        //   138: iload_2        
        //   139: ifle            10
        //   142: iload_1        
        //   143: ifle            10
        //   146: aload_0        
        //   147: iload_1        
        //   148: iload           6
        //   150: iconst_1       
        //   151: invokestatic    android/graphics/Bitmap.createScaledBitmap:(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
        //   154: astore          7
        //   156: aload           7
        //   158: iconst_0       
        //   159: aload           7
        //   161: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   164: iload_2        
        //   165: isub           
        //   166: iconst_2       
        //   167: idiv           
        //   168: iload_1        
        //   169: iload_2        
        //   170: invokestatic    android/graphics/Bitmap.createBitmap:(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
        //   173: astore          8
        //   175: aload           8
        //   177: aload           7
        //   179: if_acmpeq       187
        //   182: aload           7
        //   184: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   187: iload_3        
        //   188: ifne            10
        //   191: aload           8
        //   193: areturn        
        //   194: astore          12
        //   196: aload           12
        //   198: athrow         
        //   199: astore          9
        //   201: aload           9
        //   203: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  100    105    194    199    Ljava/lang/RuntimeException;
        //  182    187    199    204    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0187:
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
    
    public static Drawable a(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //     4: iconst_3       
        //     5: aaload         
        //     6: iconst_0       
        //     7: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    10: new             Ljava/lang/StringBuilder;
        //    13: dup            
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    20: iconst_2       
        //    21: aaload         
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: aload_1        
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    32: ldc             ""
        //    34: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    39: astore_2       
        //    40: new             Ljava/lang/StringBuilder;
        //    43: dup            
        //    44: invokespecial   java/lang/StringBuilder.<init>:()V
        //    47: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    50: iconst_1       
        //    51: aaload         
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: aload_1        
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: ldc             "]"
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    64: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    67: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    70: aload_2        
        //    71: ldc             "@"
        //    73: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    76: astore_3       
        //    77: aload_3        
        //    78: arraylength    
        //    79: istore          5
        //    81: iload           5
        //    83: iconst_2       
        //    84: if_icmpge       94
        //    87: aconst_null    
        //    88: areturn        
        //    89: astore          4
        //    91: aload           4
        //    93: athrow         
        //    94: aload_3        
        //    95: iconst_0       
        //    96: aaload         
        //    97: ldc             "0"
        //    99: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   102: ifeq            143
        //   105: aload_0        
        //   106: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   109: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   112: iconst_4       
        //   113: aaload         
        //   114: invokevirtual   android/content/pm/PackageManager.getResourcesForApplication:(Ljava/lang/String;)Landroid/content/res/Resources;
        //   117: aload_3        
        //   118: iconst_1       
        //   119: aaload         
        //   120: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   123: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   126: astore          14
        //   128: aload           14
        //   130: areturn        
        //   131: astore          13
        //   133: aload           13
        //   135: invokevirtual   android/content/pm/PackageManager$NameNotFoundException.toString:()Ljava/lang/String;
        //   138: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   141: aconst_null    
        //   142: areturn        
        //   143: aload_3        
        //   144: iconst_1       
        //   145: aaload         
        //   146: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   149: astore          6
        //   151: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   154: aload           6
        //   156: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   159: astore          11
        //   161: aload           11
        //   163: astore          8
        //   165: new             Landroid/graphics/drawable/BitmapDrawable;
        //   168: dup            
        //   169: aload_0        
        //   170: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   173: aload           8
        //   175: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
        //   178: invokespecial   android/graphics/drawable/BitmapDrawable.<init>:(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
        //   181: astore          12
        //   183: aload           8
        //   185: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   188: aload           12
        //   190: areturn        
        //   191: astore          10
        //   193: aconst_null    
        //   194: astore          8
        //   196: aload           10
        //   198: invokevirtual   java/io/FileNotFoundException.toString:()Ljava/lang/String;
        //   201: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   204: aload           8
        //   206: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   209: aconst_null    
        //   210: areturn        
        //   211: astore          7
        //   213: aconst_null    
        //   214: astore          8
        //   216: aload           7
        //   218: astore          9
        //   220: aload           8
        //   222: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   225: aload           9
        //   227: athrow         
        //   228: astore          9
        //   230: goto            220
        //   233: astore          10
        //   235: goto            196
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  77     81     89     94     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  105    128    131    143    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  151    161    191    196    Ljava/io/FileNotFoundException;
        //  151    161    211    220    Any
        //  165    183    233    238    Ljava/io/FileNotFoundException;
        //  165    183    228    233    Any
        //  196    204    228    233    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0196:
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
    
    public static Drawable a(final Context p0, final boolean p1, final int p2, final Uri p3, final int p4, final int p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          6
        //     3: getstatic       com/whatsapp/wallpaper/ImageViewTouchBase.h:Z
        //     6: istore          7
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: invokespecial   java/lang/StringBuilder.<init>:()V
        //    15: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    18: bipush          42
        //    20: aaload         
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    24: iload_1        
        //    25: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    28: ldc             " "
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: iload           4
        //    35: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    38: ldc             "x"
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: iload           5
        //    45: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    48: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    51: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    54: aconst_null    
        //    55: putstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //    58: iload_1        
        //    59: ifeq            335
        //    62: aload_0        
        //    63: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    66: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    69: bipush          41
        //    71: aaload         
        //    72: invokevirtual   android/content/pm/PackageManager.getResourcesForApplication:(Ljava/lang/String;)Landroid/content/res/Resources;
        //    75: iload_2        
        //    76: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    79: putstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //    82: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //    85: checkcast       Landroid/graphics/drawable/BitmapDrawable;
        //    88: invokevirtual   android/graphics/drawable/BitmapDrawable.getBitmap:()Landroid/graphics/Bitmap;
        //    91: iload           4
        //    93: iload           5
        //    95: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //    98: astore          19
        //   100: aload           19
        //   102: ifnull          122
        //   105: new             Landroid/graphics/drawable/BitmapDrawable;
        //   108: dup            
        //   109: aload           19
        //   111: invokespecial   android/graphics/drawable/BitmapDrawable.<init>:(Landroid/graphics/Bitmap;)V
        //   114: putstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   117: iload           7
        //   119: ifeq            134
        //   122: aload_0        
        //   123: aload_0        
        //   124: ldc_w           2131231075
        //   127: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   130: iconst_0       
        //   131: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;Ljava/lang/String;I)V
        //   134: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   137: ifnull          187
        //   140: aload_0        
        //   141: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   144: bipush          39
        //   146: aaload         
        //   147: iconst_0       
        //   148: invokevirtual   android/content/Context.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //   151: astore          11
        //   153: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   156: checkcast       Landroid/graphics/drawable/BitmapDrawable;
        //   159: invokevirtual   android/graphics/drawable/BitmapDrawable.getBitmap:()Landroid/graphics/Bitmap;
        //   162: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   165: bipush          90
        //   167: aload           11
        //   169: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   172: pop            
        //   173: aload           11
        //   175: invokevirtual   java/io/FileOutputStream.flush:()V
        //   178: aload           11
        //   180: invokevirtual   java/io/FileOutputStream.close:()V
        //   183: aload_0        
        //   184: invokestatic    com/whatsapp/wallpaper/h.c:(Landroid/content/Context;)V
        //   187: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   190: areturn        
        //   191: astore          21
        //   193: aload           21
        //   195: athrow         
        //   196: astore          20
        //   198: aload           20
        //   200: athrow         
        //   201: astore          18
        //   203: new             Ljava/lang/StringBuilder;
        //   206: dup            
        //   207: invokespecial   java/lang/StringBuilder.<init>:()V
        //   210: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   213: bipush          43
        //   215: aaload         
        //   216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   219: aload           18
        //   221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   224: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   227: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   230: aload_0        
        //   231: aload_0        
        //   232: ldc_w           2131231075
        //   235: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   238: iconst_0       
        //   239: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;Ljava/lang/String;I)V
        //   242: goto            134
        //   245: astore          17
        //   247: new             Ljava/lang/StringBuilder;
        //   250: dup            
        //   251: invokespecial   java/lang/StringBuilder.<init>:()V
        //   254: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   257: bipush          40
        //   259: aaload         
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   263: aload           17
        //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   268: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   271: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   274: aload_0        
        //   275: aload_0        
        //   276: ldc_w           2131231075
        //   279: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   282: iconst_0       
        //   283: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;Ljava/lang/String;I)V
        //   286: goto            134
        //   289: astore          16
        //   291: new             Ljava/lang/StringBuilder;
        //   294: dup            
        //   295: invokespecial   java/lang/StringBuilder.<init>:()V
        //   298: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   301: bipush          38
        //   303: aaload         
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: aload           16
        //   309: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   312: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   315: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   318: aload_0        
        //   319: aload_0        
        //   320: ldc_w           2131231075
        //   323: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   326: iconst_0       
        //   327: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;Ljava/lang/String;I)V
        //   330: iload           7
        //   332: ifeq            134
        //   335: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   338: aload_3        
        //   339: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   342: astore          6
        //   344: aload           6
        //   346: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
        //   349: astore          13
        //   351: aload           13
        //   353: ifnull          377
        //   356: new             Landroid/graphics/drawable/BitmapDrawable;
        //   359: dup            
        //   360: aload_0        
        //   361: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   364: aload           13
        //   366: invokespecial   android/graphics/drawable/BitmapDrawable.<init>:(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
        //   369: putstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   372: iload           7
        //   374: ifeq            389
        //   377: aload_0        
        //   378: aload_0        
        //   379: ldc_w           2131231075
        //   382: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   385: iconst_0       
        //   386: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;Ljava/lang/String;I)V
        //   389: iconst_1       
        //   390: putstatic       com/whatsapp/wallpaper/h.b:Z
        //   393: aload           6
        //   395: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   398: goto            134
        //   401: astore          15
        //   403: aload           15
        //   405: athrow         
        //   406: astore          14
        //   408: aload           14
        //   410: athrow         
        //   411: astore          9
        //   413: aload           9
        //   415: invokevirtual   java/io/FileNotFoundException.toString:()Ljava/lang/String;
        //   418: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   421: aload           6
        //   423: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   426: goto            134
        //   429: astore          8
        //   431: aload           6
        //   433: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   436: aload           8
        //   438: athrow         
        //   439: astore          10
        //   441: aload           10
        //   443: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   446: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   449: goto            183
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  62     100    201    245    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  62     100    245    289    Ljava/lang/RuntimeException;
        //  62     100    289    335    Ljava/lang/OutOfMemoryError;
        //  105    117    191    196    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  105    117    245    289    Ljava/lang/RuntimeException;
        //  105    117    289    335    Ljava/lang/OutOfMemoryError;
        //  122    134    196    201    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  122    134    245    289    Ljava/lang/RuntimeException;
        //  122    134    289    335    Ljava/lang/OutOfMemoryError;
        //  140    183    439    452    Ljava/io/IOException;
        //  193    196    196    201    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  193    196    245    289    Ljava/lang/RuntimeException;
        //  193    196    289    335    Ljava/lang/OutOfMemoryError;
        //  198    201    201    245    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  198    201    245    289    Ljava/lang/RuntimeException;
        //  198    201    289    335    Ljava/lang/OutOfMemoryError;
        //  335    351    411    429    Ljava/io/FileNotFoundException;
        //  335    351    429    439    Any
        //  356    372    401    406    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  356    372    411    429    Ljava/io/FileNotFoundException;
        //  356    372    429    439    Any
        //  377    389    406    411    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  377    389    411    429    Ljava/io/FileNotFoundException;
        //  377    389    429    439    Any
        //  389    393    411    429    Ljava/io/FileNotFoundException;
        //  389    393    429    439    Any
        //  403    406    406    411    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  403    406    411    429    Ljava/io/FileNotFoundException;
        //  403    406    429    439    Any
        //  408    411    411    429    Ljava/io/FileNotFoundException;
        //  408    411    429    439    Any
        //  413    421    429    439    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 199, Size: 199
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    public static Uri a() {
        return Uri.fromFile(App.a(al5.d(App.aX.jabber_id + Long.toString(System.currentTimeMillis())) + h.z[0]));
    }
    
    public static void a(final Context context) {
        FileOutputStream openFileOutput = null;
        Log.i(h.z[11]);
        h.a = null;
        while (true) {
            try {
                openFileOutput = context.openFileOutput(h.z[10], 0);
                openFileOutput.write(3);
                openFileOutput.flush();
                if (openFileOutput == null) {
                    break Label_0044;
                }
                try {
                    openFileOutput.close();
                    c(context);
                }
                catch (IOException ex) {
                    Log.e(ex.toString());
                }
            }
            catch (IOException ex2) {
                Log.e(ex2.toString());
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                        continue;
                    }
                    catch (IOException ex3) {
                        Log.e(ex3.toString());
                        continue;
                    }
                    continue;
                }
                continue;
            }
            finally {
                Label_0105: {
                    if (openFileOutput == null) {
                        break Label_0105;
                    }
                    try {
                        openFileOutput.close();
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    catch (IOException ex5) {
                        Log.e(ex5.toString());
                    }
                }
            }
            break;
        }
    }
    
    public static void a(final Context context, final String s, final boolean b, final int n, final Uri uri) {
        Log.i(h.z[47] + s + h.z[48] + n + h.z[45] + uri + "]");
        String s2 = null;
        Label_0119: {
            if (b) {
                s2 = h.z[46] + n;
                if (!ImageViewTouchBase.h) {
                    break Label_0119;
                }
            }
            s2 = h.z[49] + uri;
        }
        final SharedPreferences$Editor edit = context.getSharedPreferences(h.z[44], 0).edit();
        edit.putString(h.z[50] + s, s2);
        edit.commit();
    }
    
    public static void b(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: getstatic       com/whatsapp/wallpaper/ImageViewTouchBase.h:Z
        //     5: istore_2       
        //     6: new             Ljava/io/File;
        //     9: dup            
        //    10: new             Ljava/io/File;
        //    13: dup            
        //    14: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //    17: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    20: bipush          34
        //    22: aaload         
        //    23: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    26: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    29: bipush          35
        //    31: aaload         
        //    32: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    35: astore_3       
        //    36: new             Ljava/io/File;
        //    39: dup            
        //    40: aload_0        
        //    41: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    44: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    47: bipush          31
        //    49: aaload         
        //    50: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    53: astore          4
        //    55: aload_3        
        //    56: invokevirtual   java/io/File.exists:()Z
        //    59: istore          6
        //    61: iload           6
        //    63: ifne            72
        //    66: return         
        //    67: astore          5
        //    69: aload           5
        //    71: athrow         
        //    72: new             Ljava/io/File;
        //    75: dup            
        //    76: aload_0        
        //    77: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    80: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    83: bipush          23
        //    85: aaload         
        //    86: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    89: astore          7
        //    91: new             Ljava/lang/StringBuilder;
        //    94: dup            
        //    95: invokespecial   java/lang/StringBuilder.<init>:()V
        //    98: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   101: bipush          26
        //   103: aaload         
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: aload_3        
        //   108: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: ldc             " "
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: aload_3        
        //   120: invokevirtual   java/io/File.length:()J
        //   123: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   126: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   129: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   132: new             Ljava/io/FileOutputStream;
        //   135: dup            
        //   136: aload           7
        //   138: iconst_0       
        //   139: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;Z)V
        //   142: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //   145: astore          18
        //   147: new             Ljava/io/FileInputStream;
        //   150: dup            
        //   151: aload_3        
        //   152: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   155: invokevirtual   java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //   158: astore          19
        //   160: aload           19
        //   162: aload           18
        //   164: invokestatic    com/whatsapp/util/ba.a:(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
        //   167: aload           19
        //   169: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   172: aload           18
        //   174: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   179: new             Landroid/graphics/BitmapFactory$Options;
        //   182: dup            
        //   183: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   186: astore          20
        //   188: aload           20
        //   190: iconst_1       
        //   191: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   194: aload           7
        //   196: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   199: aload           20
        //   201: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   204: pop            
        //   205: aload           20
        //   207: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   210: istore          22
        //   212: aload_0        
        //   213: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   216: bipush          22
        //   218: aaload         
        //   219: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   222: checkcast       Landroid/view/WindowManager;
        //   225: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   230: astore          23
        //   232: aload_0        
        //   233: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   236: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //   239: getfield        android/content/res/Configuration.orientation:I
        //   242: iconst_1       
        //   243: if_icmpne       257
        //   246: aload           23
        //   248: invokevirtual   android/view/Display.getWidth:()I
        //   251: istore          25
        //   253: iload_2        
        //   254: ifeq            268
        //   257: aload           23
        //   259: invokevirtual   android/view/Display.getHeight:()I
        //   262: istore          24
        //   264: iload           24
        //   266: istore          25
        //   268: iload           25
        //   270: iload           22
        //   272: if_icmpeq       288
        //   275: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   278: bipush          28
        //   280: aaload         
        //   281: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   284: iload_2        
        //   285: ifeq            324
        //   288: aload           7
        //   290: aload           4
        //   292: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   295: istore          29
        //   297: iload           29
        //   299: ifne            315
        //   302: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   305: bipush          36
        //   307: aaload         
        //   308: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   311: iload_2        
        //   312: ifeq            324
        //   315: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   318: bipush          27
        //   320: aaload         
        //   321: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   324: iconst_0       
        //   325: ifeq            332
        //   328: aconst_null    
        //   329: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   332: iconst_0       
        //   333: ifeq            66
        //   336: aconst_null    
        //   337: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   342: return         
        //   343: astore          31
        //   345: new             Ljava/lang/StringBuilder;
        //   348: dup            
        //   349: invokespecial   java/lang/StringBuilder.<init>:()V
        //   352: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   355: bipush          24
        //   357: aaload         
        //   358: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   361: aload           31
        //   363: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   366: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   369: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   372: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   375: return         
        //   376: astore          34
        //   378: aload           34
        //   380: athrow         
        //   381: astore          26
        //   383: aload           26
        //   385: athrow         
        //   386: astore          27
        //   388: aload           27
        //   390: athrow         
        //   391: astore          28
        //   393: aload           28
        //   395: athrow         
        //   396: astore          14
        //   398: aconst_null    
        //   399: astore          9
        //   401: new             Ljava/lang/StringBuilder;
        //   404: dup            
        //   405: invokespecial   java/lang/StringBuilder.<init>:()V
        //   408: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   411: bipush          37
        //   413: aaload         
        //   414: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   417: aload           14
        //   419: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   422: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   425: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   428: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   431: aload_1        
        //   432: ifnull          439
        //   435: aload_1        
        //   436: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   439: aload           9
        //   441: ifnull          66
        //   444: aload           9
        //   446: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   451: return         
        //   452: astore          16
        //   454: new             Ljava/lang/StringBuilder;
        //   457: dup            
        //   458: invokespecial   java/lang/StringBuilder.<init>:()V
        //   461: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   464: bipush          29
        //   466: aaload         
        //   467: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   470: aload           16
        //   472: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   478: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   481: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   484: return         
        //   485: astore          33
        //   487: aload           33
        //   489: athrow         
        //   490: astore          32
        //   492: new             Ljava/lang/StringBuilder;
        //   495: dup            
        //   496: invokespecial   java/lang/StringBuilder.<init>:()V
        //   499: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   502: bipush          30
        //   504: aaload         
        //   505: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   508: aload           32
        //   510: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   513: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   516: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   519: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   522: goto            332
        //   525: astore          30
        //   527: aload           30
        //   529: athrow         
        //   530: astore          17
        //   532: new             Ljava/lang/StringBuilder;
        //   535: dup            
        //   536: invokespecial   java/lang/StringBuilder.<init>:()V
        //   539: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   542: bipush          25
        //   544: aaload         
        //   545: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   548: aload           17
        //   550: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   553: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   556: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   559: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   562: goto            439
        //   565: astore          15
        //   567: aload           15
        //   569: athrow         
        //   570: astore          8
        //   572: aconst_null    
        //   573: astore          9
        //   575: aload_1        
        //   576: ifnull          583
        //   579: aload_1        
        //   580: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   583: aload           9
        //   585: ifnull          595
        //   588: aload           9
        //   590: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   595: aload           8
        //   597: athrow         
        //   598: astore          13
        //   600: aload           13
        //   602: athrow         
        //   603: astore          12
        //   605: new             Ljava/lang/StringBuilder;
        //   608: dup            
        //   609: invokespecial   java/lang/StringBuilder.<init>:()V
        //   612: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   615: bipush          32
        //   617: aaload         
        //   618: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   621: aload           12
        //   623: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   626: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   629: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   632: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   635: goto            583
        //   638: astore          11
        //   640: aload           11
        //   642: athrow         
        //   643: astore          10
        //   645: new             Ljava/lang/StringBuilder;
        //   648: dup            
        //   649: invokespecial   java/lang/StringBuilder.<init>:()V
        //   652: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   655: bipush          33
        //   657: aaload         
        //   658: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   661: aload           10
        //   663: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   666: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   669: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   672: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   675: goto            595
        //   678: astore          8
        //   680: aload           18
        //   682: astore          9
        //   684: aconst_null    
        //   685: astore_1       
        //   686: goto            575
        //   689: astore          8
        //   691: aload           19
        //   693: astore_1       
        //   694: aload           18
        //   696: astore          9
        //   698: goto            575
        //   701: astore          8
        //   703: goto            575
        //   706: astore          14
        //   708: aload           18
        //   710: astore          9
        //   712: aconst_null    
        //   713: astore_1       
        //   714: goto            401
        //   717: astore          14
        //   719: aload           19
        //   721: astore_1       
        //   722: aload           18
        //   724: astore          9
        //   726: goto            401
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  55     61     67     72     Ljava/io/IOException;
        //  132    147    396    401    Ljava/io/IOException;
        //  132    147    570    575    Any
        //  147    160    706    717    Ljava/io/IOException;
        //  147    160    678    689    Any
        //  160    172    717    729    Ljava/io/IOException;
        //  160    172    689    701    Any
        //  172    179    706    717    Ljava/io/IOException;
        //  172    179    678    689    Any
        //  179    253    396    401    Ljava/io/IOException;
        //  179    253    570    575    Any
        //  257    264    396    401    Ljava/io/IOException;
        //  257    264    570    575    Any
        //  275    284    376    381    Ljava/io/IOException;
        //  275    284    570    575    Any
        //  288    297    381    386    Ljava/io/IOException;
        //  288    297    570    575    Any
        //  302    311    386    391    Ljava/io/IOException;
        //  302    311    570    575    Any
        //  315    324    391    396    Ljava/io/IOException;
        //  315    324    570    575    Any
        //  328    332    490    525    Ljava/io/IOException;
        //  328    332    485    490    Ljava/lang/RuntimeException;
        //  336    342    343    376    Ljava/io/IOException;
        //  336    342    525    530    Ljava/lang/RuntimeException;
        //  378    381    381    386    Ljava/io/IOException;
        //  378    381    570    575    Any
        //  383    386    386    391    Ljava/io/IOException;
        //  383    386    570    575    Any
        //  388    391    391    396    Ljava/io/IOException;
        //  388    391    570    575    Any
        //  393    396    396    401    Ljava/io/IOException;
        //  393    396    570    575    Any
        //  401    431    701    706    Any
        //  435    439    530    565    Ljava/io/IOException;
        //  444    451    452    485    Ljava/io/IOException;
        //  444    451    565    570    Ljava/lang/RuntimeException;
        //  579    583    603    638    Ljava/io/IOException;
        //  579    583    598    603    Ljava/lang/RuntimeException;
        //  588    595    643    678    Ljava/io/IOException;
        //  588    595    638    643    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 329, Size: 329
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    public static void c(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: new             Ljava/io/File;
        //     5: dup            
        //     6: new             Ljava/io/File;
        //     9: dup            
        //    10: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //    13: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    16: bipush          15
        //    18: aaload         
        //    19: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    22: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    25: bipush          20
        //    27: aaload         
        //    28: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    31: astore_2       
        //    32: new             Ljava/io/File;
        //    35: dup            
        //    36: aload_0        
        //    37: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    40: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    43: bipush          16
        //    45: aaload         
        //    46: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    49: astore_3       
        //    50: aload_3        
        //    51: invokevirtual   java/io/File.exists:()Z
        //    54: istore          5
        //    56: iload           5
        //    58: ifne            67
        //    61: return         
        //    62: astore          4
        //    64: aload           4
        //    66: athrow         
        //    67: aload_2        
        //    68: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    71: invokevirtual   java/io/File.exists:()Z
        //    74: ifne            85
        //    77: aload_2        
        //    78: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    81: invokevirtual   java/io/File.mkdirs:()Z
        //    84: pop            
        //    85: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //    88: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    91: bipush          19
        //    93: aaload         
        //    94: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    97: ifeq            269
        //   100: new             Ljava/lang/StringBuilder;
        //   103: dup            
        //   104: invokespecial   java/lang/StringBuilder.<init>:()V
        //   107: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   110: bipush          21
        //   112: aaload         
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: aload_3        
        //   117: invokevirtual   java/io/File.length:()J
        //   120: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   123: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   126: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   129: new             Lcom/whatsapp/util/c;
        //   132: dup            
        //   133: getstatic       com/whatsapp/App.n:Lcom/whatsapp/util/p;
        //   136: aload_2        
        //   137: invokespecial   com/whatsapp/util/c.<init>:(Lcom/whatsapp/util/p;Ljava/io/File;)V
        //   140: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //   143: astore          12
        //   145: aload           12
        //   147: astore          8
        //   149: new             Ljava/io/FileInputStream;
        //   152: dup            
        //   153: aload_3        
        //   154: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   157: invokevirtual   java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //   160: astore_1       
        //   161: aload_1        
        //   162: aload           8
        //   164: invokestatic    com/whatsapp/util/ba.a:(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
        //   167: aload_1        
        //   168: ifnull          175
        //   171: aload_1        
        //   172: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   175: aload           8
        //   177: ifnull          61
        //   180: aload           8
        //   182: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   187: return         
        //   188: astore          13
        //   190: aload           13
        //   192: athrow         
        //   193: astore          9
        //   195: new             Ljava/lang/StringBuilder;
        //   198: dup            
        //   199: invokespecial   java/lang/StringBuilder.<init>:()V
        //   202: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   205: bipush          17
        //   207: aaload         
        //   208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   211: aload           9
        //   213: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   219: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   222: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   225: return         
        //   226: astore          6
        //   228: aload           6
        //   230: athrow         
        //   231: astore          7
        //   233: aconst_null    
        //   234: astore          8
        //   236: aload_1        
        //   237: ifnull          244
        //   240: aload_1        
        //   241: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   244: aload           8
        //   246: ifnull          256
        //   249: aload           8
        //   251: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   256: aload           7
        //   258: athrow         
        //   259: astore          11
        //   261: aload           11
        //   263: athrow         
        //   264: astore          10
        //   266: aload           10
        //   268: athrow         
        //   269: new             Ljava/lang/StringBuilder;
        //   272: dup            
        //   273: invokespecial   java/lang/StringBuilder.<init>:()V
        //   276: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   279: bipush          18
        //   281: aaload         
        //   282: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   285: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   294: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   297: return         
        //   298: astore          7
        //   300: goto            236
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  50     56     62     67     Ljava/lang/Exception;
        //  67     85     226    231    Ljava/lang/Exception;
        //  100    145    231    236    Any
        //  149    167    298    303    Any
        //  171    175    193    226    Ljava/lang/Exception;
        //  180    187    188    193    Ljava/lang/Exception;
        //  190    193    193    226    Ljava/lang/Exception;
        //  240    244    259    264    Ljava/lang/Exception;
        //  249    256    264    269    Ljava/lang/Exception;
        //  256    259    193    226    Ljava/lang/Exception;
        //  261    264    193    226    Ljava/lang/Exception;
        //  266    269    193    226    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 140, Size: 140
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
    
    public static Point d(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/graphics/Point;
        //     3: dup            
        //     4: invokespecial   android/graphics/Point.<init>:()V
        //     7: astore_1       
        //     8: aload_0        
        //     9: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    12: bipush          14
        //    14: aaload         
        //    15: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    18: checkcast       Landroid/view/WindowManager;
        //    21: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //    26: astore_2       
        //    27: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    30: istore          5
        //    32: iload           5
        //    34: bipush          13
        //    36: if_icmplt       50
        //    39: aload_2        
        //    40: aload_1        
        //    41: invokevirtual   android/view/Display.getSize:(Landroid/graphics/Point;)V
        //    44: getstatic       com/whatsapp/wallpaper/ImageViewTouchBase.h:Z
        //    47: ifeq            66
        //    50: aload_1        
        //    51: aload_2        
        //    52: invokevirtual   android/view/Display.getWidth:()I
        //    55: putfield        android/graphics/Point.x:I
        //    58: aload_1        
        //    59: aload_2        
        //    60: invokevirtual   android/view/Display.getHeight:()I
        //    63: putfield        android/graphics/Point.y:I
        //    66: aload_0        
        //    67: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    70: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //    73: getfield        android/content/res/Configuration.orientation:I
        //    76: iconst_2       
        //    77: if_icmpne       100
        //    80: aload_1        
        //    81: getfield        android/graphics/Point.y:I
        //    84: istore          6
        //    86: aload_1        
        //    87: aload_1        
        //    88: getfield        android/graphics/Point.x:I
        //    91: putfield        android/graphics/Point.y:I
        //    94: aload_1        
        //    95: iload           6
        //    97: putfield        android/graphics/Point.x:I
        //   100: aload_1        
        //   101: aload_1        
        //   102: getfield        android/graphics/Point.y:I
        //   105: aload_0        
        //   106: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   109: ldc_w           2131361793
        //   112: invokevirtual   android/content/res/Resources.getDimension:(I)F
        //   115: f2i            
        //   116: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //   119: invokevirtual   com/whatsapp/vc.a:()I
        //   122: iadd           
        //   123: isub           
        //   124: putfield        android/graphics/Point.y:I
        //   127: aload_1        
        //   128: areturn        
        //   129: astore_3       
        //   130: aload_3        
        //   131: athrow         
        //   132: astore          4
        //   134: aload           4
        //   136: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  27     32     129    132    Ljava/lang/RuntimeException;
        //  39     50     132    137    Ljava/lang/RuntimeException;
        //  50     66     132    137    Ljava/lang/RuntimeException;
        //  130    132    132    137    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
    
    public static void e(final Context context) {
        FileOutputStream openFileOutput = null;
        Log.i(h.z[12]);
        h.a = null;
        while (true) {
            try {
                openFileOutput = context.openFileOutput(h.z[13], 0);
                openFileOutput.write(2);
                openFileOutput.flush();
                if (openFileOutput == null) {
                    break Label_0044;
                }
                try {
                    openFileOutput.close();
                    h.a = f(context);
                    c(context);
                }
                catch (IOException ex) {
                    Log.e(ex.toString());
                }
            }
            catch (IOException ex2) {
                Log.e(ex2.toString());
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                        continue;
                    }
                    catch (IOException ex3) {
                        Log.e(ex3.toString());
                        continue;
                    }
                    continue;
                }
                continue;
            }
            finally {
                Label_0112: {
                    if (openFileOutput == null) {
                        break Label_0112;
                    }
                    try {
                        openFileOutput.close();
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    catch (IOException ex5) {
                        Log.e(ex5.toString());
                    }
                }
            }
            break;
        }
    }
    
    public static Drawable f(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: getstatic       com/whatsapp/wallpaper/ImageViewTouchBase.h:Z
        //     5: istore_2       
        //     6: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //     9: ifnonnull       422
        //    12: aload_0        
        //    13: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    16: bipush          7
        //    18: aaload         
        //    19: invokevirtual   android/content/Context.openFileInput:(Ljava/lang/String;)Ljava/io/FileInputStream;
        //    22: astore          37
        //    24: aload           37
        //    26: astore          32
        //    28: aload           32
        //    30: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
        //    33: astore          39
        //    35: aload           39
        //    37: ifnull          60
        //    40: new             Landroid/graphics/drawable/BitmapDrawable;
        //    43: dup            
        //    44: aload_0        
        //    45: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    48: aload           39
        //    50: invokespecial   android/graphics/drawable/BitmapDrawable.<init>:(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
        //    53: putstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //    56: iload_2        
        //    57: ifeq            64
        //    60: aconst_null    
        //    61: putstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //    64: aload           32
        //    66: ifnull          74
        //    69: aload           32
        //    71: invokevirtual   java/io/FileInputStream.close:()V
        //    74: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //    77: ifnonnull       335
        //    80: aload_0        
        //    81: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //    84: bipush          6
        //    86: aaload         
        //    87: invokevirtual   android/content/Context.openFileInput:(Ljava/lang/String;)Ljava/io/FileInputStream;
        //    90: astore_1       
        //    91: aload_1        
        //    92: invokevirtual   java/io/FileInputStream.read:()I
        //    95: istore          28
        //    97: iload           28
        //    99: istore          14
        //   101: aload_1        
        //   102: ifnull          109
        //   105: aload_1        
        //   106: invokevirtual   java/io/FileInputStream.close:()V
        //   109: iload           14
        //   111: iconst_2       
        //   112: if_icmpeq       121
        //   115: iload           14
        //   117: iconst_1       
        //   118: if_icmpne       335
        //   121: aload_0        
        //   122: invokestatic    com/whatsapp/wallpaper/h.d:(Landroid/content/Context;)Landroid/graphics/Point;
        //   125: astore          15
        //   127: new             Landroid/graphics/BitmapFactory$Options;
        //   130: dup            
        //   131: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   134: astore          16
        //   136: aload           16
        //   138: iconst_0       
        //   139: putfield        android/graphics/BitmapFactory$Options.inScaled:Z
        //   142: aload           16
        //   144: iconst_1       
        //   145: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   148: aload_0        
        //   149: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   152: ldc_w           2130837758
        //   155: aload           16
        //   157: invokestatic    android/graphics/BitmapFactory.decodeResource:(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   160: pop            
        //   161: aload           16
        //   163: iconst_1       
        //   164: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   167: aload           16
        //   169: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   172: istore          18
        //   174: aload           16
        //   176: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   179: istore          19
        //   181: iload           18
        //   183: iconst_2       
        //   184: aload           15
        //   186: getfield        android/graphics/Point.x:I
        //   189: imul           
        //   190: if_icmple       221
        //   193: iload           18
        //   195: iconst_2       
        //   196: idiv           
        //   197: istore          18
        //   199: iload           19
        //   201: iconst_2       
        //   202: idiv           
        //   203: istore          19
        //   205: aload           16
        //   207: iconst_2       
        //   208: aload           16
        //   210: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   213: imul           
        //   214: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   217: iload_2        
        //   218: ifeq            181
        //   221: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   224: invokevirtual   java/lang/Runtime.maxMemory:()J
        //   227: lstore          20
        //   229: iconst_4       
        //   230: iload           18
        //   232: iload           19
        //   234: imul           
        //   235: imul           
        //   236: i2l            
        //   237: lload           20
        //   239: ldc2_w          8
        //   242: ldiv           
        //   243: lcmp           
        //   244: ifle            275
        //   247: iload           18
        //   249: iconst_2       
        //   250: idiv           
        //   251: istore          18
        //   253: iload           19
        //   255: iconst_2       
        //   256: idiv           
        //   257: istore          19
        //   259: aload           16
        //   261: iconst_2       
        //   262: aload           16
        //   264: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   267: imul           
        //   268: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   271: iload_2        
        //   272: ifeq            229
        //   275: aload           16
        //   277: iconst_0       
        //   278: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   281: aload_0        
        //   282: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   285: ldc_w           2130837758
        //   288: aload           16
        //   290: invokestatic    android/graphics/BitmapFactory.decodeResource:(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   293: astore          22
        //   295: aload           22
        //   297: ifnull          326
        //   300: aload           22
        //   302: iconst_0       
        //   303: invokevirtual   android/graphics/Bitmap.setDensity:(I)V
        //   306: new             Landroid/graphics/drawable/BitmapDrawable;
        //   309: dup            
        //   310: aload_0        
        //   311: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   314: aload           22
        //   316: invokespecial   android/graphics/drawable/BitmapDrawable.<init>:(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
        //   319: putstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   322: iload_2        
        //   323: ifeq            335
        //   326: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   329: bipush          8
        //   331: aaload         
        //   332: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   335: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   338: astore          9
        //   340: aload           9
        //   342: ifnull          413
        //   345: new             Ljava/lang/StringBuilder;
        //   348: dup            
        //   349: invokespecial   java/lang/StringBuilder.<init>:()V
        //   352: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   355: iconst_5       
        //   356: aaload         
        //   357: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   360: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   363: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicWidth:()I
        //   366: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   369: ldc             "x"
        //   371: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   374: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   377: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicHeight:()I
        //   380: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   383: ldc             " "
        //   385: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   391: checkcast       Landroid/graphics/drawable/BitmapDrawable;
        //   394: invokevirtual   android/graphics/drawable/BitmapDrawable.getBitmap:()Landroid/graphics/Bitmap;
        //   397: invokestatic    com/whatsapp/util/b8.a:(Landroid/graphics/Bitmap;)I
        //   400: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   403: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   406: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   409: iload_2        
        //   410: ifeq            422
        //   413: getstatic       com/whatsapp/wallpaper/h.z:[Ljava/lang/String;
        //   416: bipush          9
        //   418: aaload         
        //   419: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   422: getstatic       com/whatsapp/wallpaper/h.a:Landroid/graphics/drawable/Drawable;
        //   425: areturn        
        //   426: astore          43
        //   428: aload           43
        //   430: athrow         
        //   431: astore          40
        //   433: aload           40
        //   435: athrow         
        //   436: astore          38
        //   438: aload           32
        //   440: astore          4
        //   442: aload           4
        //   444: ifnull          74
        //   447: aload           4
        //   449: invokevirtual   java/io/FileInputStream.close:()V
        //   452: goto            74
        //   455: astore          6
        //   457: aload           6
        //   459: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   462: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   465: goto            74
        //   468: astore          42
        //   470: aload           42
        //   472: athrow         
        //   473: astore          41
        //   475: aload           41
        //   477: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   480: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   483: goto            74
        //   486: astore          5
        //   488: aload           5
        //   490: athrow         
        //   491: astore          35
        //   493: aconst_null    
        //   494: astore          32
        //   496: aload           35
        //   498: invokestatic    com/whatsapp/util/Log.d:(Ljava/lang/Throwable;)V
        //   501: aload           32
        //   503: ifnull          74
        //   506: aload           32
        //   508: invokevirtual   java/io/FileInputStream.close:()V
        //   511: goto            74
        //   514: astore          36
        //   516: aload           36
        //   518: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   521: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   524: goto            74
        //   527: astore          31
        //   529: aconst_null    
        //   530: astore          32
        //   532: aload           32
        //   534: ifnull          542
        //   537: aload           32
        //   539: invokevirtual   java/io/FileInputStream.close:()V
        //   542: aload           31
        //   544: athrow         
        //   545: astore          34
        //   547: aload           34
        //   549: athrow         
        //   550: astore          33
        //   552: aload           33
        //   554: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   557: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   560: goto            542
        //   563: astore          30
        //   565: aload           30
        //   567: athrow         
        //   568: astore          29
        //   570: aload           29
        //   572: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   575: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   578: goto            109
        //   581: astore          25
        //   583: aload_1        
        //   584: ifnull          718
        //   587: aload_1        
        //   588: invokevirtual   java/io/FileInputStream.close:()V
        //   591: iconst_2       
        //   592: istore          14
        //   594: goto            109
        //   597: astore          27
        //   599: aload           27
        //   601: athrow         
        //   602: astore          26
        //   604: aload           26
        //   606: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   609: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   612: iconst_2       
        //   613: istore          14
        //   615: goto            109
        //   618: astore          13
        //   620: aload           13
        //   622: invokestatic    com/whatsapp/util/Log.d:(Ljava/lang/Throwable;)V
        //   625: aload_1        
        //   626: ifnull          718
        //   629: aload_1        
        //   630: invokevirtual   java/io/FileInputStream.close:()V
        //   633: iconst_2       
        //   634: istore          14
        //   636: goto            109
        //   639: astore          24
        //   641: aload           24
        //   643: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   646: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   649: iconst_2       
        //   650: istore          14
        //   652: goto            109
        //   655: astore          10
        //   657: aload_1        
        //   658: ifnull          665
        //   661: aload_1        
        //   662: invokevirtual   java/io/FileInputStream.close:()V
        //   665: aload           10
        //   667: athrow         
        //   668: astore          12
        //   670: aload           12
        //   672: athrow         
        //   673: astore          11
        //   675: aload           11
        //   677: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   680: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   683: goto            665
        //   686: astore          23
        //   688: aload           23
        //   690: athrow         
        //   691: astore          7
        //   693: aload           7
        //   695: athrow         
        //   696: astore          8
        //   698: aload           8
        //   700: athrow         
        //   701: astore          31
        //   703: goto            532
        //   706: astore          35
        //   708: goto            496
        //   711: astore_3       
        //   712: aconst_null    
        //   713: astore          4
        //   715: goto            442
        //   718: iconst_2       
        //   719: istore          14
        //   721: goto            109
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  12     24     711    718    Ljava/io/IOException;
        //  12     24     491    496    Ljava/lang/OutOfMemoryError;
        //  12     24     527    532    Any
        //  28     35     436    442    Ljava/io/IOException;
        //  28     35     706    711    Ljava/lang/OutOfMemoryError;
        //  28     35     701    706    Any
        //  40     56     426    431    Ljava/io/IOException;
        //  40     56     706    711    Ljava/lang/OutOfMemoryError;
        //  40     56     701    706    Any
        //  60     64     431    436    Ljava/io/IOException;
        //  60     64     706    711    Ljava/lang/OutOfMemoryError;
        //  60     64     701    706    Any
        //  69     74     473    486    Ljava/io/IOException;
        //  69     74     468    473    Ljava/lang/OutOfMemoryError;
        //  80     97     581    618    Ljava/io/IOException;
        //  80     97     618    655    Ljava/lang/OutOfMemoryError;
        //  80     97     655    686    Any
        //  105    109    568    581    Ljava/io/IOException;
        //  105    109    563    568    Ljava/lang/OutOfMemoryError;
        //  300    322    686    691    Ljava/io/IOException;
        //  326    335    686    691    Ljava/io/IOException;
        //  335    340    691    696    Ljava/io/IOException;
        //  345    409    696    701    Ljava/io/IOException;
        //  413    422    696    701    Ljava/io/IOException;
        //  428    431    431    436    Ljava/io/IOException;
        //  428    431    706    711    Ljava/lang/OutOfMemoryError;
        //  428    431    701    706    Any
        //  433    436    436    442    Ljava/io/IOException;
        //  433    436    706    711    Ljava/lang/OutOfMemoryError;
        //  433    436    701    706    Any
        //  447    452    455    468    Ljava/io/IOException;
        //  447    452    486    491    Ljava/lang/OutOfMemoryError;
        //  496    501    701    706    Any
        //  506    511    514    527    Ljava/io/IOException;
        //  537    542    550    563    Ljava/io/IOException;
        //  537    542    545    550    Ljava/lang/OutOfMemoryError;
        //  587    591    602    618    Ljava/io/IOException;
        //  587    591    597    602    Ljava/lang/OutOfMemoryError;
        //  620    625    655    686    Any
        //  629    633    639    655    Ljava/io/IOException;
        //  661    665    673    686    Ljava/io/IOException;
        //  661    665    668    673    Ljava/lang/OutOfMemoryError;
        //  693    696    696    701    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 340, Size: 340
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
