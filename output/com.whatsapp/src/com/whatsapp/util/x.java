// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.Locale;
import java.util.regex.Pattern;

public final class x
{
    private static final Pattern b;
    private static final String[] z;
    private final String a;
    private final String c;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0016\u0004\\\fO8[";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '!';
                        break;
                    }
                    case 0: {
                        c2 = '[';
                        break;
                    }
                    case 1: {
                        c2 = 'g';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = 'A';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "~W\f%";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "6\u0004\\,O8HO S(\u0002\u001f,O8GQ.U{\u0017^3R>\u0006]-D{\u0006LaH5\u0013Z&D)]\u001f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "kW\u000f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "kW\u000f";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final char[] charArray2 = "s;[:\u0012&N\u0017\u001dE U\u0013r\\r".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = '!';
                    break;
                }
                case 0: {
                    c4 = '[';
                    break;
                }
                case 1: {
                    c4 = 'g';
                    break;
                }
                case 2: {
                    c4 = '?';
                    break;
                }
                case 3: {
                    c4 = 'A';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        b = Pattern.compile(new String(charArray2).intern());
    }
    
    private x(final String a, final String c) {
        this.a = a;
        this.c = c;
    }
    
    public static x a(final String s) {
        return a(s, x.z[3], x.z[4]);
    }
    
    public static x a(final String s, final String s2, String format) {
        if (s == null) {
            try {
                return new x(s2, format);
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        final Matcher matcher = x.b.matcher(s);
        try {
            if (!matcher.matches()) {
                return new x(s2, format);
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        final String group = matcher.group(1);
        try {
            format = String.format(Locale.US, x.z[1], Integer.valueOf(matcher.group(2)));
            return new x(group, format);
        }
        catch (NumberFormatException ex3) {
            Log.e(x.z[2] + matcher.group(2));
            return new x(group, format);
        }
    }
    
    public static String a(final String s, final String s2) {
        if (s != null) {
            final Matcher matcher = x.b.matcher(s);
            try {
                if (matcher.matches()) {
                    return matcher.group(1) + "-" + matcher.group(2);
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        return s2;
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            try {
                if (this.getClass() != o.getClass()) {
                    return false;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            final x x = (x)o;
            try {
                if (!TextUtils.equals((CharSequence)this.a, (CharSequence)x.a)) {
                    return false;
                }
                final x x2 = this;
                final String s = x2.c;
                final x x3 = x;
                final String s2 = x3.c;
                final boolean b = TextUtils.equals((CharSequence)s, (CharSequence)s2);
                if (!b) {
                    return false;
                }
                return true;
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
            try {
                final x x2 = this;
                final String s = x2.c;
                final x x3 = x;
                final String s2 = x3.c;
                final boolean b = TextUtils.equals((CharSequence)s, (CharSequence)s2);
                if (b) {
                    return true;
                }
            }
            catch (NumberFormatException ex3) {
                throw ex3;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/util/x.a:Ljava/lang/String;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnonnull       36
        //     9: iconst_0       
        //    10: istore_3       
        //    11: aload_0        
        //    12: getfield        com/whatsapp/util/x.c:Ljava/lang/String;
        //    15: astore          5
        //    17: iconst_0       
        //    18: istore          6
        //    20: aload           5
        //    22: ifnonnull       52
        //    25: iload           6
        //    27: iload_3        
        //    28: bipush          31
        //    30: imul           
        //    31: iadd           
        //    32: ireturn        
        //    33: astore_1       
        //    34: aload_1        
        //    35: athrow         
        //    36: aload_0        
        //    37: getfield        com/whatsapp/util/x.a:Ljava/lang/String;
        //    40: invokevirtual   java/lang/String.hashCode:()I
        //    43: istore_3       
        //    44: goto            11
        //    47: astore          4
        //    49: aload           4
        //    51: athrow         
        //    52: aload_0        
        //    53: getfield        com/whatsapp/util/x.c:Ljava/lang/String;
        //    56: invokevirtual   java/lang/String.hashCode:()I
        //    59: istore          6
        //    61: goto            25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      33     36     Ljava/lang/NumberFormatException;
        //  11     17     47     52     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0011:
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
    
    @Override
    public String toString() {
        return x.z[0] + this.a + "," + this.c + ">";
    }
}
