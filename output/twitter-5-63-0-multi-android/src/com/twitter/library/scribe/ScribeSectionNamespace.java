// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ScribeSectionNamespace extends ScribeSection
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new i();
        a = new String[] { "client", "page", "section", "component", "element", "action" };
    }
    
    public ScribeSectionNamespace(final Parcel parcel) {
        super(parcel);
    }
    
    public ScribeSectionNamespace(final String s) {
        int i = 0;
        super(null, 6);
        final String[] split = s.split(":", 6);
        if (split.length == 5) {
            this.a(0, "android");
            while (i < 5) {
                this.a(i + 1, split[i]);
                ++i;
            }
        }
    }
    
    @Override
    protected String a(final int n) {
        return ScribeSectionNamespace.a[n];
    }
}
