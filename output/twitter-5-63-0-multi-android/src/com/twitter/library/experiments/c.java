// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.experiments;

import android.os.Build$VERSION;
import com.twitter.library.featureswitch.d;

public class c
{
    public static final String[] a;
    
    static {
        a = new String[] { "control", "control_a", "media", "media_copy", "media_copy_actions", "media_copy_priority", "media_copy_actions_priority" };
    }
    
    public static boolean a() {
        return d.a("android_magic_recs_redesign_v1_2709", c.a);
    }
    
    public static boolean b() {
        return d.a("android_magic_recs_redesign_v1_2709", "media", "media_copy", "media_copy_actions", "media_copy_priority", "media_copy_actions_priority");
    }
    
    public static boolean c() {
        return Build$VERSION.SDK_INT >= 16;
    }
    
    public static boolean d() {
        return d.a("android_magic_recs_redesign_v1_2709", "media_copy_priority", "media_copy_actions_priority");
    }
    
    public static boolean e() {
        return d.a("android_magic_recs_redesign_v1_2709", "media_copy_actions", "media_copy_actions_priority");
    }
}
