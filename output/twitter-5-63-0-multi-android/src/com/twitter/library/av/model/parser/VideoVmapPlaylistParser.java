// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model.parser;

import com.twitter.library.av.model.Video;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import org.w3c.dom.NamedNodeMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import android.text.TextUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import android.content.Context;
import com.twitter.library.av.model.VideoCta;
import java.util.Map;

public class VideoVmapPlaylistParser extends e
{
    private static final String[] o;
    long f;
    String g;
    String h;
    long i;
    String j;
    String k;
    VideoVmapPlaylistParser$TwitterVmapVersion l;
    Map m;
    Map n;
    private VideoCta p;
    private VideoCta q;
    
    static {
        o = new String[] { "cta_download_app", "cta_open_url", "cta_watch_now" };
    }
    
    public VideoVmapPlaylistParser(final Context context, final int n) {
        super(context, n);
    }
    
    private VideoVmapPlaylistParser$TwitterVmapVersion a(final Document document) {
        VideoVmapPlaylistParser$TwitterVmapVersion videoVmapPlaylistParser$TwitterVmapVersion = VideoVmapPlaylistParser$TwitterVmapVersion.a;
        final NodeList elementsByTagNameNS = document.getElementsByTagNameNS("http://twitter.com/schema/videoVMapV2.xsd", "*");
        if (elementsByTagNameNS != null && elementsByTagNameNS.getLength() > 0) {
            videoVmapPlaylistParser$TwitterVmapVersion = VideoVmapPlaylistParser$TwitterVmapVersion.b;
        }
        return videoVmapPlaylistParser$TwitterVmapVersion;
    }
    
    private void a(final Map map, final Node node) {
        final String attribute = ((Element)node).getAttribute("event");
        final String textContent = node.getTextContent();
        if (!TextUtils.isEmpty((CharSequence)attribute) && !TextUtils.isEmpty((CharSequence)textContent)) {
            final String trim = attribute.trim();
            final String trim2 = textContent.trim();
            List<String> list = map.get(trim);
            if (list == null) {
                list = new ArrayList<String>();
                map.put(trim, list);
            }
            list.add(trim2);
        }
    }
    
    private void a(final Element element, final boolean b, final Map map) {
        NodeList list;
        if (this.l == VideoVmapPlaylistParser$TwitterVmapVersion.a && b) {
            list = element.getElementsByTagName("tw:TrackingEvents");
        }
        else {
            list = element.getElementsByTagName("TrackingEvents");
        }
        if (list != null && list.getLength() > 0) {
            final NodeList elementsByTagName = ((Element)list.item(0)).getElementsByTagName("Tracking");
            for (int length = elementsByTagName.getLength(), i = 0; i < length; ++i) {
                this.a(map, elementsByTagName.item(i));
            }
        }
    }
    
    private void a(final NodeList list, final String s, final Map map) {
        List<?> list2 = map.get(s);
        for (int i = 0; i < list.getLength(); ++i) {
            final String textContent = list.item(i).getTextContent();
            if (!TextUtils.isEmpty((CharSequence)textContent)) {
                if (list2 == null) {
                    list2 = new ArrayList<Object>();
                    map.put(s, list2);
                }
                list2.add(textContent.trim());
            }
        }
    }
    
    private boolean a(final Element element) {
        NodeList list;
        if (this.l != VideoVmapPlaylistParser$TwitterVmapVersion.a) {
            list = element.getElementsByTagNameNS("http://twitter.com/schema/videoVMapV2.xsd", "ad");
        }
        else {
            list = element.getElementsByTagName("tw:ad");
        }
        if (list == null || list.getLength() <= 0) {
            return false;
        }
        final Element element2 = (Element)list.item(0);
        final String attribute = element2.getAttribute("ownerId");
        if (TextUtils.isEmpty((CharSequence)attribute)) {
            return false;
        }
        this.i = Long.parseLong(attribute);
        this.j = element2.getAttribute("adId");
        if (TextUtils.isEmpty((CharSequence)this.j)) {
            return false;
        }
        this.q = this.b(element2);
        return true;
    }
    
    private VideoCta b(final Element element) {
        int i = 0;
        final String[] o = VideoVmapPlaylistParser.o;
        final int length = o.length;
        int n = 0;
        VideoCta videoCta;
        while (true) {
            videoCta = null;
            if (n >= length) {
                break;
            }
            final String s = o[n];
            final Element a = this.a(s, element);
            if (a != null) {
                final HashMap<String, String> hashMap = new HashMap<String, String>();
                final NamedNodeMap attributes = a.getAttributes();
                if (attributes != null) {
                    while (i < attributes.getLength()) {
                        final Node item = attributes.item(i);
                        hashMap.put(item.getNodeName(), item.getNodeValue());
                        ++i;
                    }
                    if ("cta_download_app".equals(s)) {
                        final String textContent = a.getTextContent();
                        if (textContent != null) {
                            hashMap.put(VideoCta.a, textContent.trim());
                        }
                    }
                    final int size = hashMap.size();
                    videoCta = null;
                    if (size > 0) {
                        videoCta = new VideoCta(s, hashMap);
                        break;
                    }
                    break;
                }
            }
            ++n;
        }
        return videoCta;
    }
    
