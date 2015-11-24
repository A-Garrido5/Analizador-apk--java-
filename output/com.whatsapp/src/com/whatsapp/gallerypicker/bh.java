// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.util.Iterator;
import com.whatsapp.util.cq;
import android.net.Uri;
import java.util.ArrayList;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class bh implements View$OnClickListener
{
    private static final String[] z;
    final ImagePreview a;
    
    static {
        final String[] z2 = new String[4];
        String s = ":zK\u0003C6u";
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
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = 'Y';
                        break;
                    }
                    case 1: {
                        c2 = '\u001b';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ":zK\u0003C6u";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "8u_\u0005E0\u007f\u0015\u001eD-~U\u0003\u0004<cO\u0005KwHo%o\u0018V";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "+tO\u0016^0tU";
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
    
    bh(final ImagePreview a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final int v = MediaGalleryBase.v;
        final Intent intent = new Intent();
        final ArrayList<Uri> list = new ArrayList<Uri>();
        for (Uri uri : ImagePreview.q(this.a)) {
            final Integer n = ImagePreview.u(this.a).get(uri);
            final String s = ImagePreview.e(this.a).get(uri);
            if (ImagePreview.k(this.a).containsKey(uri)) {
                uri = (Uri)ImagePreview.k(this.a).get(uri);
            }
            if (uri.getQueryParameter(bh.z[0]) != null) {
                uri = uri.buildUpon().query((String)null).build();
            }
            if (n != null) {
                uri = uri.buildUpon().appendQueryParameter(bh.z[3], n.toString()).build();
            }
            if (s != null) {
                uri = uri.buildUpon().appendQueryParameter(bh.z[1], cq.a(s)).build();
            }
            list.add(uri);
            if (v != 0) {
                break;
            }
        }
        intent.putParcelableArrayListExtra(bh.z[2], (ArrayList)list);
        this.a.setResult(-1, intent);
        ImagePreview.m(this.a);
        this.a.finish();
    }
}
