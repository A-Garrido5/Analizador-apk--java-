import java.util.Iterator;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public class ul implements Iterable
{
    private final List a;
    
    public ul() {
        this.a = new ArrayList();
    }
    
    public ul a(final String s, final String s2) {
        this.a.add(Pair.create((Object)s, (Object)s2));
        return this;
    }
    
    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }
}
