// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.util.Log;
import com.whatsapp.contact.f;
import com.whatsapp.contact.h;
import com.whatsapp.contact.k;
import android.os.AsyncTask;

class yb extends AsyncTask
{
    private static final String[] z;
    final ContactPickerHelp a;
    
    static {
        final String[] z2 = new String[4];
        String s = "B#<LvB8:]{Qc!AyBc!MtB)!K8B.!LvU9!\u0018";
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
                        c2 = '\u0017';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = 'L';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
                        break;
                    }
                    case 3: {
                        c2 = '8';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "B#<LvB8:]{Qc!AyBc4Y~M)6\u0017tC?&YcT?r";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "B#<LvB8:]{Qc!AyBc4Y~M)6\u0017tC?&YcT?r";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "B#<LvB8:]{Qc!AyBc4Y~M)6\u0017tC?&YcT?r";
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
    
    private yb(final ContactPickerHelp a) {
        this.a = a;
    }
    
    yb(final ContactPickerHelp contactPickerHelp, final mo mo) {
        this(contactPickerHelp);
    }
    
    protected k a(final Void[] array) {
        return f.d(this.a.getApplicationContext(), h.INTERACTIVE_FULL);
    }
    
    protected void a(final k k) {
        final boolean i = App.I;
        this.a.c();
        Label_0287: {
            switch (a_r.a[k.ordinal()]) {
                case 1: {
                    App.aL.c(true);
                    App.aq.a(System.currentTimeMillis());
                    Log.i(yb.z[0] + this.a.u.isChecked());
                    this.a.a(2131230943);
                    if (i) {
                        break Label_0287;
                    }
                    break;
                }
                case 2: {
                    this.a.t = true;
                    this.a.u.toggle();
                    Log.i(yb.z[1] + this.a.u.isChecked());
                    App.d((Context)this.a, this.a.u.isChecked());
                    this.a.a(2131230905);
                    if (i) {
                        break Label_0287;
                    }
                    break;
                }
                case 3:
                case 4: {
                    App.aL.b(true);
                    this.a.t = true;
                    this.a.u.toggle();
                    Log.i(yb.z[2] + this.a.u.isChecked());
                    App.d((Context)this.a, this.a.u.isChecked());
                    this.a.a(2131230904);
                    if (i) {
                        break Label_0287;
                    }
                    break;
                }
                case 5: {
                    this.a.t = true;
                    this.a.u.toggle();
                    Log.i(yb.z[3] + this.a.u.isChecked());
                    App.d((Context)this.a, this.a.u.isChecked());
                    this.a.a(2131230906);
                }
            }
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((k)o);
    }
    
    protected void onPreExecute() {
        this.a.c(2131231591);
    }
}
