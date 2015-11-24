import java.util.TimerTask;

// 
// Decompiled by Procyon v0.5.30
// 

class ka extends TimerTask
{
    final /* synthetic */ jz a;
    
    ka(final jz a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.b();
    }
}
