// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.graphics;

import android.support.v4.graphics.ColorUtils;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Collection;
import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import android.util.TimingLogger;
import java.util.List;
import java.util.Comparator;

final class ColorCutQuantizer
{
    private static final Comparator VBOX_COMPARATOR_VOLUME;
    final int[] mColors;
    final int[] mHistogram;
    final List mQuantizedColors;
    private final float[] mTempHsl;
    final TimingLogger mTimingLogger;
    
    static {
        VBOX_COMPARATOR_VOLUME = new ColorCutQuantizer$1();
    }
    
    private ColorCutQuantizer(final int[] array, final int n) {
        int i = 0;
        final boolean a = Palette$Swatch.a;
        this.mTempHsl = new float[3];
        this.mTimingLogger = null;
        final int[] mHistogram = new int[32768];
        this.mHistogram = mHistogram;
        int j = 0;
        while (j < array.length) {
            final int quantizeFromRgb888 = quantizeFromRgb888(array[j]);
            mHistogram[array[j] = quantizeFromRgb888] = 1 + mHistogram[quantizeFromRgb888];
            ++j;
            if (a) {
                break;
            }
        }
        int k = 0;
        int n2 = 0;
        while (k < mHistogram.length) {
            if (mHistogram[k] > 0 && this.shouldIgnoreColor(k)) {
                mHistogram[k] = 0;
            }
            if (mHistogram[k] > 0) {
                ++n2;
            }
            ++k;
            if (a) {
                break;
            }
        }
        final int[] mColors = new int[n2];
        this.mColors = mColors;
        int l = 0;
        int n3 = 0;
        while (l < mHistogram.length) {
            if (mHistogram[l] > 0) {
                final int n4 = n3 + 1;
                mColors[n3] = l;
                n3 = n4;
            }
            ++l;
            if (a) {
                break;
            }
        }
        if (n2 <= n) {
            this.mQuantizedColors = new ArrayList();
            while (i < mColors.length) {
                final int n5 = mColors[i];
                this.mQuantizedColors.add(new Palette$Swatch(approximateToRgb888(n5), mHistogram[n5]));
                ++i;
                if (a) {
                    break;
                }
            }
            return;
        }
        this.mQuantizedColors = this.quantizePixels(n);
    }
    
    static int access$000(final int n) {
        return quantizedRed(n);
    }
    
    static int access$100(final int n) {
        return quantizedGreen(n);
    }
    
    static int access$200(final int n) {
        return quantizedBlue(n);
    }
    
    static void access$300(final int[] array, final int n, final int n2, final int n3) {
        modifySignificantOctet(array, n, n2, n3);
    }
    
    static int access$400(final int n, final int n2, final int n3) {
        return approximateToRgb888(n, n2, n3);
    }
    
    private static int approximateToRgb888(final int n) {
        return approximateToRgb888(quantizedRed(n), quantizedGreen(n), quantizedBlue(n));
    }
    
    private static int approximateToRgb888(final int n, final int n2, final int n3) {
        return Color.rgb(modifyWordWidth(n, 5, 8), modifyWordWidth(n2, 5, 8), modifyWordWidth(n3, 5, 8));
    }
    
