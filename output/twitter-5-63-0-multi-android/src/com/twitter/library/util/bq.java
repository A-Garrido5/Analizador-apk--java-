// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.net.Uri;
import com.twitter.library.featureswitch.d;
import android.content.pm.PackageManager;
import android.util.Pair;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.File;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import android.provider.Settings$Secure;
import android.accounts.Account;
import android.accounts.AccountManager;
import com.twitter.util.c;
import android.os.Parcelable;
import android.os.Build$VERSION;
import java.util.Map;
import android.util.Log;
import com.twitter.library.client.App;
import com.twitter.library.util.error.b;
import android.text.Editable;
import android.preference.ListPreference;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import android.text.TextUtils;
import com.twitter.library.provider.Tweet;
import java.util.Iterator;
import java.text.SimpleDateFormat;
import java.util.Locale;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.util.f;
import android.text.style.StyleSpan;
import android.text.SpannableStringBuilder;
import android.text.SpannableString;
import android.text.Spanned;
import android.os.BadParcelableException;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.errorreporter.a;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.library.network.ae;
import android.content.Context;
import java.util.Random;

public abstract class bq
{
    public static final Random a;
    private static volatile long b;
    private static long c;
    
    static {
        a = new Random();
        bq.b = 0L;
    }
    
    public static float a(final int n, final int n2, float n3) {
        if (n > 0 && n2 > 0) {
            n3 = n / n2;
        }
        return n3;
    }
    
    public static long a(final Context context) {
        if (bq.b == 0L) {
            bq.b = d(ae.b(context));
        }
        return bq.b;
    }
    
    public static Bundle a(final Intent intent) {
        try {
            return intent.getExtras();
        }
        catch (BadParcelableException ex) {
            ErrorReporter.a(new a((Throwable)ex));
            return null;
        }
    }
    
    @Deprecated
    public static Spanned a(final Object[] array, final String s, final char c) {
        return a(array, s, String.valueOf(c));
    }
    
