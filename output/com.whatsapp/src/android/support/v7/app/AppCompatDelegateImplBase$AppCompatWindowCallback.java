// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.view.View;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.KeyEvent;
import android.app.Dialog;
import android.app.Activity;
import android.os.Build$VERSION;
import android.view.Window$Callback;
import android.support.v7.internal.view.WindowCallbackWrapper;

class AppCompatDelegateImplBase$AppCompatWindowCallback extends WindowCallbackWrapper
{
    final AppCompatDelegateImplBase this$0;
    
    AppCompatDelegateImplBase$AppCompatWindowCallback(final AppCompatDelegateImplBase this$0, final Window$Callback window$Callback) {
        this.this$0 = this$0;
        super(window$Callback);
    }
    
    private boolean bypassPrepareOptionsPanelIfNeeded() {
        return (Build$VERSION.SDK_INT < 16 && this.this$0.mOriginalWindowCallback instanceof Activity) || this.this$0.mOriginalWindowCallback instanceof Dialog;
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.this$0.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }
    
    @Override
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.this$0.onKeyShortcut(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    @Override
    public void onContentChanged() {
    }
    
    @Override
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return (n != 0 || menu instanceof MenuBuilder) && super.onCreatePanelMenu(n, menu);
    }
    
    @Override
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.this$0.onMenuOpened(n, menu) || super.onMenuOpened(n, menu);
    }
    
    @Override
    public void onPanelClosed(final int n, final Menu menu) {
        if (this.this$0.onPanelClosed(n, menu)) {
            return;
        }
        super.onPanelClosed(n, menu);
    }
    
    @Override
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        if (n != 0 || menu instanceof MenuBuilder) {
            if (n != 0 || !this.bypassPrepareOptionsPanelIfNeeded()) {
                return super.onPreparePanel(n, view, menu);
            }
            if (this.this$0.mOriginalWindowCallback instanceof Activity) {
                return ((Activity)this.this$0.mOriginalWindowCallback).onPrepareOptionsMenu(menu);
            }
            if (this.this$0.mOriginalWindowCallback instanceof Dialog) {
                return ((Dialog)this.this$0.mOriginalWindowCallback).onPrepareOptionsMenu(menu);
            }
        }
        return false;
    }
}
