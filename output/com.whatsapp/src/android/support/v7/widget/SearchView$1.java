// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

class SearchView$1 implements Runnable
{
    private static final String z;
    final SearchView this$0;
    
    static {
        final char[] charArray = "Zx7\bfl{\"\tz\\r".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0012';
                    break;
                }
                case 0: {
                    c2 = '3';
                    break;
                }
                case 1: {
                    c2 = '\u0016';
                    break;
                }
                case 2: {
                    c2 = 'G';
                    break;
                }
                case 3: {
                    c2 = '}';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    SearchView$1(final SearchView this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        final InputMethodManager inputMethodManager = (InputMethodManager)this.this$0.getContext().getSystemService(SearchView$1.z);
        if (inputMethodManager != null) {
            SearchView.HIDDEN_METHOD_INVOKER.showSoftInputUnchecked(inputMethodManager, (View)this.this$0, 0);
        }
    }
}
