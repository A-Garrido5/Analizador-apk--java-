import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class cm extends cp
{
    private final Context a;
    private final int b;
    
    public cm(final Context context) {
        this(context, 2130968811);
    }
    
    public cm(final Context a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public View a(final Cursor cursor, final ViewGroup viewGroup) {
        return LayoutInflater.from(this.a).inflate(this.b, viewGroup, false);
    }
    
    public void a(final View view, final Cursor cursor) {
        ((TextView)view).setText((CharSequence)cursor.getString(1));
    }
    
    @Override
    public long getItemId(final int n) {
        final Cursor cursor = (Cursor)this.getItem(n);
        if (cursor != null) {
            return cursor.getLong(0);
        }
        return -1L;
    }
}
