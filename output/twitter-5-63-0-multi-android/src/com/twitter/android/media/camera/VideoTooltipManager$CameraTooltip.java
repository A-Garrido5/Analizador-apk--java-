// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

public enum VideoTooltipManager$CameraTooltip
{
    a("TOO_SHORT", 0, 0), 
    b("SHOW_PUSH_TO_RECORD", 1, 1), 
    c("SHOW_ANOTHER_SEGMENT", 2, 2), 
    d("SHOW_FINISHED", 3, 4), 
    e("SHOW_PLAYBACK", 4, 8), 
    f("SHOW_SWITCH_TO_VIDEOS", 5, 16), 
    g("SHOW_IMPORT_GRIPPER", 6, 32);
    
    public final int tipValue;
    
    private VideoTooltipManager$CameraTooltip(final String s, final int n, final int tipValue) {
        this.tipValue = tipValue;
    }
}
