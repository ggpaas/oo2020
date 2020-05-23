public enum JobType {
    KONTORI_KORISTUS("Kontori koristus"),
    HEKI_PÜGAMINE("Heki pügamine"),
    AKENDE_PESU("Akende pesu"),
    PÕRANDA_PESU("Põranda pesu");

    private final String jobTitle;

    JobType(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String toString(){
        return jobTitle;
    }
}