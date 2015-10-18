// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.ProgressDialog;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.preference.Preference$OnPreferenceChangeListener;
import android.preference.ListPreference;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.CheckBoxPreference;
import android.os.Bundle;
import android.content.Intent;
import android.preference.Preference;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.util.br;
import com.whatsapp.wallpaper.h;
import android.net.Uri;
import com.whatsapp.util.b6;
import java.util.Calendar;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;

public class SettingsChat extends DialogToastPreferenceActivity
{
    private static final String[] z;
    private Handler g;
    private String h;
    
    static {
        final String[] z2 = new String[41];
        String s = "|\r<X#g";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1057:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'V';
                        break;
                    }
                    case 0: {
                        c2 = '\u0013';
                        break;
                    }
                    case 1: {
                        c2 = 'x';
                        break;
                    }
                    case 2: {
                        c2 = 'H';
                        break;
                    }
                    case 3: {
                        c2 = '(';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "|\u0017%";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "d\u0019$D&r\b-Zy`\u001d<]&<\u000b:Kl";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "z\u000b\u0017Z3`\u001d<";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "`\u001d<\\?}\u001f;\u0007!r\u0014$X7c\u001d:\u0007?}\u000e)D?w'.A:vB";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "3\u0004h";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "p\u0017&^3a\u000b)\\?|\u0016gI5g\u0011>A\"j\n-[#\u007f\fgK$|\b!E7t\u001dgG9~U-Z$|\n";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "d\u0019$D&r\b-Zvu\n'Evc\u001f#\u0012";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "z\u000b\u0017L3u\u0019=D\"";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "`\u001b)D3";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "d\u0019$D&r\b-Zyp\n'Xy{\u001d!O>gB";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "`\u001d<\\?}\u001f;\u0007!r\u0014$X7c\u001d:\u00072v\u001e)]:g";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "a\u001d,a2";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "|\r<X#g>'Z;r\f";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "D\u0019$D\u0006r\b-Z";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "`\u001d<\\?}\u001f;\u0007!r\u0014$X7c\u001d:\u0007$v\u000b-\\";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "p\u0017&^3a\u000b)\\?|\u0016gI5g\u0011>A\"j\n-[yu\u0019!Dy\u007f\u0017)L{z\u0015)O3";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "p\n'X\u0014j7=\\&f\f\u001bA,v";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "|\r<X#g ";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    s = "|\r<X#g!";
                    n = 18;
                    n2 = 19;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    array = z2;
                    s = "3#";
                    n = 19;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "d\u0019$D&r\b-Zy`\u001d<]&<\u001e!D3>\u0016'\\{u\u0017=F2";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "`\u001b)D3F\b\u0001N\u0018v\u001d,M2";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "p\u0017&^3a\u000b)\\?|\u0016gI5g\u0011>A\"j\n-[y|\u0017%\u00053a\n'Z";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "q\r+C3g',A%c\u0014)Q\t}\u0019%M";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "}\u0017e[&r\u001b-";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "p\u0017&^3a\u000b)\\?|\u0016gI5g\u0011>A\"j\n-[y}\u0017e[&r\u001b-";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "v\n:G$>\u0017'E";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "z\u0017eM$a\u0017:";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "p\u0017&\\7p\f";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "z\u00168]\"L\u001d&\\3a';M8w";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "v\u0015)A:L\u001b I\"L\u0010![\"|\n1";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "~\u000b/[\"|\n-w7a\u001b A v')D:L\u001b I\"`";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "~\u000b/[\"|\n-w7a\u001b A v')D:L\u001b I\"`";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "`\u001d<\\?}\u001f;w7f\f'L9d\u0016$G7w";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "`\u001d<\\?}\u001f;w!r\u0014$X7c\u001d:";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "z\u0016<M$u\u0019+M\tu\u0017&\\\t`\u00112M";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "`\u001d<\\?}\u001f;w4r\u001b#]&";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "~\u000b/[\"|\n-w5\u007f\u001d)Z\tr\u0014$w5{\u0019<[";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "~\u000b/[\"|\n-w2v\u0014-\\3L\u0019$D\tp\u0010)\\%";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "`\u001d<\\?}\u001f;w4r\u001b#]&";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    break Label_1057;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public SettingsChat() {
        this.g = new Handler();
        this.h = null;
    }
    
    public static Dialog a(final Context context) {
        final Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 4);
        final ay ay = new ay(context);
        ay.setTitle((CharSequence)context.getString(2131231341));
        int n;
        if (App.aw()) {
            n = 2131231671;
        }
        else {
            n = 2131231672;
        }
        ay.setMessage((CharSequence)context.getString(n, new Object[] { b6.c(context, instance.getTimeInMillis()) }));
        ay.setIndeterminate(true);
        ay.setCancelable(false);
        return (Dialog)ay;
    }
    
