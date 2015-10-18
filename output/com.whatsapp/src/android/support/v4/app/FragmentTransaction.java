// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.support.annotation.Nullable;

public abstract class FragmentTransaction
{
    public abstract FragmentTransaction add(final int p0, final Fragment p1);
    
    public abstract FragmentTransaction add(final int p0, final Fragment p1, @Nullable final String p2);
    
    public abstract FragmentTransaction add(final Fragment p0, final String p1);
    
    public abstract FragmentTransaction attach(final Fragment p0);
    
    public abstract int commit();
    
    public abstract int commitAllowingStateLoss();
    
    public abstract FragmentTransaction detach(final Fragment p0);
    
    public abstract FragmentTransaction remove(final Fragment p0);
}
