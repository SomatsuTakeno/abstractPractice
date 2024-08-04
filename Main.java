/**
 * RPGもどき
 * @author S.Takeno
 */
public class Main extends Object {
    public static void main(String[] args) {

        /**
         * インスタンス生成
         */
        Pico aPico = new Pico();
        Boyfriend aBoyfriend = new Boyfriend();
        Monster aMonster = new Monster();

        /**
         * 戦闘開始 1ターン目
         */
        System.out.println("モンスターが現れた！");
        aPico.attack(aMonster);
        aBoyfriend.sing();
        aMonster.attack(aBoyfriend);
        System.out.println();

        /**
         * 2ターン目
         */
        aPico.useItem();
        aBoyfriend.attack(aMonster);
        aMonster.attack(aBoyfriend);
    }
}
