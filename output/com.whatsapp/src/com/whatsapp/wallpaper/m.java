// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

class m extends BaseAdapter
{
    private static final String[] z;
    final WallpaperPicker a;
    private LayoutInflater b;
    
    static {
        final String[] z2 = new String[2];
        String s = "uND$\u0019\"IG:I4XN$\u0019v";
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
                        c2 = '9';
                        break;
                    }
                    case 0: {
                        c2 = 'U';
                        break;
                    }
                    case 1: {
                        c2 = '(';
                        break;
                    }
                    case 2: {
                        c2 = '+';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
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
                    s = "\u0010ZY9KuLN5V1AE1\u0019!@^;[;IB:\u0019'MX\u001f]h";
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
    
    m(final WallpaperPicker a, final WallpaperPicker wallpaperPicker) {
        this.a = a;
        this.b = wallpaperPicker.getLayoutInflater();
    }
    
    public int getCount() {
        return WallpaperPicker.a(this.a).size();
    }
    
    public Object getItem(final int n) {
        return n;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final boolean h = ImageViewTouchBase.h;
        ImageView imageView2 = null;
        Label_0036: {
            if (view == null) {
                final ImageView imageView = (ImageView)this.b.inflate(2130903236, viewGroup, false);
                if (!h) {
                    imageView2 = imageView;
                    break Label_0036;
                }
            }
            imageView2 = (ImageView)view;
        }
        final int intValue = WallpaperPicker.a(this.a).get(n);
        imageView2.setImageDrawable(this.a.h.getDrawable(intValue));
        final Drawable drawable = imageView2.getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
            if (!h) {
                return (View)imageView2;
            }
        }
        Log.e(m.z[1] + intValue + m.z[0] + n);
        return (View)imageView2;
    }
}
