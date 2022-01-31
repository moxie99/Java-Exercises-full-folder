package exercise1;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    private Movie(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    private void setTitle(String title){
        this.title = title;
    }

    private void setStudio(String studio){
        this.title = studio;
    }

    private void setRating(String rating){
        this.title = rating;
    }

    public String getTitle(){
        return title;
    }

    public String getStudio(){
        return studio;
    }

    public String getRating(){
        return  rating;
    }
}
