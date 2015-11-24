// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.graphics.drawable.LayerDrawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.support.v4.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.appcompat.R$attr;
import android.content.Context;
import android.support.v7.appcompat.R$drawable;
import android.os.Build$VERSION;
import android.util.SparseArray;
import android.content.res.ColorStateList;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import android.graphics.PorterDuff$Mode;

public final class TintManager
{
    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY;
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED;
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL;
    private static final TintManager$ColorFilterLruCache COLOR_FILTER_CACHE;
    private static final PorterDuff$Mode DEFAULT_MODE;
    private static final WeakHashMap INSTANCE_CACHE;
    public static final boolean SHOULD_BE_USED;
    private static final int[] TINT_COLOR_CONTROL_NORMAL;
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST;
    private final WeakReference mContextRef;
    private ColorStateList mDefaultColorStateList;
    private SparseArray mTintLists;
    
    static {
        SHOULD_BE_USED = (Build$VERSION.SDK_INT < 21);
        DEFAULT_MODE = PorterDuff$Mode.SRC_IN;
        INSTANCE_CACHE = new WeakHashMap();
        COLOR_FILTER_CACHE = new TintManager$ColorFilterLruCache(6);
        COLORFILTER_TINT_COLOR_CONTROL_NORMAL = new int[] { R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha };
        TINT_COLOR_CONTROL_NORMAL = new int[] { R$drawable.abc_ic_ab_back_mtrl_am_alpha, R$drawable.abc_ic_go_search_api_mtrl_alpha, R$drawable.abc_ic_search_api_mtrl_alpha, R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_ic_clear_mtrl_alpha, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha, R$drawable.abc_ic_menu_moreoverflow_mtrl_alpha, R$drawable.abc_ic_voice_search_api_mtrl_alpha };
        COLORFILTER_COLOR_CONTROL_ACTIVATED = new int[] { R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_mtrl_alpha };
        COLORFILTER_COLOR_BACKGROUND_MULTIPLY = new int[] { R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult };
        TINT_COLOR_CONTROL_STATE_LIST = new int[] { R$drawable.abc_edit_text_material, R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material, R$drawable.abc_spinner_mtrl_am_alpha, R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material, R$drawable.abc_spinner_textfield_background_material, R$drawable.abc_ratingbar_full_material, R$drawable.abc_switch_track_mtrl_alpha, R$drawable.abc_switch_thumb_material, R$drawable.abc_btn_default_mtrl_shape, R$drawable.abc_btn_borderless_material };
    }
    
    private TintManager(final Context context) {
        this.mContextRef = new WeakReference((T)context);
    }
    
    private static boolean arrayContains(final int[] array, final int n) {
        final int i = AdapterViewCompat.a;
        final int length = array.length;
        int n2 = 0;
        do {
            boolean b = false;
            if (n2 < length) {
                if (array[n2] != n) {
                    ++n2;
                    continue;
                }
                b = true;
            }
            return b;
        } while (i == 0);
        return false;
    }
    
