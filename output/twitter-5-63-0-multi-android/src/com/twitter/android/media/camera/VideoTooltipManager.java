// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.content.res.Resources;
import android.preference.PreferenceManager;
import com.twitter.ui.widget.Tooltip;
import android.support.v4.app.FragmentManager;
import android.content.SharedPreferences;
import android.content.Context;
import com.twitter.ui.widget.y;

public class VideoTooltipManager implements y
{
    private final Context a;
    private final SharedPreferences b;
    private final FragmentManager c;
    private boolean d;
    private int e;
    private Tooltip f;
    
    public VideoTooltipManager(final Context a, final FragmentManager c) {
        this.a = a;
        this.c = c;
        this.e = 0;
        this.b = PreferenceManager.getDefaultSharedPreferences(a);
    }
    
    public static boolean a(final Context context) {
        return (PreferenceManager.getDefaultSharedPreferences(context).getInt("video_recorder_education_tips", VideoTooltipManager$CameraTooltip.a.tipValue) & VideoTooltipManager$CameraTooltip.f.tipValue) != 0x0;
    }
    
    private void b(final int n) {
        if (this.e != 2131886352) {
            Tooltip.a(this.a, 2131886352).d(2131886333).b(2131493440).a(n).c(0).a(this).a(this.c, "shutter_tag");
        }
    }
    
    private void c(final int n) {
        if (this.e != 2131886973) {
            Tooltip.a(this.a, 2131886973).d(2131886333).b(2131493442).a(n).c(0).a(this).a(this.c, "segment_tag");
        }
    }
    
    private void d(final int n) {
        if (this.e != 2131886249) {
            Tooltip.a(this.a, 2131886249).d(2131886333).b(2131493440).a(n).c(1).a(this).a(this.c, "done_tag");
        }
    }
    
    private void e(final int n) {
        if (this.e != 2131886349) {
            Tooltip.a(this.a, 2131886349).d(2131886333).b(2131493443).a(n).c(0).a(this).a(this.c, "switch_mode_tag");
        }
    }
    
    private void f(final int n) {
        if (this.e != 2131886770) {
            Tooltip.a(this.a, 2131886770).d(2131886240).b(2131493443).a(n).c(0).a(this).a(this.c, "import_gripper_tag");
        }
    }
    
    public void a() {
        if (this.f != null) {
            this.f.a(true);
        }
    }
    
    public void a(final int n) {
        final Resources resources = this.a.getResources();
        int n2;
        if (n > 1) {
            n2 = 2131298110;
        }
        else {
            n2 = 2131298109;
        }
        final String string = resources.getString(n2, new Object[] { Math.max(1, n) });
        this.f = Tooltip.a(this.a, 2131886770).d(2131886240).b(2131493441).a(string).c(0).a(this).a(this.c, "import_gripper_duration_tag", false).a(string);
    }
    
    public void a(final VideoTooltipManager$CameraTooltip videoTooltipManager$CameraTooltip) {
        final int tipValue = videoTooltipManager$CameraTooltip.tipValue;
        final int int1 = this.b.getInt("video_recorder_education_tips", VideoTooltipManager$CameraTooltip.a.tipValue);
        if (!this.d && (int1 & tipValue) == 0x0) {
            switch (bc.a[videoTooltipManager$CameraTooltip.ordinal()]) {
                default: {
                    this.b(2131296441);
                    break;
                }
                case 1: {
                    this.b(2131296438);
                    break;
                }
                case 2: {
                    this.c(2131296440);
                    break;
                }
                case 3: {
                    this.b(2131296437);
                    break;
                }
                case 4: {
                    this.d(2131298113);
                    break;
                }
                case 5: {
                    this.e(2131296443);
                    break;
                }
                case 6: {
                    this.f(2131298111);
                    break;
                }
            }
            this.d = true;
            if (tipValue != 0) {
                this.b.edit().putInt("video_recorder_education_tips", tipValue | int1).apply();
            }
        }
    }
    
    @Override
    public void a(final Tooltip tooltip, final int n) {
        switch (n) {
            default: {}
            case 1: {
                tooltip.a(true);
            }
            case 2: {
                this.d = false;
            }
        }
    }
}
