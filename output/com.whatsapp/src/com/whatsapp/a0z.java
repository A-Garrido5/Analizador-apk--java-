// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.util.Log;
import android.view.View;
import com.whatsapp.util.co;

class a0z extends co
{
    private static final String[] z;
    final VoipActivity b;
    
    static {
        final String[] z2 = new String[2];
        String s = "\bHyl\u0017\u000bNTe\u001f\u0001vjr\u001a\fFTv\u000b\u0004Ebs\u0007";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '~';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = '\u000b';
                        break;
                    }
                    case 3: {
                        c2 = '\u0007';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u0013FbwQ\bHyl\u0017\u000bNTe\u001f\u0001vjr\u001a\fFTv\u000b\u0004Ebs\u0007";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a0z(final VoipActivity b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        if (App.aV >= 2) {
            Log.i(a0z.z[1]);
            App.b((Context)this.b, a0z.z[0], 0);
        }
    }
}
