package gtfoaddn.common.items;

import static gtfoaddn.common.items.GTFOAddnMetaItems.*;
import gregtech.api.items.metaitem.StandardMetaItem;

public class GTFOAddnMetaItem1 extends StandardMetaItem {

    public GTFOAddnMetaItem1() {
        super();
    }

    @Override
    public void registerSubItems() {
        WOODEN_HARD_HAMMER_HEAD = addItem(1, "wooden.hard.hammer.head");
    }
}
