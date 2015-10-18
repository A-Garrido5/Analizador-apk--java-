// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.net.Uri;
import com.twitter.android.ka;

class z implements ka
{
    final /* synthetic */ y a;
    
    z(final y a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.a("profile_pic", "failure");
    }
    
    @Override
    public void a(final Uri uri) {
        this.a.e(String.valueOf(uri));
        this.a.a("profile_pic", "success");
    }
}
