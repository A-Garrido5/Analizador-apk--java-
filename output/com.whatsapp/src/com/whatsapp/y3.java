// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;

class y3 implements Runnable
{
    private static final String[] z;
    final boolean a;
    final String b;
    final ConversationsFragment c;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u00105@uX\u0001)OwT\u001c4],Z\u00015[s\u0012\u00075IdQ\u0016\u001d\\lH\u0003\n\\lZ\u0001?]p_\u0012(\u00019";
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
                        c2 = '=';
                        break;
                    }
                    case 0: {
                        c2 = 's';
                        break;
                    }
                    case 1: {
                        c2 = 'Z';
                        break;
                    }
                    case 2: {
                        c2 = '.';
                        break;
                    }
                    case 3: {
                        c2 = '\u0003';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u00105@uX\u0001)OwT\u001c4],O\u0016<\\fN\u001b`\u000emRS,GfJS<Aq\u001d";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Sr";
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
    
    y3(final ConversationsFragment c, final String b, final boolean a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        Log.i(y3.z[0] + this.b);
        final View b = ConversationsFragment.b(this.c, this.b);
        if (b != null) {
            if (this.a) {
                b.findViewById(2131755513).setVisibility(0);
                if (!i) {
                    return;
                }
            }
            b.findViewById(2131755513).setVisibility(8);
            if (!i) {
                return;
            }
        }
        Log.w(y3.z[1] + this.b + " " + ConversationsFragment.k(this.c).getFirstVisiblePosition() + "-" + ConversationsFragment.k(this.c).getLastVisiblePosition() + y3.z[2] + ConversationsFragment.k(this.c).getCount() + ")");
    }
}
