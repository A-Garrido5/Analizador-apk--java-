// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.io.Serializable;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class j implements View$OnClickListener
{
    private static final String[] z;
    final ImagePreview a;
    
    static {
        final String[] z2 = new String[5];
        String s = "=\u0016Z\u001e\u00105\u001c\u0010\u0005\u0011(\u001dP\u0018Q9\u0000J\u001e\u001er+j>:\u001d5";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u007f';
                        break;
                    }
                    case 0: {
                        c2 = '\\';
                        break;
                    }
                    case 1: {
                        c2 = 'x';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = 'l';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "?\nQ\u001c\n.\u0011M";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "?\nQ\u001c\r9\u001bJ\u001f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "?\u0019N\u0018\u00163\u0016M";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = ".\u0017J\r\u000b5\u0017P\u001f";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    j(final ImagePreview a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent();
        intent.putParcelableArrayListExtra(j.z[0], ImagePreview.q(this.a));
        intent.putExtra(j.z[4], (Serializable)ImagePreview.u(this.a));
        intent.putExtra(j.z[1], (Serializable)ImagePreview.k(this.a));
        intent.putExtra(j.z[2], (Serializable)ImagePreview.f(this.a));
        intent.putExtra(j.z[3], (Serializable)ImagePreview.e(this.a));
        this.a.setResult(1, intent);
        this.a.finish();
    }
}
