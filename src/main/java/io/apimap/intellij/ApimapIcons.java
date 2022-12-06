package io.apimap.intellij;

import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class ApimapIcons {
    private static final String APIMAP_ICONS_PATH = "/META-INF/";

    @NotNull
    private static Icon getIcon(String path) {
        return IconLoader.getIcon(APIMAP_ICONS_PATH + path);
    }

    public static final Icon METADATA = getIcon("metadataFileIcon.svg");
    public static final Icon TAXONOMY = getIcon("taxonomyFileIcon.svg");
}
