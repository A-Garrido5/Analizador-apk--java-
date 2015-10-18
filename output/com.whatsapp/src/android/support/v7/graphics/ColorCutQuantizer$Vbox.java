// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.graphics;

import java.util.Arrays;

class ColorCutQuantizer$Vbox
{
    private static final String z;
    private int mLowerIndex;
    private int mMaxBlue;
    private int mMaxGreen;
    private int mMaxRed;
    private int mMinBlue;
    private int mMinGreen;
    private int mMinRed;
    private int mPopulation;
    private int mUpperIndex;
    final ColorCutQuantizer this$0;
    
    static {
        final char[] charArray = "RWo?\u0001~B!l\u001f}_u?\u000e1TngOf_uwO~XmfO \u0016bp\u0003~D".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'o';
                    break;
                }
                case 0: {
                    c2 = '\u0011';
                    break;
                }
                case 1: {
                    c2 = '6';
                    break;
                }
                case 2: {
                    c2 = '\u0001';
                    break;
                }
                case 3: {
                    c2 = '\u001f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ColorCutQuantizer$Vbox(final ColorCutQuantizer this$0, final int mLowerIndex, final int mUpperIndex) {
        this.this$0 = this$0;
        this.mLowerIndex = mLowerIndex;
        this.mUpperIndex = mUpperIndex;
        this.fitBox();
    }
    
    final boolean canSplit() {
        try {
            if (this.getColorCount() > 1) {
                return true;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return false;
    }
    
    final int findSplitPoint() {
        final boolean a = Palette$Swatch.a;
        final int longestColorDimension = this.getLongestColorDimension();
        final int[] mColors = this.this$0.mColors;
        final int[] mHistogram = this.this$0.mHistogram;
        ColorCutQuantizer.access$300(mColors, longestColorDimension, this.mLowerIndex, this.mUpperIndex);
        Arrays.sort(mColors, this.mLowerIndex, 1 + this.mUpperIndex);
        ColorCutQuantizer.access$300(mColors, longestColorDimension, this.mLowerIndex, this.mUpperIndex);
        final int n = this.mPopulation / 2;
        int i = this.mLowerIndex;
        int n2 = 0;
        while (i <= this.mUpperIndex) {
            n2 += mHistogram[mColors[i]];
            if (n2 >= n) {
                return i;
            }
            ++i;
            if (a) {
                break;
            }
        }
        return this.mLowerIndex;
    }
    
    final void fitBox() {
        final boolean a = Palette$Swatch.a;
        final int[] mColors = this.this$0.mColors;
        final int[] mHistogram = this.this$0.mHistogram;
        int mMaxBlue = Integer.MIN_VALUE;
        int mPopulation = 0;
        int i = this.mLowerIndex;
        int mMaxRed = mMaxBlue;
        int mMinBlue = Integer.MAX_VALUE;
        int mMinGreen = Integer.MAX_VALUE;
        int mMinRed = Integer.MAX_VALUE;
        int mMaxGreen = mMaxBlue;
        while (i <= this.mUpperIndex) {
            final int n = mColors[i];
            mPopulation += mHistogram[n];
            final int access$000 = ColorCutQuantizer.access$000(n);
            final int access$2 = ColorCutQuantizer.access$100(n);
            final int access$3 = ColorCutQuantizer.access$200(n);
            if (access$000 > mMaxRed) {
                mMaxRed = access$000;
            }
            if (access$000 < mMinRed) {
                mMinRed = access$000;
            }
            if (access$2 > mMaxGreen) {
                mMaxGreen = access$2;
            }
            if (access$2 < mMinGreen) {
                mMinGreen = access$2;
            }
            if (access$3 > mMaxBlue) {
                mMaxBlue = access$3;
            }
            if (access$3 < mMinBlue) {
                mMinBlue = access$3;
            }
            ++i;
            if (a) {
                ++Palette.a;
                break;
            }
        }
        this.mMinRed = mMinRed;
        this.mMaxRed = mMaxRed;
        this.mMinGreen = mMinGreen;
        this.mMaxGreen = mMaxGreen;
        this.mMinBlue = mMinBlue;
        this.mMaxBlue = mMaxBlue;
        this.mPopulation = mPopulation;
    }
    
    final Palette$Swatch getAverageColor() {
        final boolean a = Palette$Swatch.a;
        final int[] mColors = this.this$0.mColors;
        final int[] mHistogram = this.this$0.mHistogram;
        int i = this.mLowerIndex;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (i <= this.mUpperIndex) {
            final int n5 = mColors[i];
            final int n6 = mHistogram[n5];
            n += n6;
            n4 += n6 * ColorCutQuantizer.access$000(n5);
            n3 += n6 * ColorCutQuantizer.access$100(n5);
            n2 += n6 * ColorCutQuantizer.access$200(n5);
            ++i;
            if (a) {
                break;
            }
        }
        while (true) {
            final int round = Math.round(n4 / n);
            final int round2 = Math.round(n3 / n);
            final int round3 = Math.round(n2 / n);
            while (true) {
                Label_0203: {
                    try {
                        final Palette$Swatch palette$Swatch = new Palette$Swatch(ColorCutQuantizer.access$400(round, round2, round3), n);
                        if (Palette.a != 0) {
                            final boolean a2 = false;
                            if (!a) {
                                break Label_0203;
                            }
                            Palette$Swatch.a = a2;
                        }
                        return palette$Swatch;
                    }
                    catch (IllegalStateException ex) {
                        try {
                            throw ex;
                        }
                        catch (IllegalStateException ex2) {
                            throw ex2;
                        }
                    }
                }
                final boolean a2 = true;
                continue;
            }
        }
    }
    
    final int getColorCount() {
        return 1 + this.mUpperIndex - this.mLowerIndex;
    }
    
    final int getLongestColorDimension() {
        final int n = this.mMaxRed - this.mMinRed;
        final int n2 = this.mMaxGreen - this.mMinGreen;
        final int n3 = this.mMaxBlue - this.mMinBlue;
        if (n >= n2 && n >= n3) {
            return -3;
        }
        if (n2 >= n && n2 >= n3) {
            return -2;
        }
        return -1;
    }
    
    final int getVolume() {
        return (1 + (this.mMaxRed - this.mMinRed)) * (1 + (this.mMaxGreen - this.mMinGreen)) * (1 + (this.mMaxBlue - this.mMinBlue));
    }
    
    final ColorCutQuantizer$Vbox splitBox() {
        try {
            if (!this.canSplit()) {
                throw new IllegalStateException(ColorCutQuantizer$Vbox.z);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        final int splitPoint = this.findSplitPoint();
        final ColorCutQuantizer$Vbox colorCutQuantizer$Vbox = new ColorCutQuantizer$Vbox(this.this$0, splitPoint + 1, this.mUpperIndex);
        this.mUpperIndex = splitPoint;
        this.fitBox();
        return colorCutQuantizer$Vbox;
    }
}
