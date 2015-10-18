import com.twitter.library.av.a;
import java.util.ArrayList;
import java.util.LinkedList;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public final class me
{
    final List a;
    final Context b;
    final Session c;
    
    public me(final Context b, final Session c) {
        this.a = new LinkedList();
        this.b = b;
        this.c = c;
    }
    
    public List a() {
        int n = 10;
        final ArrayList<md> list = new ArrayList<md>();
        final int size = this.a.size();
        if (size <= n) {
            n = size;
        }
        final int n2 = n;
        int n5;
        for (int i = 0, n3 = n2; i < size; i = n3, n3 = n5) {
            final md md = new md(this.b, this.c);
            md.a(this.a.subList(i, n3));
            list.add(md);
            int n4 = n3 + 10;
            if (size <= n4) {
                n4 = size;
            }
            n5 = n4;
        }
        return list;
    }
    
    public me a(final a a) {
        this.a.add(a);
        return this;
    }
}
