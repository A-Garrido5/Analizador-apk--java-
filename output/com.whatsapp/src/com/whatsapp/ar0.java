// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

class ar0 implements Runnable
{
    private static final String[] z;
    final pe a;
    final ArrayList b;
    
    static {
        final String[] z2 = new String[7];
        String s = "pv\u000f\u0006ux|E\u001dte}\u0005\u00004t`\u001f\u0006{?L.,N";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001a';
                        break;
                    }
                    case 0: {
                        c2 = '\u0011';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = 'k';
                        break;
                    }
                    case 3: {
                        c2 = 't';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "?l\u0013\u0000";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "pv\u000f\u0006ux|E\u001dte}\u0005\u00004t`\u001f\u0006{?K?&_PU";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "J'Q(5;:WJfL";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "pv\u000f\u0006ux|E\u001dte}\u0005\u00004t`\u001f\u0006{?K>6PT[?";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "pv\u000f\u0006ux|E\u001dte}\u0005\u00004p{\u001f\u001du\u007f681TUG&!VEQ;8_";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "e}\u0013\u00005;";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ar0(final pe a, final ArrayList b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.e.c();
        if (this.b != null) {
            a8q.a(new Intent(ar0.z[5]).setType(ar0.z[6]).putExtra(ar0.z[4], App.aq.getString(2131231054, new Object[] { this.a.b.a((Context)this.a.c) })).putExtra(ar0.z[0], App.aq.getString(2131231050, new Object[] { App.aq.getString(2131231054, new Object[] { this.a.b.a((Context)this.a.c) }).replaceAll(ar0.z[3], "") + ar0.z[1] })).putParcelableArrayListExtra(ar0.z[2], this.b), this.a.c, this.a.e, this.a.c.getString(2131231634));
            if (!App.I) {
                return;
            }
        }
        this.a.e.a(2131231051);
    }
}
