// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.view;

import android.view.MenuInflater;
import android.view.Menu;
import android.view.View;

public abstract class ActionMode
{
    public static int a;
    private Object mTag;
    private boolean mTitleOptionalHint;
    
    public abstract void finish();
    
    public abstract View getCustomView();
    
    public abstract Menu getMenu();
    
    public abstract MenuInflater getMenuInflater();
    
    public abstract CharSequence getSubtitle();
    
    public Object getTag() {
        return this.mTag;
    }
    
    public abstract CharSequence getTitle();
    
    public boolean getTitleOptionalHint() {
        return this.mTitleOptionalHint;
    }
    
    public abstract void invalidate();
    
    public boolean isTitleOptional() {
        return false;
    }
    
    public abstract void setCustomView(final View p0);
    
    public abstract void setSubtitle(final int p0);
    
    public abstract void setSubtitle(final CharSequence p0);
    
    public void setTag(final Object mTag) {
        this.mTag = mTag;
    }
    
    public abstract void setTitle(final int p0);
    
    public abstract void setTitle(final CharSequence p0);
    
    public void setTitleOptionalHint(final boolean mTitleOptionalHint) {
        this.mTitleOptionalHint = mTitleOptionalHint;
    }
}
