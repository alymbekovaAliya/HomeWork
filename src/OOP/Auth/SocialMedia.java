package OOP.Auth;

import java.util.LinkedHashMap;
import java.util.Map;

public class SocialMedia {
    public String name;
    public Map<String, String> posts = new LinkedHashMap<>();
    Map<String, String> asd = new LinkedHashMap<>();

    public SocialMedia(String name) {
        this.name = name;
    }

    public void createPosts(String type, String description) {
        posts.put(description, type);
        reversedMap(posts);
    }

    public Map<String, String> reversedMap(Map<String, String> asdf) {
        int i = 1;
        for(String post: asdf.keySet()) {
            asd.put(i + ": " + asdf.get(post), post);
            i++;
        }
        return asd;
    }

    public  void getPosts(Map<String, String> asd) {
        for (String a: asd.keySet()) {
            System.out.print(a + "-");
            System.out.println(asd.get(a));
        }
    }


}
