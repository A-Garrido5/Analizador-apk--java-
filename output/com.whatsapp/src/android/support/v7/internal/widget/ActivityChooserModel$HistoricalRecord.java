// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import java.math.BigDecimal;
import android.content.ComponentName;

public final class ActivityChooserModel$HistoricalRecord
{
    private static final String[] z;
    public final ComponentName activity;
    public final long time;
    public final float weight;
    
    static {
        final String[] z2 = new String[3];
        String s = "f3Qm\u001e:{R2";
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
                        c2 = 'w';
                        break;
                    }
                    case 0: {
                        c2 = ']';
                        break;
                    }
                    case 1: {
                        c2 = '\u0013';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "f3Ra\u001a8)";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "f3Gk\u00034eO|\u000eg";
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
    
    public ActivityChooserModel$HistoricalRecord(final ComponentName activity, final long time, final float weight) {
        this.activity = activity;
        this.time = time;
        this.weight = weight;
    }
    
    public ActivityChooserModel$HistoricalRecord(final String s, final long n, final float n2) {
        this(ComponentName.unflattenFromString(s), n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            final ActivityChooserModel$HistoricalRecord activityChooserModel$HistoricalRecord = (ActivityChooserModel$HistoricalRecord)o;
            if (this.activity == null) {
                if (activityChooserModel$HistoricalRecord.activity != null) {
                    return false;
                }
            }
            else if (!this.activity.equals((Object)activityChooserModel$HistoricalRecord.activity)) {
                return false;
            }
            if (this.time != activityChooserModel$HistoricalRecord.time) {
                return false;
            }
            if (Float.floatToIntBits(this.weight) != Float.floatToIntBits(activityChooserModel$HistoricalRecord.weight)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.activity == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.activity.hashCode();
        }
        return 31 * (31 * (hashCode + 31) + (int)(this.time ^ this.time >>> 32)) + Float.floatToIntBits(this.weight);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(ActivityChooserModel$HistoricalRecord.z[2]).append(this.activity);
        sb.append(ActivityChooserModel$HistoricalRecord.z[1]).append(this.time);
        sb.append(ActivityChooserModel$HistoricalRecord.z[0]).append(new BigDecimal(this.weight));
        sb.append("]");
        return sb.toString();
    }
}
