// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.net.URLDecoder;
import java.util.Locale;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.webkit.WebView;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import java.util.Comparator;
import java.util.Collections;
import android.content.pm.ResolveInfo$DisplayNameComparator;
import android.content.ActivityNotFoundException;
import android.os.Parcelable;
import java.util.HashSet;
import android.content.Intent;
import android.content.Context;
import org.apache.http.HttpEntity;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.t;
import java.util.HashMap;
import java.util.Map;
import com.twitter.library.network.OAuthToken;
import java.util.ArrayList;
import android.text.TextUtils;
import java.net.URISyntaxException;
import org.apache.http.client.utils.URLEncodedUtils;
import java.util.List;
import java.net.URI;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import android.net.Uri;

public class bn
{
    public static final Uri a;
    
    static {
        a = Uri.parse("mailto:");
    }
    
    public static int a(final Uri uri, final String s, final int n) {
        final String queryParameter = uri.getQueryParameter(s);
        if (queryParameter == null) {
            return n;
        }
        try {
            return Integer.parseInt(queryParameter);
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    public static Uri a(final Uri uri) {
        return uri.buildUpon().query((String)null).fragment((String)null).build();
    }
    
    public static String a(final String s, final String s2) {
        if (s == null) {
            return "";
        }
        try {
            return URLEncoder.encode(s, s2);
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
    
    public static String a(final URI uri) {
        String host = null;
        if (uri != null) {
            final String host2 = uri.getHost();
            host = null;
            if (host2 != null) {
                host = uri.getHost();
            }
        }
        return host;
    }
    
    public static String a(final List list) {
        if (list != null) {
            return URLEncodedUtils.format(list, "UTF-8").replace("*", "%2A");
        }
        return null;
    }
    
    public static URI a(final String s) {
        try {
            return new URI(s);
        }
        catch (URISyntaxException ex) {
            final int index = s.indexOf(58);
            if (index != -1 && index != s.length()) {
                final String substring = s.substring(0, index);
                final String substring2 = s.substring(index + 1);
                try {
                    return new URI(substring, substring2, null);
                }
                catch (URISyntaxException ex2) {}
            }
            return null;
        }
    }
    
    public static URI a(String format, final String s, String s2) {
        try {
            if (format.indexOf("://") < 0) {
                format = String.format("%s://%s", s, format);
            }
            final URI uri = new URI(format);
            final String host = uri.getHost();
            final String path = uri.getPath();
            if (!path.isEmpty()) {
                s2 = path;
            }
            return new URI(s, host, s2, null);
        }
        catch (URISyntaxException ex) {
            return null;
        }
    }
    
    public static URI a(final URI uri, final String s) {
        return new URI(uri.getScheme(), uri.getUserInfo(), s, uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
    }
    
    public static List a(final Uri uri, final String s, final List list) {
        final String queryParameter = uri.getQueryParameter(s);
        if (TextUtils.isEmpty((CharSequence)queryParameter)) {
            return list;
        }
        try {
            final String[] split = queryParameter.split(",");
            final int length = split.length;
            final ArrayList list2 = new ArrayList<Long>(length);
            for (int i = 0; i < length; ++i) {
                list2.add(Long.parseLong(split[i]));
            }
            return list2;
        }
        catch (NumberFormatException ex) {
            return list;
        }
    }
    
    private static Map a(final OAuthToken oAuthToken, final String s) {
        final URI a = a(s);
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        if (oAuthToken != null) {
            hashMap.put("Authorization", new t(oAuthToken).a(HttpOperation$RequestMethod.a, a, null, 0L));
        }
        return hashMap;
    }
    
    private static void a(final Context context, final Intent intent, final int n) {
        final ArrayList<Intent> list = new ArrayList<Intent>();
        a(context, list, intent, null);
        if (list.isEmpty()) {
            return;
        }
        final Intent putExtra = Intent.createChooser((Intent)list.remove(-1 + list.size()), (CharSequence)context.getString(n)).putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])list.toArray(new Parcelable[list.size()]));
        try {
            context.startActivity(putExtra);
        }
        catch (ActivityNotFoundException ex) {}
    }
    
    public static void a(final Context context, final Uri uri) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri).setFlags(268435456));
        }
        catch (ActivityNotFoundException ex) {}
    }
    
    static void a(final Context context, final List list, final Intent intent, final HashSet set) {
        final PackageManager packageManager = context.getPackageManager();
        final List queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (queryIntentActivities != null) {
            Collections.sort((List<Object>)queryIntentActivities, (Comparator<? super Object>)new ResolveInfo$DisplayNameComparator(packageManager));
            final String packageName = context.getPackageName();
            for (final ResolveInfo resolveInfo : queryIntentActivities) {
                final String packageName2 = resolveInfo.activityInfo.packageName;
                final ComponentName componentName = new ComponentName(packageName2, resolveInfo.activityInfo.name);
                if (!packageName2.equals(packageName) && (set == null || set.add(componentName))) {
                    list.add(new Intent(intent).setPackage(packageName2).setComponent(new ComponentName(packageName2, resolveInfo.activityInfo.name)));
                }
            }
        }
    }
    
    public static void a(final WebView webView, final String s, final OAuthToken oAuthToken) {
        a(webView, s, null, oAuthToken);
    }
    
    @TargetApi(8)
    public static void a(final WebView webView, final String s, final Map map) {
        if (Build$VERSION.SDK_INT > 7) {
            webView.loadUrl(s, map);
            return;
        }
        webView.loadUrl(s);
    }
    
    public static void a(final WebView webView, final String s, final Map map, final OAuthToken oAuthToken) {
        final Map a = a(oAuthToken, s);
        if (map != null) {
            a.putAll(map);
        }
        a(webView, s, a);
    }
    
    public static void a(final WebView webView, final String s, final byte[] array) {
        webView.postUrl(s, array);
    }
    
    public static boolean a(final Uri uri, final String s, final boolean b) {
        final String queryParameter = uri.getQueryParameter(s);
        if (queryParameter == null) {
            return b;
        }
        final String lowerCase = queryParameter.toLowerCase(Locale.ROOT);
        return !"false".equals(lowerCase) && !"0".equals(lowerCase);
    }
    
    public static Uri b(Uri parse) {
        final String string = parse.toString();
        final int index = string.indexOf("/#!");
        if (index != -1) {
            parse = Uri.parse(string.substring(0, index) + string.substring(index + "/#!".length()));
        }
        return parse;
    }
    
    public static String b(final String s) {
        if (s.startsWith("tel:")) {
            return s;
        }
        final int index = s.indexOf("://");
        if (index == -1) {
            return "http://" + s;
        }
        return s.substring(0, index).toLowerCase() + s.substring(index);
    }
    
    public static String b(final String s, final String s2) {
        if (s == null) {
            return "";
        }
        try {
            return URLDecoder.decode(s, s2);
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
        catch (IllegalArgumentException ex2) {
            return s;
        }
    }
    
    public static void b(final Context context, final Uri uri) {
        a(context, new Intent("android.intent.action.VIEW", uri), lg.intent_chooser_title);
    }
    
    public static String c(final String s) {
        if (!d(s)) {
            return null;
        }
        if (s.contains("youtu.be/")) {
            return Uri.parse(s).getLastPathSegment();
        }
        return Uri.parse(s).getQueryParameter("v");
    }
    
    public static boolean c(final String s, final String s2) {
        return (s == null && s2 == null) || (s != null && s2 != null && Uri.parse(s).getPath().equals(Uri.parse(s2).getPath()));
    }
    
    public static boolean d(final String s) {
        return s != null && (s.contains("youtube.com/") || s.contains("youtu.be/"));
    }
    
    public static boolean e(final String s) {
        return s != null && (s.startsWith("https://") || s.startsWith("http://"));
    }
    
    public static boolean f(final String s) {
        return s != null && s.startsWith("https://");
    }
}
