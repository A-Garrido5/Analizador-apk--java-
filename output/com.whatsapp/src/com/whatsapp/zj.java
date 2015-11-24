// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class zj implements View$OnClickListener
{
    private static final String[] z;
    final ContactInfo a;
    final adg b;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0014}QZ\u001b\u0014f`G\u0014\u0011}\u0010J\u0013\u0016~\u001fJ\u0013\u0016~Z\\Z\u0016bO\u000e\u0014\u0018f\u001fH\u0015\u0002|[";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'z';
                        break;
                    }
                    case 0: {
                        c2 = 'w';
                        break;
                    }
                    case 1: {
                        c2 = '\u0012';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = '.';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0016|[\\\u0015\u001ev\u0011G\u0014\u0003wQZT\u0016qKG\u0015\u0019<{g;;";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0003wS\u0014";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    zj(final ContactInfo a, final adg b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/zj.b:Lcom/whatsapp/adg;
        //     4: invokestatic    com/whatsapp/adg.b:(Lcom/whatsapp/adg;)Lcom/whatsapp/a_9;
        //     7: ifnull          38
        //    10: aload_0        
        //    11: getfield        com/whatsapp/zj.b:Lcom/whatsapp/adg;
        //    14: invokestatic    com/whatsapp/adg.b:(Lcom/whatsapp/adg;)Lcom/whatsapp/a_9;
        //    17: aload_0        
        //    18: getfield        com/whatsapp/zj.a:Lcom/whatsapp/ContactInfo;
        //    21: getstatic       com/whatsapp/fieldstats/bq.CONTACT_INFO:Lcom/whatsapp/fieldstats/bq;
        //    24: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;Lcom/whatsapp/fieldstats/bq;)Z
        //    27: pop            
        //    28: getstatic       com/whatsapp/App.I:Z
        //    31: istore          7
        //    33: iload           7
        //    35: ifeq            94
        //    38: new             Ljava/lang/StringBuilder;
        //    41: dup            
        //    42: invokespecial   java/lang/StringBuilder.<init>:()V
        //    45: getstatic       com/whatsapp/zj.z:[Ljava/lang/String;
        //    48: iconst_2       
        //    49: aaload         
        //    50: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    53: aload_0        
        //    54: getfield        com/whatsapp/zj.b:Lcom/whatsapp/adg;
        //    57: invokestatic    com/whatsapp/adg.c:(Lcom/whatsapp/adg;)Ljava/lang/String;
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    66: astore_3       
        //    67: new             Landroid/content/Intent;
        //    70: dup            
        //    71: getstatic       com/whatsapp/zj.z:[Ljava/lang/String;
        //    74: iconst_1       
        //    75: aaload         
        //    76: aload_3        
        //    77: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    80: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //    83: astore          4
        //    85: aload_0        
        //    86: getfield        com/whatsapp/zj.a:Lcom/whatsapp/ContactInfo;
        //    89: aload           4
        //    91: invokevirtual   com/whatsapp/ContactInfo.startActivity:(Landroid/content/Intent;)V
        //    94: return         
        //    95: astore_2       
        //    96: aload_2        
        //    97: athrow         
        //    98: astore          5
        //   100: getstatic       com/whatsapp/zj.z:[Ljava/lang/String;
        //   103: iconst_0       
        //   104: aaload         
        //   105: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   108: invokestatic    com/whatsapp/App.M:()V
        //   111: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      33     95     98     Landroid/content/ActivityNotFoundException;
        //  85     94     98     112    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
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
