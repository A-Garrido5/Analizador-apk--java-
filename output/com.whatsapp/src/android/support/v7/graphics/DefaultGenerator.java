// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.graphics;

import android.support.v4.graphics.ColorUtils;
import java.util.Iterator;
import java.util.List;

class DefaultGenerator extends Palette$Generator
{
    private Palette$Swatch mDarkMutedSwatch;
    private Palette$Swatch mDarkVibrantSwatch;
    private int mHighestPopulation;
    private Palette$Swatch mLightMutedSwatch;
    private Palette$Swatch mLightVibrantSwatch;
    private Palette$Swatch mMutedSwatch;
    private List mSwatches;
    private Palette$Swatch mVibrantSwatch;
    
    private static float[] copyHslValues(final Palette$Swatch palette$Swatch) {
        final float[] array = new float[3];
        System.arraycopy(palette$Swatch.getHsl(), 0, array, 0, 3);
        return array;
    }
    
    private static float createComparisonValue(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7, final int n8, final float n9) {
        return weightedMean(new float[] { invertDiff(n, n2), n3, invertDiff(n4, n5), n6, n7 / n8, n9 });
    }
    
    private static float createComparisonValue(final float n, final float n2, final float n3, final float n4, final int n5, final int n6) {
        return createComparisonValue(n, n2, 3.0f, n3, n4, 6.0f, n5, n6, 1.0f);
    }
    
    private Palette$Swatch findColorVariation(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final boolean a = Palette$Swatch.a;
        final Iterator<Palette$Swatch> iterator = this.mSwatches.iterator();
        float n7 = 0.0f;
        Palette$Swatch palette$Swatch = null;
    Label_0139_Outer:
        while (iterator.hasNext()) {
            final Palette$Swatch palette$Swatch2 = iterator.next();
            final float n8 = palette$Swatch2.getHsl()[1];
            final float n9 = palette$Swatch2.getHsl()[2];
            while (true) {
                Label_0147: {
                    if (n8 < n5 || n8 > n6 || n9 < n2 || n9 > n3 || this.isAlreadySelected(palette$Swatch2)) {
                        break Label_0147;
                    }
                    final float comparisonValue = createComparisonValue(n8, n4, n9, n, palette$Swatch2.getPopulation(), this.mHighestPopulation);
                    if (palette$Swatch != null && comparisonValue <= n7) {
                        break Label_0147;
                    }
                    final Palette$Swatch palette$Swatch3 = palette$Swatch2;
                    if (a) {
                        return palette$Swatch3;
                    }
                    n7 = comparisonValue;
                    palette$Swatch = palette$Swatch3;
                    continue Label_0139_Outer;
                }
                final float comparisonValue = n7;
                final Palette$Swatch palette$Swatch3 = palette$Swatch;
                continue;
            }
        }
        return palette$Swatch;
    }
    
    private int findMaxPopulation() {
        final boolean a = Palette$Swatch.a;
        final Iterator<Palette$Swatch> iterator = this.mSwatches.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final int max = Math.max(n, iterator.next().getPopulation());
            if (a) {
                return max;
            }
            n = max;
        }
        return n;
    }
    
    private void generateEmptySwatches() {
        if (this.mVibrantSwatch == null && this.mDarkVibrantSwatch != null) {
            final float[] copyHslValues = copyHslValues(this.mDarkVibrantSwatch);
            copyHslValues[2] = 0.5f;
            this.mVibrantSwatch = new Palette$Swatch(ColorUtils.HSLToColor(copyHslValues), 0);
        }
        if (this.mDarkVibrantSwatch == null && this.mVibrantSwatch != null) {
            final float[] copyHslValues2 = copyHslValues(this.mVibrantSwatch);
            copyHslValues2[2] = 0.26f;
            this.mDarkVibrantSwatch = new Palette$Swatch(ColorUtils.HSLToColor(copyHslValues2), 0);
        }
    }
    
    private void generateVariationColors() {
        this.mVibrantSwatch = this.findColorVariation(0.5f, 0.3f, 0.7f, 1.0f, 0.35f, 1.0f);
        this.mLightVibrantSwatch = this.findColorVariation(0.74f, 0.55f, 1.0f, 1.0f, 0.35f, 1.0f);
        this.mDarkVibrantSwatch = this.findColorVariation(0.26f, 0.0f, 0.45f, 1.0f, 0.35f, 1.0f);
        this.mMutedSwatch = this.findColorVariation(0.5f, 0.3f, 0.7f, 0.3f, 0.0f, 0.4f);
        this.mLightMutedSwatch = this.findColorVariation(0.74f, 0.55f, 1.0f, 0.3f, 0.0f, 0.4f);
        this.mDarkMutedSwatch = this.findColorVariation(0.26f, 0.0f, 0.45f, 0.3f, 0.0f, 0.4f);
    }
    
    private static float invertDiff(final float n, final float n2) {
        return 1.0f - Math.abs(n - n2);
    }
    
    private boolean isAlreadySelected(final Palette$Swatch palette$Swatch) {
        return this.mVibrantSwatch == palette$Swatch || this.mDarkVibrantSwatch == palette$Swatch || this.mLightVibrantSwatch == palette$Swatch || this.mMutedSwatch == palette$Swatch || this.mDarkMutedSwatch == palette$Swatch || this.mLightMutedSwatch == palette$Swatch;
    }
    
    private static float weightedMean(final float[] array) {
        float n = 0.0f;
        final boolean a = Palette$Swatch.a;
        int i = 0;
        float n2 = 0.0f;
        while (i < array.length) {
            final float n3 = array[i];
            final float n4 = array[i + 1];
            n2 += n3 * n4;
            n += n4;
            i += 2;
            if (a) {
                break;
            }
        }
        return n2 / n;
    }
    
    @Override
    public void generate(final List mSwatches) {
        this.mSwatches = mSwatches;
        this.mHighestPopulation = this.findMaxPopulation();
        this.generateVariationColors();
        this.generateEmptySwatches();
    }
    
    @Override
    public Palette$Swatch getMutedSwatch() {
        return this.mMutedSwatch;
    }
}
