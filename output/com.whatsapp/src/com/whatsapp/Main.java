// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Environment;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.util.WhatsAppLibLoader;
import android.os.Bundle;
import android.os.AsyncTask;
import android.os.AsyncTask$Status;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Intent;
import android.content.Context;
import com.whatsapp.util.Log;
import android.net.Uri;

public class Main extends VerifyMessageStoreActivity
{
    private static final String[] z;
    private a_k l;
    private Uri m;
    
    static {
        final String[] z2 = new String[28];
        String s = "nPsN8gX{Lxd\u001ejAdpFuRs";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0732:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0017';
                        break;
                    }
                    case 0: {
                        c2 = '\u0003';
                        break;
                    }
                    case 1: {
                        c2 = '1';
                        break;
                    }
                    case 2: {
                        c2 = '\u001a';
                        break;
                    }
                    case 3: {
                        c2 = ' ';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "nPsN8gX{Lxd\u001eiHbwUuWy";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "nPsN8gX{Lxd\u001eoPpqP~E";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "nPsN8gX{Lxd\u001eoNdvAjOewT~";
                    n = 2;
                    n2 = 3;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "iX~";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "pYuWHqT}IdwC{T~l_EF~qBn\u007fsoV";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "bSuRcj_}\u0000svT:Tx#_{T~uT:L~aC{R~fB:M~pBsNp";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "pYuWHqT}IdwC{T~l_EF~qBn\u007fsoV";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "n^oNcfU";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "n^oNcfUERx";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "nPsN8`C\u007fAcf\u001exAthDjF~oTiFxv_~\u0000";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "nPsN8`C\u007fAcf";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "`^w\u000e`kPnSvsAEPefW\u007fRrmR\u007fS";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "pYuRc`Dn\u007fafCiIxm";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "nPsN8qTyRrbE\u007f\u007fdk^hTtvE";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "b_~RxjU4IywTtT9bRnIxm\u001fWa^M";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "pYuRc`Dn\u007fafCiIxm";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "iX~";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "nPsN8j_lA{jU5RrdXiTebEsOy#BnAcf\f";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "nPsN8d^nOV`EsV~wH";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "pYuWHqT}IdwC{T~l_EF~qBn\u007fsoV";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "nPsN8pYuW7gX{Lxd\u0011iYy`";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "nPsN8nT:ags\u001fwE7jB:Nbo]6\u0000tb_=T7sCuCrfU4";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    s = "`^w\u000e`kPnSvsA4vrqX|YDnB4C\u007fb_}Eyv\\xEe";
                    n = 22;
                    n2 = 23;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    array = z2;
                    s = "nPsN8m^7Mr,C\u007fGyb\\\u007f";
                    n = 23;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "nPsN8nT5Rrd_{Mr";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    s = "8\u0011~EqbDvT7w^:eBOp";
                    n = 25;
                    n2 = 26;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    array = z2;
                    s = "pYuWHqT}IdwC{T~l_EF~qBn\u007fsoV";
                    n = 26;
                    continue;
                }
                case 26: {
                    break Label_0732;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public Main() {
        this.m = null;
        this.l = null;
    }
    
    static Uri a(final Main main) {
        return main.m;
    }
    
    private void a() {
        if (!this.isFinishing()) {
            final Intent intent = this.getIntent();
            if (intent != null && !Main.z[15].equals(intent.getAction()) && (0x4000000 & intent.getFlags()) != 0x0 && !intent.hasExtra(Main.z[17])) {
                final SharedPreferences sharedPreferences = this.getSharedPreferences(Main.z[12], 0);
                if (sharedPreferences != null && sharedPreferences.getInt(Main.z[13], 0) == 0) {
                    Log.i(Main.z[14]);
                    RegisterName.a((Context)this, this.getString(2131231990), 0);
                    RegisterName.a((Context)this, this.getString(2131231990));
                    final SharedPreferences$Editor edit = sharedPreferences.edit();
                    edit.putInt(Main.z[16], 1);
                    edit.commit();
                }
            }
            this.startActivity(new Intent((Context)this, h()));
            this.finish();
        }
    }
    
    static void b(final Main main) {
        main.a();
    }
    
    static void c(final Main main) {
        main.g();
    }
    
    private void g() {
        final String stringExtra = this.getIntent().getStringExtra(Main.z[4]);
        if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
            final a_9 e = App.S.e(stringExtra);
            if (e != null && ((!e.m() && !e.o()) || e.t != null)) {
                if (!this.isFinishing()) {
                    this.startActivity(Conversation.a(e));
                    this.finish();
                }
                return;
            }
        }
        this.a();
    }
    
    public static Class h() {
        return HomeActivity.class;
    }
    
