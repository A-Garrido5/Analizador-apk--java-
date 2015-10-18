import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.5.30
// 

class xv extends Drawable$ConstantState
{
    int a;
    float b;
    
    xv() {
    }
    
    xv(final xv xv) {
        this.a = xv.a;
        this.b = xv.b;
    }
    
    public int getChangingConfigurations() {
        return 0;
    }
    
    public Drawable newDrawable() {
        return new xr(this);
    }
}
