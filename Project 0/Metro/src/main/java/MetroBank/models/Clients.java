package MetroBank.models;

public class Clients {

        private int id;
        private String firstName;
        private String lastName;
        private String userPassword;

        public Clients() {
        }

        public Clients(int id, String firstName, String lastName, String userPassword) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.userPassword = userPassword;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }



        @Override
        public String toString() {
            return "Clients{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", userPassword='" + userPassword + '\'' +
                    '}';
        }
    }


