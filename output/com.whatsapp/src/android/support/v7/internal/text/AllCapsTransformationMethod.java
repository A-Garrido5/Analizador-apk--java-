// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.text;

import android.graphics.Rect;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import java.util.Locale;
import android.text.method.TransformationMethod;

public class AllCapsTransformationMethod implements TransformationMethod
{
    public static int a;
    private Locale mLocale;
    
    public AllCapsTransformationMethod(final Context context) {
        final int a = AllCapsTransformationMethod.a;
        this.mLocale = context.getResources().getConfiguration().locale;
        if (a != 0) {
            AppCompatActivity.b = !AppCompatActivity.b;
        }
    }
    
    public CharSequence getTransformation(final CharSequence charSequence, final View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.mLocale);
        }
        return null;
    }
    
    public void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
    }
}
