/**
 * Created by student on 11.03.2015.
 */
public class Author {
        private String name, email;
        private char gender;

        public Author(String name, String email,char gender) {
            this.name=name;
            this.email=email;
            this.gender=gender;

        }

        public Author(String name, String email) {
            this.name = name;
            this.email = email;
            gender='U';
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String toString() {
            return
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }


}

