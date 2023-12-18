package Pages;

public class BlokTekstu {
    public static void main(String[] args) {
        String query = "SELECT * FROM \"wp_posts\"\n" +
                "WHERE \"post_status\" = 'publish'\n" +
                "AND \"post_type\" ='post'\n" +
                "GROUP BY \"post_author\"\n" +
                "ORDER BY \"post_date\" DESC";
        System.out.println(query);





    }
}
