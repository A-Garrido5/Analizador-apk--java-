// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.KeyEvent;

class KeyEventCompat$BaseKeyEventVersionImpl implements KeyEventCompat$KeyEventVersionImpl
{
    private static final String z;
    
    static {
        final char[] charArray = "#u:%b3s+hf/`-".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0003';
                    break;
                }
                case 0: {
                    c2 = 'A';
                    break;
                }
                case 1: {
                    c2 = '\u0014';
                    break;
                }
                case 2: {
                    c2 = '^';
                    break;
                }
                case 3: {
                    c2 = '\u0005';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private static int metaStateFilterDirectionalModifiers(int n, final int n2, final int n3, final int n4, final int n5) {
        int n6 = 1;
        while (true) {
            Label_0052: {
                if ((n2 & n3) == 0x0) {
                    break Label_0052;
                }
                final int n7 = n6;
                final int n8 = n4 | n5;
                if ((n2 & n8) == 0x0) {
                    n6 = 0;
                }
                if (n7 != 0) {
                    if (n6 != 0) {
                        try {
                            throw new IllegalArgumentException(KeyEventCompat$BaseKeyEventVersionImpl.z);
                        }
                        catch (IllegalArgumentException ex) {
                            throw ex;
                        }
                        break Label_0052;
                    }
                    n &= ~n8;
                }
                else if (n6 != 0) {
                    return n & ~n3;
                }
                return n;
            }
            final int n7 = 0;
            continue;
        }
    }
    
    @Override
    public boolean metaStateHasModifiers(final int n, final int n2) {
        return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(0xF7 & this.normalizeMetaState(n), n2, 1, 64, 128), n2, 2, 16, 32) == n2;
    }
    
    @Override
    public boolean metaStateHasNoModifiers(final int n) {
        try {
            if ((this.normalizeMetaState(n) & 0xF7) == 0x0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public int normalizeMetaState(final int n) {
        int n2;
        if ((n & 0xC0) != 0x0) {
            n2 = (n | 0x1);
        }
        else {
            n2 = n;
        }
        if ((n2 & 0x30) != 0x0) {
            n2 |= 0x2;
        }
        return n2 & 0xF7;
    }
    
    @Override
    public void startTracking(final KeyEvent keyEvent) {
    }
}
