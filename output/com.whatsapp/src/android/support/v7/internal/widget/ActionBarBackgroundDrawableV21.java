// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.support.annotation.NonNull;
import android.graphics.Outline;

class ActionBarBackgroundDrawableV21 extends ActionBarBackgroundDrawable
{
    public ActionBarBackgroundDrawableV21(final ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }
    
    public void getOutline(@NonNull final Outline outline) {
        if (this.mContainer.mIsSplit) {
            if (this.mContainer.mSplitBackground == null) {
                return;
            }
            this.mContainer.mSplitBackground.getOutline(outline);
            if (AdapterViewCompat.a == 0) {
                return;
            }
        }
        if (this.mContainer.mBackground != null) {
            this.mContainer.mBackground.getOutline(outline);
        }
    }
}
