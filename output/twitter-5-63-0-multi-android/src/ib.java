import android.util.Log;

// 
// Decompiled by Procyon v0.5.30
// 

public class ib implements it
{
    @Override
    public void a(final ih ih) {
        final String v = ih.v();
        final String substring = v.substring(0, Math.min(v.length(), 23));
        if (Log.isLoggable(substring, 3)) {
            Log.d(substring, "Recorded metric: " + ih);
        }
    }
    
    @Override
    public int hashCode() {
        return ib.class.getName().hashCode();
    }
}
