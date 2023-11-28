package testautomation.api.output_pojo.booking_output_pojo;

import lombok.Data;
import testautomation.api.apibase.API_Base;

@Data
public class BookingdatesOutput extends API_Base {
    private String checkin;
    private String checkout;
}
