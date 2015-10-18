// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ba implements Runnable
{
    private static final String z;
    final pe a;
    final String b;
    
    static {
        final char[] charArray = "\r2]%k\">\u0018".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001b';
                    break;
                }
                case 0: {
                    c2 = 'C';
                    break;
                }
                case 1: {
                    c2 = ']';
                    break;
                }
                case 2: {
                    c2 = '}';
                    break;
                }
                case 3: {
                    c2 = 'V';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ba(final pe a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.e.c();
        if (this.b != null && this.b.contains(ba.z)) {
            final gu e = this.a.e;
            String s;
            if (App.aw()) {
                s = App.aq.getString(2131231052) + " " + App.aq.getString(2131231599);
            }
            else {
                s = App.aq.getString(2131231053) + " " + App.aq.getString(2131231600);
            }
            e.f(s);
            if (!App.I) {
                return;
            }
        }
        this.a.e.a(2131231051);
    }
}
