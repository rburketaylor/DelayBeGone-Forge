package com.iamtis.DelayBeGone.Events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


@Mod.EventBusSubscriber(modid = "delaybegone", bus = Bus.FORGE, value = Dist.CLIENT)
public class IsBlockingEventHandler {
    @SubscribeEvent
    public static void removeBlockingDelay(LivingEntityUseItemEvent event){
        if(event.getItem().isShield(null)){
            event.setDuration(100);
        }
    }
}