    static Handler a(final SettingsChat settingsChat) {
        return settingsChat.g;
    }
    
    public static void a() {
        final gu aj = App.aj();
        if (aj instanceof SettingsChat) {
            ((SettingsChat)aj).b();
        }
    }
    
    private void a(final Uri uri, final int n, final int n2, final int n3) {
        Label_0031: {
            if (uri == null) {
                com.whatsapp.wallpaper.h.a((Context)this, true, n, null, n2, n3);
                if (!App.I) {
                    break Label_0031;
                }
            }
            com.whatsapp.wallpaper.h.a((Context)this, false, -1, uri, 0, 0);
        }
        br.a((Context)this, uri);
        App.a(this.getBaseContext(), this.getString(2131231955), 0);
    }
    
    public static String b(final Context context) {
        final boolean i = App.I;
        final long ac = App.ac();
        if (ac == 0L) {
            final String s = context.getString(2131231404);
            if (!i) {
                return s;
            }
        }
        if (ac == -1L) {
            final String s = context.getString(2131231872);
            if (!i) {
                return s;
            }
        }
        return b6.l(context, ac).toString();
    }
    
    private void b() {
        final Preference preference = this.findPreference((CharSequence)SettingsChat.z[40]);
        final String b = b((Context)this);
        if (preference != null && !GoogleDriveService.am()) {
            preference.setTitle(2131231701);
            preference.setSummary((CharSequence)String.format(this.getString(2131231702), b));
        }
    }
    
    static void b(final SettingsChat settingsChat) {
        settingsChat.b();
    }
    
