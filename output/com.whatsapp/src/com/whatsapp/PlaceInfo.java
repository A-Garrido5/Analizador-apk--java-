// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.HashSet;
import org.json.JSONArray;
import android.text.TextUtils;
import org.apache.http.HttpResponse;
import java.util.Locale;
import org.json.JSONException;
import java.io.IOException;
import com.whatsapp.util.Log;
import org.json.JSONObject;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.BasicHttpParams;
import java.util.Set;
import android.location.Location;
import java.io.Serializable;

public class PlaceInfo implements Serializable
{
    public static final int SOURCE_FACEBOOK = 3;
    public static final int SOURCE_FOURSQUARE = 2;
    public static final int SOURCE_GOOGLE = 1;
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    public String address;
    public double dist;
    public boolean hasDetails;
    public String icon;
    public double lat;
    private transient Location location;
    public double lon;
    public String name;
    public String phone;
    public String placeId;
    public String rating;
    public int source;
    public transient Object tag;
    public Set types;
    public String url;
    public String vicinity;
    
    static {
        final String[] z2 = new String[53];
        String s = "y\u0007";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'i';
                        break;
                    }
                    case 0: {
                        c2 = '\u0010';
                        break;
                    }
                    case 1: {
                        c2 = 'c';
                        break;
                    }
                    case 2: {
                        c2 = '\u001b';
                        break;
                    }
                    case 3: {
                        c2 = '\u001c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "|\u0002ou\u001de\u0007~";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "|\fx}\u001dy\fu";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "x\u0017ol\u001a*L4k\u001egM}}\nu\u0001ts\u0002>\u0000tqFy\u000ez{\fcLkp\bs\u0006h3\u001d\u007f\u0013r\u007f\u001a?\u0013rr6'Q5l\u0007w";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "s\noe";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "|\fu{\u0000d\u0016\u007fy";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "`\u000fz\u007f\fO\u0017tl\u0000s\u0010";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "t\u0002o}";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "~\u0002vy";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "<C";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "c\u0017iy\fd";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "y\u0000tr6e\u0011w";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "<C";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "c\u0017zh\f";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "OT)2\u0019~\u0004";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "_(";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    s = "b\u0006hi\u0005d";
                    n = 15;
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    array = z2;
                    s = "6\u000fzr\u000ee\u0002|yT";
                    n = 16;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "c\u0017zh\u001cc";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "w\u0006tq\fd\u0011b";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "y\u0000tr";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "b\u0002ou\u0007w";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "|\r|";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "|\fx}\u001dy\fu";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "v\fiq\bd\u0017~x6q\u0007\u007fn\fc\u0010";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "f\nxu\u0007y\u0017b";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "|\u0002o";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    s = "<CNr\u0000d\u0006\u007f<:d\u0002oy\u001a";
                    n = 26;
                    n2 = 27;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    s = "e\u0011w";
                    n2 = 28;
                    array = z2;
                    n = 27;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    array = z2;
                    s = "~\u0002vy";
                    n = 28;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "v\fiq\bd\u0017~x6`\u000btr\fO\rnq\u000bu\u0011";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "d\u001aky\u001a";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "`\u000fz\u007f\fO\n\u007f";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "<C";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "&W5l\u0007w";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "x\u0017ol\u001a*L4z\u0006e\u0011hm\u001cq\u0011~2\n\u007f\u000e4jF";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "|\u0002o";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "q\u0007\u007fn\fc\u0010";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "y\u0000tr";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "|\fx}\u001dy\fu";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "`\fhh\b| tx\f";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "~\u0002vy";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "s\noe";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "`\u0011rq\bb\u001a";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "e\u0011w";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "|\r|";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "c\u0017zh\f";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "`\u0011~z\u0000h";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "<C";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "s\u0002oy\u000e\u007f\u0011ry\u001a";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "y\u0007";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "6\u000ft\u007f\b|\u0006&";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "|\nuw";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    break Label_1357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private void downloadDetailsFacebook() {
        // monitorenter(this)
        try {
            final BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout((HttpParams)basicHttpParams, 15000);
            HttpConnectionParams.setSoTimeout((HttpParams)basicHttpParams, 30000);
            HttpProtocolParams.setUserAgent((HttpParams)basicHttpParams, m3.a());
            final DefaultHttpClient defaultHttpClient = new DefaultHttpClient((HttpParams)basicHttpParams);
            String s = a6c.c + this.placeId + "?" + a6c.j;
            final Locale locale = App.aq.getResources().getConfiguration().locale;
            if (locale != null) {
                s = s + PlaceInfo.z[51] + locale.getLanguage();
            }
            final HttpGet httpGet = new HttpGet(s);
            try {
                final HttpResponse execute = defaultHttpClient.execute((HttpUriRequest)httpGet);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    this.url = new JSONObject(EntityUtils.toString(execute.getEntity())).optString(PlaceInfo.z[52]);
                    this.hasDetails = true;
                }
            }
            catch (IOException ex) {
                Log.b(ex);
            }
            catch (JSONException ex2) {
                Log.b((Throwable)ex2);
            }
        }
        finally {}
    }
    
