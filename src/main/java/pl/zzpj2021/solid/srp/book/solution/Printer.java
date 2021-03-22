package pl.zzpj2021.solid.srp.book.solution;

import java.util.Map;

public class Printer implements Printable{

    @Override
    public String printCurrentPage(Book book) {
        return (book.getPages().get(book.getCurrentPage()));
    }

    @Override
    public String printAllPages(Book book) {
        StringBuilder allPages = new StringBuilder();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages.append(page.getKey()).append(" ").append(page.getValue());
        }
        return allPages.toString();
    }

}
