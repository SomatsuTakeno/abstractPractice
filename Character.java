/**
 * 各キャラクターの共通点をまとめた抽象クラス
 * @author S.Takeno
 */
public abstract class Character extends Object {
    /**
     * 名前
     */
    String name;

    /**
     * 体力
     */
    int hp;

    /**
     * 攻撃力
     */
    int attackPower;

    /**
     * 歌って自分の攻撃力を1.5倍にする
     */
    public void sing() {
        attackPower *= 1.5;
        System.out.println(name + "は歌う！攻撃力が1.5倍になった！");
    }

    /**
     * 薬を飲んで体力を50回復する
     */
    public void useItem() {
        hp += 50;
        System.out.println(name + "は薬を飲む！体力が50回復した！");
    }

    /**
     * 体力の確認
     * 0以下なら死亡メッセージを出す
     */
    public void checkHealth() {
        if (hp <= 0) {
            System.out.println(name + "は死んでしまった！");
        }
    }

    /**
     * 抽象メソッド
     * 敵に攻撃する
     * 攻撃の中身は子クラスに任せる
     * 
     * @param target 攻撃相手
     */
    public abstract void attack(Character target);
}