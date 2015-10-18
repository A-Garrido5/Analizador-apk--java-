// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;
import android.os.Handler;
import android.database.ContentObserver;

class bl extends ContentObserver
{
    private static final String[] z;
    final GalleryPickerFragment a;
    
    static {
        final String[] z2 = new String[2];
        String s = ")9<d\n<! a\f%=\"'";
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
                        c2 = 'o';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = 'X';
                        break;
                    }
                    case 2: {
                        c2 = 'P';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
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
                    s = "n6?(\f!6$m\u0001:x\"m\u001c!4&m\u001d";
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
    
    bl(final GalleryPickerFragment a, final Handler handler) {
        this.a = a;
        super(handler);
    }
    
    public void onChange(final boolean b) {
        if (GalleryPickerFragment.h(this.a) != null) {
            GalleryPickerFragment.a(this.a, false, a6.a(GalleryPickerFragment.h(this.a)));
            if (MediaGalleryBase.v == 0) {
                return;
            }
        }
        Log.i(bl.z[0] + GalleryPickerFragment.b(this.a) + bl.z[1]);
    }
}
