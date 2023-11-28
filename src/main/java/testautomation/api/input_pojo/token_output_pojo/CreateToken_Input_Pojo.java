package testautomation.api.input_pojo.token_output_pojo;

import lombok.Data;
import testautomation.api.apibase.API_Base;

@Data
public class CreateToken_Input_Pojo extends API_Base {
    private String username;
    private String password;

    public CreateToken_Input_Pojo(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }


}
