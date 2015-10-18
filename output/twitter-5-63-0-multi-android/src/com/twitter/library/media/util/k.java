// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.media.ExifInterface;

public class k extends ExifInterface
{
    private HashMap a;
    
    public k(final String s, final boolean b) {
        super(s);
        this.a = new HashMap(45);
        if (b) {
            this.a();
        }
    }
    
    public void a() {
        final HashMap a = this.a;
        a.clear();
        a.put("FNumber", super.getAttribute("FNumber"));
        a.put("ExposureTime", super.getAttribute("ExposureTime"));
        a.put("ISOSpeedRatings", super.getAttribute("ISOSpeedRatings"));
        a.put("GPSAltitude", super.getAttribute("GPSAltitude"));
        a.put("GPSAltitudeRef", super.getAttribute("GPSAltitudeRef"));
        a.put("DateTime", super.getAttribute("DateTime"));
        a.put("Flash", super.getAttribute("Flash"));
        a.put("FocalLength", super.getAttribute("FocalLength"));
        a.put("GPSDateStamp", super.getAttribute("GPSDateStamp"));
        a.put("GPSLatitude", super.getAttribute("GPSLatitude"));
        a.put("GPSLatitudeRef", super.getAttribute("GPSLatitudeRef"));
        a.put("GPSLongitude", super.getAttribute("GPSLongitude"));
        a.put("GPSLongitudeRef", super.getAttribute("GPSLongitudeRef"));
        a.put("GPSProcessingMethod", super.getAttribute("GPSProcessingMethod"));
        a.put("GPSTimeStamp", super.getAttribute("GPSTimeStamp"));
        a.put("ImageLength", super.getAttribute("ImageLength"));
        a.put("ImageWidth", super.getAttribute("ImageWidth"));
        a.put("Make", super.getAttribute("Make"));
        a.put("Model", super.getAttribute("Model"));
        a.put("Orientation", super.getAttribute("Orientation"));
        a.put("WhiteBalance", super.getAttribute("WhiteBalance"));
        a.put("ExposureBiasValue", super.getAttribute("ExposureBiasValue"));
        a.put("DateTimeOriginal", super.getAttribute("DateTimeOriginal"));
        a.put("FocalLengthIn35mmFilm", super.getAttribute("FocalLengthIn35mmFilm"));
        a.put("ShutterSpeedValue", super.getAttribute("ShutterSpeedValue"));
        a.put("SubjectDistance", super.getAttribute("SubjectDistance"));
        a.put("SubjectDistanceRange", super.getAttribute("SubjectDistanceRange"));
        a.put("LightSource", super.getAttribute("LightSource"));
        a.put("MeteringMode", super.getAttribute("MeteringMode"));
        a.put("ExposureProgram", super.getAttribute("ExposureProgram"));
        a.put("ExposureMode", super.getAttribute("ExposureMode"));
        a.put("DigitalZoomRatio", super.getAttribute("DigitalZoomRatio"));
        a.put("CompressedBitsPerPixel", super.getAttribute("CompressedBitsPerPixel"));
        a.put("Copyright", super.getAttribute("Copyright"));
        a.put("Software", super.getAttribute("Software"));
        a.put("Artist", super.getAttribute("Artist"));
        a.put("UserComment", super.getAttribute("UserComment"));
        a.put("ResolutionUnit", super.getAttribute("ResolutionUnit"));
        a.put("XResolution", super.getAttribute("XResolution"));
        a.put("YResolution", super.getAttribute("YResolution"));
        a.put("BrightnessValue", super.getAttribute("BrightnessValue"));
        a.put("FileDateTime", super.getAttribute("FileDateTime"));
    }
    
    public void a(final ImageOrientation imageOrientation) {
        this.setAttribute("Orientation", String.valueOf(imageOrientation.exifOrientation));
    }
    
    public void a(final k k) {
        this.a.clear();
        this.a.putAll(k.a);
    }
    
    public String getAttribute(final String s) {
        return this.a.get(s);
    }
    
    public void saveAttributes() {
        for (final Map.Entry<K, String> entry : this.a.entrySet()) {
            final String s = entry.getValue();
            if (s != null) {
                super.setAttribute((String)entry.getKey(), s);
            }
        }
        super.saveAttributes();
    }
    
    public void setAttribute(final String s, final String s2) {
        if (s != null && s2 != null) {
            this.a.put(s, s2.trim());
        }
    }
}
