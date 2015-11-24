// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v7.appcompat.R$id;
import android.view.ViewGroup;
import java.util.List;
import android.content.res.Resources;
import java.io.FileNotFoundException;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.Resources$NotFoundException;
import android.support.v4.content.ContextCompat;
import android.net.Uri;
import android.database.Cursor;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.text.style.TextAppearanceSpan;
import android.text.SpannableString;
import android.support.v7.appcompat.R$attr;
import android.util.TypedValue;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.app.SearchableInfo;
import android.content.Context;
import java.util.WeakHashMap;
import android.view.View$OnClickListener;
import android.support.v4.widget.ResourceCursorAdapter;

class SuggestionsAdapter extends ResourceCursorAdapter implements View$OnClickListener
{
    private static final String[] z;
    private boolean mClosed;
    private final int mCommitIconResId;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private final WeakHashMap mOutsideDrawablesCache;
    private final Context mProviderContext;
    private int mQueryRefinement;
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;
    
    static {
        final String[] z2 = new String[46];
        String s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1182:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = '\u001a';
                        break;
                    }
                    case 1: {
                        c2 = '/';
                        break;
                    }
                    case 2: {
                        c2 = '\u0006';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "N]o\u0018i:[i]nrNh\u001ah:Ls\u000f~u]&\u001cknJt]l~Nv\thh\u000fq\u001c~:Lj\u0012~\u007fK(";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "iZa\u001ahi[Y\u0014nuAYL";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "iZa\u001ahi[Y\u0014nuAYO";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "iZa\u001ahi[Y\thb[YORo]j";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "iZa\u001ahi[Y\thb[YL";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "\u007f]t\u0012\u007f:Ln\u001cc}Fh\u001a-yZt\u000ebh\u000fg\u0013i:Lg\u001eesAa]nuCs\u0010ci";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "iZa\u001ahi[Y\thb[YO";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "iZa\u001ahi[Y\u001ba{Hu";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "SAp\u001casK&\u0014nuA&\u000fhi@s\u000fn\u007f\u000f";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = ":Ii\u000f-";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 12;
                    n2 = 13;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    array = z2;
                    s = "{Ab\u000fbsK(\u000fhi@s\u000fn\u007f";
                    n = 13;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\\No\u0011h~\u000fr\u0012-u_c\u0013-";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "_]t\u0012\u007f:Lj\u0012~sAa]dy@h]~n]c\u001c`:Ii\u000f-";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "HJu\u0012xhLc]iuJu]cu[&\u0018us\\rG-";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "SLi\u0013-t@r]kuZh\u00197:";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "6\u000f";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "_]t\u0012\u007f:Lj\u0012~sAa]dy@h]~n]c\u001c`:Ii\u000f-";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "sAY\r\u007fuHt\u0018~i";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "{Ab\u000fbsK(\u000fhi@s\u000fn\u007f\u0015)R";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    s = "SLi\u0013-hJu\u0012xhLc]cu[&\u001bboAbG-";
                    n = 25;
                    n2 = 26;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    array = z2;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 26;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "IJg\u000fnr\u000fu\bj}Ju\tduAu]no]u\u0012\u007f:[n\u000fhm\u000fc\u0005n\u007f_r\u0014bt\u0001";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "IJg\u000fnr\u000fu\bj}Ju\tduAu]|oJt\u0004-nGt\u0018z:Nh]hbLc\rys@hS";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "T@&\u001cxnGi\u000fdnV<]";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "T@&\rlyDg\u001ah:Ii\bc~\u000f`\u0012\u007f:Ns\teu]o\tt \u000f";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "T@&\u000fhi@s\u000fn\u007f\u000f`\u0012xtK&\u001bbh\u0015&";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "T@&\rlnG<]";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "IFh\u001aa\u007f\u000fv\u001cyr\u000fu\u0018jwJh\t-s\\&\u0013bn\u000fg]\u007f\u007f\\i\b\u007fyJ&4I \u000f";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "W@t\u0018-nGg\u0013-nXi]}{[n]~\u007fHk\u0018cn\\<]";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "iZa\u001ahi[Y\u0014cnJh\tRkZc\u000ft";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "iZa\u001ahi[Y\u0014cnJh\tR~Nr\u001c";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "iZa\u001ahi[Y\thb[YL";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "iJg\u000fnrpu\bj}Ju\tRkZc\u000ft";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "vFk\u0014y";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "y@h\tht[";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "oAc\u0005}\u007fLr\u0018i:Jt\u000fbh\u000ft\u0018yhFc\u000bdtH&\u000blvFb]nuCs\u0010c:It\u0012`:Ls\u000f~u]*]isK&\te\u007f\u000ft\u0018`u[c]}h@e\u0018~i\u000fb\u0014h%";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "IZa\u001ahi[o\u0012cinb\u001c}nJt";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    break Label_1182;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private Drawable checkIconCache(final String s) {
        final Drawable$ConstantState drawable$ConstantState = this.mOutsideDrawablesCache.get(s);
        if (drawable$ConstantState == null) {
            return null;
        }
        return drawable$ConstantState.newDrawable();
    }
    
    private CharSequence formatUrl(final CharSequence charSequence) {
        if (this.mUrlColor == null) {
            final TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(R$attr.textColorSearchUrl, typedValue, true);
            this.mUrlColor = this.mContext.getResources().getColorStateList(typedValue.resourceId);
        }
        final SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan((Object)new TextAppearanceSpan((String)null, 0, 0, this.mUrlColor, (ColorStateList)null), 0, charSequence.length(), 33);
        return (CharSequence)spannableString;
    }
    
    private Drawable getActivityIcon(final ComponentName componentName) {
        final PackageManager packageManager = this.mContext.getPackageManager();
        ActivityInfo activityInfo;
        int iconResource;
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.w(SuggestionsAdapter.z[10], ex.toString());
            return null;
        }
        final Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable == null) {
            try {
                Log.w(SuggestionsAdapter.z[13], SuggestionsAdapter.z[11] + iconResource + SuggestionsAdapter.z[12] + componentName.flattenToShortString());
                return null;
            }
            catch (PackageManager$NameNotFoundException ex2) {
                throw ex2;
            }
        }
        return drawable;
    }
    
    private Drawable getActivityIconWithCache(final ComponentName componentName) {
        final String flattenToShortString = componentName.flattenToShortString();
        if (!this.mOutsideDrawablesCache.containsKey(flattenToShortString)) {
            final Drawable activityIcon = this.getActivityIcon(componentName);
            Drawable$ConstantState constantState = null;
            if (activityIcon != null) {
                constantState = activityIcon.getConstantState();
            }
            this.mOutsideDrawablesCache.put(flattenToShortString, constantState);
            return activityIcon;
        }
        final Drawable$ConstantState drawable$ConstantState = this.mOutsideDrawablesCache.get(flattenToShortString);
        if (drawable$ConstantState == null) {
            return null;
        }
        return drawable$ConstantState.newDrawable(this.mProviderContext.getResources());
    }
    
    public static String getColumnString(final Cursor cursor, final String s) {
        return getStringOrNull(cursor, cursor.getColumnIndex(s));
    }
    
    private Drawable getDefaultIcon1(final Cursor cursor) {
        final Drawable activityIconWithCache = this.getActivityIconWithCache(this.mSearchable.getSearchActivity());
        if (activityIconWithCache != null) {
            return activityIconWithCache;
        }
        return this.mContext.getPackageManager().getDefaultActivityIcon();
    }
    
    private Drawable getDrawable(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //     4: astore          4
        //     6: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //     9: bipush          14
        //    11: aaload         
        //    12: aload           4
        //    14: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    17: istore          5
        //    19: iload           5
        //    21: ifeq            119
        //    24: aload_0        
        //    25: aload_1        
        //    26: invokevirtual   android/support/v7/widget/SuggestionsAdapter.getDrawableFromResourceUri:(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
        //    29: astore          15
        //    31: aload           15
        //    33: areturn        
        //    34: astore          14
        //    36: new             Ljava/io/FileNotFoundException;
        //    39: dup            
        //    40: new             Ljava/lang/StringBuilder;
        //    43: dup            
        //    44: invokespecial   java/lang/StringBuilder.<init>:()V
        //    47: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //    50: bipush          17
        //    52: aaload         
        //    53: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    56: aload_1        
        //    57: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    60: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    63: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //    66: athrow         
        //    67: astore_2       
        //    68: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //    71: bipush          22
        //    73: aaload         
        //    74: new             Ljava/lang/StringBuilder;
        //    77: dup            
        //    78: invokespecial   java/lang/StringBuilder.<init>:()V
        //    81: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //    84: bipush          18
        //    86: aaload         
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: aload_1        
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    94: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //    97: bipush          20
        //    99: aaload         
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: aload_2        
        //   104: invokevirtual   java/io/FileNotFoundException.getMessage:()Ljava/lang/String;
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   113: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   116: pop            
        //   117: aconst_null    
        //   118: areturn        
        //   119: aload_0        
        //   120: getfield        android/support/v7/widget/SuggestionsAdapter.mProviderContext:Landroid/content/Context;
        //   123: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   126: aload_1        
        //   127: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   130: astore          6
        //   132: aload           6
        //   134: ifnonnull       173
        //   137: new             Ljava/io/FileNotFoundException;
        //   140: dup            
        //   141: new             Ljava/lang/StringBuilder;
        //   144: dup            
        //   145: invokespecial   java/lang/StringBuilder.<init>:()V
        //   148: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //   151: bipush          15
        //   153: aaload         
        //   154: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   157: aload_1        
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   164: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   167: athrow         
        //   168: astore          13
        //   170: aload           13
        //   172: athrow         
        //   173: aload           6
        //   175: aconst_null    
        //   176: invokestatic    android/graphics/drawable/Drawable.createFromStream:(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
        //   179: astore          10
        //   181: aload           6
        //   183: invokevirtual   java/io/InputStream.close:()V
        //   186: aload           10
        //   188: areturn        
        //   189: astore          11
        //   191: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //   194: bipush          21
        //   196: aaload         
        //   197: new             Ljava/lang/StringBuilder;
        //   200: dup            
        //   201: invokespecial   java/lang/StringBuilder.<init>:()V
        //   204: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //   207: bipush          16
        //   209: aaload         
        //   210: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   213: aload_1        
        //   214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   217: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   220: aload           11
        //   222: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   225: pop            
        //   226: aload           10
        //   228: areturn        
        //   229: astore          7
        //   231: aload           6
        //   233: invokevirtual   java/io/InputStream.close:()V
        //   236: aload           7
        //   238: athrow         
        //   239: astore          8
        //   241: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //   244: bipush          19
        //   246: aaload         
        //   247: new             Ljava/lang/StringBuilder;
        //   250: dup            
        //   251: invokespecial   java/lang/StringBuilder.<init>:()V
        //   254: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //   257: bipush          23
        //   259: aaload         
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   263: aload_1        
        //   264: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   267: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   270: aload           8
        //   272: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   275: pop            
        //   276: goto            236
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      19     67     119    Ljava/io/FileNotFoundException;
        //  24     31     34     67     Landroid/content/res/Resources$NotFoundException;
        //  24     31     67     119    Ljava/io/FileNotFoundException;
        //  36     67     67     119    Ljava/io/FileNotFoundException;
        //  119    132    67     119    Ljava/io/FileNotFoundException;
        //  137    168    168    173    Landroid/content/res/Resources$NotFoundException;
        //  137    168    67     119    Ljava/io/FileNotFoundException;
        //  170    173    67     119    Ljava/io/FileNotFoundException;
        //  173    181    229    279    Any
        //  181    186    189    229    Ljava/io/IOException;
        //  181    186    67     119    Ljava/io/FileNotFoundException;
        //  191    226    67     119    Ljava/io/FileNotFoundException;
        //  231    236    239    279    Ljava/io/IOException;
        //  231    236    67     119    Ljava/io/FileNotFoundException;
        //  236    239    67     119    Ljava/io/FileNotFoundException;
        //  241    276    67     119    Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 132, Size: 132
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private Drawable getDrawableFromResourceValue(final String s) {
        if (s != null) {
            Label_0041: {
                try {
                    if (s.length() == 0) {
                        return null;
                    }
                    final String s2 = "0";
                    final String s3 = s;
                    final boolean b = s2.equals(s3);
                    if (b) {
                        return null;
                    }
                    break Label_0041;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                try {
                    final String s2 = "0";
                    final String s3 = s;
                    final boolean b = s2.equals(s3);
                    if (b) {
                        return null;
                    }
                }
                catch (NumberFormatException ex2) {
                    try {
                        throw ex2;
                    }
                    catch (NumberFormatException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final int int1 = Integer.parseInt(s);
                    final String string = SuggestionsAdapter.z[25] + this.mProviderContext.getPackageName() + "/" + int1;
                    final Drawable drawable = this.checkIconCache(string);
                    if (drawable == null) {
                        final Drawable drawable2 = ContextCompat.getDrawable(this.mProviderContext, int1);
                        this.storeInIconCache(string, drawable2);
                        return drawable2;
                    }
                    return drawable;
                }
                catch (NumberFormatException ex4) {
                    final Drawable drawable = this.checkIconCache(s);
                    if (drawable == null) {
                        final Drawable drawable3 = this.getDrawable(Uri.parse(s));
                        this.storeInIconCache(s, drawable3);
                        return drawable3;
                    }
                    return drawable;
                }
                catch (Resources$NotFoundException ex5) {
                    Log.w(SuggestionsAdapter.z[27], SuggestionsAdapter.z[26] + s);
                    return null;
                }
            }
        }
        return null;
    }
    
    private Drawable getIcon1(final Cursor cursor) {
        while (true) {
            try {
                if (this.mIconName1Col == -1) {
                    return null;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final Drawable drawableFromResourceValue = this.getDrawableFromResourceValue(cursor.getString(this.mIconName1Col));
            if (drawableFromResourceValue == null) {
                break;
            }
            return drawableFromResourceValue;
        }
        return this.getDefaultIcon1(cursor);
    }
    
    private Drawable getIcon2(final Cursor cursor) {
        try {
            if (this.mIconName2Col == -1) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return this.getDrawableFromResourceValue(cursor.getString(this.mIconName2Col));
    }
    
    private static String getStringOrNull(final Cursor cursor, final int n) {
        if (n == -1) {
            return null;
        }
        try {
            return cursor.getString(n);
        }
        catch (Exception ex) {
            Log.e(SuggestionsAdapter.z[45], SuggestionsAdapter.z[44], (Throwable)ex);
            return null;
        }
    }
    
    private void setViewDrawable(final ImageView p0, final Drawable p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: aload_2        
        //     2: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //     5: aload_2        
        //     6: ifnonnull       20
        //     9: aload_1        
        //    10: iload_3        
        //    11: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    14: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //    17: ifeq            50
        //    20: aload_1        
        //    21: iconst_0       
        //    22: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    25: aload_2        
        //    26: iconst_0       
        //    27: iconst_0       
        //    28: invokevirtual   android/graphics/drawable/Drawable.setVisible:(ZZ)Z
        //    31: pop            
        //    32: aload_2        
        //    33: iconst_1       
        //    34: iconst_0       
        //    35: invokevirtual   android/graphics/drawable/Drawable.setVisible:(ZZ)Z
        //    38: pop            
        //    39: return         
        //    40: astore          4
        //    42: aload           4
        //    44: athrow         
        //    45: astore          5
        //    47: aload           5
        //    49: athrow         
        //    50: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      5      40     45     Ljava/lang/RuntimeException;
        //  9      20     45     50     Ljava/lang/RuntimeException;
        //  20     39     45     50     Ljava/lang/RuntimeException;
        //  42     45     45     50     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void setViewText(final TextView p0, final CharSequence p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: aload_2        
        //     2: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //     5: aload_2        
        //     6: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //     9: istore          5
        //    11: iload           5
        //    13: ifeq            28
        //    16: aload_1        
        //    17: bipush          8
        //    19: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    22: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //    25: ifeq            42
        //    28: aload_1        
        //    29: iconst_0       
        //    30: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    33: return         
        //    34: astore_3       
        //    35: aload_3        
        //    36: athrow         
        //    37: astore          4
        //    39: aload           4
        //    41: athrow         
        //    42: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      11     34     37     Ljava/lang/RuntimeException;
        //  16     28     37     42     Ljava/lang/RuntimeException;
        //  28     33     37     42     Ljava/lang/RuntimeException;
        //  35     37     37     42     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void storeInIconCache(final String s, final Drawable drawable) {
        if (drawable == null) {
            return;
        }
        try {
            this.mOutsideDrawablesCache.put(s, drawable.getConstantState());
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    private void updateSpinnerState(final Cursor p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnull          42
        //     4: aload_1        
        //     5: invokeinterface android/database/Cursor.getExtras:()Landroid/os/Bundle;
        //    10: astore          6
        //    12: aload           6
        //    14: astore_2       
        //    15: aload_2        
        //    16: ifnull          36
        //    19: aload_2        
        //    20: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //    23: bipush          24
        //    25: aaload         
        //    26: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //    29: istore          4
        //    31: iload           4
        //    33: ifeq            36
        //    36: return         
        //    37: astore          5
        //    39: aload           5
        //    41: athrow         
        //    42: aconst_null    
        //    43: astore_2       
        //    44: goto            15
        //    47: astore_3       
        //    48: aload_3        
        //    49: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      12     37     42     Ljava/lang/RuntimeException;
        //  19     31     47     50     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void bindView(final View p0, final Context p1, final Cursor p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //     3: istore          4
        //     5: aload_1        
        //     6: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //     9: checkcast       Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
        //    12: astore          5
        //    14: aload_0        
        //    15: getfield        android/support/v7/widget/SuggestionsAdapter.mFlagsCol:I
        //    18: istore          6
        //    20: iconst_0       
        //    21: istore          7
        //    23: iload           6
        //    25: iconst_m1      
        //    26: if_icmpeq       41
        //    29: aload_3        
        //    30: aload_0        
        //    31: getfield        android/support/v7/widget/SuggestionsAdapter.mFlagsCol:I
        //    34: invokeinterface android/database/Cursor.getInt:(I)I
        //    39: istore          7
        //    41: aload           5
        //    43: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText1:Landroid/widget/TextView;
        //    46: ifnull          70
        //    49: aload_3        
        //    50: aload_0        
        //    51: getfield        android/support/v7/widget/SuggestionsAdapter.mText1Col:I
        //    54: invokestatic    android/support/v7/widget/SuggestionsAdapter.getStringOrNull:(Landroid/database/Cursor;I)Ljava/lang/String;
        //    57: astore          24
        //    59: aload_0        
        //    60: aload           5
        //    62: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText1:Landroid/widget/TextView;
        //    65: aload           24
        //    67: invokespecial   android/support/v7/widget/SuggestionsAdapter.setViewText:(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
        //    70: aload           5
        //    72: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText2:Landroid/widget/TextView;
        //    75: ifnull          185
        //    78: aload_3        
        //    79: aload_0        
        //    80: getfield        android/support/v7/widget/SuggestionsAdapter.mText2UrlCol:I
        //    83: invokestatic    android/support/v7/widget/SuggestionsAdapter.getStringOrNull:(Landroid/database/Cursor;I)Ljava/lang/String;
        //    86: astore          16
        //    88: aload           16
        //    90: ifnull          313
        //    93: aload_0        
        //    94: aload           16
        //    96: invokespecial   android/support/v7/widget/SuggestionsAdapter.formatUrl:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
        //    99: astore          17
        //   101: aload           17
        //   103: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   106: istore          22
        //   108: iload           22
        //   110: ifeq            148
        //   113: aload           5
        //   115: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText1:Landroid/widget/TextView;
        //   118: astore          23
        //   120: aload           23
        //   122: ifnull          174
        //   125: aload           5
        //   127: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText1:Landroid/widget/TextView;
        //   130: iconst_0       
        //   131: invokevirtual   android/widget/TextView.setSingleLine:(Z)V
        //   134: aload           5
        //   136: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText1:Landroid/widget/TextView;
        //   139: iconst_2       
        //   140: invokevirtual   android/widget/TextView.setMaxLines:(I)V
        //   143: iload           4
        //   145: ifeq            174
        //   148: aload           5
        //   150: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText1:Landroid/widget/TextView;
        //   153: ifnull          174
        //   156: aload           5
        //   158: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText1:Landroid/widget/TextView;
        //   161: iconst_1       
        //   162: invokevirtual   android/widget/TextView.setSingleLine:(Z)V
        //   165: aload           5
        //   167: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText1:Landroid/widget/TextView;
        //   170: iconst_1       
        //   171: invokevirtual   android/widget/TextView.setMaxLines:(I)V
        //   174: aload_0        
        //   175: aload           5
        //   177: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText2:Landroid/widget/TextView;
        //   180: aload           17
        //   182: invokespecial   android/support/v7/widget/SuggestionsAdapter.setViewText:(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
        //   185: aload           5
        //   187: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mIcon1:Landroid/widget/ImageView;
        //   190: ifnull          208
        //   193: aload_0        
        //   194: aload           5
        //   196: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mIcon1:Landroid/widget/ImageView;
        //   199: aload_0        
        //   200: aload_3        
        //   201: invokespecial   android/support/v7/widget/SuggestionsAdapter.getIcon1:(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
        //   204: iconst_4       
        //   205: invokespecial   android/support/v7/widget/SuggestionsAdapter.setViewDrawable:(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
        //   208: aload           5
        //   210: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mIcon2:Landroid/widget/ImageView;
        //   213: ifnull          232
        //   216: aload_0        
        //   217: aload           5
        //   219: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mIcon2:Landroid/widget/ImageView;
        //   222: aload_0        
        //   223: aload_3        
        //   224: invokespecial   android/support/v7/widget/SuggestionsAdapter.getIcon2:(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
        //   227: bipush          8
        //   229: invokespecial   android/support/v7/widget/SuggestionsAdapter.setViewDrawable:(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
        //   232: aload_0        
        //   233: getfield        android/support/v7/widget/SuggestionsAdapter.mQueryRefinement:I
        //   236: istore          14
        //   238: iload           14
        //   240: iconst_2       
        //   241: if_icmpeq       263
        //   244: aload_0        
        //   245: getfield        android/support/v7/widget/SuggestionsAdapter.mQueryRefinement:I
        //   248: istore          15
        //   250: iload           15
        //   252: iconst_1       
        //   253: if_icmpne       302
        //   256: iload           7
        //   258: iconst_1       
        //   259: iand           
        //   260: ifeq            302
        //   263: aload           5
        //   265: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mIconRefine:Landroid/widget/ImageView;
        //   268: iconst_0       
        //   269: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   272: aload           5
        //   274: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mIconRefine:Landroid/widget/ImageView;
        //   277: aload           5
        //   279: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mText1:Landroid/widget/TextView;
        //   282: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //   285: invokevirtual   android/widget/ImageView.setTag:(Ljava/lang/Object;)V
        //   288: aload           5
        //   290: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mIconRefine:Landroid/widget/ImageView;
        //   293: aload_0        
        //   294: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   297: iload           4
        //   299: ifeq            312
        //   302: aload           5
        //   304: getfield        android/support/v7/widget/SuggestionsAdapter$ChildViewCache.mIconRefine:Landroid/widget/ImageView;
        //   307: bipush          8
        //   309: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   312: return         
        //   313: aload_3        
        //   314: aload_0        
        //   315: getfield        android/support/v7/widget/SuggestionsAdapter.mText2Col:I
        //   318: invokestatic    android/support/v7/widget/SuggestionsAdapter.getStringOrNull:(Landroid/database/Cursor;I)Ljava/lang/String;
        //   321: astore          17
        //   323: goto            101
        //   326: astore          18
        //   328: aload           18
        //   330: athrow         
        //   331: astore          19
        //   333: aload           19
        //   335: athrow         
        //   336: astore          20
        //   338: aload           20
        //   340: athrow         
        //   341: astore          21
        //   343: aload           21
        //   345: athrow         
        //   346: astore          8
        //   348: aload           8
        //   350: athrow         
        //   351: astore          9
        //   353: aload           9
        //   355: athrow         
        //   356: astore          10
        //   358: aload           10
        //   360: athrow         
        //   361: astore          11
        //   363: aload           11
        //   365: athrow         
        //   366: astore          12
        //   368: aload           12
        //   370: athrow         
        //   371: astore          13
        //   373: aload           13
        //   375: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  101    108    326    331    Ljava/lang/RuntimeException;
        //  113    120    331    336    Ljava/lang/RuntimeException;
        //  125    143    336    341    Ljava/lang/RuntimeException;
        //  148    174    341    346    Ljava/lang/RuntimeException;
        //  185    208    346    351    Ljava/lang/RuntimeException;
        //  208    232    351    356    Ljava/lang/RuntimeException;
        //  232    238    356    361    Ljava/lang/RuntimeException;
        //  244    250    361    371    Ljava/lang/RuntimeException;
        //  263    297    371    376    Ljava/lang/RuntimeException;
        //  302    312    371    376    Ljava/lang/RuntimeException;
        //  328    331    331    336    Ljava/lang/RuntimeException;
        //  333    336    336    341    Ljava/lang/RuntimeException;
        //  338    341    341    346    Ljava/lang/RuntimeException;
        //  358    361    361    371    Ljava/lang/RuntimeException;
        //  363    366    366    371    Ljava/lang/RuntimeException;
        //  368    371    371    376    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 177, Size: 177
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void changeCursor(final Cursor cursor) {
        Label_0038: {
            try {
                if (!this.mClosed) {
                    break Label_0038;
                }
                Log.w(SuggestionsAdapter.z[0], SuggestionsAdapter.z[1]);
                if (cursor != null) {
                    final Cursor cursor2 = cursor;
                    cursor2.close();
                }
                return;
            }
            catch (Exception ex) {
                throw ex;
            }
            try {
                final Cursor cursor2 = cursor;
                cursor2.close();
                return;
            }
            catch (Exception ex2) {
                throw ex2;
            }
            try {
                super.changeCursor(cursor);
                if (cursor != null) {
                    this.mText1Col = cursor.getColumnIndex(SuggestionsAdapter.z[6]);
                    this.mText2Col = cursor.getColumnIndex(SuggestionsAdapter.z[8]);
                    this.mText2UrlCol = cursor.getColumnIndex(SuggestionsAdapter.z[5]);
                    this.mIconName1Col = cursor.getColumnIndex(SuggestionsAdapter.z[2]);
                    this.mIconName2Col = cursor.getColumnIndex(SuggestionsAdapter.z[3]);
                    this.mFlagsCol = cursor.getColumnIndex(SuggestionsAdapter.z[9]);
                }
            }
            catch (Exception ex3) {
                Log.e(SuggestionsAdapter.z[4], SuggestionsAdapter.z[7], (Throwable)ex3);
            }
        }
    }
    
    public CharSequence convertToString(final Cursor cursor) {
        if (cursor != null) {
            final String columnString = getColumnString(cursor, SuggestionsAdapter.z[38]);
            if (columnString != null) {
                return columnString;
            }
            if (this.mSearchable.shouldRewriteQueryFromData()) {
                final String columnString2 = getColumnString(cursor, SuggestionsAdapter.z[39]);
                if (columnString2 != null) {
                    return columnString2;
                }
            }
            if (this.mSearchable.shouldRewriteQueryFromText()) {
                final String columnString3 = getColumnString(cursor, SuggestionsAdapter.z[40]);
                if (columnString3 != null) {
                    return columnString3;
                }
            }
        }
        return null;
    }
    
    Drawable getDrawableFromResourceUri(final Uri uri) {
        final String authority = uri.getAuthority();
        try {
            if (TextUtils.isEmpty((CharSequence)authority)) {
                throw new FileNotFoundException(SuggestionsAdapter.z[32] + uri);
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw ex;
        }
        Resources resourcesForApplication;
        List pathSegments;
        try {
            resourcesForApplication = this.mContext.getPackageManager().getResourcesForApplication(authority);
            pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                try {
                    throw new FileNotFoundException(SuggestionsAdapter.z[35] + uri);
                }
                catch (PackageManager$NameNotFoundException ex2) {
                    throw ex2;
                }
            }
        }
        catch (PackageManager$NameNotFoundException ex5) {
            throw new FileNotFoundException(SuggestionsAdapter.z[33] + uri);
        }
        final int size = pathSegments.size();
        int n = 0;
        while (true) {
            Label_0248: {
                if (size != 1) {
                    break Label_0248;
                }
                try {
                    n = Integer.parseInt(pathSegments.get(0));
                    if (n != 0) {
                        return resourcesForApplication.getDrawable(n);
                    }
                    try {
                        throw new FileNotFoundException(SuggestionsAdapter.z[34] + uri);
                    }
                    catch (PackageManager$NameNotFoundException ex3) {
                        throw ex3;
                    }
                }
                catch (NumberFormatException ex6) {
                    throw new FileNotFoundException(SuggestionsAdapter.z[36] + uri);
                }
            }
            Label_0290: {
                if (size != 2) {
                    break Label_0290;
                }
                n = resourcesForApplication.getIdentifier((String)pathSegments.get(1), (String)pathSegments.get(0), authority);
                try {
                    if (LinearLayoutCompat.a) {
                        throw new FileNotFoundException(SuggestionsAdapter.z[37] + uri);
                    }
                    continue;
                }
                catch (PackageManager$NameNotFoundException ex4) {
                    throw ex4;
                }
            }
            break;
        }
        return resourcesForApplication.getDrawable(n);
    }
    
    Cursor getSearchManagerSuggestions(final SearchableInfo p0, final String p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: aload_1        
        //     7: invokevirtual   android/app/SearchableInfo.getSuggestAuthority:()Ljava/lang/String;
        //    10: astore          4
        //    12: aload           4
        //    14: ifnull          4
        //    17: new             Landroid/net/Uri$Builder;
        //    20: dup            
        //    21: invokespecial   android/net/Uri$Builder.<init>:()V
        //    24: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //    27: bipush          43
        //    29: aaload         
        //    30: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    33: aload           4
        //    35: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    38: ldc_w           ""
        //    41: invokevirtual   android/net/Uri$Builder.query:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    44: ldc_w           ""
        //    47: invokevirtual   android/net/Uri$Builder.fragment:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    50: astore          5
        //    52: aload_1        
        //    53: invokevirtual   android/app/SearchableInfo.getSuggestPath:()Ljava/lang/String;
        //    56: astore          6
        //    58: aload           6
        //    60: ifnull          71
        //    63: aload           5
        //    65: aload           6
        //    67: invokevirtual   android/net/Uri$Builder.appendEncodedPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    70: pop            
        //    71: aload           5
        //    73: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //    76: bipush          41
        //    78: aaload         
        //    79: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    82: pop            
        //    83: aload_1        
        //    84: invokevirtual   android/app/SearchableInfo.getSuggestSelection:()Ljava/lang/String;
        //    87: astore          8
        //    89: aload           8
        //    91: ifnull          155
        //    94: iconst_1       
        //    95: anewarray       Ljava/lang/String;
        //    98: dup            
        //    99: iconst_0       
        //   100: aload_2        
        //   101: aastore        
        //   102: astore          9
        //   104: iload_3        
        //   105: ifle            124
        //   108: aload           5
        //   110: getstatic       android/support/v7/widget/SuggestionsAdapter.z:[Ljava/lang/String;
        //   113: bipush          42
        //   115: aaload         
        //   116: iload_3        
        //   117: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   120: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   123: pop            
        //   124: aload           5
        //   126: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   129: astore          10
        //   131: aload_0        
        //   132: getfield        android/support/v7/widget/SuggestionsAdapter.mContext:Landroid/content/Context;
        //   135: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   138: aload           10
        //   140: aconst_null    
        //   141: aload           8
        //   143: aload           9
        //   145: aconst_null    
        //   146: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   149: areturn        
        //   150: astore          14
        //   152: aload           14
        //   154: athrow         
        //   155: aload           5
        //   157: aload_2        
        //   158: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   161: pop            
        //   162: aconst_null    
        //   163: astore          9
        //   165: goto            104
        //   168: astore          11
        //   170: aload           11
        //   172: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  63     71     150    155    Ljava/lang/RuntimeException;
        //  108    124    168    173    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        try {
            return super.getView(n, view, viewGroup);
        }
        catch (RuntimeException ex) {
            Log.w(SuggestionsAdapter.z[28], SuggestionsAdapter.z[29], (Throwable)ex);
            final View view2 = this.newView(this.mContext, this.mCursor, viewGroup);
            if (view2 != null) {
                ((SuggestionsAdapter$ChildViewCache)view2.getTag()).mText1.setText((CharSequence)ex.toString());
            }
            return view2;
        }
    }
    
    public boolean hasStableIds() {
        return false;
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View view = super.newView(context, cursor, viewGroup);
        view.setTag((Object)new SuggestionsAdapter$ChildViewCache(view));
        ((ImageView)view.findViewById(R$id.edit_query)).setImageResource(this.mCommitIconResId);
        return view;
    }
    
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.updateSpinnerState(this.getCursor());
    }
    
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.updateSpinnerState(this.getCursor());
    }
    
    public void onClick(final View view) {
        final Object tag = view.getTag();
        try {
            if (tag instanceof CharSequence) {
                this.mSearchView.onQueryRefine((CharSequence)tag);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    public Cursor runQueryOnBackgroundThread(final CharSequence charSequence) {
        Label_0052: {
            String string = null;
            Label_0034: {
                if (charSequence != null) {
                    break Label_0034;
                }
                string = "";
                try {
                    while (true) {
                        if (this.mSearchView.getVisibility() != 0 || this.mSearchView.getWindowVisibility() != 0) {
                            return null;
                        }
                        break Label_0052;
                        string = charSequence.toString();
                        continue;
                    }
                }
                catch (RuntimeException ex) {
                    try {
                        throw ex;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
            }
            try {
                final Cursor searchManagerSuggestions = this.getSearchManagerSuggestions(this.mSearchable, string, 50);
                if (searchManagerSuggestions != null) {
                    searchManagerSuggestions.getCount();
                    return searchManagerSuggestions;
                }
            }
            catch (RuntimeException ex3) {
                Log.w(SuggestionsAdapter.z[31], SuggestionsAdapter.z[30], (Throwable)ex3);
            }
        }
        return null;
    }
}
