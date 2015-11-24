// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.accounts.AccountManagerFuture;

class n implements Runnable
{
    private static final String[] z;
    final AccountManagerFuture a;
    final bo b;
    
    static {
        final String[] z2 = new String[5];
        String s = "i\u0011R\u0017gk\u0007I\nH|";
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
                        c2 = '&';
                        break;
                    }
                    case 0: {
                        c2 = '\b';
                        break;
                    }
                    case 1: {
                        c2 = 'd';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = '\u007f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "o\u0000T\u0016PmIG\u001cRa\u0012O\u000b_'\u000bH\u001a\u000b|\rK\u001a\u000b{\u0001R\nV(\nC\b\u0006i\u0007E\u0010Sf\u0010\u0006";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "i\u0007R\u0016If;U\u0017I\u007f;T\u001aU|\u000bT\u001ayg\nC Ra\tC Um\u0010S\u000f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "(\u0005B\u001bCl";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "i\u0011R\u0017gk\u0007I\nH|";
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
    }
    
    n(final bo b, final AccountManagerFuture a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/n.a:Landroid/accounts/AccountManagerFuture;
        //     4: invokeinterface android/accounts/AccountManagerFuture.getResult:()Ljava/lang/Object;
        //     9: checkcast       Landroid/os/Bundle;
        //    12: astore_2       
        //    13: aload_2        
        //    14: getstatic       com/whatsapp/gdrive/n.z:[Ljava/lang/String;
        //    17: iconst_0       
        //    18: aaload         
        //    19: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //    22: ifeq            125
        //    25: new             Ljava/lang/StringBuilder;
        //    28: dup            
        //    29: invokespecial   java/lang/StringBuilder.<init>:()V
        //    32: getstatic       com/whatsapp/gdrive/n.z:[Ljava/lang/String;
        //    35: iconst_1       
        //    36: aaload         
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: aload_2        
        //    41: getstatic       com/whatsapp/gdrive/n.z:[Ljava/lang/String;
        //    44: iconst_4       
        //    45: aaload         
        //    46: invokevirtual   android/os/Bundle.get:(Ljava/lang/String;)Ljava/lang/Object;
        //    49: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    52: invokestatic    com/whatsapp/gdrive/a7.a:(Ljava/lang/String;)Ljava/lang/String;
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: getstatic       com/whatsapp/gdrive/n.z:[Ljava/lang/String;
        //    61: iconst_3       
        //    62: aaload         
        //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    66: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    69: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    72: new             Landroid/content/Intent;
        //    75: dup            
        //    76: aload_0        
        //    77: getfield        com/whatsapp/gdrive/n.b:Lcom/whatsapp/gdrive/bo;
        //    80: getfield        com/whatsapp/gdrive/bo.a:Lcom/whatsapp/gdrive/g;
        //    83: getfield        com/whatsapp/gdrive/g.b:Lcom/whatsapp/gdrive/GoogleDriveActivity;
        //    86: ldc             Lcom/whatsapp/gdrive/GoogleDriveActivity;.class
        //    88: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    91: astore          4
        //    93: aload           4
        //    95: getstatic       com/whatsapp/gdrive/n.z:[Ljava/lang/String;
        //    98: iconst_2       
        //    99: aaload         
        //   100: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   103: pop            
        //   104: aload_0        
        //   105: getfield        com/whatsapp/gdrive/n.b:Lcom/whatsapp/gdrive/bo;
        //   108: getfield        com/whatsapp/gdrive/bo.a:Lcom/whatsapp/gdrive/g;
        //   111: getfield        com/whatsapp/gdrive/g.b:Lcom/whatsapp/gdrive/GoogleDriveActivity;
        //   114: aload           4
        //   116: invokevirtual   com/whatsapp/gdrive/GoogleDriveActivity.startActivity:(Landroid/content/Intent;)V
        //   119: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //   122: ifeq            152
        //   125: aload_0        
        //   126: getfield        com/whatsapp/gdrive/n.b:Lcom/whatsapp/gdrive/bo;
        //   129: getfield        com/whatsapp/gdrive/bo.a:Lcom/whatsapp/gdrive/g;
        //   132: getfield        com/whatsapp/gdrive/g.b:Lcom/whatsapp/gdrive/GoogleDriveActivity;
        //   135: invokestatic    com/whatsapp/gdrive/GoogleDriveActivity.a:(Lcom/whatsapp/gdrive/GoogleDriveActivity;)V
        //   138: aload_0        
        //   139: getfield        com/whatsapp/gdrive/n.b:Lcom/whatsapp/gdrive/bo;
        //   142: getfield        com/whatsapp/gdrive/bo.a:Lcom/whatsapp/gdrive/g;
        //   145: getfield        com/whatsapp/gdrive/g.b:Lcom/whatsapp/gdrive/GoogleDriveActivity;
        //   148: iconst_1       
        //   149: invokevirtual   com/whatsapp/gdrive/GoogleDriveActivity.setResult:(I)V
        //   152: return         
        //   153: astore_1       
        //   154: aload_1        
        //   155: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   158: aload_0        
        //   159: getfield        com/whatsapp/gdrive/n.b:Lcom/whatsapp/gdrive/bo;
        //   162: getfield        com/whatsapp/gdrive/bo.a:Lcom/whatsapp/gdrive/g;
        //   165: getfield        com/whatsapp/gdrive/g.b:Lcom/whatsapp/gdrive/GoogleDriveActivity;
        //   168: invokestatic    com/whatsapp/gdrive/GoogleDriveActivity.a:(Lcom/whatsapp/gdrive/GoogleDriveActivity;)V
        //   171: aload_0        
        //   172: getfield        com/whatsapp/gdrive/n.b:Lcom/whatsapp/gdrive/bo;
        //   175: getfield        com/whatsapp/gdrive/bo.a:Lcom/whatsapp/gdrive/g;
        //   178: getfield        com/whatsapp/gdrive/g.b:Lcom/whatsapp/gdrive/GoogleDriveActivity;
        //   181: iconst_1       
        //   182: invokevirtual   com/whatsapp/gdrive/GoogleDriveActivity.setResult:(I)V
        //   185: return         
        //   186: astore_3       
        //   187: aload_3        
        //   188: athrow         
        //   189: astore_1       
        //   190: goto            154
        //   193: astore_1       
        //   194: goto            154
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  0      13     189    193    Landroid/accounts/AuthenticatorException;
        //  0      13     153    154    Landroid/accounts/OperationCanceledException;
        //  0      13     193    197    Ljava/io/IOException;
        //  93     125    186    189    Landroid/accounts/AuthenticatorException;
        //  125    152    186    189    Landroid/accounts/AuthenticatorException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0125:
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
