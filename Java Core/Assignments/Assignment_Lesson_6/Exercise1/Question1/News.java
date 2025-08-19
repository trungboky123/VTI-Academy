package Assignments.Assignment_Lesson_6.Exercise1.Question1;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int [] rates = new int[3];

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getPublishDate(){
        return this.publishDate;
    }

    public void setPublishDate(String publishDate){
        this.publishDate = publishDate;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public float getAverageRate(){
        return this.averageRate;
    }

    public int [] getRate(){
        return this.rates;
    }

    public void setRate(int [] rates){
        this.rates = rates;
    }

    @Override
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + averageRate);
        System.out.println("----------------------------");
    }

    @Override
    public float calculate(){
        int sum = 0;
        for(int rate : rates){
            sum += rate;
        }
        averageRate = (float) sum / rates.length;
        return averageRate;
    }
}
