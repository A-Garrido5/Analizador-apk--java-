// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.graphics;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;

public class ColorUtils
{
    public static int a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0017<ZYM\u00072L\\NU>X\\\n\u001b2M\u0012H\u0010}M@K\u001b.UGI\u00103M";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = ']';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = '2';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u00141IZKU0LA^U?\\\u0012H\u0010)NWO\u001b}\t\u0012K\u001b9\u0019\u0000\u001f@s";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0017<ZYM\u00072L\\NU>X\\\n\u001b2M\u0012H\u0010}M@K\u001b.UGI\u00103M";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static int HSLToColor(final float[] array) {
        final int a = ColorUtils.a;
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[2];
        final float n4 = n2 * (1.0f - Math.abs(2.0f * n3 - 1.0f));
        final float n5 = n3 - 0.5f * n4;
        final float n6 = n4 * (1.0f - Math.abs(n / 60.0f % 2.0f - 1.0f));
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        Label_0365: {
            switch ((int)n / 60) {
                default: {
                    n7 = 0;
                    n8 = 0;
                    n9 = 0;
                    break;
                }
                case 0: {
                    n9 = Math.round(255.0f * (n4 + n5));
                    n8 = Math.round(255.0f * (n6 + n5));
                    n7 = Math.round(255.0f * n5);
                    if (a != 0) {
                        ++FragmentActivity.a;
                        break Label_0365;
                    }
                    break;
                }
                case 1: {
                    n9 = Math.round(255.0f * (n6 + n5));
                    n8 = Math.round(255.0f * (n4 + n5));
                    n7 = Math.round(255.0f * n5);
                    if (a != 0) {
                        break Label_0365;
                    }
                    break;
                }
                case 2: {
                    n9 = Math.round(255.0f * n5);
                    n8 = Math.round(255.0f * (n4 + n5));
                    n7 = Math.round(255.0f * (n6 + n5));
                    if (a != 0) {
                        break Label_0365;
                    }
                    break;
                }
                case 3: {
                    n9 = Math.round(255.0f * n5);
                    n8 = Math.round(255.0f * (n6 + n5));
                    n7 = Math.round(255.0f * (n4 + n5));
                    if (a != 0) {
                        break Label_0365;
                    }
                    break;
                }
                case 4: {
                    n9 = Math.round(255.0f * (n6 + n5));
                    n8 = Math.round(255.0f * n5);
                    n7 = Math.round(255.0f * (n4 + n5));
                    if (a != 0) {
                        break Label_0365;
                    }
                    break;
                }
                case 5:
                case 6: {
                    n9 = Math.round(255.0f * (n4 + n5));
                    n8 = Math.round(255.0f * n5);
                    n7 = Math.round(255.0f * (n6 + n5));
                    break;
                }
            }
        }
        return Color.rgb(Math.max(0, Math.min(255, n9)), Math.max(0, Math.min(255, n8)), Math.max(0, Math.min(255, n7)));
    }
    
    public static void RGBToHSL(final int n, final int n2, final int n3, final float[] array) {
        final int a = ColorUtils.a;
        final float n4 = n / 255.0f;
        final float n5 = n2 / 255.0f;
        final float n6 = n3 / 255.0f;
        final float max = Math.max(n4, Math.max(n5, n6));
        final float min = Math.min(n4, Math.min(n5, n6));
        final float n7 = max - min;
        final float n8 = (max + min) / 2.0f;
        while (true) {
            Label_0215: {
                if (max == min && a == 0) {
                    break Label_0215;
                }
                float n9 = 0.0f;
                Label_0147: {
                    if (max == n4) {
                        n9 = (n5 - n6) / n7 % 6.0f;
                        if (a == 0) {
                            break Label_0147;
                        }
                    }
                    if (max == n5) {
                        n9 = 2.0f + (n6 - n4) / n7;
                        if (a == 0) {
                            break Label_0147;
                        }
                    }
                    n9 = 4.0f + (n4 - n5) / n7;
                }
                final float n10 = n7 / (1.0f - Math.abs(2.0f * n8 - 1.0f));
                final float n11 = n9;
                final float n12 = n10;
                final float n13 = n11 * 60.0f % 360.0f;
                try {
                    array[0] = n13;
                    array[1] = n12;
                    array[2] = n8;
                    if (FragmentActivity.a != 0) {
                        ColorUtils.a = a + 1;
                    }
                    return;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            final float n12 = 0.0f;
            final float n11 = 0.0f;
            continue;
        }
    }
    
    public static double calculateContrast(int compositeColors, final int n) {
        try {
            if (Color.alpha(n) != 255) {
                throw new IllegalArgumentException(ColorUtils.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        if (Color.alpha(compositeColors) < 255) {
            compositeColors = compositeColors(compositeColors, n);
        }
        final double n2 = 0.05 + calculateLuminance(compositeColors);
        final double n3 = 0.05 + calculateLuminance(n);
        return Math.max(n2, n3) / Math.min(n2, n3);
    }
    
    public static double calculateLuminance(final int n) {
        final double n2 = Color.red(n) / 255.0;
        double pow;
        if (n2 < 0.03928) {
            pow = n2 / 12.92;
        }
        else {
            pow = Math.pow((n2 + 0.055) / 1.055, 2.4);
        }
        final double n3 = Color.green(n) / 255.0;
        double pow2;
        if (n3 < 0.03928) {
            pow2 = n3 / 12.92;
        }
        else {
            pow2 = Math.pow((n3 + 0.055) / 1.055, 2.4);
        }
        final double n4 = Color.blue(n) / 255.0;
        double pow3;
        if (n4 < 0.03928) {
            pow3 = n4 / 12.92;
        }
        else {
            pow3 = Math.pow((n4 + 0.055) / 1.055, 2.4);
        }
        return pow * 0.2126 + pow2 * 0.7152 + 0.0722 * pow3;
    }
    
    public static int calculateMinimumAlpha(final int n, final int n2, final float n3) {
        int n4 = 0;
        int n5 = 255;
        final int a = ColorUtils.a;
        try {
            if (Color.alpha(n2) != n5) {
                throw new IllegalArgumentException(ColorUtils.z[2]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        if (calculateContrast(setAlphaComponent(n, n5), n2) >= n3) {
            int n7;
            int n8 = 0;
            int n10;
            for (int n6 = 0; n6 <= 10 && n5 - n4 > 10; n6 = n10, n5 = n8, n4 = n7) {
                n7 = (n4 + n5) / 2;
                Label_0123: {
                    if (calculateContrast(setAlphaComponent(n, n7), n2) < n3) {
                        if (a == 0) {
                            n8 = n5;
                            break Label_0123;
                        }
                        n4 = n7;
                    }
                    final int n9 = n7;
                    n7 = n4;
                    n8 = n9;
                }
                n10 = n6 + 1;
                if (a != 0) {
                    return n8;
                }
            }
            return n5;
        }
        return -1;
    }
    
    public static void colorToHSL(final int n, final float[] array) {
        RGBToHSL(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    private static int compositeAlpha(final int n, final int n2) {
        return 255 - (255 - n2) * (255 - n) / 255;
    }
    
    public static int compositeColors(final int n, final int n2) {
        final int alpha = Color.alpha(n2);
        final int alpha2 = Color.alpha(n);
        final int compositeAlpha = compositeAlpha(alpha2, alpha);
        return Color.argb(compositeAlpha, compositeComponent(Color.red(n), alpha2, Color.red(n2), alpha, compositeAlpha), compositeComponent(Color.green(n), alpha2, Color.green(n2), alpha, compositeAlpha), compositeComponent(Color.blue(n), alpha2, Color.blue(n2), alpha, compositeAlpha));
    }
    
    private static int compositeComponent(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return 0;
        }
        return (n2 * (n * 255) + n3 * n4 * (255 - n2)) / (n5 * 255);
    }
    
    public static int setAlphaComponent(final int n, final int n2) {
        if (n2 >= 0) {
            if (n2 <= 255) {
                return (0xFFFFFF & n) | n2 << 24;
            }
        }
        try {
            throw new IllegalArgumentException(ColorUtils.z[1]);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return (0xFFFFFF & n) | n2 << 24;
    }
}
