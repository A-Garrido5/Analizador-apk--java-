// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.bi;

class asf implements Runnable
{
    private static final String[] z;
    final Conversation a;
    final bi b;
    
    static {
        final String[] z2 = new String[2];
        String s = "P>";
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
                        c2 = 'x';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = '\u0016';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
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
                    s = "\u0013y<>\u001d\u0002e3<\u0011\u001fx}:\u001d\u0016d7;\u0010J6<'X\u0006\u007f7?X\u0016y h";
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
    
    asf(final Conversation a, final bi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final View viewWithTag = this.a.aI.findViewWithTag((Object)this.b);
        if (viewWithTag != null) {
            ((ConversationRow)viewWithTag).a();
            if (!App.I) {
                return;
            }
        }
        if (!Conversation.v(this.a).contains(this.b)) {
            Conversation.v(this.a).add(this.b);
            Log.w(asf.z[1] + this.b.a.c + " " + this.a.aI.getFirstVisiblePosition() + "-" + this.a.aI.getLastVisiblePosition() + asf.z[0] + this.a.aI.getCount() + ")");
        }
    }
}
