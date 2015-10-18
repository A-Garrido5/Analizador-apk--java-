// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.content.Context;
import com.whatsapp.util.Log;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

class b9 implements CompoundButton$OnCheckedChangeListener
{
    private static final String[] z;
    final ContactPickerHelp a;
    
    static {
        final String[] z2 = new String[3];
        String s = "N\u0002Va/X\u0007Pm";
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
                        c2 = 'J';
                        break;
                    }
                    case 0: {
                        c2 = ';';
                        break;
                    }
                    case 1: {
                        c2 = 'l';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = '\t';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "X\u0003[}+X\u0018]l&KCVkeX\u0000\\j!^\b\u001a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "X\u0004Pj!^\b";
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
    
    b9(final ContactPickerHelp a) {
        this.a = a;
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        if (this.a.t) {
            this.a.t = false;
            if (!App.I) {
                return;
            }
        }
        final StringBuilder append = new StringBuilder().append(b9.z[1]);
        String s;
        if (b) {
            s = b9.z[2];
        }
        else {
            s = b9.z[0];
        }
        Log.i(append.append(s).toString());
        App.d((Context)this.a, this.a.u.isChecked());
        a8s.a(new yb(this.a, null), new Void[0]);
    }
}
