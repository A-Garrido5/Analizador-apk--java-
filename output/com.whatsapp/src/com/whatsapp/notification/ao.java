// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import java.util.List;
import com.whatsapp.App;
import android.content.Context;

public abstract class ao
{
    private static final ao a;
    public static boolean b;
    private static final ao[] c;
    private static ao d;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = "\b\u000e\u0010<\u001d9";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = 'p';
                        break;
                    }
                    case 0: {
                        c3 = 'P';
                        break;
                    }
                    case 1: {
                        c3 = 'g';
                        break;
                    }
                    case 2: {
                        c3 = 'q';
                        break;
                    }
                    case 3: {
                        c3 = 'S';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "2\u0006\u00154\u0015\"H\u00166\u00042\u0006\u00154\u0015\"H\u001f<\u00046\b\u0004=\u0014";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "1\t\u0015!\u001f9\u0003_:\u001e$\u0002\u001f'^3\u0006\u00056\u0017?\u0015\b}8\u001f*4";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "2\u0006\u00154\u0015\"H\u00166\u00042\u0006\u00154\u0015\"G";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "2\u0006\u00154\u0015\"H\u0019<\u001d5\u0017\u00100\u001b1\u0000\u0014|";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "1\t\u0015!\u001f9\u0003_:\u001e$\u0002\u001f'^1\u0004\u0005:\u001f>I<\u00129\u001e";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "2\u0006\u00154\u0015\"H\u00166\u00042\u0006\u00154\u0015\"G";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "2\u0006\u00154\u0015\"H\u001f<\u0018?\n\u0014";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "3\b\u001c}\u00078\u0006\u0005 \u0011 \u0017_\u001e\u00119\t";
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
        a = new a8(null);
        c = new ao[] { new a0(), new ad(), new at(), new a9(), new aa() };
    }
    
    public static ao a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/ao.b:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/notification/ao.d:Lcom/whatsapp/notification/ao;
        //     7: ifnull          21
        //    10: getstatic       com/whatsapp/notification/ao.d:Lcom/whatsapp/notification/ao;
        //    13: astore          21
        //    15: aload           21
        //    17: areturn        
        //    18: astore_2       
        //    19: aload_2        
        //    20: athrow         
        //    21: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //    24: getstatic       com/whatsapp/notification/ao.z:[Ljava/lang/String;
        //    27: iconst_0       
        //    28: aaload         
        //    29: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    32: ifeq            49
        //    35: new             Lcom/whatsapp/notification/a0;
        //    38: dup            
        //    39: invokespecial   com/whatsapp/notification/a0.<init>:()V
        //    42: putstatic       com/whatsapp/notification/ao.d:Lcom/whatsapp/notification/ao;
        //    45: iload_1        
        //    46: ifeq            264
        //    49: new             Landroid/content/Intent;
        //    52: dup            
        //    53: getstatic       com/whatsapp/notification/ao.z:[Ljava/lang/String;
        //    56: iconst_5       
        //    57: aaload         
        //    58: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    61: astore          4
        //    63: aload           4
        //    65: getstatic       com/whatsapp/notification/ao.z:[Ljava/lang/String;
        //    68: iconst_2       
        //    69: aaload         
        //    70: invokevirtual   android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
        //    73: pop            
        //    74: aload_0        
        //    75: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    78: aload           4
        //    80: ldc             65536
        //    82: invokevirtual   android/content/pm/PackageManager.queryIntentActivities:(Landroid/content/Intent;I)Ljava/util/List;
        //    85: astore          8
        //    87: aload           8
        //    89: ifnull          235
        //    92: aload           8
        //    94: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    99: astore          9
        //   101: aload           9
        //   103: invokeinterface java/util/Iterator.hasNext:()Z
        //   108: ifeq            231
        //   111: aload           9
        //   113: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   118: checkcast       Landroid/content/pm/ResolveInfo;
        //   121: getfield        android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
        //   124: getfield        android/content/pm/ActivityInfo.packageName:Ljava/lang/String;
        //   127: astore          11
        //   129: new             Ljava/lang/StringBuilder;
        //   132: dup            
        //   133: invokespecial   java/lang/StringBuilder.<init>:()V
        //   136: getstatic       com/whatsapp/notification/ao.z:[Ljava/lang/String;
        //   139: iconst_4       
        //   140: aaload         
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: aload           11
        //   146: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   149: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   152: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   155: getstatic       com/whatsapp/notification/ao.c:[Lcom/whatsapp/notification/ao;
        //   158: astore          12
        //   160: aload           12
        //   162: arraylength    
        //   163: istore          13
        //   165: iconst_0       
        //   166: istore          14
        //   168: iload           14
        //   170: iload           13
        //   172: if_icmpge       213
        //   175: aload           12
        //   177: iload           14
        //   179: aaload         
        //   180: astore          15
        //   182: aload           15
        //   184: invokevirtual   com/whatsapp/notification/ao.b:()Ljava/util/List;
        //   187: aload           11
        //   189: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   194: ifeq            206
        //   197: aload           15
        //   199: putstatic       com/whatsapp/notification/ao.d:Lcom/whatsapp/notification/ao;
        //   202: iload_1        
        //   203: ifeq            213
        //   206: iinc            14, 1
        //   209: iload_1        
        //   210: ifeq            168
        //   213: getstatic       com/whatsapp/notification/ao.d:Lcom/whatsapp/notification/ao;
        //   216: astore          20
        //   218: aload           20
        //   220: ifnull          227
        //   223: iload_1        
        //   224: ifeq            231
        //   227: iload_1        
        //   228: ifeq            101
        //   231: iload_1        
        //   232: ifeq            244
        //   235: getstatic       com/whatsapp/notification/ao.z:[Ljava/lang/String;
        //   238: bipush          7
        //   240: aaload         
        //   241: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   244: getstatic       com/whatsapp/notification/ao.d:Lcom/whatsapp/notification/ao;
        //   247: ifnonnull       264
        //   250: getstatic       com/whatsapp/notification/ao.z:[Ljava/lang/String;
        //   253: iconst_1       
        //   254: aaload         
        //   255: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   258: getstatic       com/whatsapp/notification/ao.a:Lcom/whatsapp/notification/ao;
        //   261: putstatic       com/whatsapp/notification/ao.d:Lcom/whatsapp/notification/ao;
        //   264: new             Ljava/lang/StringBuilder;
        //   267: dup            
        //   268: invokespecial   java/lang/StringBuilder.<init>:()V
        //   271: getstatic       com/whatsapp/notification/ao.z:[Ljava/lang/String;
        //   274: bipush          6
        //   276: aaload         
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: getstatic       com/whatsapp/notification/ao.c:[Lcom/whatsapp/notification/ao;
        //   283: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   286: getstatic       com/whatsapp/notification/ao.d:Lcom/whatsapp/notification/ao;
        //   289: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //   294: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   297: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   300: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   303: getstatic       com/whatsapp/notification/ao.d:Lcom/whatsapp/notification/ao;
        //   306: areturn        
        //   307: astore_3       
        //   308: aload_3        
        //   309: athrow         
        //   310: astore          16
        //   312: aload           16
        //   314: athrow         
        //   315: astore          17
        //   317: aload           17
        //   319: athrow         
        //   320: astore          5
        //   322: new             Ljava/lang/StringBuilder;
        //   325: dup            
        //   326: invokespecial   java/lang/StringBuilder.<init>:()V
        //   329: getstatic       com/whatsapp/notification/ao.z:[Ljava/lang/String;
        //   332: iconst_3       
        //   333: aaload         
        //   334: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   337: aload           5
        //   339: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   348: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   351: goto            244
        //   354: astore          18
        //   356: aload           18
        //   358: athrow         
        //   359: astore          19
        //   361: aload           19
        //   363: athrow         
        //   364: astore          10
        //   366: aload           10
        //   368: athrow         
        //   369: astore          6
        //   371: aload           6
        //   373: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      15     18     21     Ljava/lang/Exception;
        //  21     45     307    310    Ljava/lang/Exception;
        //  49     87     320    354    Ljava/lang/Exception;
        //  92     101    320    354    Ljava/lang/Exception;
        //  101    165    320    354    Ljava/lang/Exception;
        //  175    182    320    354    Ljava/lang/Exception;
        //  182    202    310    320    Ljava/lang/Exception;
        //  213    218    354    364    Ljava/lang/Exception;
        //  235    244    364    369    Ljava/lang/Exception;
        //  244    264    369    374    Ljava/lang/Exception;
        //  312    315    315    320    Ljava/lang/Exception;
        //  317    320    320    354    Ljava/lang/Exception;
        //  356    359    359    364    Ljava/lang/Exception;
        //  361    364    320    354    Ljava/lang/Exception;
        //  366    369    320    354    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 166, Size: 166
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
    
    public static boolean a(final ao ao) {
        return ao != null && ao != ao.a;
    }
    
    String a() {
        return App.aq.getPackageName();
    }
    
    public abstract void a(final int p0);
    
    public abstract List b();
    
    Context c() {
        return (Context)App.aq;
    }
    
    String d() {
        return ao.z[8];
    }
}
