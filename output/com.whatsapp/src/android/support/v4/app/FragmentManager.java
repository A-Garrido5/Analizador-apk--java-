// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.List;
import android.os.Bundle;

public abstract class FragmentManager
{
    public abstract FragmentTransaction beginTransaction();
    
    public abstract boolean executePendingTransactions();
    
    public abstract Fragment findFragmentByTag(final String p0);
    
    public abstract Fragment getFragment(final Bundle p0, final String p1);
    
    public abstract List getFragments();
    
    public abstract void popBackStack(final int p0, final int p1);
    
    public abstract void putFragment(final Bundle p0, final String p1, final Fragment p2);
    
    public abstract Fragment$SavedState saveFragmentInstanceState(final Fragment p0);
}
