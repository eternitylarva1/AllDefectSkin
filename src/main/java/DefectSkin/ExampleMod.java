/*     */
package DefectSkin;
/*     */ 
/*     */ import basemod.BaseMod;
/*     */
import basemod.interfaces.EditCardsSubscriber;
/*     */ import basemod.interfaces.ISubscriber;
/*     */ import basemod.interfaces.PostDungeonInitializeSubscriber;
/*     */ import basemod.interfaces.PostInitializeSubscriber;
/*     */ import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
/*     */ import com.megacrit.cardcrawl.core.CardCrawlGame;
/*     */ import com.megacrit.cardcrawl.core.Settings;
/*     */ import com.megacrit.cardcrawl.localization.LocalizedStrings;
import com.megacrit.cardcrawl.monsters.beyond.OrbWalker;
import com.megacrit.cardcrawl.monsters.exordium.TheGuardian;
import com.megacrit.cardcrawl.rooms.MonsterRoom;
import com.megacrit.cardcrawl.rooms.MonsterRoomBoss;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SpireInitializer
/*     */ public class ExampleMod
/*     */   implements EditCardsSubscriber
/*     */ {
/*     */   public ExampleMod() {
/*  32 */     BaseMod.subscribe((ISubscriber)this);

/*     */   }
/*     */   
/*     */   public static void initialize() {
/*  36 */     new ExampleMod();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void receiveEditCards() {}
}
