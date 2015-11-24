// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.net.Uri$Builder;
import android.content.Context;
import com.whatsapp.util.br;
import android.os.Parcelable;
import android.content.Intent;
import com.whatsapp.ContactPicker;
import android.os.AsyncTask;
import com.whatsapp.a8s;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.util.cq;
import android.view.View;
import android.net.Uri;
import com.whatsapp.util.co;

class a6 extends co
{
    private static final String[] z;
    final CameraActivity b;
    final Uri c;
    
    static {
        final String[] z2 = new String[8];
        String s = "LcWdI@l";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ' ';
                        break;
                    }
                    case 0: {
                        c2 = '/';
                        break;
                    }
                    case 1: {
                        c2 = '\u0002';
                        break;
                    }
                    case 2: {
                        c2 = '\'';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "]mSqTFmI";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "LcJuRN";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\\iN`\u007f_pBfIJu";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "FoFwE\u0000(";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "InN`\rG";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "NlCbOFf\tyN[gId\u000eJzSbA\u0001QsBenO";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "InN`\rG";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a6(final CameraActivity b, final Uri c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final View view) {
        final boolean m = CameraActivity.m;
        this.b.findViewById(2131755337).setVisibility(8);
        this.b.findViewById(2131755303).setVisibility(8);
        final String a = cq.a(CameraActivity.i(this.b).getText().toString());
        Uri uri;
        if (CameraActivity.u(this.b) == null) {
            uri = this.c;
        }
        else {
            uri = Uri.fromFile(App.D(a6.z[2]));
        }
        final Uri$Builder buildUpon = uri.buildUpon();
        Label_0120: {
            if (!TextUtils.isEmpty((CharSequence)a)) {
                buildUpon.appendQueryParameter(a6.z[0], a);
                CameraActivity.i(this.b).setEnabled(false);
                if (!m) {
                    break Label_0120;
                }
            }
            this.b.findViewById(2131755335).setVisibility(8);
        }
        if (CameraActivity.w(this.b) != 0) {
            buildUpon.appendQueryParameter(a6.z[1], Integer.toString(CameraActivity.w(this.b)));
        }
        if (this.c.getQueryParameter(a6.z[5]) != null) {
            buildUpon.appendQueryParameter(a6.z[7], "1");
        }
        final Uri build = buildUpon.build();
        Label_0303: {
            if (CameraActivity.x(this.b) != null) {
                this.b.findViewById(2131755343).setVisibility(0);
                a8s.a(new m(this, build), new Void[0]);
                if (!m) {
                    break Label_0303;
                }
            }
            final Intent intent = new Intent(this.b.getBaseContext(), (Class)ContactPicker.class);
            intent.setType(a6.z[4]);
            intent.putExtra(a6.z[6], (Parcelable)build);
            intent.putExtra(a6.z[3], true);
            this.b.startActivity(intent);
            this.b.finish();
        }
        br.a((Context)this.b, this.c);
    }
}
