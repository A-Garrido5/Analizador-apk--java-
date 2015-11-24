// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Environment;
import com.whatsapp.util.Log;
import com.whatsapp.gdrive.SettingsGoogleDrive;
import android.app.Activity;
import android.os.AsyncTask;

public class wq extends AsyncTask
{
    private static final String[] z;
    Runnable a;
    Activity b;
    gu c;
    
    static {
        final String[] z2 = new String[7];
        String s = "i\u0018N1Ya\u0013";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '-';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = '_';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "w\u0012O+Dj\u0010HpOe\u0014P*]+\u0011Z6Aa\u0013\u00141Xh\u001b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "w\u0012O+Dj\u0010HpOe\u0014P*]+\u0011Z6Aa\u0013\u00142Dw\u0004R1J)\u0018Ir@m\u0004V>Yg\u001f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "i\u0018N1Ya\u0013d-B";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "w\u0012O+Dj\u0010HpOe\u0014P*]+\u001aH8^p\u0018I:\u0002a\u0005I0_$";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "t\u0018L:_";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "f\u0016X4Xt\u0013Y";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private wq(final Activity b, final gu c, final Runnable a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public wq(final SettingsChat settingsChat, final Runnable runnable) {
        this((Activity)settingsChat, settingsChat, runnable);
    }
    
    public wq(final SettingsGoogleDrive settingsGoogleDrive, final Runnable runnable) {
        this(settingsGoogleDrive, settingsGoogleDrive, runnable);
    }
    
    protected ai a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/ai.FAILED_GENERIC:Lcom/whatsapp/ai;
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/wq.b:Landroid/app/Activity;
        //     8: getstatic       com/whatsapp/wq.z:[Ljava/lang/String;
        //    11: iconst_5       
        //    12: aaload         
        //    13: invokevirtual   android/app/Activity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    16: checkcast       Landroid/os/PowerManager;
        //    19: iconst_1       
        //    20: getstatic       com/whatsapp/wq.z:[Ljava/lang/String;
        //    23: bipush          6
        //    25: aaload         
        //    26: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //    29: astore_3       
        //    30: aload_3        
        //    31: invokevirtual   android/os/PowerManager$WakeLock.acquire:()V
        //    34: invokestatic    java/lang/System.currentTimeMillis:()J
        //    37: lstore          9
        //    39: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    42: iconst_0       
        //    43: iconst_0       
        //    44: invokevirtual   com/whatsapp/vy.a:(ZZ)Lcom/whatsapp/ai;
        //    47: astore          11
        //    49: aload           11
        //    51: astore          5
        //    53: invokestatic    java/lang/System.currentTimeMillis:()J
        //    56: lstore          12
        //    58: ldc2_w          3000
        //    61: lload           12
        //    63: lload           9
        //    65: lsub           
        //    66: lsub           
        //    67: lstore          14
        //    69: lload           14
        //    71: lconst_0       
        //    72: lcmp           
        //    73: ifle            81
        //    76: lload           14
        //    78: invokestatic    java/lang/Thread.sleep:(J)V
        //    81: aload_3        
        //    82: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //    85: ifeq            92
        //    88: aload_3        
        //    89: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //    92: aload           5
        //    94: areturn        
        //    95: astore          17
        //    97: aload           17
        //    99: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   102: goto            81
        //   105: astore          6
        //   107: new             Ljava/lang/StringBuilder;
        //   110: dup            
        //   111: invokespecial   java/lang/StringBuilder.<init>:()V
        //   114: getstatic       com/whatsapp/wq.z:[Ljava/lang/String;
        //   117: iconst_4       
        //   118: aaload         
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: aload           6
        //   124: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   133: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   136: aload_3        
        //   137: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   140: ifeq            92
        //   143: aload_3        
        //   144: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   147: aload           5
        //   149: areturn        
        //   150: astore          16
        //   152: aload           16
        //   154: athrow         
        //   155: astore          7
        //   157: aload_3        
        //   158: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   161: ifeq            168
        //   164: aload_3        
        //   165: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   168: aload           7
        //   170: athrow         
        //   171: astore          8
        //   173: aload           8
        //   175: athrow         
        //   176: astore          4
        //   178: aload_2        
        //   179: astore          5
        //   181: aload           4
        //   183: astore          6
        //   185: goto            107
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  30     49     176    188    Ljava/lang/Exception;
        //  30     49     155    176    Any
        //  53     58     105    107    Ljava/lang/Exception;
        //  53     58     155    176    Any
        //  76     81     95     105    Ljava/lang/InterruptedException;
        //  76     81     105    107    Ljava/lang/Exception;
        //  76     81     155    176    Any
        //  81     92     150    155    Ljava/lang/InterruptedException;
        //  97     102    105    107    Ljava/lang/Exception;
        //  97     102    155    176    Any
        //  107    136    155    176    Any
        //  157    168    171    176    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0081:
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
    
    protected void a(final ai ai) {
        final boolean i = App.I;
        this.b.removeDialog(600);
        Conversation.g();
        if (ai == ai.FAILED_INVALID) {
            al5.u();
            final byte[] p = al5.P();
            final byte[] a = al5.a(p);
            Label_0094: {
                if (a != null) {
                    App.a(a, p);
                    this.c.a(2131231345);
                    Log.i(wq.z[2]);
                    if (!i) {
                        break Label_0094;
                    }
                }
                this.c.a(2131231342);
                Log.w(wq.z[1]);
            }
            if (!i) {
                return;
            }
        }
        if (ai == ai.SUCCESS) {
            if (this.a == null) {
                return;
            }
            this.a.run();
            if (!i) {
                return;
            }
        }
        if (ai == ai.FAILED_OUT_OF_SPACE) {
            final gu c = this.c;
            String s;
            if (App.aw()) {
                s = this.b.getString(2131231343) + " " + this.b.getString(2131231599);
            }
            else {
                s = this.b.getString(2131231344) + " " + this.b.getString(2131231600);
            }
            c.f(s);
            if (!i) {
                return;
            }
        }
        final String externalStorageState = Environment.getExternalStorageState();
        int n = 0;
        Label_0242: {
            if (externalStorageState.equals(wq.z[3])) {
                n = 2131231355;
                if (!i) {
                    break Label_0242;
                }
            }
            if (!externalStorageState.equals(wq.z[0]) || i) {
                n = 2131231354;
            }
            else {
                n = 2131231342;
            }
        }
        this.c.a(n);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((ai)o);
    }
    
    protected void onPreExecute() {
        this.b.showDialog(600);
    }
}
