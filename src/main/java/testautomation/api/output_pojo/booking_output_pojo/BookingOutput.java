package testautomation.api.output_pojo.booking_output_pojo;

import lombok.Data;
import testautomation.api.apibase.API_Base;

@Data
public class BookingOutput extends API_Base {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingdatesOutput bookingdates;
    private String additionalneeds;


}
