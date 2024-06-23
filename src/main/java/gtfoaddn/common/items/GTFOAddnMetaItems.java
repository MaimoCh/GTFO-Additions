package gtfoaddn.common.items;

import gregtech.api.items.metaitem.MetaItem;

public final class GTFOAddnMetaItems {

    private GTFOAddnMetaItems() {}

//    public static MetaItem<?>.MetaValueItem WOODEN_HARD_HAMMER_HEAD;

    public static void init() {
        GTFOAddnMetaItem1 metaItem1 = new GTFOAddnMetaItem1();
        metaItem1.setRegistryName("meta_item_1");
    }
}
