// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnCancelListener;
import android.content.Context;
import android.widget.Toast;
import com.whatsapp.util.Log;
import android.app.ProgressDialog;
import android.os.AsyncTask;

class pn extends AsyncTask
{
    private static final String[] z;
    final WebImagePicker a;
    private u0 b;
    private ProgressDialog c;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u007fAv\u001eNiCqXGgSz\u001bLi@;\u0012QzKfW";
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
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = '\b';
                        break;
                    }
                    case 1: {
                        c2 = '$';
                        break;
                    }
                    case 2: {
                        c2 = '\u0014';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u007fAv\u001eNiCqXGgSz\u001bLi@;\u0015D'Af\u0005Lz";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "-\u0016$";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "FK4\u0004SiGq";
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
    
    pn(final WebImagePicker a, final u0 b) {
        this.a = a;
        this.b = b;
    }
    
    static ProgressDialog a(final pn pn) {
        return pn.c;
    }
    
    static ProgressDialog a(final pn pn, final ProgressDialog c) {
        return pn.c = c;
    }
    
    protected a8j a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: new             Ljava/net/URL;
        //     9: dup            
        //    10: aload_0        
        //    11: getfield        com/whatsapp/pn.b:Lcom/whatsapp/u0;
        //    14: getfield        com/whatsapp/u0.b:Ljava/lang/String;
        //    17: ldc             " "
        //    19: getstatic       com/whatsapp/pn.z:[Ljava/lang/String;
        //    22: iconst_2       
        //    23: aaload         
        //    24: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //    27: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    30: invokevirtual   java/net/URL.openStream:()Ljava/io/InputStream;
        //    33: astore          16
        //    35: aload           16
        //    37: astore          5
        //    39: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    42: aload_0        
        //    43: getfield        com/whatsapp/pn.a:Lcom/whatsapp/WebImagePicker;
        //    46: invokestatic    com/whatsapp/WebImagePicker.a:(Lcom/whatsapp/WebImagePicker;)Landroid/net/Uri;
        //    49: invokevirtual   android/content/ContentResolver.openOutputStream:(Landroid/net/Uri;)Ljava/io/OutputStream;
        //    52: astore_2       
        //    53: sipush          1024
        //    56: newarray        B
        //    58: astore          17
        //    60: iconst_0       
        //    61: istore          18
        //    63: iconst_0       
        //    64: istore          19
        //    66: aload_0        
        //    67: invokevirtual   com/whatsapp/pn.isCancelled:()Z
        //    70: ifne            169
        //    73: aload           5
        //    75: aload           17
        //    77: iconst_0       
        //    78: sipush          1024
        //    81: invokevirtual   java/io/InputStream.read:([BII)I
        //    84: istore          22
        //    86: iload           22
        //    88: iconst_m1      
        //    89: if_icmpne       96
        //    92: iload_3        
        //    93: ifeq            169
        //    96: aload_2        
        //    97: aload           17
        //    99: iconst_0       
        //   100: iload           22
        //   102: invokevirtual   java/io/OutputStream.write:([BII)V
        //   105: iload           22
        //   107: iload           19
        //   109: iadd           
        //   110: istore          23
        //   112: aload_0        
        //   113: getfield        com/whatsapp/pn.b:Lcom/whatsapp/u0;
        //   116: getfield        com/whatsapp/u0.d:I
        //   119: ifeq            386
        //   122: iload           23
        //   124: bipush          100
        //   126: imul           
        //   127: aload_0        
        //   128: getfield        com/whatsapp/pn.b:Lcom/whatsapp/u0;
        //   131: getfield        com/whatsapp/u0.d:I
        //   134: idiv           
        //   135: istore          24
        //   137: iload           24
        //   139: iload           18
        //   141: if_icmpeq       379
        //   144: iconst_1       
        //   145: anewarray       Ljava/lang/Integer;
        //   148: astore          25
        //   150: aload           25
        //   152: iconst_0       
        //   153: iload           24
        //   155: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   158: aastore        
        //   159: aload_0        
        //   160: aload           25
        //   162: invokevirtual   com/whatsapp/pn.publishProgress:([Ljava/lang/Object;)V
        //   165: iload_3        
        //   166: ifeq            368
        //   169: aload           5
        //   171: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   174: aload_2        
        //   175: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   178: aload_0        
        //   179: invokevirtual   com/whatsapp/pn.isCancelled:()Z
        //   182: ifne            344
        //   185: getstatic       com/whatsapp/a8j.SUCCESS:Lcom/whatsapp/a8j;
        //   188: astore          21
        //   190: aload           21
        //   192: areturn        
        //   193: astore          9
        //   195: aconst_null    
        //   196: astore          5
        //   198: aload_0        
        //   199: invokevirtual   com/whatsapp/pn.isCancelled:()Z
        //   202: ifne            278
        //   205: aload           9
        //   207: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   210: astore          13
        //   212: aload           13
        //   214: ifnull          278
        //   217: aload           9
        //   219: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   222: getstatic       com/whatsapp/pn.z:[Ljava/lang/String;
        //   225: iconst_3       
        //   226: aaload         
        //   227: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   230: istore          14
        //   232: iload           14
        //   234: ifeq            278
        //   237: getstatic       com/whatsapp/a8j.FAILED_OUT_OF_SPACE:Lcom/whatsapp/a8j;
        //   240: astore          15
        //   242: aload           5
        //   244: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   247: aload_2        
        //   248: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   251: aload           15
        //   253: areturn        
        //   254: astore          10
        //   256: aload           10
        //   258: athrow         
        //   259: astore          11
        //   261: aload           11
        //   263: athrow         
        //   264: astore          4
        //   266: aload           5
        //   268: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   271: aload_2        
        //   272: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   275: aload           4
        //   277: athrow         
        //   278: getstatic       com/whatsapp/a8j.FAILED_GENERIC:Lcom/whatsapp/a8j;
        //   281: astore          12
        //   283: aload           5
        //   285: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   288: aload_2        
        //   289: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   292: aload           12
        //   294: areturn        
        //   295: astore          6
        //   297: aconst_null    
        //   298: astore          5
        //   300: aload_0        
        //   301: invokevirtual   com/whatsapp/pn.isCancelled:()Z
        //   304: ifne            317
        //   307: getstatic       com/whatsapp/pn.z:[Ljava/lang/String;
        //   310: iconst_1       
        //   311: aaload         
        //   312: aload           6
        //   314: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   317: getstatic       com/whatsapp/a8j.FAILED_GENERIC:Lcom/whatsapp/a8j;
        //   320: astore          8
        //   322: aload           5
        //   324: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   327: aload_2        
        //   328: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   331: aload           8
        //   333: areturn        
        //   334: astore          7
        //   336: aload           7
        //   338: athrow         
        //   339: astore          20
        //   341: aload           20
        //   343: athrow         
        //   344: getstatic       com/whatsapp/a8j.FAILED_GENERIC:Lcom/whatsapp/a8j;
        //   347: areturn        
        //   348: astore          4
        //   350: aconst_null    
        //   351: astore_2       
        //   352: aconst_null    
        //   353: astore          5
        //   355: goto            266
        //   358: astore          6
        //   360: goto            300
        //   363: astore          9
        //   365: goto            198
        //   368: iload           24
        //   370: istore          18
        //   372: iload           23
        //   374: istore          19
        //   376: goto            66
        //   379: iload           18
        //   381: istore          24
        //   383: goto            165
        //   386: iconst_0       
        //   387: istore          24
        //   389: goto            137
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      35     193    198    Ljava/io/IOException;
        //  6      35     295    300    Ljava/lang/Exception;
        //  6      35     348    358    Any
        //  39     60     363    368    Ljava/io/IOException;
        //  39     60     358    363    Ljava/lang/Exception;
        //  39     60     264    266    Any
        //  66     86     363    368    Ljava/io/IOException;
        //  66     86     358    363    Ljava/lang/Exception;
        //  66     86     264    266    Any
        //  96     105    363    368    Ljava/io/IOException;
        //  96     105    358    363    Ljava/lang/Exception;
        //  96     105    264    266    Any
        //  112    137    363    368    Ljava/io/IOException;
        //  112    137    358    363    Ljava/lang/Exception;
        //  112    137    264    266    Any
        //  144    165    363    368    Ljava/io/IOException;
        //  144    165    358    363    Ljava/lang/Exception;
        //  144    165    264    266    Any
        //  178    190    339    344    Ljava/io/IOException;
        //  198    212    254    259    Ljava/io/IOException;
        //  198    212    264    266    Any
        //  217    232    259    264    Ljava/io/IOException;
        //  217    232    264    266    Any
        //  237    242    264    266    Any
        //  256    259    259    264    Ljava/io/IOException;
        //  256    259    264    266    Any
        //  261    264    264    266    Any
        //  278    283    264    266    Any
        //  300    317    334    339    Ljava/io/IOException;
        //  300    317    264    266    Any
        //  317    322    264    266    Any
        //  336    339    264    266    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
    
    protected void a(final a8j a8j) {
        final boolean i = App.I;
        if (this.c != null) {
            this.c.dismiss();
        }
        this.c = null;
        if (WebImagePicker.f(this.a) == this) {
            WebImagePicker.a(this.a, (pn)null);
        }
        if (a8j == a8j.SUCCESS) {
            this.a.setResult(-1);
            this.a.finish();
            if (!i) {
                return;
            }
        }
        if (!this.isCancelled()) {
            Log.e(pn.z[0] + a8j);
            if (a8j == a8j.FAILED_OUT_OF_SPACE) {
                final WebImagePicker a = this.a;
                int n;
                if (App.aw()) {
                    n = 2131231254;
                }
                else {
                    n = 2131231255;
                }
                a.a(n);
                if (!i) {
                    return;
                }
            }
            Toast.makeText(this.a.getApplicationContext(), (CharSequence)this.a.getString(2131231072), 1).show();
        }
    }
    
    protected void a(final Integer[] array) {
        if (this.c != null) {
            this.c.setProgress((int)array[0]);
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((a8j)o);
    }
    
    protected void onPreExecute() {
        (this.c = new ProgressDialog((Context)this.a)).setProgressStyle(1);
        this.c.setMessage((CharSequence)this.a.getString(2131231466));
        this.c.setCancelable(true);
        this.c.setOnCancelListener((DialogInterface$OnCancelListener)new xv(this));
        this.c.show();
    }
    
    protected void onProgressUpdate(final Object[] array) {
        this.a((Integer[])array);
    }
}
