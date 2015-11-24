// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

import com.whatsapp.App;
import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import android.content.Context;

public class j
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = "r,`v_`+`s\u0015n+`sOrk";
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
                        c2 = ':';
                        break;
                    }
                    case 0: {
                        c2 = '\u0002';
                        break;
                    }
                    case 1: {
                        c2 = 'D';
                        break;
                    }
                    case 2: {
                        c2 = '\u000f';
                        break;
                    }
                    case 3: {
                        c2 = '\u0018';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "r,`v_`+`s\u0015e!{GJj+a}I-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "r,`v_`+`s\u0015e!{GYm1al\u0015";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "n#j";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "r,`v_`+`s\u0015e!{GIk)P{[p PhRm*jk\u0015n#j";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "l%b}";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "a+al_l057\u0015k'l7[f*";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "l1bz_p";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "g<l}Jv-`v\u001au,ft_\"6jlHk!yqTed|qW\"'nj^\"'`vNc'{k\u0016\"3ftV\"'`vNk*z}\u001au-{pUw0/lRg)/";
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
    }
    
    public static o a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: aload_0        
        //     3: ifnonnull       8
        //     6: aload_1        
        //     7: areturn        
        //     8: aload_0        
        //     9: getstatic       com/whatsapp/contact/j.z:[Ljava/lang/String;
        //    12: iconst_0       
        //    13: aaload         
        //    14: invokestatic    com/whatsapp/contact/o.a:(Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    17: astore          5
        //    19: aload           5
        //    21: astore_3       
        //    22: aload_3        
        //    23: invokeinterface android/database/Cursor.moveToNext:()Z
        //    28: istore          6
        //    30: aconst_null    
        //    31: astore_1       
        //    32: iload           6
        //    34: ifeq            46
        //    37: aload_3        
        //    38: invokestatic    com/whatsapp/contact/o.a:(Landroid/database/Cursor;)Lcom/whatsapp/contact/o;
        //    41: astore          7
        //    43: aload           7
        //    45: astore_1       
        //    46: aload_3        
        //    47: ifnull          6
        //    50: aload_3        
        //    51: invokeinterface android/database/Cursor.close:()V
        //    56: aload_1        
        //    57: areturn        
        //    58: astore_2       
        //    59: aconst_null    
        //    60: astore_3       
        //    61: aload_2        
        //    62: astore          4
        //    64: aload_3        
        //    65: ifnull          74
        //    68: aload_3        
        //    69: invokeinterface android/database/Cursor.close:()V
        //    74: aload           4
        //    76: athrow         
        //    77: astore          4
        //    79: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  8      19     58     64     Any
        //  22     30     77     82     Any
        //  37     43     77     82     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    public static Map a(final Context context) {
        final HashSet set = new HashSet();
        set.addAll(b(context));
        set.addAll(c(context));
        return a(set);
    }
    
    private static Map a(final Set set) {
        final boolean f = com.whatsapp.contact.f.f;
        final HashMap<String, ArrayList<o>> hashMap = new HashMap<String, ArrayList<o>>();
        for (final o o : set) {
            if (!hashMap.containsKey(o.e())) {
                hashMap.put(o.e(), new ArrayList<o>());
            }
            hashMap.get(o.e()).add(o);
            if (f) {
                break;
            }
        }
        return hashMap;
    }
    
    public static Set a(final b b) {
        final boolean f = com.whatsapp.contact.f.f;
        final HashSet<o> set = new HashSet<o>();
        Cursor a = null;
        try {
            a = o.a(b, j.z[1]);
            if (a != null) {
                while (a.moveToNext()) {
                    final o a2 = o.a(a);
                    if (a2 != null) {
                        set.add(a2);
                    }
                    if (f) {
                        break;
                    }
                }
            }
            return set;
        }
        finally {
            if (a != null) {
                a.close();
            }
        }
    }
    
    public static Integer b(final b p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getstatic       com/whatsapp/contact/j.z:[Ljava/lang/String;
        //     4: iconst_2       
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/contact/o.a:(Lcom/whatsapp/contact/b;Ljava/lang/String;)Landroid/database/Cursor;
        //     9: astore          4
        //    11: aload           4
        //    13: astore_2       
        //    14: aconst_null    
        //    15: astore          5
        //    17: aload_2        
        //    18: ifnonnull       34
        //    21: aload_2        
        //    22: ifnull          31
        //    25: aload_2        
        //    26: invokeinterface android/database/Cursor.close:()V
        //    31: aload           5
        //    33: areturn        
        //    34: aload_2        
        //    35: invokeinterface android/database/Cursor.getCount:()I
        //    40: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    43: astore          6
        //    45: aload           6
        //    47: astore          5
        //    49: goto            21
        //    52: astore_1       
        //    53: aconst_null    
        //    54: astore_2       
        //    55: aload_1        
        //    56: astore_3       
        //    57: aload_2        
        //    58: ifnull          67
        //    61: aload_2        
        //    62: invokeinterface android/database/Cursor.close:()V
        //    67: aload_3        
        //    68: athrow         
        //    69: astore_3       
        //    70: goto            57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      11     52     57     Any
        //  34     45     69     73     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
    
    private static Set b(final Context context) {
        b b;
        if (App.w(context)) {
            b = com.whatsapp.contact.b.BOTH;
        }
        else {
            b = com.whatsapp.contact.b.VISIBLE_ONLY;
        }
        return a(b);
    }
    
    private static Set c(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/contact/f.f:Z
        //     3: istore_1       
        //     4: new             Ljava/util/HashSet;
        //     7: dup            
        //     8: invokespecial   java/util/HashSet.<init>:()V
        //    11: astore_2       
        //    12: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //    15: getstatic       com/whatsapp/contact/j.z:[Ljava/lang/String;
        //    18: iconst_3       
        //    19: aaload         
        //    20: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    23: ifeq            165
        //    26: getstatic       com/whatsapp/contact/j.z:[Ljava/lang/String;
        //    29: iconst_4       
        //    30: aaload         
        //    31: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    34: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    37: getstatic       com/whatsapp/contact/j.z:[Ljava/lang/String;
        //    40: bipush          6
        //    42: aaload         
        //    43: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    46: aconst_null    
        //    47: aconst_null    
        //    48: aconst_null    
        //    49: aconst_null    
        //    50: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    53: astore          7
        //    55: aload           7
        //    57: astore          4
        //    59: aload           4
        //    61: getstatic       com/whatsapp/contact/j.z:[Ljava/lang/String;
        //    64: iconst_5       
        //    65: aaload         
        //    66: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //    71: istore          8
        //    73: aload           4
        //    75: getstatic       com/whatsapp/contact/j.z:[Ljava/lang/String;
        //    78: bipush          7
        //    80: aaload         
        //    81: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //    86: istore          9
        //    88: aload           4
        //    90: invokeinterface android/database/Cursor.moveToNext:()Z
        //    95: ifeq            153
        //    98: aload           4
        //   100: iload           8
        //   102: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   107: astore          11
        //   109: aload           4
        //   111: iload           9
        //   113: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   118: astore          12
        //   120: aload           12
        //   122: ifnull          149
        //   125: aload_0        
        //   126: aload           11
        //   128: aload           12
        //   130: invokestatic    com/whatsapp/contact/o.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/contact/o;
        //   133: astore          13
        //   135: aload           13
        //   137: ifnull          149
        //   140: aload_2        
        //   141: aload           13
        //   143: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   148: pop            
        //   149: iload_1        
        //   150: ifeq            88
        //   153: aload           4
        //   155: ifnull          165
        //   158: aload           4
        //   160: invokeinterface android/database/Cursor.close:()V
        //   165: aload_2        
        //   166: areturn        
        //   167: astore          14
        //   169: aload           14
        //   171: athrow         
        //   172: astore_3       
        //   173: new             Ljava/lang/StringBuilder;
        //   176: dup            
        //   177: invokespecial   java/lang/StringBuilder.<init>:()V
        //   180: getstatic       com/whatsapp/contact/j.z:[Ljava/lang/String;
        //   183: bipush          8
        //   185: aaload         
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: aload_3        
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   193: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   196: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   199: aload           4
        //   201: ifnull          165
        //   204: aload           4
        //   206: invokeinterface android/database/Cursor.close:()V
        //   211: aload_2        
        //   212: areturn        
        //   213: astore          10
        //   215: aload           10
        //   217: athrow         
        //   218: astore          5
        //   220: aconst_null    
        //   221: astore          4
        //   223: aload           4
        //   225: ifnull          235
        //   228: aload           4
        //   230: invokeinterface android/database/Cursor.close:()V
        //   235: aload           5
        //   237: athrow         
        //   238: astore          6
        //   240: aload           6
        //   242: athrow         
        //   243: astore          5
        //   245: goto            223
        //   248: astore_3       
        //   249: aconst_null    
        //   250: astore          4
        //   252: goto            173
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  34     55     248    255    Ljava/lang/Exception;
        //  34     55     218    223    Any
        //  59     88     172    173    Ljava/lang/Exception;
        //  59     88     243    248    Any
        //  88     120    172    173    Ljava/lang/Exception;
        //  88     120    243    248    Any
        //  125    135    172    173    Ljava/lang/Exception;
        //  125    135    243    248    Any
        //  140    149    167    172    Ljava/lang/Exception;
        //  140    149    243    248    Any
        //  158    165    213    218    Ljava/lang/Exception;
        //  169    172    172    173    Ljava/lang/Exception;
        //  169    172    243    248    Any
        //  173    199    243    248    Any
        //  228    235    238    243    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0165:
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
