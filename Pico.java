/**
 * キャラクター「Pico」のクラス
 * @author S.Takeno
 */
public class Pico extends Character {

    public Pico() {
        name = "Pico";
        hp = 120;
        attackPower = 50;
    }

    /**
     * 敵に攻撃する
     */
    @Override
    public void attack(Character target) {
        target.hp -= attackPower;
        System.out.println(name + "は銃を撃った！" + target.name + "に" + attackPower + "のダメージ！");
        target.checkHealth();
    }
}
