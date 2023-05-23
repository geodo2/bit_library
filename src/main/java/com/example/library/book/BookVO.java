package com.example.library.book;

import java.util.Date;

public class BookVO {
    private int bookId;
    private int bookWeight;
    private String title;
    private String author;
    private String publisher;
    private int quantity;
    private boolean isAvailable;
    private String borrowerId;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;

    // 생성자, Getter 및 Setter 메서드 생략

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookWeight=" + bookWeight +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                ", isAvailable=" + isAvailable +
                ", borrowerId='" + borrowerId + '\'' +
                ", borrowDate=" + borrowDate +
                ", dueDate=" + dueDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
