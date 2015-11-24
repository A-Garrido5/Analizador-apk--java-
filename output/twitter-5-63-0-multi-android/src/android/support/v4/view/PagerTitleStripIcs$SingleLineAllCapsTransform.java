// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.View;
import android.content.Context;
import java.util.Locale;
import android.text.method.SingleLineTransformationMethod;

class PagerTitleStripIcs$SingleLineAllCapsTransform extends SingleLineTransformationMethod
{
    private static final String TAG = "SingleLineAllCapsTransform";
    private Locale mLocale;
    
    public PagerTitleStripIcs$SingleLineAllCapsTransform(final Context context) {
        this.mLocale = context.getResources().getConfiguration().locale;
    }
    
    public CharSequence getTransformation(final CharSequence charSequence, final View view) {
        final CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.mLocale);
        }
        return null;
    }
}
