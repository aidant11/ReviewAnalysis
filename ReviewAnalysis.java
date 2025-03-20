import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReviewAnalysis {

    private Review[] allReviews;

    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    ArrayList<String> comments = new ArrayList<String>();

    public double getAverageRating() {
        double sum = 0;
        for (Review r : allReviews)
            sum += r.getRating();
        return sum / allReviews.length;
    }

    public ArrayList<String> collectComments() 
    {
        for (int i=0; i<allReviews.length; i++)
        {
            String s=i + "-" + allReviews[i].getComment();
            String last = s.substring(s.length()-1);
            if (!last.equals(".") && !last.equals("!")) s+=".";
            if (s.indexOf("!")>0) comments.add(s);
        }
        return comments;
        
    }
}
