// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.support.v7.internal.view.SupportActionModeWrapper;
import android.support.v7.internal.view.SupportActionModeWrapper$CallbackWrapper;
import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.ViewGroup;
import android.view.LayoutInflater$Factory2;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.content.Context;
import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.annotation.TargetApi;
import android.support.v7.internal.widget.NativeActionModeAwareLayout$OnActionModeForChildListener;

@TargetApi(11)
class AppCompatDelegateImplV11 extends AppCompatDelegateImplV7 implements NativeActionModeAwareLayout$OnActionModeForChildListener
{
    private NativeActionModeAwareLayout mNativeActionModeAwareLayout;
    
    AppCompatDelegateImplV11(final Context context, final Window window, final AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
    }
    
    @Override
    View callActivityOnCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final View callActivityOnCreateView = super.callActivityOnCreateView(view, s, context, set);
        if (callActivityOnCreateView != null) {
            return callActivityOnCreateView;
        }
        if (this.mOriginalWindowCallback instanceof LayoutInflater$Factory2) {
            return ((LayoutInflater$Factory2)this.mOriginalWindowCallback).onCreateView(view, s, context, set);
        }
        return null;
    }
    
    @Override
    void onSubDecorInstalled(final ViewGroup viewGroup) {
        this.mNativeActionModeAwareLayout = (NativeActionModeAwareLayout)viewGroup.findViewById(16908290);
        if (this.mNativeActionModeAwareLayout != null) {
            this.mNativeActionModeAwareLayout.setActionModeForChildListener(this);
        }
    }
    
    @Override
    public ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback) {
        final android.support.v7.view.ActionMode startSupportActionMode = this.startSupportActionMode(new SupportActionModeWrapper$CallbackWrapper(view.getContext(), actionMode$Callback));
        if (startSupportActionMode != null) {
            return new SupportActionModeWrapper(this.mContext, startSupportActionMode);
        }
        return null;
    }
}
