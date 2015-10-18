import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class cj extends cp
{
    private final ct a;
    private final cm b;
    
    public cj(final Context context) {
        this.a = new ct(context, 2130969171);
        this.b = new cm(context);
    }
    
    public static String a(final int n, final Cursor cursor) {
        if (n == 1) {
            return "@" + cursor.getString(2);
        }
        if (n == 2) {
            return cursor.getString(1);
        }
        return "";
    }
    
    public int a() {
        final dt dt = (dt)this.b();
        if (dt != null) {
            return dt.b;
        }
        return 0;
    }
    
    public View a(final Cursor cursor, final ViewGroup viewGroup) {
        switch (this.a()) {
            default: {
                return null;
            }
            case 1: {
                return this.a.a(cursor, viewGroup);
            }
            case 2: {
                return this.b.a(cursor, viewGroup);
            }
        }
    }
    
    public void a(final View view, final Cursor cursor) {
        switch (this.a()) {
            default: {}
            case 1: {
                this.a.a(view, cursor);
            }
            case 2: {
                this.b.a(view, cursor);
            }
        }
    }
    
    @Override
    public long getItemId(final int n) {
        switch (this.a()) {
            default: {
                return -1L;
            }
            case 1: {
                return this.a.getItemId(n);
            }
            case 2: {
                return this.b.getItemId(n);
            }
        }
    }
    
    public int getItemViewType(final int n) {
        switch (this.a()) {
            default: {
                return -1;
            }
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
        }
    }
    
    public int getViewTypeCount() {
        return 2;
    }
}
