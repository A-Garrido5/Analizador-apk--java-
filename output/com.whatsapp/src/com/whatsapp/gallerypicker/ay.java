// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemLongClickListener;

class ay implements AdapterView$OnItemLongClickListener
{
    private static final String[] z;
    final MediaPicker a;
    
    static {
        final String[] z2 = new String[2];
        String s = "/S\u0017L\u00112_\u0010N\u00150\u0019\u001aQ\u0015/Z\u001cK\u0017!Z\u001aF\u001bm\u0016\u0003J\u0003+B\u001aJ\u001ex";
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
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = '6';
                        break;
                    }
                    case 2: {
                        c2 = 's';
                        break;
                    }
                    case 3: {
                        c2 = '%';
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
                    s = "bU\u001cP\u001e6\f";
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
    
    ay(final MediaPicker a) {
        this.a = a;
    }
    
    public boolean onItemLongClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final int v = MediaGalleryBase.v;
        final bj a = this.a.o.a(n);
        if (a != null) {
            if (MediaPicker.b(this.a) != null) {
                MediaPicker.a(this.a, a);
                if (v == 0) {
                    return true;
                }
            }
            MediaPicker.a(this.a).add(a.a());
            MediaPicker.a(this.a, this.a.startSupportActionMode(MediaPicker.c(this.a)));
            this.a.s.notifyDataSetChanged();
            if (v == 0) {
                return true;
            }
        }
        Log.e(ay.z[0] + n + ay.z[1] + this.a.B);
        return true;
    }
}