    public static Spanned a(final Object[] array, final String s, final String s2) {
        int n = 0;
        final int index = s.indexOf(s2);
        if (index == -1) {
            return (Spanned)new SpannableString((CharSequence)s);
        }
        final int index2 = s.indexOf(s2, index + 1);
        if (index2 == -1) {
            return (Spanned)new SpannableString((CharSequence)s);
        }
        final int length = array.length;
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = index2;
        int index3 = index;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            do {
                spannableStringBuilder.append((CharSequence)s.substring(n2, index3));
                spannableStringBuilder.append((CharSequence)s.substring(index3 + s2.length(), i));
                spannableStringBuilder.setSpan(array[n3], index3 - n, i - n - s2.length(), 33);
                ++n3;
                n2 = i + s2.length();
                if (n3 < length) {
                    index3 = s.indexOf(s2, n2);
                    if (index3 != -1) {
                        i = s.indexOf(s2, index3 + 1);
                        n += 2 * s2.length();
                    }
                    if (index3 != -1) {
                        continue;
                    }
                }
                spannableStringBuilder.append((CharSequence)s.substring(n2));
                return (Spanned)spannableStringBuilder;
            } while (i != -1);
            continue;
        }
    }
    
    public static String a(final Bundle bundle, final String s) {
        try {
            return bundle.getString(s);
        }
        catch (RuntimeException ex) {
            ErrorReporter.a(new a().a("bundle_key", s).a(ex));
            return null;
        }
    }
    
    public static String a(final Spanned spanned) {
        int i = 0;
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)spanned);
        for (StyleSpan[] array = (StyleSpan[])spanned.getSpans(0, spanned.length(), (Class)StyleSpan.class); i < array.length; ++i) {
            final StyleSpan styleSpan = array[i];
            final int style = styleSpan.getStyle();
            if ((style & 0x3) == 0x3) {
                spannableStringBuilder.insert(spannableStringBuilder.getSpanStart((Object)styleSpan), (CharSequence)"<b><i>");
                spannableStringBuilder.insert(spannableStringBuilder.getSpanEnd((Object)styleSpan), (CharSequence)"</i></b>");
            }
            else if ((style & 0x1) == 0x1) {
                spannableStringBuilder.insert(spannableStringBuilder.getSpanStart((Object)styleSpan), (CharSequence)"<b>");
                spannableStringBuilder.insert(spannableStringBuilder.getSpanEnd((Object)styleSpan), (CharSequence)"</b>");
            }
            else if ((style & 0x2) == 0x2) {
                spannableStringBuilder.insert(spannableStringBuilder.getSpanStart((Object)styleSpan), (CharSequence)"<i>");
                spannableStringBuilder.insert(spannableStringBuilder.getSpanEnd((Object)styleSpan), (CharSequence)"</i>");
            }
        }
        return spannableStringBuilder.toString();
    }
    
    public static String a(String substring) {
        if (substring != null && substring.startsWith("@")) {
            substring = substring.substring(1);
        }
        return substring;
    }
    
    public static String a(final String s, final String s2) {
        return f.b(s2 + "d6PaPHJeSpyHXeVyWT6ePCcSMSrnD83MnfMgWhtczxpnSMSF7CQcBSQqtBNh6Jym" + s + "Activation");
    }
    
    public static void a(final Context context, final QuotedTweetData quotedTweetData, final boolean b) {
        final String string = context.getString(lg.tweet_share_link, new Object[] { quotedTweetData.userHandle, quotedTweetData.statusId });
        final String string2 = context.getString(lg.app_download_url);
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(context.getString(lg.tweet_date_format), Locale.getDefault());
        final bf bf = new bf();
        for (final int intValue : com.twitter.library.util.bf.b) {
            bf.a(intValue, context.getString(lg.tweets_share_subject_long_format, new Object[] { quotedTweetData.userName, quotedTweetData.userHandle }), context.getString(lg.tweets_share_long_format, new Object[] { quotedTweetData.userName, quotedTweetData.userHandle, simpleDateFormat.format(quotedTweetData.createdAt), quotedTweetData.text, com.twitter.library.util.bf.a(string, intValue), com.twitter.library.util.bf.a(string2, 13) }));
        }
        for (final int intValue2 : com.twitter.library.util.bf.a) {
            bf.a(intValue2, context.getString(lg.tweets_share_short_format, new Object[] { quotedTweetData.userHandle, com.twitter.library.util.bf.a(string, intValue2) }));
        }
        bf.a(context, quotedTweetData, b);
    }
    
    public static void a(final Context context, final Tweet tweet, final boolean b) {
        a(context, new QuotedTweetData(tweet), b);
    }
    
    public static void a(final Context context, final String s) {
        final bf bf = new bf();
        bf.a(1, " ", "\n" + s);
        bf.a(1, "\n" + s);
        bf.a(context, null, true);
    }
    
    public static void a(final Context context, String substring, final String s) {
        Label_0197: {
            if (TextUtils.isEmpty((CharSequence)substring) || substring.charAt(0) != '#') {
                break Label_0197;
            }
            int n = 1;
            while (true) {
                if (n != 0) {
                    substring = substring.substring(1);
                }
                try {
                    final String replaceAll = URLEncoder.encode(substring, "utf-8").replaceAll("\\+", "%20");
                    final String string = context.getString(lg.app_download_url);
                    String s2;
                    if (n != 0) {
                        s2 = context.getString(lg.search_hashtag_share_link, new Object[] { replaceAll });
                    }
                    else {
                        s2 = context.getString(lg.search_share_link, new Object[] { replaceAll });
                    }
                    final bf bf = new bf();
                    for (final int intValue : com.twitter.library.util.bf.b) {
                        bf.a(intValue, context.getString(lg.search_share_subject_long_format, new Object[] { s }), context.getString(lg.search_share_long_format, new Object[] { s, com.twitter.library.util.bf.a(s2, intValue), com.twitter.library.util.bf.a(string, 13) }));
                    }
                    for (final int intValue2 : com.twitter.library.util.bf.a) {
                        bf.a(intValue2, context.getString(lg.search_share_short_format, new Object[] { com.twitter.library.util.bf.a(s2, intValue2) }));
                    }
                    bf.a(context, null, true);
                    return;
                    n = 0;
                    continue;
                }
                catch (UnsupportedEncodingException ex) {}
                break;
            }
        }
    }
    
    public static void a(final Context context, final String s, final String s2, final String s3) {
        final String string = context.getString(lg.user_share_link, new Object[] { s2 });
        final String string2 = context.getString(lg.app_download_url);
        final bf bf = new bf();
        for (final int intValue : com.twitter.library.util.bf.b) {
            bf.a(intValue, context.getString(lg.user_share_subject_long_format, new Object[] { s, s2 }), context.getString(lg.user_share_long_format, new Object[] { s, s2, s3, com.twitter.library.util.bf.a(string, intValue), com.twitter.library.util.bf.a(string2, 13) }));
        }
        for (final int intValue2 : com.twitter.library.util.bf.a) {
            bf.a(intValue2, context.getString(lg.user_share_short_format, new Object[] { s, s2, com.twitter.library.util.bf.a(string, intValue2) }));
        }
        bf.a(context, null, true);
    }
    
    public static void a(final Context context, final String s, final String s2, final String s3, final String s4, final String s5) {
        final String string = context.getString(lg.list_share_link, new Object[] { s2, s3 });
        final String string2 = context.getString(lg.app_download_url);
        final bf bf = new bf();
        for (final int intValue : com.twitter.library.util.bf.b) {
            bf.a(intValue, context.getString(lg.list_share_subject_long_format, new Object[] { s, s2 }), context.getString(lg.list_share_long_format, new Object[] { s4, s, s5, com.twitter.library.util.bf.a(string, intValue), com.twitter.library.util.bf.a(string2, 13) }));
        }
        for (final int intValue2 : com.twitter.library.util.bf.a) {
            bf.a(intValue2, context.getString(lg.list_share_short_format, new Object[] { s4, s2, com.twitter.library.util.bf.a(string, intValue2) }));
        }
        bf.a(context, null, true);
    }
    
    public static void a(final ListPreference listPreference, final String s) {
        final CharSequence[] entries = listPreference.getEntries();
        final int indexOfValue = listPreference.findIndexOfValue(s);
        if (indexOfValue != -1) {
            listPreference.setSummary(entries[indexOfValue]);
        }
    }
    
    public static void a(final Editable editable, final Object o, final String s, final boolean b) {
        final int spanStart = editable.getSpanStart(o);
        final int spanEnd = editable.getSpanEnd(o);
        if (spanStart >= 0 && spanEnd >= spanStart) {
            editable.removeSpan(o);
            editable.replace(spanStart, spanEnd, (CharSequence)s);
            if (b && s.length() > 0) {
                editable.setSpan(o, spanStart, spanStart + s.length(), 33);
            }
        }
    }
    
    public static void a(final b b) {
        try {
            ErrorReporter.a(b);
            b();
            if (App.f()) {
                final com.twitter.errorreporter.b b2 = b.a().get(0);
                Log.e("OutOfMemoryError", "Out Of Memory Error", b2.b());
                for (final Map.Entry<Object, V> entry : b2.a().entrySet()) {
                    Log.e("OutOfMemoryError", entry.getKey() + ": " + entry.getValue());
                }
            }
        }
        catch (Throwable t) {}
    }
    
    public static void a(final OutOfMemoryError outOfMemoryError) {
        final b b = b(outOfMemoryError);
        if (b != null) {
            a(b);
        }
    }
    
    public static boolean a() {
        return a(Build$VERSION.SDK_INT);
    }
    
    public static boolean a(final int n) {
        return n >= 16;
    }
    
    public static boolean a(final Context context, final boolean b, final String s) {
        return !b || com.twitter.library.util.a.b(context) > 0 || s.endsWith("@twitter.com");
    }
    
    public static boolean a(final Intent intent, final String s) {
        try {
            return intent.hasExtra(s);
        }
        catch (RuntimeException ex) {
            ErrorReporter.a(new a().a("extra_name", s).a(ex));
            return false;
        }
    }
    
    public static Parcelable b(final Intent intent, final String s) {
        try {
            return intent.getParcelableExtra(s);
        }
        catch (RuntimeException ex) {
            ErrorReporter.a(new a().a("extra_name", s).a(ex));
            return null;
        }
    }
    
    public static b b(final OutOfMemoryError p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    java/lang/System.currentTimeMillis:()J
        //     3: lstore_1       
        //     4: ldc             Lcom/twitter/library/util/bq;.class
        //     6: monitorenter   
        //     7: lload_1        
        //     8: getstatic       com/twitter/library/util/bq.c:J
        //    11: lsub           
        //    12: ldc2_w          60000
        //    15: lcmp           
        //    16: ifle            52
        //    19: iconst_1       
        //    20: istore          4
        //    22: iload           4
        //    24: ifeq            31
        //    27: lload_1        
        //    28: putstatic       com/twitter/library/util/bq.c:J
        //    31: ldc             Lcom/twitter/library/util/bq;.class
        //    33: monitorexit    
        //    34: iload           4
        //    36: ifeq            70
        //    39: new             Lcom/twitter/library/util/error/b;
        //    42: dup            
        //    43: aload_0        
        //    44: invokespecial   com/twitter/library/util/error/b.<init>:(Ljava/lang/Throwable;)V
        //    47: astore          5
        //    49: aload           5
        //    51: areturn        
        //    52: iconst_0       
        //    53: istore          4
        //    55: goto            22
        //    58: astore_3       
        //    59: ldc             Lcom/twitter/library/util/bq;.class
        //    61: monitorexit    
        //    62: aload_3        
        //    63: athrow         
        //    64: astore          6
        //    66: aload_0        
        //    67: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    70: aconst_null    
        //    71: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      19     58     64     Any
        //  27     31     58     64     Any
        //  31     34     58     64     Any
        //  39     49     64     70     Ljava/lang/Throwable;
        //  59     62     58     64     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
    
    public static String b(String substring) {
        if (substring.length() > 0 && substring.charAt(0) == '#') {
            substring = substring.substring(1);
        }
        return substring;
    }
    
    public static void b() {
        uf.a(ir.b(), "app::::oome_count", ih.n, 3).f();
    }
    
    public static void b(final Context context, final String s) {
        com.twitter.util.c.a(context, context.getString(lg.app_name), s);
    }
    
    public static void b(final Context context, final String s, final String s2, final String s3, final String s4, final String s5) {
        final String string = context.getString(lg.app_download_url);
        final bf bf = new bf();
        for (final int intValue : com.twitter.library.util.bf.b) {
            bf.a(intValue, context.getString(lg.timeline_share_subject_long_format, new Object[] { s, s2 }), context.getString(lg.timeline_share_long_format, new Object[] { s3, s, s2, s4, com.twitter.library.util.bf.a(s5, intValue), com.twitter.library.util.bf.a(string, 13) }));
        }
        for (final int intValue2 : com.twitter.library.util.bf.a) {
            bf.a(intValue2, context.getString(lg.timeline_share_short_format, new Object[] { s3, s2, com.twitter.library.util.bf.a(s5, intValue2) }));
        }
        bf.a(context, null, true);
    }
    
    public static boolean b(final Context context) {
        final Account[] accountsByType = AccountManager.get(context).getAccountsByType("com.google");
        final int length = accountsByType.length;
        int n = 0;
        boolean b;
        while (true) {
            b = false;
            if (n >= length) {
                break;
            }
            if (accountsByType[n].name.endsWith("@twitter.com")) {
                b = true;
                break;
            }
            ++n;
        }
        return b;
    }
    
    public static boolean c(final Context context) {
        boolean b;
        if (!App.n()) {
            b = true;
        }
        else {
            final String string = Settings$Secure.getString(context.getContentResolver(), "android_id");
            b = false;
            if (string != null) {
                final String a = f.a(string);
                b = false;
                if (a != null) {
                    return Arrays.asList(context.getResources().getStringArray(ku.whitelisted_device_ids)).contains(a);
                }
            }
        }
        return b;
    }
    
    public static boolean c(final String s) {
        return s != null && s.startsWith("video/mp4") && s.contains("avc1.42E0");
    }
    
    public static long d(final String s) {
        final String b = f.b(s);
        return 0x1FFFFFFFFFFFFFL & Long.parseLong(b.substring(-14 + b.length()), 16);
    }
    
    public static List d(final Context context) {
        final ArrayList<String> list = new ArrayList<String>();
        final ArrayList<Object> list2 = new ArrayList<Object>();
        final PackageManager packageManager = context.getPackageManager();
    Label_0083_Outer:
        for (final ApplicationInfo applicationInfo : packageManager.getInstalledApplications(0)) {
            final String packageName = applicationInfo.packageName;
            if (packageManager.getLaunchIntentForPackage(packageName) != null) {
                while (true) {
                    try {
                        long n = packageManager.getPackageInfo(packageName, 0).firstInstallTime;
                        if (n == 0L) {
                            n = new File(applicationInfo.sourceDir).lastModified();
                        }
                        if (n > 0L) {
                            list.add(packageName);
                            list2.add(String.valueOf(n));
                            continue Label_0083_Outer;
                        }
                        continue Label_0083_Outer;
                    }
                    catch (PackageManager$NameNotFoundException ex) {
                        final long n = 0L;
                        continue;
                    }
                    break;
                }
                break;
            }
        }
        final int size = list.size();
        final ArrayList<Pair> list3 = new ArrayList<Pair>();
        int min;
        for (int i = 0; i < size; i += min) {
            min = Math.min(size, i + 100);
            list3.add(new Pair((Object)TextUtils.join((CharSequence)",", (Iterable)list.subList(i, min)), (Object)TextUtils.join((CharSequence)",", (Iterable)list2.subList(i, min))));
        }
        return list3;
    }
    
    public static String e(String replaceAll) {
        while (replaceAll.matches("(?i).*twitter.*")) {
            replaceAll = replaceAll.replaceAll("(?i)twitter", "");
        }
        return replaceAll;
    }
    
    public static boolean f(final String s) {
        final ArrayList h = d.h("vine_video_hosts");
        if (s != null && !h.isEmpty()) {
            final String host = Uri.parse(s).getHost();
            if (host != null && !host.isEmpty()) {
                for (final String next : h) {
                    if (next instanceof String && host.equalsIgnoreCase(next)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
