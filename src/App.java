public class App {
    public static void main(String[] args) {
        Users william = new Users();

        System.out.println(
                william.signup("William Eiji", "william.fujimori@gmail.com", "UTFPR", "Desenvolvimento de Software"));

        System.out.println(william.login("william.fujimori@gmail.com"));

        Exercises newExercises = new Exercises();

        System.out.println(newExercises.addExercice("Soma!", "Quanto é 1 + 1?", "2", "Matemática"));

        VideoClasses newVideo = new VideoClasses();

        System.out
                .println(newVideo.addVideoClass("Como fazer soma...", "Matemática", "https://youtube.com/algum_video"));

    }
}
