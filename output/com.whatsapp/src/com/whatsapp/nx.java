// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class nx implements Runnable
{
    private static final String z;
    final fm a;
    
    static {
        final char[] charArray = "JmS\u0001(kj\u000e\u00170z0\u0013\u00134".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '@';
                    break;
                }
                case 0: {
                    c2 = '\n';
                    break;
                }
                case 1: {
                    c2 = '\u001e';
                    break;
                }
                case 2: {
                    c2 = '}';
                    break;
                }
                case 3: {
                    c2 = 'v';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    nx(final fm a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        _o.b(this.a.a).ap.remove(App.au() + nx.z);
    }
}
