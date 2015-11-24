import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class ll extends BaseAdapter
{
    private ln a;
    
    public ll() {
        this.a = ln.a;
    }
    
    protected abstract View a(final Object p0, final ViewGroup p1);
    
    public ln a(final ln a) {
        final ln a2 = this.a;
        if (!a2.equals(a)) {
            this.a = a;
            this.notifyDataSetChanged();
        }
        return a2;
    }
    
    protected abstract void a(final View p0, final Object p1);
    
    public ln c() {
        return this.a;
    }
    
    public int getCount() {
        return this.a.a();
    }
    
    public Object getItem(final int n) {
        return this.a.b(n);
    }
    
    public long getItemId(final int n) {
        return -1L;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final Object item = this.getItem(n);
        View a;
        if (item == null) {
            a = null;
        }
        else {
            if (view == null) {
                a = this.a(item, viewGroup);
            }
            else {
                a = view;
            }
            if (a != null) {
                this.a(a, item);
                return a;
            }
        }
        return a;
    }
}
