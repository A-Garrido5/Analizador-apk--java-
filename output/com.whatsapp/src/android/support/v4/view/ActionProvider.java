// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.util.Log;
import android.view.SubMenu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;

public abstract class ActionProvider
{
    private static final String[] z;
    private final Context mContext;
    private ActionProvider$SubUiVisibilityListener mSubUiVisibilityListener;
    private ActionProvider$VisibilityListener mVisibilityListener;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0016VP(=WQ]>iAWW7,\u0016VJ{ E\u001fM/ ZS\u001e2'\u0016JM>iEPS>>^ZL>iSSM>v";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'I';
                        break;
                    }
                    case 0: {
                        c2 = '6';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = '[';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "w\\J2&XoL4?_[[)aEJN+&DK\u0017";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "EZJ\r EV\\2%_KG\u0017 EK[5,D\u0005\u001e\b,BKW5.\u0016^\u001e5,A\u001f\u007f8=_PP\u000b;YIW?,D\u0011h2:_]W7 BFr2:BZP>;\u0016HV>'\u0016PP>i_L\u001e:%DZ_?0\u0016L[/g\u0016~L>iOPK{;SJM2'Q\u001fJ3 E\u001f";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ActionProvider(final Context mContext) {
        this.mContext = mContext;
    }
    
    public boolean hasSubMenu() {
        return false;
    }
    
    public boolean isVisible() {
        return true;
    }
    
    public abstract View onCreateActionView();
    
    public View onCreateActionView(final MenuItem menuItem) {
        return this.onCreateActionView();
    }
    
    public boolean onPerformDefaultAction() {
        return false;
    }
    
    public void onPrepareSubMenu(final SubMenu subMenu) {
    }
    
    public boolean overridesItemVisibility() {
        return false;
    }
    
    public void setSubUiVisibilityListener(final ActionProvider$SubUiVisibilityListener mSubUiVisibilityListener) {
        this.mSubUiVisibilityListener = mSubUiVisibilityListener;
    }
    
    public void setVisibilityListener(final ActionProvider$VisibilityListener mVisibilityListener) {
        if (this.mVisibilityListener != null && mVisibilityListener != null) {
            Log.w(ActionProvider.z[1], ActionProvider.z[2] + this.getClass().getSimpleName() + ActionProvider.z[0]);
        }
        this.mVisibilityListener = mVisibilityListener;
    }
    
    public void subUiVisibilityChanged(final boolean b) {
        if (this.mSubUiVisibilityListener != null) {
            this.mSubUiVisibilityListener.onSubUiVisibilityChanged(b);
        }
    }
}
