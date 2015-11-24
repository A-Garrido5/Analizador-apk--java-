import android.location.Location;

// 
// Decompiled by Procyon v0.5.30
// 

class sr implements Runnable
{
    private final so a;
    private final Location b;
    private final int c;
    
    private sr(final so a, final Location b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        switch (this.c) {
            default: {}
            case 0: {
                this.a.a(this.b);
            }
            case 1: {
                this.a.b(this.b);
            }
        }
    }
}
