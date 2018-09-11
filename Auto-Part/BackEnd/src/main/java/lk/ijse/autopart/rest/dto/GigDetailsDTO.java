package lk.ijse.autopart.rest.dto;

public class GigDetailsDTO {

        private int id;
        private String gTitel;
        private String gPic;
        private String gDiscription;
        private String gPrice;
        private String gContact;
        private String gEmail;


        private GigDTO gigDTO;


        public GigDetailsDTO() {
        }


        public GigDetailsDTO(int id) {
            this.setId(id);
        }


        public GigDetailsDTO(int id, String gTitel, String gPic, String gDiscription, String gPrice, String gContact, String gEmail, GigDTO gigDTO) {
            this.setId(id);
            this.setgTitel(gTitel);
            this.setgPic(gPic);
            this.setgDiscription(gDiscription);
            this.setgPrice(gPrice);
            this.setgContact(gContact);
            this.setgEmail(gEmail);
            this.setGigDTO(gigDTO);
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getgTitel() {
            return gTitel;
        }

        public void setgTitel(String gTitel) {
            this.gTitel = gTitel;
        }

        public String getgPic() {
            return gPic;
        }

        public void setgPic(String gPic) {
            this.gPic = gPic;
        }

        public String getgDiscription() {
            return gDiscription;
        }

        public void setgDiscription(String gDiscription) {
            this.gDiscription = gDiscription;
        }

        public String getgPrice() {
            return gPrice;
        }

        public void setgPrice(String gPrice) {
            this.gPrice = gPrice;
        }

        public String getgContact() {
            return gContact;
        }

        public void setgContact(String gContact) {
            this.gContact = gContact;
        }

        public String getgEmail() {
            return gEmail;
        }

        public void setgEmail(String gEmail) {
            this.gEmail = gEmail;
        }

        public GigDTO getGigDTO() {
            return gigDTO;
        }

        public void setGigDTO(GigDTO gigDTO) {
            this.gigDTO = gigDTO;
        }


        @Override
        public String toString() {
            return "GigDetailsDTO{" +
                    "id=" + id +
                    ", gTitel='" + gTitel + '\'' +
                    ", gPic='" + gPic + '\'' +
                    ", gDiscription='" + gDiscription + '\'' +
                    ", gPrice='" + gPrice + '\'' +
                    ", gContact='" + gContact + '\'' +
                    ", gEmail='" + gEmail + '\'' +
                    ", gigDTO=" + gigDTO +
                    '}';
        }
}
