// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.avatars;

import com.twitter.library.featureswitch.d;

public class b
{
    public static boolean a() {
        return d.f("avatar_chooser_enabled") && c() && d.a("ip_android_avatar_picker_v1_3233", new String[] { "avatar_picker" });
    }
    
    public static boolean b() {
        return d.f("avatar_chooser_enabled") && c() && "avatar_picker".equals(d.d("ip_android_avatar_picker_v1_3233"));
    }
    
    public static boolean c() {
        return d.f("avatar_profile_design_enabled");
    }
}
