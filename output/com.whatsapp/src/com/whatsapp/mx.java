// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class mx implements View$OnClickListener
{
    private static final String[] z;
    final MultipleContactsSelector a;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0016v\rwP%h\u0001lJ\u0013q\u0007AV\u001fl\u000fkV\u0019z?mP\b";
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
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = '`';
                        break;
                    }
                    case 3: {
                        c2 = '\u001e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0016v\rwP";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000ev\u0014rA";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\tz\f{G\u000ez\u0004";
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
    
    mx(final MultipleContactsSelector a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.f() > 0 && this.a.l.size() >= this.a.f()) {
            this.a.f(String.format(this.a.getString(this.a.e()), this.a.f()));
            if (!App.I) {
                return;
            }
        }
        final Intent intent = new Intent((Context)this.a, (Class)MultipleContactPicker.class);
        intent.putExtra(mx.z[1], this.a.f());
        intent.putExtra(mx.z[0], this.a.e());
        intent.putExtra(mx.z[3], this.a.d());
        intent.putExtra(mx.z[2], this.a.a());
        this.a.startActivityForResult(intent, 1);
    }
}
