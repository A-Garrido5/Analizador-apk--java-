import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

class di implements dg
{
    final /* synthetic */ String a;
    final /* synthetic */ dc b;
    final /* synthetic */ dh c;
    
    di(final dh c, final String a, final dc b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final List list) {
        if (!list.isEmpty()) {
            this.c.a(this.a, this.b);
        }
    }
}
