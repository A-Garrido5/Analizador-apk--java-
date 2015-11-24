// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.bm;
import android.content.DialogInterface$OnClickListener;
import android.text.format.Formatter;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import com.whatsapp.util.Log;
import com.whatsapp.App;
import android.view.View;
import android.view.View$OnClickListener;

class k implements View$OnClickListener
{
    private static final String[] z;
    final GoogleDriveActivity a;
    final at b;
    final bq c;
    final String d;
    final q e;
    
    static {
        final String[] z2 = new String[3];
        String s = "\\`=W`\u0015`=B/\\";
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
                        c2 = '\u0015';
                        break;
                    }
                    case 0: {
                        c2 = '|';
                        break;
                    }
                    case 1: {
                        c2 = '\u0012';
                        break;
                    }
                    case 2: {
                        c2 = 'X';
                        break;
                    }
                    case 3: {
                        c2 = '&';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001bv*Oc\u0019?9Ea\u0015d1RlSa0IbQ`=Ua\u0013`=\u0006f\bs*R|\u0012uxTp\u000ff7Tp\\t*Ix\\";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u001bv*Oc\u0019?9Ea\u0015d1RlSa0IbQ`=Ua\u0013`=\u0006|\u0012a-@s\u0015q1C{\b2+Rz\u000es?C9\\s.G|\u0010s:JpF2";
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
    
    k(final GoogleDriveActivity a, final String d, final bq c, final q e, final at b) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
        this.b = b;
    }
    
    public void onClick(final View view) {
        if (App.C() < GoogleDriveActivity.d(this.a)) {
            Log.i(k.z[2] + App.C() + k.z[0] + GoogleDriveActivity.d(this.a));
            final GoogleDriveActivity a = this.a;
            int n;
            if (App.aw()) {
                n = 2131232033;
            }
            else {
                n = 2131232035;
            }
            new AlertDialog$Builder((Context)this.a).setTitle(2131232034).setMessage(String.format(a.getString(n), Formatter.formatShortFileSize((Context)this.a, GoogleDriveActivity.d(this.a)))).setPositiveButton(2131230853, (DialogInterface$OnClickListener)new l(this)).create().show();
            return;
        }
        Log.i(k.z[1] + a7.a(this.d));
        GoogleDriveActivity.c(this.a);
        bm.a(new bs(this));
    }
}
