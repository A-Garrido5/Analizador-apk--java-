import android.graphics.Xfermode;
import android.graphics.Paint$Style;
import android.graphics.Path$Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Paint;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$Config;
import com.twitter.internal.android.util.Size;
import android.graphics.Bitmap;
import java.util.List;
import android.content.res.Resources;
import android.util.Log;
import com.twitter.library.client.App;

// 
// Decompiled by Procyon v0.5.30
// 

public class gs
{
    private static final boolean a;
    
    static {
        a = (App.l() && Log.isLoggable("FacePileUtil", 3));
    }
    
    public static Bitmap a(final Resources resources, final List list) {
        int size;
        if (list != null) {
            size = list.size();
        }
        else {
            size = 0;
        }
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131558756);
        final int dimensionPixelOffset2 = resources.getDimensionPixelOffset(2131558755);
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131558754);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131558753);
        final Bitmap a = m.a(Size.a(dimensionPixelOffset, dimensionPixelOffset2), Bitmap$Config.ARGB_8888);
        if (a == null) {
            if (gs.a) {
                Log.w("FacePileUtil", "Out of memory. Unable to create face pile.");
            }
            return null;
        }
        final Paint paint = new Paint();
        final RectF rectF = new RectF();
        final Canvas canvas = new Canvas(a);
        final PorterDuffXfermode xfermode = new PorterDuffXfermode(PorterDuff$Mode.CLEAR);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131558752);
        final float n = dimensionPixelSize3 / 2.0f;
        for (int n2 = 0; n2 < size && n2 < 3; ++n2) {
            int n3 = 0;
            int n4 = 0;
            switch (n2) {
                default: {
                    final int dimensionPixelOffset3 = resources.getDimensionPixelOffset(2131558750);
                    n3 = resources.getDimensionPixelOffset(2131558751);
                    n4 = dimensionPixelOffset3;
                    break;
                }
                case 0: {
                    if (size == 2) {
                        final int dimensionPixelOffset4 = resources.getDimensionPixelOffset(2131558742);
                        n3 = resources.getDimensionPixelOffset(2131558743);
                        n4 = dimensionPixelOffset4;
                        break;
                    }
                    final int dimensionPixelOffset5 = resources.getDimensionPixelOffset(2131558746);
                    n3 = resources.getDimensionPixelOffset(2131558747);
                    n4 = dimensionPixelOffset5;
                    break;
                }
                case 1: {
                    if (size == 2) {
                        final int dimensionPixelOffset6 = resources.getDimensionPixelOffset(2131558744);
                        n3 = resources.getDimensionPixelOffset(2131558745);
                        n4 = dimensionPixelOffset6;
                        break;
                    }
                    final int dimensionPixelOffset7 = resources.getDimensionPixelOffset(2131558748);
                    n3 = resources.getDimensionPixelOffset(2131558749);
                    n4 = dimensionPixelOffset7;
                    break;
                }
            }
            final Bitmap bitmap = list.get(n2);
            rectF.set((float)n4, (float)n3, (float)(n4 + dimensionPixelSize), (float)(n3 + dimensionPixelSize2));
            paint.reset();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            canvas.drawBitmap(bitmap, (Rect)null, rectF, paint);
            final float n5 = n4 - n;
            final float n6 = n3 - n;
            final float n7 = n + (n4 + rectF.width());
            final float n8 = n + (n3 + rectF.height());
            final Path path = new Path();
            path.addRect(n5, n6, n7, n8, Path$Direction.CW);
            paint.reset();
            paint.setAntiAlias(false);
            paint.setStrokeWidth((float)dimensionPixelSize3);
            paint.setStyle(Paint$Style.STROKE);
            paint.setXfermode((Xfermode)xfermode);
            canvas.drawPath(path, paint);
        }
        return a;
    }
}
