// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.view.View$OnClickListener;
import android.text.format.DateUtils;
import com.whatsapp.util.br;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.os.Environment;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.Context;
import android.os.Handler;
import java.io.File;
import com.whatsapp.util.ao;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;
import android.widget.SeekBar;

public class RecordAudio extends DialogToastActivity
{
    private static final String[] A;
    private SeekBar k;
    private boolean l;
    private View m;
    private od n;
    private int o;
    private long p;
    private TextView q;
    private ProgressBar r;
    private String s;
    private Button t;
    private TextView u;
    private Button v;
    private ImageButton w;
    private ao x;
    private File y;
    private Handler z;
    
    static {
        final String[] a = new String[16];
        String s = "\u001e\u001c\u00013a\b\u0018\u00178z\u0003V\u0012.v\u001c\u0018\u001093\r\f\u00065|L\u001d\u0017.r\u0018\u0010\r2)";
        int n = -1;
        String[] array = a;
        int n2 = 0;
        String intern = null;
    Label_0432:
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
                        c2 = 'l';
                        break;
                    }
                    case 1: {
                        c2 = 'y';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\t\u0001\u00169a\u0002\u0018\u000e\u0003u\u0005\u0015\u0007\u0003c\r\r\n";
                    n2 = 1;
                    array = a;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001e\u001c\u00013a\b\u0018\u00178z\u0003V\u00120r\u0015\u001b\u0003?x3\u001f\u000b0vV";
                    n2 = 2;
                    array = a;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\r\f\u00065|C\u0016\u0005;(L\u001a\r8v\u000f\n_3c\u0019\n";
                    n2 = 3;
                    array = a;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0001\u0016\u00172g\t\u001d";
                    n2 = 4;
                    array = a;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = a;
                    s = "\u001c\u0015\u0003%q\r\u001a\t\u0003|\u0002\u0015\u001b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001e\u001c\u00013a\b\u0018\u00178z\u0003V\u0001.v\r\r\u0007";
                    n = 5;
                    array = a;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\n\u0010\u000e9c\r\r\n";
                    n = 6;
                    array = a;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\t\u0001\u00169a\u0002\u0018\u000e\u0003u\u0005\u0015\u0007\u0003c\r\r\n";
                    n = 7;
                    array = a;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u001e\u001c\u00013a\b\u0018\u00178z\u0003V\u0001.v\r\r\u0007s}\u0003T\u0011,r\u000f\u001c";
                    n = 8;
                    array = a;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\r\u001b\r.g\u0005\u0017\u0005|w\u0019\u001cB(|L\u0017\u0003(z\u001a\u001cB0z\u000e\u000b\u0003.z\t\nB1z\u001f\n\u000b2t";
                    n = 9;
                    array = a;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\r\f\u00065|CJ\u0005,c";
                    n = 10;
                    array = a;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0006\u0010\u0006";
                    n = 11;
                    array = a;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u001e\u001c\u00013a\b\u0018\u00178z\u0003V\u00069`\u0018\u000b\r%";
                    n = 12;
                    array = a;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u001e\u001c\u00013a\b\u0018\u00178z\u0003V\u00069`\u0018\u000b\r%<\u001f\r\r,a\t\u001a\r.w\t\u000b";
                    n = 13;
                    array = a;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u001e\u001c\u00013a\b\u0018\u00178z\u0003V\u00069`\u0018\u000b\r%<\u001f\r\r,c\u0000\u0018\u001b9a";
                    n = 14;
                    array = a;
                    continue;
                }
                case 14: {
                    break Label_0432;
                }
            }
        }
        array[n2] = intern;
        A = a;
    }
    
    public RecordAudio() {
        this.o = 0;
    }
    
    static long a(final RecordAudio recordAudio, final long p2) {
        return recordAudio.p = p2;
    }
    
    static ImageButton a(final RecordAudio recordAudio) {
        return recordAudio.w;
    }
    
    static File a(final RecordAudio recordAudio, final File y) {
        return recordAudio.y = y;
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/RecordAudio.n:Lcom/whatsapp/od;
        //     4: ifnull          26
        //     7: aload_0        
        //     8: getfield        com/whatsapp/RecordAudio.n:Lcom/whatsapp/od;
        //    11: invokevirtual   com/whatsapp/od.e:()V
        //    14: aload_0        
        //    15: getfield        com/whatsapp/RecordAudio.n:Lcom/whatsapp/od;
        //    18: invokevirtual   com/whatsapp/od.f:()V
        //    21: aload_0        
        //    22: aconst_null    
        //    23: putfield        com/whatsapp/RecordAudio.n:Lcom/whatsapp/od;
        //    26: aload_0        
        //    27: getfield        com/whatsapp/RecordAudio.r:Landroid/widget/ProgressBar;
        //    30: aload_0        
        //    31: getfield        com/whatsapp/RecordAudio.r:Landroid/widget/ProgressBar;
        //    34: invokevirtual   android/widget/ProgressBar.getMax:()I
        //    37: invokevirtual   android/widget/ProgressBar.setProgress:(I)V
        //    40: aload_0        
        //    41: invokespecial   com/whatsapp/RecordAudio.b:()V
        //    44: return         
        //    45: astore_1       
        //    46: aload_1        
        //    47: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //    50: goto            14
        //    53: astore_2       
        //    54: aload_2        
        //    55: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //    58: goto            21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      14     45     53     Ljava/lang/Exception;
        //  14     21     53     61     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0014:
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
    
    static void a(final RecordAudio recordAudio, final int n) {
        recordAudio.e(n);
    }
    
    static int b(final RecordAudio recordAudio, final int o) {
        return recordAudio.o = o;
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //     4: ifnull          26
        //     7: aload_0        
        //     8: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    11: invokevirtual   com/whatsapp/util/ao.b:()V
        //    14: aload_0        
        //    15: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    18: invokevirtual   com/whatsapp/util/ao.d:()V
        //    21: aload_0        
        //    22: aconst_null    
        //    23: putfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    26: aload_0        
        //    27: aload_0        
        //    28: getfield        com/whatsapp/RecordAudio.y:Ljava/io/File;
        //    31: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    34: invokestatic    com/whatsapp/util/ao.a:(Ljava/lang/String;)Lcom/whatsapp/util/ao;
        //    37: putfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    40: aload_0        
        //    41: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    44: new             Lcom/whatsapp/lm;
        //    47: dup            
        //    48: aload_0        
        //    49: invokespecial   com/whatsapp/lm.<init>:(Lcom/whatsapp/RecordAudio;)V
        //    52: invokevirtual   com/whatsapp/util/ao.a:(Landroid/media/MediaPlayer$OnPreparedListener;)V
        //    55: aload_0        
        //    56: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    59: new             Lcom/whatsapp/lb;
        //    62: dup            
        //    63: aload_0        
        //    64: invokespecial   com/whatsapp/lb.<init>:(Lcom/whatsapp/RecordAudio;)V
        //    67: invokevirtual   com/whatsapp/util/ao.a:(Landroid/media/MediaPlayer$OnErrorListener;)V
        //    70: aload_0        
        //    71: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    74: invokevirtual   com/whatsapp/util/ao.g:()V
        //    77: new             Ljava/lang/StringBuilder;
        //    80: dup            
        //    81: invokespecial   java/lang/StringBuilder.<init>:()V
        //    84: getstatic       com/whatsapp/RecordAudio.A:[Ljava/lang/String;
        //    87: iconst_0       
        //    88: aaload         
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: aload_0        
        //    93: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    96: invokevirtual   com/whatsapp/util/ao.e:()I
        //    99: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   102: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   105: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   108: aload_0        
        //   109: iconst_5       
        //   110: putfield        com/whatsapp/RecordAudio.o:I
        //   113: aload_0        
        //   114: getfield        com/whatsapp/RecordAudio.k:Landroid/widget/SeekBar;
        //   117: aload_0        
        //   118: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //   121: invokevirtual   com/whatsapp/util/ao.e:()I
        //   124: invokevirtual   android/widget/SeekBar.setMax:(I)V
        //   127: aload_0        
        //   128: getfield        com/whatsapp/RecordAudio.u:Landroid/widget/TextView;
        //   131: aload_0        
        //   132: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //   135: invokevirtual   com/whatsapp/util/ao.e:()I
        //   138: sipush          1000
        //   141: idiv           
        //   142: i2l            
        //   143: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   146: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   149: aload_0        
        //   150: getfield        com/whatsapp/RecordAudio.k:Landroid/widget/SeekBar;
        //   153: iconst_0       
        //   154: invokevirtual   android/widget/SeekBar.setProgress:(I)V
        //   157: aload_0        
        //   158: getfield        com/whatsapp/RecordAudio.w:Landroid/widget/ImageButton;
        //   161: ldc             2130838954
        //   163: invokevirtual   android/widget/ImageButton.setImageResource:(I)V
        //   166: return         
        //   167: astore_1       
        //   168: aload_1        
        //   169: athrow         
        //   170: astore_2       
        //   171: aload_2        
        //   172: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   175: aload_0        
        //   176: ldc             2131231073
        //   178: invokevirtual   com/whatsapp/RecordAudio.a:(I)V
        //   181: goto            149
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      26     167    170    Ljava/io/IOException;
        //  26     149    170    184    Ljava/io/IOException;
        //  168    170    170    184    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    static boolean b(final RecordAudio recordAudio) {
        return recordAudio.l;
    }
    
    static int c(final RecordAudio recordAudio) {
        return recordAudio.o;
    }
    
    static void c(final RecordAudio recordAudio, final int n) {
        recordAudio.d(n);
    }
    
    static od d(final RecordAudio recordAudio) {
        return recordAudio.n;
    }
    
    private void d(final int n) {
        final boolean i = App.I;
        Label_0387: {
            switch (n) {
                case 0: {
                    this.v.setText(2131231516);
                    this.t.setVisibility(0);
                    this.m.setVisibility(0);
                    this.w.setVisibility(8);
                    this.q.setVisibility(0);
                    this.r.setVisibility(0);
                    this.k.setVisibility(4);
                    this.r.setProgress(0);
                    if (i) {
                        break Label_0387;
                    }
                    break;
                }
                case 1: {
                    this.v.setText(2131231518);
                    this.t.setVisibility(8);
                    this.m.setVisibility(8);
                    this.w.setVisibility(8);
                    this.q.setVisibility(0);
                    this.r.setVisibility(0);
                    this.k.setVisibility(4);
                    if (i) {
                        break Label_0387;
                    }
                    break;
                }
                case 3: {
                    this.v.setText(2131231517);
                    this.t.setVisibility(0);
                    this.m.setVisibility(0);
                    this.w.setVisibility(0);
                    this.w.setImageResource(2130838953);
                    this.q.setVisibility(8);
                    this.r.setVisibility(4);
                    this.k.setVisibility(0);
                    final SeekBar k = this.k;
                    int e;
                    if (this.x != null) {
                        e = this.x.e();
                    }
                    else {
                        e = 0;
                    }
                    k.setMax(e);
                    if (i) {
                        break Label_0387;
                    }
                    break;
                }
                case 4: {
                    this.v.setText(2131231517);
                    this.t.setVisibility(0);
                    this.m.setVisibility(0);
                    this.w.setVisibility(0);
                    this.w.setImageResource(2130838954);
                    this.q.setVisibility(8);
                    this.r.setVisibility(4);
                    this.k.setVisibility(0);
                    final SeekBar j = this.k;
                    final ao x = this.x;
                    int e2 = 0;
                    if (x != null) {
                        e2 = this.x.e();
                    }
                    j.setMax(e2);
                    if (i) {
                        break Label_0387;
                    }
                    break;
                }
                case 5: {
                    this.w.setImageResource(2130838954);
                }
            }
        }
    }
    
    static TextView e(final RecordAudio recordAudio) {
        return recordAudio.q;
    }
    
    private void e(final int n) {
        this.b();
        if (this.x != null) {
            this.o = 3;
            this.z.sendEmptyMessage(0);
            this.w.setImageResource(2130838953);
            App.e((Context)this);
            this.x.h();
            if (n > 0) {
                this.x.a(n);
                this.k.setProgress(this.x.i());
            }
        }
    }
    
    static File f(final RecordAudio recordAudio) {
        return recordAudio.y;
    }
    
    static String g(final RecordAudio recordAudio) {
        return recordAudio.s;
    }
    
    static SeekBar h(final RecordAudio recordAudio) {
        return recordAudio.k;
    }
    
    static Handler i(final RecordAudio recordAudio) {
        return recordAudio.z;
    }
    
    static ao j(final RecordAudio recordAudio) {
        return recordAudio.x;
    }
    
    static void k(final RecordAudio recordAudio) {
        recordAudio.a();
    }
    
    static long l(final RecordAudio recordAudio) {
        return recordAudio.p;
    }
    
    static TextView m(final RecordAudio recordAudio) {
        return recordAudio.u;
    }
    
    static ProgressBar n(final RecordAudio recordAudio) {
        return recordAudio.r;
    }
    
    @Override
    public void b(final int n) {
        switch (n) {
            default: {}
            case 2131231078:
            case 2131231088:
            case 2131231134: {
                this.finish();
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        this.supportRequestWindowFeature(1);
        super.onCreate(bundle);
        this.setContentView(2130903209);
        Log.i(RecordAudio.A[6]);
        if (!WhatsAppLibLoader.a(null)) {
            Log.i(RecordAudio.A[10]);
            this.finish();
            return;
        }
        if (App.aX == null || App.c((Context)this) != 3) {
            this.finish();
            return;
        }
        if (!Environment.getExternalStorageState().equals(RecordAudio.A[4])) {
            this.showDialog(0);
            return;
        }
        this.l = this.getIntent().getBooleanExtra(RecordAudio.A[5], false);
        this.s = this.getIntent().getStringExtra(RecordAudio.A[12]);
        this.u = (TextView)this.findViewById(2131755744);
        this.q = (TextView)this.findViewById(2131755742);
        this.t = (Button)this.findViewById(2131755747);
        this.m = this.findViewById(2131755746);
        this.w = (ImageButton)this.findViewById(2131755741);
        this.v = (Button)this.findViewById(2131755745);
        this.r = (ProgressBar)this.findViewById(2131755743);
        (this.k = (SeekBar)this.findViewById(2131755470)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new aa1(this));
        Label_0587: {
            if (this.l) {
                final String stringExtra = this.getIntent().getStringExtra(RecordAudio.A[7]);
                this.y = new File(stringExtra);
                final v1 p = Conversation.p();
                if (p.a()) {
                    p.b().D = true;
                }
                this.v.setText(2131231631);
                this.findViewById(2131755740).setVisibility(0);
                ((TextView)this.findViewById(2131755739)).setText(2131231490);
                ((TextView)this.findViewById(2131755740)).setText((CharSequence)this.y.getName());
                Log.i(RecordAudio.A[2] + stringExtra);
                this.b();
                this.o = 4;
                if (!i) {
                    break Label_0587;
                }
            }
            CharSequence charSequence = null;
            if (bundle != null) {
                charSequence = bundle.getCharSequence(RecordAudio.A[8]);
            }
            Label_0540: {
                if (charSequence != null) {
                    this.y = new File(charSequence.toString());
                    this.r.setProgress(this.r.getMax());
                    this.b();
                    this.p = 0L;
                    this.o = 4;
                    if (!i) {
                        break Label_0540;
                    }
                }
                final String absolutePath = br.a((Context)this, "", (byte)2, 0, false).getAbsolutePath();
                String s;
                if (App.aV >= 3) {
                    s = RecordAudio.A[3];
                }
                else {
                    s = RecordAudio.A[11];
                }
                this.n = od.a(absolutePath, s);
                this.u.setText((CharSequence)DateUtils.formatElapsedTime(120L));
                this.q.setText((CharSequence)DateUtils.formatElapsedTime(0L));
            }
            if (App.C() < 1024 * (1024 * ym.k)) {
                Log.w(RecordAudio.A[9]);
                this.a(2131231078);
                return;
            }
        }
        this.d(this.o);
        this.t.setOnClickListener((View$OnClickListener)new ih(this));
        this.v.setOnClickListener((View$OnClickListener)new a_l(this));
        this.w.setOnClickListener((View$OnClickListener)new al1(this));
        this.z = new u8(this);
    }
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 0: {
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
                int title;
                if (App.aw()) {
                    title = 2131231521;
                }
                else {
                    title = 2131231522;
                }
                final AlertDialog$Builder setTitle = alertDialog$Builder.setTitle(title);
                int message;
                if (App.aw()) {
                    message = 2131231519;
                }
                else {
                    message = 2131231520;
                }
                return setTitle.setMessage(message).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new a0f(this)).create();
            }
        }
    }
    
    public void onDestroy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/RecordAudio.A:[Ljava/lang/String;
        //     3: bipush          13
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: invokespecial   com/whatsapp/DialogToastActivity.onDestroy:()V
        //    13: aload_0        
        //    14: getfield        com/whatsapp/RecordAudio.o:I
        //    17: iconst_1       
        //    18: if_icmpne       30
        //    21: getstatic       com/whatsapp/RecordAudio.A:[Ljava/lang/String;
        //    24: bipush          14
        //    26: aaload         
        //    27: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    30: aload_0        
        //    31: getfield        com/whatsapp/RecordAudio.n:Lcom/whatsapp/od;
        //    34: ifnull          44
        //    37: aload_0        
        //    38: getfield        com/whatsapp/RecordAudio.n:Lcom/whatsapp/od;
        //    41: invokevirtual   com/whatsapp/od.e:()V
        //    44: aload_0        
        //    45: getfield        com/whatsapp/RecordAudio.n:Lcom/whatsapp/od;
        //    48: ifnull          58
        //    51: aload_0        
        //    52: getfield        com/whatsapp/RecordAudio.n:Lcom/whatsapp/od;
        //    55: invokevirtual   com/whatsapp/od.f:()V
        //    58: aload_0        
        //    59: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    62: astore          6
        //    64: aload           6
        //    66: ifnull          109
        //    69: aload_0        
        //    70: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    73: invokevirtual   com/whatsapp/util/ao.f:()Z
        //    76: ifeq            95
        //    79: getstatic       com/whatsapp/RecordAudio.A:[Ljava/lang/String;
        //    82: bipush          15
        //    84: aaload         
        //    85: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    88: aload_0        
        //    89: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    92: invokevirtual   com/whatsapp/util/ao.c:()V
        //    95: aload_0        
        //    96: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //    99: invokevirtual   com/whatsapp/util/ao.b:()V
        //   102: aload_0        
        //   103: getfield        com/whatsapp/RecordAudio.x:Lcom/whatsapp/util/ao;
        //   106: invokevirtual   com/whatsapp/util/ao.d:()V
        //   109: return         
        //   110: astore_1       
        //   111: aload_1        
        //   112: athrow         
        //   113: astore_2       
        //   114: aload_2        
        //   115: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   118: goto            44
        //   121: astore_3       
        //   122: aload_3        
        //   123: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   126: goto            58
        //   129: astore          4
        //   131: aload           4
        //   133: athrow         
        //   134: astore          5
        //   136: aload           5
        //   138: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      30     110    113    Ljava/lang/Exception;
        //  30     44     113    121    Ljava/lang/Exception;
        //  44     58     121    129    Ljava/lang/Exception;
        //  58     64     129    134    Ljava/lang/Exception;
        //  69     95     134    139    Ljava/lang/Exception;
        //  131    134    134    139    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 66, Size: 66
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
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.o != 0 && this.y != null && !this.l) {
            bundle.putCharSequence(RecordAudio.A[1], (CharSequence)this.y.getAbsolutePath());
        }
    }
}
