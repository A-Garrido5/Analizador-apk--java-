// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.Cursor;
import com.whatsapp.util.b6;
import com.whatsapp.protocol.bi;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class _8 implements View$OnClickListener
{
    private static final String[] z;
    final Conversation a;
    
    static {
        final String[] z2 = new String[7];
        String s = "Gb/:7V~ 8;Kcn/ Al5)}Hb (7E\u007f-%7V\"3)?K{$$7Ei$>";
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
                        c2 = 'R';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = '\r';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Gb/:7V~ 8;Kcn/ Al5)}Hb (7E\u007f-%7V\"))3@h3/<P-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Gb/:7V~ 8;Kcn =Ei$- Hd$>}Lh (7Vn/8r";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Gb/:7V~ 8;Kcn =Ei$- Hd$>}Vh,#$Ae$-6A\u007fad<Az|";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\b-8<=W0";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\b-1>7R0";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Gb/:7V~ 8;Kcn =Ei$- Hd$>}Jx- ";
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
    
    _8(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (Conversation.e(this.a) == null) {
            Log.i(_8.z[6]);
        }
        else {
            final int count = this.a.u.getCursor().getCount();
            int c;
            int n;
            int n2;
            if (this.a.aI.getChildCount() > 1) {
                final ConversationRow conversationRow = (ConversationRow)this.a.aI.getChildAt(1);
                final int h = conversationRow.h();
                final boolean b = conversationRow.B;
                c = conversationRow.c();
                n = h;
                n2 = (b ? 1 : 0);
            }
            else {
                n2 = 0;
                c = 0;
                n = 0;
            }
            Conversation.g(this.a, true);
            final int bottom = Conversation.e(this.a).getBottom();
            final Cursor a = App.ak.a(this.a.I, Conversation.c(this.a, true), null, Conversation.j(this.a));
            Conversation.a(this.a, a);
            this.a.u.changeCursor(a);
            this.a.u.getCursor().requery();
            final boolean x = App.ak.x(this.a.I);
            if (!x && Conversation.e(this.a) != null) {
                Conversation.e(this.a).setVisibility(8);
                this.a.aI.removeHeaderView(Conversation.e(this.a));
                Log.i(_8.z[1] + this.a.aI.getHeaderViewsCount());
                Conversation.a(this.a, (View)null);
                Log.i(_8.z[0]);
                this.a.u.notifyDataSetChanged();
            }
            final int count2 = this.a.u.getCursor().getCount();
            Conversation.c(this.a, count2 - count);
            if (count2 != 0 && count2 > count && Conversation.Y(this.a) < count2) {
                final bi bi = (bi)this.a.u.getItem(Conversation.Y(this.a));
                final bi bi2 = (bi)this.a.u.getItem(-1 + Conversation.Y(this.a));
                final boolean b2 = bi != null && bi2 != null && b6.b(bi2.u, bi.u);
                this.a.aI.setTranscriptMode(0);
                if (n2 == 0 || !b2) {
                    n = 0;
                }
                if (Conversation.p(this.a) && bi.a.b == bi2.a.b && !bi.a.b && bi.I == bi2.I && bi.I == 0 && bi.t != null && bi2.t != null && bi.t.equals(bi2.t)) {
                    n += c;
                }
                final Conversation a2 = this.a;
                final int y = Conversation.Y(this.a);
                int n3;
                if (x && Conversation.Y(this.a) < count2 - 1) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                Conversation.c(a2, n3 + y);
                this.a.aI.setSelectionFromTop(Conversation.Y(this.a), bottom + n);
                return;
            }
            if (x && Conversation.e(this.a) != null) {
                Conversation.e(this.a).setVisibility(8);
                this.a.aI.removeHeaderView(Conversation.e(this.a));
                Log.i(_8.z[2] + this.a.aI.getHeaderViewsCount());
                Conversation.a(this.a, (View)null);
                Log.i(_8.z[3] + count2 + _8.z[5] + count + _8.z[4] + Conversation.Y(this.a) + ")");
                this.a.u.notifyDataSetChanged();
            }
        }
    }
}
