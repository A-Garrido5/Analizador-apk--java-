// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.io.PrintWriter;

public class TimeUtils
{
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char[] sFormatStr;
    private static final Object sFormatSync;
    
    static {
        sFormatSync = new Object();
        TimeUtils.sFormatStr = new char[24];
    }
    
    private static int accumField(final int n, final int n2, final boolean b, final int n3) {
        if (n > 99 || (b && n3 >= 3)) {
            return n2 + 3;
        }
        if (n > 9 || (b && n3 >= 2)) {
            return n2 + 2;
        }
        if (b || n > 0) {
            return n2 + 1;
        }
        return 0;
    }
    
    public static void formatDuration(final long n, final long n2, final PrintWriter printWriter) {
        if (n == 0L) {
            printWriter.print("--");
            return;
        }
        formatDuration(n - n2, printWriter, 0);
    }
    
    public static void formatDuration(final long n, final PrintWriter printWriter) {
        formatDuration(n, printWriter, 0);
    }
    
    public static void formatDuration(final long n, final PrintWriter printWriter, final int n2) {
        synchronized (TimeUtils.sFormatSync) {
            printWriter.print(new String(TimeUtils.sFormatStr, 0, formatDurationLocked(n, n2)));
        }
    }
    
    public static void formatDuration(final long n, final StringBuilder sb) {
        synchronized (TimeUtils.sFormatSync) {
            sb.append(TimeUtils.sFormatStr, 0, formatDurationLocked(n, 0));
        }
    }
    
    private static int formatDurationLocked(long n, final int n2) {
        if (TimeUtils.sFormatStr.length < n2) {
            TimeUtils.sFormatStr = new char[n2];
        }
        final char[] sFormatStr = TimeUtils.sFormatStr;
        if (n == 0L) {
            while (n2 - 1 < 0) {
                sFormatStr[0] = ' ';
            }
            sFormatStr[0] = '0';
            return 1;
        }
        char c;
        if (n > 0L) {
            c = '+';
        }
        else {
            n = -n;
            c = '-';
        }
        final int n3 = (int)(n % 1000L);
        int n4 = (int)Math.floor(n / 1000L);
        int n5 = 0;
        if (n4 > 86400) {
            n5 = n4 / 86400;
            n4 -= 86400 * n5;
        }
        int n8;
        int n9;
        if (n4 > 3600) {
            final int n6 = n4 / 3600;
            final int n7 = n4 - n6 * 3600;
            n8 = n6;
            n9 = n7;
        }
        else {
            n9 = n4;
            n8 = 0;
        }
        int n12;
        int n13;
        if (n9 > 60) {
            final int n10 = n9 / 60;
            final int n11 = n9 - n10 * 60;
            n12 = n10;
            n13 = n11;
        }
        else {
            n13 = n9;
            n12 = 0;
        }
        int n19;
        if (n2 != 0) {
            final int accumField = accumField(n5, 1, false, 0);
            final int n14 = accumField + accumField(n8, 1, accumField > 0, 2);
            final int n15 = n14 + accumField(n12, 1, n14 > 0, 2);
            final int n16 = n15 + accumField(n13, 1, n15 > 0, 2);
            int n17;
            if (n16 > 0) {
                n17 = 3;
            }
            else {
                n17 = 0;
            }
            final int n18 = n16 + (1 + accumField(n3, 2, true, n17));
            n19 = 0;
            int n20;
            for (int i = n18; i < n2; ++i, n19 = n20) {
                sFormatStr[n19] = ' ';
                n20 = n19 + 1;
            }
        }
        else {
            n19 = 0;
        }
        sFormatStr[n19] = c;
        final int n21 = n19 + 1;
        boolean b;
        if (n2 != 0) {
            b = true;
        }
        else {
            b = false;
        }
        final int printField = printField(sFormatStr, n5, 'd', n21, false, 0);
        final boolean b2 = printField != n21;
        int n22;
        if (b) {
            n22 = 2;
        }
        else {
            n22 = 0;
        }
        final int printField2 = printField(sFormatStr, n8, 'h', printField, b2, n22);
        final boolean b3 = printField2 != n21;
        int n23;
        if (b) {
            n23 = 2;
        }
        else {
            n23 = 0;
        }
        final int printField3 = printField(sFormatStr, n12, 'm', printField2, b3, n23);
        final boolean b4 = printField3 != n21;
        int n24;
        if (b) {
            n24 = 2;
        }
        else {
            n24 = 0;
        }
        final int printField4 = printField(sFormatStr, n13, 's', printField3, b4, n24);
        int n25;
        if (b && printField4 != n21) {
            n25 = 3;
        }
        else {
            n25 = 0;
        }
        final int printField5 = printField(sFormatStr, n3, 'm', printField4, true, n25);
        sFormatStr[printField5] = 's';
        return printField5 + 1;
    }
    
    private static int printField(final char[] array, final int n, final char c, int n2, final boolean b, final int n3) {
        if (b || n > 0) {
            int n5;
            int n6;
            if ((b && n3 >= 3) || n > 99) {
                final int n4 = n / 100;
                array[n2] = (char)(n4 + 48);
                n5 = n2 + 1;
                n6 = n - n4 * 100;
            }
            else {
                n5 = n2;
                n6 = n;
            }
            if ((b && n3 >= 2) || n6 > 9 || n2 != n5) {
                final int n7 = n6 / 10;
                array[n5] = (char)(n7 + 48);
                ++n5;
                n6 -= n7 * 10;
            }
            array[n5] = (char)(n6 + 48);
            final int n8 = n5 + 1;
            array[n8] = c;
            n2 = n8 + 1;
        }
        return n2;
    }
}
