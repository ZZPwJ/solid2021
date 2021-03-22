package pl.zzpj2021.solid.srp.book.solution;

import java.util.Map;

public class Book {

    private int currentPage;
    private Map<Integer, String> pages;
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public Book(Map<Integer, String> pages, String libraryRoomName,
                String rowLocator, int indexOnShelf) {
        this.currentPage = 0;
        this.pages = pages;
        this.libraryRoomName = libraryRoomName;
        this.rowLocator = rowLocator;
        this.indexOnShelf = indexOnShelf;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public void setPages(Map<Integer, String> pages) {
        this.pages = pages;
    }

    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public void setLibraryRoomName(String libraryRoomName) {
        this.libraryRoomName = libraryRoomName;
    }

    public String getRowLocator() {
        return rowLocator;
    }

    public void setRowLocator(String rowLocator) {
        this.rowLocator = rowLocator;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public void setIndexOnShelf(int indexOnShelf) {
        this.indexOnShelf = indexOnShelf;
    }

    public void turnPage() {
        currentPage ++;
    }

}
