// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.Context;
import com.whatsapp.messaging.d;
import android.widget.EditText;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.whatsapp.util.Log;
import android.os.Bundle;
import java.io.File;
import android.net.Uri;

public class Advanced extends DialogToastActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = ";\u0017\u0004\u001d.9\u0016\u0016S$/\u001e\u0002\b!8\u001f\u0017S&3\u001f\u0017\u0012!7\u0016R\u00153z\u001d\u0007\u0010,";
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
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = 'Z';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = 'r';
                        break;
                    }
                    case 3: {
                        c2 = '|';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ";\u0017\u0004\u001d.9\u0016\u0016S$/\u001e\u0002\b!8\u001f\u0017S)5^\u0017\u000e25\u0001R";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ";\u0017\u0004\u001d.9\u0016\u0016S$/\u001e\u0002\b!8\u001f\u0017S#;\u001d\u001c\u00134z\u0010\u0000\u0019!.\u0016R\u0018)(";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0013<&\u00193.,";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = ";\u0017\u0004\u001d.9\u0016\u0016S#(\u0016\u0013\b%";
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
    
    static void a(final Uri p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       18
        //     4: getstatic       com/whatsapp/Advanced.z:[Ljava/lang/String;
        //     7: iconst_0       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    12: return         
        //    13: astore          15
        //    15: aload           15
        //    17: athrow         
        //    18: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //    21: astore_2       
        //    22: aload_2        
        //    23: invokevirtual   java/io/File.exists:()Z
        //    26: ifne            57
        //    29: aload_2        
        //    30: invokevirtual   java/io/File.mkdirs:()Z
        //    33: istore          14
        //    35: iload           14
        //    37: ifne            57
        //    40: getstatic       com/whatsapp/Advanced.z:[Ljava/lang/String;
        //    43: iconst_2       
        //    44: aaload         
        //    45: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    48: return         
        //    49: astore          4
        //    51: aload           4
        //    53: athrow         
        //    54: astore_3       
        //    55: aload_3        
        //    56: athrow         
        //    57: new             Ljava/io/File;
        //    60: dup            
        //    61: aload_2        
        //    62: aload_1        
        //    63: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    66: astore          5
        //    68: new             Ljava/io/PrintStream;
        //    71: dup            
        //    72: aload           5
        //    74: invokespecial   java/io/PrintStream.<init>:(Ljava/io/File;)V
        //    77: astore          6
        //    79: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    82: aload_0        
        //    83: aconst_null    
        //    84: aconst_null    
        //    85: aconst_null    
        //    86: aconst_null    
        //    87: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    90: astore          11
        //    92: aload           11
        //    94: astore          8
        //    96: aload           8
        //    98: ifnull          108
        //   101: aload           8
        //   103: aload           6
        //   105: invokestatic    android/database/DatabaseUtils.dumpCursor:(Landroid/database/Cursor;Ljava/io/PrintStream;)V
        //   108: aload           8
        //   110: invokeinterface android/database/Cursor.close:()V
        //   115: iconst_0       
        //   116: ifeq            12
        //   119: aconst_null    
        //   120: invokeinterface android/database/Cursor.close:()V
        //   125: return         
        //   126: astore          12
        //   128: aload           12
        //   130: athrow         
        //   131: astore          13
        //   133: aload           13
        //   135: athrow         
        //   136: astore          7
        //   138: new             Ljava/lang/StringBuilder;
        //   141: dup            
        //   142: invokespecial   java/lang/StringBuilder.<init>:()V
        //   145: getstatic       com/whatsapp/Advanced.z:[Ljava/lang/String;
        //   148: iconst_1       
        //   149: aaload         
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: aload           7
        //   155: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   164: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   167: aload           8
        //   169: ifnull          12
        //   172: aload           8
        //   174: invokeinterface android/database/Cursor.close:()V
        //   179: return         
        //   180: astore          9
        //   182: aconst_null    
        //   183: astore          8
        //   185: aload           8
        //   187: ifnull          197
        //   190: aload           8
        //   192: invokeinterface android/database/Cursor.close:()V
        //   197: aload           9
        //   199: athrow         
        //   200: astore          10
        //   202: aload           10
        //   204: athrow         
        //   205: astore          9
        //   207: goto            185
        //   210: astore          7
        //   212: aconst_null    
        //   213: astore          8
        //   215: goto            138
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      12     13     18     Ljava/io/IOException;
        //  22     35     54     57     Ljava/io/IOException;
        //  40     48     49     54     Ljava/io/IOException;
        //  55     57     49     54     Ljava/io/IOException;
        //  68     92     210    218    Ljava/io/IOException;
        //  68     92     180    185    Any
        //  101    108    131    136    Ljava/io/IOException;
        //  101    108    205    210    Any
        //  108    115    136    138    Ljava/io/IOException;
        //  108    115    205    210    Any
        //  119    125    126    131    Ljava/io/IOException;
        //  133    136    136    138    Ljava/io/IOException;
        //  133    136    205    210    Any
        //  138    167    205    210    Any
        //  190    197    200    205    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0108:
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
    
    static void a(final Advanced advanced, final File file, final int n) {
        advanced.a(file, n);
    }
    
    private void a(final File p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: iload_2        
        //     5: anewarray       Ljava/io/File;
        //     8: astore          4
        //    10: iconst_0       
        //    11: istore          5
        //    13: iload           5
        //    15: aload           4
        //    17: arraylength    
        //    18: if_icmpge       54
        //    21: aload           4
        //    23: iload           5
        //    25: new             Ljava/io/File;
        //    28: dup            
        //    29: aload_1        
        //    30: getstatic       com/whatsapp/Advanced.z:[Ljava/lang/String;
        //    33: iconst_3       
        //    34: aaload         
        //    35: iload           5
        //    37: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    40: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    43: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    46: aastore        
        //    47: iinc            5, 1
        //    50: iload_3        
        //    51: ifeq            13
        //    54: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    57: pop2           
        //    58: aload           4
        //    60: arraylength    
        //    61: istore          8
        //    63: iconst_0       
        //    64: istore          9
        //    66: iload           9
        //    68: iload           8
        //    70: if_icmpge       111
        //    73: aload           4
        //    75: iload           9
        //    77: aaload         
        //    78: astore          33
        //    80: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    83: lstore          34
        //    85: aload           33
        //    87: invokevirtual   java/io/File.createNewFile:()Z
        //    90: pop            
        //    91: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    94: lload           34
        //    96: lsub           
        //    97: ldc2_w          1000
        //   100: lcmp           
        //   101: ifle            104
        //   104: iinc            9, 1
        //   107: iload_3        
        //   108: ifeq            66
        //   111: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   114: pop2           
        //   115: aload           4
        //   117: arraylength    
        //   118: istore          12
        //   120: iconst_0       
        //   121: istore          13
        //   123: iload           13
        //   125: iload           12
        //   127: if_icmpge       202
        //   130: aload           4
        //   132: iload           13
        //   134: aaload         
        //   135: astore          22
        //   137: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   140: lstore          23
        //   142: aconst_null    
        //   143: astore          25
        //   145: new             Ljava/io/ObjectOutputStream;
        //   148: dup            
        //   149: new             Ljava/io/FileOutputStream;
        //   152: dup            
        //   153: aload           22
        //   155: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   158: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   161: astore          26
        //   163: aload           26
        //   165: aconst_null    
        //   166: invokevirtual   java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
        //   169: aload           26
        //   171: ifnull          179
        //   174: aload           26
        //   176: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   179: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   182: lload           23
        //   184: lsub           
        //   185: ldc2_w          1000
        //   188: lcmp           
        //   189: ifle            192
        //   192: iload           13
        //   194: iconst_1       
        //   195: iadd           
        //   196: istore          31
        //   198: iload_3        
        //   199: ifeq            347
        //   202: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   205: pop2           
        //   206: aload           4
        //   208: arraylength    
        //   209: istore          16
        //   211: iconst_0       
        //   212: istore          17
        //   214: iload           17
        //   216: iload           16
        //   218: if_icmpge       259
        //   221: aload           4
        //   223: iload           17
        //   225: aaload         
        //   226: astore          18
        //   228: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   231: lstore          19
        //   233: aload           18
        //   235: invokevirtual   java/io/File.delete:()Z
        //   238: pop            
        //   239: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   242: lload           19
        //   244: lsub           
        //   245: ldc2_w          1000
        //   248: lcmp           
        //   249: ifle            252
        //   252: iinc            17, 1
        //   255: iload_3        
        //   256: ifeq            214
        //   259: return         
        //   260: astore          32
        //   262: aload           32
        //   264: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   267: goto            179
        //   270: astore          27
        //   272: aconst_null    
        //   273: astore          26
        //   275: aload           27
        //   277: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   280: aload           26
        //   282: ifnull          179
        //   285: aload           26
        //   287: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   290: goto            179
        //   293: astore          30
        //   295: aload           30
        //   297: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   300: goto            179
        //   303: astore          28
        //   305: aload           25
        //   307: ifnull          315
        //   310: aload           25
        //   312: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   315: aload           28
        //   317: athrow         
        //   318: astore          29
        //   320: aload           29
        //   322: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   325: goto            315
        //   328: astore          36
        //   330: goto            91
        //   333: astore          28
        //   335: aload           26
        //   337: astore          25
        //   339: goto            305
        //   342: astore          27
        //   344: goto            275
        //   347: iload           31
        //   349: istore          13
        //   351: goto            123
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  85     91     328    333    Ljava/io/IOException;
        //  145    163    270    275    Ljava/io/IOException;
        //  145    163    303    305    Any
        //  163    169    342    347    Ljava/io/IOException;
        //  163    169    333    342    Any
        //  174    179    260    270    Ljava/io/IOException;
        //  275    280    333    342    Any
        //  285    290    293    303    Ljava/io/IOException;
        //  310    315    318    328    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0179:
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
    
    public void onCreate(final Bundle bundle) {
        Log.i(Advanced.z[4]);
        super.onCreate(bundle);
        this.a(false);
        this.setContentView(2130903076);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView)this.findViewById(2131755229)).setText((CharSequence)Integer.toString(App.ae));
        this.findViewById(2131755230).setOnClickListener((View$OnClickListener)new att(this));
        this.findViewById(2131755231).setOnClickListener((View$OnClickListener)new ua(this));
        this.findViewById(2131755234).setOnClickListener((View$OnClickListener)new f(this));
        this.findViewById(2131755235).setOnClickListener((View$OnClickListener)new tx(this));
        this.findViewById(2131755236).setOnClickListener((View$OnClickListener)new zk(this));
        this.findViewById(2131755232).setOnClickListener((View$OnClickListener)new _3(this));
        this.findViewById(2131755233).setOnClickListener((View$OnClickListener)new aqk(this));
        this.findViewById(2131755251).setOnClickListener((View$OnClickListener)new gi(this));
        this.findViewById(2131755252).setOnClickListener((View$OnClickListener)new ws(this));
        this.findViewById(2131755239).setOnClickListener((View$OnClickListener)new a6j(this));
        this.findViewById(2131755237).setOnClickListener((View$OnClickListener)new adu(this));
        this.findViewById(2131755238).setOnClickListener((View$OnClickListener)new a9p(this));
        this.findViewById(2131755240).setOnClickListener((View$OnClickListener)new a06(this));
        this.findViewById(2131755241).setOnClickListener((View$OnClickListener)new ny(this));
        this.findViewById(2131755242).setOnClickListener((View$OnClickListener)new f5(this));
        final EditText editText = (EditText)this.findViewById(2131755243);
        this.findViewById(2131755244).setOnClickListener((View$OnClickListener)new nj(this, editText));
        this.findViewById(2131755245).setOnClickListener((View$OnClickListener)new a82(this, editText));
        this.findViewById(2131755246).setOnClickListener((View$OnClickListener)new xi(this));
        this.findViewById(2131755247).setOnClickListener((View$OnClickListener)new aq4(this));
        this.findViewById(2131755248).setOnClickListener((View$OnClickListener)new tc(this));
        this.findViewById(2131755249).setOnClickListener((View$OnClickListener)new aqt(this));
        this.findViewById(2131755250).setOnClickListener((View$OnClickListener)new ns(this));
        this.findViewById(2131755253).setOnClickListener((View$OnClickListener)new a9k(this));
        this.findViewById(2131755254).setOnClickListener((View$OnClickListener)new vj(this));
        this.findViewById(2131755255).setOnClickListener((View$OnClickListener)new ys(this));
        this.findViewById(2131755256).setOnClickListener((View$OnClickListener)new ye(this));
        this.findViewById(2131755257).setOnClickListener((View$OnClickListener)new at0(this));
        this.findViewById(2131755258).setOnClickListener((View$OnClickListener)new jg(this));
        ((TextView)this.findViewById(2131755227)).setText((CharSequence)com.whatsapp.messaging.d.c((Context)this));
        this.findViewById(2131755259).setOnClickListener((View$OnClickListener)new hd(this));
    }
    
    protected Dialog onCreateDialog(final int n) {
        final String format = String.format(App.C.a(2131296298, 3), 3);
        final j5 j5 = new j5(this);
        final ad1 ad1 = new ad1(this);
        final a_a a_a = new a_a(this);
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                return new AlertDialog$Builder((Context)this).setMessage(format).setCancelable(false).setPositiveButton(2131231451, (DialogInterface$OnClickListener)j5).setNeutralButton(2131231455, (DialogInterface$OnClickListener)a_a).setNegativeButton(2131231453, (DialogInterface$OnClickListener)ad1).create();
            }
            case 2: {
                return new AlertDialog$Builder((Context)this).setTitle(format).setItems(2131689491, (DialogInterface$OnClickListener)new rz(this)).create();
            }
        }
    }
}
