// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

import java.util.regex.Matcher;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.List;
import java.util.Iterator;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.Box;
import java.util.regex.Pattern;

public class Path
{
    static Pattern component;
    
    static {
        Path.component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }
    
    public static String createPath(final Box box) {
        return createPath(box, "");
    }
    
    private static String createPath(final Box box, final String s) {
        final Container parent = box.getParent();
        int n = 0;
        for (final Box box2 : parent.getBoxes()) {
            if (box2.getType().equals(box.getType())) {
                if (box2 == box) {
                    break;
                }
                ++n;
            }
        }
        String s2 = String.valueOf(String.format("/%s[%d]", box.getType(), n)) + s;
        if (parent instanceof Box) {
            s2 = createPath((Box)parent, s2);
        }
        return s2;
    }
    
    public static Box getPath(final Box box, final String s) {
        final List<Box> paths = getPaths(box, s, true);
        if (paths.isEmpty()) {
            return null;
        }
        return paths.get(0);
    }
    
    public static Box getPath(final Container container, final String s) {
        final List<Box> paths = getPaths(container, s, true);
        if (paths.isEmpty()) {
            return null;
        }
        return paths.get(0);
    }
    
    public static Box getPath(final AbstractContainerBox abstractContainerBox, final String s) {
        final List<Box> paths = getPaths(abstractContainerBox, s, true);
        if (paths.isEmpty()) {
            return null;
        }
        return paths.get(0);
    }
    
    public static List<Box> getPaths(final Box box, final String s) {
        return getPaths(box, s, false);
    }
    
    private static List<Box> getPaths(final Box box, final String s, final boolean b) {
        return getPaths((Object)box, s, b);
    }
    
    public static List<Box> getPaths(final Container container, final String s) {
        return getPaths(container, s, false);
    }
    
    private static List<Box> getPaths(final Container container, final String s, final boolean b) {
        return getPaths((Object)container, s, b);
    }
    
    public static List<Box> getPaths(final AbstractContainerBox abstractContainerBox, final String s) {
        return getPaths(abstractContainerBox, s, false);
    }
    
    private static List<Box> getPaths(final AbstractContainerBox abstractContainerBox, final String s, final boolean b) {
        return getPaths((Object)abstractContainerBox, s, b);
    }
    
    private static List<Box> getPaths(Object parent, String substring, final boolean b) {
        Object o;
        if (substring.startsWith("/")) {
            substring = substring.substring(1);
            while (parent instanceof Box) {
                parent = ((Box)parent).getParent();
            }
            o = parent;
        }
        else {
            o = parent;
        }
        List<Box> singletonList;
        if (substring.length() == 0) {
            if (!(o instanceof Box)) {
                throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
            }
            singletonList = Collections.singletonList(o);
        }
        else {
            String substring2;
            String substring3;
            if (substring.contains("/")) {
                substring2 = substring.substring(1 + substring.indexOf(47));
                substring3 = substring.substring(0, substring.indexOf(47));
            }
            else {
                substring3 = substring;
                substring2 = "";
            }
            final Matcher matcher = Path.component.matcher(substring3);
            if (!matcher.matches()) {
                throw new RuntimeException(String.valueOf(substring3) + " is invalid path.");
            }
            final String group = matcher.group(1);
            if ("..".equals(group)) {
                if (o instanceof Box) {
                    return getPaths(((Box)o).getParent(), substring2, b);
                }
                return Collections.emptyList();
            }
            else {
                if (!(o instanceof Container)) {
                    return Collections.emptyList();
                }
                int int1 = -1;
                if (matcher.group(2) != null) {
                    int1 = Integer.parseInt(matcher.group(3));
                }
                singletonList = new LinkedList<Box>();
                int n = 0;
                for (final Box box : ((Container)o).getBoxes()) {
                    if (box.getType().matches(group)) {
                        if (int1 == -1 || int1 == n) {
                            singletonList.addAll(getPaths(box, substring2, b));
                        }
                        ++n;
                    }
                    if ((b || int1 >= 0) && !singletonList.isEmpty()) {
                        return singletonList;
                    }
                }
            }
        }
        return singletonList;
    }
    
    public static boolean isContained(final Box box, final String s) {
        assert s.startsWith("/") : "Absolute path required";
        return getPaths(box, s).contains(box);
    }
}