    static ColorCutQuantizer fromBitmap(final Bitmap bitmap, final int n) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final int[] array = new int[width * height];
        bitmap.getPixels(array, 0, width, 0, 0, width, height);
        return new ColorCutQuantizer(array, n);
    }
    
    private List generateAverageColors(final Collection collection) {
        final boolean a = Palette$Swatch.a;
        final ArrayList<Palette$Swatch> list = new ArrayList<Palette$Swatch>(collection.size());
        final Iterator<ColorCutQuantizer$Vbox> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final Palette$Swatch averageColor = iterator.next().getAverageColor();
            if (!shouldIgnoreColor(averageColor)) {
                list.add(averageColor);
            }
            if (a) {
                break;
            }
        }
        return list;
    }
    
    private static boolean isBlack(final float[] array) {
        return array[2] <= 0.05f;
    }
    
    private static boolean isNearRedILine(final float[] array) {
        return array[0] >= 10.0f && array[0] <= 37.0f && array[1] <= 0.82f;
    }
    
    private static boolean isWhite(final float[] array) {
        return array[2] >= 0.95f;
    }
    
    private static void modifySignificantOctet(final int[] array, final int n, int i, final int n2) {
        final boolean a = Palette$Swatch.a;
        Label_0092: {
            switch (n) {
                case -3: {
                    if (a) {
                        break Label_0092;
                    }
                    break;
                }
                case -2: {
                    int j = i;
                    while (j <= n2) {
                        final int n3 = array[j];
                        array[j] = (quantizedGreen(n3) << 10 | quantizedRed(n3) << 5 | quantizedBlue(n3));
                        ++j;
                        if (a) {
                            break;
                        }
                    }
                    if (a) {
                        break Label_0092;
                    }
                    break;
                }
                case -1: {
                    while (i <= n2) {
                        final int n4 = array[i];
                        array[i] = (quantizedBlue(n4) << 10 | quantizedGreen(n4) << 5 | quantizedRed(n4));
                        ++i;
                        if (a) {
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    private static int modifyWordWidth(final int n, final int n2, final int n3) {
        if (n3 > n2) {
            final int n4 = n * (-1 + (1 << n3)) / (-1 + (1 << n2));
            if (!Palette$Swatch.a) {
                return n4 & -1 + (1 << n3);
            }
        }
        final int n4 = n >> n2 - n3;
        return n4 & -1 + (1 << n3);
    }
    
    private static int quantizeFromRgb888(final int n) {
        return modifyWordWidth(Color.blue(n), 8, 5) | (modifyWordWidth(Color.red(n), 8, 5) << 10 | modifyWordWidth(Color.green(n), 8, 5) << 5);
    }
    
    private List quantizePixels(final int n) {
        final PriorityQueue<ColorCutQuantizer$Vbox> priorityQueue = new PriorityQueue<ColorCutQuantizer$Vbox>(n, ColorCutQuantizer.VBOX_COMPARATOR_VOLUME);
        priorityQueue.offer(new ColorCutQuantizer$Vbox(this, 0, -1 + this.mColors.length));
        this.splitBoxes(priorityQueue, n);
        return this.generateAverageColors(priorityQueue);
    }
    
    private static int quantizedBlue(final int n) {
        return n & 0x1F;
    }
    
    private static int quantizedGreen(final int n) {
        return 0x1F & n >> 5;
    }
    
    private static int quantizedRed(final int n) {
        return 0x1F & n >> 10;
    }
    
    private boolean shouldIgnoreColor(final int n) {
        ColorUtils.colorToHSL(approximateToRgb888(n), this.mTempHsl);
        return shouldIgnoreColor(this.mTempHsl);
    }
    
    private static boolean shouldIgnoreColor(final Palette$Swatch palette$Swatch) {
        return shouldIgnoreColor(palette$Swatch.getHsl());
    }
    
    private static boolean shouldIgnoreColor(final float[] array) {
        return isWhite(array) || isBlack(array) || isNearRedILine(array);
    }
    
    private void splitBoxes(final PriorityQueue priorityQueue, final int n) {
        final boolean a = Palette$Swatch.a;
        while (priorityQueue.size() < n) {
            final ColorCutQuantizer$Vbox colorCutQuantizer$Vbox = priorityQueue.poll();
            if (colorCutQuantizer$Vbox == null || !colorCutQuantizer$Vbox.canSplit()) {
                break;
            }
            priorityQueue.offer(colorCutQuantizer$Vbox.splitBox());
            priorityQueue.offer(colorCutQuantizer$Vbox);
            if (a) {
                break;
            }
            if (a) {
                return;
            }
        }
    }
    
    List getQuantizedColors() {
        return this.mQuantizedColors;
    }
}
