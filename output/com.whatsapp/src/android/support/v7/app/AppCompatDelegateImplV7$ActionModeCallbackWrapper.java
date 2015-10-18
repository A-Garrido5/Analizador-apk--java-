// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode$Callback;

class AppCompatDelegateImplV7$ActionModeCallbackWrapper implements ActionMode$Callback
{
    private ActionMode$Callback mWrapped;
    final AppCompatDelegateImplV7 this$0;
    
    public AppCompatDelegateImplV7$ActionModeCallbackWrapper(final AppCompatDelegateImplV7 this$0, final ActionMode$Callback mWrapped) {
        this.this$0 = this$0;
        this.mWrapped = mWrapped;
    }
    
    @Override
    public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        return this.mWrapped.onActionItemClicked(actionMode, menuItem);
    }
    
    @Override
    public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        return this.mWrapped.onCreateActionMode(actionMode, menu);
    }
    
    @Override
    public void onDestroyActionMode(final ActionMode actionMode) {
        this.mWrapped.onDestroyActionMode(actionMode);
        Label_0108: {
            if (this.this$0.mActionModePopup != null) {
                this.this$0.mWindow.getDecorView().removeCallbacks(this.this$0.mShowActionModePopup);
                this.this$0.mActionModePopup.dismiss();
                if (!ActionBar.a) {
                    break Label_0108;
                }
            }
            if (this.this$0.mActionModeView != null) {
                this.this$0.mActionModeView.setVisibility(8);
                if (this.this$0.mActionModeView.getParent() != null) {
                    ViewCompat.requestApplyInsets((View)this.this$0.mActionModeView.getParent());
                }
            }
        }
        if (this.this$0.mActionModeView != null) {
            this.this$0.mActionModeView.removeAllViews();
        }
        if (this.this$0.mAppCompatCallback != null) {
            this.this$0.mAppCompatCallback.onSupportActionModeFinished(this.this$0.mActionMode);
        }
        this.this$0.mActionMode = null;
    }
    
    @Override
    public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        return this.mWrapped.onPrepareActionMode(actionMode, menu);
    }
}
