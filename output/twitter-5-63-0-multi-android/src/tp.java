import android.app.ActivityManager$TaskDescription;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import com.twitter.android.aq;

// 
// Decompiled by Procyon v0.5.30
// 

class tp extends aq
{
    final /* synthetic */ String a;
    final /* synthetic */ Bitmap b;
    final /* synthetic */ int c;
    final /* synthetic */ to d;
    
    tp(final to d, final String a, final Bitmap b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final Activity activity, final Bundle bundle) {
        activity.setTaskDescription(new ActivityManager$TaskDescription(this.a, this.b, this.c));
    }
}
