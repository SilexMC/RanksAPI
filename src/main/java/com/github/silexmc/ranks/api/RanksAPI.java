package com.github.silexmc.ranks.api;

import com.github.silexmc.ranks.api.impl.prestige.IPrestige;
import com.github.silexmc.ranks.api.impl.rank.IRank;

import java.util.UUID;

public interface RanksAPI {
    IRank getRank(int identifier);

    IRank getRank(UUID uniqueID);

    IPrestige getPrestige(int identifier);

    IPrestige getPrestige(UUID uniqueID);
}
