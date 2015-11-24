// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode$Callback;
import android.view.View;
import android.support.annotation.Nullable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.content.res.Configuration;
import android.content.Context;

public abstract class ActionBar
{
    public static boolean a;
    private static final String z;
    
    static {
        final char[] charArray = "PI!@\u001emKuUWmC;\u0019\rf^:\u0014\u0012oI#U\u0003jC;\u0014\u001ep\f;[\u0003#_ D\u0007l^!Q\u0013#E;\u0014\u0003kE&\u0014\u0016`X<[\u0019#N4FW`C;R\u001edY'U\u0003jC;\u001a".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'w';
                    break;
                }
                case 0: {
                    c2 = '\u0003';
                    break;
                }
                case 1: {
                    c2 = ',';
                    break;
                }
                case 2: {
                    c2 = 'U';
                    break;
                }
                case 3: {
                    c2 = '4';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public boolean collapseActionView() {
        return false;
    }
    
    public void dispatchMenuVisibilityChanged(final boolean b) {
    }
    
    public abstract int getDisplayOptions();
    
    public Context getThemedContext() {
        return null;
    }
    
    public abstract void hide();
    
    public boolean invalidateOptionsMenu() {
        return false;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
    }
    
    public boolean onKeyShortcut(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    public abstract void setBackgroundDrawable(@Nullable final Drawable p0);
    
    public abstract void setCustomView(final View p0);
    
    public abstract void setCustomView(final View p0, final ActionBar$LayoutParams p1);
    
    public void setDefaultDisplayHomeAsUpEnabled(final boolean b) {
    }
    
    public abstract void setDisplayHomeAsUpEnabled(final boolean p0);
    
    public abstract void setDisplayShowCustomEnabled(final boolean p0);
    
    public abstract void setDisplayShowHomeEnabled(final boolean p0);
    
    public abstract void setDisplayShowTitleEnabled(final boolean p0);
    
    public void setElevation(final float n) {
        if (n != 0.0f) {
            try {
                throw new UnsupportedOperationException(ActionBar.z);
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
        }
    }
    
    public void setHomeAsUpIndicator(@Nullable final Drawable drawable) {
    }
    
    public abstract void setIcon(final Drawable p0);
    
    public void setShowHideAnimationEnabled(final boolean b) {
    }
    
    public abstract void setSubtitle(final CharSequence p0);
    
    public abstract void setTitle(final int p0);
    
    public abstract void setTitle(final CharSequence p0);
    
    public void setWindowTitle(final CharSequence charSequence) {
    }
    
    public abstract void show();
    
    public ActionMode startActionMode(final ActionMode$Callback actionMode$Callback) {
        return null;
    }
}
