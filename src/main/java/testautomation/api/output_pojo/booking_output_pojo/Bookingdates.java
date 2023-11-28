package testautomation.api.output_pojo.booking_output_pojo;

import lombok.Data;
import testautomation.api.apibase.API_Base;

@Data
public class Bookingdates extends API_Base {
    private String checkin;
    private String checkout;

    public Bookingdates(String checkin, String checkout) {
        super();
        this.checkin = checkin;
        this.checkout = checkout;
    }
}
