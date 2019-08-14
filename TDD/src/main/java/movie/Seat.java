package movie;

public class Seat {
    final int WON = 1000;
    int money = 0;
    boolean seat[] = new boolean[10];
    int price[] = new int[]{7, 7, 7, 8, 8, 8, 9, 9, 9, 9};


    public int getAllMoney() {
        return money;
    }

    public int getEmptySeatCount() {
        int empty = 0;
        for (boolean b : seat) {
            if (!b) empty++;
        }
        return empty;
    }

    public void buy(int seatNumber) {
        if (!seat[seatNumber]) {
            seat[seatNumber] = true;

            money += price[seatNumber] * WON; // 1,000 Magic Number 사용하지 않기  (상수)
        }
    }

    public void cancel(int seatNumber) {
        if(seat[seatNumber]){ // 예약상태
            seat[seatNumber]=false;
            money-= price[seatNumber] * WON;
        }
    }
}
