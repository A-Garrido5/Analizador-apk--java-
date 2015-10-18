// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.app.AlertDialog;
import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.app.Activity;
import android.net.Uri;
import android.content.Intent;
import com.whatsapp.messaging.MessageService;
import android.widget.ImageView;
import android.support.v4.view.ViewCompat;
import android.widget.TextView;
import com.whatsapp.util.Log;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Handler;
import android.view.View$OnClickListener;
import android.widget.RadioButton;

public class AccountInfoActivity extends DialogToastActivity
{
    private static final String[] B;
    private RadioButton A;
    private View$OnClickListener k;
    private View$OnClickListener l;
    private RadioButton m;
    private String n;
    private View$OnClickListener o;
    private a_e p;
    private View$OnClickListener q;
    private boolean r;
    private final a9q s;
    private kf t;
    private View$OnClickListener u;
    private RadioButton v;
    private Handler w;
    private View$OnClickListener x;
    private Runnable y;
    private boolean z;
    
    static {
        final String[] b = new String[57];
        String s = "(w^\u007f\t\tp\u0003i\u0011\u0018*\u001em\u0015";
        int n = -1;
        String[] array = b;
        int n2 = 0;
        String intern = null;
    Label_1457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'a';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = '\u0004';
                        break;
                    }
                    case 2: {
                        c2 = 'p';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\r|\u0000a\u0013\tp\u0019g\u000f7`\u0011|\u0004";
                    n2 = 1;
                    array = b;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_l\b\th\u001foA\u001ba\u0002~\b\u000ba]m\u0019\u001ca\u001e{\b\u0007j]z\u000e\u0004h\u0012i\u0002\u0003";
                    n2 = 2;
                    array = b;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = b;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_l\b\th\u001foA\u001ba\u0002~\b\u000ba]m\u0019\u001ca\u001e{\b\u0007j]d\b\u000ea\u0004a\f\r";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_l\b\th\u001foA\u001ba\u0002~\b\u000ba]m\u0019\u001ca\u001e{\b\u0007j]m\u0019\u0018m\u0002m\u0005";
                    n = 3;
                    n2 = 4;
                    array = b;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = b;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_l\b\th\u001foA\u001ba\u0002~\b\u000ba]m\u0019\u001ca\u001e{\b\u0007j]x\u0000\u0011i\u0015f\u0015";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_l\b\th\u001foA\u001ba\u0002~\b\u000ba]m\u0019\u001ca\u001e{\b\u0007j]i\u0002\u001cm\u0006m";
                    n = 5;
                    array = b;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_z\u0004\u000ev\u0015{\t\u0001j\u0016gA\u001dj\u0011j\r\r$\u0004gA\u000em\u001elA\u0018e\te\u0004\u0006pPx\u0000\u0006a\u001c(\u0017\u0001a\u0007&";
                    n = 6;
                    array = b;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "\u0004m\u0003|\\MwVx\u0014\u001ag\u0018i\u0012\rvM-\u0012Nw\u0015d\u0007U!\u0003";
                    n = 7;
                    n2 = 8;
                    array = b;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = b;
                    s = "\u001cv\u0005m";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_l\u0000\u001ceP";
                    n = 9;
                    array = b;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u000ee\u001c{\u0004";
                    n = 10;
                    array = b;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u000bk\u001e|\u0000\u000bp";
                    n = 11;
                    array = b;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "(w^\u007f\t\tp\u0003i\u0011\u0018*\u001em\u0015";
                    n = 12;
                    array = b;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "Hv\u0015{\u0014\u0004pM";
                    n = 13;
                    array = b;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "(w^\u007f\t\tp\u0003i\u0011\u0018*\u001em\u0015";
                    n = 14;
                    array = b;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "H`\u0011|\u0000U";
                    n = 15;
                    array = b;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u000bk\u001e|\u0000\u000bp";
                    n = 16;
                    array = b;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_i\u0002\u001cm\u0006a\u0015\u0011)\u0002m\u0012\u001dh\u0004(\u0013\ru\u0005m\u0012\u001c9";
                    n = 17;
                    array = b;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_i\u0002\u001cm\u0006a\u0015\u0011)\u0002m\u0012\u001dh\u0004'\u0004\u0010g\u0015x\u0015\u0001k\u001e";
                    n = 18;
                    array = b;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_j\b\u0004h\u0019f\u0006Gi\u0011z\n\rp_x\u0014\u001ag\u0018i\u0012\r$\u0003c\u0014H";
                    n = 19;
                    array = b;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_{\u0015\u0007tP";
                    n = 20;
                    array = b;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "(w^\u007f\t\tp\u0003i\u0011\u0018*\u001em\u0015";
                    n = 21;
                    array = b;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\tj\u0014z\u000e\u0001`^a\u000f\u001ca\u001e|O\r|\u0004z\u0000FP5P5";
                    n = 22;
                    array = b;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\tj\u0014z\u000e\u0001`^a\u000f\u001ca\u001e|O\r|\u0004z\u0000FW%J+-G$";
                    n = 23;
                    array = b;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\tj\u0014z\u000e\u0001`^a\u000f\u001ca\u001e|O\tg\u0004a\u000e\u0006*#M/,";
                    n = 24;
                    array = b;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0000p\u0004x\u0012R+_\u007f\u0016\u001f*\u0007`\u0000\u001cw\u0011x\u0011Fg\u001feN\u0018e\te\u0004\u0006p\u0003'\u0002\u0003w\u0005e>\u0018e\t&\u0011\u0000t";
                    n = 25;
                    array = b;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u001ca\b|N\u0018h\u0011a\u000f";
                    n = 26;
                    array = b;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0002m\u0014";
                    n = 27;
                    array = b;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\tf\u0013";
                    n = 28;
                    array = b;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "Nw\u001b}\\";
                    n = 29;
                    array = b;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "Nh\u00175";
                    n = 30;
                    array = b;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "Nb\u0002g\fU";
                    n = 31;
                    array = b;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "Ng\u001b{\u0014\u00059";
                    n = 32;
                    array = b;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "Wt\u0018g\u000f\r9";
                    n = 33;
                    array = b;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "Nh\u00135";
                    n = 34;
                    array = b;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_x\u0000\u001dw\u0015(";
                    n = 35;
                    array = b;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_l\u0004\u001bp\u0002g\u0018";
                    n = 36;
                    array = b;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "(w^\u007f\t\tp\u0003i\u0011\u0018*\u001em\u0015";
                    n = 37;
                    array = b;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u0002m\u0014";
                    n = 38;
                    array = b;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "(w^\u007f\t\tp\u0003i\u0011\u0018*\u001em\u0015";
                    n = 39;
                    array = b;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_k\u0013\re\u0004mA\nq\u001el\r\r9";
                    n = 40;
                    array = b;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "\nq\t";
                    n = 41;
                    array = b;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_k\u0013\re\u0004mN\u0002m\u0014(\b\u0006g\u001fz\u0013\rg\u0004(\u0007\u0007v\u001di\u0015H";
                    n = 42;
                    array = b;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_g\u000fEg\u0002m\u0000\u001ca_x\u0004\u001ab\u001fz\fEg\u001ca\u0002\u0003";
                    n = 43;
                    array = b;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_k\u0013\re\u0004mN\u001aa\u0013g\u000f\u0006a\u0013|N\u0007r\u0015z\u0013\u0001`\u0015%\u0004\u0010t\u0019z\u0004\f";
                    n = 44;
                    array = b;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "Hm\u001e|\u0004\u0006pM";
                    n = 45;
                    array = b;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "\u000bk\u001e|\u0000\u000bp";
                    n = 46;
                    array = b;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_z\u0004\u001bq\u001dmA";
                    n = 47;
                    array = b;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\tj\u0014z\u000e\u0001`^a\u000f\u001ca\u001e|O\tg\u0004a\u000e\u0006*&A$?";
                    n = 48;
                    array = b;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_j\b\u0004h\u0019f\u0006Gs\u0015j\u0012\u0001p\u0015'\u0011\u001dv\u0013`\u0000\u001baP}\u0013\u0004$";
                    n = 49;
                    array = b;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "\u0000p\u0004x\u0012R+_\u007f\u0016\u001f*\u0007`\u0000\u001cw\u0011x\u0011Fg\u001feN\u0018e\te\u0004\u0006p\u0003'\u0006\u0007k\u0017d\u0004Ft\u0018x";
                    n = 50;
                    array = b;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_{\u0015\tv\u0004(";
                    n = 51;
                    array = b;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "\u0000p\u0004x\u0012R+_\u007f\u0016\u001f*\u0007`\u0000\u001cw\u0011x\u0011Fg\u001feN\u0018e\te\u0004\u0006p\u0003'\u0000\u0006`\u0002g\b\f*\u0000`\u0011";
                    n = 52;
                    array = b;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "\tj\u0014z\u000e\u0001`^a\u000f\u001ca\u001e|O\tg\u0004a\u000e\u0006*&A$?";
                    n = 53;
                    array = b;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "\tg\u0013g\u0014\u0006p]a\u000f\u000ek_j\b\u0004h\u0019f\u0006Gs\u0015j\u0012\u0001p\u0015'\u0011\u001dv\u0013`\u0000\u001baP}\u0013\u0004$";
                    n = 54;
                    array = b;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "(w^\u007f\t\tp\u0003i\u0011\u0018*\u001em\u0015";
                    n = 55;
                    array = b;
                    continue;
                }
                case 55: {
                    break Label_1457;
                }
            }
        }
        array[n2] = intern;
        B = b;
    }
    
    public AccountInfoActivity() {
        this.r = false;
        this.s = new a9q();
        this.p = new a_g(this);
        this.t = new mi(this);
        this.u = (View$OnClickListener)new aa6(this);
        this.x = (View$OnClickListener)new arp(this);
        this.o = (View$OnClickListener)new nq(this);
        this.l = (View$OnClickListener)new a2g(this);
        this.k = (View$OnClickListener)new aqm(this);
        this.q = (View$OnClickListener)new ka(this);
        this.w = new au(this);
    }
    
    private Dialog a(final int n, final Runnable runnable) {
        return new AlertDialog$Builder((Context)this).setMessage(this.j()).setPositiveButton(2131231501, (DialogInterface$OnClickListener)new aom(this, n, runnable)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new ya(this, n)).create();
    }
    
    static View$OnClickListener a(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.l;
    }
    
    static Runnable a(final AccountInfoActivity accountInfoActivity, final Runnable y) {
        return accountInfoActivity.y = y;
    }
    
    private String a() {
        try {
            if (this.A.isChecked()) {
                return "5";
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (this.v.isChecked()) {
                return "3";
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return "1";
    }
    
    static String a(final AccountInfoActivity accountInfoActivity, final String n) {
        return accountInfoActivity.n = n;
    }
    
    private String a(final String s, final String s2, final boolean b) {
        while (true) {
            while (true) {
                try {
                    final String s3 = AccountInfoActivity.B[8];
                    final Object[] array = { s2, s, null };
                    if (b) {
                        final String s4 = AccountInfoActivity.B[11];
                        array[2] = s4;
                        final String format = String.format(s3, array);
                        Log.i(AccountInfoActivity.B[10] + format);
                        return format;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final String s4 = AccountInfoActivity.B[9];
                continue;
            }
        }
    }
    
    static void a(final AccountInfoActivity accountInfoActivity, final String s, final Runnable runnable) {
        accountInfoActivity.a(s, runnable);
    }
    
    private void a(final String s) {
        this.findViewById(2131755132).setVisibility(8);
        this.findViewById(2131755134).setVisibility(0);
        final a_9 e = App.S.e(s + AccountInfoActivity.B[56]);
        Log.b(e != null);
        ((TextView)this.findViewById(2131755137)).setText((CharSequence)e.a((Context)this));
        ViewCompat.setLayoutDirection(this.findViewById(2131755137), 3);
        ((TextView)this.findViewById(2131755139)).setText((CharSequence)a_9.a(s));
        ViewCompat.setLayoutDirection(this.findViewById(2131755139), 0);
        this.s.b(e, (ImageView)this.findViewById(2131755135));
    }
    
    private void a(final String p0, final Runnable p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: ldc_w           2131230767
        //     4: invokevirtual   com/whatsapp/AccountInfoActivity.c:(I)V
        //     7: aload_0        
        //     8: getfield        com/whatsapp/AccountInfoActivity.w:Landroid/os/Handler;
        //    11: bipush          10
        //    13: ldc2_w          32000
        //    16: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //    19: pop            
        //    20: iconst_1       
        //    21: anewarray       Ljava/lang/String;
        //    24: astore          4
        //    26: aload           4
        //    28: iconst_0       
        //    29: new             Ljava/lang/StringBuilder;
        //    32: dup            
        //    33: invokespecial   java/lang/StringBuilder.<init>:()V
        //    36: aload_1        
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //    43: iconst_0       
        //    44: aaload         
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    51: aastore        
        //    52: aload           4
        //    54: invokestatic    com/whatsapp/App.d:([Ljava/lang/String;)Z
        //    57: istore          7
        //    59: iload           7
        //    61: ifne            118
        //    64: aload_0        
        //    65: getfield        com/whatsapp/AccountInfoActivity.w:Landroid/os/Handler;
        //    68: bipush          10
        //    70: invokevirtual   android/os/Handler.removeMessages:(I)V
        //    73: aload_0        
        //    74: invokevirtual   com/whatsapp/AccountInfoActivity.c:()V
        //    77: iconst_1       
        //    78: anewarray       Ljava/lang/Object;
        //    81: astore          8
        //    83: aload           8
        //    85: iconst_0       
        //    86: aload_0        
        //    87: ldc_w           2131230921
        //    90: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I)Ljava/lang/String;
        //    93: aastore        
        //    94: aload_0        
        //    95: aload_0        
        //    96: ldc_w           2131231532
        //    99: aload           8
        //   101: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   104: invokevirtual   com/whatsapp/AccountInfoActivity.f:(Ljava/lang/String;)V
        //   107: aload_0        
        //   108: aconst_null    
        //   109: putfield        com/whatsapp/AccountInfoActivity.y:Ljava/lang/Runnable;
        //   112: getstatic       com/whatsapp/App.I:Z
        //   115: ifeq            134
        //   118: aload_0        
        //   119: aload_2        
        //   120: putfield        com/whatsapp/AccountInfoActivity.y:Ljava/lang/Runnable;
        //   123: return         
        //   124: astore          5
        //   126: aload           5
        //   128: athrow         
        //   129: astore          6
        //   131: aload           6
        //   133: athrow         
        //   134: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  26     59     124    129    Ljava/lang/IllegalStateException;
        //  64     118    129    134    Ljava/lang/IllegalStateException;
        //  118    123    129    134    Ljava/lang/IllegalStateException;
        //  126    129    129    134    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0118:
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
    
    private boolean a(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore          4
        //     7: aload_0        
        //     8: ldc_w           2131755139
        //    11: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //    14: checkcast       Landroid/widget/TextView;
        //    17: astore          5
        //    19: aload           5
        //    21: iconst_3       
        //    22: invokestatic    android/support/v4/view/ViewCompat.setLayoutDirection:(Landroid/view/View;I)V
        //    25: aload           5
        //    27: aload_0        
        //    28: invokevirtual   com/whatsapp/AccountInfoActivity.getResources:()Landroid/content/res/Resources;
        //    31: ldc_w           2131624045
        //    34: invokevirtual   android/content/res/Resources.getColor:(I)I
        //    37: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //    40: lload_1        
        //    41: lconst_0       
        //    42: lcmp           
        //    43: ifne            114
        //    46: aload_0        
        //    47: ldc_w           2131230779
        //    50: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I)Ljava/lang/String;
        //    53: astore          6
        //    55: aload           5
        //    57: aload           6
        //    59: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    62: aload_0        
        //    63: ldc_w           2131755141
        //    66: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //    69: astore          7
        //    71: aload           7
        //    73: ifnull          103
        //    76: iload_3        
        //    77: ifeq            92
        //    80: aload           7
        //    82: bipush          8
        //    84: invokevirtual   android/view/View.setVisibility:(I)V
        //    87: iload           4
        //    89: ifeq            112
        //    92: aload           7
        //    94: iconst_0       
        //    95: invokevirtual   android/view/View.setVisibility:(I)V
        //    98: iload           4
        //   100: ifeq            112
        //   103: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //   106: bipush          7
        //   108: aaload         
        //   109: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   112: iload_3        
        //   113: ireturn        
        //   114: lload_1        
        //   115: ldc2_w          4444444444000
        //   118: lcmp           
        //   119: iflt            136
        //   122: aload_0        
        //   123: ldc_w           2131231266
        //   126: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I)Ljava/lang/String;
        //   129: astore          6
        //   131: iconst_1       
        //   132: istore_3       
        //   133: goto            55
        //   136: lload_1        
        //   137: invokestatic    java/lang/System.currentTimeMillis:()J
        //   140: lsub           
        //   141: lconst_0       
        //   142: lcmp           
        //   143: ifge            175
        //   146: aload           5
        //   148: aload_0        
        //   149: invokevirtual   com/whatsapp/AccountInfoActivity.getResources:()Landroid/content/res/Resources;
        //   152: ldc_w           2131624035
        //   155: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   158: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   161: aload_0        
        //   162: ldc_w           2131230778
        //   165: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I)Ljava/lang/String;
        //   168: astore          6
        //   170: iconst_0       
        //   171: istore_3       
        //   172: goto            55
        //   175: invokestatic    java/text/SimpleDateFormat.getDateInstance:()Ljava/text/DateFormat;
        //   178: new             Ljava/util/Date;
        //   181: dup            
        //   182: lload_1        
        //   183: invokespecial   java/util/Date.<init>:(J)V
        //   186: invokevirtual   java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //   189: astore          6
        //   191: iconst_0       
        //   192: istore_3       
        //   193: goto            55
        //   196: astore          9
        //   198: aload           9
        //   200: athrow         
        //   201: astore          8
        //   203: aload           8
        //   205: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  80     87     196    201    Ljava/lang/IllegalStateException;
        //  92     98     201    206    Ljava/lang/IllegalStateException;
        //  103    112    201    206    Ljava/lang/IllegalStateException;
        //  198    201    201    206    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0092:
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
    
    static RadioButton b(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.A;
    }
    
    private String b(final String s, final String s2, final boolean b) {
        while (true) {
            final String string = this.n + AccountInfoActivity.B[29];
            final String b2 = all.b();
            final String c = all.c();
            while (true) {
                try {
                    final StringBuilder append = new StringBuilder().append(s).append(AccountInfoActivity.B[34]).append(this.n).append(AccountInfoActivity.B[33]).append(al5.d(string)).append(AccountInfoActivity.B[30]).append(s2).append(AccountInfoActivity.B[31]).append(b2).append(AccountInfoActivity.B[35]).append(c);
                    if (b) {
                        final String string2 = AccountInfoActivity.B[32] + App.aX.jabber_id;
                        return append.append(string2).toString();
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final String string2 = "";
                continue;
            }
        }
    }
    
    private void b() {
        MessageService.a((Context)this, true, true);
        final String b = this.b(AccountInfoActivity.B[51], this.a(), this.z);
        Log.i(AccountInfoActivity.B[50] + b);
        final Intent intent = new Intent(AccountInfoActivity.B[49]);
        intent.setData(Uri.parse(b));
        this.startActivity(intent);
    }
    
    static void b(final AccountInfoActivity accountInfoActivity, final String s) {
        accountInfoActivity.a(s);
    }
    
    static Runnable c(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.y;
    }
    
    static void d(final AccountInfoActivity accountInfoActivity) {
        accountInfoActivity.g();
    }
    
    private void e() {
        MessageService.a((Context)this, true, true);
        final String b = this.b(AccountInfoActivity.B[53], this.a(), this.z);
        Log.i(AccountInfoActivity.B[55] + b);
        final Intent intent = new Intent(AccountInfoActivity.B[54]);
        intent.setData(Uri.parse(b));
        this.startActivity(intent);
    }
    
    static void e(final AccountInfoActivity accountInfoActivity) {
        accountInfoActivity.e();
    }
    
    static RadioButton f(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.m;
    }
    
    private boolean f() {
        return this.a(ade.a(AccountInfoActivity.B[1]));
    }
    
    private void g() {
        final String a = this.a();
        final String string = this.getString(2131230777);
        String s = null;
        Label_0107: {
            if (this.z) {
                final a_9 e = App.S.e(this.n + AccountInfoActivity.B[22]);
                Log.b(e != null);
                s = this.getString(2131231449, new Object[] { e.a((Context)this) });
                if (!App.I) {
                    break Label_0107;
                }
            }
            s = this.getString(2131230776);
        }
        a8q.a(new Intent(AccountInfoActivity.B[25]).setType(AccountInfoActivity.B[27]).putExtra(AccountInfoActivity.B[24], string).putExtra(AccountInfoActivity.B[23], s + " " + this.b(AccountInfoActivity.B[26], a, false)), this, this, this.getString(2131231637));
    }
    
    static void g(final AccountInfoActivity accountInfoActivity) {
        accountInfoActivity.l();
    }
    
    private void h() {
        this.findViewById(2131755132).setVisibility(0);
        this.findViewById(2131755134).setVisibility(8);
        this.n = null;
    }
    
    static boolean h(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.f();
    }
    
    static String i(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.n;
    }
    
    private boolean i() {
        final long b = ade.b();
        if (b != 0L) {
            try {
                if (b - System.currentTimeMillis() < 31104000000L) {
                    return true;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            return false;
        }
        return true;
    }
    
    static RadioButton j(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.v;
    }
    
    private String j() {
        final long n = ade.b() - System.currentTimeMillis();
        long n2 = n % 31536000000L;
        final int n3 = (int)(n / 3.1536E10);
        int n4;
        if (n3 == 0) {
            n2 = 0L;
            n4 = 1;
        }
        else {
            n4 = n3;
        }
        int n5;
        if (n2 < 86400000L) {
            n5 = 2131296258;
        }
        else {
            n5 = 2131296257;
        }
        return String.format(App.C.a(n5, n4), n4) + " " + this.getString(2131230768);
    }
    
    private boolean k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/AccountInfoActivity.n:Ljava/lang/String;
        //     4: ifnonnull       37
        //     7: iconst_1       
        //     8: anewarray       Ljava/lang/Object;
        //    11: astore          4
        //    13: aload           4
        //    15: iconst_0       
        //    16: aload_0        
        //    17: ldc_w           2131231446
        //    20: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I)Ljava/lang/String;
        //    23: aastore        
        //    24: aload_0        
        //    25: aload_0        
        //    26: ldc_w           2131231447
        //    29: aload           4
        //    31: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    34: invokevirtual   com/whatsapp/AccountInfoActivity.f:(Ljava/lang/String;)V
        //    37: aload_0        
        //    38: getfield        com/whatsapp/AccountInfoActivity.n:Ljava/lang/String;
        //    41: astore_3       
        //    42: aload_3        
        //    43: ifnonnull       54
        //    46: iconst_1       
        //    47: ireturn        
        //    48: astore_1       
        //    49: aload_1        
        //    50: athrow         
        //    51: astore_2       
        //    52: aload_2        
        //    53: athrow         
        //    54: iconst_0       
        //    55: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      37     48     51     Ljava/lang/IllegalStateException;
        //  37     42     51     54     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    static boolean k(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.k();
    }
    
    private void l() {
        final String a = this.a();
        Log.i(AccountInfoActivity.B[20] + a);
        this.c(2131231523);
        this.w.sendEmptyMessageDelayed(8, 32000L);
        App.X.a(a, this.a(App.aX.jabber_id, this.n, this.z));
    }
    
    static boolean l(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.i();
    }
    
    static void m(final AccountInfoActivity accountInfoActivity) {
        accountInfoActivity.b();
    }
    
    static boolean n(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.z;
    }
    
    static Handler o(final AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.w;
    }
    
    @Override
    public void b(final int n) {
        switch (n) {
            case 2131231045: {
                try {
                    Label_0051: {
                        if (this.getIntent().getStringExtra(AccountInfoActivity.B[28]) == null) {
                            break Label_0051;
                        }
                        try {
                            this.finish();
                            if (App.I) {
                                this.h();
                                return;
                            }
                            break;
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
                break;
            }
        }
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final boolean i = App.I;
        Log.i(AccountInfoActivity.B[18] + n + AccountInfoActivity.B[14] + n2 + AccountInfoActivity.B[16] + intent);
    Label_0121_Outer:
        while (true) {
            while (true) {
                switch (n) {
                    default: {
                        break Label_0080;
                    }
                    case 10001: {
                        Label_0088: {
                            break Label_0088;
                            try {
                                super.onActivityResult(n, n2, intent);
                                return;
                                try {
                                    App.X.a(n2, intent);
                                    return;
                                }
                                catch (IllegalStateException ex2) {
                                    final String[] array = AccountInfoActivity.B;
                                    final int n3 = 19;
                                    final String s = array[n3];
                                    final IllegalStateException ex = ex2;
                                    Log.b(s, ex);
                                    final AccountInfoActivity accountInfoActivity = this;
                                    final int n4 = 6;
                                    accountInfoActivity.showDialog(n4);
                                    final boolean b = i;
                                    if (!b) {
                                        return;
                                    }
                                }
                                try {
                                    final String[] array = AccountInfoActivity.B;
                                    final int n3 = 19;
                                    final String s = array[n3];
                                    final IllegalStateException ex2;
                                    final IllegalStateException ex = ex2;
                                    Log.b(s, ex);
                                    final AccountInfoActivity accountInfoActivity = this;
                                    final int n4 = 6;
                                    accountInfoActivity.showDialog(n4);
                                    final boolean b = i;
                                    if (!b) {
                                        return;
                                    }
                                    if (n2 != -1) {
                                        return;
                                    }
                                    final String stringExtra = intent.getStringExtra(AccountInfoActivity.B[17]);
                                    Log.b(stringExtra.endsWith(AccountInfoActivity.B[13]));
                                    this.a(this.n = stringExtra.substring(0, stringExtra.length() - AccountInfoActivity.B[15].length()), (Runnable)null);
                                    if (i) {
                                        continue Label_0121_Outer;
                                    }
                                    return;
                                }
                                catch (IllegalStateException ex3) {
                                    throw ex3;
                                }
                            }
                            catch (IllegalStateException ex4) {
                                throw ex4;
                            }
                        }
                        break;
                    }
                    case 10002: {
                        continue;
                    }
                }
                break;
            }
            break;
        }
    }
    
    @Override
    protected void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //    14: bipush          41
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: aload_1        
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    24: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //    27: bipush          46
        //    29: aaload         
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: aload_0        
        //    34: invokevirtual   com/whatsapp/AccountInfoActivity.getIntent:()Landroid/content/Intent;
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    40: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    43: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    46: aload_0        
        //    47: aload_1        
        //    48: invokespecial   com/whatsapp/DialogToastActivity.onCreate:(Landroid/os/Bundle;)V
        //    51: aload_0        
        //    52: invokevirtual   com/whatsapp/AccountInfoActivity.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    55: iconst_1       
        //    56: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    59: aload_0        
        //    60: ldc_w           2130903066
        //    63: invokevirtual   com/whatsapp/AccountInfoActivity.setContentView:(I)V
        //    66: aload_0        
        //    67: aload_0        
        //    68: ldc_w           2131755143
        //    71: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //    74: checkcast       Landroid/widget/RadioButton;
        //    77: putfield        com/whatsapp/AccountInfoActivity.m:Landroid/widget/RadioButton;
        //    80: aload_0        
        //    81: aload_0        
        //    82: ldc_w           2131755151
        //    85: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //    88: checkcast       Landroid/widget/RadioButton;
        //    91: putfield        com/whatsapp/AccountInfoActivity.v:Landroid/widget/RadioButton;
        //    94: aload_0        
        //    95: aload_0        
        //    96: ldc_w           2131755156
        //    99: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   102: checkcast       Landroid/widget/RadioButton;
        //   105: putfield        com/whatsapp/AccountInfoActivity.A:Landroid/widget/RadioButton;
        //   108: aload_0        
        //   109: getfield        com/whatsapp/AccountInfoActivity.m:Landroid/widget/RadioButton;
        //   112: iconst_1       
        //   113: invokevirtual   android/widget/RadioButton.setChecked:(Z)V
        //   116: new             Lcom/whatsapp/x7;
        //   119: dup            
        //   120: aload_0        
        //   121: invokespecial   com/whatsapp/x7.<init>:(Lcom/whatsapp/AccountInfoActivity;)V
        //   124: astore_3       
        //   125: aload_0        
        //   126: getfield        com/whatsapp/AccountInfoActivity.m:Landroid/widget/RadioButton;
        //   129: aload_3        
        //   130: invokevirtual   android/widget/RadioButton.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
        //   133: aload_0        
        //   134: getfield        com/whatsapp/AccountInfoActivity.v:Landroid/widget/RadioButton;
        //   137: aload_3        
        //   138: invokevirtual   android/widget/RadioButton.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
        //   141: aload_0        
        //   142: getfield        com/whatsapp/AccountInfoActivity.A:Landroid/widget/RadioButton;
        //   145: aload_3        
        //   146: invokevirtual   android/widget/RadioButton.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
        //   149: aload_0        
        //   150: ldc_w           2131755144
        //   153: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   156: astore          4
        //   158: aload_0        
        //   159: ldc_w           2131755148
        //   162: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   165: astore          5
        //   167: aload_0        
        //   168: ldc_w           2131755153
        //   171: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   174: astore          6
        //   176: new             Lcom/whatsapp/om;
        //   179: dup            
        //   180: aload_0        
        //   181: aload           4
        //   183: aload           5
        //   185: aload           6
        //   187: invokespecial   com/whatsapp/om.<init>:(Lcom/whatsapp/AccountInfoActivity;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
        //   190: astore          7
        //   192: aload           4
        //   194: aload           7
        //   196: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   199: aload           5
        //   201: aload           7
        //   203: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   206: aload           6
        //   208: aload           7
        //   210: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   213: aload_0        
        //   214: ldc_w           2131755145
        //   217: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   220: checkcast       Landroid/widget/TextView;
        //   223: astore          8
        //   225: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   228: ldc_w           2131296302
        //   231: iconst_1       
        //   232: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   235: astore          9
        //   237: iconst_1       
        //   238: anewarray       Ljava/lang/Object;
        //   241: astore          10
        //   243: aload           10
        //   245: iconst_0       
        //   246: iconst_1       
        //   247: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   250: aastore        
        //   251: aload           8
        //   253: aload           9
        //   255: aload           10
        //   257: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   260: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   263: aload_0        
        //   264: ldc_w           2131755149
        //   267: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   270: checkcast       Landroid/widget/TextView;
        //   273: astore          11
        //   275: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   278: ldc_w           2131296302
        //   281: iconst_3       
        //   282: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   285: astore          12
        //   287: iconst_1       
        //   288: anewarray       Ljava/lang/Object;
        //   291: astore          13
        //   293: aload           13
        //   295: iconst_0       
        //   296: iconst_3       
        //   297: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   300: aastore        
        //   301: aload           11
        //   303: aload           12
        //   305: aload           13
        //   307: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   310: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   313: aload_0        
        //   314: ldc_w           2131755154
        //   317: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   320: checkcast       Landroid/widget/TextView;
        //   323: astore          14
        //   325: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   328: ldc_w           2131296302
        //   331: iconst_5       
        //   332: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   335: astore          15
        //   337: iconst_1       
        //   338: anewarray       Ljava/lang/Object;
        //   341: astore          16
        //   343: aload           16
        //   345: iconst_0       
        //   346: iconst_5       
        //   347: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   350: aastore        
        //   351: aload           14
        //   353: aload           15
        //   355: aload           16
        //   357: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   360: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   363: aload_0        
        //   364: ldc_w           2131755146
        //   367: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   370: checkcast       Landroid/widget/TextView;
        //   373: getstatic       com/whatsapp/App.X:Lcom/whatsapp/o6;
        //   376: ldc_w           "1"
        //   379: invokevirtual   com/whatsapp/o6.a:(Ljava/lang/String;)Ljava/lang/String;
        //   382: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   385: aload_0        
        //   386: ldc_w           2131755150
        //   389: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   392: checkcast       Landroid/widget/TextView;
        //   395: getstatic       com/whatsapp/App.X:Lcom/whatsapp/o6;
        //   398: ldc             "3"
        //   400: invokevirtual   com/whatsapp/o6.a:(Ljava/lang/String;)Ljava/lang/String;
        //   403: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   406: aload_0        
        //   407: ldc_w           2131755155
        //   410: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   413: checkcast       Landroid/widget/TextView;
        //   416: getstatic       com/whatsapp/App.X:Lcom/whatsapp/o6;
        //   419: ldc             "5"
        //   421: invokevirtual   com/whatsapp/o6.a:(Ljava/lang/String;)Ljava/lang/String;
        //   424: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   427: aload_0        
        //   428: invokevirtual   com/whatsapp/AccountInfoActivity.getIntent:()Landroid/content/Intent;
        //   431: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //   434: bipush          39
        //   436: aaload         
        //   437: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   440: astore          17
        //   442: aload_0        
        //   443: aload_0        
        //   444: invokevirtual   com/whatsapp/AccountInfoActivity.getIntent:()Landroid/content/Intent;
        //   447: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //   450: bipush          47
        //   452: aaload         
        //   453: iconst_0       
        //   454: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   457: putfield        com/whatsapp/AccountInfoActivity.z:Z
        //   460: aload           17
        //   462: ifnull          544
        //   465: aload_0        
        //   466: iconst_1       
        //   467: putfield        com/whatsapp/AccountInfoActivity.z:Z
        //   470: aload           17
        //   472: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //   475: bipush          40
        //   477: aaload         
        //   478: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   481: istore          53
        //   483: iload           53
        //   485: ifeq            517
        //   488: aload_0        
        //   489: aload           17
        //   491: iconst_0       
        //   492: aload           17
        //   494: invokevirtual   java/lang/String.length:()I
        //   497: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //   500: bipush          38
        //   502: aaload         
        //   503: invokevirtual   java/lang/String.length:()I
        //   506: isub           
        //   507: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   510: putfield        com/whatsapp/AccountInfoActivity.n:Ljava/lang/String;
        //   513: iload_2        
        //   514: ifeq            544
        //   517: new             Ljava/lang/StringBuilder;
        //   520: dup            
        //   521: invokespecial   java/lang/StringBuilder.<init>:()V
        //   524: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //   527: bipush          43
        //   529: aaload         
        //   530: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   533: aload           17
        //   535: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   538: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   541: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   544: aload_0        
        //   545: getfield        com/whatsapp/AccountInfoActivity.z:Z
        //   548: ifeq            690
        //   551: aload_0        
        //   552: invokevirtual   com/whatsapp/AccountInfoActivity.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   555: ldc_w           2131231445
        //   558: invokevirtual   android/support/v7/app/ActionBar.setTitle:(I)V
        //   561: aload_0        
        //   562: ldc_w           2131755136
        //   565: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   568: checkcast       Landroid/widget/TextView;
        //   571: ldc_w           ""
        //   574: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   577: aload_0        
        //   578: ldc_w           2131755138
        //   581: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   584: checkcast       Landroid/widget/TextView;
        //   587: astore          50
        //   589: aload           50
        //   591: ldc_w           ""
        //   594: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   597: aload_0        
        //   598: ldc_w           2131755134
        //   601: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   604: bipush          8
        //   606: invokevirtual   android/view/View.setVisibility:(I)V
        //   609: aload_0        
        //   610: ldc_w           2131755132
        //   613: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   616: iconst_0       
        //   617: invokevirtual   android/view/View.setVisibility:(I)V
        //   620: aload_0        
        //   621: getfield        com/whatsapp/AccountInfoActivity.n:Ljava/lang/String;
        //   624: ifnull          636
        //   627: aload_0        
        //   628: aload_0        
        //   629: getfield        com/whatsapp/AccountInfoActivity.n:Ljava/lang/String;
        //   632: aconst_null    
        //   633: invokespecial   com/whatsapp/AccountInfoActivity.a:(Ljava/lang/String;Ljava/lang/Runnable;)V
        //   636: aload_0        
        //   637: ldc_w           2131755133
        //   640: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   643: checkcast       Landroid/widget/Button;
        //   646: aload_0        
        //   647: getfield        com/whatsapp/AccountInfoActivity.u:Landroid/view/View$OnClickListener;
        //   650: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   653: aload_0        
        //   654: ldc_w           2131755140
        //   657: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   660: checkcast       Landroid/widget/ImageButton;
        //   663: astore          52
        //   665: aload           52
        //   667: aload_0        
        //   668: getfield        com/whatsapp/AccountInfoActivity.x:Landroid/view/View$OnClickListener;
        //   671: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   674: aload_0        
        //   675: ldc_w           2131755162
        //   678: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   681: bipush          8
        //   683: invokevirtual   android/view/View.setVisibility:(I)V
        //   686: iload_2        
        //   687: ifeq            755
        //   690: aload_0        
        //   691: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   694: getfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //   697: putfield        com/whatsapp/AccountInfoActivity.n:Ljava/lang/String;
        //   700: aload_0        
        //   701: ldc_w           2131755137
        //   704: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   707: checkcast       Landroid/widget/TextView;
        //   710: aload_0        
        //   711: getfield        com/whatsapp/AccountInfoActivity.n:Ljava/lang/String;
        //   714: invokestatic    com/whatsapp/a_9.a:(Ljava/lang/String;)Ljava/lang/String;
        //   717: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   720: aload_0        
        //   721: ldc_w           2131755137
        //   724: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   727: iconst_0       
        //   728: invokestatic    android/support/v4/view/ViewCompat.setLayoutDirection:(Landroid/view/View;I)V
        //   731: aload_0        
        //   732: ldc_w           2131755135
        //   735: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   738: bipush          8
        //   740: invokevirtual   android/view/View.setVisibility:(I)V
        //   743: aload_0        
        //   744: ldc_w           2131755140
        //   747: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   750: bipush          8
        //   752: invokevirtual   android/view/View.setVisibility:(I)V
        //   755: aload_0        
        //   756: ldc_w           2131755160
        //   759: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   762: checkcast       Landroid/widget/Button;
        //   765: astore          22
        //   767: aload_0        
        //   768: ldc_w           2131755158
        //   771: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   774: checkcast       Landroid/widget/Button;
        //   777: astore          23
        //   779: aload_0        
        //   780: ldc_w           2131755159
        //   783: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   786: checkcast       Landroid/widget/Button;
        //   789: astore          24
        //   791: invokestatic    com/whatsapp/App.ak:()Z
        //   794: ifne            830
        //   797: aload           22
        //   799: iconst_0       
        //   800: iconst_0       
        //   801: ldc_w           2130839104
        //   804: iconst_0       
        //   805: invokevirtual   android/widget/Button.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //   808: aload           23
        //   810: iconst_0       
        //   811: iconst_0       
        //   812: ldc_w           2130839103
        //   815: iconst_0       
        //   816: invokevirtual   android/widget/Button.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //   819: aload           24
        //   821: iconst_0       
        //   822: iconst_0       
        //   823: ldc_w           2130838303
        //   826: iconst_0       
        //   827: invokevirtual   android/widget/Button.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //   830: invokestatic    com/whatsapp/App.q:()Z
        //   833: ifeq            843
        //   836: aload           23
        //   838: bipush          8
        //   840: invokevirtual   android/widget/Button.setVisibility:(I)V
        //   843: aload_0        
        //   844: getfield        com/whatsapp/AccountInfoActivity.z:Z
        //   847: istore          27
        //   849: iconst_0       
        //   850: istore          28
        //   852: iload           27
        //   854: ifne            880
        //   857: aload_0        
        //   858: invokespecial   com/whatsapp/AccountInfoActivity.f:()Z
        //   861: istore          28
        //   863: iload           28
        //   865: ifeq            880
        //   868: aload_0        
        //   869: ldc_w           2131755141
        //   872: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //   875: bipush          8
        //   877: invokevirtual   android/view/View.setVisibility:(I)V
        //   880: aload_0        
        //   881: getfield        com/whatsapp/AccountInfoActivity.z:Z
        //   884: istore          36
        //   886: iload           36
        //   888: ifne            896
        //   891: iload           28
        //   893: ifne            995
        //   896: aload           22
        //   898: aload_0        
        //   899: getfield        com/whatsapp/AccountInfoActivity.q:Landroid/view/View$OnClickListener;
        //   902: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   905: aload           24
        //   907: aload_0        
        //   908: getfield        com/whatsapp/AccountInfoActivity.k:Landroid/view/View$OnClickListener;
        //   911: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   914: getstatic       com/whatsapp/App.X:Lcom/whatsapp/o6;
        //   917: invokevirtual   com/whatsapp/o6.f:()Z
        //   920: istore          37
        //   922: iload           37
        //   924: ifeq            986
        //   927: getstatic       com/whatsapp/App.aS:I
        //   930: istore          46
        //   932: iload           46
        //   934: ifne            986
        //   937: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   940: istore          47
        //   942: iload           47
        //   944: bipush          8
        //   946: if_icmplt       986
        //   949: aload           23
        //   951: aload_0        
        //   952: getfield        com/whatsapp/AccountInfoActivity.o:Landroid/view/View$OnClickListener;
        //   955: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   958: getstatic       com/whatsapp/App.aV:I
        //   961: istore          48
        //   963: iload           48
        //   965: iconst_3       
        //   966: if_icmpne       995
        //   969: aload           23
        //   971: new             Lcom/whatsapp/r5;
        //   974: dup            
        //   975: aload_0        
        //   976: invokespecial   com/whatsapp/r5.<init>:(Lcom/whatsapp/AccountInfoActivity;)V
        //   979: invokevirtual   android/widget/Button.setOnLongClickListener:(Landroid/view/View$OnLongClickListener;)V
        //   982: iload_2        
        //   983: ifeq            995
        //   986: aload           23
        //   988: aload_0        
        //   989: getfield        com/whatsapp/AccountInfoActivity.l:Landroid/view/View$OnClickListener;
        //   992: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   995: aload_0        
        //   996: ldc_w           2131755161
        //   999: invokevirtual   com/whatsapp/AccountInfoActivity.findViewById:(I)Landroid/view/View;
        //  1002: checkcast       Landroid/widget/TextView;
        //  1005: astore          38
        //  1007: aload           38
        //  1009: bipush          8
        //  1011: aload           38
        //  1013: invokevirtual   android/widget/TextView.getPaintFlags:()I
        //  1016: ior            
        //  1017: invokevirtual   android/widget/TextView.setPaintFlags:(I)V
        //  1020: aload           38
        //  1022: new             Lcom/whatsapp/wi;
        //  1025: dup            
        //  1026: aload_0        
        //  1027: invokespecial   com/whatsapp/wi.<init>:(Lcom/whatsapp/AccountInfoActivity;)V
        //  1030: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //  1033: aload           38
        //  1035: new             Lcom/whatsapp/y2;
        //  1038: dup            
        //  1039: aload_0        
        //  1040: invokespecial   com/whatsapp/y2.<init>:(Lcom/whatsapp/AccountInfoActivity;)V
        //  1043: invokevirtual   android/widget/TextView.setOnTouchListener:(Landroid/view/View$OnTouchListener;)V
        //  1046: iload           28
        //  1048: ifne            1115
        //  1051: aload_1        
        //  1052: ifnonnull       1115
        //  1055: aload_0        
        //  1056: invokevirtual   com/whatsapp/AccountInfoActivity.getIntent:()Landroid/content/Intent;
        //  1059: astore          41
        //  1061: aload           41
        //  1063: ifnull          1115
        //  1066: aload           41
        //  1068: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //  1071: bipush          42
        //  1073: aaload         
        //  1074: iconst_0       
        //  1075: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //  1078: istore          44
        //  1080: iload           44
        //  1082: ifeq            1115
        //  1085: aload           23
        //  1087: ifnull          1115
        //  1090: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //  1093: bipush          44
        //  1095: aaload         
        //  1096: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1099: aload_0        
        //  1100: iconst_1       
        //  1101: putfield        com/whatsapp/AccountInfoActivity.r:Z
        //  1104: aload_0        
        //  1105: aconst_null    
        //  1106: invokevirtual   com/whatsapp/AccountInfoActivity.setIntent:(Landroid/content/Intent;)V
        //  1109: aload           23
        //  1111: invokevirtual   android/widget/Button.performClick:()Z
        //  1114: pop            
        //  1115: getstatic       com/whatsapp/ade.c:J
        //  1118: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1121: lcmp           
        //  1122: ifge            1144
        //  1125: getstatic       com/whatsapp/AccountInfoActivity.B:[Ljava/lang/String;
        //  1128: bipush          45
        //  1130: aaload         
        //  1131: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1134: aload_0        
        //  1135: iconst_1       
        //  1136: iconst_1       
        //  1137: iconst_1       
        //  1138: aconst_null    
        //  1139: aconst_null    
        //  1140: iconst_1       
        //  1141: invokestatic    com/whatsapp/messaging/MessageService.a:(Landroid/content/Context;ZZZLjava/lang/String;[Ljava/lang/String;Z)V
        //  1144: return         
        //  1145: astore          18
        //  1147: aload           18
        //  1149: athrow         
        //  1150: astore          19
        //  1152: aload           19
        //  1154: athrow         
        //  1155: astore          20
        //  1157: aload           20
        //  1159: athrow         
        //  1160: astore          51
        //  1162: aload           51
        //  1164: athrow         
        //  1165: astore          21
        //  1167: aload           21
        //  1169: athrow         
        //  1170: astore          25
        //  1172: aload           25
        //  1174: athrow         
        //  1175: astore          26
        //  1177: aload           26
        //  1179: athrow         
        //  1180: astore          49
        //  1182: aload           49
        //  1184: athrow         
        //  1185: astore          29
        //  1187: aload           29
        //  1189: athrow         
        //  1190: astore          30
        //  1192: aload           30
        //  1194: athrow         
        //  1195: astore          31
        //  1197: aload           31
        //  1199: athrow         
        //  1200: astore          32
        //  1202: aload           32
        //  1204: athrow         
        //  1205: astore          33
        //  1207: aload           33
        //  1209: athrow         
        //  1210: astore          34
        //  1212: aload           34
        //  1214: athrow         
        //  1215: astore          35
        //  1217: aload           35
        //  1219: athrow         
        //  1220: astore          39
        //  1222: aload           39
        //  1224: athrow         
        //  1225: astore          42
        //  1227: aload           42
        //  1229: athrow         
        //  1230: astore          43
        //  1232: aload           43
        //  1234: athrow         
        //  1235: astore          40
        //  1237: aload           40
        //  1239: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  442    460    1145   1150   Ljava/lang/IllegalStateException;
        //  465    483    1150   1155   Ljava/lang/IllegalStateException;
        //  488    513    1155   1160   Ljava/lang/IllegalStateException;
        //  517    544    1155   1160   Ljava/lang/IllegalStateException;
        //  589    636    1160   1165   Ljava/lang/IllegalStateException;
        //  665    686    1165   1170   Ljava/lang/IllegalStateException;
        //  690    755    1165   1170   Ljava/lang/IllegalStateException;
        //  791    830    1170   1175   Ljava/lang/IllegalStateException;
        //  830    843    1175   1180   Ljava/lang/IllegalStateException;
        //  868    880    1180   1185   Ljava/lang/IllegalStateException;
        //  880    886    1185   1195   Ljava/lang/IllegalStateException;
        //  896    922    1195   1200   Ljava/lang/IllegalStateException;
        //  927    932    1200   1205   Ljava/lang/IllegalStateException;
        //  937    942    1205   1210   Ljava/lang/IllegalStateException;
        //  949    963    1210   1215   Ljava/lang/IllegalStateException;
        //  969    982    1215   1220   Ljava/lang/IllegalStateException;
        //  986    995    1215   1220   Ljava/lang/IllegalStateException;
        //  1007   1046   1220   1225   Ljava/lang/IllegalStateException;
        //  1066   1080   1225   1230   Ljava/lang/IllegalStateException;
        //  1090   1115   1230   1235   Ljava/lang/IllegalStateException;
        //  1115   1144   1235   1240   Ljava/lang/IllegalStateException;
        //  1147   1150   1150   1155   Ljava/lang/IllegalStateException;
        //  1152   1155   1155   1160   Ljava/lang/IllegalStateException;
        //  1187   1190   1190   1195   Ljava/lang/IllegalStateException;
        //  1192   1195   1195   1200   Ljava/lang/IllegalStateException;
        //  1197   1200   1200   1205   Ljava/lang/IllegalStateException;
        //  1202   1205   1205   1210   Ljava/lang/IllegalStateException;
        //  1207   1210   1210   1215   Ljava/lang/IllegalStateException;
        //  1212   1215   1215   1220   Ljava/lang/IllegalStateException;
        //  1227   1230   1230   1235   Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 571, Size: 571
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
            case 6: {
                try {
                    return new AlertDialog$Builder((Context)this).setMessage(2131231150).setPositiveButton(2131231435, null).create();
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            case 5: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231264).setPositiveButton(2131231435, null).create();
            }
            case 4: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231111).setPositiveButton(2131231435, null).create();
            }
            case 121: {
                Log.w(AccountInfoActivity.B[2]);
                return yt.e(this);
            }
            case 120: {
                Log.w(AccountInfoActivity.B[3]);
                return yt.a(this);
            }
            case 117: {
                Log.w(AccountInfoActivity.B[6]);
                return yt.d(this);
            }
            case 118: {
                Log.w(AccountInfoActivity.B[4]);
                return yt.c(this);
            }
            case 119: {
                Log.w(AccountInfoActivity.B[5]);
                return yt.b(this, this.r);
            }
            case 2: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231112).setPositiveButton(2131231435, null).create();
            }
            case 7: {
                final s_ s_ = new s_(this);
                return new AlertDialog$Builder((Context)this).setMessage(2131231458).setPositiveButton(2131231977, (DialogInterface$OnClickListener)s_).setNegativeButton(2131231411, (DialogInterface$OnClickListener)s_).create();
            }
            case 8: {
                return this.a(8, new aa2(this));
            }
            case 9: {
                return this.a(9, new adk(this));
            }
            case 11: {
                return this.a(11, new f1(this));
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        try {
            if (!this.z) {
                menu.add(0, 1, 0, 2131231445).setIcon(2130838797);
            }
            return super.onCreateOptionsMenu(menu);
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(AccountInfoActivity.B[37]);
        this.w.removeMessages(0);
        this.w.removeMessages(8);
        this.s.a();
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
            }
            case 1: {
                final Intent intent = new Intent((Context)this, (Class)AccountInfoActivity.class);
                intent.putExtra(AccountInfoActivity.B[12], true);
                this.startActivity(intent);
                return true;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(AccountInfoActivity.B[36] + this.getIntent());
    }
    
    protected void onPrepareDialog(final int n, final Dialog dialog) {
        final boolean i = App.I;
    Label_0089_Outer:
        while (true) {
        Label_0075_Outer:
            while (true) {
                while (true) {
                    switch (n) {
                        default: {
                            break Label_0040;
                        }
                        case 121: {
                            break Label_0075_Outer;
                        }
                        case 117: {
                            Label_0061: {
                                break Label_0061;
                                try {
                                    super.onPrepareDialog(n, dialog);
                                    Label_0046: {
                                        return;
                                    }
                                    final AlertDialog alertDialog = (AlertDialog)dialog;
                                    alertDialog.setMessage(yt.c());
                                    yt.a(this, alertDialog, this.r);
                                    // iftrue(Label_0046:, !i)
                                    // iftrue(Label_0046:, !i)
                                    // iftrue(Label_0046:, !i)
                                    Block_2: {
                                        break Block_2;
                                        ((AlertDialog)dialog).setMessage(yt.b());
                                        ((AlertDialog)dialog).setMessage(yt.a());
                                        break Label_0075;
                                    }
                                    continue Label_0089_Outer;
                                    ((AlertDialog)dialog).setMessage(yt.d());
                                    // iftrue(Label_0046:, !i)
                                    continue Label_0075_Outer;
                                }
                                catch (IllegalStateException ex) {
                                    throw ex;
                                }
                            }
                            break;
                        }
                        case 118: {
                            continue;
                        }
                        case 119: {
                            continue Label_0075_Outer;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(AccountInfoActivity.B[48] + this.getIntent());
    }
    
    @Override
    protected void onStart() {
        try {
            super.onStart();
            Log.i(AccountInfoActivity.B[52] + this.getIntent());
            ade.a(this.p);
            App.X.b(this.t);
            if (App.aX.jabber_id.equals(this.n)) {
                this.f();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(AccountInfoActivity.B[21] + this.getIntent());
        App.X.a(this.t);
        ade.b(this.p);
    }
}
