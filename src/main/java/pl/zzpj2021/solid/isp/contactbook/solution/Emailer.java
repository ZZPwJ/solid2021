package pl.zzpj2021.solid.isp.contactbook.solution;

public interface Emailer {
    void sendMessage(Contact emailable, String subject, String body);
    void sendEmail(String emailAddress, String subject, String body);
}
