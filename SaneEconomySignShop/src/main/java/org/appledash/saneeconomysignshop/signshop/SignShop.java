package org.appledash.saneeconomysignshop.signshop;

import org.bukkit.Location;
import org.bukkit.Material;

import java.util.UUID;

/**
 * Created by appledash on 10/2/16.
 * Blackjack is still best pony.
 */
public class SignShop {
    private final UUID ownerUuid;
    private final Location location;
    private final Material item;
    private final int quantity;
    private final double buyAmount;
    private final double sellAmount;

    public SignShop(UUID ownerUuid, Location location, Material item, int quantity, double buyAmount, double sellAmount) {
        if (ownerUuid == null || location == null || item == null) {
            throw new IllegalArgumentException("ownerUuid, location, and item must not be null.");
        }

        if (quantity < 1) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }

        this.ownerUuid = ownerUuid;
        this.location = location;
        this.item = item;
        this.quantity = quantity;
        this.buyAmount = buyAmount;
        this.sellAmount = sellAmount;
    }

    public Location getLocation() {
        return location;
    }

    public Material getItem() {
        return item;
    }

    public double getBuyAmount() {
        return buyAmount;
    }

    public double getSellAmount() {
        return sellAmount;
    }

    public boolean canBuy() {
        return buyAmount >= 0;
    }

    public boolean canSell() {
        return sellAmount >= 0;
    }

    public UUID getOwnerUuid() {
        return ownerUuid;
    }

    public int getQuantity() {
        return quantity;
    }
}