    @Override
    protected void f() {
        final boolean i = App.I;
        super.f();
        if (App.aX == null) {
            if (!this.isFinishing()) {
                final int c = App.c((Context)this);
                Intent intent = null;
                switch (c) {
                    default: {
                        Log.e(Main.z[18] + c + Main.z[26]);
                        App.b((Context)this, 0);
                        intent = new Intent((Context)this, (Class)EULA.class);
                        break;
                    }
                    case 0: {
                        intent = new Intent((Context)this, (Class)EULA.class);
                        if (this.getIntent().getBooleanExtra(Main.z[27], false)) {
                            intent.putExtra(Main.z[20], true);
                            break;
                        }
                        break;
                    }
                    case 1:
                    case 5: {
                        intent = new Intent((Context)this, (Class)RegisterPhone.class);
                        break;
                    }
                    case 2: {
                        Log.i(Main.z[24]);
                        intent = new Intent((Context)this, (Class)RegisterName.class);
                        break;
                    }
                    case 4: {
                        intent = new Intent((Context)this, (Class)VerifySms.class);
                        if (ChangeNumber.g()) {
                            intent.putExtra(Main.z[23], true);
                            break;
                        }
                        break;
                    }
                    case 6: {
                        intent = new Intent((Context)this, (Class)DeleteAccountConfirmation.class);
                        break;
                    }
                }
                if (intent != null) {
                    this.startActivity(intent);
                    this.finish();
                }
            }
            Log.i(Main.z[22]);
            return;
        }
        if (App.c((Context)this) == 2) {
            Log.i(Main.z[25]);
            this.startActivity(new Intent((Context)this, (Class)RegisterName.class));
            this.finish();
            return;
        }
        App.b((Context)this, 3);
        this.m = aah.d();
        Label_0489: {
            if (App.aS == 1 && this.m != null) {
                if (this.isFinishing()) {
                    break Label_0489;
                }
                this.showDialog(0);
                if (!i) {
                    break Label_0489;
                }
            }
            if (App.F == null) {
                if (this.isFinishing()) {
                    break Label_0489;
                }
                this.showDialog(1);
                if (!i) {
                    break Label_0489;
                }
            }
            if (App.l) {
                if (this.isFinishing()) {
                    break Label_0489;
                }
                this.showDialog(2);
                if (!i) {
                    break Label_0489;
                }
            }
            if (adc.e) {
                if (this.l == null || this.l.getStatus() != AsyncTask$Status.RUNNING) {
                    a8s.a(this.l = new a_k(this), new Void[0]);
                    if (!i) {
                        break Label_0489;
                    }
                }
                Log.i(Main.z[21]);
                this.showDialog(104);
                if (!i) {
                    break Label_0489;
                }
            }
            Log.i(Main.z[19]);
            this.g();
        }
        App.aq.aQ.a((Context)App.aq);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        super.onCreate(bundle);
        Log.i(Main.z[11]);
        if (!WhatsAppLibLoader.a(null)) {
            Log.i(Main.z[6]);
            this.finish();
        }
        else {
            this.setContentView((View)new LinearLayout((Context)this));
            final int c = App.c((Context)this);
            if (App.aX == null && c == 0) {
                if (!this.isFinishing()) {
                    final Intent intent = new Intent((Context)this, (Class)EULA.class);
                    if (this.getIntent().getBooleanExtra(Main.z[7], false)) {
                        intent.putExtra(Main.z[5], true);
                    }
                    this.startActivity(intent);
                    this.finish();
                }
            }
            else {
                if (c != 6) {
                    if (App.aX != null && !App.ak.l()) {
                        final String externalStorageState = Environment.getExternalStorageState();
                        Label_0271: {
                            if (!externalStorageState.equals(Main.z[8]) && !externalStorageState.equals(Main.z[9])) {
                                this.showDialog(107);
                                if (!i) {
                                    break Label_0271;
                                }
                            }
                            final int p = App.ak.p();
                            Log.i(Main.z[10] + p);
                            if (p > 0) {
                                this.showDialog(105);
                                if (!i) {
                                    break Label_0271;
                                }
                            }
                            this.b(false);
                        }
                        if (!i) {
                            return;
                        }
                    }
                    this.f();
                    return;
                }
                if (!this.isFinishing()) {
                    this.startActivity(new Intent((Context)this, (Class)DeleteAccountConfirmation.class));
                    this.finish();
                }
            }
        }
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 0: {
                Log.i(Main.z[2]);
                return new AlertDialog$Builder((Context)this).setTitle(2131231877).setMessage(2131231876).setCancelable(false).setPositiveButton(2131231977, (DialogInterface$OnClickListener)new al2(this)).setNeutralButton(2131231433, (DialogInterface$OnClickListener)new np(this)).setNegativeButton(2131231263, (DialogInterface$OnClickListener)new aou(this)).create();
            }
            case 1: {
                Log.i(Main.z[0]);
                return new AlertDialog$Builder((Context)this).setTitle(2131230802).setCancelable(false).setMessage(2131231576).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new as1(this)).create();
            }
            case 2: {
                Log.i(Main.z[1]);
                return new AlertDialog$Builder((Context)this).setTitle(2131230802).setCancelable(false).setMessage(2131231293).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new jq(this)).create();
            }
            case 3: {
                Log.i(Main.z[3]);
                return new AlertDialog$Builder((Context)this).setTitle(2131231990).setCancelable(false).setMessage(2131231032).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new i5(this)).create();
            }
        }
    }
}
