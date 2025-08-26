package DefectSkin.patchs;

import DefectSkin.utils.Invoker;
import com.esotericsoftware.spine.AnimationState;
import com.esotericsoftware.spine.AnimationStateData;
import com.evacipated.cardcrawl.modthespire.lib.*;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.characters.Defect;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.monsters.city.TheCollector;
import com.megacrit.cardcrawl.monsters.city.TorchHead;
import com.megacrit.cardcrawl.orbs.Dark;
import com.megacrit.cardcrawl.orbs.Lightning;
import com.megacrit.cardcrawl.relics.AbstractRelic;

public class TheCollectorPatch {
    public static boolean ison=false;
    @SpirePatch(clz = Defect.class, method =SpirePatch.CONSTRUCTOR
           )
    public static class ChangeCardDataPrePlay {
        @SpirePostfixPatch
        public static SpireReturn PostfIx(Defect __instance) {
            System.out.println(__instance.state);
            Invoker.invoke(__instance,"loadAnimation","images/characters/defect/change/skeleton.atlas", "images/characters/defect/change/skeleton.json", 1.0F);
            AnimationState.TrackEntry e = __instance.state.setAnimation(0, "change1", false);
            AnimationStateData stateData= Invoker.getField(__instance,"stateData");
           stateData.setMix("change1", "change2", 0.1F);
            e.setTimeScale(0.9F);
           return SpireReturn.Continue();

        }
}  @SpirePatch(clz = Defect.class, method ="damage"
    )
    public static class DamagePatch {
        @SpirePostfixPatch
        public static SpireReturn PostfIx(Defect __instance, DamageInfo info) {

            if (info.owner != null && info.type != DamageInfo.DamageType.THORNS && info.output - __instance.currentBlock > 0) {
                if (ison){
                    AnimationState.TrackEntry e = AbstractDungeon.player.state.setAnimation(0, "change2", false);
                    ison=!ison;
                    e.setTime(0.9F);
                }else {
                    AnimationState.TrackEntry e = AbstractDungeon.player.state.setAnimation(0, "change1", false);
                    ison=!ison;
                    e.setTime(0.9F);
                }
            }

            return SpireReturn.Continue(); }
    } @SpirePatch(clz = Lightning.class, method ="onEvoke"
    )
    public static class LightningPatch {
        @SpirePostfixPatch
        public static SpireReturn PostfIx(Lightning __instance) {
            if (!(AbstractDungeon.player.chosenClass == AbstractPlayer.PlayerClass.DEFECT))
            {return SpireReturn.Continue();}
            if (ison){
                AnimationState.TrackEntry e = AbstractDungeon.player.state.setAnimation(0, "change2", false);
                ison=!ison;
                e.setTime(0.9F);
            }else {
                AnimationState.TrackEntry e = AbstractDungeon.player.state.setAnimation(0, "change1", false);
                ison=!ison;
                e.setTime(0.9F);
            }

            return SpireReturn.Continue(); }
    }@SpirePatch(clz = Lightning.class, method ="onEndOfTurn"
    )
    public static class LightningonEndOfTurnPatch {
        @SpirePostfixPatch
        public static SpireReturn PostfIx(Lightning __instance) {
            if (!(AbstractDungeon.player.chosenClass == AbstractPlayer.PlayerClass.DEFECT))
            {return SpireReturn.Continue();}
            if (ison){
                AnimationState.TrackEntry e = AbstractDungeon.player.state.setAnimation(0, "change2", false);
                ison=!ison;
                e.setTime(0.9F);
            }else {
                AnimationState.TrackEntry e = AbstractDungeon.player.state.setAnimation(0, "change1", false);
                ison=!ison;
                e.setTime(0.9F);
            }

            return SpireReturn.Continue(); }
    }@SpirePatch(clz = Dark.class, method ="onEvoke"
    )
    public static class DarkEvokePatch {
        @SpirePostfixPatch
        public static SpireReturn PostfIx(Dark __instance) {
            if (!(AbstractDungeon.player.chosenClass == AbstractPlayer.PlayerClass.DEFECT))
            {return SpireReturn.Continue();}
            if (ison){
                AnimationState.TrackEntry e = AbstractDungeon.player.state.setAnimation(0, "change2", false);
                ison=!ison;
                e.setTime(0.9F);
            }else {
                AnimationState.TrackEntry e = AbstractDungeon.player.state.setAnimation(0, "change1", false);
                ison=!ison;
                e.setTime(0.9F);
            }

            return SpireReturn.Continue(); }
    }
}
