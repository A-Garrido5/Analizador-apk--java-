// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.ConditionVariable;
import com.whatsapp.gdrive.cs;
import android.os.AsyncTask;

final class uu extends AsyncTask
{
    private static final String[] z;
    final cs a;
    final ConditionVariable b;
    final ConditionVariable c;
    
    static {
        final String[] z2 = new String[11];
        String s = ";\u0019$\u0018\u000e:\u001d+\u001e\u000e<\u0013&\u001b\u0013-\u0011g\u0019\u001f3\u0019<\u0018W>\u001f+\u0012\u000f1\be\u001e\u0016:\u001d&\b\n";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
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
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = 'H';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ";\u0019$\u0018\u000e:\u001d+\u001e\u000e<\u0013&\u001b\u0013-\u0011g\u0019\u001f3\u0019<\u0018W>\u001f+\u0012\u000f1\be\u001e\u0016:\u001d&\b\n\u007f;'\u0012\u001d3\u0019h9\b6\n-]\u001e:\u0010-\t\u00130\u0012h\u0014\t\u007f\u001a!\u0013\u0013,\u0014-\u0019T";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ";\u0019$\u0018\u000e:\u001d+\u001e\u000e<\u0013&\u001b\u0013-\u0011g\u0019\u001f3\u0019<\u0018W>\u001f+\u0012\u000f1\be\u001e\u0016:\u001d&\b\n\u007f\t&\u001c\u00183\u0019h\t\u0015\u007f\u001b-\tZ\u0018\u0013'\u001a\u0016:\\\f\u000f\u0013)\u0019h\u000e\u001f-\n!\u001e\u001f\u007f\u0013*\u0017\u001f<\bf";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ";\u0019$\u0018\u000e:\u001d+\u001e\u000e<\u0013&\u001b\u0013-\u0011g\u0019\u001f3\u0019<\u0018W>\u001f+\u0012\u000f1\be\u001e\u0016:\u001d&\b\n\u007f\u000b)\u0014\u000e6\u0012/]\u001c0\u000eh\u001a\u00150\u001b$\u0018>-\u0015>\u0018):\u000e>\u0014\u0019:\\'\u001f\u0010:\u001f<]\u000e0\\*\u0018Z-\u0019+\u0018\u0013)\u0019,S";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ";\u0019$\u0018\u000e:\u001d+\u001e\u000e<\u0013&\u001b\u0013-\u0011g\u0019\u001f3\u0019<\u0018W>\u001f+\u0012\u000f1\be\u001e\u0016:\u001d&\b\n\u007f\u000b)\u0014\u000e6\u0012/]\u001c0\u000eh:\u00150\u001b$\u0018Z\u001b\u000e!\u000b\u001f\u007f\u001f$\u0018\u001b1\t8]\u000e0\\.\u0014\u00146\u000f S";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ";\u0019$\u0018\u000e:\u001d+\u001e\u000e<\u0013&\u001b\u0013-\u0011g\u0019\u001f3\u0019<\u0018W>\u001f+\u0012\u000f1\be\u001e\u0016:\u001d&\b\n\u007f;'\u0012\u001d3\u0019h9\b6\n-]\u001b<\u001f'\b\u0014+\\,\u0018\u0016:\b!\u0012\u0014\u007f\b!\u0010\u001f;\\'\b\u000eq";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = ";\u0019$\u0018\u000e:\u001d+\u001e\u000e<\u0013&\u001b\u0013-\u0011g\u001e\u0016:\u001d&\b\np\u000f-\t\f:\u000e;\u0014\u00151\\.\u001c\u00133\u0019,";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = ";\u0019$\u0018\u000e:\u001d+\u001e\u000e<\u0013&\u001b\u0013-\u0011g\u0019\u001f3\u0019<\u0014\u00151Q+\u0012\u0017/\u0010-\t\u001f";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = ";\u0019$\u0018\u000e:\u001d+\u001e\u000e<\u0013&\u001b\u0013-\u0011g\u001e\u0016:\u001d&\b\np\u001f$\u0018\u001b-\\.\u001c\u00133\u0019,";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ")\u0019:\u000e\u00130\u0012";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "mRyOTnK~";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    uu(final ConditionVariable c, final ConditionVariable b, final cs a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    protected Void a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: invokestatic    com/whatsapp/gdrive/GoogleDriveService.am:()Z
        //     7: ifeq            125
        //    10: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //    13: iconst_3       
        //    14: aaload         
        //    15: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    18: invokestatic    java/lang/System.currentTimeMillis:()J
        //    21: lstore_3       
        //    22: aload_0        
        //    23: getfield        com/whatsapp/uu.c:Landroid/os/ConditionVariable;
        //    26: ldc2_w          60000
        //    29: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //    32: ifeq            101
        //    35: ldc2_w          60000
        //    38: invokestatic    java/lang/System.currentTimeMillis:()J
        //    41: lload_3        
        //    42: lsub           
        //    43: lsub           
        //    44: lstore          7
        //    46: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //    49: iconst_4       
        //    50: aaload         
        //    51: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    54: lload           7
        //    56: lconst_0       
        //    57: lcmp           
        //    58: ifle            89
        //    61: aload_0        
        //    62: getfield        com/whatsapp/uu.b:Landroid/os/ConditionVariable;
        //    65: lload           7
        //    67: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //    70: istore          12
        //    72: iload           12
        //    74: ifeq            89
        //    77: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //    80: iconst_1       
        //    81: aaload         
        //    82: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    85: iload_2        
        //    86: ifeq            97
        //    89: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //    92: iconst_5       
        //    93: aaload         
        //    94: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    97: iload_2        
        //    98: ifeq            109
        //   101: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //   104: iconst_2       
        //   105: aaload         
        //   106: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   109: invokestatic    com/whatsapp/DeleteAccountConfirmation.b:()Lcom/whatsapp/gdrive/GoogleDriveService;
        //   112: ifnull          125
        //   115: invokestatic    com/whatsapp/DeleteAccountConfirmation.b:()Lcom/whatsapp/gdrive/GoogleDriveService;
        //   118: aload_0        
        //   119: getfield        com/whatsapp/uu.a:Lcom/whatsapp/gdrive/cs;
        //   122: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.b:(Lcom/whatsapp/gdrive/cs;)V
        //   125: aconst_null    
        //   126: areturn        
        //   127: astore          9
        //   129: aload           9
        //   131: athrow         
        //   132: astore          10
        //   134: aload           10
        //   136: athrow         
        //   137: astore          11
        //   139: aload           11
        //   141: athrow         
        //   142: astore          5
        //   144: aload           5
        //   146: athrow         
        //   147: astore          6
        //   149: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //   152: iconst_0       
        //   153: aaload         
        //   154: aload           6
        //   156: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   159: goto            125
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  46     54     127    132    Ljava/lang/IllegalStateException;
        //  61     72     127    132    Ljava/lang/IllegalStateException;
        //  77     85     132    137    Ljava/lang/IllegalStateException;
        //  89     97     137    142    Ljava/lang/IllegalStateException;
        //  101    109    142    147    Ljava/lang/IllegalStateException;
        //  109    125    147    162    Ljava/lang/IllegalStateException;
        //  129    132    132    137    Ljava/lang/IllegalStateException;
        //  134    137    137    142    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 79, Size: 79
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
    
    protected void a(final Void p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //     3: invokestatic    android/preference/PreferenceManager.getDefaultSharedPreferences:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //     6: astore_2       
        //     7: aload_2        
        //     8: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    13: invokeinterface android/content/SharedPreferences$Editor.clear:()Landroid/content/SharedPreferences$Editor;
        //    18: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //    23: ifne            35
        //    26: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //    29: bipush          8
        //    31: aaload         
        //    32: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    35: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    38: ldc             2131099653
        //    40: iconst_1       
        //    41: invokestatic    android/preference/PreferenceManager.setDefaultValues:(Landroid/content/Context;IZ)V
        //    44: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    47: bipush          6
        //    49: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;I)V
        //    52: aload_2        
        //    53: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    58: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //    61: bipush          9
        //    63: aaload         
        //    64: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //    67: bipush          10
        //    69: aaload         
        //    70: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //    75: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //    80: ifne            92
        //    83: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //    86: bipush          6
        //    88: aaload         
        //    89: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    92: invokestatic    com/whatsapp/DeleteAccountConfirmation.f:()V
        //    95: iconst_0       
        //    96: putstatic       com/whatsapp/App.ba:Z
        //    99: invokestatic    com/whatsapp/App.k:()V
        //   102: invokestatic    com/whatsapp/DeleteAccountConfirmation.e:()V
        //   105: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   108: invokevirtual   com/whatsapp/vy.L:()V
        //   111: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   114: ldc             2131230994
        //   116: iconst_1       
        //   117: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   120: invokestatic    com/whatsapp/DeleteAccountConfirmation.h:()Lcom/whatsapp/DeleteAccountConfirmation;
        //   123: ifnull          169
        //   126: invokestatic    com/whatsapp/DeleteAccountConfirmation.h:()Lcom/whatsapp/DeleteAccountConfirmation;
        //   129: iconst_1       
        //   130: invokevirtual   com/whatsapp/DeleteAccountConfirmation.removeDialog:(I)V
        //   133: new             Landroid/content/Intent;
        //   136: dup            
        //   137: invokestatic    com/whatsapp/DeleteAccountConfirmation.h:()Lcom/whatsapp/DeleteAccountConfirmation;
        //   140: ldc             Lcom/whatsapp/EULA;.class
        //   142: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   145: astore          5
        //   147: aload           5
        //   149: ldc             32768
        //   151: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //   154: pop            
        //   155: invokestatic    com/whatsapp/DeleteAccountConfirmation.h:()Lcom/whatsapp/DeleteAccountConfirmation;
        //   158: aload           5
        //   160: invokevirtual   com/whatsapp/DeleteAccountConfirmation.startActivity:(Landroid/content/Intent;)V
        //   163: invokestatic    com/whatsapp/DeleteAccountConfirmation.h:()Lcom/whatsapp/DeleteAccountConfirmation;
        //   166: invokevirtual   com/whatsapp/DeleteAccountConfirmation.finish:()V
        //   169: getstatic       com/whatsapp/uu.z:[Ljava/lang/String;
        //   172: bipush          7
        //   174: aaload         
        //   175: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   178: return         
        //   179: astore_3       
        //   180: aload_3        
        //   181: athrow         
        //   182: astore          4
        //   184: aload           4
        //   186: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      35     179    182    Ljava/lang/IllegalStateException;
        //  35     92     182    187    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Void)o);
    }
}
