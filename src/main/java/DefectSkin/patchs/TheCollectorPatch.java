package DefectSkin.patchs;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpireReturn;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.monsters.city.TheCollector;
import com.megacrit.cardcrawl.monsters.city.TorchHead;
import com.megacrit.cardcrawl.relics.AbstractRelic;

public class TheCollectorPatch {
    @SpirePatch(clz = TheCollector.class, method = "update"
           )
    public static class ChangeCardDataPrePlay {
        @SpireInsertPatch(rloc=1)
        public static SpireReturn Prefix(TheCollector __instance) {
           return SpireReturn.Continue();

        }
}
@SpirePatch(clz = TorchHead.class, method = "update"
    )
    public static class TorchHeadPatch {
        @SpireInsertPatch(rloc=2)
        public static SpireReturn Prefix(TorchHead __instance) {

            return SpireReturn.Continue();

        }
    }

}