    protected void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          4
        //     3: getstatic       com/whatsapp/App.I:Z
        //     6: istore          5
        //     8: iload_2        
        //     9: ifne            127
        //    12: aload_3        
        //    13: ifnull          127
        //    16: aload_3        
        //    17: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //    20: iconst_1       
        //    21: aaload         
        //    22: iconst_0       
        //    23: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //    26: istore          54
        //    28: iload           54
        //    30: ifeq            55
        //    33: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //    36: bipush          23
        //    38: aaload         
        //    39: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    42: aload_0        
        //    43: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    46: ldc_w           2131231082
        //    49: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //    52: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //    55: aload_3        
        //    56: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //    59: bipush          25
        //    61: aaload         
        //    62: iconst_0       
        //    63: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //    66: ifeq            91
        //    69: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //    72: bipush          26
        //    74: aaload         
        //    75: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    78: aload_0        
        //    79: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    82: ldc_w           2131231078
        //    85: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //    88: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //    91: aload_3        
        //    92: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //    95: bipush          28
        //    97: aaload         
        //    98: iconst_0       
        //    99: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   102: ifeq            127
        //   105: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   108: bipush          16
        //   110: aaload         
        //   111: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   114: aload_0        
        //   115: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   118: ldc_w           2131231072
        //   121: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //   124: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //   127: iload_1        
        //   128: lookupswitch {
        //               17: 300
        //               18: 222
        //              104: 192
        //          default: 164
        //        }
        //   164: aload_0        
        //   165: iload_1        
        //   166: iload_2        
        //   167: aload_3        
        //   168: invokespecial   com/whatsapp/DialogToastPreferenceActivity.onActivityResult:(IILandroid/content/Intent;)V
        //   171: return         
        //   172: astore          52
        //   174: aload           52
        //   176: athrow         
        //   177: astore          53
        //   179: aload           53
        //   181: athrow         
        //   182: astore          55
        //   184: aload           55
        //   186: athrow         
        //   187: astore          56
        //   189: aload           56
        //   191: athrow         
        //   192: iload_2        
        //   193: iconst_m1      
        //   194: if_icmpne       164
        //   197: aload_0        
        //   198: aload_3        
        //   199: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   202: bipush          29
        //   204: aaload         
        //   205: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   208: putfield        com/whatsapp/SettingsChat.h:Ljava/lang/String;
        //   211: aload_0        
        //   212: bipush          19
        //   214: invokevirtual   com/whatsapp/SettingsChat.showDialog:(I)V
        //   217: iload           5
        //   219: ifeq            164
        //   222: iload_2        
        //   223: iconst_m1      
        //   224: if_icmpne       258
        //   227: aload_3        
        //   228: ifnull          164
        //   231: aload_3        
        //   232: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   235: astore          48
        //   237: aload           48
        //   239: ifnull          164
        //   242: aload_0        
        //   243: aload_3        
        //   244: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   247: iconst_m1      
        //   248: iconst_0       
        //   249: iconst_0       
        //   250: invokespecial   com/whatsapp/SettingsChat.a:(Landroid/net/Uri;III)V
        //   253: iload           5
        //   255: ifeq            164
        //   258: aload_3        
        //   259: ifnull          164
        //   262: aload_3        
        //   263: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   266: bipush          27
        //   268: aaload         
        //   269: iconst_1       
        //   270: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   273: istore          44
        //   275: iload           44
        //   277: ifeq            164
        //   280: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   283: bipush          6
        //   285: aaload         
        //   286: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   289: aload_0        
        //   290: bipush          7
        //   292: invokevirtual   com/whatsapp/SettingsChat.showDialog:(I)V
        //   295: iload           5
        //   297: ifeq            164
        //   300: iload_2        
        //   301: iconst_m1      
        //   302: if_icmpne       164
        //   305: aload_3        
        //   306: ifnull          164
        //   309: aload_0        
        //   310: invokestatic    com/whatsapp/wallpaper/h.d:(Landroid/content/Context;)Landroid/graphics/Point;
        //   313: astore          6
        //   315: aload_3        
        //   316: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   319: ifnull          824
        //   322: new             Ljava/lang/StringBuilder;
        //   325: dup            
        //   326: invokespecial   java/lang/StringBuilder.<init>:()V
        //   329: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   332: iconst_2       
        //   333: aaload         
        //   334: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   337: aload_3        
        //   338: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   341: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   344: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   347: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   350: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   353: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   356: aload_3        
        //   357: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   360: aconst_null    
        //   361: aconst_null    
        //   362: aconst_null    
        //   363: aconst_null    
        //   364: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   367: astore          15
        //   369: aload           15
        //   371: ifnull          625
        //   374: aload           15
        //   376: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   381: pop            
        //   382: aload           15
        //   384: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   387: bipush          24
        //   389: aaload         
        //   390: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   395: istore          29
        //   397: iload           29
        //   399: iflt            625
        //   402: aload           15
        //   404: iload           29
        //   406: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   411: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   414: bipush          14
        //   416: aaload         
        //   417: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   420: istore          31
        //   422: iload           31
        //   424: ifeq            625
        //   427: new             Landroid/graphics/BitmapFactory$Options;
        //   430: dup            
        //   431: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   434: astore          32
        //   436: aload           32
        //   438: iconst_1       
        //   439: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   442: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   445: aload_3        
        //   446: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   449: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   452: astore          35
        //   454: aload           35
        //   456: astore          4
        //   458: aload           4
        //   460: aconst_null    
        //   461: aload           32
        //   463: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   466: pop            
        //   467: aload           32
        //   469: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   472: aload           6
        //   474: getfield        android/graphics/Point.x:I
        //   477: if_icmpne       1079
        //   480: aload           32
        //   482: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   485: istore          38
        //   487: aload           6
        //   489: getfield        android/graphics/Point.y:I
        //   492: istore          39
        //   494: iload           38
        //   496: iload           39
        //   498: if_icmpne       1079
        //   501: aload_0        
        //   502: aload_3        
        //   503: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   506: iconst_m1      
        //   507: iconst_0       
        //   508: iconst_0       
        //   509: invokespecial   com/whatsapp/SettingsChat.a:(Landroid/net/Uri;III)V
        //   512: aload           4
        //   514: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   517: aload           15
        //   519: ifnull          171
        //   522: aload           15
        //   524: invokeinterface android/database/Cursor.close:()V
        //   529: return         
        //   530: astore          49
        //   532: aload           49
        //   534: athrow         
        //   535: astore          50
        //   537: aload           50
        //   539: athrow         
        //   540: astore          51
        //   542: aload           51
        //   544: athrow         
        //   545: astore          45
        //   547: aload           45
        //   549: athrow         
        //   550: astore          46
        //   552: aload           46
        //   554: athrow         
        //   555: astore          47
        //   557: aload           47
        //   559: athrow         
        //   560: astore          40
        //   562: aload           40
        //   564: athrow         
        //   565: astore          41
        //   567: aload           41
        //   569: athrow         
        //   570: astore          42
        //   572: aload           42
        //   574: athrow         
        //   575: astore          43
        //   577: aload           43
        //   579: athrow         
        //   580: astore          30
        //   582: aload           30
        //   584: athrow         
        //   585: astore          26
        //   587: aload           15
        //   589: ifnull          599
        //   592: aload           15
        //   594: invokeinterface android/database/Cursor.close:()V
        //   599: aload           26
        //   601: athrow         
        //   602: astore          36
        //   604: aload           36
        //   606: athrow         
        //   607: astore          34
        //   609: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   612: bipush          21
        //   614: aaload         
        //   615: aload           34
        //   617: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   620: aload           4
        //   622: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   625: aload           15
        //   627: ifnull          637
        //   630: aload           15
        //   632: invokeinterface android/database/Cursor.close:()V
        //   637: new             Ljava/lang/StringBuilder;
        //   640: dup            
        //   641: invokespecial   java/lang/StringBuilder.<init>:()V
        //   644: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   647: bipush          10
        //   649: aaload         
        //   650: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   653: aload           6
        //   655: getfield        android/graphics/Point.x:I
        //   658: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   661: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   664: iconst_5       
        //   665: aaload         
        //   666: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   669: aload           6
        //   671: getfield        android/graphics/Point.y:I
        //   674: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   677: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   680: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   683: new             Landroid/content/Intent;
        //   686: dup            
        //   687: aload_0        
        //   688: ldc_w           Lcom/whatsapp/wallpaper/CropImage;.class
        //   691: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   694: astore          16
        //   696: aload           16
        //   698: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   701: bipush          18
        //   703: aaload         
        //   704: aload           6
        //   706: getfield        android/graphics/Point.x:I
        //   709: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   712: pop            
        //   713: aload           16
        //   715: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   718: bipush          19
        //   720: aaload         
        //   721: aload           6
        //   723: getfield        android/graphics/Point.y:I
        //   726: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   729: pop            
        //   730: aload           16
        //   732: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   735: bipush          9
        //   737: aaload         
        //   738: iconst_1       
        //   739: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   742: pop            
        //   743: aload           16
        //   745: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   748: bipush          22
        //   750: aaload         
        //   751: iconst_1       
        //   752: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   755: pop            
        //   756: aload           16
        //   758: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   761: bipush          17
        //   763: aaload         
        //   764: iconst_1       
        //   765: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   768: pop            
        //   769: aload           16
        //   771: aload_3        
        //   772: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   775: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   778: pop            
        //   779: aload           16
        //   781: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   784: iconst_0       
        //   785: aaload         
        //   786: invokestatic    com/whatsapp/wallpaper/h.a:()Landroid/net/Uri;
        //   789: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   792: pop            
        //   793: aload           16
        //   795: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   798: bipush          13
        //   800: aaload         
        //   801: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   804: invokevirtual   android/graphics/Bitmap$CompressFormat.toString:()Ljava/lang/String;
        //   807: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   810: pop            
        //   811: aload_0        
        //   812: aload           16
        //   814: bipush          18
        //   816: invokevirtual   com/whatsapp/SettingsChat.startActivityForResult:(Landroid/content/Intent;I)V
        //   819: iload           5
        //   821: ifeq            164
        //   824: aload_3        
        //   825: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   828: bipush          12
        //   830: aaload         
        //   831: iconst_0       
        //   832: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //   835: istore          7
        //   837: iload           7
        //   839: ifeq            928
        //   842: new             Ljava/lang/StringBuilder;
        //   845: dup            
        //   846: invokespecial   java/lang/StringBuilder.<init>:()V
        //   849: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   852: bipush          7
        //   854: aaload         
        //   855: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   858: iload           7
        //   860: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   863: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   866: bipush          20
        //   868: aaload         
        //   869: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   872: aload           6
        //   874: getfield        android/graphics/Point.x:I
        //   877: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   880: ldc_w           ","
        //   883: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   886: aload           6
        //   888: getfield        android/graphics/Point.y:I
        //   891: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   894: ldc_w           "]"
        //   897: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   900: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   903: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   906: aload_0        
        //   907: aconst_null    
        //   908: iload           7
        //   910: aload           6
        //   912: getfield        android/graphics/Point.x:I
        //   915: aload           6
        //   917: getfield        android/graphics/Point.y:I
        //   920: invokespecial   com/whatsapp/SettingsChat.a:(Landroid/net/Uri;III)V
        //   923: iload           5
        //   925: ifeq            164
        //   928: aload_3        
        //   929: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   932: iconst_3       
        //   933: aaload         
        //   934: iconst_0       
        //   935: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   938: istore          12
        //   940: iload           12
        //   942: ifeq            978
        //   945: aload_0        
        //   946: invokestatic    com/whatsapp/wallpaper/h.a:(Landroid/content/Context;)V
        //   949: aload_0        
        //   950: invokevirtual   com/whatsapp/SettingsChat.getBaseContext:()Landroid/content/Context;
        //   953: aload_0        
        //   954: ldc_w           2131231954
        //   957: invokevirtual   com/whatsapp/SettingsChat.getString:(I)Ljava/lang/String;
        //   960: iconst_0       
        //   961: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;I)V
        //   964: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   967: bipush          15
        //   969: aaload         
        //   970: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   973: iload           5
        //   975: ifeq            164
        //   978: aload_3        
        //   979: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //   982: bipush          8
        //   984: aaload         
        //   985: iconst_0       
        //   986: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   989: istore          13
        //   991: iload           13
        //   993: ifeq            1028
        //   996: aload_0        
        //   997: invokestatic    com/whatsapp/wallpaper/h.e:(Landroid/content/Context;)V
        //  1000: aload_0        
        //  1001: invokevirtual   com/whatsapp/SettingsChat.getBaseContext:()Landroid/content/Context;
        //  1004: aload_0        
        //  1005: ldc             2131231955
        //  1007: invokevirtual   com/whatsapp/SettingsChat.getString:(I)Ljava/lang/String;
        //  1010: iconst_0       
        //  1011: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;I)V
        //  1014: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //  1017: bipush          11
        //  1019: aaload         
        //  1020: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1023: iload           5
        //  1025: ifeq            164
        //  1028: aload_0        
        //  1029: invokevirtual   com/whatsapp/SettingsChat.getBaseContext:()Landroid/content/Context;
        //  1032: aload_0        
        //  1033: ldc_w           2131231094
        //  1036: invokevirtual   com/whatsapp/SettingsChat.getString:(I)Ljava/lang/String;
        //  1039: iconst_0       
        //  1040: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;I)V
        //  1043: new             Ljava/lang/StringBuilder;
        //  1046: dup            
        //  1047: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1050: getstatic       com/whatsapp/SettingsChat.z:[Ljava/lang/String;
        //  1053: iconst_4       
        //  1054: aaload         
        //  1055: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1058: aload_3        
        //  1059: invokevirtual   android/content/Intent.toString:()Ljava/lang/String;
        //  1062: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1065: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1068: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1071: goto            164
        //  1074: astore          11
        //  1076: aload           11
        //  1078: athrow         
        //  1079: aload           4
        //  1081: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  1084: goto            625
        //  1087: astore          33
        //  1089: aload           4
        //  1091: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  1094: aload           33
        //  1096: athrow         
        //  1097: astore          25
        //  1099: aload           25
        //  1101: athrow         
        //  1102: astore          27
        //  1104: aload           27
        //  1106: athrow         
        //  1107: astore          14
        //  1109: aload           14
        //  1111: athrow         
        //  1112: astore          8
        //  1114: aload           8
        //  1116: athrow         
        //  1117: astore          9
        //  1119: aload           9
        //  1121: athrow         
        //  1122: astore          10
        //  1124: aload           10
        //  1126: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  16     28     172    177    Ljava/io/FileNotFoundException;
        //  33     55     177    182    Ljava/io/FileNotFoundException;
        //  55     91     182    187    Ljava/io/FileNotFoundException;
        //  91     127    187    192    Ljava/io/FileNotFoundException;
        //  174    177    177    182    Ljava/io/FileNotFoundException;
        //  197    217    530    545    Ljava/io/FileNotFoundException;
        //  231    237    545    550    Ljava/io/FileNotFoundException;
        //  242    253    550    560    Ljava/io/FileNotFoundException;
        //  262    275    560    565    Ljava/io/FileNotFoundException;
        //  280    295    565    580    Ljava/io/FileNotFoundException;
        //  374    397    585    602    Any
        //  402    422    580    585    Ljava/io/FileNotFoundException;
        //  402    422    585    602    Any
        //  427    442    585    602    Any
        //  442    454    607    625    Ljava/io/FileNotFoundException;
        //  442    454    1087   1097   Any
        //  458    494    602    607    Ljava/io/FileNotFoundException;
        //  458    494    1087   1097   Any
        //  501    512    607    625    Ljava/io/FileNotFoundException;
        //  501    512    1087   1097   Any
        //  512    517    585    602    Any
        //  532    535    535    545    Ljava/io/FileNotFoundException;
        //  537    540    540    545    Ljava/io/FileNotFoundException;
        //  542    545    545    550    Ljava/io/FileNotFoundException;
        //  547    550    550    560    Ljava/io/FileNotFoundException;
        //  552    555    555    560    Ljava/io/FileNotFoundException;
        //  557    560    560    565    Ljava/io/FileNotFoundException;
        //  562    565    565    580    Ljava/io/FileNotFoundException;
        //  567    570    570    580    Ljava/io/FileNotFoundException;
        //  572    575    575    580    Ljava/io/FileNotFoundException;
        //  582    585    585    602    Any
        //  592    599    1102   1107   Ljava/io/FileNotFoundException;
        //  604    607    607    625    Ljava/io/FileNotFoundException;
        //  604    607    1087   1097   Any
        //  609    620    1087   1097   Any
        //  620    625    585    602    Any
        //  630    637    1097   1102   Ljava/io/FileNotFoundException;
        //  842    923    1107   1112   Ljava/io/FileNotFoundException;
        //  928    940    1112   1117   Ljava/io/FileNotFoundException;
        //  945    973    1117   1122   Ljava/io/FileNotFoundException;
        //  978    991    1122   1127   Ljava/io/FileNotFoundException;
        //  996    1023   1074   1079   Ljava/io/FileNotFoundException;
        //  1028   1071   1074   1079   Ljava/io/FileNotFoundException;
        //  1079   1084   585    602    Any
        //  1089   1097   585    602    Any
        //  1109   1112   1112   1117   Ljava/io/FileNotFoundException;
        //  1114   1117   1117   1122   Ljava/io/FileNotFoundException;
        //  1119   1122   1122   1127   Ljava/io/FileNotFoundException;
        //  1124   1127   1074   1079   Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 519, Size: 519
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
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131099656);
        final CheckBoxPreference checkBoxPreference = (CheckBoxPreference)this.findPreference((CharSequence)SettingsChat.z[30]);
        checkBoxPreference.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new alw(this, checkBoxPreference));
        this.findPreference((CharSequence)SettingsChat.z[34]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new ab(this));
        final ListPreference listPreference = (ListPreference)this.findPreference((CharSequence)SettingsChat.z[36]);
        listPreference.setTitle((CharSequence)this.getString(2131231694, new Object[] { listPreference.getEntry() }));
        listPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new a_j(this));
        this.findPreference((CharSequence)SettingsChat.z[35]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new awe(this));
        this.findPreference((CharSequence)SettingsChat.z[31]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new me(this));
        final Preference preference = this.findPreference((CharSequence)SettingsChat.z[37]);
        Label_0209: {
            if (!GoogleDriveService.am()) {
                this.b();
                preference.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new bd(this));
                if (!App.I) {
                    break Label_0209;
                }
            }
            preference.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new a8w(this));
        }
        this.findPreference((CharSequence)SettingsChat.z[39]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new a6p(this));
        this.findPreference((CharSequence)SettingsChat.z[38]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new ara(this));
        final Preference preference2 = this.findPreference((CharSequence)SettingsChat.z[33]);
        final int h = z8.h();
        final int a = z8.a();
        int title;
        if (h > 0 || a == 0) {
            title = 2131230820;
        }
        else {
            title = 2131231863;
        }
        preference2.setTitle(title);
        this.findPreference((CharSequence)SettingsChat.z[32]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new alj(this));
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        boolean indeterminate = true;
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 600: {
                return a((Context)this);
            }
            case 3: {
                return new AlertDialog$Builder((Context)this).setMessage(2131230897).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new aqh(this)).setNegativeButton(2131230874, null).create();
            }
            case 4: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231008).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new aqf(this)).setNegativeButton(2131230874, null).create();
            }
            case 5: {
                if (z8.h() <= 0) {
                    indeterminate = false;
                }
                final vw vw = new vw(this, indeterminate);
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
                int message;
                if (indeterminate) {
                    message = 2131230821;
                }
                else {
                    message = 2131231864;
                }
                return alertDialog$Builder.setMessage(message).setPositiveButton(2131231435, (DialogInterface$OnClickListener)vw).setNegativeButton(2131230874, null).create();
            }
            case 6: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setTitle((CharSequence)this.getString(2131231497));
                progressDialog.setMessage((CharSequence)this.getString(2131231591));
                progressDialog.setIndeterminate(indeterminate);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 19: {
                if (this.h == null) {
                    return super.onCreateDialog(n);
                }
                final a_9 e = App.S.e(this.h);
                return new AlertDialog$Builder((Context)this).setMessage(2131231049).setPositiveButton(2131230831, (DialogInterface$OnClickListener)new asl(this, e)).setNeutralButton(2131231976, (DialogInterface$OnClickListener)new ex(this, e)).create();
            }
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.b();
    }
}
