import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.5.30
// 

class lu extends DataSetObserver
{
    final /* synthetic */ ls a;
    
    private lu(final ls a) {
        this.a = a;
    }
    
    public void onChanged() {
        super.onChanged();
        this.a.a();
    }
}