    private void downloadDetailsGoogle() {
        // monitorenter(this)
        try {
            final BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout((HttpParams)basicHttpParams, 15000);
            HttpConnectionParams.setSoTimeout((HttpParams)basicHttpParams, 30000);
            HttpProtocolParams.setUserAgent((HttpParams)basicHttpParams, m3.a());
            final DefaultHttpClient defaultHttpClient = new DefaultHttpClient((HttpParams)basicHttpParams);
            String s = a6c.t + this.placeId;
            final Locale locale = App.aq.getResources().getConfiguration().locale;
            if (locale != null) {
                s = s + PlaceInfo.z[17] + locale.getLanguage();
            }
            final HttpGet httpGet = new HttpGet(s);
            try {
                final HttpResponse execute = defaultHttpClient.execute((HttpUriRequest)httpGet);
                if (execute.getStatusLine().getStatusCode() != 200) {
                    return;
                }
                final JSONObject jsonObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                if (!PlaceInfo.z[15].equals(jsonObject.getString(PlaceInfo.z[18]))) {
                    return;
                }
                final JSONObject jsonObject2 = jsonObject.getJSONObject(PlaceInfo.z[16]);
                if (jsonObject2 == null) {
                    return;
                }
                try {
                    this.fromJsonGoogle(jsonObject2, true);
                    this.hasDetails = true;
                }
                catch (IOException ex) {
                    throw ex;
                }
            }
            catch (IOException ex2) {
                Log.b(ex2);
            }
            catch (JSONException ex3) {
                Log.b((Throwable)ex3);
            }
        }
        finally {}
    }
    
    public void downloadDetails() {
        while (true) {
            synchronized (this) {
                if (!this.hasDetails) {
                    Label_0054: {
                        switch (this.source) {
                            case 1: {
                                this.downloadDetailsGoogle();
                                if (App.I) {
                                    break Label_0054;
                                }
                                break;
                            }
                            case 3: {
                                this.downloadDetailsFacebook();
                                break;
                            }
                            default: {}
                        }
                    }
                }
            }
        }
    }
    
