package io.paper.tempweb.events;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class BlockManager {
    public static List<Player> builderList;

    static {
        BlockManager.builderList = new ArrayList<Player>();
    }
}
