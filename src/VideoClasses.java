public class VideoClasses {

    private String title;
    private String subject;
    private String link;

    void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    String getSubject() {
        return this.subject;
    }

    void setLink(String link) {
        this.link = link;
    }

    String getLink() {
        return this.link;
    }

    String addVideoClass(String title, String subject, String link) {
        this.setTitle(title);
        this.setSubject(subject);
        this.setLink(link);

        return "Nova vídeo aula cadastrada!";
    }
}
