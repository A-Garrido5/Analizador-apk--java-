// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.content.pm.FeatureInfo;
import com.whatsapp.util.Log;
import java.util.Set;
import java.util.regex.Pattern;

public class a9 extends ao
{
    private static Pattern e;
    private static final String[] z;
    private float f;
    
    static {
        final String[] z2 = new String[22];
        String s = "/S;SP2\u001d\u0003\u007fu\u0003\u001dp";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0582:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '>';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '=';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = '6';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "/S;SP2";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "%R!B[(Iu\u0019\u0011%R\"\u0018V2^aZ_3S,^[4\u0013<SJ2T!QMi[.@Q4T;SM";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0019T+";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0019T+";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "/S;SP2";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "%R\"\u0018V2^aZ_3S,^[4\u0013.UJ/R!\u0018m\u0003i\u0010xq\u0012t\t\u007f}\u0007i\u0006yp";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "%R\"\u0018V2^aZ_3S,^[4\u0013.UJ/R!\u0018k\u0016y\u000eb{\u0019n\u0007yl\u0012~\u001ab";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "%R:XJ";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = " \\9YL/I*iW2X\"iW\"";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "5X#S]2|=QM";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "6\\,]_!X!WS#";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "%R\"\u0018V2^aZ_3S,^[4\u0013.UJ/R!\u0018k\u0016y\u000eb{\u0019n\u0007yl\u0012~\u001ab";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "%R:XJ";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "%R\"\u0018V2^aZ_3S,^[4\u0013*NJ4\\auq\u0013s\u001b";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "6\\,]_!X!WS#";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "%R\"\u0018V2^aZ_3S,^[4\u0013*NJ4\\auq\u000bm\u0000x{\bi";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "$\\+Q[4\u0012'B]iN*XM#\u001d";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "%R\"\u0018V2^aZ_3S,^[4";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "%R\"\u0018V2^aEQ I8WL#\u0013\u001cSP5X";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "%R:ZZfS B\u001e T!R\u001e0X=EW)S";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "%R\"j\u0010.I,j\u00105R)BI'O*j\u0010\u0015X!E[na+\u001d\u0016y\u0007\u0013\u0018b\"\u0016f\t\u0017h\u0017";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    break Label_0582;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public a9() {
        this.f = -1.0f;
    }
    
    private static final Float a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: aload_0        
        //     7: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    10: bipush          19
        //    12: aaload         
        //    13: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    16: istore_3       
        //    17: iload_3        
        //    18: ifeq            4
        //    21: getstatic       com/whatsapp/notification/a9.e:Ljava/util/regex/Pattern;
        //    24: ifnonnull       39
        //    27: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    30: bipush          21
        //    32: aaload         
        //    33: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    36: putstatic       com/whatsapp/notification/a9.e:Ljava/util/regex/Pattern;
        //    39: getstatic       com/whatsapp/notification/a9.e:Ljava/util/regex/Pattern;
        //    42: aload_0        
        //    43: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    46: astore          4
        //    48: aload           4
        //    50: invokevirtual   java/util/regex/Matcher.matches:()Z
        //    53: ifne            81
        //    56: new             Ljava/lang/NumberFormatException;
        //    59: dup            
        //    60: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    63: bipush          20
        //    65: aaload         
        //    66: invokespecial   java/lang/NumberFormatException.<init>:(Ljava/lang/String;)V
        //    69: athrow         
        //    70: astore          5
        //    72: aload           5
        //    74: athrow         
        //    75: astore_1       
        //    76: aload_1        
        //    77: athrow         
        //    78: astore_2       
        //    79: aload_2        
        //    80: athrow         
        //    81: aload           4
        //    83: iconst_1       
        //    84: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //    87: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //    90: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    93: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  6      17     75     78     Ljava/lang/NumberFormatException;
        //  21     39     78     81     Ljava/lang/NumberFormatException;
        //  56     70     70     75     Ljava/lang/NumberFormatException;
        //  76     78     78     81     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
    
    private final Set a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/ao.b:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/notification/a9.c:()Landroid/content/Context;
        //     8: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    11: astore_2       
        //    12: new             Ljava/util/HashSet;
        //    15: dup            
        //    16: invokespecial   java/util/HashSet.<init>:()V
        //    19: astore_3       
        //    20: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    23: iconst_2       
        //    24: aaload         
        //    25: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    28: astore          6
        //    30: iconst_2       
        //    31: anewarray       Ljava/lang/String;
        //    34: astore          7
        //    36: aload           7
        //    38: iconst_0       
        //    39: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    42: iconst_3       
        //    43: aaload         
        //    44: aastore        
        //    45: aload           7
        //    47: iconst_1       
        //    48: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    51: iconst_1       
        //    52: aaload         
        //    53: aastore        
        //    54: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    57: iconst_0       
        //    58: aaload         
        //    59: astore          8
        //    61: iconst_1       
        //    62: anewarray       Ljava/lang/String;
        //    65: astore          9
        //    67: aload           9
        //    69: iconst_0       
        //    70: new             Ljava/lang/StringBuilder;
        //    73: dup            
        //    74: invokespecial   java/lang/StringBuilder.<init>:()V
        //    77: ldc             "%"
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: aload_0        
        //    83: invokevirtual   com/whatsapp/notification/a9.a:()Ljava/lang/String;
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: ldc             "%"
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    97: aastore        
        //    98: aload_2        
        //    99: aload           6
        //   101: aload           7
        //   103: aload           8
        //   105: aload           9
        //   107: aconst_null    
        //   108: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   111: astore          10
        //   113: aload           10
        //   115: astore          5
        //   117: aload           5
        //   119: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   122: iconst_4       
        //   123: aaload         
        //   124: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   129: istore          11
        //   131: aload           5
        //   133: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   136: iconst_5       
        //   137: aaload         
        //   138: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   143: istore          12
        //   145: aload           5
        //   147: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   152: pop            
        //   153: aload           5
        //   155: invokeinterface android/database/Cursor.isAfterLast:()Z
        //   160: ifne            261
        //   163: aload           5
        //   165: iload           12
        //   167: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   172: astore          14
        //   174: aload           14
        //   176: iconst_0       
        //   177: invokestatic    android/content/Intent.parseUri:(Ljava/lang/String;I)Landroid/content/Intent;
        //   180: astore          17
        //   182: aload           17
        //   184: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //   187: astore          18
        //   189: aload           18
        //   191: ifnull          249
        //   194: aload_0        
        //   195: invokevirtual   com/whatsapp/notification/a9.a:()Ljava/lang/String;
        //   198: aload           18
        //   200: invokevirtual   android/content/ComponentName.getPackageName:()Ljava/lang/String;
        //   203: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   206: istore          22
        //   208: iload           22
        //   210: ifeq            249
        //   213: aload_0        
        //   214: invokevirtual   com/whatsapp/notification/a9.d:()Ljava/lang/String;
        //   217: aload           18
        //   219: invokevirtual   android/content/ComponentName.getClassName:()Ljava/lang/String;
        //   222: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   225: istore          23
        //   227: iload           23
        //   229: ifeq            249
        //   232: aload_3        
        //   233: aload           5
        //   235: iload           11
        //   237: invokeinterface android/database/Cursor.getInt:(I)I
        //   242: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   245: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   248: pop            
        //   249: aload           5
        //   251: invokeinterface android/database/Cursor.moveToNext:()Z
        //   256: pop            
        //   257: iload_1        
        //   258: ifeq            153
        //   261: aload           5
        //   263: ifnull          273
        //   266: aload           5
        //   268: invokeinterface android/database/Cursor.close:()V
        //   273: aload_3        
        //   274: areturn        
        //   275: astore          19
        //   277: aload           19
        //   279: athrow         
        //   280: astore          20
        //   282: aload           20
        //   284: athrow         
        //   285: astore          21
        //   287: aload           21
        //   289: athrow         
        //   290: astore          4
        //   292: aload           5
        //   294: ifnull          304
        //   297: aload           5
        //   299: invokeinterface android/database/Cursor.close:()V
        //   304: aload           4
        //   306: athrow         
        //   307: astore          15
        //   309: goto            249
        //   312: astore          4
        //   314: aconst_null    
        //   315: astore          5
        //   317: goto            292
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  20     113    312    320    Any
        //  117    153    290    292    Any
        //  153    174    290    292    Any
        //  174    182    307    312    Ljava/net/URISyntaxException;
        //  174    182    290    292    Any
        //  182    189    290    292    Any
        //  194    208    275    280    Ljava/net/URISyntaxException;
        //  194    208    290    292    Any
        //  213    227    280    285    Ljava/net/URISyntaxException;
        //  213    227    290    292    Any
        //  232    249    285    290    Ljava/net/URISyntaxException;
        //  232    249    290    292    Any
        //  249    257    290    292    Any
        //  277    280    280    285    Ljava/net/URISyntaxException;
        //  277    280    290    292    Any
        //  282    285    285    290    Ljava/net/URISyntaxException;
        //  282    285    290    292    Any
        //  287    290    290    292    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 148, Size: 148
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
    
    private final float b() {
        final boolean b = ao.b;
        try {
            if (this.f >= 0.0f) {
                return this.f;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        this.f = 0.0f;
        final FeatureInfo[] systemAvailableFeatures = this.c().getPackageManager().getSystemAvailableFeatures();
        final int length = systemAvailableFeatures.length;
        int n = 0;
    Label_0089_Outer:
        while (true) {
            Label_0096: {
                if (n >= length) {
                    break Label_0096;
                }
                final FeatureInfo featureInfo = systemAvailableFeatures[n];
                while (true) {
                    try {
                        final Float a = a(featureInfo.name);
                        if (a == null) {
                            break Label_0089;
                        }
                        try {
                            this.f = a;
                            if (b) {
                                ++n;
                                if (!b) {
                                    continue Label_0089_Outer;
                                }
                            }
                            Log.i(a9.z[17] + this.f);
                            return this.f;
                        }
                        catch (NumberFormatException ex2) {
                            throw ex2;
                        }
                    }
                    catch (NumberFormatException ex3) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public void a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/ao.b:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   com/whatsapp/notification/a9.b:()F
        //     8: fstore_3       
        //     9: fload_3        
        //    10: ldc             5.0
        //    12: fcmpl          
        //    13: iflt            107
        //    16: new             Landroid/content/Intent;
        //    19: dup            
        //    20: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    23: bipush          6
        //    25: aaload         
        //    26: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    29: astore          4
        //    31: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    34: bipush          12
        //    36: if_icmplt       47
        //    39: aload           4
        //    41: bipush          16
        //    43: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //    46: pop            
        //    47: new             Landroid/content/ComponentName;
        //    50: dup            
        //    51: aload_0        
        //    52: invokevirtual   com/whatsapp/notification/a9.a:()Ljava/lang/String;
        //    55: aload_0        
        //    56: invokevirtual   com/whatsapp/notification/a9.d:()Ljava/lang/String;
        //    59: invokespecial   android/content/ComponentName.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    62: astore          6
        //    64: aload           4
        //    66: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    69: bipush          16
        //    71: aaload         
        //    72: aload           6
        //    74: invokevirtual   android/content/ComponentName.flattenToShortString:()Ljava/lang/String;
        //    77: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    80: pop            
        //    81: aload           4
        //    83: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //    86: bipush          14
        //    88: aaload         
        //    89: iload_1        
        //    90: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //    93: pop            
        //    94: aload_0        
        //    95: invokevirtual   com/whatsapp/notification/a9.c:()Landroid/content/Context;
        //    98: aload           4
        //   100: invokevirtual   android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
        //   103: iload_2        
        //   104: ifeq            380
        //   107: fload_3        
        //   108: ldc_w           4.0
        //   111: fcmpl          
        //   112: iflt            380
        //   115: new             Landroid/content/Intent;
        //   118: dup            
        //   119: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   122: bipush          7
        //   124: aaload         
        //   125: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   128: astore          10
        //   130: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   133: bipush          12
        //   135: if_icmplt       146
        //   138: aload           10
        //   140: bipush          16
        //   142: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   145: pop            
        //   146: aload           10
        //   148: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   151: bipush          11
        //   153: aaload         
        //   154: aload_0        
        //   155: invokevirtual   com/whatsapp/notification/a9.a:()Ljava/lang/String;
        //   158: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   161: pop            
        //   162: aload           10
        //   164: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   167: bipush          8
        //   169: aaload         
        //   170: iload_1        
        //   171: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   174: pop            
        //   175: aload_0        
        //   176: invokevirtual   com/whatsapp/notification/a9.c:()Landroid/content/Context;
        //   179: aload           10
        //   181: invokevirtual   android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
        //   184: aload_0        
        //   185: invokespecial   com/whatsapp/notification/a9.a:()Ljava/util/Set;
        //   188: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   193: astore          14
        //   195: aload           14
        //   197: invokeinterface java/util/Iterator.hasNext:()Z
        //   202: ifeq            380
        //   205: aload           14
        //   207: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   212: checkcast       Ljava/lang/Integer;
        //   215: astore          15
        //   217: new             Landroid/content/Intent;
        //   220: dup            
        //   221: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   224: bipush          12
        //   226: aaload         
        //   227: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   230: astore          16
        //   232: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   235: bipush          12
        //   237: if_icmplt       248
        //   240: aload           10
        //   242: bipush          16
        //   244: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   247: pop            
        //   248: aload           16
        //   250: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   253: bipush          15
        //   255: aaload         
        //   256: aload_0        
        //   257: invokevirtual   com/whatsapp/notification/a9.a:()Ljava/lang/String;
        //   260: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   263: pop            
        //   264: aload           16
        //   266: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   269: bipush          9
        //   271: aaload         
        //   272: aload           15
        //   274: invokevirtual   java/lang/Integer.longValue:()J
        //   277: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;J)Landroid/content/Intent;
        //   280: pop            
        //   281: new             Landroid/content/ComponentName;
        //   284: dup            
        //   285: aload_0        
        //   286: invokevirtual   com/whatsapp/notification/a9.a:()Ljava/lang/String;
        //   289: aload_0        
        //   290: invokevirtual   com/whatsapp/notification/a9.d:()Ljava/lang/String;
        //   293: invokespecial   android/content/ComponentName.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   296: astore          20
        //   298: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   301: bipush          10
        //   303: aaload         
        //   304: astore          21
        //   306: iconst_1       
        //   307: anewarray       Ljava/lang/String;
        //   310: astore          22
        //   312: aload           22
        //   314: iconst_0       
        //   315: new             Ljava/lang/StringBuilder;
        //   318: dup            
        //   319: invokespecial   java/lang/StringBuilder.<init>:()V
        //   322: ldc             "%"
        //   324: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   327: aload           20
        //   329: invokevirtual   android/content/ComponentName.flattenToShortString:()Ljava/lang/String;
        //   332: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   335: ldc             "%"
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   340: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   343: aastore        
        //   344: aload           16
        //   346: aload           21
        //   348: aload           22
        //   350: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
        //   353: pop            
        //   354: aload           16
        //   356: getstatic       com/whatsapp/notification/a9.z:[Ljava/lang/String;
        //   359: bipush          13
        //   361: aaload         
        //   362: iload_1        
        //   363: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   366: pop            
        //   367: aload_0        
        //   368: invokevirtual   com/whatsapp/notification/a9.c:()Landroid/content/Context;
        //   371: aload           16
        //   373: invokevirtual   android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
        //   376: iload_2        
        //   377: ifeq            195
        //   380: return         
        //   381: astore          5
        //   383: aload           5
        //   385: athrow         
        //   386: astore          7
        //   388: aload           7
        //   390: athrow         
        //   391: astore          11
        //   393: aload           11
        //   395: athrow         
        //   396: astore          17
        //   398: aload           17
        //   400: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  31     47     381    386    Ljava/lang/NumberFormatException;
        //  64     103    386    391    Ljava/lang/NumberFormatException;
        //  130    146    391    396    Ljava/lang/NumberFormatException;
        //  232    248    396    401    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 190, Size: 190
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
    public List b() {
        if (this.b() >= 4.0f) {
            try {
                return Arrays.asList(a9.z[18]);
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        return new ArrayList();
    }
}
