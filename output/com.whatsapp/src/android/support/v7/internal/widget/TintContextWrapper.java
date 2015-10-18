// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.ContextWrapper;

public class TintContextWrapper extends ContextWrapper
{
    private Resources mResources;
    
    private TintContextWrapper(final Context context) {
        super(context);
    }
    
    public static Context wrap(Context context) {
        if (!(context instanceof TintContextWrapper)) {
            context = (Context)new TintContextWrapper(context);
        }
        return context;
    }
    
    public Resources getResources() {
        if (this.mResources == null) {
            this.mResources = new TintContextWrapper$TintResources(super.getResources(), TintManager.get((Context)this));
        }
        return this.mResources;
    }
}
