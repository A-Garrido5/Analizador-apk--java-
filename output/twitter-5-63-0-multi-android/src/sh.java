import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class sh extends SQLiteOpenHelper
{
    public static final yv a;
    
    static {
        a = new yv("TestDatabases");
    }
    
    public sh(final Context context, final String s, final SQLiteDatabase$CursorFactory sqLiteDatabase$CursorFactory, final int n) {
        super(context, s, sqLiteDatabase$CursorFactory, n);
        sh.a.a();
    }
}
