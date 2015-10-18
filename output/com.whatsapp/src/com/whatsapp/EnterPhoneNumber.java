// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.content.Context;
import android.app.Dialog;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import android.app.ProgressDialog;

public class EnterPhoneNumber extends VerifyNumber
{
    private static final String[] B;
    protected static int s;
    protected static long u;
    protected static String v;
    protected static String w;
    protected static String z;
    protected String A;
    protected boolean t;
    protected ProgressDialog x;
    protected tw y;
    
    static {
        final String[] b = new String[22];
        String s = "\u0007j_9\u0014\fdFd\u0002\u0014u\u001cE\u0006\u0003lAc\u0006\u0016UZx\r\u0001+\\x<\u0017`^q<\u0017`\\s";
        int n = -1;
        String[] array = b;
        int n2 = 0;
        String intern = null;
    Label_0582:
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
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = '2';
                        break;
                    }
                    case 3: {
                        c2 = '\u0017';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0001kFr\u0011\u0014m]y\u0006KvSa\u0006\u0017`@a\u0006\u0016uWe\u000e\rvA~\f\n*Qx\u000e\tlF7\u0005\u0005l^r\u0007";
                    n2 = 1;
                    array = b;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = b;
                    s = "\u0007j_9\u0014\fdFd\u0002\u0014u\u001cE\u0006\u0003lAc\u0006\u0016UZx\r\u0001+\\x<\u0017`^q<\u0017`\\s";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "\u0001kFr\u0011\u0014m]y\u0006KfQ8\u0001\u0005a\u001fy\u0002\t`\u0012";
                    n = 2;
                    array = b;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "8A";
                    n = 3;
                    array = b;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "8A";
                    n = 4;
                    n2 = 5;
                    array = b;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = b;
                    s = "DuZx\r\u00018";
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "DuZ*";
                    n = 6;
                    n2 = 7;
                    array = b;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    array = b;
                    s = "\u0001kFr\u0011\u0014m]y\u0006KkGzL\u0001w@x\u0011Kl\\a\u0002\blV7\u0000\u00078";
                    n = 7;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0001kFr\u0011\u0014m]y\u0006KfQ8\u0001\u0005a\u001f{\u0006\nbF\u007fC\u0007f\u000f";
                    n = 8;
                    array = b;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0001kFr\u0011\u0014m]y\u0006KkGzL\u0001w@x\u0011K`_g\u0017\u001d%Qt^";
                    n = 9;
                    array = b;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "DwWd^";
                    n = 10;
                    array = b;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0001kFr\u0011\u0014m]y\u0006K`@e\f\u0016%Fe\n\tIWv\u0007\rkUM\u0006\u0016j\u0012x\u0011Di]x\b\u0011uqx\u0016\nq@n-\u0005hW7\u0005\u0016j_7 \u000bp\\c\u0011\u001dUZx\r\u0001L\\q\fDL}R\u001b\u0007`Bc\n\u000bk";
                    n = 11;
                    array = b;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0001kFr\u0011\u0014m]y\u0006KkGzL\u0001w@x\u0011KiWy\u0004\u0010m\u0012t\u0000Y";
                    n = 12;
                    array = b;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0001kFr\u0011\u0014m]y\u0006Ka[v\u000f\u000bb\u001db\r\u0016`Qx\u0015\u0001wSu\u000f\u0001(We\u0011\u000bw";
                    n = 13;
                    array = b;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0001kFr\u0011\u0014m]y\u0006Ka[v\u000f\u000bb\u001du\u0002\n";
                    n = 14;
                    array = b;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "n\u000f";
                    n = 15;
                    array = b;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "U0\u0007\"VV4\n&PQ";
                    n = 16;
                    array = b;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0001kFr\u0011\u0014m]y\u0006Kp\\e\u0006\u0007jDr\u0011\u0005g^rL\u0014jAd\n\u0006iW:\u0017\u0005g^r\u0017";
                    n = 17;
                    array = b;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0016`U~\u0010\u0010`@:\u0013\fj\\rQ";
                    n = 18;
                    array = b;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "W4\u0002.ZQ5\u0002'ST5\u0002'S";
                    n = 19;
                    array = b;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0016`U~\u0010\u0010`@:\u0013\fj\\rP";
                    n = 20;
                    array = b;
                    continue;
                }
                case 20: {
                    break Label_0582;
                }
            }
        }
        array[n2] = intern;
        B = b;
        EnterPhoneNumber.z = null;
        EnterPhoneNumber.w = null;
        EnterPhoneNumber.s = 7;
        EnterPhoneNumber.v = null;
    }
    
    public EnterPhoneNumber() {
        this.t = false;
    }
    
    public static int a(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_5       
        //     1: istore_2       
        //     2: aload_0        
        //     3: invokevirtual   java/lang/String.length:()I
        //     6: iconst_1       
        //     7: if_icmplt       22
        //    10: aload_0        
        //    11: invokevirtual   java/lang/String.length:()I
        //    14: istore          5
        //    16: iload           5
        //    18: iconst_3       
        //    19: if_icmple       85
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //    32: bipush          9
        //    34: aaload         
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: aload_0        
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    42: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    45: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    48: iconst_2       
        //    49: ireturn        
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    53: astore          4
        //    55: new             Ljava/lang/StringBuilder;
        //    58: dup            
        //    59: invokespecial   java/lang/StringBuilder.<init>:()V
        //    62: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //    65: bipush          12
        //    67: aaload         
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: aload           4
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    76: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    79: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    82: bipush          7
        //    84: ireturn        
        //    85: aload_0        
        //    86: invokestatic    com/whatsapp/vi.g:(Ljava/lang/String;)Ljava/lang/String;
        //    89: ifnonnull       119
        //    92: new             Ljava/lang/StringBuilder;
        //    95: dup            
        //    96: invokespecial   java/lang/StringBuilder.<init>:()V
        //    99: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //   102: iconst_3       
        //   103: aaload         
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: aload_0        
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   114: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   117: iconst_3       
        //   118: ireturn        
        //   119: aload_1        
        //   120: ifnull          155
        //   123: aload_1        
        //   124: invokevirtual   java/lang/String.length:()I
        //   127: istore          8
        //   129: iload           8
        //   131: ifeq            155
        //   134: aload_1        
        //   135: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //   138: iconst_5       
        //   139: aaload         
        //   140: ldc             ""
        //   142: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   145: invokevirtual   java/lang/String.length:()I
        //   148: istore          9
        //   150: iload           9
        //   152: ifne            193
        //   155: new             Ljava/lang/StringBuilder;
        //   158: dup            
        //   159: invokespecial   java/lang/StringBuilder.<init>:()V
        //   162: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //   165: bipush          10
        //   167: aaload         
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: aload_0        
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   178: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   181: iconst_4       
        //   182: ireturn        
        //   183: astore          6
        //   185: aload           6
        //   187: athrow         
        //   188: astore          7
        //   190: aload           7
        //   192: athrow         
        //   193: aload_0        
        //   194: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   197: istore          10
        //   199: iload           10
        //   201: aload_1        
        //   202: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //   205: iconst_4       
        //   206: aaload         
        //   207: ldc             ""
        //   209: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   212: invokestatic    com/whatsapp/vi.a:(ILjava/lang/String;)Ljava/lang/String;
        //   215: astore          11
        //   217: iload           10
        //   219: aload           11
        //   221: invokevirtual   java/lang/String.length:()I
        //   224: invokestatic    com/whatsapp/vi.a:(II)I
        //   227: istore          12
        //   229: iload           12
        //   231: ifeq            307
        //   234: new             Ljava/lang/StringBuilder;
        //   237: dup            
        //   238: invokespecial   java/lang/StringBuilder.<init>:()V
        //   241: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //   244: bipush          8
        //   246: aaload         
        //   247: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   250: iload           10
        //   252: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   255: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //   258: bipush          6
        //   260: aaload         
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: aload           11
        //   266: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   269: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //   272: bipush          11
        //   274: aaload         
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: iload           12
        //   280: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   283: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   286: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   289: iload           12
        //   291: iflt            395
        //   294: bipush          6
        //   296: ireturn        
        //   297: astore          16
        //   299: aload           16
        //   301: athrow         
        //   302: astore          17
        //   304: aload           17
        //   306: athrow         
        //   307: aload_0        
        //   308: invokevirtual   java/lang/String.length:()I
        //   311: aload           11
        //   313: invokevirtual   java/lang/String.length:()I
        //   316: iadd           
        //   317: bipush          15
        //   319: if_icmpgt       345
        //   322: aload_0        
        //   323: invokevirtual   java/lang/String.length:()I
        //   326: istore          14
        //   328: aload           11
        //   330: invokevirtual   java/lang/String.length:()I
        //   333: istore          15
        //   335: iload           14
        //   337: iload           15
        //   339: iadd           
        //   340: bipush          8
        //   342: if_icmpge       393
        //   345: new             Ljava/lang/StringBuilder;
        //   348: dup            
        //   349: invokespecial   java/lang/StringBuilder.<init>:()V
        //   352: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //   355: bipush          13
        //   357: aaload         
        //   358: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   361: aload_0        
        //   362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   365: getstatic       com/whatsapp/EnterPhoneNumber.B:[Ljava/lang/String;
        //   368: bipush          7
        //   370: aaload         
        //   371: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   374: aload           11
        //   376: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   379: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   382: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   385: bipush          7
        //   387: ireturn        
        //   388: astore          13
        //   390: aload           13
        //   392: athrow         
        //   393: iconst_1       
        //   394: istore_2       
        //   395: iload_2        
        //   396: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      16     50     53     Ljava/io/IOException;
        //  22     48     53     85     Ljava/io/IOException;
        //  51     53     53     85     Ljava/io/IOException;
        //  85     117    53     85     Ljava/io/IOException;
        //  123    129    183    188    Ljava/io/IOException;
        //  134    150    188    193    Ljava/io/IOException;
        //  155    181    53     85     Ljava/io/IOException;
        //  185    188    188    193    Ljava/io/IOException;
        //  190    193    53     85     Ljava/io/IOException;
        //  193    229    53     85     Ljava/io/IOException;
        //  234    289    297    307    Ljava/io/IOException;
        //  299    302    302    307    Ljava/io/IOException;
        //  304    307    53     85     Ljava/io/IOException;
        //  307    335    388    393    Ljava/io/IOException;
        //  345    385    53     85     Ljava/io/IOException;
        //  390    393    53     85     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    
    protected void a() {
        this.removeDialog(9);
        this.x = null;
    }
    
    protected void b() {
    }
    
    protected void b(final boolean t) {
        this.t = t;
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        edit.putBoolean(EnterPhoneNumber.B[0], this.t);
        if (!edit.commit()) {
            Log.w(EnterPhoneNumber.B[1]);
        }
    }
    
    protected void c(final boolean b) {
    }
    
    @Override
    protected boolean f() {
        return this.getPreferences(0).getBoolean(EnterPhoneNumber.B[2], false);
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 9: {
                final ProgressDialog x = new ProgressDialog((Context)this);
                x.setMessage((CharSequence)this.getString(2131231535));
                x.setIndeterminate(true);
                x.setCancelable(false);
                return (Dialog)(this.x = x);
            }
            case 22: {
                Log.w(EnterPhoneNumber.B[14]);
                String message = this.getString(2131231572);
                String s = EnterPhoneNumber.B[19];
                if (EnterPhoneNumber.B[17].equals(VerifyNumber.a()) && EnterPhoneNumber.B[20].equals(App.h.getSubscriberId())) {
                    message = message + EnterPhoneNumber.B[16] + this.getString(2131231098);
                    Log.i(EnterPhoneNumber.B[18]);
                    s = EnterPhoneNumber.B[21];
                }
                return new AlertDialog$Builder((Context)this).setMessage(message).setPositiveButton(2131231536, (DialogInterface$OnClickListener)new a6f(this, s)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new q(this)).create();
            }
            case 23: {
                Log.w(EnterPhoneNumber.B[15]);
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231575) + "\n" + alm.a(VerifyNumber.b(EnterPhoneNumber.z, EnterPhoneNumber.w)) + "\n" + this.getString(2131231574)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new kz(this)).create();
            }
        }
    }
}
