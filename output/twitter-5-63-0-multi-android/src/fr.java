import com.twitter.config.a;
import com.twitter.config.AppFlavor;
import com.twitter.library.util.an;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class fr extends ts
{
    protected void a(final Context context, final Void void1) {
        final int smallestScreenWidthDp = Resources.getSystem().getConfiguration().smallestScreenWidthDp;
        AppFlavor appFlavor;
        if (smallestScreenWidthDp >= 600 || (an.d() && smallestScreenWidthDp >= 530)) {
            appFlavor = AppFlavor.b;
        }
        else {
            appFlavor = AppFlavor.a;
        }
        a.a(new fs(this, appFlavor));
    }
}
