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

    public int getBookId() {
        return bookId;
    }

    public int getBookWeight() {
        return bookWeight;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookWeight(int bookWeight) {
        this.bookWeight = bookWeight;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
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
