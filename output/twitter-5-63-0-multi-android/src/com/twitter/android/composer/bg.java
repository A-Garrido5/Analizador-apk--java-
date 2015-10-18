// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.library.client.Session;
import java.io.Serializable;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.featureswitch.d;
import com.twitter.library.platform.f;
import com.twitter.library.client.az;
import com.twitter.errorreporter.a;
import com.twitter.library.api.geo.GeoTag;
import android.widget.TextView;
import com.twitter.android.widget.ToggleImageButton;
import android.content.Context;

public final class bg
{
    private static void a(final Context context, final ToggleImageButton toggleImageButton, final TextView textView, final GeoTag geoTag, final boolean b, final boolean b2) {
        boolean b3 = true;
        final sl a = sk.a();
        final a a2 = new a().a("appLocationEnabled", a.d()).a("systemLocationEnabled", a.e()).a("webSettingsGeoTagEnabled", a.b(az.a(context).b())).a("sessionNonNull", az.a(context).b() != null && b3).a("googlePlayServicesEnabled", f.a(context) && d.f("geo_data_provider_google_play_services_enabled") && b3).a("geoTagNonNull", geoTag != null && b3).a("coordinateNonNull", geoTag != null && geoTag.b() != null && b3);
        Serializable value;
        if (textView != null) {
            value = (textView.getVisibility() == 0 && b3);
        }
        else {
            value = "null";
        }
        final a a3 = a2.a("locationTextViewVisible", value).a("locationTextSameAsPlaceName", textView != null && geoTag != null && textView.getText().equals(geoTag.a().fullName) && b3).a("geoTagButtonVisible", toggleImageButton != null && toggleImageButton.getVisibility() == 0 && b3);
        if (toggleImageButton == null || !toggleImageButton.b()) {
            b3 = false;
        }
        ErrorReporter.a(a3.a("geoTagButtonToggledOn", b3).a("isLifelineAlertActive", b).a("isPreciseGeoTagEnabled", b2).a(new IllegalStateException("Inconsistent geo tag state detected.")));
    }
    
    static boolean a(final Context context, final sl sl, final ToggleImageButton toggleImageButton, final TextView textView, final GeoTag geoTag, final boolean b, final boolean b2) {
        final boolean b3 = b(context, sl, toggleImageButton, textView, geoTag, b, b2);
        if (!b3) {
            a(context, toggleImageButton, textView, geoTag, b2, b);
        }
        return b3;
    }
    
    static boolean b(final Context context, final sl sl, final ToggleImageButton toggleImageButton, final TextView textView, final GeoTag geoTag, final boolean b, final boolean b2) {
        if (geoTag != null) {
            boolean b3;
            if (toggleImageButton != null && toggleImageButton.getVisibility() == 0 && toggleImageButton.b() && textView != null && textView.getVisibility() == 0 && (b2 || textView.getText().equals(geoTag.a().fullName))) {
                b3 = true;
            }
            else {
                b3 = false;
            }
            boolean b4;
            if (geoTag.b() == null != b) {
                b4 = true;
            }
            else {
                b4 = false;
            }
            final Session b5 = az.a(context).b();
            if (!b3 || !b4 || !sl.a(b5)) {
                return false;
            }
        }
        return true;
    }
}
