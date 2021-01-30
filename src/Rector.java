public final  class Rector {

        private static Rector rectorInstance;
        public int id;
        public String fullNameOfRector;
        public String dateOfBirth;
        public String email;

        private Rector(int id,String fullNameOfRector,String dateOfBirth,String email) {
            this.id = id;
            this.fullNameOfRector = fullNameOfRector;
            this.dateOfBirth = dateOfBirth;
            this.email = email;
        }

        public static Rector getInstance(int id,String fullNameOfRector,String dateOfBirth,String email) {
            if (rectorInstance == null) {
                rectorInstance = new Rector(id,fullNameOfRector,dateOfBirth,email);
            }
            return rectorInstance;
        }

    @Override
    public String toString() {
        return "Rector{" +
                "id=" + id +
                ", fullNameOfRector='" + fullNameOfRector + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
