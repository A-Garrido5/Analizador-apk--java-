// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.app.Activity;

public class SmsDefaultAppWarning extends DialogToastActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "LWDP\n\u001e\f\u001fW\u0011EWCA\tT\rSO\u0014\u000bG\\\u000f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'y';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = '#';
                        break;
                    }
                    case 2: {
                        c2 = '0';
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
                    s = "WNCD\u001cBBEL\rES@W\u0018VMYN\u001e\u000b@BE\u0018PF";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "EMTR\u0016MG\u001eI\u0017PF^TWE@DI\u0016J\rce7`w\u007f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "GL]\u000e\u000eLBDS\u0018TS";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private void a() {
        App.a(this, this.getIntent().getData(), this.getString(2131231849, new Object[] { SmsDefaultAppWarning.z[0] }));
    }
    
    static void a(final SmsDefaultAppWarning smsDefaultAppWarning) {
        smsDefaultAppWarning.a();
    }
    
    private void b() {
        App.a(this, this.getIntent().getData(), null);
    }
    
    static void b(final SmsDefaultAppWarning smsDefaultAppWarning) {
        smsDefaultAppWarning.b();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Log.i(SmsDefaultAppWarning.z[1]);
        final Intent intent = new Intent(SmsDefaultAppWarning.z[2]);
        intent.setData(this.getIntent().getData());
        final ResolveInfo resolveActivity = this.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && resolveActivity.activityInfo != null && SmsDefaultAppWarning.z[3].equals(resolveActivity.activityInfo.packageName)) {
            this.showDialog(0);
            if (!App.I) {
                return;
            }
        }
        this.showDialog(1);
    }
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 0: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231957).setNeutralButton(2131231743, (DialogInterface$OnClickListener)new bn(this)).setNegativeButton(2131231750, (DialogInterface$OnClickListener)new aq0(this)).setPositiveButton(2131231751, (DialogInterface$OnClickListener)new cv(this)).setOnCancelListener((DialogInterface$OnCancelListener)new a6w(this)).create();
            }
            case 1: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231956).setNeutralButton(2131231743, (DialogInterface$OnClickListener)new as2(this)).setPositiveButton(2131231751, (DialogInterface$OnClickListener)new xn(this)).setOnCancelListener((DialogInterface$OnCancelListener)new _6(this)).create();
            }
        }
    }
}
