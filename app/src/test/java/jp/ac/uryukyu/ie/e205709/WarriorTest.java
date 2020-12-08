package jp.ac.uryukyu.ie.e205709;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * ウエポンアタックを３回実行し、３回ともアタックの150%のダメージが入っているか検証
     * 勇者のHPを100と設定
     * デフォルトアタックを10と設定
     * スライムもどきの体力を100と設定
     * for文でウエポンアタックを３回実行し検証する
     */
    @Test
    void attackTest() {
        int defaultWarriorHp = 100;
        int defaultAttack = 10;
        int assumeAttack = 15;
        int beforeAttackEnemyHP = 100; 
        Warrior demoWarrior = new Warrior("デモ勇者", defaultWarriorHp, defaultAttack);
        Enemy slime = new Enemy("スライムもどき", beforeAttackEnemyHP, 100);
        for(int i=0; i < 3; i++){
            beforeAttackEnemyHP = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(assumeAttack, beforeAttackEnemyHP - slime.getHitPoint());
        }
    }
    
}