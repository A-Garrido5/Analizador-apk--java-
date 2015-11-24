// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.os.AsyncTask;
import android.app.Activity;
import java.io.Serializable;
import android.content.Intent;
import android.content.Context;

public class UserFeedbackActivity extends DialogToastActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = ",nP@|'`I\u001dj?q\u0013*n<bO\u0007i*QO\u0001i#dP/h;hK\u0007\u007f6/N\u000by9dO\u001d\u007f.uH\u001d";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000b';
                        break;
                    }
                    case 0: {
                        c2 = 'O';
                        break;
                    }
                    case 1: {
                        c2 = '\u0001';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = 'n';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ",nP@|'`I\u001dj?q\u0013*n<bO\u0007i*QO\u0001i#dP/h;hK\u0007\u007f6/[\u001cd\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = ",nP@|'`I\u001dj?q\u0013*n<bO\u0007i*QO\u0001i#dP/h;hK\u0007\u007f6/I\u0017{*";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static void a(final Context context, final String s, final String s2, final Integer n) {
        final Intent intent = new Intent(context, (Class)DescribeProblemActivity.class);
        intent.putExtra(UserFeedbackActivity.z[1], s);
        intent.putExtra(UserFeedbackActivity.z[0], s2);
        if (n != null) {
            intent.putExtra(UserFeedbackActivity.z[2], (Serializable)n);
        }
        context.startActivity(intent);
    }
    
    protected void e(final String s) {
        a8s.a(new y5(this, this, false, false, s), new String[0]);
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 122: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231535));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 123: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231705).setPositiveButton(2131231977, (DialogInterface$OnClickListener)new fo(this)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new wy(this)).create();
            }
        }
    }
}
