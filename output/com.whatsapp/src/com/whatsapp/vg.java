// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class vg extends FragmentStatePagerAdapter implements hh
{
    private static final String[] z;
    int a;
    final HomeActivity b;
    aoz[] c;
    
    static {
        final String[] z2 = new String[3];
        String s = "6V\u0003Rk\u0016[\u000bRr\rM\u000f\u0006k\rPF\u0001j\rK\n\u0016\"\u0000[F\u001eg\u0011MF\u001dpB[\u0017\u0007c\u000e\u001e\u0012\u001d8Q";
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
                        c2 = '\u0002';
                        break;
                    }
                    case 0: {
                        c2 = 'b';
                        break;
                    }
                    case 1: {
                        c2 = '>';
                        break;
                    }
                    case 2: {
                        c2 = 'f';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "#l!-K,w2;C.a6=Q+j/=L";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "6V\u0003Rk\u0016[\u000bRr\rM\u000f\u0006k\rPF\u0001j\rK\n\u0016\"\u0000[F\u001eg\u0011MF\u001dpB[\u0017\u0007c\u000e\u001e\u0012\u001d8Q";
                    n2 = 2;
                    array = z2;
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
    
    public vg(final HomeActivity b, final FragmentManager fragmentManager) {
        this.b = b;
        super(fragmentManager);
        this.c = new aoz[3];
    }
    
    private aoz a(final int n) {
        if (this.c[n] == null) {
            final aoz aoz = new aoz(null);
            aoz.c = alm.a(this.b.getLayoutInflater(), 2130903171, null, false);
            (aoz.d = (TextView)aoz.c.findViewById(2131755617)).setText(this.getPageTitle(n));
            aoz.a = (TextView)aoz.c.findViewById(2131755618);
            this.c[n] = aoz;
        }
        return this.c[n];
    }
    
    static aoz a(final vg vg, final int n) {
        return vg.a(n);
    }
    
    @Override
    public View a(final int n) {
        return this.a(n).c;
    }
    
    public void b(final int a) {
        this.a = a;
    }
    
    @Override
    public int getCount() {
        return 3;
    }
    
    @Override
    public Fragment getItem(final int n) {
        ga ga = null;
        switch (n) {
            default: {
                throw new IllegalArgumentException(vg.z[0]);
            }
            case 1: {
                ga = new ConversationsFragment();
                break;
            }
            case 0: {
                ga = new CallsFragment();
                break;
            }
            case 2: {
                ga = new ContactsFragment();
                break;
            }
        }
        if (this.a > 0) {
            final Bundle arguments = new Bundle();
            arguments.putInt(vg.z[1], 1);
            ((Fragment)ga).setArguments(arguments);
        }
        return (Fragment)ga;
    }
    
    @Override
    public CharSequence getPageTitle(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException(vg.z[2]);
            }
            case 1: {
                try {
                    return this.b.getString(2131230893).toUpperCase();
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case 0: {
                return this.b.getString(2131230864).toUpperCase();
            }
            case 2: {
                return this.b.getString(2131230940).toUpperCase();
            }
        }
    }
    
    @Override
    public void setPrimaryItem(final ViewGroup viewGroup, final int n, final Object o) {
        super.setPrimaryItem(viewGroup, n, o);
    }
}
