import com.twitter.library.featureswitch.d;

// 
// Decompiled by Procyon v0.5.30
// 

public class fl
{
    public static int a() {
        int n = 2;
        final String[] array = new String[n];
        array[0] = "one_five";
        array[1] = "two_five";
        if (d.a("android_push_notification_disaggregation_2520", array)) {
            n = 3;
        }
        return n;
    }
    
    public static int b() {
        if (d.a("android_push_notification_disaggregation_2520", "one", "one_five")) {
            return 1;
        }
        if (d.a("android_push_notification_disaggregation_2520", "two", "two_five")) {
            return 2;
        }
        if (d.a("android_push_notification_disaggregation_2520", new String[] { "three" })) {
            return 3;
        }
        return 0;
    }
}
