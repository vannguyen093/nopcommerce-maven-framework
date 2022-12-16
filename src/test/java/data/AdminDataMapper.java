package data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import commons.GlobalConstants;

import java.io.File;

public class AdminDataMapper {

//    @JsonProperty("user")
//    Customer customer;
    @JsonProperty("editUser")
    EditCustomer editCustomer;

    public static AdminDataMapper getAdminData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(new File(GlobalConstants.PROJECT_PATH + "/src/test/resources/AdminData.json"), AdminDataMapper.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    static class EditCustomer {
        @JsonProperty("editFirstName")
        private String editFirstName;
        @JsonProperty("editLastName")
        private String editLastName;
        @JsonProperty("editGender")
        private String editGender;
        @JsonProperty("editEmail")
        private String editEmail;
        @JsonProperty("editPassword")
        private String editPassword;
        @JsonProperty("editDate")
        private String editDate;
        @JsonProperty("editMonth")
        private String editMonth;
        @JsonProperty("editYear")
        private String editYear;
    }

}
