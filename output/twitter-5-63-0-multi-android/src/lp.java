import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public final class lp
{
    public static ln a(final Cursor cursor, final lv lv, int i, final int n) {
        final lr lr = new lr();
        while (i < n) {
            cursor.moveToPosition(i);
            lr.a(lv.b(cursor));
            ++i;
        }
        return lr.a();
    }
}
