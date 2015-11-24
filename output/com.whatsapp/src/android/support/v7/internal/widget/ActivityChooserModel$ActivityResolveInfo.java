// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import java.math.BigDecimal;
import android.content.pm.ResolveInfo;

public final class ActivityChooserModel$ActivityResolveInfo implements Comparable
{
    private static final String[] z;
    public final ResolveInfo resolveInfo;
    final ActivityChooserModel this$0;
    public float weight;
    
    static {
        final String[] z2 = new String[2];
        String s = ",\u001fD1}(\u001f~0w1@";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0011';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = 'z';
                        break;
                    }
                    case 2: {
                        c2 = '7';
                        break;
                    }
                    case 3: {
                        c2 = '^';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "eZ@;x9\u0012Cd";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ActivityChooserModel$ActivityResolveInfo(final ActivityChooserModel this$0, final ResolveInfo resolveInfo) {
        this.this$0 = this$0;
        this.resolveInfo = resolveInfo;
    }
    
    public int compareTo(final ActivityChooserModel$ActivityResolveInfo activityChooserModel$ActivityResolveInfo) {
        return Float.floatToIntBits(activityChooserModel$ActivityResolveInfo.weight) - Float.floatToIntBits(this.weight);
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.compareTo((ActivityChooserModel$ActivityResolveInfo)o);
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
            if (Float.floatToIntBits(this.weight) != Float.floatToIntBits(((ActivityChooserModel$ActivityResolveInfo)o).weight)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 + Float.floatToIntBits(this.weight);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(ActivityChooserModel$ActivityResolveInfo.z[0]).append(this.resolveInfo.toString());
        sb.append(ActivityChooserModel$ActivityResolveInfo.z[1]).append(new BigDecimal(this.weight));
        sb.append("]");
        return sb.toString();
    }
}
