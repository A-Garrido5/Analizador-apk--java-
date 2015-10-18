import com.twitter.library.api.z;
import android.database.Cursor;
import android.view.View;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.30
// 

public class cn extends ct
{
    private Set b;
    
    public cn(final Context context) {
        super(context, 2130968877);
    }
    
    @Override
    public void a(final View view, final Cursor cursor) {
        super.a(view, cursor);
        final cs cs = (cs)view.getTag();
        view.setBackgroundResource(2130837552);
        if (!z.m(cursor.getInt(6))) {
            view.setEnabled(false);
            view.setAlpha(0.3f);
            cs.e.setVisibility(0);
            cs.f.setVisibility(8);
            return;
        }
        view.setEnabled(true);
        view.setAlpha(1.0f);
        cs.e.setVisibility(8);
        final long long1 = cursor.getLong(1);
        if (this.b != null && this.b.contains(long1)) {
            view.setBackgroundColor(this.a.getResources().getColor(2131689564));
            cs.f.setVisibility(0);
            return;
        }
        cs.f.setVisibility(8);
    }
    
    public void a(final Set b) {
        this.b = b;
        this.notifyDataSetChanged();
    }
}
