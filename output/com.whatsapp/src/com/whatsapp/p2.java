// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.bi;
import org.whispersystems.F;

final class p2 implements F
{
    private static final String z;
    private final a8p a;
    final a9v b;
    private final a_9 c;
    private final bi d;
    
    static {
        final char[] charArray = "\u0015icx\u0013\u0000},y\u0019\u0007bms\u0019Tuiw\u000e\rax}\u0013\u001a1du\u0018T\u007fc4\u0018\u0015em/\\\u0017x||\u0019\u0006eil\bT~bx\u0005".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '|';
                    break;
                }
                case 0: {
                    c2 = 't';
                    break;
                }
                case 1: {
                    c2 = '\u0011';
                    break;
                }
                case 2: {
                    c2 = '\f';
                    break;
                }
                case 3: {
                    c2 = '\u0014';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public p2(final a9v b, final bi d, final a8p a, final a_9 c) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void a(final byte[] array) {
        if (!this.d.a()) {
            Log.i(p2.z);
            this.d.a(array);
        }
        final v1 p = Conversation.p();
        if (p.a() && !this.a.a() && p.b().I.equals(this.d.a.a) && this.c.l == 0) {
            this.d.c = 13;
        }
        App.ak.e(this.d, -1);
    }
}
