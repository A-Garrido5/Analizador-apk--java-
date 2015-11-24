// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.support.annotation.Nullable;
import android.view.View;

class Fragment$1 implements FragmentContainer
{
    private static final String z;
    final Fragment this$0;
    
    static {
        final char[] charArray = "T3};\u0007w/h|\u000e}$o|\u0004}5<4\u000bd$<=Jd(y+".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'j';
                    break;
                }
                case 0: {
                    c2 = '\u0012';
                    break;
                }
                case 1: {
                    c2 = 'A';
                    break;
                }
                case 2: {
                    c2 = '\u001c';
                    break;
                }
                case 3: {
                    c2 = '\\';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    Fragment$1(final Fragment this$0) {
        this.this$0 = this$0;
    }
    
    @Nullable
    @Override
    public View findViewById(final int n) {
        try {
            if (this.this$0.mView == null) {
                throw new IllegalStateException(Fragment$1.z);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return this.this$0.mView.findViewById(n);
    }
    
    @Override
    public boolean hasView() {
        try {
            if (this.this$0.mView != null) {
                return true;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return false;
    }
}
