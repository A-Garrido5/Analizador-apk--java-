// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.graphics;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class Palette$Builder$1 extends AsyncTask
{
    final Palette$Builder this$0;
    final Palette$PaletteAsyncListener val$listener;
    
    Palette$Builder$1(final Palette$Builder this$0, final Palette$PaletteAsyncListener val$listener) {
        this.this$0 = this$0;
        this.val$listener = val$listener;
    }
    
    protected Palette doInBackground(final Bitmap[] array) {
        return this.this$0.generate();
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.doInBackground((Bitmap[])array);
    }
    
    protected void onPostExecute(final Palette palette) {
        this.val$listener.onGenerated(palette);
    }
    
    protected void onPostExecute(final Object o) {
        this.onPostExecute((Palette)o);
    }
}