    public void fromJsonFacebook(final JSONObject jsonObject, final boolean b) {
        this.source = 3;
        this.name = jsonObject.getString(PlaceInfo.z[8]);
        this.placeId = jsonObject.optString(PlaceInfo.z[0]);
        this.icon = PlaceInfo.z[3];
        final JSONObject jsonObject2 = jsonObject.getJSONObject(PlaceInfo.z[2]);
        if (jsonObject2 != null) {
            this.lat = jsonObject2.optDouble(PlaceInfo.z[1]);
            this.lon = jsonObject2.optDouble(PlaceInfo.z[5]);
            this.address = jsonObject2.optString(PlaceInfo.z[10]);
            final String optString = jsonObject2.optString(PlaceInfo.z[4]);
            if (optString != null && !"".equals(optString)) {
                if (!TextUtils.isEmpty((CharSequence)this.address) && !this.address.endsWith(",")) {
                    this.address += PlaceInfo.z[12];
                }
                this.address += optString;
            }
            this.vicinity = this.address;
            final String optString2 = jsonObject2.optString(PlaceInfo.z[13]);
            if (optString2 != null && !"".equals(optString2)) {
                if (!TextUtils.isEmpty((CharSequence)this.address)) {
                    this.address += PlaceInfo.z[9];
                }
                this.address += optString2;
            }
        }
        final JSONObject optJSONObject = jsonObject.optJSONObject(PlaceInfo.z[6]);
        if (optJSONObject != null) {
            final JSONArray optJSONArray = optJSONObject.optJSONArray(PlaceInfo.z[7]);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                final JSONObject optJSONObject2 = optJSONArray.optJSONObject(0);
                if (optJSONObject2 != null) {
                    this.icon = optJSONObject2.optString(PlaceInfo.z[11]) + PlaceInfo.z[14];
                }
            }
        }
    }
    
    public void fromJsonFoursquare(final JSONObject jsonObject, final boolean b) {
        int i = 0;
        final boolean j = App.I;
        this.source = 2;
        this.name = jsonObject.getString(PlaceInfo.z[41]);
        this.url = jsonObject.optString(PlaceInfo.z[44]);
        this.placeId = jsonObject.optString(PlaceInfo.z[50]);
        if (this.url == null || "".equals(this.url)) {
            this.url = PlaceInfo.z[35] + this.placeId;
        }
        final JSONObject jsonObject2 = jsonObject.getJSONObject(PlaceInfo.z[39]);
        if (jsonObject2 != null) {
            this.lat = jsonObject2.optDouble(PlaceInfo.z[36]);
            this.lon = jsonObject2.optDouble(PlaceInfo.z[45]);
            this.address = jsonObject2.optString(PlaceInfo.z[37]);
            this.vicinity = this.address;
            final String optString = jsonObject2.optString(PlaceInfo.z[42]);
            if (optString != null && !"".equals(optString)) {
                if (this.address != null && !"".equals(this.address)) {
                    this.address += PlaceInfo.z[48];
                }
                this.address += optString;
            }
            final String optString2 = jsonObject2.optString(PlaceInfo.z[46]);
            if (optString2 != null && !"".equals(optString2)) {
                if (this.address != null && !"".equals(this.address)) {
                    this.address += PlaceInfo.z[33];
                }
                this.address += optString2;
            }
            final String optString3 = jsonObject2.optString(PlaceInfo.z[40]);
            if (optString3 != null && !"".equals(optString3)) {
                if (this.address != null && !"".equals(this.address)) {
                    this.address += " ";
                }
                this.address += optString3;
            }
            this.hasDetails = true;
        }
        final JSONArray optJSONArray = jsonObject.optJSONArray(PlaceInfo.z[49]);
        if (optJSONArray != null) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            while (i < optJSONArray.length()) {
                final JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null && optJSONObject2.optBoolean(PlaceInfo.z[43])) {
                    if (!j) {
                        optJSONObject = optJSONObject2;
                        break;
                    }
                    optJSONObject = optJSONObject2;
                }
                ++i;
                if (j) {
                    break;
                }
            }
            if (optJSONObject != null) {
                final JSONObject optJSONObject3 = optJSONObject.optJSONObject(PlaceInfo.z[38]);
                if (optJSONObject3 != null) {
                    this.icon = optJSONObject3.optString(PlaceInfo.z[47]);
                    if (this.icon != null) {
                        this.icon += PlaceInfo.z[34];
                    }
                }
            }
        }
    }
    
    public void fromJsonGoogle(final JSONObject jsonObject, final boolean b) {
        final boolean i = App.I;
        this.source = 1;
        this.name = jsonObject.getString(PlaceInfo.z[29]);
        this.placeId = jsonObject.optString(PlaceInfo.z[32]);
        this.vicinity = jsonObject.optString(PlaceInfo.z[25]);
        this.types = new HashSet();
        final JSONArray optJSONArray = jsonObject.optJSONArray(PlaceInfo.z[31]);
        if (optJSONArray != null) {
            int j = 0;
            while (j < optJSONArray.length()) {
                this.types.add(optJSONArray.getString(j));
                ++j;
                if (i) {
                    break;
                }
            }
        }
        final JSONObject jsonObject2 = jsonObject.getJSONObject(PlaceInfo.z[19]);
        if (jsonObject2 != null) {
            final JSONObject jsonObject3 = jsonObject2.getJSONObject(PlaceInfo.z[23]);
            if (jsonObject3 != null) {
                this.lat = jsonObject3.getDouble(PlaceInfo.z[26]);
                this.lon = jsonObject3.getDouble(PlaceInfo.z[22]);
            }
        }
        this.icon = jsonObject.optString(PlaceInfo.z[20]);
        if (b) {
            this.url = jsonObject.optString(PlaceInfo.z[28]);
            this.phone = jsonObject.optString(PlaceInfo.z[30]);
            this.address = jsonObject.optString(PlaceInfo.z[24]);
            this.rating = jsonObject.optString(PlaceInfo.z[21]);
            if (this.address != null) {
                this.address = this.address.replace(PlaceInfo.z[27], "");
            }
            this.hasDetails = true;
        }
    }
    
    public Location getLocation() {
        if (this.location == null) {
            (this.location = new Location("")).setLatitude(this.lat);
            this.location.setLongitude(this.lon);
        }
        return this.location;
    }
}
