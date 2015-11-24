// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.os.Bundle;
import android.os.AsyncTask;
import android.os.Environment;
import com.whatsapp.util.bm;
import android.content.ServiceConnection;
import android.content.Intent;
import com.whatsapp.gdrive.cs;
import android.os.ConditionVariable;
import com.whatsapp.notification.a2;
import com.whatsapp.util.Log;
import android.content.Context;
import java.io.File;
import android.os.Handler;
import com.whatsapp.gdrive.GoogleDriveService;

public class DeleteAccountConfirmation extends DialogToastActivity
{
    private static DeleteAccountConfirmation l;
    private static GoogleDriveService m;
    private static final String[] z;
    private Handler k;
    
    static {
        final String[] z2 = new String[12];
        String s = "M\u0015/OkL\u0011 Ip\\\u001e7IpG\u0016*Xr\u0006\u00131O~]\u0015";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001f';
                        break;
                    }
                    case 0: {
                        c2 = ')';
                        break;
                    }
                    case 1: {
                        c2 = 'p';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = '*';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "H\u0013 EjG\u0004\u001cD~D\u0015";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "H\u00137CpG/'OsL\u0004&";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "C\u0019'";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "D\u001f6DkL\u0014";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "M\u0015/OkL\u0011 IkJ\u001f-Lv[\u001dlOg]\u00151D~E\u001d&NvH]0^~]\u0015c";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "M\u0015/OkL\u0011 IkJ\u001f-Lv[\u001dl]mF\u001e$\u0007l]\u00117O?K\u001f6D|LP7E?D\u0011*D?";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u007f\u00151CyP#.Y";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "{\u0015$Cl]\u00151zwF\u001e&";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "M\u0015/OkL\u0011 IkJ\u001f-Lv[\u001dl\\z[\u0019%SlD\u0003lIpD\u001d*^?O\u0011*FzM";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "M\u0015/OkL\u0011 IkJ\u001f-Lv[\u001dlXzN\u0000+EqL_ ErD\u00197\nyH\u0019/O{";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "D\u0015";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        DeleteAccountConfirmation.l = null;
        DeleteAccountConfirmation.m = null;
    }
    
    public DeleteAccountConfirmation() {
        this.k = new tr(this);
    }
    
    static Handler a(final DeleteAccountConfirmation deleteAccountConfirmation) {
        return deleteAccountConfirmation.k;
    }
    
    static GoogleDriveService a(final GoogleDriveService m) {
        return DeleteAccountConfirmation.m = m;
    }
    
    private static void a() {
        App.aX = null;
        new File(App.aq.getFilesDir(), DeleteAccountConfirmation.z[11]).delete();
        al5.h();
        App.f((Context)App.aq, null);
        App.b((Context)App.aq, 0);
        App.ak.i();
        App.S.c();
        App.j = false;
        al5.u();
    }
    
    static GoogleDriveService b() {
        return DeleteAccountConfirmation.m;
    }
    
    static void e() {
        a();
    }
    
    static void f() {
        if (!App.aq.getSharedPreferences(DeleteAccountConfirmation.z[8], 0).edit().clear().commit()) {
            Log.e(DeleteAccountConfirmation.z[10]);
        }
        if (!App.aq.getSharedPreferences(DeleteAccountConfirmation.z[7], 0).edit().clear().commit()) {
            Log.e(DeleteAccountConfirmation.z[9]);
        }
    }
    
    public static void g() {
        final boolean i = App.I;
        App.b((Context)App.aq, 6);
        if (DeleteAccountConfirmation.l != null) {
            DeleteAccountConfirmation.l.k.removeMessages(0);
        }
        a2.b().c();
        final ConditionVariable conditionVariable = new ConditionVariable(false);
        final asp asp = new asp(conditionVariable);
        final ConditionVariable conditionVariable2 = new ConditionVariable(false);
        final lj lj = new lj(conditionVariable2, asp);
        final Intent intent = new Intent((Context)App.aq, (Class)GoogleDriveService.class);
        intent.putExtra(DeleteAccountConfirmation.z[1], GoogleDriveService.o());
        intent.putExtra(DeleteAccountConfirmation.z[3], GoogleDriveService.a((Context)App.aq));
        intent.setAction(DeleteAccountConfirmation.z[2]);
        App.aq.startService(intent);
        App.aq.bindService(intent, (ServiceConnection)lj, 1);
        final File filesDir = App.aq.getFilesDir();
        final String[] fileList = App.aq.fileList();
        final int length = fileList.length;
        int j = 0;
        while (j < length) {
            final String s = fileList[j];
            ++j;
            if (i) {
                break;
            }
        }
        vy.c(filesDir);
        bm.a(new y0());
        final String externalStorageState = Environment.getExternalStorageState();
        Log.i(DeleteAccountConfirmation.z[5] + externalStorageState);
        if (externalStorageState.equals(DeleteAccountConfirmation.z[4])) {
            App.ak.J();
        }
        App.o();
        App.as();
        a8s.a(new uu(conditionVariable2, conditionVariable, asp), new Void[0]);
    }
    
    static DeleteAccountConfirmation h() {
        return DeleteAccountConfirmation.l;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Log.i(DeleteAccountConfirmation.z[0]);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(alm.a(this.getLayoutInflater(), 2130903146, null, false));
        this.findViewById(2131755537).setOnClickListener((View$OnClickListener)new aa(this));
        int n = ade.a;
        if (n == -1) {
            n = ade.c();
        }
        if (n != 0) {
            this.findViewById(2131755529).setVisibility(0);
        }
        if (!GoogleDriveService.am()) {
            this.findViewById(2131755536).setVisibility(8);
        }
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231004));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 2: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231532, new Object[] { this.getString(2131230921) })).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new lg(this)).create();
            }
            case 3: {
                return new AlertDialog$Builder((Context)this).setMessage(2131230995).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new a_7(this)).create();
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.k.removeMessages(0);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
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
        DeleteAccountConfirmation.l = null;
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        DeleteAccountConfirmation.l = this;
        final int c = App.c((Context)this);
        if (c != 3 && c != 6) {
            Log.e(DeleteAccountConfirmation.z[6] + c);
            this.startActivity(new Intent((Context)this, (Class)Main.class));
            this.finish();
        }
    }
}
