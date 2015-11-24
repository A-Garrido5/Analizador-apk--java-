import android.text.Editable;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;

// 
// Decompiled by Procyon v0.5.30
// 

public class f
{
    public static String a(final String s, final int n) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)s);
        PhoneNumberUtils.formatNumber((Editable)spannableStringBuilder, n);
        return spannableStringBuilder.toString();
    }
}
