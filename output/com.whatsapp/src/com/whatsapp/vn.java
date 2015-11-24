// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcelable;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.c6;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.protocol.bi;
import android.support.v4.view.PagerAdapter;

class vn extends PagerAdapter
{
    private static final String z;
    private bi a;
    final MediaView b;
    
    static {
        final char[] charArray = "8\u0000\u0012\f\u0004#\f\u0013\u0012J<\u000b\u0005\u0011\u0004;\u0011\u001f\u0004\u00110,\u0002\u0000\bz".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'e';
                    break;
                }
                case 0: {
                    c2 = 'U';
                    break;
                }
                case 1: {
                    c2 = 'e';
                    break;
                }
                case 2: {
                    c2 = 'v';
                    break;
                }
                case 3: {
                    c2 = 'e';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public vn(final MediaView b, final bi a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        viewGroup.removeView((View)o);
    }
    
    @Override
    public void finishUpdate(final View view) {
        if (this.a != null) {
            MediaView.a(this.b, this.a, 0);
            this.a = null;
        }
    }
    
    @Override
    public int getCount() {
        return MediaView.d(this.b).size();
    }
    
    @Override
    public int getItemPosition(final Object o) {
        final boolean i = App.I;
        final c6 c6 = (c6)((View)o).getTag();
        if (c6 == null) {
            return -2;
        }
        int n = -1;
        int n2;
        for (int j = 0; j < MediaView.d(this.b).size(); j = n2) {
            if (c6.equals(((bi)MediaView.d(this.b).get(j)).a)) {
                if (!i) {
                    n = j;
                    break;
                }
                n = j;
            }
            n2 = j + 1;
            if (i) {
                break;
            }
        }
        if (n < 0) {
            return -2;
        }
        return -1 + MediaView.d(this.b).size() - n;
    }
    
    @Override
    public CharSequence getPageTitle(final int n) {
        return "";
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final bi c = MediaView.c(this.b, n);
        Log.i(vn.z + c.a.c);
        final View c2 = MediaView.c(this.b, c);
        c2.setTag((Object)c.a);
        viewGroup.addView(c2, 0);
        return c2;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return view == o;
    }
    
    @Override
    public void restoreState(final Parcelable parcelable, final ClassLoader classLoader) {
    }
    
    @Override
    public Parcelable saveState() {
        return null;
    }
    
    @Override
    public void startUpdate(final View view) {
    }
}
