import android.database.Cursor;
import com.twitter.library.api.Prompt;

// 
// Decompiled by Procyon v0.5.30
// 

public class hc extends hh
{
    public final Prompt a;
    
    public hc(final long n, final long n2, final Cursor cursor) {
        super(n, n2);
        this.a = new Prompt(cursor);
    }
}
