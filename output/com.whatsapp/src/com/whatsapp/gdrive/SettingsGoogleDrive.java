// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.view.KeyEvent;
import android.content.Context;
import com.whatsapp.SettingsChat;
import android.app.Dialog;
import android.os.Bundle;
import android.content.Intent;
import com.whatsapp.util.bm;
import android.content.ActivityNotFoundException;
import com.whatsapp.util.Log;
import com.whatsapp.aol;
import android.support.annotation.NonNull;
import com.whatsapp.gu;
import com.whatsapp.App;
import android.content.ServiceConnection;
import android.widget.ProgressBar;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.View;
import android.widget.Button;
import android.os.ConditionVariable;
import android.widget.TextView;
import com.whatsapp.DialogToastActivity;

public class SettingsGoogleDrive extends DialogToastActivity
{
    private static final String[] C;
    private TextView A;
    private GoogleDriveService B;
    private final ConditionVariable k;
    private Button l;
    private TextView m;
    private TextView n;
    private View o;
    private final cs p;
    private View q;
    private ImageView r;
    private String s;
    private View$OnClickListener t;
    private View$OnClickListener u;
    private TextView v;
    private View w;
    private String[] x;
    private ProgressBar y;
    private final ServiceConnection z;
    
    static {
        final String[] c = new String[45];
        String s = "ygH\u0001[wyY\u0007";
        int n = -1;
        String[] array = c;
        int n2 = 0;
        String intern = null;
    Label_1157:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '/';
                        break;
                    }
                    case 0: {
                        c3 = '\u0018';
                        break;
                    }
                    case 1: {
                        c3 = '\u0012';
                        break;
                    }
                    case 2: {
                        c3 = '<';
                        break;
                    }
                    case 3: {
                        c3 = 'i';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "ygH\u0001n{qS\u001cAl";
                    n2 = 1;
                    array = c;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "kwH\u001dFvuODH|`U\u001fJ7s_\u001dFn{H\u0010\u0002jwO\u001cCl2N\f^mwO\u001d\u00158";
                    n2 = 2;
                    array = c;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = c;
                    s = "kwH\u001dFvuODH|`U\u001fJ7s_\u001dFn{H\u0010\u0002jwO\u001cCl2]\nLwgR\u001d\u000fm|_\u0001NvuY\r\u00038fS\u0002Jv2N\fL}{J\fK8tS\u001b\u000f";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "8`Y\u001aZtf\u0006I";
                    n = 3;
                    array = c;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "ygH\u0001n{qS\u001cAl";
                    n = 4;
                    array = c;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "kwH\u001dFvuODH|`U\u001fJ7s_\u001dFn{H\u0010\u0002jwO\u001cCl2R\fX8s_\n@m|H'Nuw\u001c\u0000\\8";
                    n = 5;
                    array = c;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "kwH\u001dFvuODH|`U\u001fJ7sI\u001dG5`Y\u0018Z}aHIN{qS\u001cAl2^\fFvu\u001c\u001c\\}v\u001c\u0000\\8";
                    n = 6;
                    array = c;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "kwH\u001dFvuODH|`U\u001fJ7sI\u001dG5`Y\u0018Z}aHIMt}_\u0002Fvu\u001c\u0006A8fS\u0002Jv@Y\nJqdY\r";
                    n = 7;
                    array = c;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "kwH\u001dFvuODH|`U\u001fJ7`Y\u001aZuw";
                    n = 8;
                    array = c;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "maY\u001bpq|U\u001dFyfY\r";
                    n = 9;
                    array = c;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "yqH\u0000@vM^\bLsgL";
                    n = 10;
                    array = c;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "kwH\u001dFvuODH|`U\u001fJ7bY\u001bIw`QDMyqW\u001c_7s_\n@m|HFAm~PG";
                    n = 11;
                    array = c;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "lkL\f";
                    n = 12;
                    array = c;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "kwH\u001dFvuODH|`U\u001fJ7bY\u001bIw`QDMyqW\u001c_7`Y\u001a[w`YDB}vU\b\u0000jgR\u0007Fvu";
                    n = 13;
                    array = c;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u007fvN\u0000Y}?O\f]n{_\f\u0000hwN\u000f@j\u007f\u0011\u000bN{yI\u0019\u0000m|W\u0007@o|\u0011\u0007JleS\u001bD5fE\u0019J7";
                    n = 14;
                    array = c;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "kwH\u001dFvuODH|`U\u001fJ7bY\u001bIw`QDMyqW\u001c_7p]\nDmb\u0013\u0019JvvU\u0007H";
                    n = 15;
                    array = c;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "maY\u001bpq|U\u001dFyfY\r";
                    n = 16;
                    array = c;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    s = "kwH\u001dFvuODH|`U\u001fJ7bY\u001bIw`QDMyqW\u001c_7|SDKyf]DLw|R\fLl{S\u0007";
                    n = 17;
                    n2 = 18;
                    array = c;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    array = c;
                    s = "kwH\u001dFvuODH|`U\u001fJ7bY\u001bIw`QDMyqW\u001c_7`Y\u001a[w`YDB}vU\b\u0000hwR\rFvu";
                    n = 18;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "yqH\u0000@vM^\bLsgL";
                    n = 19;
                    array = c;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "lkL\f";
                    n = 20;
                    array = c;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "kwH\u001dFvuODH|`U\u001fJ7bY\u001bIw`QDMyqW\u001c_7aH\b]l?[\r]qdYDMyqW\u001c_";
                    n = 21;
                    array = c;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "kwH\u001dFvuODH|`U\u001fJ7s_\n@m|HD\\}~Y\n[w`\u0013\u000bN{yI\u0019\u0000jgR\u0007Fvu";
                    n = 22;
                    array = c;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    s = "{}QGHw}[\u0005J";
                    n = 23;
                    n2 = 24;
                    array = c;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    array = c;
                    s = "kwH\u001dFvuODH|`U\u001fJ7s_\n@m|HD\\}~Y\n[w`\u001c\u001cAypP\f\u000fl}\u001c\u001a[y`HIN{qS\u001cAl2L\u0000LswNINvv\u001c\bK|{H\u0000@vsP\u0005V42\u001c\u001cAypP\f\u000fl}\u001c\u001aGwe\u001c\bAa2N\fC}d]\u0007[8wN\u001b@j2Q\f\\ks[\f\u000f~`S\u0004\u000f_}S\u000eC}2l\u0005Na2O\f]n{_\f\\6";
                    n = 24;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "kwH\u001dFvuODH|`U\u001fJ7s_\n@m|HD\\}~Y\n[w`\u001c\u001cAypP\f\u000fl}\u001c\u001a[y`HIhw}[\u0005J8S_\n@m|HI_qqW\f]6";
                    n = 25;
                    array = c;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "kwH\u001dFvuODH|`U\u001fJ7s_\n@m|HD\\}~Y\n[w`\u0013\u001bJkfS\u001bJ7`I\u0007Aq|[";
                    n = 26;
                    array = c;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "{}QGHw}[\u0005J";
                    n = 27;
                    array = c;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "kwH\u001dFvuODH|`U\u001fJ7vU\u001a_tsEDMyqW\u001c_5wN\u001b@j=I\u0007Gy|X\u0005J|?Y\u001b]w`\u0013";
                    n = 28;
                    array = c;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "kwH\u001dFvuODH|`U\u001fJ7vU\u001a_tsEDMyqW\u001c_5wN\u001b@j=";
                    n = 29;
                    array = c;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "8aU\u0007L}2}\n[qdU\u001dV8{OINz}I\u001d\u000fl}\u001c\u000fFv{O\u0001\u0001";
                    n = 30;
                    array = c;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "kwH\u001dFvuODH|`U\u001fJ7vU\u001a_tsEDMyqW\u001c_5wN\u001b@j2Z\bFtwXI[w2X\u0000\\h~]\u0010\u000f}`N\u0006]8";
                    n = 31;
                    array = c;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "kwH\u001dFvuODH|`U\u001fJ7qN\fNlw";
                    n = 32;
                    array = c;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u007fvN\u0000Y}?O\f[l{R\u000e\\7qN\fNlw\u001c\u000e@wuP\f\u000f|`U\u001fJ8s_\nJka\u001c\u0007@l2]\u0005CweY\r\u0001";
                    n = 33;
                    array = c;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "kwH\u001dFvuODH|`U\u001fJ7vU\u001a_tsEDB}vU\b\u0002jwO\u001d@jw\u0011\f]j}NF";
                    n = 34;
                    array = c;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "8vS\u001eAt}]\rJ|2_\bAv}HIM}2Q\u0006]}2H\u0001Nv2H\u0006[y~\u0012";
                    n = 35;
                    array = c;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "kwH\u001dFvuODH|`U\u001fJ7vU\u001a_tsEDB}vU\b\u0002jwO\u001d@jw\u0011\f]j}NF";
                    n = 36;
                    array = c;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "kwH\u001dFvuODH|`U\u001fJ7vU\u001a_tsEDB}vU\b\u0002jwO\u001d@jw\u0011\f]j}NIIy{P\fK8fSIKqaL\u0005Na2Y\u001b]w`\u001c";
                    n = 37;
                    array = c;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "8aU\u0007L}2}\n[qdU\u001dV8{OINz}I\u001d\u000fl}\u001c\u000fFv{O\u0001\u0001";
                    n = 38;
                    array = c;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "kwH\u001dFvuODH|`U\u001fJ7vU\u001a_tsEDB}vU\b\u0002jwO\u001d@jw\u0011\f]j}NFZvz]\u0007KtwXDJj`S\u001b\u0000";
                    n = 39;
                    array = c;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "8fS\u001dNt(\u001c";
                    n = 40;
                    array = c;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "kwH\u001dFvuODH|`U\u001fJ7vU\u001a_tsEDB}vU\b\u0002jwO\u001d@jw\u0011\f]j}NFZvwD\u0019J{fY\r\u0000";
                    n = 41;
                    array = c;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "8vS\u001eAt}]\rK\"2";
                    n = 42;
                    array = c;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "kwH\u001dFvuODH|`U\u001fJ7uY\u001d\u0002zs_\u0002Zh?Z\u001bJi?U\u0007K}j\u0013";
                    n = 43;
                    array = c;
                    continue;
                }
                case 43: {
                    break Label_1157;
                }
            }
        }
        array[n2] = intern;
        C = c;
    }
    
    public SettingsGoogleDrive() {
        this.k = new ConditionVariable(false);
        this.B = null;
        this.p = new b0(this);
        this.z = (ServiceConnection)new c6(this);
    }
    
    static ConditionVariable a(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.k;
    }
    
    static GoogleDriveService a(final SettingsGoogleDrive settingsGoogleDrive, final GoogleDriveService b) {
        return settingsGoogleDrive.B = b;
    }
    
    static String a(final SettingsGoogleDrive settingsGoogleDrive, final String s) {
        return settingsGoogleDrive.s = s;
    }
    
    public static void a() {
        final gu aj = App.aj();
        if (aj instanceof SettingsGoogleDrive) {
            ((SettingsGoogleDrive)aj).h();
        }
    }
    
    static void a(final SettingsGoogleDrive settingsGoogleDrive, final int n) {
        settingsGoogleDrive.d(n);
    }
    
    private boolean a(@NonNull final String s) {
        while (true) {
            try {
                aol.b();
                Log.i(SettingsGoogleDrive.C[7] + a7.a(s));
                if (s == null) {
                    return false;
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
            try {
                this.k.close();
                bm.a(new ac(this, s));
                Log.i(SettingsGoogleDrive.C[8]);
                this.k.block(100000L);
                if (this.s != null) {
                    return true;
                }
                return false;
            }
            catch (ActivityNotFoundException ex2) {
                throw ex2;
            }
        }
    }
    
    static View b(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.w;
    }
    
    static void b(final SettingsGoogleDrive settingsGoogleDrive, final int n) {
        settingsGoogleDrive.e(n);
    }
    
    static boolean b(final SettingsGoogleDrive settingsGoogleDrive, final String s) {
        return settingsGoogleDrive.a(s);
    }
    
    static ProgressBar c(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.y;
    }
    
    private boolean c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     5: istore_2       
        //     6: invokestatic    com/whatsapp/aol.a:()V
        //     9: aload_0        
        //    10: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //    13: istore          4
        //    15: iload           4
        //    17: ifeq            27
        //    20: iconst_0       
        //    21: istore_1       
        //    22: iload_1        
        //    23: ireturn        
        //    24: astore_3       
        //    25: aload_3        
        //    26: athrow         
        //    27: invokestatic    com/whatsapp/gdrive/GoogleDriveService.P:()Z
        //    30: ifeq            76
        //    33: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    36: bipush          23
        //    38: aaload         
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: new             Landroid/support/v7/app/AlertDialog$Builder;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //    50: ldc             2131232127
        //    52: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //    55: ldc_w           2131232130
        //    58: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //    61: ldc_w           2131231435
        //    64: aconst_null    
        //    65: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //    68: invokevirtual   android/support/v7/app/AlertDialog$Builder.show:()Landroid/support/v7/app/AlertDialog;
        //    71: pop            
        //    72: iload_2        
        //    73: ifeq            22
        //    76: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //    79: istore          8
        //    81: iload           8
        //    83: ifeq            129
        //    86: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    89: bipush          27
        //    91: aaload         
        //    92: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    95: new             Landroid/support/v7/app/AlertDialog$Builder;
        //    98: dup            
        //    99: aload_0        
        //   100: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   103: ldc             2131232127
        //   105: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   108: ldc_w           2131232131
        //   111: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   114: ldc_w           2131231435
        //   117: aconst_null    
        //   118: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   121: invokevirtual   android/support/v7/app/AlertDialog$Builder.show:()Landroid/support/v7/app/AlertDialog;
        //   124: pop            
        //   125: iload_2        
        //   126: ifeq            22
        //   129: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //   132: astore          9
        //   134: aload           9
        //   136: ifnull          265
        //   139: new             Landroid/accounts/Account;
        //   142: dup            
        //   143: aload           9
        //   145: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   148: bipush          28
        //   150: aaload         
        //   151: invokespecial   android/accounts/Account.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   154: astore          10
        //   156: iload_1        
        //   157: anewarray       Ljava/lang/String;
        //   160: astore          11
        //   162: aload           11
        //   164: iconst_0       
        //   165: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   168: bipush          24
        //   170: aaload         
        //   171: aastore        
        //   172: aload           10
        //   174: aconst_null    
        //   175: aload           11
        //   177: iload_1        
        //   178: aconst_null    
        //   179: aconst_null    
        //   180: aconst_null    
        //   181: aconst_null    
        //   182: invokestatic    com/google/android/gms/common/AccountPicker.newChooseAccountIntent:(Landroid/accounts/Account;Ljava/util/ArrayList;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
        //   185: astore          12
        //   187: aload_0        
        //   188: aload           12
        //   190: iconst_2       
        //   191: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.startActivityForResult:(Landroid/content/Intent;I)V
        //   194: iload_1        
        //   195: ireturn        
        //   196: astore          13
        //   198: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   201: bipush          26
        //   203: aaload         
        //   204: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   207: aload_0        
        //   208: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.isGooglePlayServicesAvailable:(Landroid/content/Context;)I
        //   211: aload_0        
        //   212: iconst_0       
        //   213: aconst_null    
        //   214: iload_1        
        //   215: invokestatic    com/whatsapp/gdrive/a7.a:(ILandroid/app/Activity;ILandroid/content/DialogInterface$OnCancelListener;Z)Landroid/app/Dialog;
        //   218: astore          14
        //   220: aload           14
        //   222: ifnonnull       238
        //   225: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   228: bipush          25
        //   230: aaload         
        //   231: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   234: iload_2        
        //   235: ifeq            243
        //   238: aload           14
        //   240: invokevirtual   android/app/Dialog.show:()V
        //   243: iconst_0       
        //   244: ireturn        
        //   245: astore          5
        //   247: aload           5
        //   249: athrow         
        //   250: astore          6
        //   252: aload           6
        //   254: athrow         
        //   255: astore          7
        //   257: aload           7
        //   259: athrow         
        //   260: astore          15
        //   262: aload           15
        //   264: athrow         
        //   265: aconst_null    
        //   266: astore          10
        //   268: goto            156
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  6      15     24     27     Landroid/content/ActivityNotFoundException;
        //  27     72     245    250    Landroid/content/ActivityNotFoundException;
        //  76     81     250    255    Landroid/content/ActivityNotFoundException;
        //  86     125    255    260    Landroid/content/ActivityNotFoundException;
        //  187    194    196    245    Landroid/content/ActivityNotFoundException;
        //  225    234    260    265    Landroid/content/ActivityNotFoundException;
        //  238    243    260    265    Landroid/content/ActivityNotFoundException;
        //  247    250    250    255    Landroid/content/ActivityNotFoundException;
        //  252    255    255    260    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 138, Size: 138
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
    
    private int d() {
        final int f = GoogleDriveService.F;
        final int ae = GoogleDriveService.ae();
        final String[] stringArray = this.getResources().getStringArray(2131689482);
        int i = 0;
        while (i < stringArray.length) {
            try {
                if (Integer.parseInt(stringArray[i]) == ae) {
                    return i;
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
            ++i;
            if (f != 0) {
                break;
            }
        }
        Log.e(SettingsGoogleDrive.C[44] + ae);
        return 0;
    }
    
    static cs d(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.p;
    }
    
    private void d(@ct final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: lconst_0       
        //     1: lstore_2       
        //     2: aconst_null    
        //     3: astore          4
        //     5: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     8: istore          5
        //    10: invokestatic    com/whatsapp/aol.a:()V
        //    13: iload_1        
        //    14: tableswitch {
        //               20: 255
        //               21: 298
        //               22: 260
        //               23: 320
        //               24: 351
        //               25: 373
        //          default: 52
        //        }
        //    52: new             Ljava/lang/StringBuilder;
        //    55: dup            
        //    56: invokespecial   java/lang/StringBuilder.<init>:()V
        //    59: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    62: bipush          40
        //    64: aaload         
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: iload_1        
        //    69: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    72: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    75: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    78: aconst_null    
        //    79: astore          9
        //    81: aload_0        
        //    82: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //    85: ifne            219
        //    88: new             Ljava/lang/StringBuilder;
        //    91: dup            
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    98: bipush          37
        //   100: aaload         
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: iload_1        
        //   105: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   108: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   111: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   114: aload_0        
        //   115: ldc_w           2131755196
        //   118: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   121: astore          11
        //   123: aload_0        
        //   124: ldc_w           2131755197
        //   127: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   130: astore          12
        //   132: aload           12
        //   134: aload           9
        //   136: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   139: aload           9
        //   141: ifnull          155
        //   144: aload           12
        //   146: iconst_1       
        //   147: invokevirtual   android/view/View.setClickable:(Z)V
        //   150: iload           5
        //   152: ifeq            161
        //   155: aload           12
        //   157: iconst_0       
        //   158: invokevirtual   android/view/View.setClickable:(Z)V
        //   161: aload           4
        //   163: ifnull          207
        //   166: aload           11
        //   168: iconst_0       
        //   169: invokevirtual   android/view/View.setVisibility:(I)V
        //   172: aload_0        
        //   173: ldc_w           2131755199
        //   176: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   179: checkcast       Landroid/widget/TextView;
        //   182: astore          16
        //   184: aload           16
        //   186: aload           4
        //   188: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   191: aload_0        
        //   192: ldc_w           2131755200
        //   195: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   198: iconst_4       
        //   199: invokevirtual   android/view/View.setVisibility:(I)V
        //   202: iload           5
        //   204: ifeq            214
        //   207: aload           11
        //   209: bipush          8
        //   211: invokevirtual   android/view/View.setVisibility:(I)V
        //   214: iload           5
        //   216: ifeq            254
        //   219: new             Ljava/lang/StringBuilder;
        //   222: dup            
        //   223: invokespecial   java/lang/StringBuilder.<init>:()V
        //   226: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   229: bipush          38
        //   231: aaload         
        //   232: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   235: iload_1        
        //   236: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   239: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   242: bipush          39
        //   244: aaload         
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   251: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   254: return         
        //   255: iload           5
        //   257: ifeq            78
        //   260: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //   263: astore          17
        //   265: aload_0        
        //   266: ldc_w           2131232037
        //   269: iconst_1       
        //   270: anewarray       Ljava/lang/Object;
        //   273: dup            
        //   274: iconst_0       
        //   275: aload           17
        //   277: aastore        
        //   278: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   281: astore          4
        //   283: new             Lcom/whatsapp/gdrive/c8;
        //   286: dup            
        //   287: aload_0        
        //   288: aload           17
        //   290: invokespecial   com/whatsapp/gdrive/c8.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;Ljava/lang/String;)V
        //   293: astore          9
        //   295: goto            81
        //   298: aload_0        
        //   299: ldc_w           2131232038
        //   302: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   305: astore          4
        //   307: new             Lcom/whatsapp/gdrive/s;
        //   310: dup            
        //   311: aload_0        
        //   312: invokespecial   com/whatsapp/gdrive/s.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;)V
        //   315: astore          9
        //   317: goto            81
        //   320: new             Ljava/lang/StringBuilder;
        //   323: dup            
        //   324: invokespecial   java/lang/StringBuilder.<init>:()V
        //   327: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   330: bipush          42
        //   332: aaload         
        //   333: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   336: iload_1        
        //   337: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   340: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   343: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   346: iload           5
        //   348: ifeq            78
        //   351: aload_0        
        //   352: ldc_w           2131232040
        //   355: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   358: astore          4
        //   360: new             Lcom/whatsapp/gdrive/ak;
        //   363: dup            
        //   364: aload_0        
        //   365: invokespecial   com/whatsapp/gdrive/ak.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;)V
        //   368: astore          9
        //   370: goto            81
        //   373: aload_0        
        //   374: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.B:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   377: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.r:()J
        //   380: aload_0        
        //   381: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.B:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   384: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.s:()J
        //   387: lsub           
        //   388: lstore          6
        //   390: lload           6
        //   392: lload_2        
        //   393: lcmp           
        //   394: ifge            522
        //   397: new             Ljava/lang/StringBuilder;
        //   400: dup            
        //   401: invokespecial   java/lang/StringBuilder.<init>:()V
        //   404: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   407: bipush          35
        //   409: aaload         
        //   410: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   413: iload_1        
        //   414: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   417: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   420: bipush          41
        //   422: aaload         
        //   423: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   426: aload_0        
        //   427: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.B:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   430: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.r:()J
        //   433: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   436: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   439: bipush          43
        //   441: aaload         
        //   442: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   445: aload_0        
        //   446: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.B:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   449: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.s:()J
        //   452: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   455: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   458: bipush          36
        //   460: aaload         
        //   461: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   464: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   467: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   470: iconst_1       
        //   471: anewarray       Ljava/lang/Object;
        //   474: astore          8
        //   476: aload           8
        //   478: iconst_0       
        //   479: aload_0        
        //   480: lload_2        
        //   481: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   484: aastore        
        //   485: aload_0        
        //   486: ldc_w           2131232039
        //   489: aload           8
        //   491: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   494: astore          4
        //   496: aconst_null    
        //   497: astore          9
        //   499: goto            81
        //   502: astore          13
        //   504: aload           13
        //   506: athrow         
        //   507: astore          14
        //   509: aload           14
        //   511: athrow         
        //   512: astore          15
        //   514: aload           15
        //   516: athrow         
        //   517: astore          10
        //   519: aload           10
        //   521: athrow         
        //   522: lload           6
        //   524: lstore_2       
        //   525: goto            470
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  132    139    502    507    Landroid/content/ActivityNotFoundException;
        //  144    150    507    512    Landroid/content/ActivityNotFoundException;
        //  155    161    507    512    Landroid/content/ActivityNotFoundException;
        //  184    202    512    517    Landroid/content/ActivityNotFoundException;
        //  207    214    512    517    Landroid/content/ActivityNotFoundException;
        //  219    254    517    522    Landroid/content/ActivityNotFoundException;
        //  504    507    507    512    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 227, Size: 227
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
    
    static TextView e(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.A;
    }
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: invokestatic    com/whatsapp/gdrive/GoogleDriveService.am:()Z
        //     7: istore_3       
        //     8: iload_3        
        //     9: ifne            16
        //    12: return         
        //    13: astore_2       
        //    14: aload_2        
        //    15: athrow         
        //    16: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //    19: astore          6
        //    21: aload           6
        //    23: ifnonnull       83
        //    26: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    29: bipush          12
        //    31: aaload         
        //    32: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    35: aload_0        
        //    36: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //    39: ifne            12
        //    42: new             Landroid/support/v7/app/AlertDialog$Builder;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //    50: ldc_w           2131231993
        //    53: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //    56: ldc             2131232127
        //    58: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //    61: ldc_w           2131231435
        //    64: aconst_null    
        //    65: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //    68: invokevirtual   android/support/v7/app/AlertDialog$Builder.show:()Landroid/support/v7/app/AlertDialog;
        //    71: pop            
        //    72: return         
        //    73: astore          5
        //    75: aload           5
        //    77: athrow         
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    83: invokestatic    com/whatsapp/gdrive/GoogleDriveService.P:()Z
        //    86: istore          15
        //    88: iload           15
        //    90: ifeq            150
        //    93: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    96: bipush          16
        //    98: aaload         
        //    99: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   102: aload_0        
        //   103: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //   106: istore          49
        //   108: iload           49
        //   110: ifne            12
        //   113: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   116: dup            
        //   117: aload_0        
        //   118: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   121: ldc_w           2131232099
        //   124: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   127: ldc_w           2131232098
        //   130: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   133: ldc_w           2131231435
        //   136: aconst_null    
        //   137: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   140: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   143: invokevirtual   android/support/v7/app/AlertDialog.show:()V
        //   146: iload_1        
        //   147: ifeq            12
        //   150: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //   153: istore          16
        //   155: iload           16
        //   157: ifeq            280
        //   160: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   163: bipush          14
        //   165: aaload         
        //   166: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   169: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //   172: istore          47
        //   174: iload           47
        //   176: ifeq            227
        //   179: aload_0        
        //   180: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //   183: istore          48
        //   185: iload           48
        //   187: ifne            12
        //   190: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   193: dup            
        //   194: aload_0        
        //   195: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   198: ldc_w           2131232139
        //   201: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   204: ldc_w           2131232138
        //   207: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   210: ldc_w           2131231435
        //   213: aconst_null    
        //   214: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   217: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   220: invokevirtual   android/support/v7/app/AlertDialog.show:()V
        //   223: iload_1        
        //   224: ifeq            12
        //   227: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   230: bipush          19
        //   232: aaload         
        //   233: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   236: aload_0        
        //   237: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //   240: ifne            12
        //   243: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   246: dup            
        //   247: aload_0        
        //   248: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   251: ldc_w           2131232139
        //   254: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   257: ldc_w           2131232138
        //   260: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   263: ldc_w           2131231435
        //   266: aconst_null    
        //   267: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   270: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   273: invokevirtual   android/support/v7/app/AlertDialog.show:()V
        //   276: iload_1        
        //   277: ifeq            12
        //   280: invokestatic    com/whatsapp/gdrive/GoogleDriveService.y:()I
        //   283: istore          17
        //   285: invokestatic    com/whatsapp/App.j:()I
        //   288: istore          18
        //   290: iload           18
        //   292: ifne            371
        //   295: aload_0        
        //   296: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //   299: istore          41
        //   301: iload           41
        //   303: ifne            12
        //   306: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   309: dup            
        //   310: aload_0        
        //   311: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   314: astore          42
        //   316: iload           17
        //   318: ifne            736
        //   321: ldc_w           2131232128
        //   324: istore          43
        //   326: aload           42
        //   328: iload           43
        //   330: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   333: ldc_w           2131231435
        //   336: aconst_null    
        //   337: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   340: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   343: invokevirtual   android/support/v7/app/AlertDialog.show:()V
        //   346: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   349: bipush          18
        //   351: aaload         
        //   352: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   355: aload_0        
        //   356: new             Lcom/whatsapp/gdrive/ar;
        //   359: dup            
        //   360: aload_0        
        //   361: invokespecial   com/whatsapp/gdrive/ar.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;)V
        //   364: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.runOnUiThread:(Ljava/lang/Runnable;)V
        //   367: iload_1        
        //   368: ifeq            12
        //   371: iload           18
        //   373: iconst_3       
        //   374: if_icmpne       473
        //   377: iload           17
        //   379: ifne            759
        //   382: ldc_w           2131232022
        //   385: istore          30
        //   387: aload_0        
        //   388: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //   391: ifne            420
        //   394: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   397: dup            
        //   398: aload_0        
        //   399: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   402: iload           30
        //   404: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   407: ldc_w           2131231435
        //   410: aconst_null    
        //   411: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   414: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   417: invokevirtual   android/support/v7/app/AlertDialog.show:()V
        //   420: new             Landroid/content/Intent;
        //   423: dup            
        //   424: aload_0        
        //   425: ldc             Lcom/whatsapp/gdrive/GoogleDriveService;.class
        //   427: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   430: astore          32
        //   432: aload           32
        //   434: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   437: bipush          20
        //   439: aaload         
        //   440: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   443: pop            
        //   444: aload           32
        //   446: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   449: bipush          13
        //   451: aaload         
        //   452: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   455: bipush          17
        //   457: aaload         
        //   458: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   461: pop            
        //   462: aload_0        
        //   463: aload           32
        //   465: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
        //   468: pop            
        //   469: iload_1        
        //   470: ifeq            12
        //   473: iload           18
        //   475: iconst_2       
        //   476: if_icmpne       553
        //   479: iload           17
        //   481: ifne            553
        //   484: aload_0        
        //   485: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //   488: istore          29
        //   490: iload           29
        //   492: ifne            12
        //   495: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   498: dup            
        //   499: aload_0        
        //   500: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   503: ldc_w           2131232143
        //   506: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   509: ldc_w           2131232021
        //   512: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   515: ldc_w           2131230874
        //   518: new             Lcom/whatsapp/gdrive/bt;
        //   521: dup            
        //   522: aload_0        
        //   523: invokespecial   com/whatsapp/gdrive/bt.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;)V
        //   526: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   529: ldc_w           2131232019
        //   532: new             Lcom/whatsapp/gdrive/b8;
        //   535: dup            
        //   536: aload_0        
        //   537: invokespecial   com/whatsapp/gdrive/b8.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;)V
        //   540: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   543: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   546: invokevirtual   android/support/v7/app/AlertDialog.show:()V
        //   549: iload_1        
        //   550: ifeq            12
        //   553: iload           18
        //   555: iconst_1       
        //   556: if_icmpeq       571
        //   559: iload           18
        //   561: iconst_2       
        //   562: if_icmpne       653
        //   565: iload           17
        //   567: iconst_1       
        //   568: if_icmpne       653
        //   571: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   574: bipush          22
        //   576: aaload         
        //   577: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   580: new             Landroid/content/Intent;
        //   583: dup            
        //   584: aload_0        
        //   585: ldc             Lcom/whatsapp/gdrive/GoogleDriveService;.class
        //   587: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   590: astore          19
        //   592: aload           19
        //   594: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   597: bipush          11
        //   599: aaload         
        //   600: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   603: pop            
        //   604: aload           19
        //   606: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   609: bipush          21
        //   611: aaload         
        //   612: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   615: bipush          10
        //   617: aaload         
        //   618: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   621: pop            
        //   622: aload_0        
        //   623: aload           19
        //   625: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
        //   628: pop            
        //   629: aload_0        
        //   630: new             Landroid/content/Intent;
        //   633: dup            
        //   634: aload_0        
        //   635: ldc             Lcom/whatsapp/gdrive/GoogleDriveService;.class
        //   637: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   640: aload_0        
        //   641: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.z:Landroid/content/ServiceConnection;
        //   644: iconst_0       
        //   645: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
        //   648: pop            
        //   649: iload_1        
        //   650: ifeq            12
        //   653: new             Ljava/lang/StringBuilder;
        //   656: dup            
        //   657: invokespecial   java/lang/StringBuilder.<init>:()V
        //   660: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   663: bipush          15
        //   665: aaload         
        //   666: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   669: iload           18
        //   671: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   674: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   677: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   680: return         
        //   681: astore          20
        //   683: aload           20
        //   685: athrow         
        //   686: astore          7
        //   688: aload           7
        //   690: athrow         
        //   691: astore          8
        //   693: aload           8
        //   695: athrow         
        //   696: astore          9
        //   698: aload           9
        //   700: athrow         
        //   701: astore          10
        //   703: aload           10
        //   705: athrow         
        //   706: astore          11
        //   708: aload           11
        //   710: athrow         
        //   711: astore          12
        //   713: aload           12
        //   715: athrow         
        //   716: astore          13
        //   718: aload           13
        //   720: athrow         
        //   721: astore          14
        //   723: aload           14
        //   725: athrow         
        //   726: astore          39
        //   728: aload           39
        //   730: athrow         
        //   731: astore          40
        //   733: aload           40
        //   735: athrow         
        //   736: ldc_w           2131232126
        //   739: istore          43
        //   741: goto            326
        //   744: astore          44
        //   746: aload           44
        //   748: athrow         
        //   749: astore          45
        //   751: aload           45
        //   753: athrow         
        //   754: astore          46
        //   756: aload           46
        //   758: athrow         
        //   759: ldc_w           2131232020
        //   762: istore          30
        //   764: goto            387
        //   767: astore          31
        //   769: aload           31
        //   771: athrow         
        //   772: astore          33
        //   774: aload           33
        //   776: athrow         
        //   777: astore          34
        //   779: aload           34
        //   781: athrow         
        //   782: astore          35
        //   784: aload           35
        //   786: athrow         
        //   787: astore          25
        //   789: aload           25
        //   791: athrow         
        //   792: astore          26
        //   794: aload           26
        //   796: athrow         
        //   797: astore          27
        //   799: aload           27
        //   801: athrow         
        //   802: astore          28
        //   804: aload           28
        //   806: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      8      13     16     Landroid/content/ActivityNotFoundException;
        //  16     21     78     83     Landroid/content/ActivityNotFoundException;
        //  26     72     73     78     Landroid/content/ActivityNotFoundException;
        //  80     83     73     78     Landroid/content/ActivityNotFoundException;
        //  83     88     686    691    Landroid/content/ActivityNotFoundException;
        //  93     108    691    696    Landroid/content/ActivityNotFoundException;
        //  113    146    696    701    Landroid/content/ActivityNotFoundException;
        //  150    155    701    706    Landroid/content/ActivityNotFoundException;
        //  160    174    706    711    Landroid/content/ActivityNotFoundException;
        //  179    185    711    716    Landroid/content/ActivityNotFoundException;
        //  190    223    716    721    Landroid/content/ActivityNotFoundException;
        //  227    276    721    726    Landroid/content/ActivityNotFoundException;
        //  295    301    726    731    Landroid/content/ActivityNotFoundException;
        //  306    316    731    736    Landroid/content/ActivityNotFoundException;
        //  326    367    744    759    Landroid/content/ActivityNotFoundException;
        //  387    420    767    772    Landroid/content/ActivityNotFoundException;
        //  432    469    772    787    Landroid/content/ActivityNotFoundException;
        //  484    490    787    792    Landroid/content/ActivityNotFoundException;
        //  495    549    792    807    Landroid/content/ActivityNotFoundException;
        //  592    649    681    686    Landroid/content/ActivityNotFoundException;
        //  653    680    681    686    Landroid/content/ActivityNotFoundException;
        //  688    691    691    696    Landroid/content/ActivityNotFoundException;
        //  693    696    696    701    Landroid/content/ActivityNotFoundException;
        //  698    701    701    706    Landroid/content/ActivityNotFoundException;
        //  703    706    706    711    Landroid/content/ActivityNotFoundException;
        //  708    711    711    716    Landroid/content/ActivityNotFoundException;
        //  713    716    716    721    Landroid/content/ActivityNotFoundException;
        //  718    721    721    726    Landroid/content/ActivityNotFoundException;
        //  728    731    731    736    Landroid/content/ActivityNotFoundException;
        //  746    749    749    759    Landroid/content/ActivityNotFoundException;
        //  751    754    754    759    Landroid/content/ActivityNotFoundException;
        //  774    777    777    787    Landroid/content/ActivityNotFoundException;
        //  779    782    782    787    Landroid/content/ActivityNotFoundException;
        //  784    787    787    792    Landroid/content/ActivityNotFoundException;
        //  789    792    792    807    Landroid/content/ActivityNotFoundException;
        //  794    797    797    807    Landroid/content/ActivityNotFoundException;
        //  799    802    802    807    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 380, Size: 380
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
    
    private void e(@ct final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     5: istore_3       
        //     6: invokestatic    com/whatsapp/aol.a:()V
        //     9: iload_1        
        //    10: tableswitch {
        //               20: 250
        //               21: 275
        //               22: 254
        //               23: 296
        //               24: 333
        //               25: 366
        //               26: 400
        //          default: 52
        //        }
        //    52: new             Ljava/lang/StringBuilder;
        //    55: dup            
        //    56: invokespecial   java/lang/StringBuilder.<init>:()V
        //    59: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    62: bipush          29
        //    64: aaload         
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: iload_1        
        //    69: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    72: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    75: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    78: aconst_null    
        //    79: astore          5
        //    81: aload_0        
        //    82: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.isFinishing:()Z
        //    85: ifne            214
        //    88: new             Ljava/lang/StringBuilder;
        //    91: dup            
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    98: bipush          30
        //   100: aaload         
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: iload_1        
        //   105: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   108: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   111: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   114: aload_0        
        //   115: ldc_w           2131755196
        //   118: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   121: astore          7
        //   123: aload_0        
        //   124: ldc_w           2131755197
        //   127: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   130: astore          8
        //   132: aload           8
        //   134: aload_2        
        //   135: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   138: aload_0        
        //   139: ldc_w           2131755200
        //   142: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   145: iconst_0       
        //   146: invokevirtual   android/view/View.setVisibility:(I)V
        //   149: aload_2        
        //   150: ifnull          163
        //   153: aload           8
        //   155: iconst_1       
        //   156: invokevirtual   android/view/View.setClickable:(Z)V
        //   159: iload_3        
        //   160: ifeq            169
        //   163: aload           8
        //   165: iconst_0       
        //   166: invokevirtual   android/view/View.setClickable:(Z)V
        //   169: aload           5
        //   171: ifnull          203
        //   174: aload           7
        //   176: iconst_0       
        //   177: invokevirtual   android/view/View.setVisibility:(I)V
        //   180: aload_0        
        //   181: ldc_w           2131755199
        //   184: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   187: checkcast       Landroid/widget/TextView;
        //   190: astore          12
        //   192: aload           12
        //   194: aload           5
        //   196: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   199: iload_3        
        //   200: ifeq            210
        //   203: aload           7
        //   205: bipush          8
        //   207: invokevirtual   android/view/View.setVisibility:(I)V
        //   210: iload_3        
        //   211: ifeq            249
        //   214: new             Ljava/lang/StringBuilder;
        //   217: dup            
        //   218: invokespecial   java/lang/StringBuilder.<init>:()V
        //   221: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   224: bipush          32
        //   226: aaload         
        //   227: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   230: iload_1        
        //   231: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   234: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   237: bipush          31
        //   239: aaload         
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   246: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   249: return         
        //   250: iload_3        
        //   251: ifeq            78
        //   254: aload_0        
        //   255: ldc_w           2131232002
        //   258: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   261: astore          5
        //   263: new             Lcom/whatsapp/gdrive/ce;
        //   266: dup            
        //   267: aload_0        
        //   268: invokespecial   com/whatsapp/gdrive/ce.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;)V
        //   271: astore_2       
        //   272: goto            81
        //   275: aload_0        
        //   276: ldc_w           2131232003
        //   279: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   282: astore          5
        //   284: new             Lcom/whatsapp/gdrive/a9;
        //   287: dup            
        //   288: aload_0        
        //   289: invokespecial   com/whatsapp/gdrive/a9.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;)V
        //   292: astore_2       
        //   293: goto            81
        //   296: iconst_1       
        //   297: anewarray       Ljava/lang/Object;
        //   300: astore          14
        //   302: aload           14
        //   304: iconst_0       
        //   305: aload_0        
        //   306: aload_0        
        //   307: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.B:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   310: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.h:()J
        //   313: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   316: aastore        
        //   317: aload_0        
        //   318: ldc_w           2131232031
        //   321: aload           14
        //   323: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   326: astore          5
        //   328: aconst_null    
        //   329: astore_2       
        //   330: goto            81
        //   333: iconst_1       
        //   334: anewarray       Ljava/lang/Object;
        //   337: astore          13
        //   339: aload           13
        //   341: iconst_0       
        //   342: aload_0        
        //   343: ldc_w           2131232117
        //   346: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   349: aastore        
        //   350: aload_0        
        //   351: ldc_w           2131232005
        //   354: aload           13
        //   356: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   359: astore          5
        //   361: aconst_null    
        //   362: astore_2       
        //   363: goto            81
        //   366: invokestatic    com/whatsapp/App.aw:()Z
        //   369: ifeq            386
        //   372: aload_0        
        //   373: ldc_w           2131232007
        //   376: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   379: astore          5
        //   381: aconst_null    
        //   382: astore_2       
        //   383: goto            81
        //   386: aload_0        
        //   387: ldc_w           2131232004
        //   390: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   393: astore          5
        //   395: aconst_null    
        //   396: astore_2       
        //   397: goto            81
        //   400: iconst_1       
        //   401: anewarray       Ljava/lang/Object;
        //   404: astore          4
        //   406: aload           4
        //   408: iconst_0       
        //   409: aload_0        
        //   410: ldc_w           2131232117
        //   413: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   416: aastore        
        //   417: aload_0        
        //   418: ldc_w           2131232032
        //   421: aload           4
        //   423: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   426: astore          5
        //   428: aload_0        
        //   429: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.t:Landroid/view/View$OnClickListener;
        //   432: astore_2       
        //   433: goto            81
        //   436: astore          9
        //   438: aload           9
        //   440: athrow         
        //   441: astore          10
        //   443: aload           10
        //   445: athrow         
        //   446: astore          11
        //   448: aload           11
        //   450: athrow         
        //   451: astore          6
        //   453: aload           6
        //   455: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  132    149    436    441    Landroid/content/ActivityNotFoundException;
        //  153    159    441    446    Landroid/content/ActivityNotFoundException;
        //  163    169    441    446    Landroid/content/ActivityNotFoundException;
        //  192    199    446    451    Landroid/content/ActivityNotFoundException;
        //  203    210    446    451    Landroid/content/ActivityNotFoundException;
        //  214    249    451    456    Landroid/content/ActivityNotFoundException;
        //  438    441    441    446    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 200, Size: 200
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
    
    static String[] f(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.x;
    }
    
    static TextView g(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.n;
    }
    
    private void g() {
        this.t = (View$OnClickListener)new as(this);
        this.u = (View$OnClickListener)new a4(this);
        this.l.setOnClickListener(this.t);
        this.w.setOnClickListener((View$OnClickListener)new by(this));
        this.h();
        this.o.setOnClickListener((View$OnClickListener)new a6(this));
        this.q.setOnClickListener((View$OnClickListener)new af(this));
        this.findViewById(2131755200).setOnClickListener((View$OnClickListener)new ad(this));
    }
    
    static ServiceConnection h(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.z;
    }
    
    private void h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokestatic    com/whatsapp/SettingsChat.b:(Landroid/content/Context;)Ljava/lang/String;
        //     8: astore_2       
        //     9: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //    12: astore_3       
        //    13: aload_3        
        //    14: ifnull          222
        //    17: aload_3        
        //    18: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Ljava/lang/String;)J
        //    21: lstore          4
        //    23: lload           4
        //    25: lconst_0       
        //    26: lcmp           
        //    27: ifne            43
        //    30: aload_0        
        //    31: ldc_w           2131231404
        //    34: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //    37: astore          15
        //    39: iload_1        
        //    40: ifeq            215
        //    43: lload           4
        //    45: ldc2_w          -1
        //    48: lcmp           
        //    49: ifne            65
        //    52: aload_0        
        //    53: ldc_w           2131231872
        //    56: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //    59: astore          15
        //    61: iload_1        
        //    62: ifeq            215
        //    65: aload_0        
        //    66: lload           4
        //    68: invokestatic    com/whatsapp/util/b6.l:(Landroid/content/Context;J)Ljava/lang/String;
        //    71: astore          6
        //    73: aload_3        
        //    74: ifnull          207
        //    77: aload_3        
        //    78: invokestatic    com/whatsapp/gdrive/GoogleDriveService.d:(Ljava/lang/String;)J
        //    81: lstore          7
        //    83: aload_0        
        //    84: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.l:Landroid/widget/Button;
        //    87: astore          12
        //    89: aload           12
        //    91: ifnull          191
        //    94: lload           7
        //    96: lconst_0       
        //    97: lcmp           
        //    98: ifle            158
        //   101: aload_0        
        //   102: ldc_w           2131755205
        //   105: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   108: checkcast       Landroid/widget/TextView;
        //   111: astore          13
        //   113: iconst_3       
        //   114: anewarray       Ljava/lang/Object;
        //   117: astore          14
        //   119: aload           14
        //   121: iconst_0       
        //   122: aload_2        
        //   123: aastore        
        //   124: aload           14
        //   126: iconst_1       
        //   127: aload           6
        //   129: aastore        
        //   130: aload           14
        //   132: iconst_2       
        //   133: aload_0        
        //   134: lload           7
        //   136: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   139: aastore        
        //   140: aload           13
        //   142: aload_0        
        //   143: ldc_w           2131232116
        //   146: aload           14
        //   148: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   151: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   154: iload_1        
        //   155: ifeq            191
        //   158: aload_0        
        //   159: ldc_w           2131755205
        //   162: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   165: checkcast       Landroid/widget/TextView;
        //   168: aload_0        
        //   169: ldc_w           2131232115
        //   172: iconst_2       
        //   173: anewarray       Ljava/lang/Object;
        //   176: dup            
        //   177: iconst_0       
        //   178: aload_2        
        //   179: aastore        
        //   180: dup            
        //   181: iconst_1       
        //   182: aload           6
        //   184: aastore        
        //   185: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   188: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   191: return         
        //   192: astore          9
        //   194: aload           9
        //   196: athrow         
        //   197: astore          10
        //   199: aload           10
        //   201: athrow         
        //   202: astore          11
        //   204: aload           11
        //   206: athrow         
        //   207: ldc2_w          -1
        //   210: lstore          7
        //   212: goto            83
        //   215: aload           15
        //   217: astore          6
        //   219: goto            73
        //   222: lconst_0       
        //   223: lstore          4
        //   225: goto            23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  83     89     192    202    Landroid/content/ActivityNotFoundException;
        //  101    154    202    207    Landroid/content/ActivityNotFoundException;
        //  158    191    202    207    Landroid/content/ActivityNotFoundException;
        //  194    197    197    202    Landroid/content/ActivityNotFoundException;
        //  199    202    202    207    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0158:
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
    
    static View i(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.o;
    }
    
    static int j(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.d();
    }
    
    static View$OnClickListener k(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.t;
    }
    
    static ImageView l(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.r;
    }
    
    static boolean m(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.c();
    }
    
    static TextView n(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.v;
    }
    
    static String o(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.s;
    }
    
    static TextView p(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.m;
    }
    
    static void q(final SettingsGoogleDrive settingsGoogleDrive) {
        settingsGoogleDrive.e();
    }
    
    static Button r(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.l;
    }
    
    static View$OnClickListener s(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.u;
    }
    
    static void t(final SettingsGoogleDrive settingsGoogleDrive) {
        settingsGoogleDrive.h();
    }
    
    static GoogleDriveService u(final SettingsGoogleDrive settingsGoogleDrive) {
        return settingsGoogleDrive.B;
    }
    
    protected void f() {
        GoogleDriveService.c(0);
        this.m.setText((CharSequence)this.x[this.d()]);
    }
    
    @Override
    protected void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore          4
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    15: iconst_2       
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: iload_1        
        //    21: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    24: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    27: iconst_4       
        //    28: aaload         
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: iload_2        
        //    33: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: iload_1        
        //    43: tableswitch {
        //                2: 137
        //                3: 65
        //          default: 64
        //        }
        //    64: return         
        //    65: iload_2        
        //    66: iconst_m1      
        //    67: if_icmpne       102
        //    70: aload_3        
        //    71: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //    74: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    77: iconst_1       
        //    78: aaload         
        //    79: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    82: astore          19
        //    84: new             Lcom/whatsapp/gdrive/bd;
        //    87: dup            
        //    88: aload_0        
        //    89: aload           19
        //    91: invokespecial   com/whatsapp/gdrive/bd.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;Ljava/lang/String;)V
        //    94: invokestatic    com/whatsapp/util/bm.a:(Ljava/lang/Runnable;)V
        //    97: iload           4
        //    99: ifeq            64
        //   102: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //   105: astore          18
        //   107: aload           18
        //   109: ifnonnull       64
        //   112: aload_0        
        //   113: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.f:()V
        //   116: aload_0        
        //   117: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.w:Landroid/view/View;
        //   120: iconst_0       
        //   121: invokevirtual   android/view/View.setEnabled:(Z)V
        //   124: aload_0        
        //   125: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.o:Landroid/view/View;
        //   128: iconst_0       
        //   129: invokevirtual   android/view/View.setEnabled:(Z)V
        //   132: iload           4
        //   134: ifeq            64
        //   137: iload_2        
        //   138: iconst_m1      
        //   139: if_icmpne       64
        //   142: aload_0        
        //   143: aload_3        
        //   144: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   147: iconst_0       
        //   148: aaload         
        //   149: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   152: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.s:Ljava/lang/String;
        //   155: aload_0        
        //   156: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.k:Landroid/os/ConditionVariable;
        //   159: invokevirtual   android/os/ConditionVariable.open:()V
        //   162: aload_0        
        //   163: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.s:Ljava/lang/String;
        //   166: astore          7
        //   168: aload           7
        //   170: ifnull          290
        //   173: aload_3        
        //   174: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   177: iconst_5       
        //   178: aaload         
        //   179: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   182: astore          11
        //   184: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //   187: aload           11
        //   189: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   192: istore          14
        //   194: iload           14
        //   196: ifne            261
        //   199: aload           11
        //   201: invokestatic    com/whatsapp/gdrive/GoogleDriveService.h:(Ljava/lang/String;)Z
        //   204: pop            
        //   205: aload_0        
        //   206: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.B:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   209: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.t:()V
        //   212: new             Ljava/lang/StringBuilder;
        //   215: dup            
        //   216: invokespecial   java/lang/StringBuilder.<init>:()V
        //   219: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   222: bipush          6
        //   224: aaload         
        //   225: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   228: aload           11
        //   230: invokestatic    com/whatsapp/gdrive/a7.a:(Ljava/lang/String;)Ljava/lang/String;
        //   233: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   236: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   239: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   242: aload_0        
        //   243: new             Lcom/whatsapp/gdrive/b_;
        //   246: dup            
        //   247: aload_0        
        //   248: aload           11
        //   250: invokespecial   com/whatsapp/gdrive/b_.<init>:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;Ljava/lang/String;)V
        //   253: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.runOnUiThread:(Ljava/lang/Runnable;)V
        //   256: iload           4
        //   258: ifeq            290
        //   261: new             Ljava/lang/StringBuilder;
        //   264: dup            
        //   265: invokespecial   java/lang/StringBuilder.<init>:()V
        //   268: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   271: iconst_3       
        //   272: aaload         
        //   273: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   276: aload           11
        //   278: invokestatic    com/whatsapp/gdrive/a7.a:(Ljava/lang/String;)Ljava/lang/String;
        //   281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   284: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   287: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   290: aload_0        
        //   291: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.B:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   294: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.m:()I
        //   297: istore          10
        //   299: iload           10
        //   301: bipush          11
        //   303: if_icmpeq       318
        //   306: aload_0        
        //   307: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.B:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   310: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.m:()I
        //   313: bipush          12
        //   315: if_icmpne       64
        //   318: aload_0        
        //   319: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.B:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   322: bipush          10
        //   324: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   327: invokestatic    com/whatsapp/gdrive/GoogleDriveService.i:()V
        //   330: return         
        //   331: astore          9
        //   333: aload           9
        //   335: athrow         
        //   336: astore          5
        //   338: aload           5
        //   340: athrow         
        //   341: astore          20
        //   343: aload           20
        //   345: athrow         
        //   346: astore          16
        //   348: aload           16
        //   350: athrow         
        //   351: astore          17
        //   353: aload           17
        //   355: athrow         
        //   356: astore          6
        //   358: aload           6
        //   360: athrow         
        //   361: astore          12
        //   363: aload           12
        //   365: athrow         
        //   366: astore          13
        //   368: aload           13
        //   370: athrow         
        //   371: astore          8
        //   373: aload           8
        //   375: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  5      42     336    341    Landroid/content/ActivityNotFoundException;
        //  84     97     341    346    Landroid/content/ActivityNotFoundException;
        //  102    107    346    351    Landroid/content/ActivityNotFoundException;
        //  112    132    351    356    Landroid/content/ActivityNotFoundException;
        //  142    168    356    361    Landroid/content/ActivityNotFoundException;
        //  184    194    361    366    Landroid/content/ActivityNotFoundException;
        //  199    256    366    371    Landroid/content/ActivityNotFoundException;
        //  261    290    366    371    Landroid/content/ActivityNotFoundException;
        //  290    299    371    376    Landroid/content/ActivityNotFoundException;
        //  306    318    331    336    Landroid/content/ActivityNotFoundException;
        //  318    330    331    336    Landroid/content/ActivityNotFoundException;
        //  343    346    346    351    Landroid/content/ActivityNotFoundException;
        //  348    351    351    356    Landroid/content/ActivityNotFoundException;
        //  353    356    356    361    Landroid/content/ActivityNotFoundException;
        //  363    366    366    371    Landroid/content/ActivityNotFoundException;
        //  373    376    331    336    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 170, Size: 170
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
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   com/whatsapp/DialogToastActivity.onCreate:(Landroid/os/Bundle;)V
        //     9: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    12: bipush          33
        //    14: aaload         
        //    15: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    18: aload_0        
        //    19: ldc_w           2130903074
        //    22: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.setContentView:(I)V
        //    25: aload_0        
        //    26: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    29: iconst_1       
        //    30: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    33: aload_0        
        //    34: aload_0        
        //    35: ldc_w           2131755216
        //    38: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //    41: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.w:Landroid/view/View;
        //    44: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:()Ljava/lang/String;
        //    47: astore_3       
        //    48: aload_3        
        //    49: ifnonnull       511
        //    52: aload_0        
        //    53: ldc_w           2131232097
        //    56: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //    59: astore          4
        //    61: aload_0        
        //    62: aload_0        
        //    63: ldc_w           2131755218
        //    66: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //    69: checkcast       Landroid/widget/TextView;
        //    72: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.v:Landroid/widget/TextView;
        //    75: aload_0        
        //    76: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.v:Landroid/widget/TextView;
        //    79: aload           4
        //    81: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    84: aload_0        
        //    85: aload_0        
        //    86: ldc_w           2131755207
        //    89: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //    92: checkcast       Landroid/widget/Button;
        //    95: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.l:Landroid/widget/Button;
        //    98: aload_0        
        //    99: aload_0        
        //   100: ldc_w           2131755210
        //   103: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   106: checkcast       Landroid/widget/TextView;
        //   109: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.n:Landroid/widget/TextView;
        //   112: aload_0        
        //   113: ldc_w           2131755206
        //   116: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   119: checkcast       Landroid/widget/TextView;
        //   122: astore          6
        //   124: invokestatic    com/whatsapp/App.aw:()Z
        //   127: istore          7
        //   129: iload           7
        //   131: ifeq            472
        //   134: ldc_w           2131232108
        //   137: istore          8
        //   139: aload           6
        //   141: iload           8
        //   143: invokevirtual   android/widget/TextView.setText:(I)V
        //   146: aload_0        
        //   147: aload_0        
        //   148: ldc_w           2131755191
        //   151: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   154: checkcast       Landroid/widget/ProgressBar;
        //   157: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.y:Landroid/widget/ProgressBar;
        //   160: aload_0        
        //   161: aload_0        
        //   162: ldc_w           2131755209
        //   165: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   168: checkcast       Landroid/widget/ImageView;
        //   171: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.r:Landroid/widget/ImageView;
        //   174: aload_0        
        //   175: aload_0        
        //   176: ldc_w           2131755213
        //   179: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   182: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.q:Landroid/view/View;
        //   185: aload_0        
        //   186: aload_0        
        //   187: ldc_w           2131755215
        //   190: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   193: checkcast       Landroid/widget/TextView;
        //   196: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.m:Landroid/widget/TextView;
        //   199: aload_0        
        //   200: aload_0        
        //   201: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getResources:()Landroid/content/res/Resources;
        //   204: ldc_w           2131689481
        //   207: invokevirtual   android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
        //   210: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.x:[Ljava/lang/String;
        //   213: iconst_0       
        //   214: istore          9
        //   216: iload           9
        //   218: aload_0        
        //   219: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.x:[Ljava/lang/String;
        //   222: arraylength    
        //   223: if_icmpge       316
        //   226: aload_0        
        //   227: ldc_w           2131232104
        //   230: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   233: aload_0        
        //   234: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.x:[Ljava/lang/String;
        //   237: iload           9
        //   239: aaload         
        //   240: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   243: istore          17
        //   245: iload           17
        //   247: ifeq            309
        //   250: aload_0        
        //   251: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.x:[Ljava/lang/String;
        //   254: astore          18
        //   256: iconst_1       
        //   257: anewarray       Ljava/lang/Object;
        //   260: astore          19
        //   262: aload           19
        //   264: iconst_0       
        //   265: aload_0        
        //   266: ldc_w           2131232117
        //   269: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I)Ljava/lang/String;
        //   272: aastore        
        //   273: aload           18
        //   275: iload           9
        //   277: aload_0        
        //   278: ldc_w           2131232104
        //   281: aload           19
        //   283: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   286: aastore        
        //   287: iload_2        
        //   288: ifeq            316
        //   291: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   294: istore          20
        //   296: iload           20
        //   298: ifeq            495
        //   301: iconst_0       
        //   302: istore          21
        //   304: iload           21
        //   306: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   309: iinc            9, 1
        //   312: iload_2        
        //   313: ifeq            216
        //   316: aload_0        
        //   317: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.m:Landroid/widget/TextView;
        //   320: aload_0        
        //   321: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.x:[Ljava/lang/String;
        //   324: aload_0        
        //   325: invokespecial   com/whatsapp/gdrive/SettingsGoogleDrive.d:()I
        //   328: aaload         
        //   329: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   332: aload_0        
        //   333: aload_0        
        //   334: ldc_w           2131755220
        //   337: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   340: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.o:Landroid/view/View;
        //   343: aload_0        
        //   344: aload_0        
        //   345: ldc_w           2131755221
        //   348: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   351: checkcast       Landroid/widget/TextView;
        //   354: putfield        com/whatsapp/gdrive/SettingsGoogleDrive.A:Landroid/widget/TextView;
        //   357: aload_0        
        //   358: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getResources:()Landroid/content/res/Resources;
        //   361: ldc_w           2131689484
        //   364: invokevirtual   android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
        //   367: invokestatic    com/whatsapp/gdrive/GoogleDriveService.y:()I
        //   370: aaload         
        //   371: astore          10
        //   373: aload_0        
        //   374: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.A:Landroid/widget/TextView;
        //   377: aload           10
        //   379: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   382: aload_0        
        //   383: ldc_w           2131755221
        //   386: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //   389: checkcast       Landroid/widget/TextView;
        //   392: aload           10
        //   394: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   397: aload_0        
        //   398: invokespecial   com/whatsapp/gdrive/SettingsGoogleDrive.g:()V
        //   401: aload_0        
        //   402: new             Landroid/content/Intent;
        //   405: dup            
        //   406: aload_0        
        //   407: ldc             Lcom/whatsapp/gdrive/GoogleDriveService;.class
        //   409: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   412: aload_0        
        //   413: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.z:Landroid/content/ServiceConnection;
        //   416: iconst_1       
        //   417: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
        //   420: pop            
        //   421: invokestatic    com/whatsapp/gdrive/GoogleDriveService.am:()Z
        //   424: ifne            440
        //   427: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //   430: bipush          34
        //   432: aaload         
        //   433: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   436: aload_0        
        //   437: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.finish:()V
        //   440: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ae:()I
        //   443: ifne            462
        //   446: aload_0        
        //   447: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.w:Landroid/view/View;
        //   450: iconst_0       
        //   451: invokevirtual   android/view/View.setEnabled:(Z)V
        //   454: aload_0        
        //   455: getfield        com/whatsapp/gdrive/SettingsGoogleDrive.o:Landroid/view/View;
        //   458: iconst_0       
        //   459: invokevirtual   android/view/View.setEnabled:(Z)V
        //   462: aload_0        
        //   463: invokespecial   com/whatsapp/gdrive/SettingsGoogleDrive.h:()V
        //   466: return         
        //   467: astore          5
        //   469: aload           5
        //   471: athrow         
        //   472: ldc_w           2131232109
        //   475: istore          8
        //   477: goto            139
        //   480: astore          14
        //   482: aload           14
        //   484: athrow         
        //   485: astore          15
        //   487: aload           15
        //   489: athrow         
        //   490: astore          16
        //   492: aload           16
        //   494: athrow         
        //   495: iconst_1       
        //   496: istore          21
        //   498: goto            304
        //   501: astore          11
        //   503: aload           11
        //   505: athrow         
        //   506: astore          13
        //   508: aload           13
        //   510: athrow         
        //   511: aload_3        
        //   512: astore          4
        //   514: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  61     129    467    472    Landroid/content/ActivityNotFoundException;
        //  226    245    480    485    Landroid/content/ActivityNotFoundException;
        //  250    287    485    490    Landroid/content/ActivityNotFoundException;
        //  291    296    490    495    Landroid/content/ActivityNotFoundException;
        //  373    440    501    506    Landroid/content/ActivityNotFoundException;
        //  440    462    506    511    Landroid/content/ActivityNotFoundException;
        //  482    485    485    490    Landroid/content/ActivityNotFoundException;
        //  487    490    490    495    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 241, Size: 241
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
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 600: {
                try {
                    return SettingsChat.a((Context)this);
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                break;
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        try {
            if (this.B != null) {
                this.B.b(this.p);
            }
            this.unbindService(this.z);
            super.onDestroy();
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        while (true) {
            final int f = GoogleDriveService.F;
            while (true) {
                Label_0261: {
                    Label_0244: {
                        Label_0227: {
                            Label_0210: {
                                Label_0193: {
                                    Label_0176: {
                                        Label_0159: {
                                            Label_0142: {
                                                Label_0125: {
                                                    try {
                                                        if (App.aS == 3) {
                                                            switch (n) {
                                                                case 29: {
                                                                    break Label_0125;
                                                                }
                                                                case 30: {
                                                                    break Label_0142;
                                                                }
                                                                case 31: {
                                                                    break Label_0159;
                                                                }
                                                                case 32: {
                                                                    break Label_0176;
                                                                }
                                                                case 33: {
                                                                    break Label_0193;
                                                                }
                                                                case 34: {
                                                                    break Label_0210;
                                                                }
                                                                case 35: {
                                                                    break Label_0227;
                                                                }
                                                                case 36: {
                                                                    break Label_0244;
                                                                }
                                                                case 37: {
                                                                    break Label_0261;
                                                                }
                                                            }
                                                        }
                                                        return super.onKeyDown(n, keyEvent);
                                                    }
                                                    catch (ActivityNotFoundException ex) {
                                                        try {
                                                            throw ex;
                                                        }
                                                        catch (ActivityNotFoundException ex2) {
                                                            try {
                                                                throw ex2;
                                                            }
                                                            catch (ActivityNotFoundException ex4) {
                                                                throw ex4;
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        final ActivityNotFoundException ex4;
                                                        throw ex4;
                                                    }
                                                    catch (ActivityNotFoundException ex5) {
                                                        try {
                                                            throw ex5;
                                                        }
                                                        catch (ActivityNotFoundException ex7) {
                                                            throw ex7;
                                                        }
                                                    }
                                                    try {
                                                        final ActivityNotFoundException ex7;
                                                        throw ex7;
                                                    }
                                                    catch (ActivityNotFoundException ex8) {
                                                        try {
                                                            throw ex8;
                                                        }
                                                        catch (ActivityNotFoundException ex10) {
                                                            throw ex10;
                                                        }
                                                    }
                                                    try {
                                                        final ActivityNotFoundException ex10;
                                                        throw ex10;
                                                    }
                                                    catch (ActivityNotFoundException ex11) {
                                                        try {
                                                            throw ex11;
                                                        }
                                                        catch (ActivityNotFoundException ex13) {
                                                            throw ex13;
                                                        }
                                                    }
                                                    try {
                                                        final ActivityNotFoundException ex13;
                                                        throw ex13;
                                                    }
                                                    catch (ActivityNotFoundException ex14) {
                                                        throw ex14;
                                                    }
                                                }
                                                GoogleDriveService.p();
                                                this.B.e(11);
                                                if (f == 0) {
                                                    continue;
                                                }
                                            }
                                            GoogleDriveService.p();
                                            this.B.e(12);
                                            if (f == 0) {
                                                continue;
                                            }
                                        }
                                        GoogleDriveService.p();
                                        this.B.e(14);
                                        if (f == 0) {
                                            continue;
                                        }
                                    }
                                    GoogleDriveService.p();
                                    this.B.e(13);
                                    if (f == 0) {
                                        continue;
                                    }
                                }
                                GoogleDriveService.p();
                                this.B.e(16);
                                if (f == 0) {
                                    continue;
                                }
                            }
                            GoogleDriveService.F();
                            this.B.e(11);
                            if (f == 0) {
                                continue;
                            }
                        }
                        GoogleDriveService.F();
                        this.B.e(12);
                        if (f == 0) {
                            continue;
                        }
                    }
                    GoogleDriveService.F();
                    this.B.e(14);
                    if (f == 0) {
                        continue;
                    }
                }
                GoogleDriveService.F();
                this.B.e(15);
                continue;
            }
        }
    }
    
    @Override
    protected void onResume() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/DialogToastActivity.onResume:()V
        //     4: aload_0        
        //     5: invokespecial   com/whatsapp/gdrive/SettingsGoogleDrive.h:()V
        //     8: getstatic       com/whatsapp/gdrive/SettingsGoogleDrive.C:[Ljava/lang/String;
        //    11: bipush          9
        //    13: aaload         
        //    14: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    17: aload_0        
        //    18: ldc_w           2131755201
        //    21: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //    24: checkcast       Landroid/widget/TextView;
        //    27: astore_1       
        //    28: aload_0        
        //    29: ldc_w           2131755211
        //    32: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.findViewById:(I)Landroid/view/View;
        //    35: checkcast       Landroid/widget/TextView;
        //    38: astore_2       
        //    39: invokestatic    com/whatsapp/App.ak:()Z
        //    42: istore          5
        //    44: iload           5
        //    46: ifeq            75
        //    49: aload_1        
        //    50: ldc_w           2130838740
        //    53: iconst_0       
        //    54: iconst_0       
        //    55: iconst_0       
        //    56: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //    59: aload_2        
        //    60: ldc_w           2130838762
        //    63: iconst_0       
        //    64: iconst_0       
        //    65: iconst_0       
        //    66: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //    69: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //    72: ifeq            104
        //    75: aload_1        
        //    76: iconst_0       
        //    77: iconst_0       
        //    78: ldc_w           2130838740
        //    81: iconst_0       
        //    82: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //    85: aload_2        
        //    86: iconst_0       
        //    87: iconst_0       
        //    88: ldc_w           2130838762
        //    91: iconst_0       
        //    92: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //    95: return         
        //    96: astore_3       
        //    97: aload_3        
        //    98: athrow         
        //    99: astore          4
        //   101: aload           4
        //   103: athrow         
        //   104: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  39     44     96     99     Landroid/content/ActivityNotFoundException;
        //  49     75     99     104    Landroid/content/ActivityNotFoundException;
        //  75     95     99     104    Landroid/content/ActivityNotFoundException;
        //  97     99     99     104    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0075:
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
}
