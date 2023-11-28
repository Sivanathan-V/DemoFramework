package testautomation.api.input_pojo.booking_input_pojo;

import lombok.Data;
import testautomation.api.apibase.API_Base;

@Data
public class AddUser_Input_Pojo extends API_Base {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private Bookingdates bookingdates;
    private String additionalneeds;

    public AddUser_Input_Pojo(String firstname, String lastname, int totalprice, boolean depositpaid,
                              Bookingdates bookingdates, String additionalneeds) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
    }


}