    private boolean b(final Document document) {
        NodeList list;
        if (this.l == VideoVmapPlaylistParser$TwitterVmapVersion.a) {
            list = document.getDocumentElement().getElementsByTagName("tw:content");
        }
        else {
            list = document.getDocumentElement().getElementsByTagNameNS("http://twitter.com/schema/videoVMapV2.xsd", "content");
        }
        if (list == null || list.getLength() <= 0) {
            return false;
        }
        final Element element = (Element)list.item(0);
        final String attribute = element.getAttribute("ownerId");
        if (TextUtils.isEmpty((CharSequence)attribute)) {
            return false;
        }
        this.f = Long.parseLong(attribute);
        this.g = element.getAttribute("contentId");
        if (TextUtils.isEmpty((CharSequence)this.g)) {
            return false;
        }
        this.h = this.c(element);
        if (this.h == null) {
            return false;
        }
        Element element2;
        if (this.l == VideoVmapPlaylistParser$TwitterVmapVersion.a) {
            element2 = (Element)element.getParentNode();
        }
        else {
            element2 = element;
        }
        this.p = this.b(element);
        Map n = new HashMap();
        this.a(element2, true, n);
        if (n.isEmpty()) {
            n = null;
        }
        this.n = n;
        return true;
    }
    
    private String c(final Element element) {
        final NodeList elementsByTagName = element.getElementsByTagName("MediaFile");
        String textContent;
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            textContent = null;
        }
        else {
            textContent = ((Element)elementsByTagName.item(0)).getTextContent();
            if (!TextUtils.isEmpty((CharSequence)textContent)) {
                return textContent.trim();
            }
        }
        return textContent;
    }
    
    private boolean c(final Document document) {
        final NodeList elementsByTagName = document.getDocumentElement().getElementsByTagName("Ad");
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return false;
        }
        final Element element = (Element)elementsByTagName.item(0);
        final NodeList elementsByTagName2 = document.getElementsByTagName("Extensions");
        int n2;
        if (elementsByTagName2 != null) {
            boolean a;
            for (int n = 0, n2 = 0; n2 == 0 && n < elementsByTagName2.getLength(); ++n, n2 = (a ? 1 : 0)) {
                a = this.a((Element)elementsByTagName2.item(n));
            }
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            return false;
        }
        this.k = this.c(element);
        if (this.k == null) {
            return false;
        }
        final HashMap hashMap = new HashMap();
        this.a(element, false, hashMap);
        final NodeList elementsByTagName3 = element.getElementsByTagName("Impression");
        if (elementsByTagName3 != null) {
            this.a(elementsByTagName3, "impressionTag", hashMap);
        }
        final NodeList elementsByTagName4 = element.getElementsByTagName("Error");
        if (elementsByTagName4 != null) {
            this.a(elementsByTagName4, "errorTag", hashMap);
        }
        Map m;
        if (!hashMap.isEmpty()) {
            m = hashMap;
        }
        else {
            m = null;
        }
        this.m = m;
        return true;
    }
    
    Element a(final String s, final Element element) {
        final NodeList elementsByTagNameNS = element.getElementsByTagNameNS("http://twitter.com/schema/videoVMapV2.xsd", s);
        Element element2 = null;
        if (elementsByTagNameNS != null) {
            final int length = elementsByTagNameNS.getLength();
            element2 = null;
            if (length > 0) {
                element2 = (Element)elementsByTagNameNS.item(0);
                if ("cta_download_app".equals(s)) {
                    final NodeList elementsByTagNameNS2 = element2.getElementsByTagNameNS("http://twitter.com/schema/videoVMapV2.xsd", "play_store");
                    if (elementsByTagNameNS2 != null && elementsByTagNameNS2.getLength() > 0) {
                        element2 = (Element)elementsByTagNameNS2.item(0);
                    }
                }
            }
        }
        return element2;
    }
    
    @Override
    protected void a(final InputStream is) {
        final DocumentBuilderFactory instance = DocumentBuilderFactory.newInstance();
        instance.setNamespaceAware(true);
        final Document parse = instance.newDocumentBuilder().parse(is);
        this.l = this.a(parse);
        if (this.b(parse)) {
            if (!this.c(parse)) {
                (this.a = new Video[1])[0] = new Video(this.g, "video", this.f, this.h, true, this.n, this.p);
                return;
            }
            (this.a = new Video[2])[0] = new Video(this.j, "ad", this.i, this.k, false, this.m, this.q);
            this.a[1] = new Video(this.g, "video", this.f, this.h, true, this.n, this.p);
        }
    }
}
