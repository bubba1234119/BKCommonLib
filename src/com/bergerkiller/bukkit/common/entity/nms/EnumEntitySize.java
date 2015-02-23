package com.bergerkiller.bukkit.common.entity.nms;

import net.minecraft.server.v1_8_R1.MathHelper;

public enum EnumEntitySize
{
    SIZE_1("SIZE_1", 0), 
    SIZE_2("SIZE_2", 1), 
    SIZE_3("SIZE_3", 2), 
    SIZE_4("SIZE_4", 3), 
    SIZE_5("SIZE_5", 4), 
    SIZE_6("SIZE_6", 5);
  
    public int a(final double n) {
        final double n2 = n - (MathHelper.floor(n) + 0.5);
        switch (EntitySizes.a[this.ordinal()]) {
            case 1: {
                if (n2 < 0.0) {
                    if (n2 >= -0.3125) {
                        return MathHelper.floor(n * 32.0);
                    }
                }
                else if (n2 >= 0.3125) {
                    return MathHelper.floor(n * 32.0);
                }
                return MathHelper.f(n * 32.0);
            }
            case 2: {
                if (n2 < 0.0) {
                    if (n2 >= -0.3125) {
                        return MathHelper.f(n * 32.0);
                    }
                }
                else if (n2 >= 0.3125) {
                    return MathHelper.f(n * 32.0);
                }
                return MathHelper.floor(n * 32.0);
            }
            case 3: {
                if (n2 > 0.0) {
                    return MathHelper.floor(n * 32.0);
                }
                return MathHelper.f(n * 32.0);
            }
            case 4: {
                if (n2 < 0.0) {
                    if (n2 >= -0.1875) {
                        return MathHelper.floor(n * 32.0);
                    }
                }
                else if (n2 >= 0.1875) {
                    return MathHelper.floor(n * 32.0);
                }
                return MathHelper.f(n * 32.0);
            }
            case 5: {
                if (n2 < 0.0) {
                    if (n2 >= -0.1875) {
                        return MathHelper.f(n * 32.0);
                    }
                }
                else if (n2 >= 0.1875) {
                    return MathHelper.f(n * 32.0);
                }
                return MathHelper.floor(n * 32.0);
            }
            default: {
                if (n2 > 0.0) {
                    return MathHelper.f(n * 32.0);
                }
                return MathHelper.floor(n * 32.0);
            }
        }
    }
}