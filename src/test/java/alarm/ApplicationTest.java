package alarm;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ApplicationTest {

    @Test
    public void booking_Client는_전화번호를_입력받을수있다() throws Exception {
        //given
        Client client = new Client();

        //when
        boolean isBooking = client.booking("01012345678");

        //then
        assertThat(isBooking, is(true));
    }

}
