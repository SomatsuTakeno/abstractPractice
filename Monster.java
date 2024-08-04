/**
 * キャラクター「Monster」のクラス
 * @author S.Takeno
 */
public class Monster extends Character {

    public Monster() {
        name = "Monster";
        hp = 200;
        attackPower = 70;
    }

    /**
     * 敵に攻撃する
     */
    @Override
    public void attack(Character target) {
        target.hp -= attackPower;
        System.out.println(name + "の雷攻撃！" + target.name + "に" + attackPower + "のダメージ！");
        target.checkHealth();
    }
}
