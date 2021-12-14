package com.iamtis.DelayBeGone.Events;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


@Mod.EventBusSubscriber(modid = "delaybegone", bus = Bus.FORGE, value = Dist.CLIENT)
public class IsBlockingEventHandler {
    @SubscribeEvent
    public static void removeBlockingDelay(LivingEntityUseItemEvent event){
        ShieldItem shield = new ShieldItem(new Item.Properties());
        System.out.println(event.getItem());
        System.out.println(shield);

        if(event.getItem().getItem().equals(shield)){
            event.setDuration(100);
        }
    }
}
