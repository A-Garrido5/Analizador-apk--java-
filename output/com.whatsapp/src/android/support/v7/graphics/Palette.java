// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.graphics;

import android.os.AsyncTask;
import android.graphics.Bitmap;
import java.util.List;

public final class Palette
{
    public static int a;
    private final Palette$Generator mGenerator;
    private final List mSwatches;
    
    private Palette(final List mSwatches, final Palette$Generator mGenerator) {
        this.mSwatches = mSwatches;
        this.mGenerator = mGenerator;
    }
    
    Palette(final List list, final Palette$Generator palette$Generator, final Palette$1 palette$1) {
        this(list, palette$Generator);
    }
    
    static Bitmap access$000(final Bitmap bitmap, final int n) {
        return scaleBitmapDown(bitmap, n);
    }
    
    public static Palette$Builder from(final Bitmap bitmap) {
        return new Palette$Builder(bitmap);
    }
    
    @Deprecated
    public static AsyncTask generateAsync(final Bitmap bitmap, final Palette$PaletteAsyncListener palette$PaletteAsyncListener) {
        return from(bitmap).generate(palette$PaletteAsyncListener);
    }
    
    private static Bitmap scaleBitmapDown(final Bitmap bitmap, final int n) {
        final int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (max <= n) {
            return bitmap;
        }
        final float n2 = n / max;
        return Bitmap.createScaledBitmap(bitmap, Math.round(n2 * bitmap.getWidth()), Math.round(n2 * bitmap.getHeight()), false);
    }
    
    public Palette$Swatch getMutedSwatch() {
        return this.mGenerator.getMutedSwatch();
    }
}
