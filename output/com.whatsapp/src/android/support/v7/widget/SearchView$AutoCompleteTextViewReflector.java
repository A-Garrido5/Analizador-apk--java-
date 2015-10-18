// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.View;
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

class SearchView$AutoCompleteTextViewReflector
{
    private static final String[] z;
    private Method doAfterTextChanged;
    private Method doBeforeTextChanged;
    private Method ensureImeVisible;
    private Method showSoftInputUnchecked;
    
    static {
        final String[] z2 = new String[4];
        String s = "!\u007fO\u0010\u0004=qT.9\"bT291\u007fE\u0004<7s";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = 'R';
                        break;
                    }
                    case 1: {
                        c2 = '\u0017';
                        break;
                    }
                    case 2: {
                        c2 = ' ';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "6xb\u00021=eE32*cc\u000f6<pE\u0003";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "7yS\u0012%7^M\u0002\u0001;dI\u0005;7";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "6xa\u0001#7et\u0002/&TH\u000695rD";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    SearchView$AutoCompleteTextViewReflector() {
        while (true) {
            try {
                (this.doBeforeTextChanged = AutoCompleteTextView.class.getDeclaredMethod(SearchView$AutoCompleteTextViewReflector.z[1], (Class<?>[])new Class[0])).setAccessible(true);
                try {
                    (this.doAfterTextChanged = AutoCompleteTextView.class.getDeclaredMethod(SearchView$AutoCompleteTextViewReflector.z[3], (Class<?>[])new Class[0])).setAccessible(true);
                    try {
                        (this.ensureImeVisible = AutoCompleteTextView.class.getMethod(SearchView$AutoCompleteTextViewReflector.z[2], Boolean.TYPE)).setAccessible(true);
                        try {
                            (this.showSoftInputUnchecked = InputMethodManager.class.getMethod(SearchView$AutoCompleteTextViewReflector.z[0], Integer.TYPE, ResultReceiver.class)).setAccessible(true);
                        }
                        catch (NoSuchMethodException ex) {}
                    }
                    catch (NoSuchMethodException ex2) {}
                }
                catch (NoSuchMethodException ex3) {}
            }
            catch (NoSuchMethodException ex4) {
                continue;
            }
            break;
        }
    }
    
    void doAfterTextChanged(final AutoCompleteTextView autoCompleteTextView) {
        if (this.doAfterTextChanged == null) {
            return;
        }
        try {
            this.doAfterTextChanged.invoke(autoCompleteTextView, new Object[0]);
        }
        catch (Exception ex) {}
    }
    
    void doBeforeTextChanged(final AutoCompleteTextView autoCompleteTextView) {
        if (this.doBeforeTextChanged == null) {
            return;
        }
        try {
            this.doBeforeTextChanged.invoke(autoCompleteTextView, new Object[0]);
        }
        catch (Exception ex) {}
    }
    
    void ensureImeVisible(final AutoCompleteTextView autoCompleteTextView, final boolean b) {
        if (this.ensureImeVisible == null) {
            return;
        }
        try {
            this.ensureImeVisible.invoke(autoCompleteTextView, b);
        }
        catch (Exception ex) {}
    }
    
    void showSoftInputUnchecked(final InputMethodManager inputMethodManager, final View view, final int n) {
        if (this.showSoftInputUnchecked != null) {
            try {
                this.showSoftInputUnchecked.invoke(inputMethodManager, n, null);
                return;
            }
            catch (Exception ex) {}
        }
        inputMethodManager.showSoftInput(view, n);
    }
}
