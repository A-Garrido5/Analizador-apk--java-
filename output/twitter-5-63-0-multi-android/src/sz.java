import android.widget.ImageView;
import com.twitter.library.platform.f;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class sz
{
    public static sx a(final Context context, final ViewGroup viewGroup) {
        if (f.b(context)) {
            return new ta(viewGroup, ta.a(context), new ImageView(context));
        }
        return new sw(viewGroup);
    }
}
