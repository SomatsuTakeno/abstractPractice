/**
 * キャラクター「Boyfriend」のクラス
 * @author S.Takeno
 */
public class Boyfriend extends Character {

    public Boyfriend() {
        name = "Boyfriend";
        hp = 100;
        attackPower = 40;
    }

    /**
     * 敵に攻撃する
     */
    @Override
    public void attack(Character target) {
        target.hp -= attackPower;
        System.out.println(name + "はマイクを投げた！" + target.name + "に" + attackPower + "のダメージ！");
        target.checkHealth();
    }
}