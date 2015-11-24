// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.bi;

class sz extends sj
{
    private static final String[] z;
    final Conversation a;
    
    static {
        final String[] z2 = new String[2];
        String s = "#~l\u000b62bc\t:/\u007f-\u0011:3ea\u00152.vg\u0019|,~c\u00196!cn\u001462>l\u0012'6xq\u00141,t-\u000f6-~t\u001815ev\u0012=";
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
                        c2 = 'S';
                        break;
                    }
                    case 0: {
                        c2 = '@';
                        break;
                    }
                    case 1: {
                        c2 = '\u0011';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = '}';
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
                    s = "#~l\u000b62bc\t:/\u007f-\u0011:3ea\u00152.vg\u0019|,~c\u00196!cn\u001462>j\u00182$tp\u001e=41";
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
    
    sz(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void a(final bi bi, final int n) {
        final boolean i = App.I;
        if (bi != null && bi.a.a.equals(this.a.I) && bi.I != 8) {
            if (Conversation.B(this.a) != 0) {
                Conversation.D(this.a).add(bi);
                if (!i) {
                    return;
                }
            }
            Label_0120: {
                if (Conversation.b(this.a)) {
                    this.a.u.getCursor().requery();
                    Conversation.k(this.a, false);
                    if (!i) {
                        break Label_0120;
                    }
                }
                if (!bi.a.b) {
                    Conversation.d(this.a, bi);
                }
            }
            this.a.u.notifyDataSetChanged();
            Conversation.N(this.a);
        }
    }
    
    @Override
    public void a(final String s) {
        if (s != null && s.equals(this.a.I)) {
            this.a.u.getCursor().requery();
            if (!App.ak.x(this.a.I) && Conversation.e(this.a) != null) {
                Conversation.e(this.a).setVisibility(8);
                this.a.aI.removeHeaderView(Conversation.e(this.a));
                Log.i(sz.z[1] + this.a.aI.getHeaderViewsCount());
                Conversation.a(this.a, (View)null);
                Log.i(sz.z[0]);
                this.a.u.notifyDataSetChanged();
            }
        }
    }
    
    @Override
    public void b(final bi bi) {
        if (bi != null && bi.a.a.equals(this.a.I) && bi.a.b && bi.I != 8) {
            if (this.a.u.getCursor() != null) {
                Conversation.t(this.a).add(bi);
            }
            if (Conversation.p(this.a) && bi.c == 6 && (bi.L == 1L || bi.L == 4L || bi.L == 5L || bi.L == 7L || bi.L == 12L || bi.L == 13L || bi.L == 14L || bi.L == 17L)) {
                Conversation.aa(this.a);
            }
            if (Conversation.p(this.a) && Conversation.E(this.a) != 0) {
                nm.a(this.a.u, nm.a(this.a.u));
                Conversation.b(this.a, 0);
            }
            this.a.u.notifyDataSetChanged();
            if (Conversation.Q(this.a) != null) {
                Conversation.M(this.a);
            }
            Conversation.a(this.a);
        }
    }
    
    @Override
    public void b(final bi bi, final int n) {
        if (bi != null && bi.a.a.equals(this.a.I) && bi.I != 8) {
            Conversation.e(this.a, bi);
            if (n == 3 && bi.I == 1 && this.a.aI.getLastVisiblePosition() >= -2 + this.a.aI.getCount() && this.a.aI.getChildCount() > 0 && bi.equals(this.a.aI.getChildAt(-1 + this.a.aI.getChildCount()).getTag())) {
                Conversation.a(this.a);
            }
        }
    }
}
