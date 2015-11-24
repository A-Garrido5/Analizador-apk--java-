// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.SharedPreferences$Editor;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.content.Context;
import java.io.File;

class a2u implements Runnable
{
    private static final String[] z;
    final ChangeNumber a;
    
    static {
        final String[] z2 = new String[10];
        String s = "Yb";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '+';
                        break;
                    }
                    case 0: {
                        c2 = '4';
                        break;
                    }
                    case 1: {
                        c2 = '\u0007';
                        break;
                    }
                    case 2: {
                        c2 = ',';
                        break;
                    }
                    case 3: {
                        c2 = '$';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "WhA\n\\\\fXWJDw\u0002rNFnJ]xYt\u0002WNFqIVXQiH";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Wd";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "WoMJLQiYIIQu\u0003RD]dI";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "WhA\n\\\\fXWJDw\u0002rNFnJ]xYt\u0002GCUiKAEAjNAY";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "WhA\n\\\\fXWJDw\u0002rNFnJ]xYt\u0002VDUjEJL";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Do";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "WhA\n\\\\fXWJDwsTYQaIVNZdIW";
                    n = 6;
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    array = z2;
                    s = "WoMJLQiYIIQu\u0003WN@dOTC[iIJ^Y(JEBXbH";
                    n = 7;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "WhA\n\\\\fXWJDw\u0002rNFnJ]xYt\u0002WNFqIVXQiH";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a2u(final ChangeNumber a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.o();
        App.as();
        App.aX = null;
        new File(App.aq.getFilesDir(), a2u.z[0]).delete();
        al5.h();
        App.f((Context)App.aq, null);
        App.b((Context)this.a, 4);
        final SharedPreferences$Editor edit = this.a.getSharedPreferences(a2u.z[7], 0).edit();
        edit.putString(a2u.z[2], EnterPhoneNumber.z);
        edit.putString(a2u.z[6], EnterPhoneNumber.w);
        if (!edit.commit()) {
            Log.e(a2u.z[8]);
        }
        final Intent intent = new Intent((Context)this.a, (Class)VerifySms.class);
        intent.putExtra(a2u.z[9], this.a.t);
        intent.putExtra(a2u.z[5], this.a.k);
        intent.putExtra(a2u.z[4], true);
        Label_0225: {
            if (this.a.c()) {
                intent.putExtra(a2u.z[1], this.a.t);
                if (!App.I) {
                    break Label_0225;
                }
            }
            Log.i(a2u.z[3]);
        }
        this.a.startActivity(intent);
        this.a.finish();
    }
}