    private ColorStateList createButtonColorStateList(final Context context) {
        final int[][] array = new int[4][];
        final int[] array2 = new int[4];
        final int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R$attr.colorButtonNormal);
        final int themeAttrColor2 = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlHighlight);
        array[0] = ThemeUtils.DISABLED_STATE_SET;
        array2[0] = ThemeUtils.getDisabledThemeAttrColor(context, R$attr.colorButtonNormal);
        array[1] = ThemeUtils.PRESSED_STATE_SET;
        array2[1] = ColorUtils.compositeColors(themeAttrColor2, themeAttrColor);
        array[2] = ThemeUtils.FOCUSED_STATE_SET;
        array2[2] = ColorUtils.compositeColors(themeAttrColor2, themeAttrColor);
        array[3] = ThemeUtils.EMPTY_STATE_SET;
        array2[3] = themeAttrColor;
        return new ColorStateList(array, array2);
    }
    
    private ColorStateList createEditTextColorStateList(final Context context) {
        final int[][] array = new int[3][];
        final int[] array2 = new int[3];
        array[0] = ThemeUtils.DISABLED_STATE_SET;
        array2[0] = ThemeUtils.getDisabledThemeAttrColor(context, R$attr.colorControlNormal);
        array[1] = ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET;
        array2[1] = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlNormal);
        array[2] = ThemeUtils.EMPTY_STATE_SET;
        array2[2] = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlActivated);
        return new ColorStateList(array, array2);
    }
    
    private ColorStateList createSpinnerColorStateList(final Context context) {
        final int[][] array = new int[3][];
        final int[] array2 = new int[3];
        array[0] = ThemeUtils.DISABLED_STATE_SET;
        array2[0] = ThemeUtils.getDisabledThemeAttrColor(context, R$attr.colorControlNormal);
        array[1] = ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET;
        array2[1] = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlNormal);
        array[2] = ThemeUtils.EMPTY_STATE_SET;
        array2[2] = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlActivated);
        return new ColorStateList(array, array2);
    }
    
    private ColorStateList createSwitchThumbColorStateList(final Context context) {
        int n = 3;
        final int[][] array = new int[n][];
        final int[] array2 = new int[n];
        final ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, R$attr.colorSwitchThumbNormal);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            array[0] = ThemeUtils.DISABLED_STATE_SET;
            array2[0] = themeAttrColorStateList.getColorForState(array[0], 0);
            array[1] = ThemeUtils.CHECKED_STATE_SET;
            array2[1] = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlActivated);
            array[2] = ThemeUtils.EMPTY_STATE_SET;
            array2[2] = themeAttrColorStateList.getDefaultColor();
            if (AdapterViewCompat.a == 0) {
                return new ColorStateList(array, array2);
            }
        }
        else {
            n = 0;
        }
        array[n] = ThemeUtils.DISABLED_STATE_SET;
        array2[n] = ThemeUtils.getDisabledThemeAttrColor(context, R$attr.colorSwitchThumbNormal);
        final int n2 = n + 1;
        array[n2] = ThemeUtils.CHECKED_STATE_SET;
        array2[n2] = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlActivated);
        final int n3 = n2 + 1;
        array[n3] = ThemeUtils.EMPTY_STATE_SET;
        array2[n3] = ThemeUtils.getThemeAttrColor(context, R$attr.colorSwitchThumbNormal);
        return new ColorStateList(array, array2);
    }
    
    private ColorStateList createSwitchTrackColorStateList(final Context context) {
        final int[][] array = new int[3][];
        final int[] array2 = new int[3];
        array[0] = ThemeUtils.DISABLED_STATE_SET;
        array2[0] = ThemeUtils.getThemeAttrColor(context, 16842800, 0.1f);
        array[1] = ThemeUtils.CHECKED_STATE_SET;
        array2[1] = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlActivated, 0.3f);
        array[2] = ThemeUtils.EMPTY_STATE_SET;
        array2[2] = ThemeUtils.getThemeAttrColor(context, 16842800, 0.3f);
        return new ColorStateList(array, array2);
    }
    
    public static TintManager get(final Context context) {
        TintManager tintManager = TintManager.INSTANCE_CACHE.get(context);
        if (tintManager == null) {
            tintManager = new TintManager(context);
            TintManager.INSTANCE_CACHE.put(context, tintManager);
        }
        return tintManager;
    }
    
    private ColorStateList getDefaultColorStateList(final Context context) {
        if (this.mDefaultColorStateList == null) {
            final int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlNormal);
            final int themeAttrColor2 = ThemeUtils.getThemeAttrColor(context, R$attr.colorControlActivated);
            final int[][] array = new int[7][];
            final int[] array2 = new int[7];
            array[0] = ThemeUtils.DISABLED_STATE_SET;
            array2[0] = ThemeUtils.getDisabledThemeAttrColor(context, R$attr.colorControlNormal);
            array[1] = ThemeUtils.FOCUSED_STATE_SET;
            array2[1] = themeAttrColor2;
            array[2] = ThemeUtils.ACTIVATED_STATE_SET;
            array2[2] = themeAttrColor2;
            array[3] = ThemeUtils.PRESSED_STATE_SET;
            array2[3] = themeAttrColor2;
            array[4] = ThemeUtils.CHECKED_STATE_SET;
            array2[4] = themeAttrColor2;
            array[5] = ThemeUtils.SELECTED_STATE_SET;
            array2[5] = themeAttrColor2;
            array[6] = ThemeUtils.EMPTY_STATE_SET;
            array2[6] = themeAttrColor;
            this.mDefaultColorStateList = new ColorStateList(array, array2);
        }
        return this.mDefaultColorStateList;
    }
    
    public static Drawable getDrawable(final Context context, final int n) {
        if (isInTintList(n)) {
            return get(context).getDrawable(n);
        }
        return ContextCompat.getDrawable(context, n);
    }
    
    private static boolean isInTintList(final int n) {
        return arrayContains(TintManager.TINT_COLOR_CONTROL_NORMAL, n) || arrayContains(TintManager.COLORFILTER_TINT_COLOR_CONTROL_NORMAL, n) || arrayContains(TintManager.COLORFILTER_COLOR_CONTROL_ACTIVATED, n) || arrayContains(TintManager.TINT_COLOR_CONTROL_STATE_LIST, n) || arrayContains(TintManager.COLORFILTER_COLOR_BACKGROUND_MULTIPLY, n) || n == R$drawable.abc_cab_background_top_material;
    }
    
    private static void setPorterDuffColorFilter(final Drawable drawable, final int n, PorterDuff$Mode default_MODE) {
        if (default_MODE == null) {
            default_MODE = TintManager.DEFAULT_MODE;
        }
        PorterDuffColorFilter value = TintManager.COLOR_FILTER_CACHE.get(n, default_MODE);
        if (value == null) {
            value = new PorterDuffColorFilter(n, default_MODE);
            TintManager.COLOR_FILTER_CACHE.put(n, default_MODE, value);
        }
        drawable.setColorFilter((ColorFilter)value);
    }
    
    public static void tintViewBackground(final View view, final TintInfo tintInfo) {
        final Drawable background = view.getBackground();
        Label_0061: {
            if (tintInfo.mHasTintList) {
                final int colorForState = tintInfo.mTintList.getColorForState(view.getDrawableState(), tintInfo.mTintList.getDefaultColor());
                PorterDuff$Mode mTintMode;
                if (tintInfo.mHasTintMode) {
                    mTintMode = tintInfo.mTintMode;
                }
                else {
                    mTintMode = null;
                }
                setPorterDuffColorFilter(background, colorForState, mTintMode);
                if (AdapterViewCompat.a == 0) {
                    break Label_0061;
                }
            }
            background.clearColorFilter();
        }
        if (Build$VERSION.SDK_INT <= 10) {
            view.invalidate();
        }
    }
    
    public Drawable getDrawable(final int n) {
        return this.getDrawable(n, false);
    }
    
    public Drawable getDrawable(final int n, final boolean b) {
        final Context context = (Context)this.mContextRef.get();
        if (context == null) {
            return null;
        }
        Drawable drawable = ContextCompat.getDrawable(context, n);
        if (drawable != null) {
            if (Build$VERSION.SDK_INT >= 8) {
                drawable = drawable.mutate();
            }
            final ColorStateList tintList = this.getTintList(n);
            if (tintList != null) {
                drawable = DrawableCompat.wrap(drawable);
                DrawableCompat.setTintList(drawable, tintList);
                final PorterDuff$Mode tintMode = this.getTintMode(n);
                if (tintMode != null) {
                    DrawableCompat.setTintMode(drawable, tintMode);
                }
                if (AdapterViewCompat.a == 0) {
                    return drawable;
                }
            }
            if (n == R$drawable.abc_cab_background_top_material) {
                return (Drawable)new LayerDrawable(new Drawable[] { this.getDrawable(R$drawable.abc_cab_background_internal_bg), this.getDrawable(R$drawable.abc_cab_background_top_mtrl_alpha) });
            }
            if (!this.tintDrawableUsingColorFilter(n, drawable) && b) {
                drawable = null;
            }
        }
        return drawable;
    }
    
    public final ColorStateList getTintList(final int n) {
        final int a = AdapterViewCompat.a;
        final Context context = (Context)this.mContextRef.get();
        ColorStateList list = null;
        if (context != null) {
            final SparseArray mTintLists = this.mTintLists;
            list = null;
            if (mTintLists != null) {
                list = (ColorStateList)this.mTintLists.get(n);
            }
            if (list == null) {
                Label_0201: {
                    if (n == R$drawable.abc_edit_text_material) {
                        list = this.createEditTextColorStateList(context);
                        if (a == 0) {
                            break Label_0201;
                        }
                    }
                    if (n == R$drawable.abc_switch_track_mtrl_alpha) {
                        list = this.createSwitchTrackColorStateList(context);
                        if (a == 0) {
                            break Label_0201;
                        }
                    }
                    if (n == R$drawable.abc_switch_thumb_material) {
                        list = this.createSwitchThumbColorStateList(context);
                        if (a == 0) {
                            break Label_0201;
                        }
                    }
                    if (n == R$drawable.abc_btn_default_mtrl_shape || n == R$drawable.abc_btn_borderless_material) {
                        list = this.createButtonColorStateList(context);
                        if (a == 0) {
                            break Label_0201;
                        }
                    }
                    if (n == R$drawable.abc_spinner_mtrl_am_alpha || n == R$drawable.abc_spinner_textfield_background_material) {
                        list = this.createSpinnerColorStateList(context);
                        if (a == 0) {
                            break Label_0201;
                        }
                    }
                    if (arrayContains(TintManager.TINT_COLOR_CONTROL_NORMAL, n)) {
                        list = ThemeUtils.getThemeAttrColorStateList(context, R$attr.colorControlNormal);
                        if (a == 0) {
                            break Label_0201;
                        }
                    }
                    if (arrayContains(TintManager.TINT_COLOR_CONTROL_STATE_LIST, n)) {
                        list = this.getDefaultColorStateList(context);
                    }
                }
                if (list != null) {
                    if (this.mTintLists == null) {
                        this.mTintLists = new SparseArray();
                    }
                    this.mTintLists.append(n, (Object)list);
                    return list;
                }
            }
        }
        return list;
    }
    
    final PorterDuff$Mode getTintMode(final int n) {
        final int abc_switch_thumb_material = R$drawable.abc_switch_thumb_material;
        PorterDuff$Mode multiply = null;
        if (n == abc_switch_thumb_material) {
            multiply = PorterDuff$Mode.MULTIPLY;
        }
        return multiply;
    }
    
    public final boolean tintDrawableUsingColorFilter(final int n, final Drawable drawable) {
        final int a = AdapterViewCompat.a;
        final Context context = (Context)this.mContextRef.get();
        if (context != null) {
            while (true) {
                int n2 = 0;
                Label_0175: {
                    int n3;
                    if (arrayContains(TintManager.COLORFILTER_TINT_COLOR_CONTROL_NORMAL, n)) {
                        n2 = R$attr.colorControlNormal;
                        if (a == 0) {
                            break Label_0175;
                        }
                        n3 = 1;
                    }
                    else {
                        n2 = 0;
                        n3 = 0;
                    }
                    if (arrayContains(TintManager.COLORFILTER_COLOR_CONTROL_ACTIVATED, n)) {
                        n2 = R$attr.colorControlActivated;
                        if (a == 0) {
                            break Label_0175;
                        }
                        n3 = 1;
                    }
                    int n4;
                    PorterDuff$Mode porterDuff$Mode;
                    int n5;
                    int round;
                    if (arrayContains(TintManager.COLORFILTER_COLOR_BACKGROUND_MULTIPLY, n)) {
                        final PorterDuff$Mode multiply = PorterDuff$Mode.MULTIPLY;
                        n4 = 1;
                        porterDuff$Mode = multiply;
                        n5 = 16842801;
                        round = -1;
                    }
                    else if (n == R$drawable.abc_list_divider_mtrl_alpha) {
                        n5 = 16842800;
                        round = Math.round(40.8f);
                        n4 = 1;
                        porterDuff$Mode = null;
                    }
                    else {
                        n4 = n3;
                        n5 = n2;
                        round = -1;
                        porterDuff$Mode = null;
                    }
                    if (n4 != 0) {
                        setPorterDuffColorFilter(drawable, ThemeUtils.getThemeAttrColor(context, n5), porterDuff$Mode);
                        if (round != -1) {
                            drawable.setAlpha(round);
                        }
                        return true;
                    }
                    return false;
                }
                int n5 = n2;
                int n4 = 1;
                int round = -1;
                PorterDuff$Mode porterDuff$Mode = null;
                continue;
            }
        }
        return false;
    }
}
