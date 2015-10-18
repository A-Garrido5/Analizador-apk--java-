import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ct extends cp
{
    protected final Context a;
    private final int b;
    
    public ct(final Context context) {
        this(context, 2130969176);
    }
    
    public ct(final Context a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public View a(final Cursor cursor, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(this.a).inflate(this.b, (ViewGroup)null);
        final cs tag = new cs(inflate);
        tag.a.setDefaultDrawable(this.a.getResources().getDrawable(2130837564));
        inflate.setTag((Object)tag);
        return inflate;
    }
    
    public void a(final View view, final Cursor cursor) {
        final cs cs = (cs)view.getTag();
        cs.a.a(cursor.getString(4));
        cs.b.setText((CharSequence)cursor.getString(3));
        if ((0x2 & cursor.getInt(5)) != 0x0) {
            cs.c.setVisibility(0);
        }
        else {
            cs.c.setVisibility(8);
        }
        cs.d.setText((CharSequence)("@" + cursor.getString(2)));
    }
    
    @Override
    public long getItemId(final int n) {
        final Cursor cursor = (Cursor)this.getItem(n);
        if (cursor != null) {
            return cursor.getLong(1);
        }
        return -1L;
    }
}
