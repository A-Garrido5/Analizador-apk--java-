// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity;
import com.whatsapp.util.Log;
import android.app.Activity;

class aho extends ahl
{
    private static final String[] z;
    final RegisterName i;
    
    static {
        final String[] z2 = new String[3];
        String s = ")|>7g/|+0u6|v,q(m6,qt}0?x4~v2u.w:69<}+7b>47;cvl*;f";
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
                        c2 = '\u0014';
                        break;
                    }
                    case 0: {
                        c2 = '[';
                        break;
                    }
                    case 1: {
                        c2 = '\u0019';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = '^';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ")|>7g/|+0u6|v,q(m6,q?p82{<6=1z>";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = ")|>7g/|+0u6|v,q(m6,q?p82{<6*5}+";
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
    
    aho(final RegisterName i, final Activity activity) {
        this.i = i;
        super(activity);
    }
    
    @Override
    public void b() {
        Log.i(aho.z[2]);
        this.i.showDialog(106);
    }
    
    @Override
    public void c() {
        this.i.b(true);
    }
    
    @Override
    public void d() {
        Log.i(aho.z[1]);
        Log.i(aho.z[0]);
        if (!RegisterName.a(this.i) && GoogleDriveNewUserSetupActivity.e()) {
            this.i.startActivityForResult(new Intent((Context)this.i, (Class)GoogleDriveNewUserSetupActivity.class), 15);
            RegisterName.b(this.i, true);
            if (!App.I) {
                return;
            }
        }
        this.i.removeDialog(103);
    }
}
