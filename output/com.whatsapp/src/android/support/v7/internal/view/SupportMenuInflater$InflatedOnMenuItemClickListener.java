// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;

class SupportMenuInflater$InflatedOnMenuItemClickListener implements MenuItem$OnMenuItemClickListener
{
    private static final Class[] PARAM_TYPES;
    private static final String[] z;
    private Method mMethod;
    private Object mRealOwner;
    
    static {
        final String[] z2 = new String[2];
        String s = "IRAo\fd\u001a@#\u001aoN[o\u001eo\u001dYf\u0006\u007f\u001d]w\rg\u001d[m+fTWhHb\\Zg\u0004oO\u0014";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'h';
                        break;
                    }
                    case 0: {
                        c2 = '\n';
                        break;
                    }
                    case 1: {
                        c2 = '=';
                        break;
                    }
                    case 2: {
                        c2 = '4';
                        break;
                    }
                    case 3: {
                        c2 = '\u0003';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "*TZ#\u000bf\\GpH";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        PARAM_TYPES = new Class[] { MenuItem.class };
    }
    
    public SupportMenuInflater$InflatedOnMenuItemClickListener(final Object mRealOwner, final String s) {
        this.mRealOwner = mRealOwner;
        final Class<?> class1 = mRealOwner.getClass();
        try {
            this.mMethod = class1.getMethod(s, (Class<?>[])SupportMenuInflater$InflatedOnMenuItemClickListener.PARAM_TYPES);
        }
        catch (Exception ex2) {
            final InflateException ex = new InflateException(SupportMenuInflater$InflatedOnMenuItemClickListener.z[0] + s + SupportMenuInflater$InflatedOnMenuItemClickListener.z[1] + class1.getName());
            ex.initCause((Throwable)ex2);
            throw ex;
        }
    }
    
    public boolean onMenuItemClick(final MenuItem menuItem) {
        try {
            if (this.mMethod.getReturnType() == Boolean.TYPE) {
                return (boolean)this.mMethod.invoke(this.mRealOwner, menuItem);
            }
            this.mMethod.invoke(this.mRealOwner, menuItem);
            return true;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
