package JavaStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//这是一张牌
class Card{
    private String rank;//点数，因为有J,Q,K,A所以不用int，用String
    private String suit;//花色
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;

    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
//        return "Card{" +
//                "rank='" + rank + '\'' +
//                ", suit='" + suit + '\'' +
//                '}';
        return "[" + this.rank + this.suit + "]";
    }
}
public class Poker {
    public static void main(String[] args) {
        List<Card> poker = buypoker();
        //洗牌
        Collections.shuffle(poker);//Collections.shuffle()会把List中的元素会随机打乱
        //发牌
        //假设有三个玩家，每个玩家发五张牌（梭哈）
        //每个玩家就是一个List，就可以把牌放到List中，再把所有玩家的信息放到一个List中
        List<List<Card>> palyers = new ArrayList<>();//palyers表示所有玩家的手牌，每个元素就是一个玩家的所有手牌（也是一个List）
        palyers.add(new ArrayList<Card>());
        palyers.add(new ArrayList<Card>());
        palyers.add(new ArrayList<Card>());
        //给三个玩家每一个人发五张牌
        //i表示每一个玩家应该得到的牌的数量，j表示玩家数
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <3 ; j++) {
                List<Card> palyer = palyers.get (j);
                palyer.add(poker.remove(0));//remove 表示删除List指定下表的元素，并返回这个被删除元素的值

            }
        }
        //到这一步发牌结束，可以查看玩家的手牌
        for (int m = 0; m <3 ; m++) {
            System.out.println("玩家" + m + ":" + palyers.get(m));
        }
    }

    private static List<Card> buypoker(){
        List<Card> poker = new ArrayList<>();
        String[] suits = {"♥","♠","♣","♦"};
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <=10 ; j++) {
                //j表示点数，"" + j 表示整数转字符串
                poker.add(new Card(""+ j ,suits[i]));
            }
            poker.add(new Card("J",suits[i]));
            poker.add(new Card("Q",suits[i]));
            poker.add(new Card("K",suits[i]));
            poker.add(new Card("A",suits[i]));
        }
        return  poker;
    }
}
