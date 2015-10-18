import android.view.LayoutInflater;
import com.twitter.library.api.TwitterUser;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import com.twitter.android.autocomplete.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class co extends cp
{
    protected final a a;
    protected final Context b;
    private final int c;
    
    public co(final Context b, final a a, final int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    private void a(final View view, final boolean b) {
        if (view != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            view.setVisibility(visibility);
        }
    }
    
    @Override
    protected View a(final Object o, final ViewGroup viewGroup) {
        final boolean b = o instanceof TwitterUser;
        View inflate = null;
        if (b) {
            inflate = LayoutInflater.from(this.b).inflate(this.c, (ViewGroup)null);
            final cs tag = new cs(inflate);
            tag.a.setDefaultDrawable(this.b.getResources().getDrawable(2130837564));
            inflate.setTag((Object)tag);
        }
        return inflate;
    }
    
    @Override
    protected void a(final View view, final Object o) {
        final boolean b = o instanceof TwitterUser;
        Object f = null;
        if (b) {
            final TwitterUser twitterUser = (TwitterUser)o;
            final cs cs = (cs)view.getTag();
            cs.a.a(twitterUser.profileImageUrl);
            cs.b.setText((CharSequence)twitterUser.name);
            if (twitterUser.verified) {
                cs.c.setVisibility(0);
            }
            else {
                cs.c.setVisibility(8);
            }
            cs.d.setText((CharSequence)("@" + twitterUser.username));
            f = cs.f;
        }
        final long b2 = this.b(o);
        float alpha;
        if (this.a.b(b2)) {
            alpha = 1.0f;
        }
        else {
            alpha = 0.5f;
        }
        view.setAlpha(alpha);
        this.a((View)f, this.a.b_(b2));
    }
    
    public long b(final Object o) {
        if (o instanceof TwitterUser) {
            return ((TwitterUser)o).userId;
        }
        return -1L;
    }
    
    @Override
    public long getItemId(final int n) {
        return this.b(this.getItem(n));
    }
    
    public boolean isEnabled(final int n) {
        return this.a.b(this.getItemId(n));
    }
}
