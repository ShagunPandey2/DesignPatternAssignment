/**
 * blogs
 */
import java.util.*;

interface Blogs {

    void typeofBlog(String details);
}

class FoodBlog implements Blogs{
    @Override
    public void typeofBlog(String details)
    {
        System.out.println("It's All About Food!!!!"+details);
    }
}

class EntertainmentBlog implements Blogs{
    @Override
    public void typeofBlog(String details)
    {
        System.out.println("It's All About Entertainment!!!"+details);
    }
}

class TravelBlog implements Blogs{
    @Override
    public void typeofBlog(String details)
    {
        System.out.println("It's All About Travel!!!!"+details);
    }
}

class ScienceBlog implements Blogs{
    @Override
    public void typeofBlog(String details)
    {
        System.out.println("It's All About Science!!!!"+details);
    }
}

class blogFactory{
    public static Blogs getBlogs(String type)
    {
        switch (type.toLowerCase()) {
            case "food":
                return new FoodBlog();
            case "entertainment":
                return new EntertainmentBlog();
            case "travel":
                return new TravelBlog();
            case "science":
                return new ScienceBlog();
            default:
            throw new IllegalArgumentException("Unknown blog type: " + type);        }
    }
    

}

public class FactoryMethod{

    public static void main(String[] bloginput) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select the blog from below dropdown");
        System.out.println("1.Food");
        System.out.println("2.Entertainment");
        System.out.println("3.Travel");
        System.out.println("4.Science");


        String type = scanner.nextLine();
        
        Blogs blogtype;
        try {
            blogtype = blogFactory.getBlogs(type);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            scanner.close();
            return;
        }
        System.out.println("Enter content for the blog post:");
        String details = scanner.nextLine();
        
        blogtype.typeofBlog(details);
        
        scanner.close();
    }



    
}
