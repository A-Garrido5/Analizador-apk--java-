import java.util.Date;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bk;
import java.util.Calendar;
import android.content.res.Resources;
import com.twitter.library.api.ExtendedProfile;

// 
// Decompiled by Procyon v0.5.30
// 

public class pi
{
    public static String a(final ExtendedProfile extendedProfile, final Resources resources) {
        final int mBirthYear = extendedProfile.mBirthYear;
        final int mBirthMonth = extendedProfile.mBirthMonth;
        final int mBirthDay = extendedProfile.mBirthDay;
        boolean b;
        if (mBirthMonth != 0 && mBirthDay != 0) {
            b = true;
        }
        else {
            b = false;
        }
        if (mBirthYear == 0) {
            final String format = null;
            if (!b) {
                return format;
            }
        }
        String format;
        if (!b) {
            format = String.format("%d", mBirthYear);
        }
        else {
            final Calendar instance = Calendar.getInstance();
            instance.set(mBirthYear, mBirthMonth - 1, mBirthDay);
            if (mBirthYear != 0) {
                return bk.e(resources, instance.getTimeInMillis());
            }
            return bk.d(resources, instance.getTimeInMillis());
        }
        return format;
    }
    
    public static boolean a() {
        return d.f("profile_birthday_delight_enabled");
    }
    
    public static boolean a(final ExtendedProfile extendedProfile, final Date time) {
        final int mBirthMonth = extendedProfile.mBirthMonth;
        final int mBirthDay = extendedProfile.mBirthDay;
        boolean b = false;
        if (mBirthMonth != 0) {
            b = false;
            if (mBirthDay != 0) {
                final Calendar instance = Calendar.getInstance();
                instance.setTime(time);
                final int value = instance.get(5);
                b = false;
                if (value == mBirthDay) {
                    final int value2 = instance.get(2);
                    final int n = mBirthMonth - 1;
                    b = false;
                    if (value2 == n) {
                        b = true;
                    }
                }
            }
        }
        return b;
    }
    
    public static boolean b() {
        return d.f("profile_birthday_display_enabled");
    }
}
