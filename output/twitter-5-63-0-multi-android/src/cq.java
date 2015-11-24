import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.api.TwitterLocation;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class cq extends cp
{
    private final Context a;
    
    public cq(final Context a) {
        this.a = a;
    }
    
    public View a(final TwitterLocation twitterLocation, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(this.a).inflate(2130969109, viewGroup, false);
        inflate.setTag((Object)new cr(inflate));
        return inflate;
    }
    
    public void a(final View view, final TwitterLocation twitterLocation) {
        ((cr)view.getTag()).a.setText((CharSequence)twitterLocation.a());
    }
    
    @Override
    public long getItemId(final int n) {
        final TwitterLocation twitterLocation = (TwitterLocation)this.getItem(n);
        if (twitterLocation != null) {
            return twitterLocation.d();
        }
        return -1L;
    }
}
