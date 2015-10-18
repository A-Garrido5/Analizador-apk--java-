// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view;

import android.view.ActionMode$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window$Callback;

public class WindowCallbackWrapper implements Window$Callback
{
    public static int a;
    private static final String z;
    final Window$Callback mWrapped;
    
    static {
        final char[] charArray = "34&xM\u0013}+}N\b?)\u007fID0)e\u0002\n2<<@\u0001}&iN\b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\"';
                    break;
                }
                case 0: {
                    c2 = 'd';
                    break;
                }
                case 1: {
                    c2 = ']';
                    break;
                }
                case 2: {
                    c2 = 'H';
                    break;
                }
                case 3: {
                    c2 = '\u001c';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public WindowCallbackWrapper(final Window$Callback mWrapped) {
        if (mWrapped == null) {
            throw new IllegalArgumentException(WindowCallbackWrapper.z);
        }
        this.mWrapped = mWrapped;
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.mWrapped.dispatchGenericMotionEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.mWrapped.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.mWrapped.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.mWrapped.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.mWrapped.dispatchTouchEvent(motionEvent);
    }
    
    public boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.mWrapped.dispatchTrackballEvent(motionEvent);
    }
    
    public void onActionModeFinished(final ActionMode actionMode) {
        this.mWrapped.onActionModeFinished(actionMode);
    }
    
    public void onActionModeStarted(final ActionMode actionMode) {
        this.mWrapped.onActionModeStarted(actionMode);
    }
    
    public void onAttachedToWindow() {
        this.mWrapped.onAttachedToWindow();
    }
    
    public void onContentChanged() {
        this.mWrapped.onContentChanged();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return this.mWrapped.onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return this.mWrapped.onCreatePanelView(n);
    }
    
    public void onDetachedFromWindow() {
        this.mWrapped.onDetachedFromWindow();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.mWrapped.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.mWrapped.onMenuOpened(n, menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        this.mWrapped.onPanelClosed(n, menu);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return this.mWrapped.onPreparePanel(n, view, menu);
    }
    
    public boolean onSearchRequested() {
        return this.mWrapped.onSearchRequested();
    }
    
    public void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.mWrapped.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        this.mWrapped.onWindowFocusChanged(b);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.mWrapped.onWindowStartingActionMode(actionMode$Callback);
    }
}
