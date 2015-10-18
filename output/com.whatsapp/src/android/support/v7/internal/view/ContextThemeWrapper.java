// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view;

import android.support.v7.appcompat.R$style;
import android.content.Context;
import android.content.res.Resources$Theme;
import android.view.LayoutInflater;
import android.content.ContextWrapper;

public class ContextThemeWrapper extends ContextWrapper
{
    private static final String z;
    private LayoutInflater mInflater;
    private Resources$Theme mTheme;
    private int mThemeResource;
    
    static {
        final char[] charArray = "\u0018>\u0013>M\u0000\u0000\u0003?^\u0018>\u001e4J".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '8';
                    break;
                }
                case 0: {
                    c2 = 't';
                    break;
                }
                case 1: {
                    c2 = '_';
                    break;
                }
                case 2: {
                    c2 = 'j';
                    break;
                }
                case 3: {
                    c2 = 'Q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ContextThemeWrapper(final Context context, final int mThemeResource) {
        super(context);
        this.mThemeResource = mThemeResource;
    }
    
    private void initializeTheme() {
        final boolean b = this.mTheme == null;
        if (b) {
            this.mTheme = this.getResources().newTheme();
            final Resources$Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.mTheme.setTo(theme);
            }
        }
        this.onApplyThemeResource(this.mTheme, this.mThemeResource, b);
    }
    
    public Object getSystemService(final String s) {
        if (ContextThemeWrapper.z.equals(s)) {
            if (this.mInflater == null) {
                this.mInflater = LayoutInflater.from(this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.mInflater;
        }
        return this.getBaseContext().getSystemService(s);
    }
    
    public Resources$Theme getTheme() {
        if (this.mTheme != null) {
            return this.mTheme;
        }
        if (this.mThemeResource == 0) {
            this.mThemeResource = R$style.Theme_AppCompat_Light;
        }
        this.initializeTheme();
        return this.mTheme;
    }
    
    public int getThemeResId() {
        return this.mThemeResource;
    }
    
    protected void onApplyThemeResource(final Resources$Theme resources$Theme, final int n, final boolean b) {
        resources$Theme.applyStyle(n, true);
    }
    
    public void setTheme(final int mThemeResource) {
        this.mThemeResource = mThemeResource;
        this.initializeTheme();
    }
}
