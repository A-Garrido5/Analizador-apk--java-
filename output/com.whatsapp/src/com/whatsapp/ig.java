// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.gdrive.ct;
import com.whatsapp.util.Log;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.whatsapp.util.by;
import android.support.annotation.NonNull;
import com.whatsapp.gdrive.o;
import com.whatsapp.gdrive.x;

class ig extends x
{
    private static final String[] z;
    private boolean a;
    private long b;
    final ConversationsFragment c;
    private int d;
    private long e;
    @o
    private int f;
    
    static {
        final String[] z2 = new String[11];
        String s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCL_kzE\f_k$A\u0002X}lUL^jjP\u0011I#|_\u000eB{gE\u0006I";
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
                        c2 = 'c';
                        break;
                    }
                    case 0: {
                        c2 = '-';
                        break;
                    }
                    case 1: {
                        c2 = '\u000e';
                        break;
                    }
                    case 2: {
                        c2 = '\t';
                        break;
                    }
                    case 3: {
                        c2 = '1';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCL_kzE\f_k$A\u0002X}lULCa$U\u0002Yo$R\fC`lR\u0017Dag";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCLOojZ\u0016]#yC\fJ|lB\u0010\r";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCL_kzE\f_k$A\u0002X}lULAa~\u001c\u0001Lz}T\u0011T";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCLH|{^\u0011\u0000j|C\nCi$C\u0006^zfC\u0006\u0002";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCL^k}\u001c\u000eH}zP\u0004H!zY\fZ#`_\u0007HzlC\u000eD`hE\u0006";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "X`lI\u0013Hm}T\u0007\r}}P\u0017H";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCL_kzE\f_k$A\u0002X}lULCa$F\nKg";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCL_kzE\f_k$T\rI.";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCL_kzE\f_k$A\u0002X}lUL^jjP\u0011I#dX\u0010^ggV";
                    n = 8;
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    array = z2;
                    s = "NagG\u0006_}hE\nB`z\u001c\u0004I|`G\u0006\u0000akB\u0006_xlCL_kzE\f_k$B\u0017L|}";
                    n = 9;
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
    
    private ig(final ConversationsFragment c) {
        this.c = c;
        this.e = -1L;
        this.b = -1L;
    }
    
    ig(final ConversationsFragment conversationsFragment, final pi pi) {
        this(conversationsFragment);
    }
    
    private void a(@o final int p0, @NonNull final String p1, @NonNull final String p2, final int p3, final boolean p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          6
        //     5: aload_0        
        //     6: getfield        com/whatsapp/ig.c:Lcom/whatsapp/ConversationsFragment;
        //     9: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    12: astore          7
        //    14: aload           7
        //    16: ifnonnull       20
        //    19: return         
        //    20: iload_1        
        //    21: tableswitch {
        //                4: 88
        //                5: 134
        //                6: 158
        //                7: 211
        //          default: 52
        //        }
        //    52: iload           5
        //    54: aload_0        
        //    55: getfield        com/whatsapp/ig.a:Z
        //    58: if_icmpeq       19
        //    61: aload           7
        //    63: new             Lcom/whatsapp/pb;
        //    66: dup            
        //    67: aload_0        
        //    68: iload           5
        //    70: invokespecial   com/whatsapp/pb.<init>:(Lcom/whatsapp/ig;Z)V
        //    73: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //    76: aload_0        
        //    77: iload           5
        //    79: putfield        com/whatsapp/ig.a:Z
        //    82: return         
        //    83: astore          13
        //    85: aload           13
        //    87: athrow         
        //    88: aload_0        
        //    89: getfield        com/whatsapp/ig.f:I
        //    92: iconst_2       
        //    93: if_icmpeq       114
        //    96: aload           7
        //    98: new             Lcom/whatsapp/arl;
        //   101: dup            
        //   102: aload_0        
        //   103: invokespecial   com/whatsapp/arl.<init>:(Lcom/whatsapp/ig;)V
        //   106: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   109: aload_0        
        //   110: iconst_2       
        //   111: putfield        com/whatsapp/ig.f:I
        //   114: aload           7
        //   116: new             Lcom/whatsapp/uk;
        //   119: dup            
        //   120: aload_0        
        //   121: aload_2        
        //   122: aload_3        
        //   123: invokespecial   com/whatsapp/uk.<init>:(Lcom/whatsapp/ig;Ljava/lang/String;Ljava/lang/String;)V
        //   126: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   129: iload           6
        //   131: ifeq            52
        //   134: new             Ljava/lang/IllegalStateException;
        //   137: dup            
        //   138: getstatic       com/whatsapp/ig.z:[Ljava/lang/String;
        //   141: bipush          6
        //   143: aaload         
        //   144: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   147: athrow         
        //   148: astore          17
        //   150: aload           17
        //   152: athrow         
        //   153: astore          18
        //   155: aload           18
        //   157: athrow         
        //   158: aload_3        
        //   159: invokestatic    com/whatsapp/aol.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   162: pop            
        //   163: aload_0        
        //   164: getfield        com/whatsapp/ig.f:I
        //   167: iconst_4       
        //   168: if_icmpeq       189
        //   171: aload           7
        //   173: new             Lcom/whatsapp/a8x;
        //   176: dup            
        //   177: aload_0        
        //   178: invokespecial   com/whatsapp/a8x.<init>:(Lcom/whatsapp/ig;)V
        //   181: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   184: aload_0        
        //   185: iconst_4       
        //   186: putfield        com/whatsapp/ig.f:I
        //   189: aload           7
        //   191: new             Lcom/whatsapp/ard;
        //   194: dup            
        //   195: aload_0        
        //   196: iload           4
        //   198: aload_2        
        //   199: aload_3        
        //   200: invokespecial   com/whatsapp/ard.<init>:(Lcom/whatsapp/ig;ILjava/lang/String;Ljava/lang/String;)V
        //   203: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   206: iload           6
        //   208: ifeq            52
        //   211: aload_3        
        //   212: invokestatic    com/whatsapp/aol.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   215: pop            
        //   216: aload_0        
        //   217: getfield        com/whatsapp/ig.f:I
        //   220: istore          11
        //   222: iload           11
        //   224: iconst_5       
        //   225: if_icmpeq       262
        //   228: getstatic       com/whatsapp/ig.z:[Ljava/lang/String;
        //   231: iconst_5       
        //   232: aaload         
        //   233: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   236: aload           7
        //   238: invokevirtual   android/app/Activity.isFinishing:()Z
        //   241: ifne            262
        //   244: aload           7
        //   246: new             Lcom/whatsapp/hy;
        //   249: dup            
        //   250: aload_0        
        //   251: invokespecial   com/whatsapp/hy.<init>:(Lcom/whatsapp/ig;)V
        //   254: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   257: aload_0        
        //   258: iconst_5       
        //   259: putfield        com/whatsapp/ig.f:I
        //   262: aload           7
        //   264: invokevirtual   android/app/Activity.isFinishing:()Z
        //   267: ifne            52
        //   270: aload           7
        //   272: new             Lcom/whatsapp/aw5;
        //   275: dup            
        //   276: aload_0        
        //   277: aload_3        
        //   278: aload_2        
        //   279: invokespecial   com/whatsapp/aw5.<init>:(Lcom/whatsapp/ig;Ljava/lang/String;Ljava/lang/String;)V
        //   282: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   285: goto            52
        //   288: astore          12
        //   290: aload           12
        //   292: athrow         
        //   293: astore          14
        //   295: aload           14
        //   297: athrow         
        //   298: astore          16
        //   300: aload           16
        //   302: athrow         
        //   303: astore          8
        //   305: aload           8
        //   307: athrow         
        //   308: astore          9
        //   310: aload           9
        //   312: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  52     82     83     88     Ljava/lang/IllegalStateException;
        //  88     114    153    158    Ljava/lang/IllegalStateException;
        //  114    129    148    153    Ljava/lang/IllegalStateException;
        //  134    148    148    153    Ljava/lang/IllegalStateException;
        //  158    189    293    298    Ljava/lang/IllegalStateException;
        //  189    206    298    303    Ljava/lang/IllegalStateException;
        //  211    222    303    308    Ljava/lang/IllegalStateException;
        //  228    262    308    313    Ljava/lang/IllegalStateException;
        //  262    285    288    293    Ljava/lang/IllegalStateException;
        //  300    303    303    308    Ljava/lang/IllegalStateException;
        //  305    308    308    313    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 144, Size: 144
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
    public void a(final long b, final long n, final long n2) {
        final FragmentActivity activity = this.c.getActivity();
        if (activity != null) {
            final String a = by.a((Context)activity, b);
            try {
                if (!by.a((Context)activity, b).equals(by.a((Context)activity, this.b))) {
                    this.b = b;
                    this.a(4, this.c.getString(2131232057), this.c.getString(2131232137, new Object[] { a, by.a((Context)activity, n2), 100L * b / n2 }), (int)(100L * b / n2), true);
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public void a(final boolean b, final long n, final long n2) {
        Log.i(ig.z[8] + b);
        final FragmentActivity activity = this.c.getActivity();
        if (activity == null) {
            return;
        }
        String s = null;
        Label_0119: {
            if (n > 0L) {
                s = activity.getString(2131232045, new Object[] { by.a((Context)activity, n2), by.a((Context)activity, n) });
                if (!App.I) {
                    break Label_0119;
                }
            }
            s = activity.getString(2131232044, new Object[] { by.a((Context)activity, n2) });
        }
        this.a(4, this.c.getString(2131232054), s, 100, false);
    }
    
    @Override
    public void b() {
        Log.i(ig.z[10]);
        this.a(5, this.c.getString(2131232057), this.c.getString(2131232134), -1, true);
    }
    
    @Override
    public void b(@ct final int n) {
        try {
            Log.i(ig.z[4] + n);
            if (n != 10) {
                this.a(2, this.c.getString(2131232053), this.c.getString(2131232043), 0, false);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void b(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: lload_3        
        //     1: lconst_0       
        //     2: lcmp           
        //     3: ifle            93
        //     6: ldc2_w          100
        //     9: lload_1        
        //    10: lmul           
        //    11: lload_3        
        //    12: ldiv           
        //    13: l2i            
        //    14: istore          6
        //    16: iload           6
        //    18: aload_0        
        //    19: getfield        com/whatsapp/ig.d:I
        //    22: isub           
        //    23: ifle            87
        //    26: aload_0        
        //    27: iload           6
        //    29: putfield        com/whatsapp/ig.d:I
        //    32: aload_0        
        //    33: getfield        com/whatsapp/ig.c:Lcom/whatsapp/ConversationsFragment;
        //    36: ldc             2131232057
        //    38: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //    41: astore          8
        //    43: aload_0        
        //    44: getfield        com/whatsapp/ig.c:Lcom/whatsapp/ConversationsFragment;
        //    47: astore          9
        //    49: iconst_1       
        //    50: anewarray       Ljava/lang/Object;
        //    53: astore          10
        //    55: aload           10
        //    57: iconst_0       
        //    58: aload_0        
        //    59: getfield        com/whatsapp/ig.d:I
        //    62: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    65: aastore        
        //    66: aload_0        
        //    67: iconst_5       
        //    68: aload           8
        //    70: aload           9
        //    72: ldc             2131232135
        //    74: aload           10
        //    76: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    79: aload_0        
        //    80: getfield        com/whatsapp/ig.d:I
        //    83: iconst_1       
        //    84: invokespecial   com/whatsapp/ig.a:(ILjava/lang/String;Ljava/lang/String;IZ)V
        //    87: getstatic       com/whatsapp/App.I:Z
        //    90: ifeq            130
        //    93: new             Ljava/lang/StringBuilder;
        //    96: dup            
        //    97: invokespecial   java/lang/StringBuilder.<init>:()V
        //   100: getstatic       com/whatsapp/ig.z:[Ljava/lang/String;
        //   103: iconst_2       
        //   104: aaload         
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: lload_1        
        //   109: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   112: ldc             "/"
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: lload_3        
        //   118: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   121: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   124: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   127: invokestatic    java/lang/Thread.dumpStack:()V
        //   130: return         
        //   131: astore          7
        //   133: aload           7
        //   135: athrow         
        //   136: astore          5
        //   138: aload           5
        //   140: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  16     87     131    136    Ljava/lang/IllegalStateException;
        //  87     93     136    141    Ljava/lang/IllegalStateException;
        //  93     130    136    141    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    @Override
    public void d(final long n, final long n2) {
        Log.i(ig.z[1]);
        final String string = this.c.getString(2131232132);
        while (true) {
            Label_0068: {
                if (n2 <= 0L) {
                    break Label_0068;
                }
                final long n3 = 100L * n;
                try {
                    final int n4 = (int)(n3 / n2);
                    this.a(4, this.c.getString(2131232055), string, n4, false);
                    return;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
    
    @Override
    public void e(final long n, final long n2) {
        Log.i(ig.z[7]);
        final String string = this.c.getString(2131232051);
        while (true) {
            Label_0069: {
                if (n2 <= 0L) {
                    break Label_0069;
                }
                final long n3 = 100L * n;
                try {
                    final int n4 = (int)(n3 / n2);
                    this.a(4, this.c.getString(2131232055), string, n4, false);
                    return;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
    
    @Override
    public void k(final long n, final long n2) {
        Log.i(ig.z[3]);
        final String string = this.c.getString(2131232047);
        while (true) {
            Label_0068: {
                if (n2 <= 0L) {
                    break Label_0068;
                }
                final long n3 = 100L * n;
                try {
                    final int n4 = (int)(n3 / n2);
                    this.a(4, this.c.getString(2131232055), string, n4, false);
                    return;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
    
    @Override
    public void m(final long n, final long n2) {
        Log.i(ig.z[0]);
        final String string = this.c.getString(2131232050);
        while (true) {
            Label_0068: {
                if (n2 <= 0L) {
                    break Label_0068;
                }
                final long n3 = 100L * n;
                try {
                    final int n4 = (int)(n3 / n2);
                    this.a(4, this.c.getString(2131232055), string, n4, false);
                    return;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
    
    @Override
    public void n(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(ig.z[9]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(5, this.c.getString(2131232055), this.c.getString(2131232068), n3, false);
                        return;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
}
