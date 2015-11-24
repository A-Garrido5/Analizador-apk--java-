import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import java.lang.ref.WeakReference;
import android.net.Uri;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.5.30
// 

public class gm
{
    public final Class a;
    public final Bundle b;
    public final Uri c;
    public final CharSequence d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;
    public final int i;
    public boolean j;
    public int k;
    public final boolean l;
    private String m;
    private WeakReference n;
    
    private gm(final Uri c, final Class a, final Bundle b, final CharSequence d, final int e, final boolean g, final String h, final int i, final boolean j, final boolean l) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = c.hashCode();
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.l = l;
    }
    
    public Fragment a(final FragmentManager fragmentManager) {
        final WeakReference n = this.n;
        Fragment fragmentByTag = null;
        if (n != null) {
            fragmentByTag = (Fragment)this.n.get();
            if (fragmentByTag == null) {
                fragmentByTag = fragmentManager.findFragmentByTag(this.m);
                if (fragmentByTag != null) {
                    this.n = new WeakReference(fragmentByTag);
                }
            }
        }
        return fragmentByTag;
    }
    
    public String a() {
        return this.m;
    }
    
    public void a(final Fragment fragment) {
        this.n = new WeakReference((T)fragment);
        this.m = fragment.getTag();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.c.equals((Object)((gm)o).c));
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
}
