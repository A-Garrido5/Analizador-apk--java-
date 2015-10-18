import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.android.cw;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.autocomplete.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ck extends co
{
    public ck(final Context context, final a a) {
        super(context, a, 2130968730);
    }
    
    public int a(final Object o) {
        if (o instanceof TwitterUser) {
            return 0;
        }
        if (o instanceof cw) {
            return 1;
        }
        return 2;
    }
    
    public View a(final Object o, final ViewGroup viewGroup) {
        final int a = this.a(o);
        if (a == 2) {
            final View inflate = LayoutInflater.from(this.b).inflate(2130968731, (ViewGroup)null);
            inflate.setTag((Object)inflate.findViewById(2131886291));
            return inflate;
        }
        if (a == 1) {
            final View inflate2 = LayoutInflater.from(this.b).inflate(2130968719, (ViewGroup)null);
            inflate2.setTag((Object)new cl(inflate2));
            return inflate2;
        }
        return super.a(o, viewGroup);
    }
    
    public void a(final View view, final Object o) {
        final int a = this.a(o);
        if (a == 2) {
            ((TextView)view.getTag()).setText((CharSequence)("@" + o));
            return;
        }
        if (a == 1) {
            final cl cl = (cl)view.getTag();
            cl.a.a((cw)o, null);
            cl.b.setText((CharSequence)((cw)o).d);
            return;
        }
        super.a(view, o);
    }
    
    public int getItemViewType(final int n) {
        final Object item = this.getItem(n);
        if (item != null) {
            return this.a(item);
        }
        return -1;
    }
    
    public int getViewTypeCount() {
        return 3;
    }
}
