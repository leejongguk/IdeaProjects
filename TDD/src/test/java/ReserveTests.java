import movie.Seat;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReserveTests {


    @Test
    public void test(){
        //TDD : Test Driven Development
        Seat seat = new Seat();
        assertNotNull(seat);
        assertEquals(0,seat.getAllMoney());
        assertEquals(10,seat.getEmptySeatCount());
        seat.buy(5); // 비어있는 5번 좌석 구매 요청
        assertEquals(9,seat.getEmptySeatCount()); // 남은 좌석 9개
        assertEquals(8000,seat.getAllMoney()); // 총예약금액 8,000원
        seat.buy(9);
        assertEquals(8,seat.getEmptySeatCount()); // 남은 좌석 8개
        assertEquals(17000,seat.getAllMoney()); // 총예약금액 17,000원
        seat.buy(9); // 이미 예약된 좌석
        assertEquals(8,seat.getEmptySeatCount()); //남은 좌석 8개
        assertEquals(17000,seat.getAllMoney()); // 들어온 총금액 17,000원
        seat.cancel(5);
        assertEquals(9, seat.getEmptySeatCount()); //남은 좌석 9개
        assertEquals(9000, seat.getAllMoney()); // 들어온 총금액 9,000원
    }


}
