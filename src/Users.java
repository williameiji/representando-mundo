public class Users {
    String name;
    private String email;
    private String password;
    String college;
    String course;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getEmail() {
        return this.email;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return this.password;
    }

    void setCollege(String college) {
        this.college = college;
    }

    String getCollege() {
        return this.college;
    }

    void setCourse(String course) {
        this.course = course;
    }

    String getCourse() {
        return this.course;
    }

    String login(String email) {
        if (email == this.email) {
            System.out.println("Achei no db!!!");
            return "Login efetuado!";
        }
        return "Algo errado!";
    }

    String signup(String name, String email, String college, String course) {
        this.setName(name);
        this.setEmail(email);
        this.setCollege(college);
        this.setCourse(course);
        return "Cadastro efetuado!";
    }
}
