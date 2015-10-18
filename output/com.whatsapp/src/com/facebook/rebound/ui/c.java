// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound.ui;

import com.facebook.rebound.b;
import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class c implements SeekBar$OnSeekBarChangeListener
{
    private static final String[] z;
    final SpringConfiguratorView a;
    
    static {
        final String[] z2 = new String[2];
        String s = "&=";
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
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '`';
                        break;
                    }
                    case 1: {
                        c2 = '\u0007';
                        break;
                    }
                    case 2: {
                        c2 = '/';
                        break;
                    }
                    case 3: {
                        c2 = '\u0011';
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
                    s = "4=";
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
    
    private c(final SpringConfiguratorView a) {
        this.a = a;
    }
    
    c(final SpringConfiguratorView springConfiguratorView, final e e) {
        this(springConfiguratorView);
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (seekBar == SpringConfiguratorView.e(this.a)) {
            final float n2 = 0.0f + 200.0f * n / 100000.0f;
            SpringConfiguratorView.j(this.a).c = b.b(n2);
            SpringConfiguratorView.d(this.a).setText((CharSequence)(c.z[1] + SpringConfiguratorView.a().format(n2)));
        }
        if (seekBar == SpringConfiguratorView.a(this.a)) {
            final float n3 = 0.0f + 50.0f * n / 100000.0f;
            SpringConfiguratorView.j(this.a).a = b.c(n3);
            SpringConfiguratorView.i(this.a).setText((CharSequence)(c.z[0] + SpringConfiguratorView.a().format(n3)));
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
    }
}
