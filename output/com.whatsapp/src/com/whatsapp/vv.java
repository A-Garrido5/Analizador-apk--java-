// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import android.os.AsyncTask;

class vv extends AsyncTask
{
    private static final String[] z;
    final vy a;
    final ArrayList b;
    
    static {
        final String[] z2 = new String[4];
        String s = "Bbe@g@cg\u001c}JtfFcKpvV`@cvGzBtqGrBaoV`\\peV`\u0000um]v";
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
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = '/';
                        break;
                    }
                    case 1: {
                        c2 = '\u0011';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = '3';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "LycGLCxqG";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\\~pGL[xoV`[poC";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Dt{laJ|mGvp{kW.\u0010";
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
    
    vv(final vy a, final ArrayList b) {
        this.a = a;
        this.b = b;
    }
    
    protected Void a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/vv.a:Lcom/whatsapp/vy;
        //     8: invokestatic    com/whatsapp/vy.a:(Lcom/whatsapp/vy;)Lcom/whatsapp/a2x;
        //    11: astore_3       
        //    12: aload_3        
        //    13: monitorenter   
        //    14: aload_0        
        //    15: getfield        com/whatsapp/vv.a:Lcom/whatsapp/vy;
        //    18: invokestatic    com/whatsapp/vy.a:(Lcom/whatsapp/vy;)Lcom/whatsapp/a2x;
        //    21: invokevirtual   com/whatsapp/a2x.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    24: astore          12
        //    26: aload           12
        //    28: astore          5
        //    30: aload           5
        //    32: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    35: aload_0        
        //    36: getfield        com/whatsapp/vv.b:Ljava/util/ArrayList;
        //    39: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    42: astore          13
        //    44: aload           13
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            136
        //    54: aload           13
        //    56: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    61: checkcast       Lcom/whatsapp/protocol/bi;
        //    64: astore          15
        //    66: new             Landroid/content/ContentValues;
        //    69: dup            
        //    70: iconst_1       
        //    71: invokespecial   android/content/ContentValues.<init>:(I)V
        //    74: astore          16
        //    76: aload           16
        //    78: getstatic       com/whatsapp/vv.z:[Ljava/lang/String;
        //    81: iconst_2       
        //    82: aaload         
        //    83: aload           15
        //    85: getfield        com/whatsapp/protocol/bi.u:J
        //    88: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    91: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //    94: iconst_1       
        //    95: anewarray       Ljava/lang/String;
        //    98: astore          17
        //   100: aload           17
        //   102: iconst_0       
        //   103: aload           15
        //   105: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   108: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   111: aastore        
        //   112: aload           5
        //   114: getstatic       com/whatsapp/vv.z:[Ljava/lang/String;
        //   117: iconst_1       
        //   118: aaload         
        //   119: aload           16
        //   121: getstatic       com/whatsapp/vv.z:[Ljava/lang/String;
        //   124: iconst_3       
        //   125: aaload         
        //   126: aload           17
        //   128: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   131: pop            
        //   132: iload_2        
        //   133: ifeq            44
        //   136: aload           5
        //   138: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   141: aload           5
        //   143: ifnull          159
        //   146: aload           5
        //   148: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //   151: ifeq            159
        //   154: aload           5
        //   156: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   159: getstatic       com/whatsapp/vv.z:[Ljava/lang/String;
        //   162: iconst_0       
        //   163: aaload         
        //   164: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   167: aload_3        
        //   168: monitorexit    
        //   169: aconst_null    
        //   170: areturn        
        //   171: astore          14
        //   173: aload           14
        //   175: athrow         
        //   176: astore          6
        //   178: aload_3        
        //   179: monitorexit    
        //   180: aload           6
        //   182: athrow         
        //   183: astore          10
        //   185: aconst_null    
        //   186: astore          5
        //   188: aload           10
        //   190: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   193: aload           5
        //   195: ifnull          159
        //   198: aload           5
        //   200: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //   203: ifeq            159
        //   206: aload           5
        //   208: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   211: goto            159
        //   214: astore          11
        //   216: aload           11
        //   218: athrow         
        //   219: astore          4
        //   221: aconst_null    
        //   222: astore          5
        //   224: aload           5
        //   226: ifnull          246
        //   229: aload           5
        //   231: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //   234: istore          9
        //   236: iload           9
        //   238: ifeq            246
        //   241: aload           5
        //   243: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   246: aload           4
        //   248: athrow         
        //   249: astore          7
        //   251: aload           7
        //   253: athrow         
        //   254: astore          8
        //   256: aload           8
        //   258: athrow         
        //   259: astore          4
        //   261: goto            224
        //   264: astore          10
        //   266: goto            188
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  14     26     183    188    Landroid/database/sqlite/SQLiteException;
        //  14     26     219    224    Any
        //  30     44     264    269    Landroid/database/sqlite/SQLiteException;
        //  30     44     259    264    Any
        //  44     132    264    269    Landroid/database/sqlite/SQLiteException;
        //  44     132    259    264    Any
        //  136    141    264    269    Landroid/database/sqlite/SQLiteException;
        //  136    141    259    264    Any
        //  146    159    171    176    Landroid/database/sqlite/SQLiteException;
        //  146    159    176    183    Any
        //  159    169    176    183    Any
        //  173    176    176    183    Any
        //  178    180    176    183    Any
        //  188    193    259    264    Any
        //  198    211    214    219    Landroid/database/sqlite/SQLiteException;
        //  198    211    176    183    Any
        //  216    219    176    183    Any
        //  229    236    249    254    Landroid/database/sqlite/SQLiteException;
        //  229    236    176    183    Any
        //  241    246    254    259    Landroid/database/sqlite/SQLiteException;
        //  241    246    176    183    Any
        //  246    249    176    183    Any
        //  251    254    254    259    Landroid/database/sqlite/SQLiteException;
        //  251    254    176    183    Any
        //  256    259    176    183    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
}
