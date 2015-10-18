// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.support.v7.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.ai;
import com.whatsapp.fieldstats.o;
import com.whatsapp.App;
import android.accounts.Account;
import android.os.AsyncTask;

class g extends AsyncTask
{
    private static final String[] z;
    final Account[] a;
    final GoogleDriveActivity b;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0017lwN!\u0015%dD#\u0019~lS._gkBz\u0004ahBz\u0003mqR'";
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
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = '\u0005';
                        break;
                    }
                    case 3: {
                        c2 = '\'';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0017lwN!\u0015%dD#\u0019~lS._gkBz\u0004ahBz\u0003mqR'PgkBw\u0011kfH\"\u001e|%O6\u0003(bH8\u0017d`\u00073\u0002asBw\u0012ifL\"\u0000&";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0017lwN!\u0015%dD#\u0019~lS._l`D>\u0014m";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0017lwN!\u0015%dD#\u0019~lS._gkBz\u0004ahBz\u0003mqR'Pfj\u00070\u001fgbK2PlwN!\u0015(gF4\u001b}uTw\u0016gpI3PjpSw\u001cgfF;PjdD<\u0005x%B/\u0019{qTy";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u0017lwN!\u0015%dD#\u0019~lS._gkBz\u0004ahBz\u0003mqR'P}vB%Pav\u00076\u001e(`_>\u0003|lI0P}vB%PjpSw\u0018iv\u00079\u001f(bH8\u0017d`\u00073\u0002asBw\u0012ifL\"\u0000{%A8\u0005fa\u00076\u001el%I8PdjD6\u001c(gF4\u001b}uTw\u0015plT#PmlS?\u0015z)\u0007 \u0011zk\u0007#\u0018m%R$\u0015z+";
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
    
    g(final GoogleDriveActivity b, final Account[] a) {
        this.b = b;
        this.a = a;
    }
    
    protected at a(final Object[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_2       
        //     4: new             Lcom/whatsapp/util/b0;
        //     7: dup            
        //     8: getstatic       com/whatsapp/gdrive/g.z:[Ljava/lang/String;
        //    11: iconst_0       
        //    12: aaload         
        //    13: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //    16: astore_3       
        //    17: ldc2_w          -1
        //    20: lstore          4
        //    22: aconst_null    
        //    23: astore          6
        //    25: aconst_null    
        //    26: astore          7
        //    28: aconst_null    
        //    29: astore          8
        //    31: aconst_null    
        //    32: astore          9
        //    34: aload_0        
        //    35: getfield        com/whatsapp/gdrive/g.a:[Landroid/accounts/Account;
        //    38: astore          10
        //    40: aload           10
        //    42: arraylength    
        //    43: istore          11
        //    45: iconst_0       
        //    46: istore          12
        //    48: iload           12
        //    50: iload           11
        //    52: if_icmpge       526
        //    55: aload           10
        //    57: iload           12
        //    59: aaload         
        //    60: getfield        android/accounts/Account.name:Ljava/lang/String;
        //    63: astore          30
        //    65: new             Lcom/whatsapp/gdrive/q;
        //    68: dup            
        //    69: aload           30
        //    71: aload_0        
        //    72: getfield        com/whatsapp/gdrive/g.b:Lcom/whatsapp/gdrive/GoogleDriveActivity;
        //    75: invokevirtual   com/whatsapp/gdrive/GoogleDriveActivity.getApplicationContext:()Landroid/content/Context;
        //    78: invokespecial   com/whatsapp/gdrive/q.<init>:(Ljava/lang/String;Landroid/content/Context;)V
        //    81: astore          31
        //    83: aload           31
        //    85: aload           30
        //    87: invokevirtual   com/whatsapp/gdrive/q.h:(Ljava/lang/String;)Z
        //    90: ifeq            503
        //    93: aload_0        
        //    94: getfield        com/whatsapp/gdrive/g.b:Lcom/whatsapp/gdrive/GoogleDriveActivity;
        //    97: aload           31
        //    99: invokestatic    com/whatsapp/gdrive/GoogleDriveActivity.a:(Lcom/whatsapp/gdrive/GoogleDriveActivity;Lcom/whatsapp/gdrive/q;)Landroid/util/Pair;
        //   102: astore          44
        //   104: aload           44
        //   106: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   109: checkcast       Lcom/whatsapp/gdrive/ag;
        //   112: astore          45
        //   114: aload           44
        //   116: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   119: checkcast       Lcom/whatsapp/gdrive/ag;
        //   122: astore          38
        //   124: aload           38
        //   126: ifnull          503
        //   129: getstatic       com/whatsapp/gdrive/g.z:[Ljava/lang/String;
        //   132: iconst_1       
        //   133: aaload         
        //   134: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   137: aload           38
        //   139: invokevirtual   com/whatsapp/gdrive/ag.h:()J
        //   142: lstore          47
        //   144: lload           47
        //   146: lload           4
        //   148: lcmp           
        //   149: ifle            503
        //   152: aload           38
        //   154: invokevirtual   com/whatsapp/gdrive/ag.h:()J
        //   157: lstore          49
        //   159: aload           45
        //   161: invokevirtual   com/whatsapp/gdrive/ag.b:()Ljava/lang/String;
        //   164: astore          53
        //   166: aload           53
        //   168: astore          41
        //   170: lload           49
        //   172: lstore          42
        //   174: aload           31
        //   176: astore          39
        //   178: aload           30
        //   180: astore          40
        //   182: lload           42
        //   184: lstore          4
        //   186: aload           39
        //   188: astore          8
        //   190: aload           41
        //   192: astore          7
        //   194: aload           38
        //   196: astore          9
        //   198: aload           40
        //   200: astore          14
        //   202: iload           12
        //   204: iconst_1       
        //   205: iadd           
        //   206: istore          36
        //   208: iload_2        
        //   209: ifeq            541
        //   212: aload           9
        //   214: astore          13
        //   216: aload           7
        //   218: astore          15
        //   220: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //   223: dup            
        //   224: iconst_0       
        //   225: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //   228: astore          16
        //   230: aload           8
        //   232: ifnull          443
        //   235: aload           13
        //   237: ifnull          443
        //   240: new             Lcom/whatsapp/gdrive/bq;
        //   243: dup            
        //   244: aload           8
        //   246: aload           15
        //   248: aload           13
        //   250: invokespecial   com/whatsapp/gdrive/bq.<init>:(Lcom/whatsapp/gdrive/q;Ljava/lang/String;Lcom/whatsapp/gdrive/ag;)V
        //   253: astore          17
        //   255: aload           17
        //   257: iconst_0       
        //   258: invokevirtual   com/whatsapp/gdrive/bq.a:(Z)Z
        //   261: pop            
        //   262: aload           17
        //   264: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   267: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   270: invokestatic    com/whatsapp/gdrive/a7.b:(Ljava/lang/String;)Ljava/lang/String;
        //   273: invokevirtual   com/whatsapp/gdrive/bq.c:(Ljava/lang/String;)Ljava/lang/String;
        //   276: astore          22
        //   278: aload           17
        //   280: getstatic       com/whatsapp/gdrive/GoogleDriveService.D:Ljava/io/File;
        //   283: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   286: invokestatic    com/whatsapp/gdrive/a7.b:(Ljava/lang/String;)Ljava/lang/String;
        //   289: invokevirtual   com/whatsapp/gdrive/bq.e:(Ljava/lang/String;)Ljava/lang/String;
        //   292: astore          23
        //   294: new             Lcom/whatsapp/util/b0;
        //   297: dup            
        //   298: getstatic       com/whatsapp/gdrive/g.z:[Ljava/lang/String;
        //   301: iconst_2       
        //   302: aaload         
        //   303: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //   306: astore          24
        //   308: aload_0        
        //   309: getfield        com/whatsapp/gdrive/g.b:Lcom/whatsapp/gdrive/GoogleDriveActivity;
        //   312: aload           22
        //   314: aload           8
        //   316: aload           23
        //   318: invokestatic    com/whatsapp/gdrive/GoogleDriveActivity.a:(Lcom/whatsapp/gdrive/GoogleDriveActivity;Ljava/lang/String;Lcom/whatsapp/gdrive/q;Ljava/lang/String;)Z
        //   321: istore          18
        //   323: aload           24
        //   325: invokevirtual   com/whatsapp/util/b0.c:()J
        //   328: pop2           
        //   329: new             Lcom/whatsapp/gdrive/c3;
        //   332: dup            
        //   333: aload_0        
        //   334: aload           17
        //   336: iload           18
        //   338: aload           16
        //   340: invokespecial   com/whatsapp/gdrive/c3.<init>:(Lcom/whatsapp/gdrive/g;Lcom/whatsapp/gdrive/bq;ZLjava/util/concurrent/atomic/AtomicBoolean;)V
        //   343: invokestatic    com/whatsapp/gdrive/h.a:(Ljava/lang/Runnable;)V
        //   346: aload           16
        //   348: monitorenter   
        //   349: aload           16
        //   351: invokevirtual   java/lang/Object.wait:()V
        //   354: aload           16
        //   356: monitorexit    
        //   357: aload_3        
        //   358: invokevirtual   com/whatsapp/util/b0.c:()J
        //   361: pop2           
        //   362: new             Lcom/whatsapp/gdrive/at;
        //   365: dup            
        //   366: aload           14
        //   368: aload           15
        //   370: aload           17
        //   372: aload           8
        //   374: iload           18
        //   376: aload           16
        //   378: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   381: invokespecial   com/whatsapp/gdrive/at.<init>:(Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/gdrive/bq;Lcom/whatsapp/gdrive/q;ZZ)V
        //   384: areturn        
        //   385: astore          46
        //   387: aload           46
        //   389: athrow         
        //   390: astore          37
        //   392: aload           9
        //   394: astore          33
        //   396: aload           6
        //   398: astore          14
        //   400: lload           4
        //   402: lstore          34
        //   404: lload           34
        //   406: lstore          4
        //   408: aload           33
        //   410: astore          9
        //   412: goto            202
        //   415: astore          21
        //   417: aload           21
        //   419: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   422: goto            262
        //   425: astore          28
        //   427: aload           16
        //   429: monitorexit    
        //   430: aload           28
        //   432: athrow         
        //   433: astore          27
        //   435: aload           27
        //   437: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   440: goto            357
        //   443: aconst_null    
        //   444: astore          17
        //   446: iconst_0       
        //   447: istore          18
        //   449: goto            357
        //   452: astore          52
        //   454: aload           38
        //   456: astore          33
        //   458: lload           49
        //   460: lstore          34
        //   462: aload           30
        //   464: astore          14
        //   466: goto            404
        //   469: astore          32
        //   471: aload           9
        //   473: astore          33
        //   475: aload           6
        //   477: astore          14
        //   479: lload           4
        //   481: lstore          34
        //   483: goto            404
        //   486: astore          51
        //   488: aload           38
        //   490: astore          33
        //   492: lload           49
        //   494: lstore          34
        //   496: aload           30
        //   498: astore          14
        //   500: goto            404
        //   503: aload           9
        //   505: astore          38
        //   507: aload           8
        //   509: astore          39
        //   511: aload           6
        //   513: astore          40
        //   515: aload           7
        //   517: astore          41
        //   519: lload           4
        //   521: lstore          42
        //   523: goto            182
        //   526: aload           9
        //   528: astore          13
        //   530: aload           6
        //   532: astore          14
        //   534: aload           7
        //   536: astore          15
        //   538: goto            220
        //   541: iload           36
        //   543: istore          12
        //   545: aload           14
        //   547: astore          6
        //   549: goto            48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  83     124    390    404    Lcom/whatsapp/gdrive/br;
        //  83     124    469    486    Lcom/whatsapp/gdrive/bc;
        //  129    144    385    390    Lcom/whatsapp/gdrive/br;
        //  129    144    469    486    Lcom/whatsapp/gdrive/bc;
        //  152    159    390    404    Lcom/whatsapp/gdrive/br;
        //  152    159    469    486    Lcom/whatsapp/gdrive/bc;
        //  159    166    452    469    Lcom/whatsapp/gdrive/br;
        //  159    166    486    503    Lcom/whatsapp/gdrive/bc;
        //  255    262    415    425    Lcom/whatsapp/gdrive/b2;
        //  346    349    433    443    Ljava/lang/InterruptedException;
        //  349    357    425    433    Any
        //  387    390    390    404    Lcom/whatsapp/gdrive/br;
        //  387    390    469    486    Lcom/whatsapp/gdrive/bc;
        //  427    430    425    433    Any
        //  430    433    433    443    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0182:
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
    
    protected void a(final at at) {
        final int f = GoogleDriveService.F;
        final String f2 = at.f;
        boolean b;
        if (App.ak.p() > 0) {
            b = true;
        }
        else {
            b = false;
        }
        if (f2 != null) {
            final GoogleDriveActivity b2 = this.b;
            final o backup_RESTORE_STATUS_OF_BACKUP_FOUND_AT_RESTORE_TIME = o.BACKUP_RESTORE_STATUS_OF_BACKUP_FOUND_AT_RESTORE_TIME;
            int n;
            if (b) {
                n = ai.REMOTE_AND_LOCAL_BACKUP_FOUND.getCode();
            }
            else {
                n = ai.ONLY_REMOTE_BACKUP_FOUND.getCode();
            }
            a5.a((Context)b2, backup_RESTORE_STATUS_OF_BACKUP_FOUND_AT_RESTORE_TIME, Integer.valueOf(n));
            GoogleDriveActivity.a(this.b, at);
            if (f == 0) {
                return;
            }
        }
        if (b) {
            Log.i(g.z[3]);
            a5.a((Context)this.b, o.BACKUP_RESTORE_STATUS_OF_BACKUP_FOUND_AT_RESTORE_TIME, Integer.valueOf(ai.ONLY_LOCAL_BACKUP_FOUND.getCode()));
            this.b.setResult(1);
            this.b.finish();
            if (f == 0) {
                return;
            }
        }
        if (GoogleDriveActivity.b(this.b)) {
            GoogleDriveActivity.a(this.b);
            if (f == 0) {
                return;
            }
        }
        Log.i(g.z[4]);
        a5.a((Context)this.b, o.BACKUP_RESTORE_STATUS_OF_BACKUP_FOUND_AT_RESTORE_TIME, Integer.valueOf(ai.NO_BACKUP_FOUND.getCode()));
        final AlertDialog create = new AlertDialog$Builder((Context)this.b).setMessage(2131232066).setCancelable(false).setPositiveButton(2131232000, (DialogInterface$OnClickListener)new bo(this)).setNegativeButton(2131231739, (DialogInterface$OnClickListener)new bm(this)).create();
        if (!this.b.isFinishing()) {
            create.show();
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a(array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((at)o);
    }
}
