// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.view.View;
import com.whatsapp.util.co;

class a0b extends co
{
    private static final String[] z;
    final RegisterPhone b;
    
    static {
        final String[] z2 = new String[4];
        String s = "D\u00039DoB\u0003,\u0002l^\t0H3U\t+ChD\u001f.D\u007f]\u0003,\u0002\u007fZ\u000f=FyRF0\u0010";
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
                        c2 = '\u001c';
                        break;
                    }
                    case 0: {
                        c2 = '6';
                        break;
                    }
                    case 1: {
                        c2 = 'f';
                        break;
                    }
                    case 2: {
                        c2 = '^';
                        break;
                    }
                    case 3: {
                        c2 = '-';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0016\u0016c";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "D\u00039DoB\u0003,\u0002l^\t0H3U\t+ChD\u001f.D\u007f]\u0003,\u0002\u007fZ\u000f=FyRI:D}Z\t9\u0000j_\u00157OpSI-FuFF0\u0010";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0016\u0016c";
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
    
    a0b(final RegisterPhone b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        Log.i(a0b.z[0] + RegisterPhone.i(this.b) + a0b.z[1] + this.b.x);
        if (RegisterPhone.i(this.b) == null && this.b.x == null) {
            final Intent intent = new Intent((Context)this.b, (Class)CountryPicker.class);
            intent.putExtra(CountryPicker.q, this.b.y.f.getText().toString());
            this.b.startActivityForResult(intent, 0);
            this.b.y.a.removeTextChangedListener(this.b.y.g);
            RegisterPhone.a(this.b, true);
            if (!App.I) {
                return;
            }
        }
        Log.i(a0b.z[2] + RegisterPhone.i(this.b) + a0b.z[3] + this.b.x);
    }
}
