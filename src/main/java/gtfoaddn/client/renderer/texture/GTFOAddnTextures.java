package gtfoaddn.client.renderer.texture;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;

public class GTFOAddnTextures {
    public static OrientedOverlayRenderer FAT_BURNING_GENERATOR_OVERLAY;
    public static void init() {
        FAT_BURNING_GENERATOR_OVERLAY = new OrientedOverlayRenderer("generators/burning");
    }
}
