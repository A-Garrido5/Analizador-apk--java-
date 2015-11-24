// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.m;
import android.os.Bundle;
import android.app.Activity;

public class g
{
    public static final String a;
    protected static final String b;
    public static final String c;
    public static final String d;
    protected static final String e;
    public static final String f;
    public static c g;
    public static final String h;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[11];
        String s = "5P;#q4P{6l3Zajf'P{0a$F;!q#Zg j0Yz#-8Vz*\\8Q";
        int n = 10;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0432:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\u0003';
                        break;
                    }
                    case 0: {
                        c3 = 'Q';
                        break;
                    }
                    case 1: {
                        c3 = '5';
                        break;
                    }
                    case 2: {
                        c3 = '\u0015';
                        break;
                    }
                    case 3: {
                        c3 = 'D';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0001Yp%p4\u0015`7fqf}!q=Zv/E#Tr)f?AT'w8C|0z\u007f\u0015\\(o4Rt(#0Va-u8Al~#";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 10: {
                    c = intern;
                    s = "5P;#q4P{6l3Zajf'P{0a$F;!q#Zg\u001bg8Ty+d";
                    n = 11;
                    continue;
                }
                case 11: {
                    e = intern;
                    s = "5P;#q4P{6l3Zajf'P{0a$F;!q#Zg j0Yz#-7\\{-p9jt\"w4GJ j0Yz#";
                    n = 12;
                    continue;
                }
                case 12: {
                    f = intern;
                    s = "5P;#q4P{6l3Zajf'P{0a$F;!q#Zg\u001bg8Ty+d\u000eXt*b6Pg";
                    n = 13;
                    continue;
                }
                case 13: {
                    b = intern;
                    s = "5P;#q4P{6l3Zajf'P{0a$F;!q#Zg j0Yz#-%\\a(f";
                    n = 14;
                    continue;
                }
                case 14: {
                    a = intern;
                    s = "5P;#q4P{6l3Zajf'P{0a$F;!q#Zg j0Yz#-4Cp*w\u000eAl4f\u000eZ{\u001b`=Zf!";
                    n = 15;
                    continue;
                }
                case 15: {
                    d = intern;
                    s = "5P;#q4P{6l3Zajf'P{0a$F;!q#Zg j0Yz#-<Pf7b6P";
                    n = 16;
                    continue;
                }
                case 16: {
                    h = intern;
                    s = "\u0018Yy!d0Y5%`%\\c-w(\u0015b-w9Z`0#7Gt#n4[adp$Ee+q%\u001b5\u0001j%]p6#$FpdB?Qg+j5\u0015&j3z\u0015z6#0[q6l8Q;7v!Ez6w\u007fC!jb!E;\u0002q0Rx!m%tv0j'\\a=-";
                    n = -1;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u007ff}!q=Zv/O8Fa\u0005`%\\c-w(";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0018Yy!d0Y5%`%\\c-w(\u0015a=s4\u000f5";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "2Zxjb2A|+m3Tg7k4Gy+`:\u001bt4s";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u007ff}!q=Zv/B2A|2j%L";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "0[q6l8Q;%s!\u001bT'w8C|0z";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u007ff}!q=Zv/S#Ps!q4[v!B2A|2j%L";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "0[q6l8Q;7v!Ez6w\u007fC!jb!E;\u0002q0Rx!m%tv0j'\\a=";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\bZ`dn$Fadp4A50k4\u0015f0b%\\vde0Va+q(\u0015s-f=Q50lqVz*e8R`6fqPg6l#\u0015q-b=Zr7#7Zgdz>@gdb!E;";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0014Gg+qqQ|%o>R5)b?Tr!qqGp'f8Cp #4Mv!s%\\z*";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0432;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static void a(final Activity activity) {
        a(activity, false, null);
    }
    
    public static void a(final Activity p0, final Object p1, final boolean p2, final Bundle p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       de/greenrobot/event/util/g.g:Lde/greenrobot/event/util/c;
        //     3: ifnonnull       25
        //     6: new             Ljava/lang/RuntimeException;
        //     9: dup            
        //    10: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //    13: bipush          9
        //    15: aaload         
        //    16: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    19: athrow         
        //    20: astore          4
        //    22: aload           4
        //    24: athrow         
        //    25: aload_0        
        //    26: invokestatic    de/greenrobot/event/util/g.b:(Landroid/app/Activity;)Z
        //    29: istore          7
        //    31: iload           7
        //    33: ifeq            49
        //    36: aload_0        
        //    37: aload_1        
        //    38: iload_2        
        //    39: aload_3        
        //    40: invokestatic    de/greenrobot/event/util/ErrorDialogManager$SupportManagerFragment.a:(Landroid/app/Activity;Ljava/lang/Object;ZLandroid/os/Bundle;)V
        //    43: getstatic       de/greenrobot/event/util/c.b:I
        //    46: ifeq            67
        //    49: aload_0        
        //    50: aload_1        
        //    51: iload_2        
        //    52: aload_3        
        //    53: invokestatic    de/greenrobot/event/util/ErrorDialogManager$HoneycombManagerFragment.a:(Landroid/app/Activity;Ljava/lang/Object;ZLandroid/os/Bundle;)V
        //    56: return         
        //    57: astore          5
        //    59: aload           5
        //    61: athrow         
        //    62: astore          6
        //    64: aload           6
        //    66: athrow         
        //    67: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      20     20     25     Ljava/lang/RuntimeException;
        //  25     31     57     62     Ljava/lang/RuntimeException;
        //  36     49     62     67     Ljava/lang/RuntimeException;
        //  49     56     62     67     Ljava/lang/RuntimeException;
        //  59     62     62     67     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    public static void a(final Activity activity, final boolean b) {
        a(activity, b, null);
    }
    
    public static void a(final Activity activity, final boolean b, final Bundle bundle) {
        a(activity, activity.getClass(), b, bundle);
    }
    
    protected static void a(final k k) {
        if (de.greenrobot.event.util.g.g.a.i) {
            String s = de.greenrobot.event.util.g.g.a.g;
            if (s == null) {
                s = m.s;
            }
            Log.i(s, de.greenrobot.event.util.g.z[10], k.a);
        }
    }
    
    static boolean a(final Object o, final k k) {
        return b(o, k);
    }
    
    private static boolean b(final Activity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       de/greenrobot/event/util/c.b:I
        //     5: istore_2       
        //     6: aload_0        
        //     7: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    10: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //    13: astore_3       
        //    14: iconst_0       
        //    15: istore          4
        //    17: aload_3        
        //    18: astore          5
        //    20: aload           5
        //    22: ifnonnull       58
        //    25: new             Ljava/lang/RuntimeException;
        //    28: dup            
        //    29: new             Ljava/lang/StringBuilder;
        //    32: dup            
        //    33: invokespecial   java/lang/StringBuilder.<init>:()V
        //    36: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //    39: iconst_3       
        //    40: aaload         
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: aload_0        
        //    45: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    57: athrow         
        //    58: aload           5
        //    60: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    63: astore          6
        //    65: aload           6
        //    67: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //    70: bipush          8
        //    72: aaload         
        //    73: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    76: ifeq            86
        //    79: iload_2        
        //    80: ifeq            265
        //    83: iload_1        
        //    84: istore          4
        //    86: aload           6
        //    88: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //    91: iconst_4       
        //    92: aaload         
        //    93: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    96: istore          11
        //    98: iload           11
        //   100: ifeq            202
        //   103: aload           6
        //   105: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //   108: iconst_5       
        //   109: aaload         
        //   110: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   113: istore          15
        //   115: iload           15
        //   117: ifne            151
        //   120: aload           6
        //   122: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //   125: iconst_2       
        //   126: aaload         
        //   127: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   130: istore          16
        //   132: iload           16
        //   134: ifne            151
        //   137: aload           6
        //   139: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //   142: bipush          7
        //   144: aaload         
        //   145: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   148: ifeq            202
        //   151: new             Ljava/lang/RuntimeException;
        //   154: dup            
        //   155: new             Ljava/lang/StringBuilder;
        //   158: dup            
        //   159: invokespecial   java/lang/StringBuilder.<init>:()V
        //   162: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //   165: iconst_1       
        //   166: aaload         
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: aload           6
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   178: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   181: athrow         
        //   182: astore          10
        //   184: aload           10
        //   186: athrow         
        //   187: astore          7
        //   189: aload           7
        //   191: athrow         
        //   192: astore          8
        //   194: aload           8
        //   196: athrow         
        //   197: astore          9
        //   199: aload           9
        //   201: athrow         
        //   202: aload           6
        //   204: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //   207: bipush          6
        //   209: aaload         
        //   210: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   213: istore          14
        //   215: iload           14
        //   217: ifeq            251
        //   220: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   223: bipush          11
        //   225: if_icmpge       262
        //   228: new             Ljava/lang/RuntimeException;
        //   231: dup            
        //   232: getstatic       de/greenrobot/event/util/g.z:[Ljava/lang/String;
        //   235: iconst_0       
        //   236: aaload         
        //   237: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   240: athrow         
        //   241: astore          13
        //   243: aload           13
        //   245: athrow         
        //   246: astore          12
        //   248: aload           12
        //   250: athrow         
        //   251: aload           5
        //   253: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //   256: astore          5
        //   258: iload_2        
        //   259: ifeq            20
        //   262: iload           4
        //   264: istore_1       
        //   265: iload_1        
        //   266: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  86     98     187    192    Ljava/lang/RuntimeException;
        //  103    115    192    197    Ljava/lang/RuntimeException;
        //  120    132    197    202    Ljava/lang/RuntimeException;
        //  137    151    182    187    Ljava/lang/RuntimeException;
        //  151    182    182    187    Ljava/lang/RuntimeException;
        //  189    192    192    197    Ljava/lang/RuntimeException;
        //  194    197    197    202    Ljava/lang/RuntimeException;
        //  199    202    182    187    Ljava/lang/RuntimeException;
        //  202    215    246    251    Ljava/lang/RuntimeException;
        //  220    241    241    246    Ljava/lang/RuntimeException;
        //  248    251    241    246    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 131, Size: 131
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
    
    private static boolean b(final Object o, final k k) {
        if (k != null) {
            final Object a = k.a();
            if (a != null) {
                try {
                    if (!a.equals(o)) {
                        return false;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
        }
        return true;
    }
}
