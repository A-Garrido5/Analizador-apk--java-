// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.graphics;

import java.util.Arrays;
import android.support.v4.graphics.ColorUtils;
import android.graphics.Color;

public final class Palette$Swatch
{
    public static boolean a;
    private static final String[] z;
    private final int mBlue;
    private int mBodyTextColor;
    private boolean mGeneratedTextColors;
    private final int mGreen;
    private float[] mHsl;
    private final int mPopulation;
    private final int mRed;
    private final int mRgb;
    private int mTitleTextColor;
    
    static {
        final String[] z2 = new String[5];
        String s = "7L1#sb{\u00008jxy[l";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0003';
                        break;
                    }
                    case 0: {
                        c2 = '\u0017';
                        break;
                    }
                    case 1: {
                        c2 = '\u0017';
                        break;
                    }
                    case 2: {
                        c2 = 'a';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "7L5%w{rA\u0018foc[l ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "7L)\u001fO-7";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "7L3\u000bA-7B";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "7L##gn75){c-Ao";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public Palette$Swatch(final int mRgb, final int mPopulation) {
        this.mRed = Color.red(mRgb);
        this.mGreen = Color.green(mRgb);
        this.mBlue = Color.blue(mRgb);
        this.mRgb = mRgb;
        this.mPopulation = mPopulation;
    }
    
    private void ensureTextColorsGenerated() {
        if (!this.mGeneratedTextColors) {
            final int calculateMinimumAlpha = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, 4.5f);
            final int calculateMinimumAlpha2 = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, 3.0f);
            if (calculateMinimumAlpha != -1 && calculateMinimumAlpha2 != -1) {
                this.mBodyTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                this.mTitleTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                this.mGeneratedTextColors = true;
            }
            else {
                final int calculateMinimumAlpha3 = ColorUtils.calculateMinimumAlpha(-16777216, this.mRgb, 4.5f);
                final int calculateMinimumAlpha4 = ColorUtils.calculateMinimumAlpha(-16777216, this.mRgb, 3.0f);
                if (calculateMinimumAlpha3 != -1 && calculateMinimumAlpha3 != -1) {
                    this.mBodyTextColor = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                    this.mTitleTextColor = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                    this.mGeneratedTextColors = true;
                    return;
                }
                int mBodyTextColor;
                if (calculateMinimumAlpha != -1) {
                    mBodyTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                }
                else {
                    mBodyTextColor = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                }
                this.mBodyTextColor = mBodyTextColor;
                int mTitleTextColor;
                if (calculateMinimumAlpha2 != -1) {
                    mTitleTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                }
                else {
                    mTitleTextColor = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                }
                this.mTitleTextColor = mTitleTextColor;
                this.mGeneratedTextColors = true;
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Palette$Swatch palette$Swatch = (Palette$Swatch)o;
            if (this.mPopulation != palette$Swatch.mPopulation || this.mRgb != palette$Swatch.mRgb) {
                return false;
            }
        }
        return true;
    }
    
    public int getBodyTextColor() {
        this.ensureTextColorsGenerated();
        return this.mBodyTextColor;
    }
    
    public float[] getHsl() {
        if (this.mHsl == null) {
            this.mHsl = new float[3];
            ColorUtils.RGBToHSL(this.mRed, this.mGreen, this.mBlue, this.mHsl);
        }
        return this.mHsl;
    }
    
    public int getPopulation() {
        return this.mPopulation;
    }
    
    public int getRgb() {
        return this.mRgb;
    }
    
    public int getTitleTextColor() {
        this.ensureTextColorsGenerated();
        return this.mTitleTextColor;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.mRgb + this.mPopulation;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + Palette$Swatch.z[3] + Integer.toHexString(this.getRgb()) + ']' + Palette$Swatch.z[2] + Arrays.toString(this.getHsl()) + ']' + Palette$Swatch.z[0] + this.mPopulation + ']' + Palette$Swatch.z[1] + Integer.toHexString(this.getTitleTextColor()) + ']' + Palette$Swatch.z[4] + Integer.toHexString(this.getBodyTextColor()) + ']';
    }
}
