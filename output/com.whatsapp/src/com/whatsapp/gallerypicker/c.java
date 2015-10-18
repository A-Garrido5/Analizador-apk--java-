// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.content.ComponentName;
import android.view.MenuItem;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.MenuItem$OnMenuItemClickListener;

class c implements MenuItem$OnMenuItemClickListener
{
    private static final String[] z;
    final ResolveInfo a;
    final Intent b;
    final GalleryPicker c;
    
    static {
        final String[] z2 = new String[2];
        String s = "|_3GaiG";
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
                        c2 = '\u0004';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = '>';
                        break;
                    }
                    case 2: {
                        c2 = '_';
                        break;
                    }
                    case 3: {
                        c2 = '+';
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
                    s = "xQ2\u0005ss_+XekN\u0000[v~X:Yau]:X";
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
    
    c(final GalleryPicker c, final ResolveInfo a, final Intent b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public boolean onMenuItemClick(final MenuItem menuItem) {
        this.c.getSharedPreferences(com.whatsapp.gallerypicker.c.z[1], 0).edit().putString(com.whatsapp.gallerypicker.c.z[0] + GalleryPicker.a(this.c), this.a.activityInfo.packageName + "_" + this.a.activityInfo.name).commit();
        this.b.setComponent(new ComponentName(this.a.activityInfo.packageName, this.a.activityInfo.name));
        this.c.startActivityForResult(this.b, 1);
        return false;
    }
}
