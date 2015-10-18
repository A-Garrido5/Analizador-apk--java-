// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.widget.AutoCompleteTextView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;

public class SearchView$SearchAutoComplete extends AppCompatAutoCompleteTextView
{
    private static final String z;
    private SearchView mSearchView;
    private int mThreshold;
    
    static {
        final char[] charArray = "p\u001b\u001c[\bF\u0018\tZ\u0014v\u0011".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '|';
                    break;
                }
                case 0: {
                    c2 = '\u0019';
                    break;
                }
                case 1: {
                    c2 = 'u';
                    break;
                }
                case 2: {
                    c2 = 'l';
                    break;
                }
                case 3: {
                    c2 = '.';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public SearchView$SearchAutoComplete(final Context context) {
        this(context, null);
    }
    
    public SearchView$SearchAutoComplete(final Context context, final AttributeSet set) {
        this(context, set, 16842859);
    }
    
    public SearchView$SearchAutoComplete(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mThreshold = this.getThreshold();
    }
    
    static boolean access$1600(final SearchView$SearchAutoComplete searchView$SearchAutoComplete) {
        return searchView$SearchAutoComplete.isEmpty();
    }
    
    private boolean isEmpty() {
        return TextUtils.getTrimmedLength((CharSequence)this.getText()) == 0;
    }
    
    public boolean enoughToFilter() {
        return this.mThreshold <= 0 || super.enoughToFilter();
    }
    
    protected void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
        this.mSearchView.onTextFocusChanged();
    }
    
    public boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final KeyEvent$DispatcherState keyDispatcherState = this.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, (Object)this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                final KeyEvent$DispatcherState keyDispatcherState2 = this.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.mSearchView.clearFocus();
                    SearchView.access$2100(this.mSearchView, false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(n, keyEvent);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b && this.mSearchView.hasFocus() && this.getVisibility() == 0) {
            ((InputMethodManager)this.getContext().getSystemService(SearchView$SearchAutoComplete.z)).showSoftInput((View)this, 0);
            if (SearchView.isLandscapeMode(this.getContext())) {
                SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(this, true);
            }
        }
    }
    
    public void performCompletion() {
    }
    
    protected void replaceText(final CharSequence charSequence) {
    }
    
    void setSearchView(final SearchView mSearchView) {
        this.mSearchView = mSearchView;
    }
    
    public void setThreshold(final int n) {
        super.setThreshold(n);
        this.mThreshold = n;
    }
}
