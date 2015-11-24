// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aq1 implements Runnable
{
    private static final String z;
    final a06 a;
    
    static {
        final char[] charArray = "9\u0003\n\u0019\n9B".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'g';
                    break;
                }
                case 0: {
                    c2 = '\\';
                    break;
                }
                case 1: {
                    c2 = 'b';
                    break;
                }
                case 2: {
                    c2 = '~';
                    break;
                }
                case 3: {
                    c2 = '9';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aq1(final a06 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(aq1.z);
        }
    }
}
