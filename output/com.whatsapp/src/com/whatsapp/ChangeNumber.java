// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.os.AsyncTask;
import android.content.SharedPreferences$Editor;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.whatsapp.protocol.bl;
import android.os.Handler;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.protocol.c2;

public class ChangeNumber extends EnterPhoneNumber
{
    public static c2 E;
    private static GoogleDriveService G;
    private static Handler I;
    private static String J;
    private static String L;
    public static Runnable M;
    private static String N;
    private static String O;
    private static final String[] P;
    private Runnable B;
    private Runnable C;
    private bl D;
    private c2 F;
    private tw H;
    private Handler K;
    
    static {
        final String[] p = new String[47];
        String s = "`\u0001. !f\u0007:#$f\u001b`8#q\u0000)7i`\b!-#o";
        int n = -1;
        String[] array = p;
        int n2 = 0;
        String intern = null;
    Label_1207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = '\u0003';
                        break;
                    }
                    case 1: {
                        c2 = 'i';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = 'N';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "`\u0001. !f\u0007:#$f\u001b`>'v\u001a*";
                    n2 = 1;
                    array = p;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "`\u0001. !f\u0007:#$f\u001b`<#u\f=:kw\u0006b!*g";
                    n2 = 2;
                    array = p;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "`\u0001. !f\u0007:#$f\u001b`<#u\f=:in\u001a(=2l\u001b**$,\u0001*/*w\u00016";
                    n2 = 3;
                    array = p;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = p;
                    s = "p* ;(w\u001b6\r)g\f";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "p9'!(f':#$f\u001b";
                    n = 4;
                    array = p;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "`\u0006: 2q\u0010\u0010-)g\f";
                    n = 5;
                    array = p;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "s\u0001  #\\\u0007:#$f\u001b";
                    n = 6;
                    array = p;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "`\u0001. !f\u0007:#$f\u001b`-4f\b;+";
                    n = 7;
                    array = p;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "`\u0001. !f\u0007:#$f\u001b`'5lF,!\"fI)//o\f+n2lI(+2#\n *##\u000f=!+#* ;(w\u001b6\u001e.l\u0007*\u0007(e\u0006";
                    n = 8;
                    array = p;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "#\u0015o";
                    n = 9;
                    array = p;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "`\u0001. !f\u0007:#$f\u001b`-)v\u0007;<?9";
                    n = 10;
                    array = p;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "#\u000f.'*f\ro\r)v\u0007;<?S\u0001  #J\u0007)!ho\u0006 %3s* ;(w\u001b6\u000f$a\u001b\r7\bb\u0004*fo";
                    n = 11;
                    array = p;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "`\u0001. !f\u0007:#$f\u001b`-)v\u0007;<?9";
                    n = 12;
                    array = p;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "`\u0001. !f\u0007:#$f\u001b`,iq\f\"!0fF)//o\f+";
                    n = 13;
                    array = p;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "`\u0006\"`1k\b;='s\u0019\u0010>4f\u000f*<#m\n*=";
                    n = 14;
                    array = p;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "`\u0001. !f6!;+a\f=\u0011(f\u001e\u0010 3n\u000b*<\u0019a\b! #g";
                    n = 15;
                    array = p;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "`\u0006\"`1k\b;='s\u0019\u0010>4f\u000f*<#m\n*=";
                    n = 16;
                    array = p;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "`\u0001. !f\u0007:#$f\u001b`=#w\u0006#*#{\u0019&<'w\u0000  ie\b&\"#g";
                    n = 17;
                    array = p;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "`\u0001. !f6!;+a\f=\u0011)o\r\u0010+>s\u0000=/2j\u0006!";
                    n = 18;
                    array = p;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "`\u0001. !f6!;+a\f=\u0011(f\u001e\u0010 3n\u000b*<\u0019a\b! #g";
                    n = 19;
                    array = p;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "`\u0006\"`1k\b;='s\u0019\u0010>4f\u000f*<#m\n*=";
                    n = 20;
                    array = p;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "`\u0001. !f\u0007:#$f\u001b`,ip\f;a b\u0000#+\"";
                    n = 21;
                    array = p;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "`\u0001. !f\u0007:#$f\u001b`*#p\u001d=!?";
                    n = 22;
                    array = p;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "`\u0006\"`1k\b;='s\u0019\u0010>4f\u000f*<#m\n*=";
                    n = 23;
                    array = p;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "`\u0001. !f6!;+a\f=\u0011(f\u001e\u0010 3n\u000b*<\u0019a\b! #g";
                    n = 24;
                    array = p;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "`\u0006: 2q\u0010\u0010-)g\f";
                    n = 25;
                    array = p;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "p9'!(f':#$f\u001b";
                    n = 26;
                    array = p;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "s\u0001  #\\\u0007:#$f\u001b";
                    n = 27;
                    array = p;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "p* ;(w\u001b6\r)g\f";
                    n = 28;
                    array = p;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "`\u0001. !f6!;+a\f=\u0011)o\r\u0010+>s\u0000=/2j\u0006!";
                    n = 29;
                    array = p;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "`\u0006\"`1k\b;='s\u0019\u0010>4f\u000f*<#m\n*=";
                    n = 30;
                    array = p;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "`\u0001. !f6!;+a\f=\u0011)o\r\u0010+>s\u0000=/2j\u0006!";
                    n = 31;
                    array = p;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "`\u0001. !f\u0007:#$f\u001b`*#o\f;+)o\r*66j\u001b.:/l\u0007`('j\u0005**";
                    n = 32;
                    array = p;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "`\u0006\"`1k\b;='s\u0019\u0010>4f\u000f*<#m\n*=";
                    n = 33;
                    array = p;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = ",\u0007:#$f\u001br";
                    n = 34;
                    array = p;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "_-";
                    n = 35;
                    array = p;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "`\u0001. !f\u0007:#$f\u001b`-%>";
                    n = 36;
                    array = p;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "`\u0001. !f\u0007:#$f\u001b`-%#\u000f.'*f\ro:4j\u0004\u0003+'g\u0000!)\u001cf\u001b n q\u0006\"n\u0005l\u001c!:4z9'!(f !()";
                    n = 37;
                    array = p;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "`\u0001. !f\u0007:#$f\u001b`<#p\u001c\"+";
                    n = 38;
                    array = p;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "`\u0001. !f\u0007:#$f\u001b`-)v\u0007;<?9I";
                    n = 39;
                    array = p;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "e\b&\"#gI;!fo\u0006 %3s* ;(w\u001b6\u000f$a\u001b\r7\bb\u0004*n q\u0006\"n\u0005l\u001c!:4z9'!(f !()#";
                    n = 40;
                    array = p;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "`\u0001. !f\u0007:#$f\u001b`-)v\u0007;<?9";
                    n = 41;
                    array = p;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "#\u0015o";
                    n = 42;
                    array = p;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "#\n.;5f\ro/(# \u0000\u000b>`\f?:/l\u0007";
                    n = 43;
                    array = p;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "`\u0001. !f\u0007:#$f\u001b`-)v\u0007;<?9";
                    n = 44;
                    array = p;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "`\u0001. !f\u0007:#$f\u001b`()q\u0004.:2f\u001bb+>`\f?:/l\u0007";
                    n = 45;
                    array = p;
                    continue;
                }
                case 45: {
                    break Label_1207;
                }
            }
        }
        array[n2] = intern;
        P = p;
        ChangeNumber.J = null;
        ChangeNumber.O = null;
        ChangeNumber.N = null;
        ChangeNumber.L = null;
        ChangeNumber.G = null;
        ChangeNumber.I = new a6o(Looper.getMainLooper());
        ChangeNumber.M = new dl();
        ChangeNumber.E = new ahq();
    }
    
    public ChangeNumber() {
        this.B = new a88(this);
        this.C = new a2u(this);
        this.K = new as8(this);
        this.D = new tz(this);
        this.F = new a0v(this);
    }
    
    public static long a(final Context context) {
        return context.getSharedPreferences(ChangeNumber.P[31], 0).getLong(ChangeNumber.P[30], -1L);
    }
    
    static Handler a(final ChangeNumber changeNumber) {
        return changeNumber.K;
    }
    
    static GoogleDriveService a(final GoogleDriveService g) {
        return ChangeNumber.G = g;
    }
    
    public static void a(final Activity activity) {
        while (true) {
            Log.i(ChangeNumber.P[2]);
            final App$Me f = App.F();
            try {
                if (!App.a(f)) {
                    activity.finish();
                    return;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            App.aX = f;
            final byte[] e = al5.e(f.jabber_id);
            try {
                al5.c(e, f.jabber_id);
                VerifyNumber.a(false);
                al5.p();
                App.aX();
                b((Context)App.aq);
                Label_0113: {
                    if (!App.ak.f()) {
                        break Label_0113;
                    }
                    try {
                        Log.i(ChangeNumber.P[3]);
                        App.ak.y();
                        App.r((Context)App.aq);
                        MessageService.b((Context)App.aq);
                        App.aA();
                        if (App.I) {
                            MessageService.b((Context)App.aq);
                        }
                    }
                    catch (NullPointerException ex2) {
                        throw ex2;
                    }
                }
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    public static void a(final Context context, final long n) {
        final SharedPreferences$Editor edit = context.getSharedPreferences(ChangeNumber.P[17], 0).edit();
        try {
            edit.putLong(ChangeNumber.P[19], n);
            if (!edit.commit()) {
                Log.e(ChangeNumber.P[18]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public static void a(final Context context, final String s, final String s2) {
        final SharedPreferences$Editor edit = context.getSharedPreferences(ChangeNumber.P[21], 0).edit();
        try {
            edit.putString(ChangeNumber.P[20], "+" + s + s2);
            if (!edit.commit()) {
                Log.e(ChangeNumber.P[22]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    static void a(final ChangeNumber changeNumber, final String s, final tw tw) {
        changeNumber.a(s, tw);
    }
    
    private void a(final String p0, final tw p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //    10: bipush          45
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //    23: bipush          43
        //    25: aaload         
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: aload_1        
        //    30: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: aload_2        
        //    43: getfield        com/whatsapp/tw.c:Landroid/text/TextWatcher;
        //    46: ifnull          60
        //    49: aload_2        
        //    50: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    53: aload_2        
        //    54: getfield        com/whatsapp/tw.c:Landroid/text/TextWatcher;
        //    57: invokevirtual   android/widget/EditText.removeTextChangedListener:(Landroid/text/TextWatcher;)V
        //    60: aload_2        
        //    61: new             Lcom/whatsapp/ahr;
        //    64: dup            
        //    65: aload_1        
        //    66: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //    69: invokespecial   com/whatsapp/ahr.<init>:(Ljava/lang/String;)V
        //    72: putfield        com/whatsapp/tw.c:Landroid/text/TextWatcher;
        //    75: aload_2        
        //    76: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    79: aload_2        
        //    80: getfield        com/whatsapp/tw.c:Landroid/text/TextWatcher;
        //    83: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //    86: return         
        //    87: astore_3       
        //    88: new             Ljava/lang/StringBuilder;
        //    91: dup            
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //    98: bipush          40
        //   100: aaload         
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: aload_1        
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   111: bipush          41
        //   113: aaload         
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: aload_3        
        //   118: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   130: goto            42
        //   133: astore          5
        //   135: aload           5
        //   137: athrow         
        //   138: astore          4
        //   140: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   143: bipush          46
        //   145: aaload         
        //   146: aload           4
        //   148: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   151: return         
        //   152: astore          6
        //   154: new             Ljava/lang/StringBuilder;
        //   157: dup            
        //   158: invokespecial   java/lang/StringBuilder.<init>:()V
        //   161: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   164: bipush          42
        //   166: aaload         
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: aload_1        
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   177: bipush          44
        //   179: aaload         
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   186: aload           6
        //   188: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   191: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      42     87     133    Ljava/io/IOException;
        //  42     60     133    138    Ljava/io/IOException;
        //  42     60     138    152    Ljava/lang/NullPointerException;
        //  60     86     138    152    Ljava/lang/NullPointerException;
        //  60     86     152    192    Ljava/io/IOException;
        //  135    138    138    152    Ljava/lang/NullPointerException;
        //  135    138    152    192    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 87, Size: 87
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
    
    static boolean a(final ChangeNumber changeNumber, final String s, final String s2, final tw tw) {
        return changeNumber.a(s, s2, tw);
    }
    
    private boolean a(final String p0, final String p1, final tw p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore          4
        //     3: getstatic       com/whatsapp/App.I:Z
        //     6: istore          5
        //     8: aload_1        
        //     9: aload_2        
        //    10: invokestatic    com/whatsapp/RegisterPhone.a:(Ljava/lang/String;Ljava/lang/String;)I
        //    13: istore          6
        //    15: iconst_0       
        //    16: istore          7
        //    18: iload           6
        //    20: tableswitch {
        //                2: 155
        //                3: 435
        //                4: 429
        //                5: 423
        //                6: 417
        //                7: 411
        //                8: 405
        //          default: 64
        //        }
        //    64: iload           7
        //    66: ifeq            152
        //    69: aload_1        
        //    70: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    73: istore          15
        //    75: aload_2        
        //    76: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //    79: bipush          36
        //    81: aaload         
        //    82: ldc_w           ""
        //    85: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    88: astore          16
        //    90: iload           15
        //    92: aload           16
        //    94: invokestatic    com/whatsapp/vi.a:(ILjava/lang/String;)Ljava/lang/String;
        //    97: astore          18
        //    99: aload           18
        //   101: astore          16
        //   103: new             Ljava/lang/StringBuilder;
        //   106: dup            
        //   107: invokespecial   java/lang/StringBuilder.<init>:()V
        //   110: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   113: bipush          37
        //   115: aaload         
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: aload_1        
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   126: bipush          35
        //   128: aaload         
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: aload           16
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   137: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   140: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   143: aload_1        
        //   144: putstatic       com/whatsapp/ChangeNumber.z:Ljava/lang/String;
        //   147: aload           16
        //   149: putstatic       com/whatsapp/ChangeNumber.w:Ljava/lang/String;
        //   152: iload           7
        //   154: ireturn        
        //   155: iload           5
        //   157: ifeq            398
        //   160: aload_0        
        //   161: ldc_w           2131231525
        //   164: invokevirtual   com/whatsapp/ChangeNumber.a:(I)V
        //   167: aload_3        
        //   168: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   171: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   174: pop            
        //   175: iload           5
        //   177: ifeq            398
        //   180: aload_0        
        //   181: ldc_w           2131231526
        //   184: invokevirtual   com/whatsapp/ChangeNumber.a:(I)V
        //   187: aload_3        
        //   188: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   191: ldc_w           ""
        //   194: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   197: aload_3        
        //   198: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   201: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   204: pop            
        //   205: iload           5
        //   207: ifeq            398
        //   210: aload_0        
        //   211: ldc_w           2131231538
        //   214: invokevirtual   com/whatsapp/ChangeNumber.a:(I)V
        //   217: aload_3        
        //   218: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   221: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   224: pop            
        //   225: iload           5
        //   227: ifeq            398
        //   230: iconst_1       
        //   231: anewarray       Ljava/lang/Object;
        //   234: astore          21
        //   236: aload           21
        //   238: iconst_0       
        //   239: aload_3        
        //   240: getfield        com/whatsapp/tw.b:Ljava/lang/String;
        //   243: aastore        
        //   244: aload_0        
        //   245: aload_0        
        //   246: ldc_w           2131231530
        //   249: aload           21
        //   251: invokevirtual   com/whatsapp/ChangeNumber.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   254: invokevirtual   com/whatsapp/ChangeNumber.f:(Ljava/lang/String;)V
        //   257: aload_3        
        //   258: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   261: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   264: pop            
        //   265: iload           5
        //   267: ifeq            398
        //   270: iconst_1       
        //   271: anewarray       Ljava/lang/Object;
        //   274: astore          23
        //   276: aload           23
        //   278: iconst_0       
        //   279: aload_3        
        //   280: getfield        com/whatsapp/tw.b:Ljava/lang/String;
        //   283: aastore        
        //   284: aload_0        
        //   285: aload_0        
        //   286: ldc_w           2131231529
        //   289: aload           23
        //   291: invokevirtual   com/whatsapp/ChangeNumber.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   294: invokevirtual   com/whatsapp/ChangeNumber.f:(Ljava/lang/String;)V
        //   297: aload_3        
        //   298: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   301: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   304: pop            
        //   305: iload           5
        //   307: ifeq            398
        //   310: iconst_1       
        //   311: anewarray       Ljava/lang/Object;
        //   314: astore          25
        //   316: aload           25
        //   318: iconst_0       
        //   319: aload_3        
        //   320: getfield        com/whatsapp/tw.b:Ljava/lang/String;
        //   323: aastore        
        //   324: aload_0        
        //   325: aload_0        
        //   326: ldc_w           2131231528
        //   329: aload           25
        //   331: invokevirtual   com/whatsapp/ChangeNumber.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   334: invokevirtual   com/whatsapp/ChangeNumber.f:(Ljava/lang/String;)V
        //   337: aload_3        
        //   338: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   341: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   344: pop            
        //   345: iload           4
        //   347: istore          7
        //   349: goto            64
        //   352: astore          8
        //   354: aload           8
        //   356: athrow         
        //   357: astore          9
        //   359: aload           9
        //   361: athrow         
        //   362: astore          10
        //   364: aload           10
        //   366: athrow         
        //   367: astore          11
        //   369: aload           11
        //   371: athrow         
        //   372: astore          12
        //   374: aload           12
        //   376: athrow         
        //   377: astore          13
        //   379: aload           13
        //   381: athrow         
        //   382: astore          17
        //   384: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   387: bipush          38
        //   389: aaload         
        //   390: aload           17
        //   392: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   395: goto            103
        //   398: iload           4
        //   400: istore          7
        //   402: goto            64
        //   405: iconst_0       
        //   406: istore          4
        //   408: goto            310
        //   411: iconst_0       
        //   412: istore          4
        //   414: goto            270
        //   417: iconst_0       
        //   418: istore          4
        //   420: goto            230
        //   423: iconst_0       
        //   424: istore          4
        //   426: goto            210
        //   429: iconst_0       
        //   430: istore          4
        //   432: goto            180
        //   435: iconst_0       
        //   436: istore          4
        //   438: goto            160
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  90     99     382    398    Ljava/io/IOException;
        //  160    175    352    357    Ljava/io/IOException;
        //  180    205    357    362    Ljava/io/IOException;
        //  210    225    362    367    Ljava/io/IOException;
        //  230    265    367    372    Ljava/io/IOException;
        //  270    305    372    377    Ljava/io/IOException;
        //  310    345    377    382    Ljava/io/IOException;
        //  354    357    357    362    Ljava/io/IOException;
        //  359    362    362    367    Ljava/io/IOException;
        //  364    367    367    372    Ljava/io/IOException;
        //  369    372    372    377    Ljava/io/IOException;
        //  374    377    377    382    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 193, Size: 193
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    static String b() {
        return ChangeNumber.J;
    }
    
    public static void b(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences(ChangeNumber.P[34], 0).edit();
        try {
            edit.remove(ChangeNumber.P[32]);
            if (!edit.commit()) {
                Log.e(ChangeNumber.P[33]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    static void b(final ChangeNumber changeNumber) {
        changeNumber.i();
    }
    
    static bl c(final ChangeNumber changeNumber) {
        return changeNumber.D;
    }
    
    static String c() {
        return ChangeNumber.L;
    }
    
    static String c(final String n) {
        return ChangeNumber.N = n;
    }
    
    public static void c(final Context context) {
        App.o();
        App.ae();
        adc.a(true);
        final a_d e = App.S.e();
        e.z();
        e.a(0, 0);
        App.ba = false;
        MessageService.b(context, true);
    }
    
    static c2 d(final ChangeNumber changeNumber) {
        return changeNumber.F;
    }
    
    static String d() {
        return ChangeNumber.O;
    }
    
    static String d(final String o) {
        return ChangeNumber.O = o;
    }
    
    public static void d(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences(ChangeNumber.P[15], 0).edit();
        try {
            edit.remove(ChangeNumber.P[16]);
            if (!edit.commit()) {
                Log.e(ChangeNumber.P[14]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    static Handler e() {
        return ChangeNumber.I;
    }
    
    static tw e(final ChangeNumber changeNumber) {
        return changeNumber.H;
    }
    
    public static String e(final Context context) {
        return context.getSharedPreferences(ChangeNumber.P[24], 0).getString(ChangeNumber.P[25], (String)null);
    }
    
    static String e(final String l) {
        return ChangeNumber.L = l;
    }
    
    static String f(final String j) {
        return ChangeNumber.J = j;
    }
    
    public static boolean g() {
        try {
            if (App.F() != null) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    static String h() {
        return ChangeNumber.N;
    }
    
    private void i() {
        try {
            if (this.isFinishing()) {
                Log.i(ChangeNumber.P[0]);
                return;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        ChangeNumber.v = null;
        ChangeNumber.u = 0L;
        this.b(false);
        App.b((Context)App.aq, VerifyNumber.a(ChangeNumber.v));
        final String n = App.n(ChangeNumber.z + ChangeNumber.w);
        byte[] array = al5.b(n);
        if (array == null) {
            array = al5.k();
            al5.a(array, n);
        }
        a((Context)App.aq, ade.c);
        a8s.a(new a6s(this, this.B, this.C), new byte[][] { ChangeNumber.z.getBytes(), ChangeNumber.w.getBytes(), array });
    }
    
    static GoogleDriveService j() {
        return ChangeNumber.G;
    }
    
    @Override
    protected void c(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getstatic       com/whatsapp/ChangeNumber.z:Ljava/lang/String;
        //     4: getstatic       com/whatsapp/ChangeNumber.w:Ljava/lang/String;
        //     7: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
        //    10: iload_1        
        //    11: ifeq            25
        //    14: aload_0        
        //    15: getfield        com/whatsapp/ChangeNumber.q:Z
        //    18: ifeq            25
        //    21: aload_0        
        //    22: invokevirtual   com/whatsapp/ChangeNumber.f:()V
        //    25: aload_0        
        //    26: invokestatic    com/whatsapp/App.x:(Landroid/content/Context;)Lcom/whatsapp/App$Me;
        //    29: astore          4
        //    31: aload           4
        //    33: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    36: invokestatic    com/whatsapp/App.m:(Landroid/content/Context;)Ljava/lang/String;
        //    39: putfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //    42: aload           4
        //    44: getfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //    47: astore          6
        //    49: aload           6
        //    51: ifnull          86
        //    54: iconst_1       
        //    55: istore          7
        //    57: iload           7
        //    59: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //    62: aload           4
        //    64: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/App$Me;)Z
        //    67: ifne            97
        //    70: aload_0        
        //    71: invokevirtual   com/whatsapp/ChangeNumber.finish:()V
        //    74: return         
        //    75: astore_2       
        //    76: aload_2        
        //    77: athrow         
        //    78: astore_3       
        //    79: aload_3        
        //    80: athrow         
        //    81: astore          5
        //    83: aload           5
        //    85: athrow         
        //    86: iconst_0       
        //    87: istore          7
        //    89: goto            57
        //    92: astore          8
        //    94: aload           8
        //    96: athrow         
        //    97: aload           4
        //    99: putstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   102: aload_0        
        //   103: invokevirtual   com/whatsapp/ChangeNumber.getApplication:()Landroid/app/Application;
        //   106: invokestatic    com/whatsapp/App.r:(Landroid/content/Context;)V
        //   109: invokestatic    com/whatsapp/App.a8:()V
        //   112: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   115: invokestatic    com/whatsapp/messaging/MessageService.b:(Landroid/content/Context;)V
        //   118: invokestatic    com/whatsapp/App.at:()V
        //   121: aload_0        
        //   122: iconst_3       
        //   123: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;I)V
        //   126: invokestatic    com/whatsapp/al5.u:()Z
        //   129: pop            
        //   130: aload_0        
        //   131: invokestatic    com/whatsapp/ChangeNumber.c:(Landroid/content/Context;)V
        //   134: aload_0        
        //   135: invokevirtual   com/whatsapp/ChangeNumber.finish:()V
        //   138: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      10     75     78     Ljava/lang/NullPointerException;
        //  14     25     78     81     Ljava/lang/NullPointerException;
        //  31     49     81     86     Ljava/lang/NullPointerException;
        //  57     74     92     97     Ljava/lang/NullPointerException;
        //  76     78     78     81     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 67, Size: 67
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
    protected void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //     3: bipush          8
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   com/whatsapp/EnterPhoneNumber.onCreate:(Landroid/os/Bundle;)V
        //    14: aload_0        
        //    15: invokevirtual   com/whatsapp/ChangeNumber.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    18: iconst_1       
        //    19: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    22: aload_0        
        //    23: invokevirtual   com/whatsapp/ChangeNumber.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    26: iconst_1       
        //    27: invokevirtual   android/support/v7/app/ActionBar.setDisplayShowCustomEnabled:(Z)V
        //    30: aload_0        
        //    31: aload_0        
        //    32: invokevirtual   com/whatsapp/ChangeNumber.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    35: ldc_w           2130903090
        //    38: aconst_null    
        //    39: iconst_0       
        //    40: iconst_2       
        //    41: newarray        I
        //    43: dup            
        //    44: iconst_0       
        //    45: ldc_w           2131755346
        //    48: iastore        
        //    49: dup            
        //    50: iconst_1       
        //    51: ldc_w           2131755350
        //    54: iastore        
        //    55: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z[I)Landroid/view/View;
        //    58: invokevirtual   com/whatsapp/ChangeNumber.setContentView:(Landroid/view/View;)V
        //    61: aload_0        
        //    62: new             Lcom/whatsapp/tw;
        //    65: dup            
        //    66: invokespecial   com/whatsapp/tw.<init>:()V
        //    69: putfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //    72: aload_0        
        //    73: new             Lcom/whatsapp/tw;
        //    76: dup            
        //    77: invokespecial   com/whatsapp/tw.<init>:()V
        //    80: putfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //    83: aload_0        
        //    84: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //    87: aload_0        
        //    88: ldc_w           2131755347
        //    91: invokevirtual   com/whatsapp/ChangeNumber.findViewById:(I)Landroid/view/View;
        //    94: checkcast       Landroid/widget/EditText;
        //    97: putfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   100: aload_0        
        //   101: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   104: aload_0        
        //   105: ldc_w           2131755351
        //   108: invokevirtual   com/whatsapp/ChangeNumber.findViewById:(I)Landroid/view/View;
        //   111: checkcast       Landroid/widget/EditText;
        //   114: putfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   117: aload_0        
        //   118: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   121: aload_0        
        //   122: ldc_w           2131755348
        //   125: invokevirtual   com/whatsapp/ChangeNumber.findViewById:(I)Landroid/view/View;
        //   128: checkcast       Landroid/widget/EditText;
        //   131: putfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   134: aload_0        
        //   135: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   138: aload_0        
        //   139: ldc_w           2131755352
        //   142: invokevirtual   com/whatsapp/ChangeNumber.findViewById:(I)Landroid/view/View;
        //   145: checkcast       Landroid/widget/EditText;
        //   148: putfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   151: iconst_1       
        //   152: anewarray       Landroid/text/InputFilter;
        //   155: astore_2       
        //   156: aload_2        
        //   157: iconst_0       
        //   158: new             Landroid/text/InputFilter$LengthFilter;
        //   161: dup            
        //   162: iconst_3       
        //   163: invokespecial   android/text/InputFilter$LengthFilter.<init>:(I)V
        //   166: aastore        
        //   167: aload_0        
        //   168: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   171: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   174: aload_2        
        //   175: invokevirtual   android/widget/EditText.setFilters:([Landroid/text/InputFilter;)V
        //   178: iconst_1       
        //   179: anewarray       Landroid/text/InputFilter;
        //   182: astore_3       
        //   183: aload_3        
        //   184: iconst_0       
        //   185: new             Landroid/text/InputFilter$LengthFilter;
        //   188: dup            
        //   189: bipush          17
        //   191: invokespecial   android/text/InputFilter$LengthFilter.<init>:(I)V
        //   194: aastore        
        //   195: aload_0        
        //   196: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   199: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   202: aload_3        
        //   203: invokevirtual   android/widget/EditText.setFilters:([Landroid/text/InputFilter;)V
        //   206: getstatic       com/whatsapp/App.h:Landroid/telephony/TelephonyManager;
        //   209: invokevirtual   android/telephony/TelephonyManager.getNetworkCountryIso:()Ljava/lang/String;
        //   212: astore          4
        //   214: aload           4
        //   216: ifnull          227
        //   219: aload           4
        //   221: invokestatic    com/whatsapp/vi.c:(Ljava/lang/String;)Ljava/lang/String;
        //   224: putstatic       com/whatsapp/ChangeNumber.J:Ljava/lang/String;
        //   227: aload_0        
        //   228: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   231: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   234: new             Lcom/whatsapp/gz;
        //   237: dup            
        //   238: aload_0        
        //   239: aload_0        
        //   240: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   243: invokespecial   com/whatsapp/gz.<init>:(Lcom/whatsapp/ChangeNumber;Lcom/whatsapp/tw;)V
        //   246: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   249: aload_0        
        //   250: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   253: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   256: new             Lcom/whatsapp/gz;
        //   259: dup            
        //   260: aload_0        
        //   261: aload_0        
        //   262: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   265: invokespecial   com/whatsapp/gz.<init>:(Lcom/whatsapp/ChangeNumber;Lcom/whatsapp/tw;)V
        //   268: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   271: aload_0        
        //   272: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   275: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   278: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   281: pop            
        //   282: aload_0        
        //   283: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   286: aload_0        
        //   287: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   290: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   293: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //   296: putfield        com/whatsapp/tw.h:I
        //   299: aload_0        
        //   300: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   303: aload_0        
        //   304: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   307: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   310: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //   313: putfield        com/whatsapp/tw.e:I
        //   316: aload_0        
        //   317: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   320: aload_0        
        //   321: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   324: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   327: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //   330: putfield        com/whatsapp/tw.h:I
        //   333: aload_0        
        //   334: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   337: aload_0        
        //   338: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   341: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   344: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //   347: putfield        com/whatsapp/tw.e:I
        //   350: aload_0        
        //   351: aload_0        
        //   352: invokevirtual   com/whatsapp/ChangeNumber.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   355: aload_0        
        //   356: ldc_w           2131231038
        //   359: invokevirtual   com/whatsapp/ChangeNumber.getString:(I)Ljava/lang/String;
        //   362: invokevirtual   java/lang/String.toUpperCase:()Ljava/lang/String;
        //   365: new             Lcom/whatsapp/a09;
        //   368: dup            
        //   369: aload_0        
        //   370: invokespecial   com/whatsapp/a09.<init>:(Lcom/whatsapp/ChangeNumber;)V
        //   373: invokestatic    com/whatsapp/a81.a:(Landroid/app/Activity;Landroid/support/v7/app/ActionBar;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;
        //   376: pop            
        //   377: getstatic       com/whatsapp/ChangeNumber.J:Ljava/lang/String;
        //   380: ifnull          409
        //   383: aload_0        
        //   384: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   387: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   390: getstatic       com/whatsapp/ChangeNumber.J:Ljava/lang/String;
        //   393: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   396: aload_0        
        //   397: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   400: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   403: getstatic       com/whatsapp/ChangeNumber.J:Ljava/lang/String;
        //   406: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   409: aload_0        
        //   410: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   413: getfield        com/whatsapp/tw.b:Ljava/lang/String;
        //   416: astore          8
        //   418: aload           8
        //   420: ifnull          499
        //   423: aload           8
        //   425: invokevirtual   java/lang/String.length:()I
        //   428: istore          11
        //   430: iload           11
        //   432: ifle            499
        //   435: new             Ljava/lang/StringBuilder;
        //   438: dup            
        //   439: invokespecial   java/lang/StringBuilder.<init>:()V
        //   442: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   445: bipush          11
        //   447: aaload         
        //   448: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   451: aload           8
        //   453: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   456: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   459: bipush          10
        //   461: aaload         
        //   462: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   465: aload           8
        //   467: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //   470: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   473: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   476: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   479: aload_0        
        //   480: aload           8
        //   482: aload_0        
        //   483: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //   486: invokespecial   com/whatsapp/ChangeNumber.a:(Ljava/lang/String;Lcom/whatsapp/tw;)V
        //   489: aload_0        
        //   490: aload           8
        //   492: aload_0        
        //   493: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   496: invokespecial   com/whatsapp/ChangeNumber.a:(Ljava/lang/String;Lcom/whatsapp/tw;)V
        //   499: aload_0        
        //   500: aload_0        
        //   501: invokestatic    com/whatsapp/ChangeNumber.e:(Landroid/content/Context;)Ljava/lang/String;
        //   504: putfield        com/whatsapp/ChangeNumber.A:Ljava/lang/String;
        //   507: aload_0        
        //   508: aload_0        
        //   509: invokevirtual   com/whatsapp/ChangeNumber.f:()Z
        //   512: putfield        com/whatsapp/ChangeNumber.t:Z
        //   515: return         
        //   516: astore          14
        //   518: aload           14
        //   520: athrow         
        //   521: astore          13
        //   523: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   526: bipush          9
        //   528: aaload         
        //   529: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   532: goto            227
        //   535: astore          5
        //   537: aload           5
        //   539: athrow         
        //   540: astore          10
        //   542: aload           10
        //   544: athrow         
        //   545: astore          9
        //   547: aload           9
        //   549: athrow         
        //   550: astore          12
        //   552: new             Ljava/lang/StringBuilder;
        //   555: dup            
        //   556: invokespecial   java/lang/StringBuilder.<init>:()V
        //   559: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   562: bipush          13
        //   564: aaload         
        //   565: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   568: aload           8
        //   570: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   573: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //   576: bipush          12
        //   578: aaload         
        //   579: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   582: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   585: aload           12
        //   587: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   590: goto            479
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  219    227    521    535    Ljava/io/IOException;
        //  219    227    516    521    Ljava/lang/NullPointerException;
        //  227    409    535    540    Ljava/io/IOException;
        //  423    430    540    545    Ljava/io/IOException;
        //  423    430    545    550    Ljava/lang/NullPointerException;
        //  435    479    550    593    Ljava/io/IOException;
        //  435    479    545    550    Ljava/lang/NullPointerException;
        //  542    545    545    550    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 271, Size: 271
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
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231535));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 2: {
                return new AlertDialog$Builder((Context)this).setMessage(2131230883).setPositiveButton(2131230851, (DialogInterface$OnClickListener)new l9(this)).create();
            }
            case 109: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231569).setPositiveButton(2131230894, (DialogInterface$OnClickListener)new ry(this)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new lv(this)).create();
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        Log.i(ChangeNumber.P[23]);
        super.onDestroy();
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332: {
                    this.finish();
                    return true;
                }
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public void onPause() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/EnterPhoneNumber.onPause:()V
        //     4: getstatic       com/whatsapp/ChangeNumber.P:[Ljava/lang/String;
        //     7: iconst_1       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: aload_0        
        //    13: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //    16: aload_0        
        //    17: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //    20: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    23: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //    26: putfield        com/whatsapp/tw.h:I
        //    29: aload_0        
        //    30: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //    33: aload_0        
        //    34: getfield        com/whatsapp/ChangeNumber.H:Lcom/whatsapp/tw;
        //    37: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //    40: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //    43: putfield        com/whatsapp/tw.e:I
        //    46: aload_0        
        //    47: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //    50: aload_0        
        //    51: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //    54: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    57: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //    60: putfield        com/whatsapp/tw.h:I
        //    63: aload_0        
        //    64: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //    67: aload_0        
        //    68: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //    71: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //    74: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //    77: putfield        com/whatsapp/tw.e:I
        //    80: aload_0        
        //    81: invokestatic    com/whatsapp/ChangeNumber.e:(Landroid/content/Context;)Ljava/lang/String;
        //    84: astore_1       
        //    85: aload_0        
        //    86: getfield        com/whatsapp/ChangeNumber.A:Ljava/lang/String;
        //    89: astore          5
        //    91: aload           5
        //    93: ifnull          116
        //    96: aload_0        
        //    97: getstatic       com/whatsapp/ChangeNumber.z:Ljava/lang/String;
        //   100: getstatic       com/whatsapp/ChangeNumber.w:Ljava/lang/String;
        //   103: invokestatic    com/whatsapp/ChangeNumber.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
        //   106: getstatic       com/whatsapp/App.I:Z
        //   109: istore          6
        //   111: iload           6
        //   113: ifeq            124
        //   116: aload_1        
        //   117: ifnull          124
        //   120: aload_0        
        //   121: invokestatic    com/whatsapp/ChangeNumber.d:(Landroid/content/Context;)V
        //   124: return         
        //   125: astore_2       
        //   126: aload_2        
        //   127: athrow         
        //   128: astore_3       
        //   129: aload_3        
        //   130: athrow         
        //   131: astore          4
        //   133: aload           4
        //   135: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  85     91     125    128    Ljava/lang/NullPointerException;
        //  96     111    128    131    Ljava/lang/NullPointerException;
        //  120    124    131    136    Ljava/lang/NullPointerException;
        //  126    128    128    131    Ljava/lang/NullPointerException;
        //  129    131    131    136    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 64, Size: 64
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
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ChangeNumber.J = bundle.getString(ChangeNumber.P[6]);
        ChangeNumber.O = bundle.getString(ChangeNumber.P[7]);
        ChangeNumber.z = bundle.getString(ChangeNumber.P[4]);
        ChangeNumber.w = bundle.getString(ChangeNumber.P[5]);
    }
    
    @Override
    public void onResume() {
        try {
            super.onResume();
            if (ChangeNumber.J != null) {
                this.H.a.setText((CharSequence)ChangeNumber.J);
            }
            RegisterPhone.b(this.H.a, this.H.e);
            RegisterPhone.b(this.H.d, this.H.h);
            RegisterPhone.b(this.y.a, this.y.e);
            RegisterPhone.b(this.y.d, this.y.h);
            Log.i(ChangeNumber.P[39]);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(ChangeNumber.P[26], (CharSequence)ChangeNumber.J);
        bundle.putCharSequence(ChangeNumber.P[28], (CharSequence)ChangeNumber.O);
        bundle.putCharSequence(ChangeNumber.P[29], (CharSequence)ChangeNumber.z);
        bundle.putCharSequence(ChangeNumber.P[27], (CharSequence)ChangeNumber.w);
    }
}
