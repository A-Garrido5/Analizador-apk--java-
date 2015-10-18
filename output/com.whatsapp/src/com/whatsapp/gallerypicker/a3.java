// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.v4.app.FragmentManager;
import android.widget.TextView;
import com.whatsapp.hh;
import android.support.v4.app.FragmentStatePagerAdapter;

class a3 extends FragmentStatePagerAdapter implements hh
{
    private static final String[] z;
    private TextView[] a;
    final GalleryPicker b;
    
    static {
        final String[] z2 = new String[2];
        String s = "x#?v\u001du(";
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
                        c2 = 'h';
                        break;
                    }
                    case 0: {
                        c2 = '\u0011';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = '\u001a';
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
                    s = "x#?v\u001du(";
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
    
    public a3(final GalleryPicker b, final FragmentManager fragmentManager) {
        this.b = b;
        super(fragmentManager);
        this.a = new TextView[2];
    }
    
    @Override
    public View a(final int n) {
        if (this.a[n] == null) {
            final TextView textView = new TextView(this.b.getBaseContext());
            textView.setText(this.getPageTitle(n));
            textView.setTextColor(this.b.getResources().getColor(2131623942));
            textView.setGravity(17);
            textView.setSingleLine();
            textView.setTextSize(14.0f);
            this.a[n] = textView;
        }
        return (View)this.a[n];
    }
    
    public void a(final int n) {
        final int v = MediaGalleryBase.v;
        int i = 0;
        while (i < this.a.length) {
            final TextView textView = this.a[i];
            Label_0066: {
                if (i == n) {
                    textView.setTextColor(this.b.getResources().getColor(2131623942));
                    if (v == 0) {
                        break Label_0066;
                    }
                }
                textView.setTextColor(this.b.getResources().getColor(2131623985));
            }
            ++i;
            if (v != 0) {
                break;
            }
        }
    }
    
    @Override
    public int getCount() {
        return 2;
    }
    
    @Override
    public Fragment getItem(final int n) {
        final GalleryPickerFragment galleryPickerFragment = new GalleryPickerFragment();
        final Bundle arguments = new Bundle();
        Label_0063: {
            switch (n) {
                case 0: {
                    arguments.putInt(a3.z[0], 1);
                    if (MediaGalleryBase.v != 0) {
                        break Label_0063;
                    }
                    break;
                }
                case 1: {
                    arguments.putInt(a3.z[1], 4);
                    break;
                }
            }
        }
        galleryPickerFragment.setArguments(arguments);
        return galleryPickerFragment;
    }
    
    @Override
    public CharSequence getPageTitle(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                return this.b.getResources().getString(2131231835);
            }
            case 1: {
                return this.b.getResources().getString(2131231836);
            }
        }
    }
}
